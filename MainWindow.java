import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {
    private JTable dataTable;
    private JButton editButton;
    private Object[][] data = {
        {"Tuition Fee", "John Doe", "1", "5000", "2000", "3000"},
        {"Library Fee", "Jane Smith", "2", "1000", "500", "500"}
    };
    private String[] columns = {"Category", "Name", "ID", "Amount", "Paid", "Amount Left"};

    public MainWindow() {
        setTitle("Main Window");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        dataTable = new JTable(data, columns);
        JScrollPane scrollPane = new JScrollPane(dataTable);
        add(scrollPane, BorderLayout.CENTER);

        editButton = new JButton("Edit");
        add(editButton, BorderLayout.SOUTH);

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new DataEntryWindow(); // Open the Data Entry Window for editing
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new MainWindow();
    }
}