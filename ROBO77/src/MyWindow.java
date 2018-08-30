// ������
import java.awt.CardLayout;

import javax.swing.*;
//  JDK 1.2 ���� (javax) => xml, sql...
//  ������ ����� ��ü ����ϰ� �ʹ� :  ���(extends)
/*
 *    ������
 *      JFrame : �Ϲ�������
 *      JPanel
 *      =======
 *      JDialog : 
 *      JWindow 
 */
import java.awt.event.*;
public class MyWindow extends JFrame implements ActionListener{
   MainView mv = new MainView();
   WaitRoom wr = new WaitRoom();
   GameRoom gr = new GameRoom();
   //RoomMake rm = new RoomMake();
   CardLayout card = new CardLayout();
    // ������ ����
   MyWindow()  {
      

      setLayout(card);
      add("MV",mv);
      add("MF",wr);
      add("GR",gr);
      //add("RM",rm);
      
      // ������ ũ��
      setSize(1600, 900);
      // ������ �����޶�
      setVisible(true);
      setResizable(false);
      
      mv.b1.addActionListener(this); // ȭ��ѱ�� �ؿ��� ����
      wr.b1.addActionListener(this); 
      wr.b2.addActionListener(this); 
      wr.b3.addActionListener(this); 
      wr.b4.addActionListener(this); 
      wr.b5.addActionListener(this); 
      wr.b6.addActionListener(this);
      gr.b3.addActionListener(this);
    //  rm.b7.addActionListener(this);
   }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      try
      {
         UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
      }catch(Exception ex) {} //����ó��
      MyWindow m = new MyWindow();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==mv.b1)                     // ȭ��ѱ��
      {
         card.show(getContentPane(), "MF");
      }
      
      
      if(e.getSource()==wr.b1 || e.getSource()==wr.b2 || e.getSource()==wr.b3 || e.getSource()==wr.b4 || e.getSource()==wr.b5 || e.getSource()==wr.b6)                     // ȭ��ѱ��
      {
         card.show(getContentPane(), "GR");
      }
      
      
      if(e.getSource()==gr.b3)                     // ȭ��ѱ��
      {
         card.show(getContentPane(), "MF");
      }
      
    
   }

}