public class StringReverseDemo {
    public static void main(String[] args){
        String text = "Wejdan";
        System.out.println(text);
        System.out.println("the length is: "+ text.length());
        String reverse="";
        char CHAR='d';
        int count=0;
        for(int i=0; i<text.length(); i++) {
            char chr = text.charAt(i);
            System.out.println(chr + " ");
        }
        for(int i=text.length()-1; i>=0; i--) {
            char chr = text.charAt(i);
            reverse= reverse + chr;
            if(chr==CHAR){
                count++;
            }
        }
        System.out.println("the reverse is: "+ reverse);
        System.out.println(CHAR + " appears "+count+ " times");
    }
}
