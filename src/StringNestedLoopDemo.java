public class StringNestedLoopDemo {
    public static void main(String[] args){
        String text = "Wejdan";
        String text2 = "Codeline";
        System.out.println(text);
        System.out.println("the length of text is: "+ text.length());
        System.out.println("the length of text2 is: "+ text.length());
        int count=0;
        for(int i=0; i<text.length(); i++){
            for(int j=0; j<text2.length(); j++){
                if(text.charAt(i)==text2.charAt(j)){
                    System.out.println("matching: "+ text.charAt(i));
                    count++;
                }
            }
        }
        System.out.println("total of matching= "+ count);
    }
}
