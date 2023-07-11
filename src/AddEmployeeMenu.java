import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.GregorianCalendar;
import javax.swing.*;


public class AddEmployeeMenu extends JFrame{

    JButton createEmployeeButton;
    JButton cancelButton;
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
    JTextField salaryField;
    JTextField empIDField;
    JTextField firstNameField;
    JTextField lastNameField;
    JRadioButton maleGenderRadioButton;
    JRadioButton femaleGenderRadioButton;
    JTextField yearOfBirthField;
    JTextField monthOfBirthField;
    JTextField dayOfBirthField;
    ButtonGroup radioGroup;
    JComboBox positionComboBox;
    JComboBox departmentComboBox;
    private long empID;
    private String firstName;
    private String lastName;
    private char gender;
    private int year;
    private int month;
    private int day;
    private GregorianCalendar birthDate;
    private float salary;
    private position empPosition;
    private department empDepartment;
    boolean isMale;
    public boolean pageOff = false;


    public AddEmployeeMenu()
    {
        setLayout(new FlowLayout());
        createEmployeeButton = new JButton("Create Employee");
        cancelButton = new JButton("Cancel Employee");
        empIDLabel = new JLabel("EmployeeID:");
        firstNameLabel = new JLabel("enter first name:");
        lastNameLabel = new JLabel("enter last name");
        genderLabel = new JLabel("enter gender:");
        yearOfBirthLabel = new JLabel("enter year of birth:");
        monthOfBirthLabel = new JLabel("enter month of birth:");
        dayOfBirthLabel = new JLabel("Enter day of birth:");
        positionLabel = new JLabel("enter position:");
        departmentLabel = new JLabel("enter department");
        salaryLabel = new JLabel("Enter Salary:");


        empIDField = new JTextField(10);
        firstNameField = new JTextField(10);
        lastNameField = new JTextField(10);
        maleGenderRadioButton = new JRadioButton("male",false);
        femaleGenderRadioButton = new JRadioButton("female",false);
        radioGroup = new ButtonGroup();
        yearOfBirthField = new JTextField(10);
        monthOfBirthField = new JTextField(10);
        dayOfBirthField = new JTextField(10);
        salaryField = new JTextField(10);


        add(empIDLabel);
        add(empIDField);

        add(firstNameLabel);
        add(firstNameField);

        add(lastNameLabel);
        add(lastNameField);

        add(genderLabel);
        add(maleGenderRadioButton);
        add(femaleGenderRadioButton);
        radioGroup.add(maleGenderRadioButton);
        radioGroup.add(femaleGenderRadioButton);


        add(yearOfBirthLabel);
        add(yearOfBirthField);

        add(monthOfBirthLabel);
        add(monthOfBirthField);

        add(dayOfBirthLabel);
        add(dayOfBirthField);

        add(salaryLabel);
        add(salaryField);

        add(createEmployeeButton);
        add(cancelButton);




        TextFieldHandler textHandler = new TextFieldHandler();
        ButtonHandler buttonHandler = new ButtonHandler();

        empIDField.addActionListener(textHandler);
        firstNameField.addActionListener(textHandler);
        lastNameField.addActionListener ( textHandler );
        yearOfBirthField.addActionListener ( textHandler );
        monthOfBirthField.addActionListener ( textHandler );
        dayOfBirthField.addActionListener ( textHandler );
        salaryField.addActionListener(textHandler);


        createEmployeeButton.addActionListener(buttonHandler);
        cancelButton.addActionListener ( buttonHandler );
       // maleGenderRadioButton.addActionListener ( new RadioButtonHandler() );
       // femaleGenderRadioButton.addActionListener ( new RadioButtonHandler() );
        // comboBox stuff

        position positionList[] = {null,position.clerk,position.accountant,position.engineer,position.generalManager,position.manager,position.labor,position.mechanic,position.secretary,position.technician
        ,position.supervisor};

        department departmentList[] = {null,department.customerService,department.finance,department.marketing,department.production,department.storeAndPurchase};

        positionComboBox = new JComboBox(positionList);
        departmentComboBox = new JComboBox(departmentList);

        add(positionLabel);
        add(positionComboBox);
        add(departmentLabel);
        add(departmentComboBox);


        maleGenderRadioButton.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange() == ItemEvent.SELECTED)
                {
                    isMale = true;

                }

            }
            });




        femaleGenderRadioButton.addItemListener(new ItemListener()
        {
            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange() == ItemEvent.SELECTED)
                {
                    isMale = false;

                }

            }
        });







        positionComboBox.addItemListener( new ItemListener(){

            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange() == ItemEvent.SELECTED)
                {
                     int x=positionComboBox.getSelectedIndex ();// its supposed to be such that , when you select an item, you check the string with the actual values if they match, get the actual
                    empPosition= positionList[x];
                    // values and save them and put them into the list

                }

            }


        });

        departmentComboBox.addItemListener( new ItemListener(){

            public void itemStateChanged(ItemEvent event)
            {
                if(event.getStateChange() == ItemEvent.SELECTED)
                {
                    int x =departmentComboBox.getSelectedIndex();
                     empDepartment=  departmentList[x];


                }

            }


        });






    }




    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == createEmployeeButton)
            {
                try {
                    if (isMale)
                        gender = 'M';
                    else
                        gender = 'F';

                    Employee emp = new Employee ( empID, firstName, lastName, gender, year, month, day, salary, empDepartment, empPosition );
                   // emp.setEmpID(emp.getEmpID ()); // just to invoke the exception
                    EmployeeListMenu.employeeList.addEmployeeEnd ( emp );
                    AddEmployeeMenu.this.setVisible ( false );
                }
                catch(InvalidIDException exp)
                {



                }
                catch(ArrayIndexOutOfBoundsException exp)
                {
                    EmployeeListMenu.employeeList.expandArray(50);
                    JOptionPane.showMessageDialog(null,"Array expanded by 50, new list size:"+EmployeeListMenu.employeeList.maxSize);
                    AddEmployeeMenu.this.setVisible(false);
                }
               // System.exit(0);






            }

            if(event.getSource() == cancelButton)
            {
                AddEmployeeMenu.this.setVisible(false);
               // System.exit(0);

              //  EmployeeListMenu.this.setVisible(true);



            }

        }


    }

    private class TextFieldHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == empIDField)
            {
                empID=Long.parseLong(event.getActionCommand());


            }
            if(event.getSource() == firstNameField)
            {
                firstName = event.getActionCommand();


            }
            if(event.getSource() == lastNameField)
            {
                lastName = event.getActionCommand();
            }

            if(event.getSource() == yearOfBirthField)
            {
                year = Integer.parseInt(event.getActionCommand());

            }
            if(event.getSource() == monthOfBirthField)
            {
                month = Integer.parseInt(event.getActionCommand());

            }
            if(event.getSource() == dayOfBirthField)
            {
                day = Integer.parseInt(event.getActionCommand());
            }

            if(event.getSource() == salaryField)
            {
                salary = Float.parseFloat( event.getActionCommand());
            }


        }


    }







}
