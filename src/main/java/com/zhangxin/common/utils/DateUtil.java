package com.zhangxin.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期工具类
 * @author: 28987
 * @date: 2020年4月23日 下午6:20:01
 */
public class DateUtil {

	public static Date random(Date min,Date max) {
		long t1 = min.getTime();
		long t2 = max.getTime();
		long t3 =(long) (Math.random()*(t2-t1)+t1);
		return new Date(t3);
	}
}
