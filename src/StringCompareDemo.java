public class StringCompareDemo {
    public static void main(String[] args){
        String name = "Wejdan";
        System.out.println("customer name is: "+ name);
        System.out.println("character at index 4 is: " + name.charAt(4));
        System.out.println(name.substring(2,5));
        String familyName = "Al-Subhi";
        System.out.println("check if "+ name + " and " + familyName + " equals or not: " + name.equals(familyName));
    }
}
