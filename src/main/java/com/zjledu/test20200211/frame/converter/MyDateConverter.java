package com.zjledu.test20200211.frame.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author: King Long
 * date: 2020/2/16 11:53
 */
@Component
public class MyDateConverter implements Converter<String, Date> {

    private static final SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date convert(String s) {

        if(s==null){
            return null;
        }
        try {
            if(s.contains(":")){
                return sdf1.parse(s);
            }else{
                return sdf2.parse(s);
            }
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
