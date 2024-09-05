import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter string");
        String s1 = myObj.nextLine();
        String s2 = myObj.nextLine();

        boolean isMetaString = false;

        if (s1.length() != s2.length()) {
            isMetaString = false;
        } else {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = i + 1; j < s1.length(); j++) {
                    char[] s1Array = s1.toCharArray();
                    char temp = s1Array[i];
                    s1Array[i] = s1Array[j];
                    s1Array[j] = temp;
                    String replaced = new String(s1Array);
                    if (replaced.equals(s2)) {
                        isMetaString = true;
                        break;
                    }
                }
                if (isMetaString) {
                    break;
                }
            }
        }

        if (isMetaString) {
            System.out.println(" It is a meta string");
        } else {
            System.out.println(" It is not a meta string");
        }
    }
}
