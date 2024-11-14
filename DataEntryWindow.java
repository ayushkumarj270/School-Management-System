import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DataEntryWindow extends JFrame {
    private JTextField categoryField, nameField, idField, amountField, paidField, leftField;
    private JButton saveButton;

    public DataEntryWindow() {
        setTitle("Data Entry Window");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLayout(new GridLayout(7, 2));

        categoryField = new JTextField();
        nameField = new JTextField();
        idField = new JTextField();
        amountField = new JTextField();
        paidField = new JTextField();
        leftField = new JTextField();
        saveButton = new JButton("Save");

        add(new JLabel("Category:"));
        add(categoryField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("ID:"));
        add(idField);
        add(new JLabel("Amount:"));
        add(amountField);
        add(new JLabel("Paid:"));
        add(paidField);
        add(new JLabel("Amount Left:"));
        add(leftField);
        add(saveButton);

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Save the entered data (In a real system, you would save it to a database or file)
                JOptionPane.showMessageDialog(DataEntryWindow.this, "Data Saved");
                dispose();
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DataEntryWindow();
    }
}