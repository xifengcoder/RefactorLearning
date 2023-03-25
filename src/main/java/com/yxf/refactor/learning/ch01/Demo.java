package com.yxf.refactor.learning.ch01;


public class Demo {
    public static void main(String[] args) {
        byte[] bytes = new byte[]{0x01, 0x02, (byte) 0xF3, (byte) 0xFF, (byte) 0x00, (byte) 0xFF};

        byte[] result = ByteUtils.intToBytes(255, false);
        System.out.println(ByteUtils.byte2HexStr(result));

        result = ByteUtils.intToBytes(255, true);
        System.out.println(ByteUtils.byte2HexStr(result));

        System.out.println(bytes.length);
        System.out.println("BE TEST:");

        int a = ByteUtils.bytesToIntBE(bytes, 0, 3);
        System.out.println("test1: " + a + ", " + Integer.toHexString(a));
        System.out.println("LE TEST");

        int b = ByteUtils.bytesToIntLE(bytes, 0, 3);
        System.out.println("test1: " + b + ", " + Integer.toHexString(b));

        System.out.println("----------------------------------");

        int c = ByteUtils.bytesToIntBE(bytes, 2, 4);
        System.out.println("test1: " + c + ", " + Integer.toHexString(c));
        System.out.println("LE TEST");

        int d = ByteUtils.bytesToIntLE(bytes, 2, 4);
        System.out.println("test1: " + d + ", " + Integer.toHexString(d));
    }
}
