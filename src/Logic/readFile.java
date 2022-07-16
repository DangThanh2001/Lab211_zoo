package Logic;

import Entity.Animals;
import java.io.File;
import java.io.*;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class readFile {

    public Vector<Animals> readFileTxt() {
        Vector<Animals> v = new Vector<>();
        String data = "";
        try {
            File myObj = new File("animals.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String a = myReader.nextLine();
                String type = a.substring(0, a.indexOf(";"));
                String name = a.substring(a.indexOf(";") + 1, a.length());
                Animals an = new Animals(name, Integer.parseInt(type));
                v.add(an);
            }
            myReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return v;
    }

    public void writeTxt(Vector<Animals> v) {
        String rs = "";
        for (Animals o : v) {
            rs += o.getType() +";"+o.getName() + "\n";
        }
        rs.trim();
        try {
            FileWriter myWriter = new FileWriter("animals.txt");
            myWriter.write(rs);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile r = new readFile();
        System.out.println(r.readFileTxt());
    }
}
