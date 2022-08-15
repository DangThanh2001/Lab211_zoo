/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author ASUS
 */
public class DemoStringBuilder {

    private final String pattern = "[A-Z][a-zA-Z]{1,24}";
    private final String patternNum = "[\\d]*[02468]";
    private final String patternNuumeric = "[\\d]";

    public boolean checkPass(String pass) {
        return pass.matches(pattern);
    }
    
    public boolean checkNumEven(String num){
        return num.matches(patternNum);
    }

    public boolean checkNum(String num){
        return num.matches(patternNuumeric);
    }
    
    public static void main(String[] args) {
        DemoStringBuilder demo = new DemoStringBuilder();
        System.out.println(demo.checkNum("1"));
    }
}
