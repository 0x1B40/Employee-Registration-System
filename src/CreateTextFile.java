import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.*;
import java.lang.SecurityException;
import java.io.FileNotFoundException;
public class CreateTextFile {

    private Scanner input;
    private long empID; // employee's ID is the the same as Employee's CPR;
    private String firstName;
    private String lastName;
    private char gender;
    //private GregorianCalendar birthDate;
    private int day;
    private int year;
    private int month;
    private float salary;
    department employeeDepartment;
    String employeeDepartmentString;
    position employeePosition;
    String employeePositionString;


    public void openFile(String fileName)
    {

        try{
            input = new Scanner(new File(fileName));
        }

        catch(FileNotFoundException fileNotFoundException)
        {
            System.err.println("error opening or creating file");
            System.exit(1);
        }

    }

    public void addRecords() throws ArrayIndexOutOfBoundsException
    {
        EmployeeListMenu.employeeList = new EmployeeList(30);
        Employee emp;
       // Scanner input = new Scanner(System.in);


        while(input.hasNext()) {
            try {
                empID = input.nextLong ();
                firstName = input.next ();
                lastName = input.next ();
                gender = input.next ().charAt ( 0 );
                year = input.nextInt ();
                month = input.nextInt ();
                day = input.nextInt ();



                salary = input.nextFloat();
                employeeDepartmentString = input.next ();
                employeePositionString = input.next ();
                if (employeeDepartmentString.equalsIgnoreCase( "marketing" )) {
                    employeeDepartment = department.marketing;
                }
                if (employeeDepartmentString.equalsIgnoreCase (   "customerService")) {
                    employeeDepartment = department.customerService;
                }
                if (employeeDepartmentString.equalsIgnoreCase (  "finance") ) {
                    employeeDepartment = department.finance;
                }
                if (employeeDepartmentString.equalsIgnoreCase (   "production")) {
                    employeeDepartment = department.production;
                }
                if (employeeDepartmentString.equalsIgnoreCase (  "storeAndPurchase")) {
                    employeeDepartment = department.storeAndPurchase;
                }

                if (employeePositionString.equalsIgnoreCase (  "clerk") ) {
                    employeePosition = position.clerk;
                }
                if (employeePositionString.equalsIgnoreCase( "accountant")) {
                    employeePosition = position.accountant;
                }
                if (employeePositionString.equalsIgnoreCase (  "engineer") ) {
                    employeePosition = position.engineer;
                }
                if (employeePositionString.equalsIgnoreCase( "generalManager")) {
                    employeePosition = position.generalManager;
                }
                if (employeePositionString.equalsIgnoreCase( "labor")) {
                    employeePosition = position.labor;
                }
                if (employeePositionString .equalsIgnoreCase ( "manager") ){
                    employeePosition = position.manager;
                }
                if (employeePositionString.equals (  "mechanic") ) {
                    employeePosition = position.mechanic;
                }
                if (employeePositionString .equalsIgnoreCase( "secretary")) {
                    employeePosition = position.secretary;
                }
                if (employeePositionString .equalsIgnoreCase( "supervisor")) {
                    employeePosition = position.supervisor;
                }

                if (employeePositionString .equalsIgnoreCase (  "technician") ) {
                    employeePosition = position.technician;
                }


try {
    emp = new Employee ( empID, firstName, lastName, gender, year, month, day, salary, employeeDepartment, employeePosition );
    EmployeeListMenu.employeeList.addEmployeeEnd ( emp );
}
catch(InvalidIDException exp)
{
    //JOptionPane.showMessageDialog ( null,"Invalid ID " );
}
//catch(ArrayIndexOutOfBoundsException exp)
//{
//    System.out.println("you are here");
//}
//



            } catch (FormatterClosedException formatterClosedException) {
                System.err.println ( "error writing to file" );
                System.exit(1);
            } catch (IllegalStateException illegalStateException) {
                System.err.println ( "Invalid input. Try again" );
                System.exit(1);

            }
            catch(NoSuchElementException exp)
            {
                JOptionPane.showMessageDialog(null,"some elements are in wrong format");
                System.exit(1);
            }
        }

        }

        public void closeFile()
        {
            if(input!=null)
            {
                EmployeeListMenu.employeeList.printList();
                EmployeeListMenu newEmployeeListMenu = new EmployeeListMenu(EmployeeListMenu.employeeList);
                newEmployeeListMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newEmployeeListMenu.setSize(500,500);
                newEmployeeListMenu.setVisible(true);
                input.close();
            }
        }


    }

