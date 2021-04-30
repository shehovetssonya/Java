import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Введите prob, prize и pay");
        Scanner prob = new Scanner(System.in);
        Scanner prize = new Scanner(System.in);
        Scanner pay = new Scanner(System.in);
        boolean rez = profitableGamble(prob.nextFloat(), prize.nextInt(), pay.nextInt());

        System.out.println(rez);
    }

    public static boolean profitableGamble(float prob, int prize, int pay)
    {
        if(prob * prize > pay)
            return true;
        else
            return false;
    }
}
