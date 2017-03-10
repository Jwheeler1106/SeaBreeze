/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package game2;

import game2.FileReader;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.util.Scanner;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author johnwheeler
 */
public class SeaBreeze extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public SeaBreeze() {
        initComponents();
    }
    
    public static void Fill () {
        
        String answer = JOptionPane.showInputDialog (null, "Attendant: What can I do for you?");

if (answer.equals("Fill") || answer.equals("fill") || answer.equals ("fill up") || answer.equals("Fill up")) {

JOptionPane.showMessageDialog(null, "Attendant: I guess I can take care of that for you.");

String dir = JOptionPane.showInputDialog (null, "You drive off" + "\n you reach a fork in the road" + "\n do you want to turn left or right?");

if (dir.equals("left") || dir.equals ("Left")) {
    
    JOptionPane.showMessageDialog (null, "You pass a bunch of mansions." + "\n Look out! You hit a car!");
    JOptionPane.showMessageDialog (null, "It's a limo, from the limo emerges a square jawed fellow.");
    Who();
}//end left

if (dir.equals ("right") || dir.equals ("Right")) {
    
    JOptionPane.showMessageDialog (null, "You stroll through a place akin to Main Street. ");
    String rst = JOptionPane.showInputDialog (null, "You step out of your car" + "\n You can either explore or there's a seafood restaurant" + "\n What to do?");
    
    if (rst.equals("restaurant") || rst.equals("Restaurant") || rst.equals("Seafood") || rst.equals("seafood")) {
        CJ();
        new SeaBreeze().Colonel();
        
        JOptionPane.showMessageDialog (null, "THE END");
        System.exit(0);
    }
    
    }//end right

else {
    JOptionPane.showMessageDialog (null, "You can't go that way! YOU'VE CRASHED! YOU'RE DEAD!");
    System.exit(0);
    
}//end else for LR

}//end if statement for fill

else {
    JOptionPane.showMessageDialog(null,"Attendant: What?");
    Fill ();
}//end else for fill

        
    }//end Fill
    
    public static void Who () {
        
        String ans = JOptionPane.showInputDialog (null, "Do you know who I am?");
    if (ans.equals ("yes") || ans.equals ("Yes")) {
        JOptionPane.showMessageDialog (null, "No you don't.");
        Who ();
    }
    if (ans.equals("no") || ans.equals("No")) {
        JOptionPane.showMessageDialog (null, "They call me the Colonel" + "\n and you'd better be able to pay for this.");
        JOptionPane.showMessageDialog (null, "You realize you're low on cash, so you can't pay.");
        JOptionPane.showMessageDialog (null, "Well son, looks like you'll have to work for me.");
        Work();
    }
    }//end Who
    
    public static void Work () {
        
        String wrk = JOptionPane.showInputDialog (null, "What do you say?");
        
        if (wrk.equals("no") || wrk.equals ("No")) {
           JOptionPane.showMessageDialog (null, "The Colonel takes out a gun and shoots you." + "\n You're dead.");
           System.exit(0);
       }//end no
        
          if (wrk.equals ("yes") || wrk.equals ("Yes")) {
           JOptionPane.showMessageDialog (null, "Great, you'll start today.");
           JOptionPane.showMessageDialog (null, "Ever work for a career criminal before?");
           JOptionPane.showMessageDialog (null, "Well it's a lot of fun!");
           JOptionPane.showMessageDialog (null, "You'll do this job for me and we're square.");
           JOptionPane.showMessageDialog (null, "Some chump thinks he can move in on my territory" + "\n Calls himself Captain Jack, deal with him.");
           JOptionPane.showMessageDialog (null, "The Colonel gives you a gun and has you get in your car.");
           String drv = JOptionPane.showInputDialog ("You get in your car, what next?");
           
           if (drv.equals("drive")||drv.equals("Drive")) {
               JOptionPane.showMessageDialog (null, "You make your way towards Captain Jack's.");
               JOptionPane.showMessageDialog (null, "You're here.");
               CJ();
               JOptionPane.showMessageDialog (null, "You realize that now is the perfect time to act.");
               new SeaBreeze().Bang();
               
               
           }//end drive
           
           else {
               JOptionPane.showMessageDialog (null, "I don't think that's going to work.");
           }//end else in drive
           
           
       }//end yes
          
          else {
        JOptionPane.showMessageDialog (null, "Well I have no idea what you mean.");
        Work();
    }//end else
        
        
        
        
    }//end Work
    
    public static void CJ () {
    
        JOptionPane.showMessageDialog (null, "You enter this place and are greeted by a grizzled sailor-looking fellow.");
        JOptionPane.showMessageDialog (null, "How are ya?  I'm Captain Jack.");
        JOptionPane.showMessageDialog (null, "What's good here?  You ask.");
        JOptionPane.showMessageDialog (null, "Well, the salmon is OK, and also the crab!");
        new SeaBreeze().Menu ();
        //put method here
}//End CJ
    
    public void Bang () {
        
        String act = JOptionPane.showInputDialog ("What are going to do?");
        
        if (act.equals("shoot")||act.equals("Shoot")) {
        
        int x = 15;
        int y = (int)(Math.random() * 20);
        
         if (x>y)
                   {
                       JOptionPane.showMessageDialog (null, "You shoot Captain Jack, but it's only a flesh wound.");
                       JOptionPane.showMessageDialog (null, "He fires back and hits you point blank.");
                       JOptionPane.showMessageDialog (null, "You're dead.");
                       System.exit(0);
                   } //end if xy
         
          if (y>x)
                   {
                       JOptionPane.showMessageDialog (null, "Your bullet hits him.");
                       JOptionPane.showMessageDialog (null, "He falls to the ground.");
                       JOptionPane.showMessageDialog (null, "It's done.");
                       JOptionPane.showMessageDialog (null, "You return to the Colonel victorious.");
                       JOptionPane.showMessageDialog (null, "Well son, looks like your debt is paid.");
                       JOptionPane.showMessageDialog (null, "With nothing left to do, you ride off into the sunset.");
                       JOptionPane.showMessageDialog (null, "THE END");
                       System.exit(0);
                   }//end if yx
          
           else {
                       
                       JOptionPane.showMessageDialog (null, "He's injured, but not dead.");
                       Bang();
                   }//end else
        }//end if
        
        else {
            JOptionPane.showMessageDialog (null, "Don't know you if you can do that, try again!");
            Bang();
        }//end else
         
         
        
    }//end Bang
    
    public void Colonel () {
        
        JOptionPane.showMessageDialog (null, "There's this clown who calls himself the Colonel.");
        JOptionPane.showMessageDialog (null, "I want you to deal with him.");
        JOptionPane.showMessageDialog (null, "Captain Jack gives you a gun and you're on your way.");
        JOptionPane.showMessageDialog (null, "Based on the directions, you're at The Colonel's mansion.");
               
        JOptionPane.showMessageDialog (null, "The place is surrounded by armed guards.");
        Cbang();
        
    }//end Colonel
    
    public void Cbang () {
        
        String guard = JOptionPane.showInputDialog (null, "What to do?");
               
                if (guard.equals("shoot")|| guard.equals("Shoot")) {
                   
                   JOptionPane.showMessageDialog (null, "You aim and fire.");
                   
                   int a = 45;
                   int b = (int) (Math.random() * 60);
                   
                   if (a>b) {
                       
                       JOptionPane.showMessageDialog (null, "Something goes wrong.");
                       JOptionPane.showMessageDialog (null, "You're overrun and the guards shoot you to pieces.");
                       JOptionPane.showMessageDialog (null, "You have died.");
                       System.exit(0);
                   } //end ab
                   
                   if (b>a) {
                       
                       JOptionPane.showMessageDialog (null, "You take out one guard.");
                       JOptionPane.showMessageDialog (null, "Then another.");
                       JOptionPane.showMessageDialog (null, "The third one's alive, but barely.");
                       JOptionPane.showMessageDialog (null, "You make your way into the Colonel's compound.");
                       JOptionPane.showMessageDialog (null, "A square-jawed fellow, he waits for you.");
                       JOptionPane.showMessageDialog (null, "So, Captain Jack couldn't fight me himself?" + "\n Had to send an errand boy?");
                       ShowDown();
                       //start new method   
                   }//end ba
                   
                   else {
                       JOptionPane.showMessageDialog (null, "You shoot one guard, but some are still shooting at you.");
                       Cbang();
                   } //end else
                   
               } //end if for shooting
                
                else {
                    JOptionPane.showMessageDialog (null, "Don't know if you can do that, try again!");
                    Cbang();
                }
        
    }
    
    public void ShowDown () {
        
           String ds = JOptionPane.showInputDialog (null, "What are you going to do?");
                       
                       if (ds.equals("shoot")||ds.equals("Shoot")) {
                           
                           int c = 25;
                           int d = (int) (Math.random() * 30);
                           
                           if (c>d) {
                               
                               JOptionPane.showMessageDialog (null, "Before you can even aim the Colonel's got you.");
                               JOptionPane.showMessageDialog (null, "He fires his gun and tears bullet right through you.");
                               JOptionPane.showMessageDialog (null, "You're dead.");
                               System.exit(0);
                           }//end cd
                           
                           if (d>c) {
                               
                               JOptionPane.showMessageDialog (null, "You fire and you get him right in the chest!");
                               JOptionPane.showMessageDialog (null, "The old man falls the floor, and it's over.");
                               JOptionPane.showMessageDialog (null, "You return to Captain Jack victorious.");
                               JOptionPane.showMessageDialog (null, "Nice going, he tells you.");
                               JOptionPane.showMessageDialog (null, "I think this is the beginning of a wonderful partnership.");
                               JOptionPane.showMessageDialog (null, "THE END");
                               System.exit(0);
                               
                           }//end dc
                           
                           else {
                               JOptionPane.showMessageDialog (null, "You fire, but miss!");
                               ShowDown();
                           } //end else cd
                           
                           
                           
                       }//end if
                       
                       else {
                           JOptionPane.showMessageDialog (null, "Don't know if that'll work.");
                           ShowDown();
                       }
        
    }// end ShowDown
    
    public void Menu () {
        
        String ordr = JOptionPane.showInputDialog (null, "So what'll it be?");
        
                
        if (ordr.equals("salmon")|| ordr.equals("Salmon")) {
        
        JOptionPane.showMessageDialog (null, "You order the salmon, you take a bite.");
        JOptionPane.showMessageDialog (null, "But something's not quite right" + "\n Your stomach turns.");
        JOptionPane.showMessageDialog (null, "You get dizzy and fall to the floor" + "\n You've died of food poisoning.");
        System.exit(0);
    }//end salmon
        
        if (ordr.equals("crab")|| ordr.equals("Crab")) {
            
            JOptionPane.showMessageDialog (null, "You order the crab, not bad you think.");
            JOptionPane.showMessageDialog (null, "Captain Jack has a seat at your table.");
            JOptionPane.showMessageDialog (null, "I haven't seen you here before, he observes.");
            JOptionPane.showMessageDialog (null, "Yeah, from out of town, you say.");
            JOptionPane.showMessageDialog (null, "I'm always looking for new members of my crew.");
            String crw = JOptionPane.showInputDialog (null, "Are you interested?");
            
            if (crw.equals("no")||crw.equals("No")) {
                
                JOptionPane.showMessageDialog (null, "Alright pal, suit yourself.");
                JOptionPane.showMessageDialog (null, "You sit there and ponder life, among other things.");
                JOptionPane.showMessageDialog (null, "THE END");
                System.exit(0);
            }//end no
            
            if (crw.equals ("yes") || crw.equals ("Yes")) {
                
                JOptionPane.showMessageDialog (null, "Great, you can start now!");
                
                
                //this starts another method
                
               
            }//end yes
            
        }
        
        else {
            JOptionPane.showMessageDialog (null, "Doesn't look like thats on the menu, bub.");
            new SeaBreeze().Menu();
        }//end else
        
    }//end Menu
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        Gdn = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        NG = new javax.swing.JMenuItem();
        Q = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Gdn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GdnActionPerformed(evt);
            }
        });

        jMenu1.setText("File");

        NG.setText("New Game");
        NG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NGActionPerformed(evt);
            }
        });
        jMenu1.add(NG);

        Q.setText("Quit");
        Q.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QActionPerformed(evt);
            }
        });
        jMenu1.add(Q);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        jMenuItem2.setText("About");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Gdn, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Gdn, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GdnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GdnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GdnActionPerformed

    private void QActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_QActionPerformed

    private void NGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NGActionPerformed
        // TODO add your handling code here:
        
       JOptionPane.showMessageDialog (null, "Welcome to Sea Breeze" + "\n You've arrived in this town, unfamilar with your surroundings" + "\n Suddenly you come to a gas station on the edge of town with a lone attendant ");
       Fill ();
       //Who ();
       
    }//GEN-LAST:event_NGActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
         String nfo = "";
    FileReader splash;
    StringTokenizer fields;
    
    try 
    {
        Scanner ipf = new Scanner (new FileInputStream ("Splash.txt"));
        nfo = ipf.nextLine();
        fields = new StringTokenizer (nfo);
        splash = new FileReader (fields.nextToken(), fields.nextToken(), fields.nextToken(), fields.nextToken());
        //System.out.println (splash.toString());
        //JOptionPane.showMessageDialog (null, splash.toString());
        Gdn.setText(splash.toString());
    }
    
    catch (Exception e)
    {
        System.out.println ("Uh-oh, something appears to have went wrong.");
    }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    
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
            java.util.logging.Logger.getLogger(SeaBreeze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeaBreeze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeaBreeze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeaBreeze.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeaBreeze().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Gdn;
    private javax.swing.JMenuItem NG;
    private javax.swing.JMenuItem Q;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    // End of variables declaration//GEN-END:variables
}
