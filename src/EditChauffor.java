import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EditChauffor {

    EditChauffor(){
        JFrame f= new JFrame("Edit chauforr");
        f.setSize(400,400);

        JLabel l1,l2;
        l1=new JLabel("Namn");
        l1.setBounds(10,0, 50,30);
        l2=new JLabel(" Behörighet");
        l2.setBounds(300,0, 100,30);
        f.add(l1); f.add(l2);

        JCheckBox checkBox1,checkBox2,checkBox3,checkBox4;
        checkBox1=new JCheckBox("B");
        checkBox2=new JCheckBox("BE");
        checkBox3=new JCheckBox("C");
        checkBox4=new JCheckBox("CE");
        checkBox1.setBounds(300,25,50,30);
        checkBox2.setBounds(300,50,50,30);
        checkBox3.setBounds(300,75,50,30);
        checkBox4.setBounds(300,100,50,30);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox3);
        f.add(checkBox4);

        JTextField jtf1=new JTextField();
        jtf1.setBounds(10,25,200,30);
        f.add(jtf1);

        JButton bSpara,bAvbryt;
        bSpara=new JButton("Spara");
        bAvbryt=new JButton("Avbryt");
        bSpara.setBounds(100,300,70,30);
        bAvbryt.setBounds(220,300,70,30);
        f.add(bSpara);
        f.add(bAvbryt);

        f.setLayout(null);
        f.setVisible(true);

        bSpara.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame dubbleChek = new JFrame("Spara");
                dubbleChek.setSize(300,200);
                dubbleChek.setVisible(true);
                dubbleChek.setLayout(null);

                JLabel l= new JLabel("ÄR DU SÄKER ATT VILL SPARA ÄNDRINGAR?");
                l .setBounds(10,30,250,50);
                dubbleChek.add(l);

                JButton ja=new JButton("Ja");
                JButton nej=new JButton("Nej");

                ja.setBounds(60,100,70,30);
                nej.setBounds(155,100,70,30);
                dubbleChek.add(ja);
                dubbleChek.add(nej);

                ja.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {

                        dubbleChek.setVisible(false);
                        f.setVisible(false);
                        ChaufforPlatform.chaufforFrame.setVisible(true);
                    }
                });
                nej.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        dubbleChek.setVisible(false);
                        f.setVisible(false);
                       ChaufforPlatform.chaufforFrame.setVisible(true);

                    }
                });

            }
        });
        checkBox1.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){

                }
            }
        });
        checkBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){

                }
            }
        });
        checkBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==1){

                }
            }
        });
        checkBox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                ComboBoxChauffor copyCbCH=new ComboBoxChauffor();
                if(e.getStateChange()==1){
                    int f =copyCbCH.catchedNameInt;
                    copyCbCH.chauforrBehorighet[f]="CE";
                    System.out.println(copyCbCH.chauforrBehorighet[copyCbCH.catchedNameInt]);
                }
            }
        });

    }
}
