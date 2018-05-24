/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication78;

class A
{
    public void sum(int a,int b)
    {
        System.out.println("Sum is:"+(a*b));
    }
    
}
class B extends A
{
   public void sum(int a,int b)
    {
        System.out.println("Sum is:"+(a+b));
    } 
}



public class JavaApplication78 {

    
    public static void main(String[] args) 
    {
        B obj1=new B();
        obj1.sum(2,3);
        
        //VS//
        
        A obj2=new A();
        obj2.sum(2,4);
        
        //VS//
        
        A obj3=new B(); //this is runtime polymorphism, only the object matters.So it will be taking method of 'A'.
        obj3.sum(2, 3);
    }
    
}
