/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import Entity.*;
import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author ASUS
 */
public class Menu {

    private final String daubang = "=========";
    Scanner sc = new Scanner(System.in);
    Validate vali = new Validate();

    public void ShowMenu() {
        System.out.println(daubang + "THANHDTHE150869" + daubang);
        System.out.println(daubang + "MENU" + daubang);
        System.out.println("1.Add new animals");
        System.out.println("2.Update new animals");
        System.out.println("3.Delete new animals");
        System.out.println("4.Search animals");
        System.out.println("5.Show animals");
        System.out.println("6.Store animals to file");
        System.out.println("Others: Exist!!!");
    }

    public Animals newAnimal() {
        System.out.print("Enter new name pls: ");
        String name = vali.checkString();
        System.out.println("0. Group of 0-legged animals");
        System.out.println("1. Group of bipedal and flightless animals");
        System.out.println("2. Group of bipedal and flying animals");
        System.out.println("3. Group of 4-legged animals");
        System.out.print("Choose type pls: ");
        int type = vali.checkIntMax(3);
        Animals ani = new Animals(name, type);
        return ani;
    }
    
    public String getType(int n){
        String s = "";
        switch(n){
            case 0:
                s="legged animals";
                break;
            case 1:
                s="bipedal and flightless animals";
                break;
            case 2:
                s="bipedal and flying animals";
                break;
            case 3:
                s="legged animals";
                break;
        }
        return s;
    }
    
    public void ShowAllAnimal(Vector<Animals> v){
        for (int i = 0; i < v.size(); i++) {
          System.out.println(i+". Name:"+v.get(i).getName() +
                  ", Type:" + getType(v.get(i).getType()));  
        }
    }
}
