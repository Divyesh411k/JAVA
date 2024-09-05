import java.util.Scanner;

class lab {
    public static void main(String[] args) {
        /*
         * Scanner myObj = new Scanner(System.in);
         * 
         * System.out.println("Enter no. of elements");
         * int n = myObj.nextInt();
         * int a[] = new int[n];
         * for (int i = 0; i < n; i++) {
         * a[i] = myObj.nextInt();
         * }
         * 
         * int b[] = new int[n];
         * 
         * System.out.println("cpoied list");
         * System.arraycopy(a, 0, b, 0, 4);
         * 
         * for (int i = 0; i < n; i++) {
         * System.out.print(b[i]);
         * }
         */

        /* String */
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter string");
        String s = myObj.nextLine();
        int blank = 0, up = 0, low = 0, special = 0, digi = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                blank++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                up++;
            } else if (Character.isLowerCase(s.charAt(i))) {
                low++;
            } else if (Character.isDigit(s.charAt(i))) {
                digi++;
            } else {
                special++;
            }
        }
        System.out.println("In the enterd string");
        System.out.println("The blank spaces are:" + blank);
        System.out.println("Lower case:" + low);
        System.out.println("Upper case:" + up);
        System.out.println("Digits: " + digi);
        System.out.println("Special characters :" + special);

        int vowel = 0, cons = 0;
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == 'a' || s.charAt(i) == 'e'
                    || s.charAt(i) == 'i'
                    || s.charAt(i) == 'o'
                    || s.charAt(i) == 'u') {
                vowel++;
            } else {
                cons++;
            }
        }
        System.out.println("Vowel count: " + vowel);
        System.out.println("consonant count:" + cons);

    }
}
