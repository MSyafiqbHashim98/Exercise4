/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
abstract class Bank{
    public abstract void getBalance();
}

class BankA extends Bank{
    public void getBalance(){
        System.out.println("Bank A: $100"); 
    }
    }

class BankB extends Bank{
    public void getBalance(){
        System.out.println("Bank B: $150"); 
    }
    }

class BankC extends Bank{
    public void getBalance(){
        System.out.println("Bank C: $200"); 
    }
    }

public class ExeAbstract2 {
  public static void main(String[]args){
      BankA a = new BankA();
      BankB b = new BankB();
      BankC c = new BankC();
      
      a.getBalance();
      b.getBalance();
      c.getBalance();
  } 
}
