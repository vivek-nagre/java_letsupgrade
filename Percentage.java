// package letsupgrade;
import java.util.Scanner;

// import org.graalvm.compiler.nodes.NodeView.Default;

       
public class Percentage {
    public static void main(String[] args) {
        System.out.println("this is dimple percentage console app..");
        float obt_mark=0f;
        float percentage;        
        Scanner sc=new Scanner(System.in);
        System.out.print("how many subject you have:");
        int Subject=sc.nextInt();
        for (int i = 1; i <=Subject; i++) {
            System.out.print("please enter the your subject "+ i+" marks:");
            int mark=sc.nextInt();
            obt_mark=obt_mark+mark;
        }
        float TotalMark=Subject*100f;
        percentage=obt_mark*(100/TotalMark);
        System.out.println("my total mark is: "+obt_mark);
        System.out.println("total mark:"+TotalMark);
        System.out.println("You got percentage: "+percentage+" %");
        
    if (percentage>=75 && percentage<=100) {
        System.out.println("YOU EARN \'A' GRADE ");
        
    } 
    else if (percentage>=60 && percentage<=74){
        System.out.println("YOU EARN \'B' GRADE ");
    }
    else if (percentage>=45 && percentage<=59){
        System.out.println("YOU EARN \'C' GRADE ");
    }   
    else if (percentage<35){
        System.out.println("sorry to inform you, you'r \'FAIL'");
    }   
    System.out.println();
    System.out.println("Hopee you are happy");
    }
    
}
// 