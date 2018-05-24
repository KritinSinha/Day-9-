/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorderivedclass;

class A
{
 private int a,b;
 public A(int a,int b)   //parameterized constructor
 {
     this.a=a;
     this.b=b;
 }
 public void show()
 {
     System.out.println(a);
     System.out.println(b);
 }
 
}
class B extends A
{
    float r,s;
    String str;
    
    public B(int a,int b,float r,float s,String str)
    {
        super (a,b);  //to bring a and b  from  constructor A
        this.r=r;
        this.s=s;
        this.str=str;
    }
    public void show()  //now method overriding happens
    {
        super.show();
        System.out.println(r);
        System.out.println(s);
        System.out.println(str);
    }
    
}
            




public class ConstructorDerivedClass {

    
    public static void main(String[] args) 
    {
      B obj=new B(3,25,26.4f,45.67f,"Hey There");
      obj.show();
    }
    
}
