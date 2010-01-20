/*
Copyright 2008 WebAtlas
Authors : Patrick J. McSweeney (pjmcswee@syr.edu)
Website : http://www.gephi.org

This file is part of Gephi.

Gephi is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Gephi is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Gephi.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.gephi.ui.statistics.plugin;

/**
 *
 * @author pjmcswee
 */
public class ClusteringCoefficientPanel extends javax.swing.JPanel {

    public ClusteringCoefficientPanel() {
        initComponents();
    }

    public boolean isDirected() {
        return directedRadioButton.isSelected();
    }

    public boolean isBruteForce() {
        return bruteRadioButton.isSelected();
    }

    public void setDirected(boolean directed) {
        directedButtonGroup.setSelected(directed ? directedRadioButton.getModel() : undirectedRadioButton.getModel(), true);
    }

    public void setBruteForce(boolean brute) {
        algorithmButtonGroup.setSelected(brute ? bruteRadioButton.getModel() : triangleRadioButton.getModel(), true);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        directedButtonGroup = new javax.swing.ButtonGroup();
        algorithmButtonGroup = new javax.swing.ButtonGroup();
        directedRadioButton = new javax.swing.JRadioButton();
        undirectedRadioButton = new javax.swing.JRadioButton();
        labelTitle = new javax.swing.JLabel();
        bruteRadioButton = new javax.swing.JRadioButton();
        triangleRadioButton = new javax.swing.JRadioButton();
        separator = new javax.swing.JSeparator();
        descriptionPanel = new org.jdesktop.swingx.JXLabel();

        directedButtonGroup.add(directedRadioButton);
        directedRadioButton.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.directedRadioButton.text")); // NOI18N

        directedButtonGroup.add(undirectedRadioButton);
        undirectedRadioButton.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.undirectedRadioButton.text")); // NOI18N

        labelTitle.setFont(new java.awt.Font("Tahoma", 1, 18));
        labelTitle.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.labelTitle.text")); // NOI18N

        algorithmButtonGroup.add(bruteRadioButton);
        bruteRadioButton.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.bruteRadioButton.text")); // NOI18N

        algorithmButtonGroup.add(triangleRadioButton);
        triangleRadioButton.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.triangleRadioButton.text")); // NOI18N

        descriptionPanel.setLineWrap(true);
        descriptionPanel.setText(org.openide.util.NbBundle.getMessage(ClusteringCoefficientPanel.class, "ClusteringCoefficientPanel.descriptionPanel.text")); // NOI18N
        descriptionPanel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(descriptionPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addComponent(separator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(undirectedRadioButton)
                            .addComponent(directedRadioButton))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(triangleRadioButton)
                            .addComponent(bruteRadioButton)))
                    .addComponent(labelTitle, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTitle)
                .addGap(8, 8, 8)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bruteRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(triangleRadioButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(directedRadioButton)
                        .addGap(18, 18, 18)
                        .addComponent(undirectedRadioButton)))
                .addGap(18, 18, 18)
                .addComponent(descriptionPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup algorithmButtonGroup;
    protected javax.swing.JRadioButton bruteRadioButton;
    private org.jdesktop.swingx.JXLabel descriptionPanel;
    private javax.swing.ButtonGroup directedButtonGroup;
    private javax.swing.JRadioButton directedRadioButton;
    private javax.swing.JLabel labelTitle;
    private javax.swing.JSeparator separator;
    protected javax.swing.JRadioButton triangleRadioButton;
    private javax.swing.JRadioButton undirectedRadioButton;
    // End of variables declaration//GEN-END:variables
}