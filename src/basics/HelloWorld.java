package basics;

public class HelloWorld {
    // psvm + tab: main method
    // main method: you must have this method to run your java file.
    public static void main(String[] args) {
        // sout + tab: println() - with newline
        System.out.println("Hello, World!");

        // print() - print without a newline
        System.out.print("Vancouver, ");
        System.out.print("BC\n");

        // printf() - print with format
        // %s : string
        // %d : digit(integer)
        // %f : float
        System.out.printf("%s class starts at %d:%02d am\n", "Java", 9, 0);

        int x = 10;
        x++;
        ++x;
        int y = x++; // "assign and increment"
        int z = ++x; // "increment and assign"
        System.out.println(y); // 10
        System.out.println(z); // 12
    }
}
// python - interpreted programming language, dynamic typing
// java   - compiled language, static typing
//        - source code -> byte code
//        - runs on JVM (Java Virtual Machine) -> portable
//        - Designed in 1990s, one of the most popular languages
//        - Web back-end (server-side) application, 'Enterprise' size application
//        - 'Object-Oriented Programming Language'
