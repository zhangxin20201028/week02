package com.zhangxin.common.utils;

import static org.junit.Assert.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 1000; i++) {
			Person person=new Person();
			person.setName(StringUtil.generateChineseName());
			person.setAge(RandomUtil.random(1, 120));
			person.setAbout(StringUtil.randomChineseString(140));
			Calendar calendar = Calendar.getInstance();
			calendar.set(2020,12,23);
			person.setCreated(DateUtil.random(calendar.getTime(), new Date()));
			System.out.println(i+1+""+person);
		}
	}

}
