import java.util.Scanner;

public class StringSearchModifySystem2 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("your name is "+ name);
        System.out.println("enter a word or letter to search inside your name ");
        String chr= scan.nextLine();
        if(name.contains(chr)==true){
            System.out.println("your name contain: "+chr);
        }else{
            System.out.println("your name dosen't contain: "+chr);
        }
        System.out.println("enter other name to replace with your name");
        String other =scan.nextLine();
        System.out.println("the new name is: "+ name.replace(name, other));
        name=other;
        System.out.println("the substirng of "+ name+ " is: " +name.substring(1,3));
        System.out.println("return the first character of new name: "+ name.charAt(0));
        if(other.length()>8){
            System.out.println("new name is more than 8 letters");
        }else{
            System.out.println("new name is less than 8 letters");
        }
    }
}
