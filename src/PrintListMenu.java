import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.GregorianCalendar;
import javax.swing.*;

public class PrintListMenu extends JFrame {

    JButton nextEmployeeButton;
    JButton homeButton;
    JLabel empIDLabel;
    JLabel firstNameLabel;
    JLabel lastNameLabel;
    JLabel genderLabel;
    JLabel yearOfBirthLabel;
    JLabel monthOfBirthLabel;
    JLabel dayOfBirthLabel;
    JLabel positionLabel;
    JLabel departmentLabel;
    JLabel salaryLabel;

    JTextField empIDField;
    JTextField firstNameField;
    JTextField lastNameField;
    JTextField genderField;
    JTextField yearOfBirthField;
    JTextField monthOfBirthField;
    JTextField dayOfBirthField;
    JTextField positionField;
    JTextField departmentField;
    JTextField salaryField;


    private long empID; // employee's ID is the the same as Employee's CPR;
    private String firstName;
    private String lastName;
    private char gender;
    private GregorianCalendar birthDate;
    private int year,month,day;
    private float salary;
    private position empPosition;
    private department empDepartment;
    int size;
    int index;


    public PrintListMenu()
    {
        setLayout(new FlowLayout());
        nextEmployeeButton = new JButton("Next");
        homeButton = new JButton("Home");

        empIDLabel = new JLabel("EmployeeID:");
        firstNameLabel = new JLabel("first name:");
        lastNameLabel = new JLabel("last name");
        genderLabel = new JLabel("gender:");
        yearOfBirthLabel = new JLabel("year of birth:");
        monthOfBirthLabel = new JLabel("month of birth:");
        dayOfBirthLabel = new JLabel("day of birth:");
        positionLabel = new JLabel("position:");
        departmentLabel = new JLabel("Department:");
        salaryLabel= new JLabel("Salary:");


        empIDField = new JTextField(30);
        firstNameField = new JTextField(30);
        lastNameField = new JTextField(30);
        genderField = new JTextField(30);
        yearOfBirthField = new JTextField(30);
        monthOfBirthField = new JTextField(30);
        dayOfBirthField = new JTextField(30);
        departmentField = new JTextField(30);
        positionField = new JTextField(30);
        salaryField = new JTextField(30);


        add(empIDLabel);
        add(empIDField);

        add(firstNameLabel);
        add(firstNameField);

        add(lastNameLabel);
        add(lastNameField);

        add(genderLabel);
        add(genderField);

        add(salaryLabel);
        add(salaryField);



        add(yearOfBirthLabel);
        add(yearOfBirthField);

        add(monthOfBirthLabel);
        add(monthOfBirthField);

        add(dayOfBirthLabel);
        add(dayOfBirthField);

        add(departmentLabel);
        add(departmentField);

        add(positionLabel);
        add(positionField);

        add(nextEmployeeButton);
        add(homeButton);


        TextFieldHandler textHandler = new TextFieldHandler();
        ButtonHandler buttonHandler = new ButtonHandler();


        empIDField.addActionListener(textHandler);
        firstNameField.addActionListener(textHandler);
        lastNameField.addActionListener ( textHandler );
        yearOfBirthField.addActionListener ( textHandler );
        monthOfBirthField.addActionListener ( textHandler );
        dayOfBirthField.addActionListener ( textHandler );

        nextEmployeeButton.addActionListener(buttonHandler);
        homeButton.addActionListener ( buttonHandler );


        size =  EmployeeListMenu.employeeList.getSize();
         index = 0;



    }


    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == nextEmployeeButton)
            {

               // EmployeeListMenu.employeeList.sortByEmpID ();

                if(index<size) {


                    empID = EmployeeListMenu.employeeList.list[index].getEmpID();
                    System.out.println(empID);
                    firstName = EmployeeListMenu.employeeList.list[index].getFirstName();
                   // System.out.println(firstName);
                    lastName = EmployeeListMenu.employeeList.list[index].getLastName();
                   // System.out.println(lastName);
                    gender = EmployeeListMenu.employeeList.list[index].getGender();
                   // System.out.println(gender);
                    year = EmployeeListMenu.employeeList.list[index].getYear ();
                    month = EmployeeListMenu.employeeList.list[index].getMonth();
                    day = EmployeeListMenu.employeeList.list[index].getDay();
                   // System.out.println(birthDate);
                    empPosition = EmployeeListMenu.employeeList.list[index].getPosition ();
                    System.out.println(empPosition);
                    empDepartment = EmployeeListMenu.employeeList.list[index].getDepartment ();
                    System.out.println(empDepartment);
                    salary = EmployeeListMenu.employeeList.list[index].getSalary();
                   // System.out.println(salary);
                    String string1;
                    string1 = String.valueOf(empID);

                    empIDField.setText(string1);
                    empIDField.setEditable(false);

                    firstNameField.setText(firstName);
                    firstNameField.setEditable(false);

                    lastNameField.setText(lastName);
                    lastNameField.setEditable(false);

                    yearOfBirthField.setText(String.valueOf(year));
                    yearOfBirthField.setEditable ( false );

                    monthOfBirthField.setText(String.valueOf(month));
                    monthOfBirthField.setEditable ( false );


                    dayOfBirthField.setText(String.valueOf(day));
                    dayOfBirthField.setEditable ( false );


                    genderField.setText(String.valueOf(gender));
                    genderField.setEditable(false);

                    salaryField.setText(String.valueOf(salary));
                    salaryField.setEditable(false);




                   // yearOfBirthField.setText(birthDate.);
                    yearOfBirthField.setEditable(false);

                  positionField.setText(empPosition.getPosition ());
                   positionField.setEditable(false);

                  departmentField.setText(empDepartment.getDepartment ());
                 departmentField.setEditable(false);




                    index++;
                }

            }

            if(event.getSource() == homeButton)
            {
                PrintListMenu.this.setVisible(false);

            }

        }


    }

    private class TextFieldHandler implements ActionListener
    {
        // when the user clicks on printList, or nextList, the fields sources get filled with values from the employeeList
        public void actionPerformed(ActionEvent event)
        {



        }


    }






}
