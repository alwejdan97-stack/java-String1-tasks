public class StringCheckDemo {
    public static void main(String[] args){
        String text = "good morning, how are you?";
        System.out.println(text);
        System.out.println(text.substring(0,7));
        System.out.println("replace morning with afternoon :"+ text.replace("morning", "afternoon"));
        System.out.println("check if contain 'hello' or not: "+ text.contains("hello"));
        System.out.println("display specific character: "+text.charAt(4));
        String secondText= "good afternoon";
        System.out.println("the length of secondText is: "+secondText.length());
    }
}
