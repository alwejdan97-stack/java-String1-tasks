public class StringValidationDemo {
    public static void main(String[] args){
        String text = "Wejdan working at Codeline";
        System.out.println(text);
        System.out.println("the length is: "+ text.length());
        int vowel=0;
        int constant=0;
        for(int i=0; i<text.length(); i++){
            System.out.print(text.charAt(i)+" ");
            char chr = Character.toLowerCase(text.charAt(i));
            if(chr== 'a'||chr=='e'||chr=='i'||chr=='u'||chr=='o'){
                vowel++;
            }if(Character.isLetter(text.charAt(i))){
                constant++;
            }
        }
        System.out.println(" ");
        System.out.println("vowel= "+ vowel);
        System.out.println("constant= " + constant);
    }
}
