package basics;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");
        System.out.println(s2 == s3);  // X
        System.out.println(s2.equals(s3)); // O

        String coffee = "Trees Coffee";
        System.out.println(coffee.length());
        // coffee[0:5]
        System.out.println(coffee.substring(0, 5));

        // for-loop to print all characters in string
        for (int i = 0; i < coffee.length(); i++) {
            System.out.println(coffee.substring(i, i + 1));  // "C"
            char ch = coffee.charAt(i);  // 'C'
            System.out.println(ch);
        }

        char[] chars = coffee.toCharArray();
        for (char ch : chars) {
            System.out.println(ch);
        }
    }
}
