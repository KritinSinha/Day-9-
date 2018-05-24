/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodoverriding;

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
        System.out.println("Sum is:"+(a+b));    //method overriding --here definition is changed for the same method
    }
}

public class MethodOverriding {

    
    public static void main(String[] args) 
    {
       B obj=new B();     //this is runtime polymorphism as we decide here whehter method of A or method of B will be called  
       obj.sum(2,4);
       
       A obj1=new A();    //this is runtime polymorphism as we decide here whehter method of A or method of B will be called
       obj1.sum(4,5);
    }
    
}
