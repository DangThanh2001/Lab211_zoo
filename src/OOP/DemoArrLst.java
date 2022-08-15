/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import Logic.Validate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ASUS
 */
public class DemoArrLst {

    Validate vali = new Validate();
    ArrayList<person> list = new ArrayList<>();

    public void dataAo() {
        person p = new person("thanh", 12);
        person p1 = new person("hoa", 12);
        person p2 = new person("duc", 15);
        person p3 = new person("tienanh", 19);
        person p4 = new person("quang", 11);

        list.add(p);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
    }

    public void addPerson() {
        System.out.print("New name, man. Here= ");
        String name = vali.checkString();
        System.out.print("his or her age, man. Here= ");
        int age = vali.checkInt();

        person p = new person(name, age);
        list.add(p);
    }

    public void showList() {
        if (list.size() == 0) {
            System.out.println("Lam gi co gi dau ma show");
            return;
        }
        System.out.println("Danh sach ne:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("[" + i + "]" + list.get(i).toString());
        }
    }

    public void removePerson() {
        if (list.size() == 0) {
            System.out.println("Lam gi co gi dau ma xoa");
            return;
        }
        System.out.print("Nhap so thu tu ban muon xoa vao day= ");
        int index = vali.checkIntMax(list.size() - 1);
        try {
            for (int i = 0; i < list.size(); i++) {
                if (i == index) {
                    list.remove(index);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void sortByAge() {
        Collections.sort(list, new Comparator<person>() {
            @Override
            public int compare(person o1, person o2) {
                return o1.getAge() > o2.getAge() ? 1 : -1;
            }
        });
        showList();
    }

    public static void main(String[] args) {
        DemoArrLst demo = new DemoArrLst();
        demo.dataAo();
        demo.showList();

        demo.sortByAge();
    }
}
