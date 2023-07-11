import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class EmployeeListFrame extends JFrame{
    JTextField employeeListSizeField;
    JLabel enterSizeLabel;
    JButton okButton;
    public int listSize;

    public EmployeeListFrame()
    {
        employeeListSizeField= new JTextField(15);
        enterSizeLabel = new JLabel("enter list size:");
        setLayout(new FlowLayout());
        okButton = new JButton("OK");

        add(enterSizeLabel);
        add(employeeListSizeField);
        add(okButton);

        ButtonHandler buttonHandler = new ButtonHandler();
        TextfieldHandler textfieldHandler = new TextfieldHandler();

        okButton.addActionListener(buttonHandler);
       employeeListSizeField.addActionListener(textfieldHandler);


    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {



            if(event.getSource() == okButton)
            { // go to another page: employeeListMenu








              //  EmployeeList employeeList = new EmployeeList ( listSize );
                EmployeeList employeeList = new EmployeeList(listSize);


               EmployeeListMenu newEmployeeListMenu = new EmployeeListMenu(employeeList);
                newEmployeeListMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newEmployeeListMenu.setSize(500,500);
                newEmployeeListMenu.setVisible(true);
                EmployeeListFrame.this.setVisible(false);






            }



        }

    }

    private class TextfieldHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            String listSizeString;
            if(event.getSource() == employeeListSizeField)
            {

                listSizeString = event.getActionCommand();

                listSize = Integer.parseInt(listSizeString);


            }



        }






    }

}
