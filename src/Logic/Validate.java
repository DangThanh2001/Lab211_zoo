/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Validate {

    Scanner sc = new Scanner(System.in);

    public String checkString() {
        String s = sc.nextLine().trim();
        while (s.isEmpty()) {
            System.out.println("Not allowed!!!\nAgain pls: ");
            s = sc.nextLine();
        }
        return s;
    }

    public int checkInt() {
        String num = checkString();
        while (true) {
            try {
                int n = Integer.parseInt(num);
                if (n >= 0) {
                    return n;
                } else {
                    System.out.print("Positive pls!!\nAgian pls:");
                    num = sc.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Not allowed!!!\nAgain pls: ");
                num = sc.nextLine();
            }
        }
    }

    public double checkDouble() {
        String num = checkString();
        while (true) {
            try {
                double n = Double.parseDouble(num);
                return n;
            } catch (Exception e) {
                System.out.println("Not allowed!!!\nAgain pls: ");
                num = sc.nextLine();
            }
        }
    }

    public boolean checkYN() {
        String ans = checkString();
        while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
            System.out.println("Not allowed!!!\nAgain pls: ");
            ans = sc.nextLine();
        }
        if (ans.equalsIgnoreCase("y")) {
            return true;
        } else {
            return false;
        }
    }

    public int checkIntMax(int max) {
        int n = checkInt();
        while (n > max) {
            System.out.print("Can't larger than the size\nagain pls:");
            n = checkInt();
        }
        return n;
    }

    public static void main(String[] args) {
        Validate vali = new Validate();
        int[] arr = {1, 4, 1, 3, 1, 8};
        int first = 0, fina = 0;
        //   int n = vali.checkInt();
//        for (int i = 0; i < arr.length; i++) {
//            if(n == arr[i]){
//                first = i;
//                break;
//            }
//        }
//        for (int i = 0; i < arr.length; i++) {
//            if(n == arr[i]){
//                fina = i;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int a = arr[j];
                    arr[j] = arr[i];
                    arr[i] = a;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // hoc snh co nhieu diem, chon hoc sinh in ra diem cua hs day
    }
}
