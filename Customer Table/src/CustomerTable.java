import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

class CustomerInformationApp extends JFrame {

    private JTable customerTable;
    private DefaultTableModel tableModel;

    public CustomerInformationApp() {
        setTitle("Customer Information");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Initialize the table model with column names
        tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Name");
        tableModel.addColumn("Email");
        tableModel.addColumn("Phone");

        // Add some sample data (you can replace this with your actual data logic)
        tableModel.addRow(new Object[] {1, "John Doe", "john.doe@example.com", "123-456-7890"});
        tableModel.addRow(new Object[] {2, "Jane Smith", "jane.smith@example.com", "987-654-3210"});

        // Create the JTable with the initialized table model
        customerTable = new JTable(tableModel);

        // Set table properties
        customerTable.setPreferredScrollableViewportSize(new Dimension(500, 300));
        customerTable.setFillsViewportHeight(true);

        // Add the table to a scroll pane
        JScrollPane scrollPane = new JScrollPane(customerTable);
        add(scrollPane, BorderLayout.CENTER);

        // Display the JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(() -> {
            new CustomerInformationApp();
        });
    }
}
