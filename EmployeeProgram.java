// Oluwadamilola Adeyemo
// ID: 2021-08-0281 - Period 5

public class EmployeeProgram 
{
   public static void main(String[] args) // Executes methods.
   {
   
      String heading1 = "Name";
      String heading2 = "ID Number";
      String heading3 = "Department";
      String heading4 = "Position";
      String heading5 = "Annual Salary";
   
      System.out.println("starting");
     
      Employee employeeOne, employeeTwo, employeeThree, employeeFour, employeeFive;
      Employee employeeSix, employeeSeven, employeeEight, employeeNine, employeeTen;
     
     
      employeeOne = new Employee("Susan Meyers", 47899, "Accounting", " President",85000);
      employeeTwo = new Employee("Bob Smith", 56789, "Accounting", "Vice President", 75000);
      employeeThree = new Employee("Mark Jones", 39119, "IT", "Executive manager", 75000);
      employeeFour = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer",66000 );
      employeeFive = new Employee("Mary McMath", 34567, "Marketing", "Manager", 66000);
      employeeSix = new Employee("John Gail", 23677, "Marketing", "Assistant Manager",54000);
      employeeSeven = new Employee("Kim Lee", 45997, "Cleaning", "Head", 40000);
      employeeEight = new Employee("Van Minx", 65545, "IT", "Programmer", 66000);
      employeeNine = new Employee("Sylvia Benjamin", 87654, "IT", "Programmer", 67000);;
      employeeTen = new Employee("Frans Kelenuoh", 34001, "Accounting", "Accounter", 70000);;
   
      System.out.printf("\n%-16s %-19s %-19s %-18s %-19s\n", heading1, heading2, heading3, heading4, heading5);
      System.out.println("--------------------------------------------------------------------------------------------");
      System.out.println();
   
   
   
      // Output for EmployeeOne.
      System.out.printf("%-19s", employeeOne.getName());
      System.out.printf("%-19s", employeeOne.getIdNumber());
      System.out.printf("%-19s", employeeOne.getDepartment());
      System.out.printf("%-19s", employeeOne.getPosition());
      System.out.printf("$%.2f", employeeOne.getAnnualSalary());
      System.out.println();
   
         
      // Output for EmployeeTwo.    
      System.out.printf("%-19s", employeeTwo.getName());
      System.out.printf("%-19s", employeeTwo.getIdNumber());
      System.out.printf("%-19s", employeeTwo.getDepartment());
      System.out.printf("%-19s", employeeTwo.getPosition());
      System.out.printf("$%.2f", employeeTwo.getAnnualSalary());
      System.out.println();
    
           
      // Output for EmployeeThree.                    
      System.out.printf("%-19s", employeeThree.getName());
      System.out.printf("%-19s", employeeThree.getIdNumber());
      System.out.printf("%-19s", employeeThree.getDepartment());
      System.out.printf("%-19s", employeeThree.getPosition());
      System.out.printf("$%.2f", employeeThree.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeFour.                    
      System.out.printf("%-19s", employeeFour.getName());
      System.out.printf("%-19s", employeeFour.getIdNumber());
      System.out.printf("%-19s", employeeFour.getDepartment());
      System.out.printf("%-19s", employeeFour.getPosition());
      System.out.printf("$%.2f", employeeFour.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeFive.                    
      System.out.printf("%-19s", employeeFive.getName());
      System.out.printf("%-19s", employeeFive.getIdNumber());
      System.out.printf("%-19s", employeeFive.getDepartment());
      System.out.printf("%-19s", employeeFive.getPosition());
      System.out.printf("$%.2f", employeeFive.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeSix.                    
      System.out.printf("%-19s", employeeSix.getName());
      System.out.printf("%-19s", employeeSix.getIdNumber());
      System.out.printf("%-19s", employeeSix.getDepartment());
      System.out.printf("%-19s", employeeSix.getPosition());
      System.out.printf("$%.2f", employeeSix.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeSeven.                    
      System.out.printf("%-19s", employeeSeven.getName());
      System.out.printf("%-19s", employeeSeven.getIdNumber());
      System.out.printf("%-19s", employeeSeven.getDepartment());
      System.out.printf("%-19s", employeeSeven.getPosition());
      System.out.printf("$%.2f", employeeSeven.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeEight.                    
      System.out.printf("%-19s", employeeEight.getName());
      System.out.printf("%-19s", employeeEight.getIdNumber());
      System.out.printf("%-19s", employeeEight.getDepartment());
      System.out.printf("%-19s", employeeEight.getPosition());
      System.out.printf("$%.2f", employeeEight.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeNine.                    
      System.out.printf("%-19s", employeeNine.getName());
      System.out.printf("%-19s", employeeNine.getIdNumber());
      System.out.printf("%-19s", employeeNine.getDepartment());
      System.out.printf("%-19s", employeeNine.getPosition());
      System.out.printf("$%.2f", employeeNine.getAnnualSalary());
      System.out.println();
   
   
      // Output for EmployeeTen.                    
      System.out.printf("%-19s", employeeTen.getName());
      System.out.printf("%-19s", employeeTen.getIdNumber());
      System.out.printf("%-19s", employeeTen.getDepartment());
      System.out.printf("%-19s", employeeTen.getPosition());
      System.out.printf("$%.2f", employeeTen.getAnnualSalary());
      System.out.println();
       
      System.out.println("\nend");   
   }
}