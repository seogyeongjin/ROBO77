import javax.swing.*;
import java.awt.*;
import javax.swing.table.*;
import java.awt.event.*;
public class WaitRoom extends JPanel implements ActionListener{
    JLabel la1,la2,lanum1,lanum2,lasoo1,lasoo2,law1,law2, latitle1, latitle2, la3;
    JTable table1,table2;
    DefaultTableModel model1,model2;
    JTextArea ta;
    JTextField tf,tf2;
    JButton b1,b2,b3,b4,b5,b6,b7,b8;
    Image back;
    
    WaitRoom()
    {
       
       setLayout(null);
       back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\wait2.jpg");
       la1=new JLabel("방개설 정보");
       la2=new JLabel("채팅방");
       la3=new JLabel("접속자 정보");
       ta=new JTextArea();
       JScrollPane js3=new JScrollPane(ta);
       tf=new JTextField();
       tf2=new JTextField();
       
       b1=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b2=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b3=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b4=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b5=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b6=new JButton(new ImageIcon("c:\\javaDev\\wait1.png"));
       b7=new JButton("방만들기");
       b8=new JButton("게임종료");

       
       //table
       String[] col={"방이름","공개/비공개","인원"};
       String[][] row=new String[0][3];
       model1=new DefaultTableModel(row, col);
       table1=new JTable(model1);
       JScrollPane js1=new JScrollPane(table1);
       
       
       String[] col1={"아이디","닉네임","위치"};
       String[][] row1=new String[0][3];
       model2=new DefaultTableModel(row1, col1);
       table2=new JTable(model2);
       JScrollPane js4=new JScrollPane(table2);
       js4.setOpaque(false);
       js4.getViewport().setOpaque(false);

       
       // 배치
       la1.setBounds(65, 25, 100, 30);
       la1.setForeground(Color.white);
       js1.setBounds(10, 50, 500, 300);
       
       add(la1);
       //add(js1);
       
       la2.setBounds(65, 565, 100, 30);
       la2.setForeground(Color.white);
       //js2.setBounds(10, 395, 500, 150);
       
       add(la2);
       //add(js2);
       
       la3.setBounds(1050, 400, 120, 30);
       la3.setForeground(Color.white);
       js4.setBounds(1050, 430, 500, 240);
         add(la3);
       add(js4);
       
       tf2.setBounds(1050, 460, 500, 215);
       add(tf2);
       
       //채팅방
       Color color = new Color(0,0,0);
       js3.setBounds(65, 600, 870, 225);
       js3.setForeground(color);
       add(js3);
       tf.setBounds(65, 830, 870, 30);
       add(tf);
       
       //방입장 버튼 위 라벨 설정
       //la1,la2,lanum1,lanum2,lasoo1,lasoo2,law1,law2, latitle1, latitle2;
       int a=1;
       int b=5;
       lanum1= new JLabel("001");
       lanum2= new JLabel("002");
       lasoo1= new JLabel(a+"/"+b);
       lasoo2= new JLabel(a+"/"+b);
       law1 = new JLabel("WAITING");
       law2 = new JLabel("WAITING");
       latitle1 = new JLabel("초보만 달려요 ㄱㄱ~");
       latitle2 = new JLabel("제발 고수만~ 못하면 오지마");
       lanum1.setBounds( 500, 50, 300, 100);
       lanum1.setForeground(Color.black);
       lanum1.setOpaque(false);
       lanum1.setBorder(javax.swing.BorderFactory.createEmptyBorder());
       lanum2.setBounds(65, 565, 100, 30);
       lanum2.setForeground(Color.white);
       lasoo1.setBounds(65, 565, 100, 30);
       lasoo1.setForeground(Color.white);
       lasoo2.setBounds(65, 565, 100, 30);
       lasoo2.setForeground(Color.white);
       law1.setBounds(65, 565, 100, 30);
       law1.setForeground(Color.white);
       law2.setBounds(65, 565, 100, 30);
       law2.setForeground(Color.white);
       latitle1.setBounds(65, 565, 100, 30);
       latitle1.setForeground(Color.white);
       latitle2.setBounds(65, 565, 100, 30);
       latitle2.setForeground(Color.white);
      
       
       // 크기
       
       JPanel p=new JPanel();
       p.setOpaque(false);
       p.setLayout(new GridLayout(3, 2,10,10));
       p.add(b1);p.add(b2);
       p.add(b3);p.add(b4);
       p.add(b5);p.add(b6);
       //방입장관련
       p.setBounds(60,65,900, 480);
       add(p);
       
       b7.setOpaque(true);
         b7.setLayout(null);
         b8.setOpaque(true);
         b8.setLayout(null);
         add(b7);
         add(b8);
         b7.setBounds(1060, 710, 220, 100);
         b8.setBounds(1320, 710, 220, 100);
         setSize(1600,900);
       setVisible(true);
      
       tf2.addActionListener(this);
       String[] data= {"lobo01","닉네임","대기실"};
         model2.addRow(data);
      

    }
   public static void main(String[] args) {
      // TODO Auto-generated method stub
      try
      {
         UIManager.setLookAndFeel("com.jtattoo.plaf.mint.MintLookAndFeel");
      }catch(Exception ex) {} //예외처리
        WaitRoom wr=new WaitRoom();
   }
     // 스킨입힐때
      /*@Override
      protected void paintComponent(Graphics g) {
         g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
      }*/
   @Override
   protected void paintComponent(Graphics g) {
      g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
   }

   
   @Override
   public void actionPerformed(ActionEvent e) {
      // TODO Auto-generated method stub
      if(e.getSource()==tf)
      {
         String s = tf.getText();
         ta.append(s+"\n");
         tf.setText("");
      }
      
      
   }
}