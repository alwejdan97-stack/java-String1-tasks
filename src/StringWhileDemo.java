public class StringWhileDemo {
    public static void main(String[] args){
        String text = "Wejdan working at Codeline";
        System.out.println(text);
        System.out.println("the length is: "+ text.length());
        int count=0;
        int space=0;
        int upper=0;
        while (count<text.length()){
            char chr=text.charAt(count);
            System.out.println(chr);
            if(chr == ' '){
                space++;
            }else if(Character.isUpperCase(chr)){
                upper++;
            }
            count++;
        }
        System.out.println("space= "+space);
        System.out.println("uppercase= "+upper);
    }
}