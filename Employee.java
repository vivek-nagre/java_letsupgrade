public class Employee {
// class level veriable balnk
String name;
int age;
String city;

// declaring a method outside main method 
public void Show(int a , int b) {
   System.out.println("my name is: "+name);
   System.out.println("my age is: "+age);
   System.out.println("i currently live in : "+city);
   System.out.println("value of a is: "+ a +" and "+" value of b is: "+b);

    
}
    public static void main(String[] args) {
    System.out.println("hello there this is my first object....");
//  creation of object
// class name obj_name=keyword to make fresh memory constructor
        Employee e1=new Employee();
        // assigning  value to the blank veriable with object refrance
        e1.name="vivek";
        e1.age=22;
        e1.city="deulgon araja";
        e1.Show(1,2);
        System.out.println();
        System.out.println("hello there this is my Secound object....");
        Employee e2=new Employee();
        e2.name="shubham";
        e2.age=25;
        e2.city="Pune";
        e2.Show(3,4);
    
    } 
}
