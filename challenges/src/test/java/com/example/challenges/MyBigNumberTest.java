package com.example.challenges;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigNumberTest {
    @Test
    public void testSum() {
        MyBigNumber myBigNumber = new MyBigNumber();

        // Kiểm tra tổng các số cơ bản
        assertEquals("579", myBigNumber.sum("123", "456"));
        assertEquals("1000", myBigNumber.sum("999", "1"));
        assertEquals("110", myBigNumber.sum("55", "55"));

        // Kiểm tra với chuỗi rong dai dien cho gia tri 0
        assertEquals("123", myBigNumber.sum("", "123"));
        assertEquals("123", myBigNumber.sum("123", ""));
        assertEquals("", myBigNumber.sum("", ""));

        // Kiểm tra với các số có nhiều chữ số
        assertEquals("1000000000000", myBigNumber.sum("999999999999", "1"));
        assertEquals("20000000000", myBigNumber.sum("10000000000", "10000000000"));
    }
}
