package aud2and3.FirstPart;

public class StringPrefix {

    public static boolean isPrefix(String first,String second) {
        if(first.length()>second.length()) {return false;}

        for(int i=0;i<first.length();i++) {
            if(first.charAt(i) != second.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrefix("Hello","World"));
        System.out.println(isPrefix("test","apple"));
        System.out.println(isPrefix("test","test123"));
    }
}
