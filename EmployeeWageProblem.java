public class EmployeeWageProblem 
  {
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_PART_TIME  = 1;
    public static final int IS_FULL_TIME = 2;    

public static void computeDailyWage()
  {
     int empHrs = 0;
     int empTypeCheck  = (int) Math.floor(Math.random() * 10) % 3;
     switch (empTypeCheck) 
 {
     case IS_PART_TIME:
       empHrs = 4;
          break;
    case IS_FULL_TIME:
       empHrs = 8;
          break;
    default:
         empHrs = 0;
 }
int totalWage = empHrs * WAGE_PER_HOUR ;
System.out.println("totalWage is :"+ totalWage);
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