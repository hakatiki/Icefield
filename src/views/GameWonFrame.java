package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWonFrame {
    private static JFrame gameWonFrame;
    private JPanel mainPanel;
    private JPanel jTextPanel;
    private JLabel lGameWon;
    private JPanel jButtonsPanel;
    private JPanel jTryPanel;
    private JButton bPlayAgain;
    private JPanel jExitPanel;
    private JButton bExit;

    public GameWonFrame() {
        InitListeners();
    }

    void InitListeners() {
        bPlayAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameWonFrame.dispose();
                GameStartFrame.Run(null);
            }
        });
        bExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    public static void Run() {
        JFrame frame = new JFrame("Game Won");
        frame.setContentPane(new GameWonFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        //opens in the center of the monitor
        frame.setLocationRelativeTo(null);
        gameWonFrame = frame;
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.setPreferredSize(new Dimension(800, 800));
        jTextPanel = new JPanel();
        jTextPanel.setLayout(new BorderLayout(0, 0));
        jTextPanel.setBackground(new Color(-8541700));
        jTextPanel.setPreferredSize(new Dimension(600, 400));
        mainPanel.add(jTextPanel, BorderLayout.NORTH);
        lGameWon = new JLabel();
        Font lGameWonFont = this.$$$getFont$$$("Consolas", Font.BOLD, 90, lGameWon.getFont());
        if (lGameWonFont != null) lGameWon.setFont(lGameWonFont);
        lGameWon.setForeground(new Color(-5));
        lGameWon.setHorizontalAlignment(0);
        lGameWon.setHorizontalTextPosition(0);
        lGameWon.setPreferredSize(new Dimension(300, 100));
        lGameWon.setText("Game Won");
        jTextPanel.add(lGameWon, BorderLayout.CENTER);
        jButtonsPanel = new JPanel();
        jButtonsPanel.setLayout(new BorderLayout(0, 0));
        jButtonsPanel.setBackground(new Color(-8541700));
        jButtonsPanel.setPreferredSize(new Dimension(600, 325));
        mainPanel.add(jButtonsPanel, BorderLayout.CENTER);
        jTryPanel = new JPanel();
        jTryPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        jTryPanel.setBackground(new Color(-8541700));
        jTryPanel.setPreferredSize(new Dimension(600, 175));
        jButtonsPanel.add(jTryPanel, BorderLayout.NORTH);
        bPlayAgain = new JButton();
        bPlayAgain.setBackground(new Color(-8541700));
        Font bPlayAgainFont = this.$$$getFont$$$("Consolas", Font.BOLD, 48, bPlayAgain.getFont());
        if (bPlayAgainFont != null) bPlayAgain.setFont(bPlayAgainFont);
        bPlayAgain.setForeground(new Color(-5));
        bPlayAgain.setPreferredSize(new Dimension(600, 175));
        bPlayAgain.setText("Play Again");
        jTryPanel.add(bPlayAgain);
        jExitPanel = new JPanel();
        jExitPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        jExitPanel.setBackground(new Color(-8541700));
        jExitPanel.setPreferredSize(new Dimension(600, 180));
        jButtonsPanel.add(jExitPanel, BorderLayout.SOUTH);
        bExit = new JButton();
        bExit.setBackground(new Color(-8541700));
        Font bExitFont = this.$$$getFont$$$("Consolas", Font.BOLD, 48, bExit.getFont());
        if (bExitFont != null) bExit.setFont(bExitFont);
        bExit.setForeground(new Color(-5));
        bExit.setHorizontalTextPosition(0);
        bExit.setPreferredSize(new Dimension(600, 175));
        bExit.setText("Exit");
        jExitPanel.add(bExit);
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
