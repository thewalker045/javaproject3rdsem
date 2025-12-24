

import javax.swing.*;
import model.Book;
import model.User;
import model.Admin;
import service.IssueBook;
import interfaces.Report;
import interfaces.LibraryReport;

public class DashboardFrame extends JFrame {

    public DashboardFrame() {
        setTitle("Library Dashboard");
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea output = new JTextArea(10, 40);
        output.setEditable(false);

        JButton oopBtn = new JButton("Run OOP Demo");

        oopBtn.addActionListener(e -> {
            Book book = new Book(1, "Java Programming", "Herbert Schildt");

            User user = new Admin("Diwakar"); // Polymorphism
            user.role();

            IssueBook issue = new IssueBook(); // Abstraction
            issue.execute(book);

            Report report = new LibraryReport(); // Interface
            report.generateReport();

            output.setText(book.toString());
        });

        JPanel panel = new JPanel();
        panel.add(oopBtn);

        add(panel, "North");
        add(new JScrollPane(output), "Center");

        setVisible(true);
    }
}
