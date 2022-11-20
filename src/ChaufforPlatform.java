import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ChaufforPlatform  {


    public static JPanel chaufforPanel=new JPanel();
    public static JButton bakButton = new JButton(" Gå till bak");

    public static JButton show=new JButton("visa");


    public static JButton editChauforrInfoButton = new JButton("Ändra chauförrens information");
    public static JFrame chaufforFrame;
    public  ChaufforPlatform(){


         chaufforFrame=new JFrame("Chuförr Information");
        chaufforFrame.setSize(500,500);
        chaufforFrame.setVisible(true);
         chaufforFrame.setResizable(false);
        chaufforFrame.setLocation(ProgramPlaform.programPlatformFrame.getLocationOnScreen());


        chaufforPanel.setLayout(null);
        chaufforFrame.add(chaufforPanel);

        show.setBounds(250,100,70,30);
        show.setVisible(false);
        chaufforPanel.add(show);


        JButton chaufforInfoButton = new JButton("Chaufför Information");
        chaufforInfoButton.setBounds(0,0,200,50);
        chaufforPanel.add(chaufforInfoButton);


        editChauforrInfoButton.setBounds(0,300,200,50);
        editChauforrInfoButton.setVisible(false);
        chaufforPanel.add(editChauforrInfoButton);


        bakButton.setBounds(0,400,100,50);
        chaufforPanel.add(bakButton);




      chaufforInfoButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
              new ComboBoxChauffor();

          }
      });

      editChauforrInfoButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
             chaufforFrame.setVisible(false);
              new EditChauffor();

          }
      });



        bakButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            Jtextfild copyJtextfild =new Jtextfild();
            copyJtextfild.chauforrInfoJtextfild.setText(null);
                ProgramPlaform.programPlatformFrame.setVisible(true);
                chaufforFrame.setVisible(false);
            }
        });


    }






}
