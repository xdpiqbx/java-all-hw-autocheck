package module_003.Task_004;

import java.util.*;

public class PassportFormCreator {
    public void createForms(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String sName = scanner.nextLine();
        int age = scanner.nextInt();
        scanner.close();
        age *= 10;
        System.out.println(name + " " + sName + " " + age);
        System.out.println(name.toUpperCase());
        System.out.println(sName.toUpperCase());
        System.out.println(age);
//        System.out.printf("%s%n%s%n%d", name.toUpperCase(), sName.toUpperCase(), age);
    }
//    public static void main(String[] args) {
//        new PassportFormCreator().createForms();
//    }
}
