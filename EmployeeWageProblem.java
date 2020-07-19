public class EmployeeWageProblem 
  {
        public static final int IS_PART_TIME  = 1;
        public static final int IS_FULL_TIME = 2;
    
        private final String company;
        private final int empRatePerHour;
        private final int maxWorkingDays;
        private final int maxWorkingHour;
        private int totalEmpWage;


      public EmployeeWageProblem(String company,int empRatePerHour,int maxWorkingDays, int maxWorkingHour)
    { 
       this.company = company;
       this.empRatePerHour = empRatePerHour;
       this.maxWorkingDays = maxWorkingDays;
       this.maxWorkingHour = maxWorkingHour;      
  }

    public void computeDailyWage() 
  {
       int empHrs = 0;
       int workingHour = 0;
       int totalWorkingDay  = 0;

      while ( totalWorkingDay < maxWorkingDays || workingHour < maxWorkingHour)
    {
         totalWorkingDay++;
         int empTypeCheck  = (int) Math.floor(Math.random() * 10) % 3;
       
       switch (empTypeCheck) 
        {
              case IS_PART_TIME:
              empHrs = 4 ;
              break;
              case IS_FULL_TIME:
              empHrs = 8;
              break;
    default:
         empHrs = 0;
         } 
         workingHour += empHrs;
     
        } 
        totalEmpWage += empHrs * empRatePerHour ; 
   }
       public String toString() {
       return "Total emp wage for company: " +company+ " is: "+ totalEmpWage;
}
     public void  checkAttendance() 
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

    public static void main(String[] args)
  {
    
       EmployeeWageProblem dMart = new EmployeeWageProblem("DMart",30,2,10);
       dMart.checkAttendance();
       dMart.computeDailyWage();
       System.out.println(dMart);
       EmployeeWageProblem reliance = new EmployeeWageProblem("Reliance",40,4,10);
       reliance.checkAttendance();
       reliance.computeDailyWage();
       System.out.println(reliance); 

    }

}