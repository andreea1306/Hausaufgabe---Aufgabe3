public class Main {
    public static void main(String[] args) {

        AddOperation adder = new AddOperation();
        SubtractOperation subtractor = new SubtractOperation();
        MultiplyByDigitOperation multiplier = new MultiplyByDigitOperation();
        DivideByDigitOperation divider = new DivideByDigitOperation();

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Adunare: ");
        PrintHelper.printArray(adder.add(num1, num2));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Scadere: ");
        PrintHelper.printArray(subtractor.subtract(num3, num4));

        int[] num5 = {2, 3, 6, 0, 0, 0, 0, 0, 0};
        System.out.print("Inmultire cu 2: ");
        PrintHelper.printArray(multiplier.multiplyByDigit(num5, 2));

        System.out.print("Impartire la 2: ");
        PrintHelper.printArray(divider.divideByDigit(num5, 2));
    }
}
