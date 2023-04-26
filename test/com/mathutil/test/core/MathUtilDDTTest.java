/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mathutil.test.core;

import com.sondv.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author ADMIN
 */


// Câu lệnh này báo hiệu cần loop qua tập data để lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    //Trả về mảng 2 chiều nhiều cặp Expected - Input
    
    @Parameterized.Parameters //JUnit sẽ chạy qua từng dòng của mảng để lấy ra data
    // Tên hàm kh quan trọng quan trọng là @
    public static Object[][] initData(){
        
        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
        };
    }
    
    // Ta cần gán value của từng cột vào biến tương ứng input, expected để lát truyền vào hàm
    
    @Parameterized.Parameter(value = 0) //Map với mảng data
    public int n; // Biến map với value của n
    
    @Parameterized.Parameter(value = 1)
    public long expected; // Kiểu long giá trị của hàm getFactorial();
    
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        Assert.assertEquals(expected, MathUtil.getFactorial(n)); 
    }
    
}
