
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.wo
 */

/**
 *
 * @author Josh
 */
public class AirplaneSettings extends javax.swing.JFrame {

    private int height;
    private int terrain;
    private int duration;
    private int adjRate;
    private double largeAdjust = 0.1;
    private double smallAdjust = 0.03;
    private double changeRate = 0.003;
    
    /**
     * Creates new form AirplaneSettings
     */
    public AirplaneSettings() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Simulate!");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Airplane Settings");

        jLabel2.setText("Desired Height (>100):");

        jLabel3.setText("Terrain Type:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("Flat (+/- 2% per cycle)");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Hilly (+/- 5% per cycle)");
        jRadioButton2.setActionCommand("Hilly (+/- 5% per cycle)");

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Rocky (+/- 10% per cycle)");

        jLabel4.setText("Duration (>100):");

        jButton2.setText("Membership Functions");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton4);
        jRadioButton4.setSelected(true);
        jRadioButton4.setText("Directly Map Terrain");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton5);
        jRadioButton5.setText("Fly Smoothly");

        jLabel5.setText("Flight Path Setting:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jRadioButton1)
                                    .addComponent(jRadioButton3)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton4)
                                    .addComponent(jRadioButton5))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jRadioButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     // TODO add your handling code here:
        simulate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setValues();
        memFuncGraph();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(AirplaneSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirplaneSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirplaneSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirplaneSettings.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AirplaneSettings().setVisible(true);
            }
        });
    }

    public void simulate(){
        setValues();
        List<Double> groundPoints = new ArrayList<Double>();
        List<Double> planePoints = new ArrayList<Double>();
        double ground = 100;
        double plane = ground + height;
        double change = 0;
        
        for (int i = 0; i < duration; i++)
        {
            if (i%3 == 0)
                ground = newGround(ground);
            planePoints.add(plane);
            groundPoints.add(ground);
            double currHeight = plane-ground;
            if (jRadioButton4.isSelected())
                plane += newPlane(currHeight);
            else 
            {
                double newchange = newPlane(currHeight);
                if (change > newchange)
                    change -= changeRate*height;
                else if (change < newchange)
                    change += changeRate*height;
                plane += change;
            }
        }
        
        planeGraph(groundPoints, planePoints);
    }
    
    public void planeGraph(List<Double> gp, List<Double> pp){
        // Create XY series for the ground
        XYSeries ground = new XYSeries("Ground Height");
        for (int i = 0; i < gp.size(); i++)
            ground.add(i,gp.get(i));
        
        // Create XY series for the plane
        XYSeries plane = new XYSeries("Plane Height");
        for (int i = 0; i < pp.size(); i++)
            plane.add(i,pp.get(i));
        
        // Add the series to the data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(ground);
        dataset.addSeries(plane);
        
        // Generate the graph
        JFreeChart memFunction = ChartFactory.createXYLineChart(
            "Plane Flight", // Title
            "Time", // x-axis Label
            "Height", // y-axis Label
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Plot Orientation
            true, // Show Legend
            true, // Use tooltips
            false // Configure chart to generate URLs?
        );
        
        ChartFrame frame = new ChartFrame("Plane Flight", memFunction);
        frame.pack();
        frame.setVisible(true);
    }
    
    public double newPlane(double curr){
        double change = height*(veryLow(curr)*largeAdjust + low(curr)*smallAdjust 
                    - high(curr)*smallAdjust - veryHigh(curr)*largeAdjust);
        
        return change;
    }
    
    public void memFuncGraph(){
        // Create XY series for very low flight
        XYSeries veryLow = new XYSeries("Very Low");
        veryLow.add(0.5*height, veryLow(0.5*height));
        veryLow.add(0.7*height, veryLow(0.7*height));
        veryLow.add(0.8*height, veryLow(0.8*height));
        veryLow.add(1.5*height, veryLow(1.5*height));
        
        // Create XY series for low flight
        XYSeries low = new XYSeries("Low");
        low.add(0.5*height, low(0.5*height));
        low.add(0.7*height, low(0.7*height));
        low.add(0.8*height, low(0.8*height));
        low.add(0.9*height, low(0.9*height));
        low.add(1.0*height, low(1.0*height));
        low.add(1.5*height, low(1.5*height));
        
        // Create XY series for high flight
        XYSeries high = new XYSeries("High");
        high.add(0.5*height, high(0.5*height));
        high.add(1.0*height, high(1.0*height));
        high.add(1.1*height, high(1.1*height));
        high.add(1.2*height, high(1.2*height));
        high.add(1.3*height, high(1.3*height));
        high.add(1.5*height, high(1.5*height));
        
        // Create XY series for very high flight
        XYSeries veryHigh = new XYSeries("Very High");
        veryHigh.add(0.5*height, veryHigh(0.5*height));
        veryHigh.add(1.2*height, veryHigh(1.2*height));
        veryHigh.add(1.3*height, veryHigh(1.3*height));
        veryHigh.add(1.5*height, veryHigh(1.5*height));
        
        // Add the series to the data set
        XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(veryLow);
        dataset.addSeries(low);
        dataset.addSeries(high);
        dataset.addSeries(veryHigh);
        
        // Generate the graph
        JFreeChart memFunction = ChartFactory.createXYLineChart(
            "Membership Functions", // Title
            "Plane Height", // x-axis Label
            "Degree", // y-axis Label
            dataset, // Dataset
            PlotOrientation.VERTICAL, // Plot Orientation
            true, // Show Legend
            true, // Use tooltips
            false // Configure chart to generate URLs?
        );
        
        ChartFrame frame = new ChartFrame("Membership Functions", memFunction);
        frame.pack();
        frame.setVisible(true);
    }
    
    public double veryLow(double curr){
        double val;
        
        if (curr <= 0.7*height)
            val = 1.0;
        else if (curr > 0.7*height && curr <0.8*height)
            val = (-10) * (curr/height) + 8;
        else
            val = 0;
        
        return val;
    }
    
    public double low(double curr){
        double val;
        
        if (curr <= 0.7*height || curr >= height)
            val = 0;
        else if (curr > 0.7*height && curr < 0.8*height)
            val = (10) * (curr/height) - 7;
        else if (curr >= 0.8*height && curr <= 0.9*height)
            val = 1.0;
        else
            val = (-10) * (curr/height) + 10;
        
        return val;
    }
    
    public double high(double curr){
        double val;
        
        if (curr <= height || curr >= 1.3*height)
            val = 0;
        else if (curr > height && curr < 1.1*height)
            val = (10) * (curr/height) - 10;
        else if (curr >= 1.1*height && curr <= 1.2*height)
            val = 1.0;
        else
            val = (-10) * (curr/height) + 13;
        
        return val;
    }
    
    public double veryHigh(double curr){
        double val;
        
        if (curr <= 1.2*height)
            val = 0;
        else if (curr > 1.2*height && curr <1.3*height)
            val = (10) * (curr/height) + 12;
        else
            val = 1.0;
        
        return val;
    }
    
    public double newGround(double gnd){
        Random rand = new Random();
        double num = rand.nextDouble()*terrain;
        int odd = rand.nextInt(2);
        
        if (odd == 0)
            num = 0-num;
        
        gnd += num;
        
        return gnd;
    }
    
    public void setValues(){
        // Read in height of airplane.
        try {
            height = Integer.parseInt(jTextField1.getText());
        }
        catch(NumberFormatException exc){
            wrongFormat();
            return;
        }
        
        if (height <= 100)
            height = 200;
        
        // Read in duration of test.
        try {
            duration = Integer.parseInt(jTextField2.getText());
        }
        catch(NumberFormatException exc){
            wrongFormat();
            return;
        }
        
        if (duration <= 100)
            duration = 200;
        
        // Set in terrain type.
        if (jRadioButton1.isSelected())
            terrain = height/50;
        else if (jRadioButton2.isSelected())
            terrain = height/20;
        else if (jRadioButton3.isSelected())
            terrain = height/10;
        
    }
    
    public void wrongFormat(){
        JOptionPane.showMessageDialog(this, "Format error occurred in one or more textboxes. Please try again.");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
