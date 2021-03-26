import java.text.DecimalFormat;
import java.util.Scanner;

public class Main extends Point3d {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        Scanner b= new Scanner(System.in);
        Scanner c = new Scanner(System.in);
        System.out.println("Введите координаты:: ");
        int A = a.nextInt();
        int B = b.nextInt();
        int C = c.nextInt();
        Point3d myPoint1  = new Point3d (A,B,C);

        A = a.nextInt();
        B = b.nextInt();
        C = c.nextInt();
        Point3d myPoint2  = new Point3d (A,B,C);

        A = a.nextInt();
        B = b.nextInt();
        C = c.nextInt();
        Point3d myPoint3  = new Point3d (A,B,C);

        DecimalFormat dec = new DecimalFormat("#.##");

        if(sravn(myPoint1,myPoint2) || sravn(myPoint1,myPoint3) || sravn(myPoint3,myPoint2)){
            System.out.println("Одинаковые");

        }else System.out.println(dec.format(Area(myPoint1,myPoint2,myPoint3)));


        }


public static double Area( Point3d A, Point3d B, Point3d C) {
    double dis1 = distanceTo(A, B);
    double dis2 = distanceTo(A, C);
    double dis3 = distanceTo(C, B);

    double area = (dis1 + dis2 + dis3) / 2;
    double sqrt_area = Math.sqrt(area * (area - dis1) * (area - dis2) * (area - dis3));
    return sqrt_area;
}
}