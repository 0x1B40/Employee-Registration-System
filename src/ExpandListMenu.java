import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.util.GregorianCalendar;
import javax.swing.*;


public class ExpandListMenu extends JFrame {

    JLabel listSizeLabel;
    JButton expandButton;
    JButton cancelButton;
    JTextField sizeField;
    int size;

    ExpandListMenu () {
        setLayout ( new FlowLayout () );
        listSizeLabel = new JLabel ( "Enter new List Size:" );
        expandButton = new JButton ( "Expand" );
        cancelButton = new JButton ( "Cancel" );
        sizeField = new JTextField ( 10 );

        TextFieldHandler textHandler = new TextFieldHandler ();
        ButtonHandler buttonHandler = new ButtonHandler ();


        expandButton.addActionListener ( buttonHandler );
        cancelButton.addActionListener ( buttonHandler );
        sizeField.addActionListener ( textHandler );

        add ( listSizeLabel );
        add ( sizeField );
        add ( expandButton );
        add ( cancelButton );


    }

    private class ButtonHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {

            if(event.getSource()==expandButton)
            {
                int x = EmployeeListMenu.employeeList.getSize();
                EmployeeListMenu.employeeList.expandArray (size+x );
                ExpandListMenu.this.setVisible ( false );


            }

            if(event.getSource() == cancelButton)
            {
                ExpandListMenu.this.setVisible ( false );

            }


        }


    }





    private class TextFieldHandler implements ActionListener
    {
        public void actionPerformed(ActionEvent event)
        {

            if(event.getSource() == sizeField)
            {
                size = Integer.parseInt(event.getActionCommand());

            }




        }


    }



}
