

public class SubSequenceTree {

    static void seq(String str, String re) {
        if (str.length() == 0) {
            System.out.print(re + ",");
            return;
        }

        char c = str.charAt(0);
        String remain = str.substring(1);

        seq(remain, re);
        seq(remain, re+c);
    }

        static void seq2(String str, String re,int i) {
        if (str.length() == i) {
            System.out.print(re + ",");
            return;
        }

        char c = str.charAt(i);

        seq2(str, re,i+1);
        seq2(str, re+c,i+1);
    }

    public static void main(String[] args) {

        seq("abc", "");
        System.out.println();
        seq2("abc", "",0);
    }

}
