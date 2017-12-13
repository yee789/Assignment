
package deliverymenstatus;

import java.awt.Font;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.*;

public class DeliveryMenStatus extends javax.swing.JFrame {
    
 private List<deliveryMenDetails> deliverymenList = new ArrayList<>();
 
  private JLabel jlbl = new JLabel("Delivery Men Status");
  private JLabel jlblName = new JLabel("Enter Name : ");
  private JTextField jtfName = new JTextField(12);
  private JLabel jlblGender = new JLabel("Enter gender:  ");
  private JTextField jtfGender = new JTextField(8);
  private JLabel jlblAge = new JLabel("Enter age:  ");
  private JTextField jtfAge = new JTextField(4);
  private JLabel jlblStatus = new JLabel("Enter working status :  ");
  private JTextField jtfStatus = new JTextField(12);
  
  private JLabel jlblsearchName = new JLabel("Search Name To Update : ");
  private JTextField jtfsearchName  = new JTextField(12);
  private JLabel jlblnewstatus = new JLabel("Enter new status:  ");
  private JTextField jtfnewstatus = new JTextField(8);
  
  private JButton jbtInsert = new JButton("Insert");
  private JButton jbtUpdate = new JButton("Update");
  private JButton jbtSearch = new JButton("Search");
  private JTextArea jtaReport = new JTextArea(10, 40);
 
  
  public DeliveryMenStatus() {
    setTitle("Delivery Men Status");
    Font fontInstruction = new Font("Arial", Font.BOLD, 20);
    Font font = new Font("Arial", Font.PLAIN, 14);
    jlbl.setFont(fontInstruction);
    jlbl.setHorizontalAlignment(SwingConstants.CENTER);
    jlblName.setFont(font);
    jtfName.setFont(font);
    jlblAge.setFont(font);
    jtfAge.setFont(font);
    jlblGender.setFont(font);
    jtfGender.setFont(font);
    jlblStatus.setFont(font);
    jtfStatus.setFont(font);
    
    JPanel jpInput = new JPanel(new GridLayout(4, 2));
    jpInput.add(jlblName);
    jpInput.add(jtfName);
    jpInput.add(jlblAge);
    jpInput.add(jtfAge);
    jpInput.add(jlblGender);
    jpInput.add(jtfGender);
    jpInput.add(jlblStatus);
    jpInput.add(jtfStatus);
    add(jpInput, BorderLayout.WEST);
    add(jlbl, BorderLayout.NORTH);

    JPanel btnPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
    btnPnl.add(jbtInsert);
    btnPnl.add(jbtSearch);
    btnPnl.add(jbtUpdate);   
    add(btnPnl, BorderLayout.SOUTH);
 
    JScrollPane scrollPane = new JScrollPane(jtaReport); 
    jtaReport.setEditable(false);
    jtaReport.setFont(font);
    add(scrollPane, BorderLayout.EAST);

    InsertListener insert = new InsertListener();
    jbtInsert.addActionListener(insert);

    UpdateListener updateStatus = new UpdateListener();
    jbtUpdate.addActionListener(updateStatus);
    
    SearchListener searchExist = new SearchListener();
    jbtSearch.addActionListener(searchExist);

    
  }
  
   public static String formatList(List deliverymenList) {
    String output = "";
    for (int i = 0; i < deliverymenList.size(); ++i) {
      output += "No." + (i+1) + " : " + deliverymenList.get(i);
    }
    return output;
  }
  
   private class InsertListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String name = jtfName.getText();
      String status = jtfStatus.getText();
      String gender = jtfGender.getText();
      int age = Integer.parseInt(jtfAge.getText());
       
      deliveryMenDetails details = new deliveryMenDetails(name, age , gender, status);
      deliverymenList.add(details);
      
      jtaReport.setText("List of delivery men : \n" + formatList(deliverymenList));
      jtfName.setText("");
      jtfStatus.setText("");
      jtfGender.setText("");
      jtfAge.setText("");

    }
   }
    private class SearchListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        
      String searchName = jtfName.getText();
      String dplGender = jtfGender.getText();
      String dplage = jtfAge.getText();
       
      for (int i = 0; i < deliverymenList.size(); ++i) {
        if (deliverymenList.get(i).name.equals(searchName)) {
            jtfGender.setText(deliverymenList.get(i).gender);
            jtfAge.setText(Integer.toString(deliverymenList.get(i).age));
            deliverymenList.remove(i);
        }else{
            JOptionPane.showMessageDialog(null,"Can't found this delivery men!");
        }
      }
      
  
    }
    }
    
   private class UpdateListener implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
      String updName = jtfName.getText();
      String updstatus = jtfStatus.getText();
      String updgender = jtfGender.getText();
      int updage = Integer.parseInt(jtfAge.getText());
       
      deliveryMenDetails details = new deliveryMenDetails(updName, updage , updgender, updstatus);
      deliverymenList.add(details);
      
      jtaReport.setText("Updated delivery men list : \n" + formatList(deliverymenList));
      jtfName.setText("");
      jtfStatus.setText("");
      jtfGender.setText("");
      jtfAge.setText("");
     
      }
    }

    public static void main(String[] args) {

    DeliveryMenStatus frame = new DeliveryMenStatus();
    frame.pack();
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
            
    }
    
}