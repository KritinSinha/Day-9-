/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inteface;

interface I1
{
 void function1();  
}
interface I2
{
 void function2();
}
interface I3
{
 void function3();   
}

class A implements I1,I2,I3
{

   
    
    public void function1() 
    {
      System.out.println("This is f1");  
    }

    
     
    public void function2() 
    {
      System.out.println("This is f2");  
    }

     
    public void function3() 
    {
       System.out.println("This is f3");
    }
    
}




public class Inteface {

    
    public static void main(String[] args) 
    {
     A obj=new A();
     obj.function1();
     obj.function2();
     obj.function3();
     
     
    }
    
}
