public class EmployeeWageProblem 
  {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR =  8;
 

public static void computeDailyWage() {
    int totalDailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
     System.out.println("totalDailywage is: "+ totalDailyWage);
   }
public static void main(String[] args)
    {
    
      int min =0;
      int max =1; 
      int isPresent = 0;
      int isAbsent  = 1;

System.out.println("Welcome to Employee Wage Computation program");

   int empCheck = (int)(Math.random() * (max - min + 1) + min);

      if(empCheck == 0)
   {
       System.out.println("Employee is present");
        computeDailyWage();

 }
  else
     System.out.println("Employee is absent");
   }
}