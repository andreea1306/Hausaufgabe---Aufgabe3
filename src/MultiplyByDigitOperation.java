public class MultiplyByDigitOperation {

    public int[] multiplyByDigit(int[] a, int digit) {
        int n = a.length;
        int[] result = new int[n + 1];
        int carry = 0;

        for (int i = n - 1; i >= 0; i--) {
            int prod = a[i] * digit + carry;
            result[i + 1] = prod % 10;
            carry = prod / 10;
        }

        result[0] = carry;
        return result;
    }
}

