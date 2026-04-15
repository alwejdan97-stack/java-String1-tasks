public class StringDoWhileDemo {
    public static void main(String[] args){
        String text = "Wejdan working at Codeline";
        System.out.println(text);
        System.out.println("the length is: "+ text.length());
        int count=0;
        int space=0;
        int lower=0;
        do{
                char chr=text.charAt(count);
                System.out.println(chr);
                if(chr == ' '){
                    space++;
                }else if(Character.isLowerCase(chr)){
                    lower++;
                }
                count++;

        }while (count<text.length());
        System.out.println("space= "+space);
        System.out.println("lowercase= "+lower);
    }
}
