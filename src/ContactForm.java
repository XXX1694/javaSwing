import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ContactForm extends javax.swing.JFrame {
    JTextField txtName;
    JTextField txtEmail;
    JRadioButton rdbtnNewRadioButtonMale;
    JRadioButton rdbtnNewRadioButtonFemale;
    JCheckBox chckbxNewCheckBox;

    public ContactForm() {
        super("Contact Form");
        super.setBounds(200, 100, 300, 230);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPane = getContentPane();
        contentPane.setLayout(new GridLayout(5, 2, 2, 10));

        JLabel lblName = new JLabel("Enter name:");
        txtName = new JTextField("", 1);
        JLabel lblEmail = new JLabel("Enter email:");
         txtEmail = new JTextField("@", 1);

        contentPane.add(lblName);
        contentPane.add(txtName);
        contentPane.add(lblEmail);
        contentPane.add(txtEmail);

        rdbtnNewRadioButtonMale = new JRadioButton("Male", true);
        rdbtnNewRadioButtonFemale = new JRadioButton("Female");
        chckbxNewCheckBox = new JCheckBox("Agree", false);
        JButton btnNewButton = new JButton("Submit");

//        rdbtnNewRadioButtonMale.setSelected(true);

        contentPane.add(rdbtnNewRadioButtonMale);
        contentPane.add(rdbtnNewRadioButtonFemale);
        contentPane.add(chckbxNewCheckBox);
        contentPane.add(btnNewButton);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdbtnNewRadioButtonMale);
        buttonGroup.add(rdbtnNewRadioButtonFemale);

        btnNewButton.addActionListener(new ButtonManager());

    }

    class ButtonManager implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
             String name_field = txtName.getText();
             String email_field = txtEmail.getText();

             String isMale = "Male";
             if(!rdbtnNewRadioButtonMale.isSelected()){
                 isMale = "Female";
             }

             boolean checkBox = chckbxNewCheckBox.isSelected();

             JOptionPane.showMessageDialog(null, "Hello, " + name_field + "!", name_field, JOptionPane.PLAIN_MESSAGE);
        }
    }
}
