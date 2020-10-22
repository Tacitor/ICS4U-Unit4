/*
 * Lukas Krampitz
 * Oct 22, 2020
 * A program which allows the user to compare the efficiency to two different sorting algorithms
 */
package krampitzsortingefficiencies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class SortingUI extends javax.swing.JFrame {
    
    private static int numSort;
    private static int sortType;
    private static boolean ascendSort;
    String adr10 = "src\\krampitzsortingefficiencies\\10nums.txt";
    String adr10000 = "src\\krampitzsortingefficiencies\\10000nums.txt";

    /**
     * Creates new form SortingUI
     */
    public SortingUI() {
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

        numSortGrp = new javax.swing.ButtonGroup();
        orderGrp = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        sortResultTxt = new javax.swing.JTextArea();
        num10000Btn = new javax.swing.JRadioButton();
        ascendingRbtn = new javax.swing.JRadioButton();
        numSortLbl = new javax.swing.JLabel();
        sortTypeBox = new javax.swing.JComboBox<>();
        descendingRbtn = new javax.swing.JRadioButton();
        SortBtn = new javax.swing.JButton();
        orderLbl = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        sortedNumTxt = new javax.swing.JTextArea();
        titleLbl = new javax.swing.JLabel();
        sortTypeLbl = new javax.swing.JLabel();
        originalNumsLbl = new javax.swing.JLabel();
        num10Btn = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        originalNumTxt = new javax.swing.JTextArea();
        sortResultLbl = new javax.swing.JLabel();
        sortedNumsLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sorting Comparison");
        setAlwaysOnTop(true);

        jPanel1.setBackground(new java.awt.Color(214, 255, 220));
        jPanel1.setForeground(new java.awt.Color(254, 255, 176));

        sortResultTxt.setColumns(20);
        sortResultTxt.setRows(5);
        jScrollPane3.setViewportView(sortResultTxt);

        num10000Btn.setBackground(new java.awt.Color(214, 255, 220));
        numSortGrp.add(num10000Btn);
        num10000Btn.setText("10,000");

        ascendingRbtn.setBackground(new java.awt.Color(214, 255, 220));
        orderGrp.add(ascendingRbtn);
        ascendingRbtn.setSelected(true);
        ascendingRbtn.setText("Ascending");

        numSortLbl.setText("Amount of numbers to sort:");

        sortTypeBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selection Sort", "Bubble Sort", "Insertion Sort", "Quik Sort" }));

        descendingRbtn.setBackground(new java.awt.Color(214, 255, 220));
        orderGrp.add(descendingRbtn);
        descendingRbtn.setText("Descending");

        SortBtn.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        SortBtn.setText("Sort");
        SortBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortBtnActionPerformed(evt);
            }
        });

        orderLbl.setText("Sort Order:");

        sortedNumTxt.setColumns(20);
        sortedNumTxt.setRows(5);
        jScrollPane2.setViewportView(sortedNumTxt);

        titleLbl.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        titleLbl.setText("Sorting Efficiencies");

        sortTypeLbl.setText("Selected Sorting Algorithm:");

        originalNumsLbl.setText("Original Numbers:");

        num10Btn.setBackground(new java.awt.Color(214, 255, 220));
        numSortGrp.add(num10Btn);
        num10Btn.setSelected(true);
        num10Btn.setText("10");

        originalNumTxt.setColumns(20);
        originalNumTxt.setRows(5);
        jScrollPane1.setViewportView(originalNumTxt);

        sortResultLbl.setText("Sort Results:");

        sortedNumsLbl.setText("Sorted Numbers:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(SortBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(orderLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ascendingRbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(descendingRbtn))
                            .addComponent(originalNumsLbl)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sortedNumsLbl)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(titleLbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(numSortLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num10Btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(num10000Btn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sortTypeLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sortTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sortResultLbl))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numSortLbl)
                    .addComponent(num10Btn)
                    .addComponent(num10000Btn)
                    .addComponent(sortResultLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sortTypeLbl)
                            .addComponent(sortTypeBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(orderLbl)
                            .addComponent(ascendingRbtn)
                            .addComponent(descendingRbtn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(SortBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(originalNumsLbl)
                            .addComponent(sortedNumsLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortBtnActionPerformed
        // TODO add your handling code here:
        //get all the sorting type data
        if (num10Btn.isSelected()) {
            numSort = 10;
        } else {
            numSort = 10000;
        }

        if (ascendingRbtn.isSelected()) {
            ascendSort = true;
        } else {
            ascendSort = false;
        }

        sortType = sortTypeBox.getSelectedIndex();

        System.out.println("Algorithm: " + sortType + "\nNumber: " + numSort + "\nAscending? : " + ascendSort);
        
        ArrayList<Integer> tenNums = loadFile10(adr10);
        System.out.println(tenNums);
        System.out.println(tenNums.get(tenNums.size() - 1));
        
    }//GEN-LAST:event_SortBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortingUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SortingUI().setVisible(true);
            }
        });
    }
    
    protected static ArrayList<Integer> loadFile10(String adr) {
        ArrayList<Integer> array = new ArrayList();
        

        try {
            File file = new File(adr);
            Scanner scanner = new Scanner(file);

            //load up
            while (scanner.hasNextLine()) {

                array.add(Integer.parseInt(scanner.nextLine()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        return array;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SortBtn;
    private javax.swing.JRadioButton ascendingRbtn;
    private javax.swing.JRadioButton descendingRbtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton num10000Btn;
    private javax.swing.JRadioButton num10Btn;
    private javax.swing.ButtonGroup numSortGrp;
    private javax.swing.JLabel numSortLbl;
    private javax.swing.ButtonGroup orderGrp;
    private javax.swing.JLabel orderLbl;
    private javax.swing.JTextArea originalNumTxt;
    private javax.swing.JLabel originalNumsLbl;
    private javax.swing.JLabel sortResultLbl;
    private javax.swing.JTextArea sortResultTxt;
    private javax.swing.JComboBox<String> sortTypeBox;
    private javax.swing.JLabel sortTypeLbl;
    private javax.swing.JTextArea sortedNumTxt;
    private javax.swing.JLabel sortedNumsLbl;
    private javax.swing.JLabel titleLbl;
    // End of variables declaration//GEN-END:variables
}
