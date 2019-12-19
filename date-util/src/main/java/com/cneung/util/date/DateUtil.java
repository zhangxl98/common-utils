package com.cneung.util.date;

import java.util.Calendar;
import java.util.Date;

/**
 * 项目名称:       common-utils
 * 模块名称:
 * 说明:          时间工具类
 * JDK 版本:      1.8
 * 作者(@author): zhangxl
 * 创建日期:       2019/12/19 17:52
 */
public class DateUtil {

    /**
     * 获取当前月的第一天
     *
     * @return  Date
     */
    public static Date getMonthFirstDay() {
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        return cale.getTime();
    }

    /**
     * 获取指定月的第一天
     *
     * @param date  指定日期
     * @return  Date
     */
    public static Date getMonthFirstDay(Date date) {
        Calendar cale = Calendar.getInstance();
        cale.setTime(date);
        cale.add(Calendar.MONTH, 0);
        cale.set(Calendar.DAY_OF_MONTH, 1);
        return cale.getTime();
    }

    /**
     * 获取当前月的最后一天
     *
     * @return  Date
     */
    public static Date getMonthLastDay() {
        Calendar cale = Calendar.getInstance();
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        return cale.getTime();
    }

    /**
     * 获取指定月的最后一天
     *
     * @param date  指定日期
     * @return  Date
     */
    public static Date getMonthLastDay(Date date) {
        Calendar cale = Calendar.getInstance();
        cale.setTime(date);
        cale.add(Calendar.MONTH, 1);
        cale.set(Calendar.DAY_OF_MONTH, 0);
        return cale.getTime();
    }
}
