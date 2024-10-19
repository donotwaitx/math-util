package org.lehoangtrong.mathutil.core.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.lehoangtrong.mathutil.core.MathUtility;

import static org.junit.jupiter.api.Assertions.assertThrows;

class MathUtilityDDTTest {

    // @Test là 1 phần annotation của framework, biến cái hàm của ta thành hàm main
    // Để có thể run, hàm bth chỉ có thể trong main() để chạy
    // @Test biến hàm bất kì thành hàm main()

    // Kĩ thuật DDT - DATA DRIVEN TESTING: Kĩ thuật này đặt ra làm việc với data
    // Là kĩ thuật tách bộ data test ra khỏi code, bỏ vào bên ngoài
    // Giúp developer không cần sửa code, chỉ cần thêm data, nhìn nhanh được xem bộ test case còn thiếu case nào không.
    // Kĩ thuật này còn goọi là tham số hóa bộ data kiểm thử
    //                                           Parameterized Testing
    public static Object[][] initTestData() {
        return new Object[][]{
                {0, 1},
                {1, 1},
                {2, 2},
                {3, 6},
                {4, 24},
                {5, 120},
                {6, 7200}
        };
    }

    public static Integer[] initTestDataForException() {
        return new Integer[]{-1, -2, -3, -5, -10, -20, 21, 22, 23, 24};

    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenRightArgumentsRunsWell(int n, long expected) {
        Assertions.assertEquals(expected, MathUtility.getFactorial(n));
    }

    @ParameterizedTest
    @MethodSource("initTestDataForException")
    void testFactorialGivenWrongArgumentsThrowsException(int n) {
        assertThrows(IllegalArgumentException.class, () -> {
            MathUtility.getFactorial(n);
        });
    }
}