package module_003.Task_001;

import java.util.*;
public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath(){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        scanner.close();
        System.out.println(num1+num2+" "+(num1-num2)+" "+(num1*num2)+" "+(num1 / num2));
    }

    //Test output on 24, 4 standard input
    public static void main(String[] args) {
        new MoonComputerTests().testMath();
    }
}