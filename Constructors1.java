/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors1;
/*1)Construtors are used to initialize objects.2)They look like methods.3)Same name as the class.4)Does not return any value,not even void.*/


class A
{
public A(int a,int b)   //this is a constructor,not even void is required.
{
    System.out.println("Product is:"+(a*b));
}
public A()
{
    System.out.println("Hey there!");
}
}




public class Constructors1 {

    
    public static void main(String[] args) 
    {
       A obj1=new A(2,4);
       A obj2=new A(5,7);   //now  it will freshly assign the value with a=5 and b=7, with no  relation to a=2,b=4
       A obj3=new A();
       
       //VERSUS
      
       
       System.out.println("\n Also....");
       obj1=new A(2,4);
       obj2=new A(5,7);   
       obj3=new A();
     
         }
    
}
