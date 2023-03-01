package ch.hslu.sw01.ex06;

public class SymmetricNumbers {

    public static void main(String[] args) {
        System.out.println(isSymmetric(7, 2347432));
    }

    public static boolean isSymmetric(int length, int number) {
        int[] numbers = new int[length];
        int temp = number;
        boolean symmetric = false;
        for (int i = 0; i < length; i++) {
            numbers[i] = temp % 10;
            if (i+1 > length / 2) {
                symmetric = numbers[i] == numbers[length - i-1];
            }
            temp = (temp - temp % 10) / 10;
        }
        return symmetric;
    }
}
