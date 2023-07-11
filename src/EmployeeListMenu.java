import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class EmployeeListMenu extends JFrame {
    JButton addEmployeeButton;
    //JButton addEmployeeAt; // at the add employee menu
    JButton deleteEmployee;
    //JButton deleteEmployeeAt; // at the delete employee menu
    JButton updateRecord;
    JButton searchEmployee;
    JButton isEmpty;
    JButton expandList;
    JButton printList;
    JButton saveAndExit;
    JButton searchEmp;
    JButton printSortedList;
   // EmployeeList employeeList;
    public static EmployeeList employeeList;


    public EmployeeListMenu(EmployeeList empList)
    {

        employeeList = new EmployeeList();
        employeeList = empList;
        setLayout(new FlowLayout());
        addEmployeeButton = new JButton("Add Employee");
        deleteEmployee = new JButton("delete Employee");
        updateRecord = new JButton("update record"); // we'll do last
       // searchEmployee = new JButton("Search Employee");
       isEmpty = new JButton("Check list emptiness");// we'll do here
        expandList = new JButton("Expand List"); // we'll do here
        printList = new JButton("Print List");
        saveAndExit = new JButton("Save and Exit");
        searchEmp = new JButton("search employee");
        printSortedList = new JButton("Print Sorted List");





        ButtonHandler handler = new ButtonHandler();
        saveAndExit.addActionListener(handler);
        searchEmp.addActionListener(handler);
        printSortedList.addActionListener(handler);

        addEmployeeButton.addActionListener(handler);
        deleteEmployee.addActionListener(handler);
        updateRecord.addActionListener(handler);
        //searchEmployee.addActionListener(handler);
        isEmpty.addActionListener(handler);
        expandList.addActionListener(handler);
        printList.addActionListener(handler);

        add(addEmployeeButton);
        add(deleteEmployee);
        add(updateRecord);
        add(isEmpty);
        add(expandList);
        add(printList);
        add(saveAndExit);
        add(searchEmp);
        add(printSortedList);





    }
//    public EmployeeListMenu()
//    {
//
//        employeeList = new EmployeeList();
//        setLayout(new FlowLayout());
//        addEmployeeButton = new JButton("Add Employee");
//        deleteEmployee = new JButton("delete Employee");
//        updateRecord = new JButton("update record"); // we'll do last
//        // searchEmployee = new JButton("Search Employee");
//        isEmpty = new JButton("Check list emptiness");// we'll do here
//        expandList = new JButton("Expand List"); // we'll do here
//        printList = new JButton("Print List");
//
//        ButtonHandler handler = new ButtonHandler();
//
//        addEmployeeButton.addActionListener(handler);
//        deleteEmployee.addActionListener(handler);
//        updateRecord.addActionListener(handler);
//        //searchEmployee.addActionListener(handler);
//        isEmpty.addActionListener(handler);
//        expandList.addActionListener(handler);
//        printList.addActionListener(handler);
//
//        add(addEmployeeButton);
//        add(deleteEmployee);
//        add(updateRecord);
//        add(isEmpty);
//        add(expandList);
//        add(printList);
//
//
//
//
//
//    }
    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == addEmployeeButton)
            {
                // navigate to add employee page
             //   EmployeeListMenu.this.setVisible(false);
                AddEmployeeMenu addEmployeeMenu = new AddEmployeeMenu();
                addEmployeeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                addEmployeeMenu.setSize(500,500);
                addEmployeeMenu.setVisible(true);
             //   if(addEmployeeMenu.pageOff)
               //     EmployeeListMenu.this.setVisible(true);


            }

            if(event.getSource() == deleteEmployee)
            {
                // navigate to delete employee page
              //  EmployeeListMenu.this.setVisible(false);
                DeleteEmployeeMenu deleteEmployeeMenu = new DeleteEmployeeMenu();
                deleteEmployeeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                deleteEmployeeMenu.setSize(500,500);
                deleteEmployeeMenu.setVisible(true);

            }

            if(event.getSource() == updateRecord)
            {
                // navigate to updateRecord page

                UpdateRecordsMenu updateRecordsMenu = new UpdateRecordsMenu();
                updateRecordsMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                updateRecordsMenu.setSize(500,500);
                updateRecordsMenu.setVisible(true);


            }

//            if(event.getSource() == searchEmployee)
//            {
//                // navigate to searchEmployee page
//
//            }

            if(event.getSource() ==isEmpty)
            {

                JOptionPane.showMessageDialog(null,employeeList.isEmpty ());

            }

            if(event.getSource() == expandList)
            {
                ExpandListMenu expandListMenu = new ExpandListMenu();
                expandListMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                expandListMenu.setSize(500,500);
                expandListMenu.setVisible(true);
                // navigate to expandList page

            }
            if(event.getSource() ==printList)
            {
                // navigate to printList page
              //  EmployeeListMenu.this.setVisible(false);
                PrintListMenu printListMenu = new PrintListMenu();
                printListMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                printListMenu.setSize(500,500);
                printListMenu.setVisible(true);

            }

            if(event.getSource() == saveAndExit)
            {
                String fileName;
                SaveTextFile textFile = new SaveTextFile();
                fileName =JOptionPane.showInputDialog("Enter file name:");
                textFile.openFile(fileName);
                textFile.outputRecords ();
                textFile.closeFile();
                System.exit(1);


            }

            if(event.getSource()==searchEmp)
            {
                String x =JOptionPane.showInputDialog ( "enter employee ID:" );

              int y =  Integer.parseInt(x);

                SearchEmployeeMenu searchEmployeeMenu = new SearchEmployeeMenu(y);
                searchEmployeeMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                searchEmployeeMenu.setSize(500,500);
                searchEmployeeMenu.setVisible(true);

            }

            if(event.getSource() == printSortedList)
            {
                SortEmployee sortEmployee = new SortEmployee();
                sortEmployee.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                sortEmployee.setSize(500,500);
                sortEmployee.setVisible(true);

            }
        }

    }

}
