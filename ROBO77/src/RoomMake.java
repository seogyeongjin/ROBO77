import javax.swing.*;
import java.awt.*; // Image
import java.awt.event.ActionListener;
public class RoomMake extends JFrame{

JLabel la1; // 规力格
JButton b1,b2; // 积己, 秒家
JTextField tf; 

RoomMake()
{
   setLayout(null);
   
    la1=new JLabel("规力格");
    b1=new JButton("积己");
   b2=new JButton("秒家");
    tf=new JTextField();

    la1.setBounds(100, 95, 100, 30);
       add(la1);

    tf.setBounds(150, 90, 300, 40); // 规力格 咆胶飘 农扁
       add(tf);
    
    b1.setBounds(180, 200, 100, 30); // 积己 咆胶飘
      add(b1);
      
      b2.setBounds(320, 200, 100, 30); // 秒家 咆胶飘
      add(b2);
 

    setSize(600,300); // 扩档快 芒 农扁
      setVisible(true);
      
      
}
public static void main(String[] args) {
   // TODO Auto-generated method stub
   try
   {
      UIManager.setLookAndFeel("com.jtattoo.plaf.hifi.HiFiLookAndFeel");
   }catch(Exception ex){} //抗寇贸府
   RoomMake rm=new RoomMake();
}
   
}