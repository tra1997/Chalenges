package com.example.challenges;



import java.util.ArrayList;
import java.util.List;



public class MyBigNumber {
    String sum(String stn1, String stn2) {
        List<Integer> intList1 = new ArrayList<>();

        List<Integer> intList2 = new ArrayList<>();

        // Chuyển đổi chuỗi thành danh sách số nguyên (đảo ngược)
        for (int i = stn1.length() - 1; i >= 0; i--) {
            intList1.add(stn1.charAt(i) - '0'); // Chuyển đổi ký tự sang số
        }

        for (int i = stn2.length() - 1; i >= 0; i--) {
            intList2.add(stn2.charAt(i) - '0'); // Chuyển đổi ký tự sang số
        }

        List<Integer> result = new ArrayList<>();
        int temp = 0; // Biến lưu trữ số nhớ
        int maxLength = intList1.size() > intList2.size() ? intList1.size() : intList2.size();

        // Tính toán tổng
        for (int i = 0; i < maxLength; i++) {
            int digit1 = (i < intList1.size()) ? intList1.get(i) : 0; // Lấy số từ danh sách 1 hoặc 0 nếu không có

            int digit2 = (i < intList2.size()) ? intList2.get(i) : 0; // Lấy số từ danh sách 2 hoặc 0 nếu không có

            int sum = digit1 + digit2 + temp; // Tổng các chữ số và số nhớ
            String message = "Cộng: " + digit1 + " + " + digit2;

            if (temp > 0) {
                message += " + " + temp; // Thêm số nhớ nếu có
            }

            if (sum < 10) {
                result.add(sum); // Thêm phần dư vào kết quả
                temp = 0; // Không có số nhớ
                System.out.println(message + " = " + sum);
            } else {
                result.add(sum - 10); // Thêm phần dư (số cuối) vào kết quả
                temp = 1; // Lưu lại số nhớ
                System.out.println(message + " = " + sum + " Lưu 1");
            }
        }

        // Nếu còn số nhớ sau khi hoàn thành phép cộng
        if (temp > 0) {
            System.out.println("Cộng số nhớ cuối cùng: " + temp);
            result.add(temp);
        }

        // Đảo ngược kết quả để có thứ tự đúng
        List<Integer> finalResult = new ArrayList<>();
        for (int i = result.size() - 1; i >= 0; i--) {
            finalResult.add(result.get(i)); // Đảo ngược kết quả
        }

        // Chuyển đổi danh sách kết quả thành chuỗi
        String resultString ="";
        for (int i =0; i < finalResult.size(); i++) {
            resultString = resultString + finalResult.get(i) ;
        }

        return resultString;
    }

}