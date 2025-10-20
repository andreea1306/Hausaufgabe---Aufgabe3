public class SubtractOperation {

    public int[] subtract(int[] a, int[] b) {
        int n = a.length;
        int[] result = new int[n];
        int borrow = 0;

        for (int i = n - 1; i >= 0; i--) {
            int diff = a[i] - b[i] - borrow;
            if (diff < 0) {
                diff += 10;
                borrow = 1;
            } else {
                borrow = 0;
            }
            result[i] = diff;
        }

        return result;
    }
}

