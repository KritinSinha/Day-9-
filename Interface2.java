/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interface2;


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





public class Interface2 {

    
    public static void main(String[] args) 
    {
     I1 obj1=new A();      //--->interface cannot have object, but it can have reference variable
     obj1.function1();
     obj1.function2();     //--->here it will show error because the reference variable is only for I1. So we cannot access any other interface's function. 
                           //--->if we want to use I2's function, we need to give the reference varialbe of I2 and so on....
     obj1.function3();                      
    }
    
}
