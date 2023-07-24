/*
Created by Conner Recoskie
Date: March 2, 2023
This program allow the user to input a number from 1 to 52, or get a random
number in that range. The program then calculates and returns the corresponding
card value and the details of the card.
*/

public class FrmCards extends javax.swing.JFrame {
    // Declaring a global variable to hold the card number 
    int cardNumber;
    
    // Declaring a global variable to hold the status of a "repetition" check
    // This variable makes it possible for the program to check if the random button is used
    boolean repCheck = false;
    
    /*
    determineColor
    This method receives the cardNumber value, it the calculates and returns the
    color of the card.
    Parameters: int
    Returns: String
    */
    public static String determineColor (int cardNumber)
    {
        // Declaring a local variable to hold the color of the card
        String cardColor;
        
        if (cardNumber % 2 == 0)
        {
            cardColor = "Your card is red!";
        }
        else
        {
            cardColor = "Your card is black!";
        }
        
        return cardColor;
    }
    
    /*
    determineSuit
    This method receives the cardNumber value, it then calculates and returns
    the suit of the card.
    Parameters: int
    Returns: String
    */
    public static String determineSuit (int cardNumber)
    {
        String cardSuit;
        String[] suits = {"Clubs", "Spades", "Hearts", "Diamonds"};
        int suitIndex = (cardNumber - 1) / 13;
        cardSuit = suits[suitIndex];
        
        return cardSuit;
    }
    
    /*
    determineCardValue
    This method receives the cardNumber value, it then calculates and returns
    the value of the card, relative to a deck of cards.
    Parameters: int
    Returns: String
    */
    public static String determineCardValue (int cardNumber)
    {
        int cardNumbered = (cardNumber - 1) % 13 + 1;
        String cardValue;

        cardValue = switch (cardNumbered) {
            case 1 -> "Ace";
            case 11 -> "Jack";
            case 12 -> "Queen";
            case 13 -> "King";
            default -> String.valueOf(cardNumbered);
        };
        
        return cardValue;
    }
    
    public FrmCards() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblInstructions = new javax.swing.JLabel();
        txtCardInput = new javax.swing.JTextField();
        btnGetRandomNumber = new javax.swing.JButton();
        lblInstructions1 = new javax.swing.JLabel();
        lblClarification = new javax.swing.JLabel();
        btnGetCard = new javax.swing.JButton();
        lblColor = new javax.swing.JLabel();
        lblInstructions2 = new javax.swing.JLabel();
        lblSuit = new javax.swing.JLabel();
        lblCardNum = new javax.swing.JLabel();
        lblSubTitle = new javax.swing.JLabel();
        lblColorOfCard = new javax.swing.JLabel();
        lblSuitOfCard = new javax.swing.JLabel();
        lblCardNumber = new javax.swing.JLabel();
        lblSubHeading1 = new javax.swing.JLabel();
        lblSubHeading2 = new javax.swing.JLabel();
        lblNum = new javax.swing.JLabel();
        lblNumFromUser = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitle.setFont(new java.awt.Font("Sitka Heading", 1, 15)); // NOI18N
        lblTitle.setText("Card Determiner");

        lblInstructions.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblInstructions.setText("Please enter an integer between 1 and 52 or click");

