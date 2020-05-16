package views;

import Field.Field;
import Game.Game;
import Item.Item;
import Player.Player;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameplayFrame {
    static Field chosenField;
    static Player currentPlayer;
    static Player chosenPlayer;
    static Item chosenItem;
    private JPanel mainPanel;
    private JPanel drawPanel;
    private JPanel informationPanel;
    private JPanel info1;
    private JPanel buttons;
    private JPanel info2;
    private JButton bStep;
    private JList playerList;
    private JButton bUseAbility;
    private JButton bDig;
    private JButton bUseItem;
    private JButton bPickUpItem;
    private JButton bEndTurn;
    private JLabel lCurrentPlayer;
    private JLabel lNumberOfWorkUnits;
    private JLabel lItems;
    private JLabel lPlayers;

    public GameplayFrame() {
        $$$setupUI$$$();
        InitListeners();
    }

    void InitListeners() {
        mainPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                super.keyTyped(e);
            }
        });

        bStep.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bUseAbility.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bDig.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bUseItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bPickUpItem.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        bEndTurn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public static void setChosenField(Direction dir) {
    }

    public static void setChosenPlayer(Player p) {
        chosenPlayer = p;
    }

    public static void setChosenItem(Item i) {
        chosenItem = i;
    }

    public static void Run() {
        JFrame frame = new JFrame("Gameplay");
        frame.setContentPane(new GameplayFrame().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        //opens in the center of the monitor
        frame.setLocationRelativeTo(null);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
        playerList = new JList();
        mainPanel = new JPanel();
        drawPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g){
                super.paint(g);
                Game.getInstance().view.Update(g);
            }
        };
        informationPanel = new JPanel();
        //playerListModel = new DefaultListModel();
        playerList = new JList();
        mainPanel.setPreferredSize(new Dimension(1200, 900));
        drawPanel.setPreferredSize(new Dimension(900, 900));
        informationPanel.setPreferredSize(new Dimension(300, 900));
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
        mainPanel.setLayout(new BorderLayout(0, 0));
        mainPanel.setBackground(new Color(-1312769));
        mainPanel.setEnabled(false);
        mainPanel.setVisible(true);
        informationPanel = new JPanel();
        informationPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        informationPanel.setPreferredSize(new Dimension(300, 900));
        mainPanel.add(informationPanel, BorderLayout.EAST);
        info1 = new JPanel();
        info1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        info1.setBackground(new Color(-1576198));
        info1.setPreferredSize(new Dimension(300, 300));
        informationPanel.add(info1);
        lCurrentPlayer = new JLabel();
        lCurrentPlayer.setPreferredSize(new Dimension(250, 30));
        lCurrentPlayer.setRequestFocusEnabled(true);
        lCurrentPlayer.setText("Jelenlegi játékos:");
        info1.add(lCurrentPlayer);
        lNumberOfWorkUnits = new JLabel();
        lNumberOfWorkUnits.setPreferredSize(new Dimension(250, 30));
        lNumberOfWorkUnits.setText("Maradék work unit:");
        info1.add(lNumberOfWorkUnits);
        lItems = new JLabel();
        lItems.setPreferredSize(new Dimension(250, 30));
        lItems.setText("Itemek:");
        info1.add(lItems);
        final JList list1 = new JList();
        list1.setPreferredSize(new Dimension(300, 200));
        info1.add(list1);
        buttons = new JPanel();
        buttons.setLayout(new FlowLayout(FlowLayout.CENTER, 15, 15));
        buttons.setBackground(new Color(-1378819));
        buttons.setPreferredSize(new Dimension(300, 400));
        informationPanel.add(buttons);
        bStep = new JButton();
        bStep.setAlignmentX(0.0f);
        bStep.setBackground(new Color(-12828607));
        Font bStepFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bStep.getFont());
        if (bStepFont != null) bStep.setFont(bStepFont);
        bStep.setForeground(new Color(-1));
        bStep.setPreferredSize(new Dimension(220, 50));
        bStep.setText("Step");
        buttons.add(bStep);
        bUseAbility = new JButton();
        bUseAbility.setAlignmentX(0.0f);
        bUseAbility.setBackground(new Color(-12828607));
        Font bUseAbilityFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bUseAbility.getFont());
        if (bUseAbilityFont != null) bUseAbility.setFont(bUseAbilityFont);
        bUseAbility.setForeground(new Color(-1));
        bUseAbility.setPreferredSize(new Dimension(220, 50));
        bUseAbility.setText("Use Ability");
        buttons.add(bUseAbility);
        bDig = new JButton();
        bDig.setAlignmentX(0.0f);
        bDig.setBackground(new Color(-12828607));
        Font bDigFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bDig.getFont());
        if (bDigFont != null) bDig.setFont(bDigFont);
        bDig.setForeground(new Color(-1));
        bDig.setPreferredSize(new Dimension(220, 50));
        bDig.setText("Dig");
        buttons.add(bDig);
        bUseItem = new JButton();
        bUseItem.setAlignmentX(0.0f);
        bUseItem.setBackground(new Color(-12828607));
        Font bUseItemFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bUseItem.getFont());
        if (bUseItemFont != null) bUseItem.setFont(bUseItemFont);
        bUseItem.setForeground(new Color(-1));
        bUseItem.setPreferredSize(new Dimension(220, 50));
        bUseItem.setText("Use Item");
        buttons.add(bUseItem);
        bPickUpItem = new JButton();
        bPickUpItem.setAlignmentX(0.0f);
        bPickUpItem.setBackground(new Color(-12828607));
        Font bPickUpItemFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bPickUpItem.getFont());
        if (bPickUpItemFont != null) bPickUpItem.setFont(bPickUpItemFont);
        bPickUpItem.setForeground(new Color(-1));
        bPickUpItem.setPreferredSize(new Dimension(220, 50));
        bPickUpItem.setText("Pick Up Item");
        buttons.add(bPickUpItem);
        bEndTurn = new JButton();
        bEndTurn.setAlignmentX(0.0f);
        bEndTurn.setBackground(new Color(-12828607));
        Font bEndTurnFont = this.$$$getFont$$$("Consolas", Font.PLAIN, 20, bEndTurn.getFont());
        if (bEndTurnFont != null) bEndTurn.setFont(bEndTurnFont);
        bEndTurn.setForeground(new Color(-1));
        bEndTurn.setPreferredSize(new Dimension(220, 50));
        bEndTurn.setText("End Turn");
        buttons.add(bEndTurn);
        info2 = new JPanel();
        info2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        info2.setBackground(new Color(-1312769));
        info2.setPreferredSize(new Dimension(300, 200));
        informationPanel.add(info2);
        lPlayers = new JLabel();
        lPlayers.setPreferredSize(new Dimension(250, 30));
        lPlayers.setText("Játékosok:");
        info2.add(lPlayers);
        playerList.setPreferredSize(new Dimension(300, 150));
        info2.add(playerList);
        drawPanel = new JPanel();
        drawPanel.setLayout(new BorderLayout(0, 0));
        drawPanel.setBackground(new Color(-8541700));
        drawPanel.setPreferredSize(new Dimension(900, 900));
        mainPanel.add(drawPanel, BorderLayout.CENTER);
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
