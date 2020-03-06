package com.zjledu.test20200211.frame.ServletFilterListener;

        import javax.servlet.*;
        import javax.servlet.annotation.WebFilter;
        import javax.servlet.http.HttpServletRequest;
        import java.io.IOException;

/**
 * author: King Long
 * date: 2020/2/20 7:54
 */
//@WebFilter({"/thymeleaf/*","/myServlet"})
public class MyFilter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println(this+"====init====");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println(((HttpServletRequest)servletRequest).getRequestURL());
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        System.out.println(this+"====destroy====");
    }
}
