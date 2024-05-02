import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HealthConsultant extends JFrame {
  private JTextField heightField;
  private JTextField weightField;
  private JLabel bmiLabel;

  public HealthConsultant() {
    // Set up the GUI
    setTitle("Health Consultant");
    setLayout(new FlowLayout());
    add(new JLabel("Height (cm):"));
    heightField = new JTextField(5);
    add(heightField);
    add(new JLabel("Weight (kg):"));
    weightField = new JTextField(5);
    add(weightField);
    add(new JLabel("BMI:"));
    bmiLabel = new JLabel("");
    add(bmiLabel);

    // Add a Calculate button
    JButton calcButton = new JButton("Calculate");
    add(calcButton);

    // Add an action listener for the Calculate button
    calcButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // Calculate the BMI
        double height = Double.parseDouble(heightField.getText()) / 100.0;
        double weight = Double.parseDouble(weightField.getText());
        double bmi = weight / (height * height);
        bmiLabel.setText(String.format("%.1f", bmi));
      }
    });

    // Set the size and display the window
    setSize(250, 150);
    setVisible(true);
  }

  public static void main(String[] args) {
    new HealthConsultant();
  }
}
