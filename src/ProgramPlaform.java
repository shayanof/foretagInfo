import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProgramPlaform {

public  static JFrame programPlatformFrame =new JFrame("MAFFTEC");
JPanel chaufforPanel = new JPanel();
JButton chaufforButton = new JButton("chauffor");
JPanel bilarPanel = new JPanel();
JButton bilarButton =new JButton("    bilar    ");

public ProgramPlaform(){
    programPlatformFrame.setLayout(null);
    programPlatformFrame.setResizable(false);
    programPlatformFrame.setSize(500,500);
    programPlatformFrame.setVisible(true);
    programPlatformFrame.add(chaufforPanel,"West");
    programPlatformFrame.add(bilarPanel,"East");
    bilarPanel.setBounds(250,0,250,250);
    chaufforPanel.setBounds(0,0,250,250);

    chaufforPanel.add(chaufforButton);
    bilarPanel.add(bilarButton);


    bilarButton.setBounds(0,0,100,100);

    chaufforButton.setBounds(100,0,100,100);
    //**********************************//----------------------*******************************************//

    chaufforButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new ChaufforPlatform();
            programPlatformFrame.setVisible(false);
        }

    });
    bilarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            new BilarPlatform();
            programPlatformFrame.setVisible(false);


        }
    });


}

}
