import java.util.Locale;

public class StringOperationsDemo {
    public static void main(String[] args){
        String customer_name = "Wejdan";
        System.out.println("customer name is: "+customer_name);
        System.out.println("the elngth is: "+customer_name.length());
        System.out.println("uppercase is: "+customer_name.toUpperCase());
        System.out.println("lowercase is: "+customer_name.toLowerCase());
        String company_name = "Codeline";
        System.out.println(customer_name.concat(company_name));
    }
}
