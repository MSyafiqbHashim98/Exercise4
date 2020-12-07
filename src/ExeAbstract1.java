/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
abstract class Parent{
    abstract void message();
    void subclass(){
        System.out.println("message");
    }
}

class A extends Parent{
    void message(){
        System.out.println("This is first subclass");
    }
}

class B extends Parent{
    void message(){
        System.out.println("This is second subclass");
    }
}

public class ExeAbstract1 {
    public static void main(String args[]){
        A a = new A();
        B b = new B();
        
        a.message();
        b.message();
    }
}
