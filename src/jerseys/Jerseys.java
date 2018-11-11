/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerseys;

import java.util.Scanner;

/**
 *
 * @author huang
 */
public class Jerseys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count=0;
        Scanner sc=new Scanner(System.in);
        int J=sc.nextInt();
        int A=sc.nextInt();
        sc.nextLine();
        int[] jerseys=new int[J];
        for (int i=0;i<J;i++) {
            jerseys[i]=convertSize(sc.nextLine().charAt(0));
        }
        for (int i=0;i<A;i++) {
            int size=convertSize(sc.next().charAt(0));
            int number=sc.nextInt();
            sc.nextLine();
            if (size<=jerseys[number-1]) {
                count++;
                jerseys[number-1]=-1;
            }
        }
        System.out.println(count);
    }

    private static int convertSize(char size) {
        switch (size) {
            case 'S' : return 0;
            case 'M' : return 1;
            case 'L' : return 2;
            default: return -1;
        }
    }
    
}
