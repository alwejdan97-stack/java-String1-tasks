import java.util.Scanner;

public class CompleteStringProcessingSystem {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your name");
        String name= scan.nextLine();
        System.out.println("your name is "+ name);
        System.out.println("the length of your name is: "+name.length());
        System.out.println("your name in uppercase is: "+ name.toUpperCase());
        System.out.println("your name in lowercase is: "+ name.toLowerCase());
        System.out.println("enter a word or letter to compare with your name");
        String other =scan.nextLine();
        System.out.println("check if your name contain the given word or not: "+ name.contains(other));
        System.out.println("enter other name to compare with your name");
        String name2= scan.nextLine();
        System.out.println("check if the other name equal with your name or not: "+ name.equalsIgnoreCase(name2));
        System.out.println("display the first letter of your name: "+name.charAt(0));
        int vowel=0;
        for(int i=0; i<name.length();i++){
            char lower= Character.toLowerCase(name.charAt(i));
            System.out.println(lower+ " ");
            if(lower=='e' || lower=='a' || lower=='i' || lower=='u'||lower=='o'){
                vowel++;}
        }
        System.out.println("the total number of voewl is: "+ vowel);

        if(name.length()>10){
            System.out.println("your name is too long");
        }else{
            System.out.println("your name is too short");
        }
    }
}
