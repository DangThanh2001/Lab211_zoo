/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

import Logic.Validate;
import java.util.Random;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class DemoArray {

    Validate vali = new Validate();

    public int[] randomArr() {
        Random r = new Random();
        int min = -100;
        int max = 100;
        int n = r.nextInt(101);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            int num = r.nextInt(200);
            arr[i] = num;
        }
        return arr;
    }

    public void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            String a = i != arr.length - 1 ? " - " : "";
            System.out.print(a);
        }
        System.out.println();
    }

    public void findFibo(int index) {
        int[] a = new int[index + 1];
        a[0] = 0;
        a[1] = 1;
        int check = a[1];

        for (int i = 2; i <= index; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }
        check = a[a.length - 1];

        showArray(a);
        System.out.println(a[index]);
    }

    public boolean KTSNT(int x) {
        if (x < 2) {
            return false;
        }
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void Fibo() {
        int f1 = 0, f2 = 1, f3, n;
        n = 1000;
        while (f1 <= n) {
            System.out.print(f1 + " ");
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("");
    }
    
    public boolean reverseStr(String s){
        if(!vali.isNumeric(s))
            return false;
        StringBuilder str = new StringBuilder();
        str.append(s);
        str.reverse();
        String a = str + "";
        if(a.equalsIgnoreCase(s)){
            return true;
        }
        return false;
    }
    
    public static void main(String[] args) {
        DemoArray d = new DemoArray();
        int[] arr = d.randomArr();
//        for (int i = 10000; i < 1000000; i++) {
//            if(d.reverseStr(i + ""))
//                System.out.println(i);
//        }
        System.out.println(d.reverseStr("aaa"));
    }
}
