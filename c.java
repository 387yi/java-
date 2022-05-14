package text_5_13.text;

import java.util.Random;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        /*Random r = new Random();
        int a = r.nextInt(10);
        System.out.println(a);
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();*/
        int i=0;
        //动态内存的开辟
        int []arr=new int[10];
        //静态内存的开辟
        //简化 int[]arr1={1,2,3};
        int []arr1=new int[]{1,2,3};
        for(i=0;i<9;i++)
        {
            arr[i]=i;
        }
        System.out.println(arr);
        for(i=0;i<9;i=i+1)
        {
            System.out.println(arr[i]);
        }
    }
}
