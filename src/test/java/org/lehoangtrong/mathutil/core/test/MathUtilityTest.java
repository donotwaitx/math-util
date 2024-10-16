package org.lehoangtrong.mathutil.core.test;

import org.junit.jupiter.api.Test;
import org.lehoangtrong.mathutil.core.MathUtility;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilityTest {

    // Cấu trúc của 1 test case: ID, Desc, Steps,
    //                              Expected, Actual,
    //                              Status: (Pass/Fail), Time,
    //                              Bug ID Bugzilla, Jira, Mantis,...
    // Test case #1: Check getFactorial() function with valid argument (n = 0) -> Expected: 1
    @Test
    void testFactorialGivenRightArgument0RunsWell() {
        long expected = 1; // 1 is expected value
        long actual = MathUtility.getFactorial(0);
        // so sánh
        // truyền thống: so sánh bằng mắt
        // hiện đại: so sánh bằng máy, mắt không cần nhìn, nhờ máy nhìn giùm, xài thêm tool, thư viện
        // mình so sánh bằng mắt, mình nhìn kết quả chạy được hay không
        // não và mắt không cần nhìn, đoán mà kết luận như truyền thống
        // Nay thấy đỏ => hàm sai, xanh => hàm đúng
        assertEquals(expected, actual);
        // Giống nhau màu xanh, lệch nhau đỏ
    }

    // Test case #2: Check getFactorial() function with valid argument (n = 5) -> Expected: 120
    @Test
    void testFactorialGivenRightArgument5RunsWell() {
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
    }

    // Test case #3: Check getFactorial() with n = -5 ... to see the Exception
    // Tôi muốn thấy ngoại lệ xuất hiện trong tình huống n âm hoặc n > 20
    // Ngoại lệ có xuất hiện như dự kiến hay không.. nếu có phải là màu xanh!!!
    // Nghe kĩ có ngoại lệ, => xanh
    @Test
    void testFactorialGivenWrongArgumentThrowsException() {
        // MathUtility.getFactorial(-5);
//        assertThrows(SQLException.class, () -> {
//            MathUtility.getFactorial(21);
//        });

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(-5);
        });

        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(22);
        });
    }
}

// Quy tắt xanh đỏ của UNIT TEST TOOL/FRAMEWORK
// Nếu tất cả xanh, tức là hàm chạy đúng cho tất cả các case
// Nếu chỉ có ít nhất 1 thằng đỏ, coi như cả đám đỏ
// Lý do: hàm đã đúng thì phải đúng hết cho mọi tình huống gọi hàm (test case)
// Mắt chỉ nhìn 2 tín hiệu: đỏ và xanh | Theo style gộp các kết quả
// Xanh: hàm đúng cho tất cả các case
// Đỏ: chỉ cần 1 thằng đỏ, coi như cả đám đỏ

// Kỹ thuật viết code chính (hàm trong api, code,...)
// mà đi kèm code test hàm luôn, dùng 2 trạng thái xanh đỏ cứ liên tục code 1 tí
// và test liên tục, đảm bảo code chạy đúng mọi tình huống.
// Chỉnh sửa code, chỉnh sửa test, chạy test, chạy code, chạy test, chạy code, chạy test
// Được gọi là TDD - Test Driven Development - viết code song hành cùng viết test