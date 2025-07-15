import javax.swing.*;
import java.awt.*;
import java.util.List;
import Sorting.*;

public class DSAVisualizerGUI extends JPanel {
    private int[] array;
    private final int BAR_WIDTH = 30;
    private String algorithm;

    public DSAVisualizerGUI(int[] inputArray, String algorithm) {
        this.array = inputArray;
        this.algorithm = algorithm;

        JFrame frame = new JFrame(algorithm + " Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.add(this);
        frame.setVisible(true);

        new Thread(this::animate).start();
    }

    private void animate() {
        List<int[]> steps = null;
        switch (algorithm.toLowerCase()) {
            case "bubble sort":
                steps = new BubbleSort().getSortingSteps(array);
                break;
            case "selection sort":
                steps = new SelectionSort().getSortingSteps(array);
                break;
            case "insertion sort":
                steps = new InsertionSort().getSortingSteps(array);
                break;
            case "merge sort":
                steps = new MergeSort().getSortingSteps(array);
                break;
            case "quick sort":
                steps = new QuickSort().getSortingSteps(array);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Unknown algorithm: " + algorithm);
                return;
        }

        try {
            for (int[] step : steps) {
                this.array = step;
                repaint();
                Thread.sleep(300);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

 @Override
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    int panelWidth = getWidth();
    int panelHeight = getHeight();
    int n = array.length;

    int barWidth = 30;
    int maxVal = 0;
    for (int val : array) {
        maxVal = Math.max(maxVal, val);
    }

    int scale = (int) ((panelHeight - 60.0) / maxVal); // Scale height, leave space for text

    g.setFont(new Font("SansSerif", Font.BOLD, 14));

    for (int i = 0; i < n; i++) {
        int x = i * barWidth + 10;
        int barHeight = array[i] * scale;
        int y = panelHeight - barHeight - 30;

        // Draw blue bar
        g.setColor(new Color(30, 144, 255));
        g.fillRect(x, y, barWidth - 5, barHeight);

        // Draw value below the bar
        g.setColor(Color.BLACK);
        g.drawString(String.valueOf(array[i]), x + 5, panelHeight - 10);
    }
}


}
