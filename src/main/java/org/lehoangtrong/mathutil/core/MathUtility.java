package org.lehoangtrong.mathutil.core;

// ta tạo bộ thư viện cung cấp các tiện ích liên quan toán học
// vì là thư viện dùng chung cho mọi nơi nên phải là static
public class MathUtility {
    // hàm tính n! = 1.2.3...n
    // không tính giai thừa âm
    // 0! = 1! = 1
    // n! tăng rất nhanh, 20! vừa khớp kiểu long, 18 con số 0
    // bài này ta sẽ chặn n từ 0...20, không chơi với 21!
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid argument. n must be between 0 and 20");
        if (n == 0 || n == 1)
            return 1;

        // sống tới chỗ này thì n phải thuộc từ 1..20
        long result = 1;
        for (int i = 2; i <= n; i++) result *= i;

        return result;
    }
}
