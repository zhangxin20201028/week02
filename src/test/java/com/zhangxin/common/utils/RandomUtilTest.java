package com.zhangxin.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i < 10; i++) {
			System.out.println(RandomUtil.random(1, 30));
		}
	}

	@Test
	public void testSubRandom() {
		int[] is = RandomUtil.subRandom(1, 20,5);
		for (int i : is) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char charr = RandomUtil.randomCharacter();
		System.out.println(charr);
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(5);
		System.out.println(str);
	}

}
