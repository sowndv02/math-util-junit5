/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.sondv.mathutil.main;

import com.sondv.mathutil.core.MathUtil;


/**
 *
 * @author ADMIN
 */
public class Main {
    public static void main(String[] args) {
        /*
        Thử nghiệm hàm tính giai thừa xem chạy đúng kết quả không
        Ta phải đưa các hàm ứng dụng vào thực tế
        VD: -5 tính được không
        0 tính bằng mấy
        20 tính bằng mấy
        21 tính bằng mấy
        => Test Case: một tình huống hàm/app/màn hình/tính năng được đưa vào sử dụng
        Giả lập hành vi sử dụng của ai đó
        Test Case: Là 1 tình huống sử dụng, xài app (hàm) mà nó bao gồm 
        INPUT: data đầu vào(input)
        OUTPUT: Đầu ra xử lý của hàm/chức năng của app, đầu vào để xử lý
        Excepted: Mong hàm trả về Value nầo đó ứng với Input ở trên
        So sánh xem kq có như kỳ vọng hay không
        */
        
        long expected = 120; // Kỳ vọng
        int n = 5; // Input
        long actual = MathUtil.getFactorial(5);
        System.out.println("5! = " + expected + " (Expected)");
        System.out.println("5! = " + actual + " (Actual)");
        
    }
}
