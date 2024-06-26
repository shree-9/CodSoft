import java.util.*;
class Grade
{
    double marks1,marks2,marks3,marks4,marks5,t,average;
    Grade(double marks1,double marks2,double marks3,double marks4,double marks5)
    {
        this.marks1=marks1;
        this.marks2=marks2;
        this.marks3=marks3;
        this.marks4=marks4;
        this.marks5=marks5;
        t=marks1+marks2+marks3+marks4+marks5;
        average=t/5.0;
    }
    void calcTotal()
    {
        System.out.println("Total="+t);
        System.out.println("Average="+average);
    }
    void getGrade()
    {
        System.out.print("Grade:");
        if(average>90)
          System.out.println("A");
        else if(average>80 && average<=80)
            System.out.println("B");
        else if(average>60 && average<=80)
            System.out.println("C");
        else if(average>35 && average<=60)
            System.out.println("D");
        else if(average<=35)
            System.out.println("E");
    }
    public static void main(String[] args){
     try (Scanner sc = new Scanner(System.in)) {
        System.out.println("enter marks of subject 1:");
        double m1=sc.nextDouble();
        System.out.println("enter marks of subject 2:");
        double m2=sc.nextDouble();
        System.out.println("enter marks of subject 3:");
        double m3=sc.nextDouble();
        System.out.println("enter marks of subject 4:");
        double m4=sc.nextDouble();
        System.out.println("enter marks of subject 5:");
        double m5=sc.nextDouble();
   
   Grade ob=new Grade(m1,m2,m3,m4,m5);
   ob.calcTotal();
   ob.getGrade();
    }
        }
    }
