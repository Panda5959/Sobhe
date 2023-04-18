
package javaapplication4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class simple extends JFrame implements ActionListener , ItemListener,ListSelectionListener {
  private JPanel panel1,panel2,panel3,panel4;
  private JLabel massage;
  private JTextField killoTextfield;
  private JButton calc;
  private JButton mile;
  private JCheckBox c1,c2,c3;
  private JButton cent;
  private JRadioButton r1,r2,r3;
  private ButtonGroup gr;
  private JList List1;
  private JScrollPane Scroll1;
  private  JComboBox CBox;
  private ImageIcon image;
  private JMenuBar bar;
  private JMenu m1,m2;
  private JMenuItem mexit;
  
  private String [] names ={"mile","meter","centimeter","inches"};
  private final int width=350;
  private final int length=250;
  public simple(){
      setTitle("Killometer converter");
      setSize(width,length);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
      panel1=new JPanel();
      panel2=new JPanel();
       panel3=new JPanel();
       panel4=new JPanel();
       bar=new JMenuBar();
       mexit=new JMenuItem("Exit");
       
       m1=new JMenu("file");
       m2=new JMenu("Edit");
       m1.add(mexit);
       mexit.addActionListener(this);
       bar.add(m1);
       bar.add(m2);
       this.setJMenuBar(bar);
      r1=new JRadioButton("mile",true);
      r1.setMnemonic('m');
      r1.addActionListener(this);
 
       r2=new JRadioButton("meter",true);
           r2.addActionListener(this);
        r3=new JRadioButton("centimeter",true);
            r3.addActionListener(this);
      cent=new JButton("Centemeter");
      cent.setToolTipText("convert a7a");
      massage=new JLabel("enter distance in killometer");
      killoTextfield=new JTextField(10);
      image=new ImageIcon("C:\\Users\\IDEAPAD GAMING\\Desktop\\help3.jpg");
      calc=new JButton("meter",image);
      mile=new JButton("miles");
      List1=new JList(names);
      List1.addListSelectionListener(this);
      //List1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
     

       
       Scroll1=new JScrollPane(List1);
       List1.setVisibleRowCount(2);

      panel4.add(Scroll1);
      
 
      c1=new JCheckBox("Travel");
      c1.addItemListener(this);
      c2=new JCheckBox("Computer");
         c2.addItemListener(this);
      c3=new JCheckBox("Fottball");
         c3.addItemListener(this);
      
      gr=new ButtonGroup();
      gr.add(r1);
      gr.add(r2);
      gr.add(r3);
      calc.addActionListener(this);
      mile.addActionListener(this);
      cent.addActionListener(this);
      CBox=new JComboBox(names);
      CBox.addActionListener(this);
      CBox.setEditable(true);
      
      panel1.add(massage);
      panel1.add(killoTextfield);
      panel1.add(cent);
      panel1.add(mile);
      panel1.add(calc);
      panel2.add(r1);
      panel2.add(r2);
      panel2.add(r3);
      panel3.add(c1);
      panel3.add(c2);
      panel3.add(c3);
      panel4.add(List1);
      panel1.add(CBox);
      panel3.setBorder(BorderFactory.createEtchedBorder(Color.black,Color.green));
      panel2.setBorder(BorderFactory.createTitledBorder("Measure"));
      panel1.add(panel3);
      panel1.add(panel2);
      panel1.add(panel4);
     this. add(panel1); 
     // String g=JOptionPane.showInputDialog("enter ur num");
      setVisible(true);
      
   
  }

    @Override
    public void actionPerformed(ActionEvent e) {
        String x=killoTextfield.getText();
        try {
            if(e.getSource()==mexit){
                System.exit(0);
            
            }
        if(e.getSource()==mile){
            r1.doClick();
       // double d=Double.parseDouble(x)*0.6214;
        //JOptionPane.showMessageDialog(null,"the result ="+d+" miles","report",JOptionPane.INFORMATION_MESSAGE); } 
        }
        if(e.getSource()==cent){
            r3.doClick();
        
           // double d=Double.parseDouble(x)*100000;
     //   JOptionPane.showMessageDialog(null,"the result ="+d+" centimeter","report",JOptionPane.INFORMATION_MESSAGE); }
        }
             if(e.getSource()==calc){
            r2.doClick();
        
           // double d=Double.parseDouble(x)*100000;
     //   JOptionPane.showMessageDialog(null,"the result ="+d+" centimeter","report",JOptionPane.INFORMATION_MESSAGE); }
        }
                if(e.getSource()==r1){
            double d=Double.parseDouble(x)*0.6214;
        JOptionPane.showMessageDialog(null,"the result ="+d+" miles","report",JOptionPane.INFORMATION_MESSAGE); }
                        if(e.getSource()==r2){
            double d=Double.parseDouble(x)*1000;
        JOptionPane.showMessageDialog(null,"the result ="+d+" meter","report",JOptionPane.INFORMATION_MESSAGE); }
        
        
          if(e.getSource()==r3){
          
        
           double d=Double.parseDouble(x)*1000;
       JOptionPane.showMessageDialog(null,"the result ="+d+" centimeter","report",JOptionPane.INFORMATION_MESSAGE); }
          if(e.getSource()==CBox){JOptionPane.showMessageDialog(null, "u chose me ");}
        } 
        catch(Exception t){
            JOptionPane.showMessageDialog(this, "error","!!",JOptionPane.ERROR_MESSAGE);}
        
        
        
        
        
    } 

    @Override
    public void itemStateChanged(ItemEvent e) {
        if(c1.isSelected()){JOptionPane.showMessageDialog(null,"travel");  }
        
      
        
}

    @Override
    public void valueChanged(ListSelectionEvent e) {
//String x=(String)List1.getSelectedValue();
//JOptionPane.showMessageDialog(null, "u choce sele");
            
        
        
        
    }
}
         




    
            
            
          
        
       
       
                
        
        
       
    
          
  
        
    
    
    
    

 