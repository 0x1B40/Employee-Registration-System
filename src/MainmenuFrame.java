import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.*;
import java.lang.SecurityException;
import java.io.FileNotFoundException;


public class MainmenuFrame extends JFrame {



    private JButton uploadListButton;
    private JButton createListButton;
    public boolean allowOtherFrame = true;

    public MainmenuFrame()
    {

        super("Main Menu");
        setLayout(new FlowLayout());
        uploadListButton = new JButton("Upload List");
        createListButton = new JButton("Create List");
        add(uploadListButton);
        add(createListButton);
        ButtonHandler handler = new ButtonHandler();
        uploadListButton.addActionListener(handler);
        createListButton.addActionListener(handler);



    }

    private class ButtonHandler implements ActionListener
    {

        public void actionPerformed(ActionEvent event)
        {
            if(event.getSource() == uploadListButton)
            {
                String fileName;
                fileName =JOptionPane.showInputDialog("enter text file name:");
                EmployeeList employeeList = new EmployeeList(fileName);


                MainmenuFrame.this.setVisible(false);


            }
            if(event.getSource() == createListButton)
            {
                // create new employeeList, pop up new window, ask the user to enter the list size
               // EmployeeList employeeList1;

                EmployeeListFrame newEmployeeListFrame = new EmployeeListFrame();
                newEmployeeListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                newEmployeeListFrame.setSize(500,500);
                newEmployeeListFrame.setVisible(true);
                MainmenuFrame.this.setVisible(false);





               // mainmenuFrame.setVisible(true);

            }


        }


    }


}
