/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first_page;

import ankh.morpork.AnkhMorpork;
import static first_page.first_page.active_turn;
import static first_page.first_page.playerObj;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class second_page extends javax.swing.JFrame{
AnkhMorpork obj = new AnkhMorpork();
String cards ="";
static int one = 1;
public static Player p;


/**
     * Creates new form second_page
     */
    public second_page() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        payGroup = new javax.swing.ButtonGroup();
        pieceGroup = new javax.swing.ButtonGroup();
        cardGroup = new javax.swing.ButtonGroup();
        LactivePlayer = new javax.swing.JLabel();
        Lplayer = new javax.swing.JLabel();
        BendTurn = new javax.swing.JButton();
        Lcolor = new javax.swing.JLabel();
        Lcash = new javax.swing.JLabel();
        Lcards = new javax.swing.JLabel();
        Lminions = new javax.swing.JLabel();
        Lbuildings = new javax.swing.JLabel();
        Acolor = new javax.swing.JLabel();
        Acash = new javax.swing.JLabel();
        Acards = new javax.swing.JLabel();
        Aminions = new javax.swing.JLabel();
        Abuildings = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        savegameButton = new javax.swing.JButton();
        nameText = new javax.swing.JTextField();
        name_label = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        diceV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Apersonality = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jRadioButton11 = new javax.swing.JRadioButton();
        jRadioButton12 = new javax.swing.JRadioButton();
        jButton3 = new javax.swing.JButton();
        playerText = new javax.swing.JLabel();
        bankText = new javax.swing.JLabel();
        tmText = new javax.swing.JLabel();
        trollsText = new javax.swing.JLabel();
        demonsText = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        LactivePlayer.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        LactivePlayer.setForeground(new java.awt.Color(153, 0, 0));
        LactivePlayer.setText("Active Player: ");
        LactivePlayer.setBorder(new javax.swing.border.MatteBorder(null));

        Lplayer.setBackground(new java.awt.Color(0, 0, 0));
        Lplayer.setFont(new java.awt.Font("Tekton Pro Ext", 0, 24)); // NOI18N
        Lplayer.setForeground(new java.awt.Color(153, 0, 0));
        Lplayer.setBorder(new javax.swing.border.MatteBorder(null));

        BendTurn.setText("End Turn");
        BendTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BendTurnActionPerformed(evt);
            }
        });

        Lcolor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lcolor.setText("Color :");

        Lcash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lcash.setText("Cash :");

        Lcards.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lcards.setText("Cards in hand :");

        Lminions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lminions.setText("Minions :");

        Lbuildings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Lbuildings.setText("Buildings :");

        Acolor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Acash.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Acash.setText("10");

        Acards.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Aminions.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Aminions.setText("12");

        Abuildings.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Abuildings.setText("6");

        jButton1.setText("Play Card");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Roll a Dice");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        savegameButton.setText("save game");
        savegameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savegameButtonActionPerformed(evt);
            }
        });

        name_label.setText("Name for the game to be stored:");

        cardGroup.add(jRadioButton1);
        jRadioButton1.setText("Card 1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        cardGroup.add(jRadioButton2);
        jRadioButton2.setText("Card 2");

        cardGroup.add(jRadioButton3);
        jRadioButton3.setText("Card 3");

        cardGroup.add(jRadioButton4);
        jRadioButton4.setText("Card 4");

        cardGroup.add(jRadioButton5);
        jRadioButton5.setText("Card 5");

        diceV.setText("0");

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Game Statistics");

        jLabel2.setText("Enter Amout");

        jTextField2.setText("0.00");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        payGroup.add(jRadioButton6);
        jRadioButton6.setText("Make a Payment");

        payGroup.add(jRadioButton7);
        jRadioButton7.setText("Receive Fund");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Personality :");

        jLabel4.setText("number of players :");

        jLabel5.setText("Cash in Bank :");

        jLabel6.setText("Trouble Markers not on board :");

        jLabel7.setText("Trolls not on board :");

        jLabel8.setText("Demons not on board :");

        pieceGroup.add(jRadioButton8);
        jRadioButton8.setText("Minions");

        pieceGroup.add(jRadioButton9);
        jRadioButton9.setText("Buildings");

        pieceGroup.add(jRadioButton10);
        jRadioButton10.setText("Trolls");

        pieceGroup.add(jRadioButton11);
        jRadioButton11.setText("Trouble markers");

        pieceGroup.add(jRadioButton12);
        jRadioButton12.setText("Demons");

        jButton3.setText("Place");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Remove");

        jButton5.setText("Go");

        jButton6.setText("View Board");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Random Event Cards");

        jButton8.setText("Personality Cards");

        jButton9.setText("Area Cards");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Player Aid Cards");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gboard/img/start.jpg"))); // NOI18N
        jLabel9.setMaximumSize(new java.awt.Dimension(300, 300));
        jLabel9.setMinimumSize(new java.awt.Dimension(300, 300));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(LactivePlayer)
                        .addGap(49, 49, 49)
                        .addComponent(Lplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbuildings, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(Lminions)
                                            .addComponent(Lcards))
                                        .addComponent(Lcash, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(Lcolor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Apersonality)
                            .addComponent(Aminions)
                            .addComponent(Abuildings)
                            .addComponent(Acash, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Acards, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Acolor, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(playerText)
                            .addComponent(bankText)
                            .addComponent(tmText)
                            .addComponent(trollsText)
                            .addComponent(demonsText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton10)
                            .addComponent(jButton9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jRadioButton5)
                                        .addComponent(jRadioButton4)
                                        .addComponent(jRadioButton2)
                                        .addComponent(jRadioButton1)
                                        .addComponent(jRadioButton3))
                                    .addComponent(jButton1))
                                .addGap(88, 88, 88)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton10)
                                    .addComponent(jRadioButton12)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jRadioButton8))
                                        .addGap(44, 44, 44)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton4)
                                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jRadioButton11))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel2)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(10, 10, 10)
                                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                            .addComponent(jRadioButton6)
                                            .addComponent(jRadioButton7)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(BendTurn)
                                            .addComponent(jButton5))
                                        .addGap(30, 30, 30))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(diceV, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addComponent(saveButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(savegameButton)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(name_label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LactivePlayer)
                            .addComponent(Lplayer)
                            .addComponent(jLabel1))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(playerText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(bankText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tmText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(trollsText))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(demonsText))
                        .addGap(30, 30, 30)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(saveButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_label))
                        .addGap(18, 18, 18)
                        .addComponent(savegameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(Apersonality))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Lcolor)
                                    .addComponent(Acolor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Acash)
                                    .addComponent(Lcash))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Lcards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Acards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lminions)
                                    .addComponent(Aminions))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Lbuildings)
                                    .addComponent(Abuildings)))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton7))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton8)
                                            .addComponent(jButton3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jRadioButton9)
                                            .addComponent(jButton4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton10)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jRadioButton11)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton12)
                                    .addComponent(jButton5)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jRadioButton5)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(BendTurn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(diceV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * BendTurn to change the turn of the player
     * @param evt 
     * @param active_turn currently active player
     * @see next_turn(integer i) change the turn of the player
     */
    private void BendTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BendTurnActionPerformed

        first_page.active_turn = one + first_page.active_turn;
        Lplayer.setText("Player " + (first_page.active_turn + one));
        
        Acolor.setText(playerObj[first_page.active_turn].Color);
        for(int j=0;j<5;j++)
            cards += playerObj[active_turn].CardsInHand[j] + "  ";        
            Acards.setText(cards);
            Apersonality.setText(playerObj[first_page.active_turn].Personality);
        
        if(first_page.active_turn == (playerObj.length - one))
        {
            cards = " ";
            obj.next_turn(first_page.active_turn);
            first_page.active_turn = -1;
            
    }
        else{
            
            cards = " ";
            obj.next_turn(first_page.active_turn);
        }

        System.out.println(playerObj[0].CardsInHand);
        
    }//GEN-LAST:event_BendTurnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void savegameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savegameButtonActionPerformed
        
        /*
        storing all the values for each players by calling ls.func()
        */

        FileOutputStream fileOut = null;
     try {
         fileOut = new FileOutputStream(nameText.getText() + ".ser");
     } catch (FileNotFoundException ex) {
         Logger.getLogger(second_page.class.getName()).log(Level.SEVERE, null, ex);
     }
         ObjectOutputStream out = null;
     try {
         out = new ObjectOutputStream(fileOut);
     } catch (IOException ex) {
         Logger.getLogger(second_page.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         out.writeObject(playerObj);
         out.writeInt(playerObj.length);
         for(Player obj : playerObj)
             out.writeObject(obj);
         
     } catch (IOException ex) {
         Logger.getLogger(second_page.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         out.close();
     } catch (IOException ex) {
         Logger.getLogger(second_page.class.getName()).log(Level.SEVERE, null, ex);
     }
     try {
         fileOut.close();
     } catch (IOException ex) {
         Logger.getLogger(second_page.class.getName()).log(Level.SEVERE, null, ex);
     }
         System.out.printf("Serialized data is saved in /tmp/employee.ser");
    
            

    }//GEN-LAST:event_savegameButtonActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
     
        first_page.image1.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
    if(first_page.active_turn == -1)
            first_page.active_turn = 0;

        name_label.setVisible(true);
        nameText.setVisible(true);
        BendTurn.setVisible(false);
        savegameButton.setVisible(true);
        p = new Player();
        p.save_turn = first_page.active_turn;
        
        System.out.println("save turn variable: " + p.save_turn);        
        System.out.println("players detail:\n\t");
        
        for(int i =0;i<playerObj.length;i++){          
            System.out.println("player: " +(i+1) + "\n\t" + "Personality: " + playerObj[i].Personality + "\n\t" + "Color: " + playerObj[i].Color + "\n\t" + "Cash in hand:" +  playerObj[i].cashInHand + "\n\t" + "turn:" + playerObj[i].turn + "\n\t" + "buildings: "+ playerObj[i].buildInHand + "\n\t" + "minions: " + playerObj[i].minionInHand + "\n\t" + "cards: " +"\t" );
            for(int j=0;j<5;j++)
            System.out.println(first_page.playerObj[i].CardsInHand[j]);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        gameBoard b1 = new gameBoard();
        b1.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Random dice = new Random ();
        int val = 1+dice.nextInt(12);
        String s=""+val;
        diceV.setText(s);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Abuildings;
    public javax.swing.JLabel Acards;
    public javax.swing.JLabel Acash;
    public javax.swing.JLabel Acolor;
    public javax.swing.JLabel Aminions;
    public javax.swing.JLabel Apersonality;
    private javax.swing.JButton BendTurn;
    private javax.swing.JLabel LactivePlayer;
    public javax.swing.JLabel Lbuildings;
    public javax.swing.JLabel Lcards;
    public javax.swing.JLabel Lcash;
    public javax.swing.JLabel Lcolor;
    public javax.swing.JLabel Lminions;
    public javax.swing.JLabel Lplayer;
    public javax.swing.JLabel bankText;
    private javax.swing.ButtonGroup cardGroup;
    public javax.swing.JLabel demonsText;
    private javax.swing.JTextField diceV;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton11;
    private javax.swing.JRadioButton jRadioButton12;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JTextField jTextField2;
    public javax.swing.JTextField nameText;
    public javax.swing.JLabel name_label;
    private javax.swing.ButtonGroup payGroup;
    private javax.swing.ButtonGroup pieceGroup;
    public javax.swing.JLabel playerText;
    private javax.swing.JButton saveButton;
    public javax.swing.JButton savegameButton;
    public javax.swing.JLabel tmText;
    public javax.swing.JLabel trollsText;
    // End of variables declaration//GEN-END:variables
}