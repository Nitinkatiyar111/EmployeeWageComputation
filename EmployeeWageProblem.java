public class EmployeeWageProblem 
  {
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

 }
  else
     System.out.println("Employee is absent");
   }
}