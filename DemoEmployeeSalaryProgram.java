//import the respective packages
import java.io.*;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class DemoEmployeeSalaryProgram
{
    public static void main(String[]args) throws IOException
    {
        try
        {
            BufferedReader inputFile = new BufferedReader(
                    new FileReader(".txt"));

            PrintWriter topPerformingEmployee = new PrintWriter(
                    new FileWriter("topPerformingEmployee.txt"));
            PrintWriter leastYearEmployee = new PrintWriter(
                    new FileWriter("leastYearEmployee.txt"));

            String inputData = null;
            String name;
            double salary,yearsOfService,annualSalary;

            topPerformingEmployee.println("list of top performing employee");
            topPerformingEmployee.println("\nname\t\tannualSalary");
            topPerformingEmployee.println("-----------------------------------------");

            leastYearEmployee.println("least of employee with least year of service");
            leastYearEmployee.println("\nname\t\tsalary\tyearOfService");
            leastYearEmployee.println("--------------------------------------");

            while((inputData = inputFile.readLine()) !=null )
            {
                StringTokenizer sT = new StringTokenizer(inputData,"|");
                name = sT.nextToken();
                salary = Double.parseDouble(sT.nextToken());
                yearsOfService = Double.parseDouble(sT.nextToken());
                annualSalary = salary + 5/100*salary;

                if(annualSalary > 7000)
                {
                    topPerformingEmployee.println(name+"\t\t"+annualSalary);
                }
                else if(yearsOfService == 1)
                {
                    leastYearEmployee.println(name+"\t\t"+leastYearEmployee);
                }

                inputFile.close();
                topPerformingEmployee.close();
                leastYearEmployee.close();
            }
        }
            catch(FileNotFoundException ex)
            {
            String output="File not found";
            JOptionPane.showMessageDialog(null, output);
        

            
    }
}
}

