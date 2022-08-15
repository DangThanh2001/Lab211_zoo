/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.Scanner;
import java.util.regex.Pattern;

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
            s = sc.nextLine().trim();
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
                    num = checkString();
                }
            } catch (Exception e) {
                System.out.println("Not allowed!!!\nAgain pls: ");
                num = checkString();
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
                num = checkString();
            }
        }
    }

    public boolean checkYN() {
        String ans = checkString();
        while (!ans.equalsIgnoreCase("y") && !ans.equalsIgnoreCase("n")) {
            System.out.println("Not allowed!!!"
                    + "\nOnly Y/N pls.\nAgain pls: ");
            ans = checkString();
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
            System.out.print("Can't larger than the size " + max
                    + "\nagain pls:");
            n = checkInt();
        }
        return n;
    }

    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");

    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }

    public static void main(String[] args) {
        Validate vali = new Validate();
        Scanner sc = new Scanner(System.in);
        System.out.println(vali.isNumeric("tt"));
    }
}
