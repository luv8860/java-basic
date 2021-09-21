import java.util.*;
class Main2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double basic_salary=sc.nextDouble();
        double hra=basic_salary*0.15;
        double da=0.6*basic_salary;
        double  total=basic_salary+hra+da;
        double tax=0.0;
        if (total>500000&&total<=1000000){
            tax=0.2*total;
        }
        else{
            tax=total*0.3;
        }
        System.out.println("Total tax is :"+tax);

        
    }
}