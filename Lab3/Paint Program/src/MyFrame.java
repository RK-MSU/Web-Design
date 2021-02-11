package csci132_framemousebutton;



import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Hunter Lloyd
 */
public class MyFrame extends JFrame {

     public static MyFrame inst;

    MyFrame( )
    {
        super("MainFrame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        
        c.add(ButtonPanel.getInstance(), BorderLayout.SOUTH);
        getContentPane().add(MousePanel.getInsets(), BorderLayout.CENTER);
        setSize(500, 500);
        setVisible(true);
    }
    public static MyFrame getInstance()
    {
        if(inst == null)
           inst = new MyFrame();
       
         return inst;
    }


}
