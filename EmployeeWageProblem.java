public class EmployeeWageProblem 
  {
    public static final int WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR =  8;
    public static final int IS_PART_TIME  = 1;
    public static final int IS_FuLL_TIME = 2;    
    public static final int PART_TIME_HOUR = 4;

public static void computeDailyWage()
 {
    int empTypeCheck  = (int) Math.floor(Math.random() * 10) % 3;
     if (empTypeCheck == 1)
  {   
     int part_TimeTotalDailyWage = WAGE_PER_HOUR * PART_TIME_HOUR;
     System.out.println("part time totalWage : " + part_TimeTotalDailyWage);
}
   else {
    int full_TimeTotalDailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
     System.out.println("full time totalDailywage is: "+ full_TimeTotalDailyWage);
   }
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