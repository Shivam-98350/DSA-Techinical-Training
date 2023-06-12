
public class ReverseString {

    static String reverse(String s)
    {
        if(s.length()==1)return String.valueOf(s.charAt(0));

        return reverse(s.substring(1))+s.charAt(0);
    }
    public static void main(String[] args) {
        
        String str="Shivam";

        System.out.println("Reverse of the String is : "+reverse(str));

    }
}
