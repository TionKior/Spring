package com.tionkior.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName : DateConverter
 * @Author : TionKior
 * @Date : 2021/6/12 9:53
 * @Version : V1.0
 * @Description : 自定义转换器
 */

public class DateConverter implements Converter<String, Date> {
    @Override
    public Date convert(String dateStr) {
        //将日期字符串转换成日期对象 返回
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            date = format.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return date;
    }
}
