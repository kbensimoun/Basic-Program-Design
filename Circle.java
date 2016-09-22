//**********************************************************
// Kevin Bensimoun
// Circle.java
//
// Print the area of a circle with two different radii
//**********************************************************
public class Circle
{
 public static void main(String[] args)
 { //variables
 final double PI = 3.14159;
 int radius = 10;
 int radius2 = 20;
 double area = PI * radius * radius;
 double area2 = PI * radius2 * radius2;
 double circumference = 2 * (PI * radius);
 double circumference2 = 2 * (PI * radius2);
 
 System.out.println("The area of a circle with radius " + radius +
                    " is " + area);
 System.out.println("The circumference of a circle with radius " + radius +
                    " is " + circumference);
 
 System.out.println("The area of a circle with radius " + radius2 +
                    " is " + area2);
 System.out.println("The circumference of a circle with radius " + radius2 +
                    " is " + circumference2);
 //determines if the 2nd area is twice as much as the first area                  
 System.out.println("The second area divided by the first area " + area2/area);
 //determines if the 2nd circumference is twice as much as the first circumference
 System.out.println("The second circumference divided by the first circumference " +
                    circumference2/circumference);
 
 }
}

//When the radius of a circle doubles, the area is four times as great and the
//circumference is twice as much
