import java.util.*;
class Grade
{
    double m1,m2,m3,m4,m5,t,avg;
    Grade(double m1,double m2,double m3,double m4,double m5)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        this.m4=m4;
        this.m5=m5;
        t=m1+m2+m3+m4+m5;
        avg=t/5.0;
    }
    void calcTotal()
    {
        System.out.println("Total="+t);
        System.out.println("Average="+avg);
    }
    void getGrade()
    {
        System.out.print("Grade:");
        if(avg>90)
          System.out.println("A");
        else if(avg>80 && avg<=80)
            System.out.println("B");
        else if(avg>60 && avg<=80)
            System.out.println("C");
        else if(avg>35 && avg<=60)
            System.out.println("D");
        else if(avg<=35)
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
