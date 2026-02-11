import java.util.*;

public class String1 {
    public static void Letter(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
    }

    public static boolean pslindrome(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;

    }

    public static int shortestpath(String path) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'N') {
                y++;
            } else if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else {
                x--;
            }
        }
        int X2 = x * x;
        int Y2 = y * y;
        return (int) Math.sqrt(X2 + Y2);
    }

    public static String substring(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static String touppercase(String str){
        StringBuilder sb = new StringBuilder("");
       
        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i = 1;i<str.length();i++){
            if(str.charAt(i) == ' ' &&  i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }
            
        }
     return sb.toString();
    }

    public static String compress(String str){
        String newstr = " ";
        for(int i=0;i<str.length();i++){
            Integer count =1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                count ++;
                i++;

            }newstr+=str.charAt(i);
            if(count>1){
                newstr+=count.toString();
            }
        }
        return newstr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");
        // String name = sc.next();

        // System.out.println(name);

        // String name1 = sc.nextLine();

        // System.out.println(name1);

        // System.out.println(name1.length());

        // String first ="Adhyan";
        // String Last = "Tiwari";;
        // String full = first + " " + Last;
        // System.out.println(full);
        // // System.out.println(full.charAt(1));

        // Letter(full);

        // String result = "racecar";
        // System.out.println(pslindrome(result));

        // String path = "WNEENESENNN";
        // System.out.println(shortestpath(path));

        {String s1 = "tony";
        String s2 = "tony";

        String s3 = new String("tony");
        if(s1==s2){
        System.out.println("they are equal");
        }else{
        System.out.println("not equal");
        }
        if(s1.equals(s3)){
        System.out.println("they are equal");
        }else{
        System.out.println("not equal");}

        // {
        //     String str5 = "helloworld";
        //     System.out.println(substring(str5, 0, 3));
        // }


        // {String fruits[] = {"aaple","banana","mango"};
        // String largest = fruits[0];
        // for(int i=1;i<fruits.length;i++){
        //     if(largest.compareTo(fruits[i])<0){
        //         largest = fruits[i];
        //     }

        // }
        // System.out.println(largest);}

        // StringBuilder sb = new StringBuilder("");
        // for(char ch = 'a';ch<='z';ch++){
        //     sb.append(ch);


        // }
        // System.out.println(sb);


    //   String str7 = "i am adhyan tiwari";
    //   System.out.println(touppercase(str7));


    // {String str9 = "aaaajjjjuuuuddddmmmm";
    // System.out.println(compress(str9));
      //}
    }

}
}
