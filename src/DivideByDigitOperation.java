public class DivideByDigitOperation {

    public int[] divideByDigit(int[] a, int digit) {
        int n = a.length;
        int[] result = new int[n];
        int remainder = 0;

        for (int i = 0; i < n; i++) {
            int current = remainder * 10 + a[i];
            result[i] = current / digit;
            remainder = current % digit;
        }

        return result;
    }
}
