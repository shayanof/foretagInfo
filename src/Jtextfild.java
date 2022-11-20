import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Jtextfild {




ComboBoxChauffor copyComboboxChauffor = new ComboBoxChauffor();


    JTextField chauforrInfoJtextfild= new JTextField();


     Jtextfild(){

         chauforrInfoJtextfild.setBounds(20,200,400,50);
         chauforrInfoJtextfild.setEditable(false);
         ChaufforPlatform.chaufforPanel.add(chauforrInfoJtextfild);



         ChaufforPlatform.show.setVisible(true);

         ChaufforPlatform.show.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {

                 chauforrInfoJtextfild.setText(copyComboboxChauffor.catchedNameString+ " Behörighet: "+ copyComboboxChauffor.chauforrBehorighet[copyComboboxChauffor.catchedNameInt] );
                 ChaufforPlatform.editChauforrInfoButton.setVisible(true);
             }
         });

    }
}
