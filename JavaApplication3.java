/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
public class JavaApplication3 {

  
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter midterm one:");
    Double mid1=input.nextDouble();
    System.out.println("Enter midterm two:");
    Double mid2=input.nextDouble();
    Double total1=0.0;
    Double total2=0.0;
    int numberOfStudentMid1=0;
    int numberOfStudentMid2=0;
    ////////////////////////////////////////
    while(mid1>=0&&mid2>=0){
    System.out.println("Enter midterm one or Enter -1 to exist:");
    mid1=input.nextDouble();
    System.out.println("Enter midterm two or Enter -1 to exist:");
    mid2=input.nextDouble();
    total1+=mid1;
    total2+=mid2;
    numberOfStudentMid1++;
    numberOfStudentMid2++;
    }
    ////////////////////////////////////////
    double Avg1 =total1/numberOfStudentMid1;
    double Avg2 =total2/numberOfStudentMid2;
    System.out.println("Avg of midterm one:"+Avg1);
    System.out.println("Avg of midterm two:"+Avg2);
    if(Avg1>Avg2){
       System.out.println("The Avrage of midterm one is bigger than midterm two");  
    }else
        System.out.println("The Avrage of midterm two is bigger than midterm one");
    
    if(Avg1==Avg2){
    System.out.println("The Avrage of midterm one is equall to midterm two"); 
    }
    }  
}
