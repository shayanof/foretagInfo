import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class BilarPlatform {




    public BilarPlatform(){


       JFrame bilarFrame =  new JFrame();
       bilarFrame.setSize(500,500);
       bilarFrame.setVisible(true);
       bilarFrame.setResizable(false);
       bilarFrame.setLocation(ProgramPlaform.programPlatformFrame.getLocationOnScreen());

       JPanel bilarPanel=new JPanel();
       bilarPanel.setLayout(null);
       bilarFrame.add(bilarPanel);

        JButton bakButton = new JButton(" Gå till bak");
        bakButton.setBounds(0,400,100,50);
        bilarPanel.add(bakButton);




        bakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bilarFrame.setVisible(false);
                ProgramPlaform.programPlatformFrame.setVisible(true);

            }
        });



    }
}
