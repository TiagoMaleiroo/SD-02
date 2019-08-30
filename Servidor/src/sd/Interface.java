package sd;


import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;


public class Interface extends javax.swing.JFrame {
  
    private float x1N, x2N, x3N;
    
    
    public Interface() {
        initComponents();
        setSize(1000,650);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fecharPrograma = new javax.swing.JButton();
        ipd1 = new javax.swing.JTextField();
        x1 = new javax.swing.JTextField();
        statusD2 = new javax.swing.JTextField();
        ipd2 = new javax.swing.JTextField();
        ipd3 = new javax.swing.JTextField();
        statusD1 = new javax.swing.JTextField();
        statusD3 = new javax.swing.JTextField();
        x2 = new javax.swing.JTextField();
        x3 = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        ipendereco = new javax.swing.JLabel();
        titulo1 = new javax.swing.JLabel();
        temperaturaba1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        status1 = new javax.swing.JLabel();
        ipendereco1 = new javax.swing.JLabel();
        temperaturaba2 = new javax.swing.JLabel();
        status2 = new javax.swing.JLabel();
        ipendereco2 = new javax.swing.JLabel();
        temperaturaba3 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setExtendedState(1);
        getContentPane().setLayout(null);

        fecharPrograma.setBackground(new java.awt.Color(255, 204, 204));
        fecharPrograma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8_Cancel_16px_9.png"))); // NOI18N
        fecharPrograma.setText("Sair");
        fecharPrograma.setActionCommand("sair");
        fecharPrograma.setBorder(null);
        fecharPrograma.setBorderPainted(false);
        fecharPrograma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharProgramaActionPerformed(evt);
            }
        });
        getContentPane().add(fecharPrograma);
        fecharPrograma.setBounds(850, 490, 110, 50);

        ipd1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd1);
        ipd1.setBounds(80, 370, 110, 30);

        x1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        x1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                x1ActionPerformed(evt);
            }
        });
        getContentPane().add(x1);
        x1.setBounds(80, 430, 110, 30);

        statusD2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD2);
        statusD2.setBounds(430, 310, 110, 30);

        ipd2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd2);
        ipd2.setBounds(430, 370, 110, 30);

        ipd3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipd3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(ipd3);
        ipd3.setBounds(740, 370, 110, 30);

        statusD1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD1);
        statusD1.setBounds(80, 310, 110, 30);

        statusD3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        statusD3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(statusD3);
        statusD3.setBounds(740, 310, 110, 30);

        x2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(x2);
        x2.setBounds(430, 430, 110, 30);

        x3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        x3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(x3);
        x3.setBounds(740, 430, 110, 30);

        status.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        status.setText("Status");
        getContentPane().add(status);
        status.setBounds(690, 300, 50, 50);

        ipendereco.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipendereco.setText("END IP");
        getContentPane().add(ipendereco);
        ipendereco.setBounds(680, 370, 70, 20);

        titulo1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        titulo1.setText("BODYS SENSORES");
        getContentPane().add(titulo1);
        titulo1.setBounds(430, 510, 280, 30);
        titulo1.getAccessibleContext().setAccessibleName("SISTEMAS DISTRIBUIDOS - BODYs DE SENSORES");

        temperaturaba1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba1.setText("Sensor");
        getContentPane().add(temperaturaba1);
        temperaturaba1.setBounds(20, 430, 40, 30);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 60, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 10, 280, 280);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(360, 10, 280, 280);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(670, -20, 280, 340);

        status1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        status1.setText("Status");
        getContentPane().add(status1);
        status1.setBounds(20, 300, 50, 50);

        ipendereco1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipendereco1.setText("END IP");
        getContentPane().add(ipendereco1);
        ipendereco1.setBounds(20, 370, 70, 20);

        temperaturaba2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba2.setText("Sensor");
        getContentPane().add(temperaturaba2);
        temperaturaba2.setBounds(680, 430, 40, 30);

        status2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        status2.setText("Status");
        getContentPane().add(status2);
        status2.setBounds(380, 300, 50, 50);

        ipendereco2.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        ipendereco2.setText("END IP");
        getContentPane().add(ipendereco2);
        ipendereco2.setBounds(380, 370, 70, 20);

        temperaturaba3.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        temperaturaba3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        temperaturaba3.setText("Sensor");
        getContentPane().add(temperaturaba3);
        temperaturaba3.setBounds(370, 430, 40, 30);

        setSize(new java.awt.Dimension(1016, 600));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void fecharProgramaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharProgramaActionPerformed
           System.exit(0);
    }//GEN-LAST:event_fecharProgramaActionPerformed

    private void x1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_x1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_x1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
                
                
            }
        });
    }
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton fecharPrograma;
    private javax.swing.JTextField ipd1;
    private javax.swing.JTextField ipd2;
    private javax.swing.JTextField ipd3;
    private javax.swing.JLabel ipendereco;
    private javax.swing.JLabel ipendereco1;
    private javax.swing.JLabel ipendereco2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel status;
    private javax.swing.JLabel status1;
    private javax.swing.JLabel status2;
    private javax.swing.JTextField statusD1;
    private javax.swing.JTextField statusD2;
    private javax.swing.JTextField statusD3;
    private javax.swing.JLabel temperaturaba1;
    private javax.swing.JLabel temperaturaba2;
    private javax.swing.JLabel temperaturaba3;
    private javax.swing.JLabel titulo1;
    private javax.swing.JTextField x1;
    private javax.swing.JTextField x2;
    private javax.swing.JTextField x3;
    // End of variables declaration//GEN-END:variables
    
    public void setxyz1(String x1){
        
        if(x1!=null){
             this.x1.setText(x1);
             play("/icones/grito.wav",x1);
            
        }
    }
    
    public void setxyz2(String x1){
        if(x1!=null){
        this.x2.setText(x1); 
        play1("/icones/grito.wav",x1);
     }
       
    }
    
    public void setxyz3(String x1){
        if(x1!=null){
        this.x3.setText(x1);
        play2("/icones/grito.wav",x1);
       }
        
    }
    
    public void setValue(String x, int opcao){
        switch(opcao){
            case 1: this.setxyz1(x);break; 
            case 2: this.setxyz2(x);break;
            case 3: this.setxyz3(x);break; 
        }
    }
    
    public void setIP(String ip, int opcao){
        switch(opcao){
            case 1: this.ipd1.setText(ip); this.statusD1.setText("Conectado"); break;
            case 2: this.ipd2.setText(ip); this.statusD2.setText("Conectado"); break;
            case 3: this.ipd3.setText(ip); this.statusD3.setText("Conectado"); break;
        }
    }
    
    public void desconectIP(int opcao){
        switch(opcao){
            case 1: this.ipd1.setText(""); this.statusD1.setText("Desconectado"); break;
            case 2: this.ipd2.setText(""); this.statusD2.setText("Desconectado"); break;
            case 3: this.ipd3.setText(""); this.statusD3.setText("Desconectado"); break;
        }
    }
    
    public synchronized void play(final String url, String x1) {
   
        new Runnable(){
            
      public void run() {     
         
          float aux = Float.parseFloat(x1);
          
          if (x1== null|| aux== 5.0|| aux == 8.0){
         
              jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png")));
              
                  
          }else{        
              jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2.png")));
      
              
          try {
              
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Interface.class.getResourceAsStream(url));
          clip.open(inputStream);
          clip.start();
               
        } catch (Exception e) {
          System.err.println("Erro ao tocar audio:\n"+e.getMessage());
        }
      
    }
       
        
    


}
        }.run();
}

 public synchronized void play1(final String url, String x1) {
   
        new Runnable(){
            
      public void run() {     
         
          float aux = Float.parseFloat(x1);
          
          if (x1== null|| aux== 5.0 || aux == 8.0){
         
              jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png")));
                  
          }else{        
              jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2.png")));
              
            
          try {
              
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Interface.class.getResourceAsStream(url));
          clip.open(inputStream);
          clip.start();
       
                            
        } catch (Exception e) {
          System.err.println("Erro ao tocar audio:\n"+e.getMessage());
        }
      
    }
       

}
        }.run();}
        
 public synchronized void play2(final String url, String x1) {
   
        new Runnable(){
            
      public void run() {     
         
          float aux = Float.parseFloat(x1);
          
          if (x1== null|| aux== 5.0 || aux == 8.0){
         
              jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/1.png")));
                  
          }else{        
              jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/2.png")));
              
          try {
              
          Clip clip = AudioSystem.getClip();
          AudioInputStream inputStream = AudioSystem.getAudioInputStream(Interface.class.getResourceAsStream(url));
          clip.open(inputStream);
          clip.start();
                         
        } catch (Exception e) {
          System.err.println("Erro ao tocar audio:\n"+e.getMessage());
        }
      
    }

}
        }.run();
}
}

