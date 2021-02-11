/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package csci132_framemousebutton;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Hunter Lloyd
 */
public class ButtonPanel extends JPanel implements ActionListener {

    public static ButtonPanel inst;
    private JButton myButton;

    ButtonPanel()
    {
        setBackground(Color.YELLOW);
        myButton = new JButton("Do Not Click Me");
        myButton.addActionListener(this);
        add(myButton);

    }
     public static ButtonPanel getInstance()
    {
        if(inst == null)
           inst =  new ButtonPanel();
        return inst;
    }

     public void actionPerformed(ActionEvent ae)
     {
         System.out.println(ae.getActionCommand());
         MousePanel.getInstance().repaint();
     }
}

