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
public class MyRunnable implements Runnable{

    private int lastNum;
    
    public MyRunnable(int n){
        lastNum = n;
    }
    
    @Override
    public void run() {
        for (int i = 0; i < lastNum; i++) {
            System.out.print(i + " ");
        }
    }
    
    public static void main(String[] args) {
        Runnable runnable = new MyRunnable(100);
        Thread t = new Thread(runnable);
        t.start();
    }
}
