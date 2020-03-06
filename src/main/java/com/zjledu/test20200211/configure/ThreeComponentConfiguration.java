package com.zjledu.test20200211.configure;

import com.zjledu.test20200211.frame.ServletFilterListener.MyFilter;
import com.zjledu.test20200211.frame.ServletFilterListener.MyServlet;
import com.zjledu.test20200211.frame.ServletFilterListener.Mylistener;
import org.apache.catalina.connector.Connector;
import org.apache.coyote.http11.Http11NioProtocol;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/**
 * author: King Long
 * date: 2020/2/20 8:21
 */
//@Configuration
public class ThreeComponentConfiguration {

    @Bean
    public ServletRegistrationBean servlet(){

        ServletRegistrationBean bean = new ServletRegistrationBean(new MyServlet(),"/myServlet");
        bean.setLoadOnStartup(1);
        return bean;

    }

    @Bean
    public FilterRegistrationBean filter(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new MyFilter());
        bean.setUrlPatterns(Arrays.asList("/thymeleaf/*","/myServlet"));
        return bean;
    }

    @Bean
    public ServletListenerRegistrationBean listener(){
        ServletListenerRegistrationBean bean = new ServletListenerRegistrationBean(new Mylistener());
        return bean;
    }

    @Bean
    public ConfigurableServletWebServerFactory tomcat(){
        TomcatServletWebServerFactory  tomcatFactory = new TomcatServletWebServerFactory ();
        tomcatFactory.setPort(8090);
        tomcatFactory.setContextPath("/tomcat");
        tomcatFactory.setUriEncoding(StandardCharsets.UTF_8); //用于解码URI的字符编码
        tomcatFactory.addConnectorCustomizers((Connector connector)->{
            Http11NioProtocol protocol=(Http11NioProtocol)connector.getProtocolHandler();
            protocol.setMaxConnections(2000); //最大连接数
            protocol.setMaxThreads(500);  //最大线程数
            protocol.setMinSpareThreads(30);//工作线程的最小数量
            //设置 30s 内没有请求则服务端自动断开 keepalive 连接
            protocol.setKeepAliveTimeout(30000);
            //当客户端发送超过 10000 个请求，则自动断开 keepalive 连接
            protocol.setMaxKeepAliveRequests(10000);
            protocol.setMaxHttpHeaderSize(8192);
        });
        return tomcatFactory;
    }


}

