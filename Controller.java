package sample;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        System.out.println("enter 3numbers:");
        Scanner x=new Scanner(System.in);
        int n1=x.nextInt();
        int n2=x.nextInt();
        int n3=x.nextInt();
        if (n1==n2&&n2<=n3||n1>=n2&&n2>=n3)
        System.out.println("in order");
        else if (n2>n3&&n1<n3||n2<n3&&n1>n3)
        System.out.println("not in order");

    }
}
