package com.zhangxin.common.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateUtilTest {

	@Test
	public void test() {
		Calendar c = Calendar.getInstance();
		c.set(2020,10,23);
		Date date = DateUtil.random(c.getTime(), new Date());
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		String date1 = format.format(date);
		System.out.println(date1);
	}

}
