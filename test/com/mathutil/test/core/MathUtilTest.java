/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mathutil.test.core;

import com.sondv.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author ADMIN
 */
public class MathUtilTest {
    
    /*
    Đây là class sẽ sử dụng để kiểm thử các hàm của thư viện/framework JUnit
    để kiểm thử/kiểm tra code chính - hàm tính giai thừa getFactorial()
    
    Có quy tắc đặt tên hàm kiểm thử 
    Nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử 
    Tình huống xài hàm theo kiểu thành công và thất bại
    Hàm dưới là tình huống test hàm chạy thành công trả về
    
    @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    @Test phía sau chính là public static void main()
    Có nhiều @Test ứng với nhiều case khác nhau để tính giai thừa
    */
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell(){
        int n = 0; // Test thử 0!
        long expeted = 1;
        long actual = MathUtil.getFactorial(n);
        //So sánh actual với expected dùng framework
        Assert.assertEquals(expeted, actual); // Hàm giúp so sánh 2 giá trị nào đó giống nhau không
        // Nếu giống nhau -> Màu xanh đèn đường => Code ổn
        // Nếu không giống nhau -> màu đỏ => Expected vs Actual không giống nhau
     
        //Gộp thêm vài case thành công
        Assert.assertEquals(1, MathUtil.getFactorial(1));
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        Assert.assertEquals(24, MathUtil.getFactorial(4));
    }
    
    
    // Hàm getFactorial() thiết kế có 2 TH 
    // 1. Đưa data từ 0->20: đã xử lý
    // 2. Đưa out of range -> ném ra ngoại lệ 
    // Nếu hàm nhận vào n < 0 và n > 20 và hàm ném ra ngoại lệ  => Hàm chạy thiết kế đúng => màu xanh
    // Nếu nhận n < 0 và n > 20 và không ném ra ngoại lệ => Hàm chạy sai thiết kế, sai kỳ vọng
    
    
    // Test Case: Input: -5 
    // Expected: IllegalArgumentException
    // Tình huống ngoại lệ ngoài dự tính, dự liệu là những thứ kh thể đo lường 
    // => AssertEquals kh dùng so sánh 2 ngoại lệ 
    
    // Đôi khi chỉ đúng 50% do có ném ra ngoại lệ nhưng sai type
    
    
//    @Test(expected = NumberFormatException.class)
    
    //Nếu không bắt Exception thì sẽ màu đỏ do có Exception không bắt
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongArgumentThrowsException(){
        MathUtil.getFactorial(-5); 
        // Hàm @Test chạy, hàm getFactorial() chạy sẽ ném về ngoại lệ 
    }
    
    
    //Cách viết khác để bắt ngoại lệ => Lambda Expression
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_LambdaExpression(){
        /*
        Tham số 1: Ngoại lệ muốn so sánh
        Tham số 2: Đoạn code chạy văng ra ngoại lệ runnable 
        */
        Assert.assertThrows(IllegalArgumentException.class, 
                () -> MathUtil.getFactorial(-5)
                );
        // Hàm @Test chạy, hàm getFactorial() chạy sẽ ném về ngoại lệ 
    }
    
    
    // Bắt ngoại lệ xem hàm có ném về ngoại lệ hay không khi n out range 
    // Có ném tức là đúng
    @Test
    public void testGetFactorialGivenWrongArgumentThrowsException_TryCatch(){
        
        // Chủ động kiểm soát ngoại lệ => Nhưng chưa ổn
        
        try {
            MathUtil.getFactorial(-5);
        } catch (Exception e) {
            /*
            Bắt try-catch là JUnit sẽ ra xanh do đã chủ động kiểm soát ngoại lệ
            nhưng không chắc ngoại lệ mình cần xuất hiện không
            có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentException xuất hiện
            */
            
            Assert.assertEquals("Invalid argument. N must be between 0...20", e.getMessage());
        }
        
        
    }
    
}
