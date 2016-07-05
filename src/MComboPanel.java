/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import javax.swing.JDialog;

/**
 *
 * @author Harsh
 */
public class MComboPanel extends JDialog {

    GraphicsEnvironment gc = GraphicsEnvironment.getLocalGraphicsEnvironment();
    GridLayout g = new java.awt.GridLayout(0, 1);
    /**
     * Creates new form MComboPanel
     */
    public MComboPanel() {
        initComponents();
        jPanel1.setLayout(g);
        jScrollPane1.getVerticalScrollBar().setBlockIncrement(10);
    }
    
    public void setRowsColumns(int r, int c)
    {
        g = new GridLayout(r, c);
        jPanel1.setLayout(g);
    }

    public void add(String item)
    {
        MButton m = new MButton();
        m.setText(item);
        m.setPreferredSize(new Dimension(50, 40));
        jPanel1.add(m);
    }
    
    public void addItem(Component c)
    {
        jPanel1.add(c);
    }
    
    @Override
    public void setTitle(String s)
    {
        mLabel1.setText(s);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        mLabel1 = new MLabel();
        mButton32 = new MButton();

        setBackground(new java.awt.Color(247, 247, 247));
        setBounds(gc.getMaximumWindowBounds());
        setUndecorated(true);
        setOpacity(0.8F);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new java.awt.GridLayout(0, 1));
        jScrollPane1.setViewportView(jPanel1);

        mLabel1.setBorder(null);
        mLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mLabel1.setText("Choose");
        mLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 48)); // NOI18N
        mLabel1.setOpaque(false);

        mButton32.setBackground(new java.awt.Color(239, 239, 239));
        mButton32.setText("X");
        mButton32.setFocusable(false);
        mButton32.setFont(new java.awt.Font("Segoe UI Light", 0, 24)); // NOI18N
        mButton32.setButtonColors(new java.awt.Color(239, 239, 239),
            Color.WHITE, Color.BLACK);
        mButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mButton32ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(mLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mButton32, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addGap(56, 56, 56))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void mButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mButton32ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_mButton32ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private MButton mButton32;
    private MLabel mLabel1;
    // End of variables declaration//GEN-END:variables
}
