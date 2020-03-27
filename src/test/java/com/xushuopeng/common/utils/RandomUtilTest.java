package com.xushuopeng.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {
  RandomUtil r=new RandomUtil();
	

	@Test
	public void testSubRandom() throws IllegalAccessException {
		 int[] subRandom = r.subRandom(1, 10, 5);
		 for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
	
		System.out.println(RandomUtil.randomCharacter());
	}
	

	

}
