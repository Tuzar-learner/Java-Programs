package lab_programs;

abstract class Shape{
          abstract void numberofsides();
}
class Trapezoid extends Shape{
          void numberofsides(){
                      System.out.println("Number of sides of Rectangle is : 4");
          }
}
class Triangle extends Shape{
          void numberofsides(){
                      System.out.println("Number of sides of Triangle is : 3");
          }
}
class Hexagon extends Shape{
          void numberofsides(){
                      System.out.println("Number of sides of Hexagon is : 6");
          }
}
public class Abstract_Class{
          public static void main(String args[]){
                      Shape s;
                      s=new Trapezoid();
                      s.numberofsides();
                      s=new Triangle();
                      s.numberofsides();
                      s=new Hexagon();
                      s.numberofsides();      
                     
          }
}
 
