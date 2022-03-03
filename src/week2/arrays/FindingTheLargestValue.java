package week2.arrays;

public class FindingTheLargestValue {

    public static void main(String[] args) {
        int[] array = new int[10];
        int largest = 0;

        System.out.print("Array: ");
        for (int x = 0; x < 10; x++) {
            array[x] = (int) (Math.random() * 100);
            if (array[x] > largest) {
                largest = array[x];
            }
            System.out.print(array[x] + " ");
        }
        System.out.println("\n");
        System.out.println("The largest value is " + largest);
    }
}
