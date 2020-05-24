package c10;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainPanel extends JPanel {
    private DefaultListModel<Person> personModel = new DefaultListModel<>();

    public MainPanel() {
        setLayout(new BorderLayout());

        JList<Person> list = new JList<>();
        list.setModel(personModel);
        list.setCellRenderer(new PersonRenderer());

        add(new JScrollPane(list), BorderLayout.CENTER);

        JPanel controlPanel = new JPanel();

        controlPanel.setLayout(new BorderLayout());

        JPanel slidersPanel = new JPanel();

        slidersPanel.setLayout(new GridLayout(2, 1));

        JSlider heightSlider = this.getSliderField(100, 200, 1, "Height [cm]");
        JSlider weightSlider = this.getSliderField(40, 120, 2, "Weight [kg]");

        slidersPanel.add(heightSlider);
        slidersPanel.add(weightSlider);

        JPanel actionsPanel = new JPanel();

        actionsPanel.setLayout(new BorderLayout());

        JPanel inputsPanel = new JPanel();

        JLabel nameLabel = new JLabel("name:");
        nameLabel.setVerticalAlignment(JLabel.CENTER);

        JTextField nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(120, 20));

        JLabel selectLabel = new JLabel("size:");
        selectLabel.setVerticalAlignment(JLabel.CENTER);

        JComboBox<Size> select = new JComboBox<>(Size.values());

        JButton addButton = new JButton("Add person");

        addButton.addActionListener(actionEvent -> {
            Person person = new Person(
                    heightSlider.getValue(),
                    weightSlider.getValue(),
                    nameInput.getText(),
                    (Size) select.getSelectedItem()
            );
            personModel.addElement(person);

            nameInput.setText("");
        });

        inputsPanel.add(nameLabel);
        inputsPanel.add(nameInput);
        inputsPanel.add(selectLabel);
        inputsPanel.add(select);
        inputsPanel.add(addButton);

        actionsPanel.add(inputsPanel, BorderLayout.WEST);
        actionsPanel.add(this.getExitPanel(), BorderLayout.EAST);

        controlPanel.add(slidersPanel, BorderLayout.CENTER);
        controlPanel.add(actionsPanel, BorderLayout.SOUTH);

        add(controlPanel, BorderLayout.SOUTH);
    }

    private JSlider getSliderField(int min, int max, int minorTicking, String label) {
        JSlider jSlider = new JSlider(min, max);

        jSlider.setBorder(new TitledBorder(label));
        jSlider.setMajorTickSpacing(10);
        jSlider.setMinorTickSpacing(minorTicking);
        jSlider.setPaintTicks(true);
        jSlider.setPaintLabels(true);

        return jSlider;
    }

    private JPanel getExitPanel() {
        JPanel exitPanel = new JPanel();
        JButton exitButton = new JButton("Exit");

        exitButton.addActionListener(actionEvent -> System.exit(0));

        exitPanel.add(exitButton);

        return exitPanel;
    }
}
