/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MUHAMMAD SYAFIQ
 */
abstract class Mark{
    abstract void getPercentage();
}
class ClassA extends Mark{
    double percentage=0, subject1, subject2, subject3;

        ClassA(double s1, double s2, double s3){
            this.subject1=s1;
            this.subject2=s2;
            this.subject3=s3;
}

    void getPercentage(){
	percentage = (subject1+subject2+subject3)/300*100;
	
	System.out.println("Class A: "+percentage+"%");
}
}
class ClassB extends Mark{

    double percentage=0, subject1, subject2, subject3, subject4;

        ClassB(double m1, double m2, double m3, double m4){
            this.subject1=m1;
            this.subject2=m2;
            this.subject3=m3;
            this.subject4=m4;
}

    void getPercentage(){
	percentage = (subject1+subject2+subject3+subject4)/400*100;
	
	System.out.println("Class B: "+percentage+"%");
}
}
public class ExeAbstract3 {
    public static void main(String[] args) {
	
	ClassA a = new ClassA(90,70,80);
	ClassB b = new ClassB(90,70,80,60);
	
	a.getPercentage();
	b.getPercentage();
}
}





