import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class TemperatureConverter {
    JFrame jf;
    JPanel contentPanel;
    GridBagLayout converterLayout;
    JLabel labelConverter, labelFrom, labelTo, labelInput, labelResult;
    JComboBox<String> option1, option2;
    JTextField tempValue, resultValue;
    JButton btnConvert;

    public TemperatureConverter(){
        //Borders
        Border mainTitleBorder = BorderFactory.createEmptyBorder(0, 0, 20, 0);
        Border labelTopBorder = BorderFactory.createEmptyBorder(16, 0, 4, 0);
        Border labelTopBorderHigh = BorderFactory.createEmptyBorder(28, 0, 4, 0);
        Border inputBorder = BorderFactory.createLineBorder(Color.BLACK, 2, true);
        Border buttonBorder = BorderFactory.createLineBorder(Color.BLACK, 2, true);

        // Preferred Sizes
        Dimension borderDimension = new Dimension(500, 40);
        Dimension inputDimension = new Dimension(500, 35);
        Dimension comboDimension= new Dimension(240, 35);

        // Fonts
        Font labelFont = new Font("Arial", Font.BOLD, 24);
        Font inputFont = new Font("Arial", Font.BOLD, 20);

        jf = new JFrame("Temperature Converter");
        jf.setSize(600, 600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        contentPanel = new JPanel();
        Border padding = BorderFactory.createEmptyBorder(12, 16, 12, 16);
        contentPanel.setBorder(padding);
        contentPanel.setBackground(Color.white);
        jf.setContentPane(contentPanel);

        converterLayout = new GridBagLayout();
        GridBagConstraints gbc = new GridBagConstraints();


        jf.setLayout(converterLayout);

        labelConverter = new JLabel("Temperature Converter", JLabel.CENTER);
        labelConverter.setBorder(mainTitleBorder);
        labelConverter.setFont(new Font("Jetbrains Mono", Font.BOLD, 32));
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jf.add(labelConverter, gbc);

        labelFrom = new JLabel("From:");
        labelFrom.setBorder(labelTopBorder);
        labelFrom.setFont(labelFont);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.5;
        jf.add(labelFrom, gbc);

        labelTo = new JLabel("To:");
        labelTo.setBorder(labelTopBorder);
        labelTo.setFont(labelFont);
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.weightx = 0.5;
        jf.add(labelTo, gbc);

        String[] options = {"Celsius", "Kelvin", "Fahrenheit"};

        option1 = new JComboBox<>(options);
        option1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 8));
        option1.setFont(inputFont);
        option1.setPreferredSize(comboDimension);
        option1.setForeground(Color.black);
        option1.setBackground(Color.white);
        gbc.gridx = 0;
        gbc.gridy = 2;
        jf.add(option1, gbc);

        option2 = new JComboBox<>(options);
        option2.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 0));
        option2.setFont(inputFont);
        option2.setPreferredSize(comboDimension);
        option2.setForeground(Color.black);
        option2.setBackground(Color.white);
        gbc.gridx = 1;
        gbc.gridy = 2;
        jf.add(option2, gbc);

        labelInput = new JLabel("Input Temperature");
        labelInput.setFont(labelFont);
        labelInput.setBorder(labelTopBorderHigh);
        gbc.gridx = 0;
        gbc.gridy = 3;
        jf.add(labelInput, gbc);

        tempValue = new JTextField();
        tempValue.setFont(inputFont);
        tempValue.setBorder(inputBorder);
        tempValue.setPreferredSize(inputDimension);
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        jf.add(tempValue, gbc);

        labelResult = new JLabel("Result");
        labelResult.setFont(labelFont);
        labelResult.setBorder(labelTopBorder);
        gbc.gridx = 0;
        gbc.gridy = 5;
        jf.add(labelResult, gbc);

        resultValue = new JTextField();
        resultValue.setBorder(inputBorder);
        resultValue.setFont(inputFont);
        resultValue.setPreferredSize(inputDimension);
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        jf.add(resultValue, gbc);

        btnConvert = new JButton("Convert");
        btnConvert.setFont(inputFont);
        btnConvert.setBorder(buttonBorder);
        btnConvert.setPreferredSize(borderDimension);
        btnConvert.setEnabled(false);
        gbc.gridx = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridy = 7;
        gbc.insets = new Insets(32, 0, 0, 0);
        jf.add(btnConvert, gbc);


        jf.setVisible(true);
    }
}
