package views;

import Field.Field;
import Item.Item;
import Player.Player;


import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame {
    static Field chosenField;
    static Player currentPlayer;
    static Player chosenPlayer;
    static Item chosenItem;
    private JPanel mainPanel;
    private JButton startButton;
    private JButton exitButton;
    private JButton addPlayerButton;
    private JLabel playerNameLabel;
    DefaultTableModel characterTableModel;
    private JTable characterTable;
    private JLabel characterLabel;
    private JTextField playerNameTextfield;

    public GameFrame() {
        $$$setupUI$$$();
        InitComponents();
    }

    public static void Run(String[] args) {
        JFrame frame = new JFrame("Icefield");
        frame.setContentPane(new GameFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setPreferredSize(new Dimension(1000, 800));
        frame.setResizable(false);
        //opens in the center of the monitor
        frame.setLocationRelativeTo(null);
    }

    public void initListeners() {

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        addPlayerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public void InitComponents() {
        initListeners();
    }

    public static void setChosenField(Direction dir) {

    }

    public static void setChosenPlayer(Player p) {
        chosenPlayer = p;
    }

    public static void setChosenItem(Item i) {
        chosenItem = i;
    }

    private void createUIComponents() {

        //choosing characters
        characterTableModel = new DefaultTableModel() {
            public boolean isCellEditable(int rowIndex, int mColIndex) {
                return false;
            }
        };
        characterTable = new JTable(characterTableModel);

        //forbidding resize/reorder
        characterTable.getTableHeader().setResizingAllowed(false);
        characterTable.getTableHeader().setReorderingAllowed(false);


        //allowing single cell selection
        characterTable.setColumnSelectionAllowed(true);
        characterTable.setRowSelectionAllowed(true);
        characterTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        //set row/column size, quantity and value
        TableColumnModel columnModel = characterTable.getColumnModel();
        characterTable.setRowHeight(40);
        characterTableModel.setColumnCount(2);
        characterTableModel.setRowCount(1);
        characterTableModel.setValueAt("Eskimo", 0, 0);
        characterTableModel.setValueAt("Researcher", 0, 1);

    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(100, 30));
        mainPanel.setBackground(new Color(-13443621));
        Font mainPanelFont = this.$$$getFont$$$("Consolas", Font.BOLD | Font.ITALIC, 36, mainPanel.getFont());
        if (mainPanelFont != null) mainPanel.setFont(mainPanelFont);
        mainPanel.setPreferredSize(new Dimension(1000, 700));
        mainPanel.setVisible(true);
        mainPanel.setBorder(BorderFactory.createTitledBorder(null, "Icefield", TitledBorder.CENTER, TitledBorder.DEFAULT_POSITION, this.$$$getFont$$$("Consolas", Font.ITALIC, 48, mainPanel.getFont()), new Color(-16777216)));
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        panel1.setBackground(new Color(-13443621));
        panel1.setPreferredSize(new Dimension(250, 100));
        mainPanel.add(panel1, BorderLayout.WEST);
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 60));
        panel2.setBackground(new Color(-9803154));
        panel2.setOpaque(true);
        panel2.setPreferredSize(new Dimension(0, 170));
        panel1.add(panel2, BorderLayout.NORTH);
        startButton = new JButton();
        startButton.setAlignmentX(0.0f);
        startButton.setBackground(new Color(-12828607));
        Font startButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, startButton.getFont());
        if (startButtonFont != null) startButton.setFont(startButtonFont);
        startButton.setForeground(new Color(-1));
        startButton.setHorizontalAlignment(0);
        startButton.setPreferredSize(new Dimension(220, 50));
        startButton.setText("Start");
        panel2.add(startButton);
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 60));
        panel3.setBackground(new Color(-9803154));
        panel3.setPreferredSize(new Dimension(0, 170));
        panel1.add(panel3, BorderLayout.SOUTH);
        exitButton = new JButton();
        exitButton.setAlignmentX(0.0f);
        exitButton.setBackground(new Color(-12828607));
        Font exitButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, exitButton.getFont());
        if (exitButtonFont != null) exitButton.setFont(exitButtonFont);
        exitButton.setForeground(new Color(-1));
        exitButton.setPreferredSize(new Dimension(220, 50));
        exitButton.setText("Exit");
        panel3.add(exitButton);
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 130));
        panel4.setBackground(new Color(-9803154));
        panel4.setPreferredSize(new Dimension(0, 170));
        panel4.putClientProperty("html.disable", Boolean.FALSE);
        panel1.add(panel4, BorderLayout.CENTER);
        addPlayerButton = new JButton();
        addPlayerButton.setAlignmentX(0.0f);
        addPlayerButton.setBackground(new Color(-12828607));
        Font addPlayerButtonFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, addPlayerButton.getFont());
        if (addPlayerButtonFont != null) addPlayerButton.setFont(addPlayerButtonFont);
        addPlayerButton.setForeground(new Color(-1));
        addPlayerButton.setPreferredSize(new Dimension(220, 50));
        addPlayerButton.setText("Add Player");
        panel4.add(addPlayerButton);
        final JPanel panel5 = new JPanel();
        panel5.setLayout(new BorderLayout(0, 0));
        panel5.setBackground(new Color(-13443621));
        panel5.setPreferredSize(new Dimension(300, 100));
        mainPanel.add(panel5, BorderLayout.CENTER);
        final JPanel panel6 = new JPanel();
        panel6.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        panel6.setBackground(new Color(-9803154));
        panel6.setOpaque(true);
        panel6.setPreferredSize(new Dimension(0, 300));
        panel5.add(panel6, BorderLayout.NORTH);
        playerNameLabel = new JLabel();
        Font playerNameLabelFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 28, playerNameLabel.getFont());
        if (playerNameLabelFont != null) playerNameLabel.setFont(playerNameLabelFont);
        playerNameLabel.setForeground(new Color(-1));
        playerNameLabel.setHorizontalAlignment(0);
        playerNameLabel.setPreferredSize(new Dimension(500, 30));
        playerNameLabel.setText("Player's name:");
        panel6.add(playerNameLabel);
        playerNameTextfield = new JTextField();
        playerNameTextfield.setPreferredSize(new Dimension(300, 30));
        panel6.add(playerNameTextfield);
        final JPanel panel7 = new JPanel();
        panel7.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 60));
        panel7.setBackground(new Color(-9803154));
        panel7.setPreferredSize(new Dimension(0, 170));
        panel5.add(panel7, BorderLayout.SOUTH);
        final JPanel panel8 = new JPanel();
        panel8.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 30));
        panel8.setBackground(new Color(-9803154));
        panel8.setPreferredSize(new Dimension(0, 170));
        panel8.putClientProperty("html.disable", Boolean.FALSE);
        panel5.add(panel8, BorderLayout.CENTER);
        characterLabel = new JLabel();
        Font characterLabelFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 28, characterLabel.getFont());
        if (characterLabelFont != null) characterLabel.setFont(characterLabelFont);
        characterLabel.setForeground(new Color(-1));
        characterLabel.setHorizontalAlignment(0);
        characterLabel.setPreferredSize(new Dimension(600, 30));
        characterLabel.setText("Character:");
        panel8.add(characterLabel);
        characterTable.setAutoCreateColumnsFromModel(true);
        characterTable.setCellSelectionEnabled(true);
        Font characterTableFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 14, characterTable.getFont());
        if (characterTableFont != null) characterTable.setFont(characterTableFont);
        characterTable.setIntercellSpacing(new Dimension(60, 10));
        characterTable.setPreferredSize(new Dimension(300, 50));
        characterTable.setRowHeight(50);
        characterTable.setRowMargin(10);
        characterTable.setRowSelectionAllowed(true);
        characterTable.setShowVerticalLines(true);
        panel8.add(characterTable);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return mainPanel;
    }

}
