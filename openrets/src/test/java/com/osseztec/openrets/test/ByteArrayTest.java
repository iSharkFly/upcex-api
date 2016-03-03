/*
 * Copyright (C) 2016 OssezTec, Inc Authors
 */
package com.osseztec.openrets.test;

import org.junit.Test;

import com.ossez.openrets.util.ByteArray;

import junit.framework.TestCase;

/**
 * Byte Array Test
 * @author YuCheng Hu
 *
 */
public class ByteArrayTest extends TestCase {

	/**
	 * 
	 */
	@Test
	public void testSingleValuePush() {
		ByteArray ba = new ByteArray(1);
		assertEquals(0, ba.getSize());
		assertEquals(1, ba.getRealSize());
		assertEquals("", ba.toString());

		ba.add(97);
		assertEquals(1, ba.getSize());
		assertEquals(1, ba.getRealSize());
		assertEquals("a", ba.toString());

		ba.add(98);
		assertEquals(2, ba.getSize());
		assertEquals(2, ba.getRealSize());
		assertEquals("ab", ba.toString());

		ba.add(99);
		assertEquals(3, ba.getSize());
		assertEquals(4, ba.getRealSize());
		assertEquals("abc", ba.toString());

		byte[] b = ba.getBytes();
		assertEquals(3, b.length);
		assertEquals(97, b[0]);
		assertEquals(98, b[1]);
		assertEquals(99, b[2]);
	}

	/**
	 * 
	 */
	@Test
	public void testArrayValuePush() {
		ByteArray ba = new ByteArray(1);
		byte[] b = { 97, 98, 99, 100 };
		assertEquals(0, ba.getSize());
		assertEquals(1, ba.getRealSize());
		assertEquals("", ba.toString());

		ba.add(b);
		assertEquals(4, ba.getSize());
		assertEquals(4, ba.getRealSize());
		assertEquals("abcd", ba.toString());

		ba.add(b);
		assertEquals(8, ba.getSize());
		assertEquals(8, ba.getRealSize());
		assertEquals("abcdabcd", ba.toString());

		ba.add(b);
		assertEquals(12, ba.getSize());
		assertEquals(16, ba.getRealSize());
		assertEquals("abcdabcdabcd", ba.toString());
	}
}
