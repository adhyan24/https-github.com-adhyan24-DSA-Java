import java.util.*;

public class String2 {
    public static int findlowercaseVowelcount(String str) {
        int len = str.length();
        int vowelcount = 0;
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch) == true) {
                if (ch == 'a' || ch == 'u' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
                    vowelcount++;
                }
            }
        }
        return vowelcount;
    }

    public static void anagram(String s1,String s2){
         if(s1.length()==s2.length()){

        char c1[] = new char[s1.length()];
        char c2[] = new char[s2.length()];

        for( int i = 0;i<s1.length();i++){
            c1[i] = s1.charAt(i);
            c2[i] = s2.charAt(i);
        }
        Arrays.sort(c1);
        Arrays.sort(c2);

    
            if(Arrays.equals(c1, c2)){
                System.out.println(" it is  an anagram");

            }else{
                System.out.println("it is not an anagram");
            }


    }else{
        System.out.println("it is not an anagram");
    }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String str = sc.next();

        // int vowelcount = findlowercaseVowelcount(str);

        // System.out.println(" the number of vowels is : " + vowelcount);
        

    // {
    //         String s1 = "tony";
    //     String s2 = "tony";

    //     String s1intern = s1.intern();

    //     String s3 = new String("tony");

    //     String s3Intern = s3.intern();
    //    if(s1intern == s3Intern){
    //     System.out.println("yupppppp");
    //    }
    // }

        String s1 = "pan";
        String s2  = "nap";
        anagram(s1, s2);

    }

}
