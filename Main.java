public class Main {
    public static void main(String[] args) {
        String str = "morning";
        String reverseStr = "";
        char ch;

        for(int i=0;i<str.length();i++) {
            ch = str.charAt(i);
            reverseStr = ch + reverseStr;
        }
        System.out.println("Reversed string is : " + reverseStr);

    }
}

