import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.*;



public class DeleteEmployeeMenu extends JFrame{


    JLabel enterEmployeeID;
    JTextField deleteEmployeeID;

    JButton deleteButton;
    JButton cancelButton;
    long deleteID;
    Employee emp;

    public DeleteEmployeeMenu()
    {
        enterEmployeeID = new JLabel("enter employee's ID:");
        deleteEmployeeID = new JTextField(10);
        deleteButton = new JButton("Delete");
        cancelButton = new JButton("Cancel");
        setLayout(new FlowLayout());



        ButtonHandler buttonHandler = new ButtonHandler();
        TextFieldHandler textHandler = new TextFieldHandler();

        deleteEmployeeID.addActionListener(textHandler);
        deleteButton.addActionListener(buttonHandler);
        cancelButton.addActionListener(buttonHandler);

        add(enterEmployeeID);
        add(deleteEmployeeID);
        add(deleteButton);
        add(cancelButton);




    }

    private class TextFieldHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == deleteEmployeeID)
            {
                deleteID = Long.parseLong( event.getActionCommand()); //throws exception

              // store the employeeID in a variable

            }




        }



    }

    private class ButtonHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == deleteButton)
            {


                EmployeeListMenu.employeeList.deleteEmployee ( deleteID );
                DeleteEmployeeMenu.this.setVisible(false);
                // invoke search method and enter deleteID
                // invoke Delete method and enter employee as paramater

            }


            if(event.getSource() == cancelButton)
            {
                DeleteEmployeeMenu.this.setVisible(false);

            }


        }


    }


}
