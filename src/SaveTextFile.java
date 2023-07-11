import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.io.File;
import java.util.*;
import java.lang.SecurityException;
import java.io.FileNotFoundException;

public class SaveTextFile {

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
    private Formatter output;
    int size;

    public void openFile(String fileName)
    {

        try{
            output = new Formatter((fileName));
        }

        catch(SecurityException exception)
        {
            System.err.println("error opening or creating file");
            System.exit(1);
        }
        catch(FileNotFoundException exception)
        {
            JOptionPane.showMessageDialog ( null,"error opening file or creating it!" );
            System.exit(1);

        }

    }

    public void outputRecords()
    {

       size = EmployeeListMenu.employeeList.getSize();

       for(int i =0;i<size;i++)
       {
           empID =EmployeeListMenu.employeeList.list[i].getEmpID();
           firstName =EmployeeListMenu.employeeList.list[i].getFirstName();
           lastName =EmployeeListMenu.employeeList.list[i].getLastName();
           gender =EmployeeListMenu.employeeList.list[i].getGender();
           year =EmployeeListMenu.employeeList.list[i].getYear();
           month =EmployeeListMenu.employeeList.list[i].getMonth();
           day =EmployeeListMenu.employeeList.list[i].getDay();
           salary =EmployeeListMenu.employeeList.list[i].getSalary ();
           employeeDepartment =EmployeeListMenu.employeeList.list[i].getDepartment();
           employeePosition =EmployeeListMenu.employeeList.list[i].getPosition();
           output.format("%d",empID);
           output.format ( "%s","\t" );
           output.format("%s",firstName);
           output.format ( "%s","\t" );
           output.format("%s",lastName);
           output.format ( "%s","\t" );
           output.format("%s",gender);
           output.format ( "%s","\t" );
           output.format("%d",year);
           output.format ( "%s","\t" );
           output.format("%d",month);
           output.format ( "%s","\t" );
           output.format("%d",day);
           output.format ( "%s","\t" );
           output.format("%2f",salary);
           output.format ( "%s","\t" );
           output.format("%s",employeeDepartment.getDepartment ());
           output.format ( "%s","\t" );
           output.format("%s",employeePosition.getPosition ());
           output.format ( "%s","\n" );
       }

    }

    public void closeFile()
    {
        if(output!=null)
        {output.close();}

    }


}
