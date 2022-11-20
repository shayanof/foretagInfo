import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxChauffor {

    String[] chauforrNamn ={"klicka för välja namn","Shayan","Daniel","Alexander","Remus","Maivand"};
    String[] chauforrBehorighet = new String[chauforrNamn.length];

     JComboBox chauforrComboBox =new JComboBox(chauforrNamn);

Main copyMain=new Main();

    public static String catchedNameString;
    public static  int catchedNameInt;

    ComboBoxChauffor(){


     ChaufforPlatform.chaufforPanel.add(chauforrComboBox);
     chauforrComboBox.setBounds(20,100,200,50);
     ChaufforPlatform.bakButton.getAction();



   chauforrComboBox.addActionListener(new ActionListener() {
       @Override
       public void actionPerformed(ActionEvent e) {
           ChaufforPlatform.editChauforrInfoButton.setVisible(false);
            catchedNameString= (String) chauforrComboBox.getSelectedItem();
            catchedNameInt = chauforrComboBox.getSelectedIndex();


           new Jtextfild();













       }
   });

    }



}