import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.GregorianCalendar;
import javax.swing.*;

public class SearchEmployeeMenu extends JFrame {

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
    int z;


    public SearchEmployeeMenu(int x)
    {
        z=x;
        setLayout(new FlowLayout());
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

        add(homeButton);


        TextFieldHandler textHandler = new TextFieldHandler();
        ButtonHandler buttonHandler = new ButtonHandler();


        empIDField.addActionListener(textHandler);
        firstNameField.addActionListener(textHandler);
        lastNameField.addActionListener ( textHandler );
        yearOfBirthField.addActionListener ( textHandler );
        monthOfBirthField.addActionListener ( textHandler );
        dayOfBirthField.addActionListener ( textHandler );


        homeButton.addActionListener ( buttonHandler );


        size =  EmployeeListMenu.employeeList.getSize();
        index = 0;


        Employee emp =EmployeeListMenu.employeeList.searchByEmpID ( z);
        empID =emp.getEmpID ();
        firstName = emp.getFirstName ();
        lastName = emp.getLastName();
        year = emp.getYear();
        month = emp.getMonth();
        day = emp.getDay();
        gender = emp.getGender ();
        empPosition = emp.getPosition();
        empDepartment = emp.getDepartment ();



        empIDField.setText(String.valueOf(empID));
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





        positionField.setText(empPosition.getPosition ());
        positionField.setEditable(false);

        departmentField.setText(empDepartment.getDepartment ());
        departmentField.setEditable(false);




    }


    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
           //String str1 = JOptionPane.showInputDialog(null,"enter Employee ID");










            if(event.getSource() == homeButton)
            {
                SearchEmployeeMenu.this.setVisible(false);

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
