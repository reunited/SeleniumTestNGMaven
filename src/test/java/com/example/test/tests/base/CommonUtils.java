package com.example.test.tests.base;

public class CommonUtils {
	public static String getRandomArrayElement(String[] array) {
		final int length = array.length;
	    final int rand = (int) (Math.random() * length);
	    return array[rand];
	}
}
