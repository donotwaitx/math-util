package org.lehoangtrong.mathutil.main;

import static org.lehoangtrong.mathutil.core.MathUtility.*;

public class Main {
    public static void main(String[] args) {
        testFactorialGivenWrongArgumentNegative5ThrowsException();    
    }

    // Test case 4:
    // Description: Test factorial with invalid argument (n = -5)
    // Steps:
    //         Call function/method with n = -5 getFactorial(-5)
    // Expected result:
    //         Get IllegalArgumentException (An exception is thrown) - Kì vọng ném ra ngoại lệ
    //         To have IllegalArgumentException, we need to call getFactorial(-5)
    // Status (passed/failed-bug): (Waiting for test run)
    // Actual result/Status (Pass/Fail): (Waiting for test run)
    // Expected: IllegalArgumentException | Actual: IllegalArgumentException -> Passed
    public static void testFactorialGivenWrongArgumentNegative5ThrowsException() {
        int n = -5; // given input
        long actualResult = getFactorial(n); // named-argument

        // chạy hàm, gọi hàm, thấy ngoại lệ, mừng vì hàm chạy đúng
    }

    // Về lý thuyết phải test với data n = 2, 3, 4, 5, 6, 20 --> exhaustive testing
    // Test case 3:
    // Description: Check getFactorial() function with valid argument (n = 5)
    // Steps:
    //         Call function/method with n = 5 getFactorial(5)
    // Expected result:
    //         Get 120 as the result of 5!
    //         To have 120 as the result of 5!, we need to call getFactorial(5)
    // Status (passed/failed-bug): (Waiting for test run)
    // Actual result/Status (Pass/Fail): (Waiting for test run)
    // Expected: 120 | Actual: 120 -> Passed
    public static void testFactorialGivenRightArgument5RunsWell() {
        int n = 5; // given input
        long expectedResult = 120;
        long actualResult = getFactorial(n); // named-argument
        System.out.println("Expected: " + expectedResult + " | Actual: " + actualResult);
    }


    // Test case 2:
    // Description: Check getFactorial() function with valid argument (n = 1)
    // Steps:
    //         Call function/method with n = 1 getFactorial(1)
    // Expected result:
    //         Get 1 as the result of 1!
    //         To have 1 as the result of 1!, we need to call getFactorial(1)
    // Status (passed/failed-bug): (Waiting for test run)
    // Actual result/Status (Pass/Fail): (Waiting for test run)
    // Expected: 1 | Actual: 1 -> Passed
    // Chờ test case chạy, chạy hàm, so sánh kết quả thực tế với kỳ vọng | -> Test Run
    public static void testFactorialGivenRightArgument1RunsWell() {
        int n = 1; // given input
        long expectedResult = 1;
        long actualResult = getFactorial(n); // named-argument
        System.out.println("Expected: " + expectedResult + " | Actual: " + actualResult);
        // So sánh 2 giá trị bằng mắt
    }

    // Test case #1:
    // Description: Check getFactorial() function with valid argument (n = 0)
    // Steps:
    //         Call function/method with n = 0 getFactorial(0)
    // Expected result:
    //         Get 1 as the result of 0!
    // Actual result/Status (Pass/Fail): (Waiting for test run)
    public static void testFactorialGivenRightArgument0RunsWell() {
        long expectedResult = 1;
        long actualResult = getFactorial(0); // named-argument
        System.out.println("Expected: " + expectedResult + " | Actual: " + actualResult);
    }
}