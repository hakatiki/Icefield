package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLostFrame {
    private static JFrame gameLostFrame;
    private JPanel mainPanel;
    private JLabel lGameLost;
    private JPanel jTextPanel;
    private JPanel jButtonsPanel;
    private JPanel jTryPanel;
    private JButton bTryAgain;
    private JPanel jExitPanel;
    private JButton bExit;

    public GameLostFrame() {
        InitListeners();
    }

    void InitListeners() {
        bTryAgain.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameLostFrame.dispose();
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
        JFrame frame = new JFrame("Game Lost");
        frame.setContentPane(new GameLostFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        //opens in the center of the monitor
        frame.setLocationRelativeTo(null);
        gameLostFrame = frame;
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
        mainPanel.setBackground(new Color(-58332));
        mainPanel.setPreferredSize(new Dimension(800, 800));
        jTextPanel = new JPanel();
        jTextPanel.setLayout(new BorderLayout(0, 0));
        jTextPanel.setBackground(new Color(-58332));
        jTextPanel.setPreferredSize(new Dimension(600, 400));
        mainPanel.add(jTextPanel, BorderLayout.NORTH);
        lGameLost = new JLabel();
        Font lGameLostFont = this.$$$getFont$$$("Consolas", Font.BOLD, 90, lGameLost.getFont());
        if (lGameLostFont != null) lGameLost.setFont(lGameLostFont);
        lGameLost.setForeground(new Color(-16382458));
        lGameLost.setHorizontalAlignment(0);
        lGameLost.setHorizontalTextPosition(0);
        lGameLost.setPreferredSize(new Dimension(300, 100));
        lGameLost.setText("Game Lost");
        jTextPanel.add(lGameLost, BorderLayout.CENTER);
        jButtonsPanel = new JPanel();
        jButtonsPanel.setLayout(new BorderLayout(0, 0));
        jButtonsPanel.setBackground(new Color(-58332));
        jButtonsPanel.setPreferredSize(new Dimension(600, 325));
        mainPanel.add(jButtonsPanel, BorderLayout.SOUTH);
        jTryPanel = new JPanel();
        jTryPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        jTryPanel.setBackground(new Color(-58332));
        jTryPanel.setPreferredSize(new Dimension(600, 175));
        jButtonsPanel.add(jTryPanel, BorderLayout.NORTH);
        bTryAgain = new JButton();
        bTryAgain.setBackground(new Color(-58332));
        Font bTryAgainFont = this.$$$getFont$$$("Consolas", Font.BOLD, 48, bTryAgain.getFont());
        if (bTryAgainFont != null) bTryAgain.setFont(bTryAgainFont);
        bTryAgain.setForeground(new Color(-16382458));
        bTryAgain.setPreferredSize(new Dimension(600, 175));
        bTryAgain.setText("Try Again");
        jTryPanel.add(bTryAgain);
        jExitPanel = new JPanel();
        jExitPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        jExitPanel.setBackground(new Color(-58332));
        jExitPanel.setPreferredSize(new Dimension(600, 150));
        jButtonsPanel.add(jExitPanel, BorderLayout.SOUTH);
        bExit = new JButton();
        bExit.setBackground(new Color(-58332));
        Font bExitFont = this.$$$getFont$$$("Consolas", Font.BOLD, 48, bExit.getFont());
        if (bExitFont != null) bExit.setFont(bExitFont);
        bExit.setForeground(new Color(-16382458));
        bExit.setHorizontalTextPosition(0);
        bExit.setPreferredSize(new Dimension(600, 150));
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
