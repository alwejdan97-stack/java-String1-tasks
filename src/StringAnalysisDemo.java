public class StringAnalysisDemo {
    public static void main(String[] args){
        String text = "Ahmed";
        System.out.println(text);
        System.out.println("the length of your text is: "+ text.length());
        String text2="Omar";
        System.out.println("second text is: "+text2);
        System.out.println("compare if text and text2 are equal or not: "+ text.equals(text2));
        System.out.println("the index of p in text is:"+ text.indexOf("p"));
        System.out.println("check if text starts with a or not: "+ text.startsWith("a"));
        System.out.println("check if text starts with d or not: "+ text.endsWith("d"));
    }
}
