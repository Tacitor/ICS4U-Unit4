/*
 * Lukas Krampitz
 * Oct 22, 2020
 * A program which allows the user to compare the efficiency to four different sorting algorithms
 */
package krampitzsortingefficiencies;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 *
 * @author Tacitor
 */
public class SortingUI extends javax.swing.JFrame {
    
    //Input vars
    private static int numSort;
    private static int sortType;
    private static boolean ascendSort;
    //string based File vars
    private final static String ADR10 = "src\\krampitzsortingefficiencies\\10nums.txt";
    private final static String ADR10000 = "src\\krampitzsortingefficiencies\\10000nums.txt";
    private static String adr;
    //Arrays
    private static int[] numsBubble;
    private static int[] numsQuik;  
    private static int[] numsSelec;  
    private static int[] numsInsert;  
    //Statastic and result based vars
    private static int tempInt;
    private static int timesLooped = 0;
    private static long timeStart;
    private static long timeFin;
    private static String stats = "";
    private static String errorMsg;
    private static final String LOOP_STRING = "\nNumber of times a loop was executed: ";
    private static final String TIME_STRING = "\nNumber of miliseconds to complete sort: ";

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
        setTitle("Sorting Algorithms Benchmark");

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
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(sortResultLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 412, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sortResultLbl, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(numSortLbl)
                        .addComponent(num10Btn)
                        .addComponent(num10000Btn)))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SortBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SortBtnActionPerformed
        // TODO add your handling code here:
        //clear the stats
        stats = "";

        //get all the sorting type data
        getInput();

        //debug input
        //System.out.println("Algorithm: " + sortType + "\nNumber: " + numSort + "\nAscending? : " + ascendSort);
        
        //Initialize arrays
        numsBubble = new int[numSort]; //set the length
        loadFile(numsBubble, adr); //set the numbers to be sorted
        numsQuik = new int[numSort];
        loadFile(numsQuik, adr); //create a second one
        numsSelec = new int[numSort];
        loadFile(numsSelec, adr); //create a third one
        numsInsert = new int[numSort];
        loadFile(numsInsert, adr); //create a fourth one

        //System.out.println(numsBubble); //debug array
        
        //add the original unsorted arrays
        displayNums(numsBubble, originalNumTxt, "");
        
        //pick a way to sort the arrays and then sort them          **Note on what looks like repeated code** Well it doesn't just look like it, it is buuut there is a good reason for me not using paralell structure here and that is because I need the times DIRECTLY before and after sorting, therefore no method calls.
        if (ascendSort) {
            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            selectionSort(numsSelec);
            timeFin = System.currentTimeMillis();
            stats += "Selection Sort Ascending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
            //sort all arrays and store preformace values
            timesLooped = 0; //reset times looped
            timeStart = System.currentTimeMillis(); //get the time before
            bubbleSort(numsBubble); //actully sort
            timeFin = System.currentTimeMillis(); //get the time after
            stats += "\n\nBubble Sort Ascending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart); //save the data for output later

            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            insertionSort(numsInsert);
            timeFin = System.currentTimeMillis();
            stats += "\n\nInsertion Sort Ascending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            quikSort(numsQuik, 0, numsQuik.length - 1);
            timeFin = System.currentTimeMillis();
            stats += "\n\nQuik Sort Ascending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
        } else {            
            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            selectionSortDec(numsSelec);
            timeFin = System.currentTimeMillis();
            stats += "Selection Sort Descending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
            //sort all arrays and store preformace values
            timesLooped = 0; //reset times looped
            timeStart = System.currentTimeMillis();
            bubbleSortDec(numsBubble);
            timeFin = System.currentTimeMillis();
            stats += "\n\nBubble Sort Descending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            insertionSortDec(numsInsert);
            timeFin = System.currentTimeMillis();
            stats += "\n\nInsertion Sort Descending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
            
            //reset times looped
            timesLooped = 0;
            timeStart = System.currentTimeMillis();
            quikSortDec(numsQuik, 0, numsQuik.length - 1);
            timeFin = System.currentTimeMillis();
            stats += "\n\nQuik Sort Descending:" + LOOP_STRING + timesLooped + TIME_STRING + (timeFin - timeStart);
        }

        //check for parity
        if (Arrays.equals(numsBubble, numsQuik) && Arrays.equals(numsBubble, numsInsert) && Arrays.equals(numsBubble, numsSelec)) {
            errorMsg = "Global parity true";
        } else {
            errorMsg = "Global parity error";
        }

        //add the sorted array to the display. even though they should be the same only add the one from the selected algorythm
        if (sortType == 0) {
            displayNums(numsSelec, sortedNumTxt, errorMsg);
        } else if (sortType == 1) {
            displayNums(numsBubble, sortedNumTxt, errorMsg);
        } else if (sortType == 2) {
            displayNums(numsInsert, sortedNumTxt, errorMsg);
        } else if (sortType == 3) {
            displayNums(numsQuik, sortedNumTxt, errorMsg);
        }

        //display stats
        sortResultTxt.setText(stats);

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
    
    /**
     * Update a JTextArea with an array of integers and a message at the end
     * @param a the array of integers
     * @param txt the JTextArea to update
     * @param msg the message to append (can be blank/0 width space char but not null)
     */
    public void displayNums(int[] a, JTextArea txt, String msg) {
        String txtStr = ""; //a string to hold all the ints
        for (int i = 0; i < a.length; i++) { //loop thorugh and add all the ints to the string
            txtStr += i + ": " + a[i] + "\n";
        }
        txt.setText(txtStr + msg); //update the JTextAre and append a message
    }
    
    /**
     * Sort an Array of integers in ascending order using Quik Sort
     * @param a the array
     * @param left the leftmost threshold to focus on
     * @param right the rightmost threshold to focus on
     */
    public static void quikSort(int[] a, int left, int right) {
        //check base case is there even anything left unsorted?
        if (left >= right) {
            return; //if nothing left return
        }
        int pivot = a[(left + right) / 2]; //a pivot point in the middle index wise
        int i = left;
        int j = right;
        while (i < j) { //loop so long as the left sweeper is still left of the right sweeper
            //find an int on the left that should not be
            while (a[i] < pivot) {
                i++;
                timesLooped++;
            }
            //find an int on the right that should not be
            while (a[j] > pivot) {
                j--;
                timesLooped++;
            }
            //swap them
            if (i <= j) {
                tempInt = a[i];
                a[i] = a[j];
                a[j] = tempInt;
                i++;
                j--;
            }
        }
        //go thorugh and pick a new pivot within each of the two new sections created
        quikSort(a, left, j);
        quikSort(a, i, right);
    }
    
    /**
     * Sort an Array of integers in descending order using Quik Sort
     * @param a
     * @param left
     * @param right 
     */
    public static void quikSortDec(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a[(left + right) / 2];
        int i = left;
        int j = right;
        while (i < j) {
            while (a[i] > pivot) { //DIFFERENCE! Here the operator sign is fliped to change it to decending order
                i++;
                timesLooped++;
            }
            while (a[j] < pivot) { //DIFFERENCE! Here the operator sign is fliped to change it to decending order
                j--;
                timesLooped++;
            }
            if (i <= j) {
                tempInt = a[i];
                a[i] = a[j];
                a[j] = tempInt;
                i++;
                j--;
            }
        }
        quikSortDec(a, left, j);
        quikSortDec(a, i, right);
    }
    
    /**
     * Sort an Array of integers in ascending order using Insertion Sort
     * @param a 
     */
    public static void insertionSort(int[] a) {
        //go through each index, first one is always considered sorted so skip it
        for (int n = 1; n < a.length; n++) {
            tempInt = a[n]; //temporarily stores the value
            int j = n - 1; //the value before the current one
            while (j >= 0 && a[j] > tempInt) { //loop until all the smaller ones that need to be inserted have been inserted
                a[j + 1] = a[j]; //overwrite the value to shift evrything else over. The loop will keep doing this until the correct spot is found
                j--;
                timesLooped++; //count a loop
            }
            a[j + 1] = tempInt; //finally set the value to its correct spot
        }
    }
    
    /**
     * Sort an Array of integers in ascending order using Insertion Sort
     * @param a 
     */
    public static void insertionSortDec(int[] a) {
        //go through each index, first one is always considered sorted so skip it
        for (int n = 1; n < a.length; n++) {
            tempInt = a[n];
            int j = n - 1;
            while (j >= 0 && a[j] < tempInt) { //DIFFERNCE! change the order of the comparison opperator so that now the big values get moved up
                a[j + 1] = a[j];
                j--;
                timesLooped++;
            }
            a[j + 1] = tempInt;
        }
    }
    
    /**
     * Sort an Array of integers in ascending order using Bubble Sort
     * @param a the array
     */
    public static void bubbleSort(int[] a) {
        int bottom = a.length - 1; //the bottom is the last value/highest index
        boolean swch = true; //have any values been swaped yet/are we done sorting?
        while (swch) {
            swch = false;
            for (int j = 0; j < bottom; j++) { //go through the array
                timesLooped++; //the deepest part of the loop so count every time this executes
                if (a[j] > (a[j + 1])) { //check if it need to moved down
                    //move it down
                    tempInt = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tempInt;
                    //note a switch
                    swch = true;
                }
            }
            //we have now just added the next biggest value to the back, no need to check that anymore
            bottom--;
        }
    }
    
    /**
     * Sort an Array of integers in descending order using Bubble Sort
     * @param a 
     */
    public static void bubbleSortDec(int[] a) {
        int bottom = a.length - 1; //the bottom is the last value/highest index
        boolean swch = true; //have any values been swaped yet/are we done sorting?
        while (swch) {
            swch = false;
            for (int j = 0; j < bottom; j++) {
                timesLooped++;
                if (a[j] < (a[j + 1])) { //check if it need to moved down DIFFERNCE! this time the comparion operator has switched, now checking for smaller values to move down
                    //move it down
                    tempInt = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = tempInt;
                    //note a switch
                    swch = true;
                }
            }
            //we have now just added the next SMALLEST value to the back, no need to check that anymore
            bottom--;
        }
    }
    
    /**
     * Sort an Array of integers in ascending order using Selection Sort
     * @param a 
     */
    public static void selectionSort(int[] a) {
        //go through every index from left to right.
        for (int i = 0; i < a.length - 1; i++) {
            //find the smallest remaining one, start after what is already sorted (at the left/begining)
            for (int j = i + 1; j < a.length; j++) {
                timesLooped++;
                if (a[i] > a[j]) { //if its the smallest remaining one swap it
                    tempInt = a[j];
                    a[j] = a[i];
                    a[i] = tempInt;
                }
            }
        }
    }
    
    /**
     * Sort an Array of integers in descending order using Selection Sort
     * @param a 
     */
    public static void selectionSortDec(int[] a) {
        //go through every index from right to left, ignor the last one as it will just end up as being the largest
        for (int i = 0; i < a.length - 1; i++) {
            //find the smallest remaining one, start after what is already sorted (at the left/begining)
            for (int j = i + 1; j < a.length; j++) {
                timesLooped++;
                if (a[i] < a[j]) { //DIFFERENCE! the opperator sign, I'm starting to notice a pattern ;)
                    tempInt = a[j];
                    a[j] = a[i];
                    a[i] = tempInt;
                }
            }
        }
    }
    
    /**
     * Collect input from the GUI and assign according global variables to be used later
     */
    public void getInput() {
        //check what set to sort
        if (num10Btn.isSelected()) {
            numSort = 10;
            adr = ADR10;
        } else {
            numSort = 10000;
            adr = ADR10000;
        }
        //check the way to sort them
        ascendSort = ascendingRbtn.isSelected();
        //and get the type of algorthym to use as the main one (display results to the user)
        sortType = sortTypeBox.getSelectedIndex();
    }
    
    /**
     * Load a given data file of integers into a given array
     * @param a the array to load
     * @param adr the address of the data file
     */
    protected static void loadFile(int[] a, String adr) {
        //try and find the file
        try {
            File file = new File(adr); //load the file
            Scanner scanner = new Scanner(file); //give it a scanner

            //load up the array with ints
            for (int i = 0; i < a.length; i++) {
                a[i] = (Integer.parseInt(scanner.nextLine()));
            }

        } catch (FileNotFoundException e) { //catch if there is not file to be found
            System.out.println("Error: " + e);
        }
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
