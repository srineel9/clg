import java.util.*;
public class stringlowercase {

    public static String lowercase( String str) {
        Integer count = 0; // to change this into string Integer is used 
        String newstr = "";
        for(int i = 0;i<str.length();i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
            newstr = count.toString(); //to change any data type to sting toString() is used 
         
        
        }
        return newstr;

    }
    public static void main(String args[]) {
        //String str = "hi iam srineel";
        Scanner sc= new Scanner(System.in);
       // String str = new Scanner(System.in).next();;
       String str = sc.nextLine();
        System.out.println(lowercase(str));

    }
}