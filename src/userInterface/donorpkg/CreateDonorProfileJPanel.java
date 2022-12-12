/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.donorpkg;

import business.common.ValidateDateOfBirth;
import business.common.ValidateEmailTextField;
import business.common.ValidateNumbers;
import business.common.ValidatePhoneNumber;
import business.common.ValidateStrings;
import business.personpkg.Person;
import business.userAccountpkg.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.InputVerifier;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author ayush
 */
public class CreateDonorProfileJPanel extends javax.swing.JPanel {
    private JPanel userProcessContainer;
    private UserAccount userAccount;
    
    /**
     * Creates new form CreateDonorProfile
     */
    public CreateDonorProfileJPanel(JPanel userProcessContainer, UserAccount account) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        addInputVerifiers();
        donorNameField.setText(userAccount.getPerson().getName());
        donorName.setVisible(true);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY);
        int w = getWidth();
        int h = getHeight();
        
        Color c1 = new Color(153,197,85);
        Color c2 = Color.white;
     
        GradientPaint gp = new GradientPaint(w/4, 0, c2, w/4, h, c1);
        setOpaque( false );
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
        setOpaque( true );
    }
    
    private void addInputVerifiers() {
          
        InputVerifier stringValidation = new ValidateStrings();
        donorNameField.setInputVerifier(stringValidation);
        addressField.setInputVerifier(stringValidation);
        townField.setInputVerifier(stringValidation);
        occupationField.setInputVerifier(stringValidation);
        
        InputVerifier dobValidtion = new ValidateDateOfBirth();
        donorDobField.setInputVerifier(dobValidtion);
        
        InputVerifier numberValidation = new ValidateNumbers();
        zipCodeField.setInputVerifier(numberValidation);
        
        InputVerifier phnumberValidation = new ValidatePhoneNumber();
        phoneNumberField.setInputVerifier(phnumberValidation);
         
            InputVerifier emailValidtion = new ValidateEmailTextField();
            emailIDField.setInputVerifier(emailValidtion);
     
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateOfBirth = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        addressField = new javax.swing.JTextField();
        town = new javax.swing.JLabel();
        townField = new javax.swing.JTextField();
        zipCode = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        createYourProfile = new javax.swing.JLabel();
        donorName = new javax.swing.JLabel();
        donorNameField = new javax.swing.JTextField();
        zipCodeField = new javax.swing.JTextField();
        occupation = new javax.swing.JLabel();
        occupationField = new javax.swing.JTextField();
        emailID = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        phoneNumber = new javax.swing.JLabel();
        phoneNumberField = new javax.swing.JTextField();
        createProfileButton = new javax.swing.JButton();
        donorDobField = new javax.swing.JFormattedTextField();
        manageEnt = new javax.swing.JLabel();

        dateOfBirth.setText("Date Of Birth (MM/DD/YYYY):");

        address.setText("Address: ");

        town.setText("Town/City: ");

        zipCode.setText("Zip Code:");

        backJButton.setText("<< back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        createYourProfile.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        createYourProfile.setText("Create Your Profile");

        donorName.setText("Full Name:");

        donorNameField.setEditable(false);
        donorNameField.setEnabled(false);

        occupation.setText("Occupation:");

        emailID.setText("Email Address:");

        phoneNumber.setText("Phone Number:");

        createProfileButton.setText("Create Profile ");
        createProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createProfileButtonActionPerformed(evt);
            }
        });

        manageEnt.setFont(new java.awt.Font("Malayalam MN", 3, 24)); // NOI18N
        manageEnt.setText("Donor Work Area");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(backJButton)
                .addGap(38, 254, Short.MAX_VALUE)
                .addComponent(createProfileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(418, 418, 418))
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageEnt, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(town))
                            .addComponent(occupation)
                            .addComponent(emailID, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(donorName, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(zipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneNumber)
                            .addComponent(createYourProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(phoneNumberField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(donorDobField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(zipCodeField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(townField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(occupationField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(emailIDField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(addressField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(donorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(manageEnt)
                .addGap(18, 18, 18)
                .addComponent(createYourProfile)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(donorName)
                    .addComponent(donorNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfBirth)
                    .addComponent(donorDobField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(address)
                    .addComponent(addressField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(town)
                    .addComponent(townField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(occupation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(occupationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailID)
                    .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zipCodeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zipCode))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneNumber))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createProfileButton)
                    .addComponent(backJButton))
                .addGap(21, 21, 21))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void createProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createProfileButtonActionPerformed
        Person person = userAccount.getPerson();
        
        if( addressField.getText().trim().isEmpty() ||
             townField.getText().trim().isEmpty() ||
            occupationField.getText().trim().isEmpty() ||
             emailIDField.getText().trim().isEmpty() ||
           phoneNumberField.getText().trim().isEmpty() || 
             donorDobField.getText().trim().isEmpty() ||
            zipCodeField.getText().trim().isEmpty() ) 
        {
        JOptionPane.showMessageDialog(null, "Please Enter data in all the fields");
           return;        
        }
        
        try
        {
          DateFormat dateFormat =  new SimpleDateFormat("MM/dd/yyyy");
        Date date = new Date();
        Date dob =  dateFormat.parse(donorDobField.getText());
        if(dob.after(date) || dob.equals(date))
        {
         JOptionPane.showMessageDialog(null, "Please Enter valid Date of Birth");
           return;    
        }
            person.setDob(dateFormat.parse(donorDobField.getText()));
            person.setAddress1(addressField.getText());
            person.setTown(townField.getText());
            person.setOccupation(occupationField.getText());
            person.setZipCode(zipCodeField.getText());
            person.setEmailId(emailIDField.getText());
            person.setPhoneNumber(phoneNumberField.getText());      
            
            JOptionPane.showMessageDialog(null, "Your Profile has been created successfully", "success", JOptionPane.PLAIN_MESSAGE);
            resetFields();       
        }
        catch(ParseException pe)
        {
           JOptionPane.showMessageDialog(null, "Please Enter valid date of Birth!");
           return;   
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Please Enter valid data in all the fields");
           return;     
        }
    }//GEN-LAST:event_createProfileButtonActionPerformed

public void resetFields()
{
    donorNameField.setText("");
    donorDobField.setText("");
    addressField.setText("");
    townField.setText("");
    occupationField.setText("");
    zipCodeField.setText("");
    emailIDField.setText("");
    phoneNumberField.setText("");
    
    
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel address;
    private javax.swing.JTextField addressField;
    private javax.swing.JButton backJButton;
    private javax.swing.JButton createProfileButton;
    private javax.swing.JLabel createYourProfile;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JFormattedTextField donorDobField;
    private javax.swing.JLabel donorName;
    private javax.swing.JTextField donorNameField;
    private javax.swing.JLabel emailID;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JLabel manageEnt;
    private javax.swing.JLabel occupation;
    private javax.swing.JTextField occupationField;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JTextField phoneNumberField;
    private javax.swing.JLabel town;
    private javax.swing.JTextField townField;
    private javax.swing.JLabel zipCode;
    private javax.swing.JTextField zipCodeField;
    // End of variables declaration//GEN-END:variables
}
