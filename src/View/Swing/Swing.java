package View.Swing;

import Controller.Controller;
import Model.Currency;
import Model.Money;
import Persistance.RateLoader;
import View.Dialog;
import View.Display;
import java.util.List;


public class Swing extends javax.swing.JFrame implements Dialog, Display{
    private final RateLoader rateLoader;
    private final List<Currency> currencies;
    private final String[] currenciesCombobox;
    private final Controller controller;
    
    
    public Swing(List<Currency> currencies, RateLoader rateLoader) {
        this.currencies=currencies;
        this.currenciesCombobox=createCurrencyArray(currencies);
        this.rateLoader=rateLoader;
        this.controller= new Controller(this, rateLoader, this);
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelDialog = new javax.swing.JPanel();
        jPanelDisplay = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResult = new javax.swing.JTextArea();
        jLabelResult = new javax.swing.JLabel();
        jLabelFrom = new javax.swing.JLabel();
        jTextFieldFrom = new javax.swing.JTextField();
        jComboBoxFrom = new javax.swing.JComboBox<>();
        jComboBoxTo = new javax.swing.JComboBox<>();
        jLabelTo = new javax.swing.JLabel();
        jButtonConvert = new javax.swing.JButton();
        jLabelTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelDialog.setBackground(new java.awt.Color(153, 204, 255));

        jPanelDisplay.setBackground(new java.awt.Color(153, 204, 255));

        jTextAreaResult.setColumns(20);
        jTextAreaResult.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextAreaResult.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResult);

        jLabelResult.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelResult.setText("Result:");

        javax.swing.GroupLayout jPanelDisplayLayout = new javax.swing.GroupLayout(jPanelDisplay);
        jPanelDisplay.setLayout(jPanelDisplayLayout);
        jPanelDisplayLayout.setHorizontalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisplayLayout.createSequentialGroup()
                .addGroup(jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDisplayLayout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelDisplayLayout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(jLabelResult)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanelDisplayLayout.setVerticalGroup(
            jPanelDisplayLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDisplayLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabelResult)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jLabelFrom.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelFrom.setText("From...");

        jTextFieldFrom.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jTextFieldFrom.setToolTipText("Amount");
        jTextFieldFrom.setActionCommand("<Not Set>");

        jComboBoxFrom.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBoxFrom.setModel(new javax.swing.DefaultComboBoxModel<>(currenciesCombobox));

        jComboBoxTo.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jComboBoxTo.setModel(new javax.swing.DefaultComboBoxModel<>(currenciesCombobox));

        jLabelTo.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jLabelTo.setText("To...");

        jButtonConvert.setBackground(new java.awt.Color(153, 204, 255));
        jButtonConvert.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        jButtonConvert.setText("Convert");
        jButtonConvert.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonConvert.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonConvert.setName(""); // NOI18N
        jButtonConvert.setRolloverEnabled(false);
        jButtonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConvertActionPerformed(evt);
            }
        });

        jLabelTitle.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        jLabelTitle.setLabelFor(jPanelDialog);
        jLabelTitle.setText("Money Calculator");

        javax.swing.GroupLayout jPanelDialogLayout = new javax.swing.GroupLayout(jPanelDialog);
        jPanelDialog.setLayout(jPanelDialogLayout);
        jPanelDialogLayout.setHorizontalGroup(
            jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanelDialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFrom)
                    .addGroup(jPanelDialogLayout.createSequentialGroup()
                        .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 105, Short.MAX_VALUE)
                .addGroup(jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTo)
                    .addComponent(jComboBoxTo, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(82, 82, 82))
            .addGroup(jPanelDialogLayout.createSequentialGroup()
                .addGroup(jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDialogLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButtonConvert))
                    .addGroup(jPanelDialogLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabelTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelDialogLayout.setVerticalGroup(
            jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDialogLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDialogLayout.createSequentialGroup()
                        .addComponent(jLabelFrom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelDialogLayout.createSequentialGroup()
                        .addComponent(jLabelTo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jButtonConvert)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelDialog, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanelDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**/
    private void jButtonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConvertActionPerformed
        this.controller.execute();
    }//GEN-LAST:event_jButtonConvertActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConvert;
    private javax.swing.JComboBox<String> jComboBoxFrom;
    private javax.swing.JComboBox<String> jComboBoxTo;
    private javax.swing.JLabel jLabelFrom;
    private javax.swing.JLabel jLabelResult;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelTo;
    private javax.swing.JPanel jPanelDialog;
    private javax.swing.JPanel jPanelDisplay;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResult;
    private javax.swing.JTextField jTextFieldFrom;
    // End of variables declaration//GEN-END:variables

    @Override
    public Money getAmount() {
        Money money = null;
        int index = jComboBoxFrom.getSelectedIndex();
        try {
            money = new Money(Double.parseDouble(jTextFieldFrom.getText()), currencies.get(index));
            
        } catch (Exception e){
            money = new Money(Double.parseDouble("0"), currencies.get(index));
        }
        return money;
    }
    
    @Override
    public Currency getFrom(){
        return currencies.get(jComboBoxFrom.getSelectedIndex());
    }

    
    @Override
    public Currency getTo() {
        return currencies.get(jComboBoxTo.getSelectedIndex());
    }

    @Override
    public void display(Money money) {
        jTextAreaResult.setText(money.toString());
    }

    private String[] createCurrencyArray(List<Currency> currencies) {
        String[] stringArray = new String[currencies.size()];
        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i]=currencies.get(i).toString();
        }
        return stringArray;
    }
}
