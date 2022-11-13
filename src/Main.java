
import Entity.Animals;
import Logic.Menu;
import Logic.Validate;
import Logic.readFile;
import java.util.Scanner;
import java.util.Vector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        Menu menu = new Menu();
        Validate vali = new Validate();
        readFile read = new readFile();
        Vector<Animals> v = new Vector<>();
        v = read.readFileTxt();
        int choice;
        boolean loop = true;
        while (loop) {
            menu.ShowMenu();
            choice = vali.checkInt();
            switch (choice) {
                case 1:
                    Animals a = menu.newAnimal();
                    v.add(a);
                    boolean cont = true;
                    while (cont) {
                        System.out.println("Are u want to continue ?");
                        System.out.print("(Y/N) (y for YES and n for NO): ");
                        int i = 0;
                        if (vali.checkYN()) {
                            Animals a0 = menu.newAnimal();
                            v.add(a0);
                        }
                        else
                            cont = false;
                    }
                    break;
                case 2:
                    System.out.print("Choose the order you want to update: ");
                    int index = vali.checkIntMax(v.size());
                    Animals ani = menu.newAnimal();
                    System.out.println("Are u sure to update ?");
                    for (int i = 0; i < v.size(); i++) {
                        if (index == i) {
                            if (vali.checkYN()) {
                                v.get(i).setName(ani.getName());
                                v.get(i).setType(ani.getType());
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 3://delete
                    System.out.print("Choose the order you want to delete: ");
                    int index0 = vali.checkIntMax(v.size());
                    System.out.println("Are u sure to delete ?");
                    for (int i = 0; i < v.size(); i++) {
                        if (index0 == i) {
                            if (vali.checkYN()) {
                                v.remove(v.get(i));
                            } else {
                                break;
                            }
                        }
                    }
                    break;
                case 4://search
                    menu.SearchAnimal(v);
                    break;
                case 5:
                    menu.ShowAllAnimal(v);
                    break;
                case 6:
                    read.writeTxt(v);
                    break;
                default:
                    loop = false;
            }
        }
    }

}
