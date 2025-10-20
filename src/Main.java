public class Main {
    public static void main(String[] args) {

        AddOperation adder = new AddOperation();
        SubtractOperation subtractor = new SubtractOperation();

        int[] num1 = {1, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num2 = {8, 7, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Adunare: ");
        PrintHelper.printArray(adder.add(num1, num2));

        int[] num3 = {8, 3, 0, 0, 0, 0, 0, 0, 0};
        int[] num4 = {5, 4, 0, 0, 0, 0, 0, 0, 0};
        System.out.print("Scadere: ");
        PrintHelper.printArray(subtractor.subtract(num3, num4));

    }
}
