package Utils;

import java.util.Scanner;

/**
 *
 * @author jprod
 */
public class UtilConsole {
    
    public static void print(String str){
        UtilConsole.print(str,UtilConsole.COLOR_RESET);
    }
    
    public static void print(String str, String color){
        System.out.println(color+str);
    }
    
    public static int getInputInt(String prompt){
        print(prompt);
        int value=scan.nextInt();
        scan.nextLine();
        return value;
    }
    
    public static double getInputDouble(String prompt){
        print(prompt);
        return scan.nextDouble();
    }
    
    public static String getInputString(String prompt){
        print(prompt);
        return scan.nextLine();
    }
    
    public static final String COLOR_RESET = "\u001B[0m";
    public static final String COLOR_RED = "\u001B[31m";
    public static final String COLOR_GREEN = "\u001B[32m";
    public static final String COLOR_YELLOW = "\u001B[33m";
    public static final String COLOR_BLUE = "\u001B[34m";
    public static final String COLOR_PURPLE = "\u001B[35m";
    public static final String COLOR_CYAN = "\u001B[36m";
    public static final String COLOR_WHITE = "\u001B[37m";
    public static Scanner scan=new Scanner(System.in);

}
