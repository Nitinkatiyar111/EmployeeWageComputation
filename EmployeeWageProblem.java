public class EmployeeWageProblem 
  {
    public static final int WAGE_PER_HOUR = 20;
    public static final int IS_PART_TIME  = 1;
    public static final int IS_FULL_TIME = 2;    
public static void computeDailyWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth)
  { 
     int totalWage = 0;
     int totalWorkingDay = 20;
     int empHrs = 0;
     int totalEmpHrs = 0;
     int workingHour = 0;
     int workingDay  = 1;
     int maxWorkingDay  = 20;
     int  maxWorkingHour = 100;

while ( workingDay < maxWorkingDay || workingHour < maxWorkingHour)
  {
      int empTypeCheck  = (int) Math.floor(Math.random() * 10) % 3;
       switch (empTypeCheck) 
    {
       case IS_PART_TIME:
        empHrs = 4 * totalWorkingDay;
            break;
       case IS_FULL_TIME:
       empHrs = 8 * totalWorkingDay;
          break;
    default:
         empHrs = 0;
 }
totalEmpHrs +=empHrs ;   
    totalWage = totalEmpHrs * WAGE_PER_HOUR ;
     workingHour = workingHour + 8;
     workingDay = workingDay + 1;
  }
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