import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите число слов:: ");

        Scanner n = new Scanner(System.in);

        int N = n.nextInt();

        String name[] = new String[N];

        System.out.println("Введите слова: ");

        Scanner str;

        for (int i = 0; i < N; i++) {

//String s = args[i];

            str = new Scanner(System.in);

            name[i] = str.nextLine();

            if(isPalindrome(name[i]) == true){System.out.println(name[i]+ " Палиндром");}

            else {System.out.println(name[i]+ " Не Палиндром");}

        }
    }

    public static String reverseString(String s){

        String p="";

        for(int i=0;i<s.length(); i++){

            p=s.charAt(i)+p;

        }

        return p;

    }

    public static boolean isPalindrome(String s) {

        String p = reverseString(s);

        if (s.equals(p)) {

            return true;

        }else{return false;}

    }
}