        btnGetRandomNumber.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        btnGetRandomNumber.setText("Generate random #");
        btnGetRandomNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetRandomNumberActionPerformed(evt);
            }
        });

        lblInstructions1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblInstructions1.setText("the button below to generate a random one. Then");

        lblClarification.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N

        btnGetCard.setText("Get card details");
        btnGetCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGetCardActionPerformed(evt);
            }
        });

        lblColor.setText("The color of the card is: ");

        lblInstructions2.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        lblInstructions2.setText("click \"Get card details\".");

        lblSuit.setText("The suit of the card is:");

        lblCardNum.setText("The card number is:");

        lblSubTitle.setFont(new java.awt.Font("Sitka Banner", 1, 16)); // NOI18N
        lblSubTitle.setText("<html><u>Card Details</ul></html>");

        lblColorOfCard.setText(" ");

        lblSuitOfCard.setText(" ");

        lblSubHeading1.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        lblSubHeading1.setText("Input # here");

        lblSubHeading2.setFont(new java.awt.Font("Segoe UI", 1, 9)); // NOI18N
        lblSubHeading2.setText("or");

        lblNum.setText("Number:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitle)
                .addGap(73, 73, 73))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblInstructions)
                    .addComponent(lblInstructions1)
                    .addComponent(lblInstructions2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCardInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblSuit)
                    .addComponent(lblCardNum)
                    .addComponent(btnGetCard)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(btnGetRandomNumber))
                    .addComponent(lblClarification, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSubHeading1)
                        .addGap(66, 66, 66)
                        .addComponent(lblSubHeading2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblColor)
                            .addComponent(lblNum, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblSuitOfCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblColorOfCard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNumFromUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInstructions)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInstructions2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSubHeading1)
                    .addComponent(lblSubHeading2))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCardInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGetRandomNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClarification, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSubTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGetCard, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNumFromUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblColor)
                    .addComponent(lblColorOfCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSuit)
                    .addComponent(lblSuitOfCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCardNum)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblCardNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnGetRandomNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetRandomNumberActionPerformed
        // Generate a random number between 1 and 52, cast it to an integer, and assign it to the variable cardNumber
        cardNumber = (int) (Math.random() * 52) + 1;
        
        // Output the card number generated to the user
        lblClarification.setText("Your random # is " + cardNumber + " .");
        
        // Set the value of repCheck to true, indicating that the randomize button has been used
        repCheck = true;
    }//GEN-LAST:event_btnGetRandomNumberActionPerformed

    private void btnGetCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGetCardActionPerformed
        // Declaring variables to hold card color, suit, and value
        String cardColor;
        String cardSuit;
        String cardsValue;
        
        // Declaring boolean variables for error checking
        boolean errorCheck = true;
        boolean errorCheck1 = true;
        
        // Checking if user used the "randomize" button or not
        if (repCheck == false)
        {
            // Trying to parse user input as integer
            try
            {
                cardNumber = Integer.parseInt(txtCardInput.getText());
            }
            catch (NumberFormatException e)
            {
                // Set error message and display "N/A" values to GUI
                lblClarification.setText("Invalid Input");
                lblNumFromUser.setText("N/A");
                lblColorOfCard.setText("N/A");
                lblSuitOfCard.setText("N/A");
                lblCardNumber.setText("N/A");
                
                // Set errorCheck to false
                errorCheck = false;
            }
        }
        
        // Check if correct dara type was inputted 
        if (errorCheck)
        {
            // Check if cardNumber is greater than 52
            if (cardNumber > 52)
            {
                // If it is not, Set error message and display "N/A" values to GUI
                lblClarification.setText("This number it too large");
                lblNumFromUser.setText("N/A");
                lblColorOfCard.setText("N/A");
                lblSuitOfCard.setText("N/A");
                lblCardNumber.setText("N/A");
                errorCheck1 = false;
            }
            // Check if cardNumber is less than 1
            else if (cardNumber < 1)
            {
                // If it is, Set error message and display "N/A" values to GUI
                lblClarification.setText("This number is too small");
                lblNumFromUser.setText("N/A");
                lblColorOfCard.setText("N/A");
                lblSuitOfCard.setText("N/A");
                lblCardNumber.setText("N/A");
                errorCheck1 = false;
            }
        }
        
        // Check if input is in correct terms, countinue operation if it is
        if (errorCheck && errorCheck1)
        {
            // Pass cardNumber to methods to determine card color, suit, and value
            cardColor = determineColor(cardNumber);
            cardSuit = determineSuit(cardNumber);
            cardsValue = determineCardValue(cardNumber);
            
            // Update GUI labels with card information
            lblNumFromUser.setText(String.valueOf(cardNumber));
            lblColorOfCard.setText(cardColor);
            lblSuitOfCard.setText(cardSuit);
            lblCardNumber.setText(cardsValue);
            
            // Setting clarification label blank
            lblClarification.setText("");
            
            // Set the variable that checks if the randomize button is used to false 
            repCheck = false;
        }
    }//GEN-LAST:event_btnGetCardActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCards.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCards().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGetCard;
    private javax.swing.JButton btnGetRandomNumber;
    private javax.swing.JLabel lblCardNum;
    private javax.swing.JLabel lblCardNumber;
    private javax.swing.JLabel lblClarification;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblColorOfCard;
    private javax.swing.JLabel lblInstructions;
    private javax.swing.JLabel lblInstructions1;
    private javax.swing.JLabel lblInstructions2;
    private javax.swing.JLabel lblNum;
    private javax.swing.JLabel lblNumFromUser;
    private javax.swing.JLabel lblSubHeading1;
    private javax.swing.JLabel lblSubHeading2;
    private javax.swing.JLabel lblSubTitle;
    private javax.swing.JLabel lblSuit;
    private javax.swing.JLabel lblSuitOfCard;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCardInput;
    // End of variables declaration//GEN-END:variables
}
