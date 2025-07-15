import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Homepage extends JFrame {

    public Homepage() {
        setTitle("DSA Visualizer - Home");
        setSize(600, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JLabel title = new JLabel("Welcome to DSA Visualizer", JLabel.CENTER);
        title.setFont(new Font("SansSerif", Font.BOLD, 24));
        add(title, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel(new BorderLayout());

        // Input Panel for custom array
        JPanel inputPanel = new JPanel(new FlowLayout());
        JLabel inputLabel = new JLabel("Enter array (comma-separated):");
        JTextField arrayInputField = new JTextField(30);
        inputPanel.add(inputLabel);
        inputPanel.add(arrayInputField);

        // Button Panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(6, 1, 10, 10));

        JButton bubbleSortBtn = new JButton("Visualize Bubble Sort");
        JButton selectionSortBtn = new JButton("Visualize Selection Sort");
        JButton insertionSortBtn = new JButton("Visualize Insertion Sort");
        JButton mergeSortBtn = new JButton("Visualize Merge Sort");
        JButton quickSortBtn = new JButton("Visualize Quick Sort");
        JButton exitBtn = new JButton("Exit");

        buttonPanel.add(bubbleSortBtn);
        buttonPanel.add(selectionSortBtn);
        buttonPanel.add(insertionSortBtn);
        buttonPanel.add(mergeSortBtn);
        buttonPanel.add(quickSortBtn);
        buttonPanel.add(exitBtn);

        centerPanel.add(inputPanel, BorderLayout.NORTH);
        centerPanel.add(buttonPanel, BorderLayout.CENTER);

        add(centerPanel, BorderLayout.CENTER);

        ActionListener sortListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String inputText = arrayInputField.getText().trim();
                if (inputText.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid array.");
                    return;
                }

                String[] tokens = inputText.split(",");
                int[] array = new int[tokens.length];
                try {
                    for (int i = 0; i < tokens.length; i++) {
                        array[i] = Integer.parseInt(tokens[i].trim());
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Invalid number in array. Please check your input.");
                    return;
                }

                dispose();
                String algorithm = ((JButton) e.getSource()).getText().replace("Visualize ", "");
                new DSAVisualizerGUI(array, algorithm);
            }
        };

        bubbleSortBtn.addActionListener(sortListener);
        selectionSortBtn.addActionListener(sortListener);
        insertionSortBtn.addActionListener(sortListener);
        mergeSortBtn.addActionListener(sortListener);
        quickSortBtn.addActionListener(sortListener);

        exitBtn.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    public static void showHome() {
        new Homepage();
    }
}