import java.util.Scanner;

public class StringCompareValidateSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("your name is "+ name);
        System.out.println("the length of your name is: "+name.length());
        System.out.println("enter other name to compare with your name");
        String other =scan.nextLine();
        System.out.println("check if you name and other name are equals or not: "+name.equals(other));
        System.out.println("enter a value");
        String startValue =scan.nextLine();
        System.out.println("check if your name start with given value or not: "+name.startsWith(startValue));
        System.out.println("enter other value");
        String endValue =scan.nextLine();
        System.out.println("check if your name end with given value or not: "+name.endsWith(endValue));
        if(name.length()>8){
            System.out.println("your name is more than 8 letters");
        }else{
            System.out.println("your name is less than 8 letters");
        }
    }
}
