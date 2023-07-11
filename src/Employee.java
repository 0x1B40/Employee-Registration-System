import javax.swing.*;
import java.util.Calendar;
import java.util.GregorianCalendar;


 enum department {

    production ( "Production" )
    , marketing ( "Marketing" )
    , storeAndPurchase ( "Store and Purchase" )
    , finance ( "Finance" )
    , customerService ( "Customer Service and Overall Management" );

    private String departmentName;

    department (String name) {

        this.departmentName = name;

    }

    public String getDepartment () {

        return this.departmentName;
    }

}

 enum position {


    accountant ( "Accountant" ),
    clerk ( "Clerk" ),
    engineer ( "Engineer" ),
    generalManager ( "General Manager" ),
    labor ( "Labor" ),
    manager ( "Manager" ),
    mechanic ( "Mechanic" ),
    secretary ( "secretary" ),
    supervisor ( "Supervisor" ),
    technician ( "Technician" );

    private String positionName;

    position (String name) {

        this.positionName = name;
    }

    public String getPosition () {

        return this.positionName;
    }


}



public class Employee {


    private long empID; // employee's ID is the the same as Employee's CPR;
    private String firstName;
    private String lastName;
    private char gender;
    //private GregorianCalendar birthDate;
    private int day;
    private int year;
    private int month;
    private float salary;






    department employeeDepartment;  // declaration of enum variable of type department in class Employee




    position employeePosition; // declaration of enum variable of type department in class Employee

// getters:

    long getEmpID () {
        return empID;
    }

    String getFirstName () {
        return firstName;

    }

    String getLastName () {

        return lastName;

    }

    char getGender () {
        return gender;

    }

    int getYear () {
        return year;
    }
    int getMonth () {
        return month;
    }
    int getDay () {
        return day;
    }

    float getSalary () {
        return salary;
    }

    department getDepartment () {
        return employeeDepartment;
    }

    position getPosition () {
        return employeePosition;
    }


    // setters:

    void setEmpID (long x) throws InvalidIDException //
    {
        try {
            if (x < 0)
                throw new InvalidIDException(x);
        }
        catch(InvalidIDException exception)
        {
            JOptionPane.showMessageDialog (null,"ID less than 0, Invalid ID!");
        }
        empID = x;
    }

    void setFirstName (String x) {
        firstName = x;

    }

    void setLastName (String x) {

        lastName = x;

    }

    void setGender (char x)            // throws invalid gender exception?
    {
        gender = x;

    }

    void setYear (int x) {
        year = x;
    }

    void setMonth (int x) {
        month = x;
    }
    void setDay (int x) {
        day = x;
    }

    void setSalary (float x) {
        salary = x;
    }

    void setDepartment (department x) {
        employeeDepartment = x;
    }

    void setPosition (position x) {
        employeePosition = x;
    }

    void printEmployee () {

        System.out.println ( empID );
        System.out.println ( firstName );
        System.out.println ( lastName );
        System.out.println ( gender );
        System.out.println ( year );
        System.out.println ( month );
        System.out.println ( day );
        System.out.println ( salary );
        System.out.println ( employeeDepartment.getDepartment() ); // I think it's correct now...
        System.out.println ( employeePosition.getPosition() ); // I think it's correct now...



    }

    Employee () {
        empID = 000000000; // invalididexception????
        firstName = " unknownEmployee";
        lastName = " unknownParentOfUnknownEmployee";
        gender = 'M';  // either "M or F" , case-insensitive preferably, throws exception if neither? its setter must throw exception too then...
        year = 1970;
        month = 4;
        day = 1;
        salary = 0.0f;
        employeeDepartment = department.marketing;
        employeePosition = position.clerk;


    }

    Employee (long ID, String FIRSTNAME, String LASTNAME, char GENDER, int YEAR,int MONTH,int DAY, float SALARY, department EMPLOYEEDEPARTMENT,
              position EMPLOYEEPOSITION) throws InvalidIDException // any other throws?
    {
try {
    if(ID <0)
        throw new InvalidIDException();
    empID = ID;
    firstName = FIRSTNAME;
    lastName = LASTNAME;
    gender = GENDER;
    year = YEAR;
    month = MONTH;
    day = DAY;
    salary = SALARY;
    employeeDepartment = EMPLOYEEDEPARTMENT;
    employeePosition = EMPLOYEEPOSITION;
}
catch(InvalidIDException exp)
{
    JOptionPane.showMessageDialog(null,"invalid ID");
    throw new InvalidIDException(exp);
    //System.exit(0);

}

    }


}
