package org.cytoscape.grncop2.view.resultPanel;

import java.awt.Component;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.Icon;
import javax.swing.JFileChooser;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.cytoscape.application.swing.CytoPanelComponent;
import org.cytoscape.application.swing.CytoPanelName;
import org.cytoscape.grncop2.controller.NetworkController;
import org.cytoscape.grncop2.controller.ResultPanelController;
import org.cytoscape.grncop2.controller.utils.CySwing;
import org.cytoscape.grncop2.model.businessobjects.Rule;

/**
 * @license Apache License V2 <http://www.apache.org/licenses/LICENSE-2.0.html>
 * @author Juan José Díaz Montaña
 */
public class MainResultsView extends javax.swing.JPanel implements CytoPanelComponent {
    private final ResultPanelController resultPanelController;
    private final NetworkController network;
    private Integer lag = 0;
    private final int maxLag;
    private List<Rule> rules;
    
    /**
     * Creates new form MainResultsView
     */
    public MainResultsView(ResultPanelController resultPanelController) {
        this.resultPanelController = resultPanelController;
        this.network = resultPanelController.getNetwork();
        this.maxLag = this.resultPanelController.getResult().getGRNs()[0].length - 1;
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

        rcaLabel = new javax.swing.JLabel();
        rcaSlider = new javax.swing.JSlider();
        rcaTextField = new javax.swing.JTextField();
        accuracyLabel = new javax.swing.JLabel();
        accuracySlider = new javax.swing.JSlider();
        accuracyTextField = new javax.swing.JTextField();
        coverageLabel = new javax.swing.JLabel();
        coverageSlider = new javax.swing.JSlider();
        coverageTextField = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        rulesLabel = new javax.swing.JLabel();
        rulesPane = new javax.swing.JScrollPane();
        rulesTable = new javax.swing.JTable();
        downloadResultsButton = new javax.swing.JButton();
        closeResultsButton = new javax.swing.JButton();
        applyFiltersButton = new javax.swing.JButton();
        prevWindowButton = new javax.swing.JButton();
        lagTextField = new javax.swing.JTextField();
        nextWindowButton = new javax.swing.JButton();
        showAllToggleButton = new javax.swing.JToggleButton();
        jSeparator3 = new javax.swing.JSeparator();

        rcaLabel.setText("RCA");

        rcaSlider.setToolTipText("");
        rcaSlider.setValue(95);

        rcaTextField.setText("" + rcaSlider.getValue());
        rcaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rcaTextFieldActionPerformed(evt);
            }
        });
        rcaTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                rcaTextFieldFocusLost(evt);
            }
        });

        accuracyLabel.setText("Accuracy");

        accuracySlider.setToolTipText("");
        accuracySlider.setValue(95);

        accuracyTextField.setText("" + accuracySlider.getValue());
        accuracyTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                accuracyTextFieldActionPerformed(evt);
            }
        });
        accuracyTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                accuracyTextFieldFocusLost(evt);
            }
        });

        coverageLabel.setText("Percentage");

        coverageSlider.setValue(95);

        coverageTextField.setText("" + coverageSlider.getValue());
        coverageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coverageTextFieldActionPerformed(evt);
            }
        });
        coverageTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                coverageTextFieldFocusLost(evt);
            }
        });

        rulesLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        rulesLabel.setText("Inferred Rules");

        refreshNetwork();
        rulesPane.setViewportView(rulesTable);

        downloadResultsButton.setText("Save inferred rules");
        downloadResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadResultsButtonActionPerformed(evt);
            }
        });

        closeResultsButton.setText("Close results");
        closeResultsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeResultsButtonActionPerformed(evt);
            }
        });

        applyFiltersButton.setText("Apply filters");
        applyFiltersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFiltersButtonActionPerformed(evt);
            }
        });

        prevWindowButton.setText("<");
        prevWindowButton.setEnabled(false);
        prevWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevWindowButtonActionPerformed(evt);
            }
        });

        lagTextField.setText(Integer.toString(lag));
        lagTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lagTextFieldActionPerformed(evt);
            }
        });

        nextWindowButton.setText(">");
        nextWindowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextWindowButtonActionPerformed(evt);
            }
        });

        showAllToggleButton.setText("Show all");
        showAllToggleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllToggleButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rulesPane, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(rulesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(downloadResultsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(closeResultsButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rcaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(accuracyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(coverageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rcaSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(accuracySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(coverageSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(applyFiltersButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(rcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(accuracyTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                                    .addComponent(coverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevWindowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lagTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextWindowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAllToggleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rcaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rcaSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rcaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(accuracyTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accuracySlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(accuracyLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(coverageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(coverageSlider, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(coverageLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(applyFiltersButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prevWindowButton)
                    .addComponent(nextWindowButton)
                    .addComponent(lagTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAllToggleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rulesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rulesPane, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(downloadResultsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeResultsButton)
                .addContainerGap())
        );

        rcaSlider.addChangeListener(new SliderChangeListener(rcaTextField));
        accuracySlider.addChangeListener(new SliderChangeListener(accuracyTextField));
        coverageSlider.addChangeListener(new SliderChangeListener(coverageTextField));
    }// </editor-fold>//GEN-END:initComponents

    private void closeResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeResultsButtonActionPerformed
        resultPanelController.dispose();
    }//GEN-LAST:event_closeResultsButtonActionPerformed

    private void downloadResultsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadResultsButtonActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setDialogTitle("Save coherence matrix");
        chooser.setSelectedFile(new File("coherenceMatrix.csv"));
        chooser.setFileFilter(new FileNameExtensionFilter("CSV file", "csv"));
        int retrival = chooser.showSaveDialog(CySwing.getDesktopJFrame());
        if (retrival == JFileChooser.APPROVE_OPTION) {
            String fileName;
            try {
                fileName = chooser.getSelectedFile().getCanonicalPath();
            } catch (IOException ex) {
                CySwing.displayPopUpMessage("Coudln't save the coherence matrix.");
                return;
            }
            if (!fileName.endsWith(".csv")) {
                fileName += ".csv";
            }
            try (BufferedWriter output = new BufferedWriter(new FileWriter(fileName))) {
                for (Rule rule : rules) {
                    output.write(rule.toString() + "\n");
                }
            } catch (IOException ex) {
                CySwing.displayPopUpMessage("Coudln't save the coherence matrix.");
            }
        }
    }//GEN-LAST:event_downloadResultsButtonActionPerformed

    private void accuracyTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_accuracyTextFieldActionPerformed
        accuracySlider.setValue(Integer.parseInt(accuracyTextField.getText()));
    }//GEN-LAST:event_accuracyTextFieldActionPerformed

    private void coverageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coverageTextFieldActionPerformed
        coverageSlider.setValue(Integer.parseInt(coverageTextField.getText()));
    }//GEN-LAST:event_coverageTextFieldActionPerformed

    private void accuracyTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_accuracyTextFieldFocusLost
        accuracySlider.setValue(Integer.parseInt(accuracyTextField.getText()));
    }//GEN-LAST:event_accuracyTextFieldFocusLost

    private void coverageTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_coverageTextFieldFocusLost
        coverageSlider.setValue(Integer.parseInt(coverageTextField.getText()));
    }//GEN-LAST:event_coverageTextFieldFocusLost

    private void rcaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rcaTextFieldActionPerformed
        rcaSlider.setValue(Integer.parseInt(rcaTextField.getText()));
    }//GEN-LAST:event_rcaTextFieldActionPerformed

    private void rcaTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_rcaTextFieldFocusLost
        rcaSlider.setValue(Integer.parseInt(rcaTextField.getText()));
    }//GEN-LAST:event_rcaTextFieldFocusLost

    private void applyFiltersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFiltersButtonActionPerformed
        refreshNetwork();
    }//GEN-LAST:event_applyFiltersButtonActionPerformed

    private void nextWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextWindowButtonActionPerformed
        lag++;
        lagTextField.setText(Integer.toString(lag));
        if (lag > 0) {
            prevWindowButton.setEnabled(true);
        }
        if (lag == maxLag) {
            nextWindowButton.setEnabled(false);
        }
        refreshLag();
    }//GEN-LAST:event_nextWindowButtonActionPerformed

    private void lagTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lagTextFieldActionPerformed
        try {
            lag = Integer.parseInt(lagTextField.getText());
        } catch (NumberFormatException e) {
            lag = 0;
        }

        if (lag < 0) {
            lag = 0;
        } else if (lag > maxLag) {
            lag = maxLag;
        }
        refreshLag();
    }//GEN-LAST:event_lagTextFieldActionPerformed

    private void prevWindowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevWindowButtonActionPerformed
        lag--;
        lagTextField.setText(Integer.toString(lag));
        if (lag == 0) {
            prevWindowButton.setEnabled(false);
        }
        if (lag < maxLag) {
            nextWindowButton.setEnabled(true);
        }
        refreshLag();
    }//GEN-LAST:event_prevWindowButtonActionPerformed

    private void showAllToggleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllToggleButtonActionPerformed
        boolean enableSelectors;
        if  (showAllToggleButton.isSelected()) {
            lag = null;
            enableSelectors = false;
        } else {
            try {
                lag = Integer.parseInt(lagTextField.getText());
            } catch (NumberFormatException e) {
                lag = 0;
            }
            enableSelectors = true;
        }
        prevWindowButton.setEnabled(enableSelectors);
        nextWindowButton.setEnabled(enableSelectors);
        lagTextField.setEnabled(enableSelectors);
        refreshLag();
    }//GEN-LAST:event_showAllToggleButtonActionPerformed

    private void refreshNetwork() {
        rules = network.updateFilters(rcaSlider.getValue() / 100F, accuracySlider.getValue() / 100F, coverageSlider.getValue() / 100F);
        refreshLag();
    }
    
    private void refreshLag() {
        network.filterEdges(lag);
        List<Rule> visibleRules = rules.stream().filter(rule -> lag == null || rule.lag == lag).collect(Collectors.toList());
        Object[][] model = new Object[visibleRules.size()][];
        int i = 0;
        for (Rule rule : visibleRules) {
            model[i++] = new Object [] { rule.lag, rule.regulator, rule.getInteraction(), rule.target, rule.accuracy, rule.coverage };
        }
        rulesTable.setModel(new javax.swing.table.DefaultTableModel(
            model,
            new String [] { "Time-lag", "Regulator", "Type", "Target", "Accuracy", "Coverage" }
        ) {
            Class[] types = new Class [] {
                Integer.class, String.class, String.class, String.class, Float.class, Float.class
            };

            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            @Override
            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }

            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
    }
    
    class SliderChangeListener implements ChangeListener {
        private final JTextField textField;
        public SliderChangeListener(JTextField textField) {
            this.textField = textField;
        }
        @Override
        public void stateChanged(ChangeEvent e) {
            JSlider source = (JSlider)e.getSource();
            if (!source.getValueIsAdjusting()) {
                textField.setText("" + source.getValue());
            }    
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel accuracyLabel;
    private javax.swing.JSlider accuracySlider;
    private javax.swing.JTextField accuracyTextField;
    private javax.swing.JButton applyFiltersButton;
    private javax.swing.JButton closeResultsButton;
    private javax.swing.JLabel coverageLabel;
    private javax.swing.JSlider coverageSlider;
    private javax.swing.JTextField coverageTextField;
    private javax.swing.JButton downloadResultsButton;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lagTextField;
    private javax.swing.JButton nextWindowButton;
    private javax.swing.JButton prevWindowButton;
    private javax.swing.JLabel rcaLabel;
    private javax.swing.JSlider rcaSlider;
    private javax.swing.JTextField rcaTextField;
    private javax.swing.JLabel rulesLabel;
    private javax.swing.JScrollPane rulesPane;
    private javax.swing.JTable rulesTable;
    private javax.swing.JToggleButton showAllToggleButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public Component getComponent() {
        return this;
    }

    @Override
    public CytoPanelName getCytoPanelName() {
         return CytoPanelName.EAST;
    }

    @Override
    public String getTitle() {
        return "GRNCOP2";
    }

    @Override
    public Icon getIcon() {
        return null;
    }
}