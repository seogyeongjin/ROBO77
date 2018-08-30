// 윈도우
import java.awt.CardLayout;

import javax.swing.*;
//  JDK 1.2 이전 (javax) => xml, sql...
//  윈도우 기능을 전체 사용하고 싶다 :  상속(extends)
/*
 *    윈도우
 *      JFrame : 일반윈도우
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
    // 윈도우 설정
   MyWindow()  {
      

      setLayout(card);
      add("MV",mv);
      add("MF",wr);
      add("GR",gr);
      //add("RM",rm);
      
      // 윈도우 크기
      setSize(1600, 900);
      // 윈도우 보여달라
      setVisible(true);
      setResizable(false);
      
      mv.b1.addActionListener(this); // 화면넘기기 밑에도 있음
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
      }catch(Exception ex) {} //예외처리
      MyWindow m = new MyWindow();
   }
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==mv.b1)                     // 화면넘기기
      {
         card.show(getContentPane(), "MF");
      }
      
      
      if(e.getSource()==wr.b1 || e.getSource()==wr.b2 || e.getSource()==wr.b3 || e.getSource()==wr.b4 || e.getSource()==wr.b5 || e.getSource()==wr.b6)                     // 화면넘기기
      {
         card.show(getContentPane(), "GR");
      }
      
      
      if(e.getSource()==gr.b3)                     // 화면넘기기
      {
         card.show(getContentPane(), "MF");
      }
      
    
   }

}