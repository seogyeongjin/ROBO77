import javax.swing.*; // J~
import java.awt.*; // Color,Layout
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.table.*;
public class GameRoom extends JPanel implements ActionListener {
	JButton b1,b2,b3;
	JLabel la1,la2,la3,la4,la5;
	JTextField tf1,tf2,tf3,tf4,tf5;
	JTextArea ta;
	JTextField tf;
	JPanel gp;
	Image back;
	GameRoom()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\wait2.jpg");
		// 초기값
		b1=new JButton("게임준비");
		b2=new JButton("게임시작");
		b3=new JButton("나가기"); // 클래스 초기화
		
		la1=new JLabel();
		la1.setOpaque(true);
		la1.setBackground(Color.black);
		la2=new JLabel();
		la2.setOpaque(true);
		la2.setBackground(Color.black);
		la3=new JLabel();
		la3.setOpaque(true);
		la3.setBackground(Color.black);
		la4=new JLabel();
		la4.setOpaque(true);
		la4.setBackground(Color.black);
		la5=new JLabel();
		la5.setOpaque(true);
		la5.setBackground(Color.black);
		
		
		tf1=new JTextField();
		tf2=new JTextField();
		tf3=new JTextField();
		tf4=new JTextField();
		tf5=new JTextField();
		
		ta=new JTextArea();
		JScrollPane js=new JScrollPane(ta);
		tf=new JTextField();
		
		gp=new JPanel();
		
		
		// 배치
		setLayout(null);
		// null 직접 배치
		la1.setBounds(30, 50, 400, 250);
		tf1.setBounds(250, 60, 170, 30);
		
		gp.setBounds(200, 50, 1200, 700);
		gp.setOpaque(false);
		
		la2.setBounds(1170, 50, 400, 250);
		tf2.setBounds(1390, 60, 170, 30); 
		
		la3.setBounds(30, 320, 400, 250);
		tf3.setBounds(250, 330, 170, 30);
		
		la4.setBounds(1170, 320, 400, 250);
		tf4.setBounds(1390, 330, 170, 30);
		
		la5.setBounds(30, 590, 800, 250);
		tf5.setBounds(40, 800, 170, 30);
		
		add(la1);
		add(tf1);
		
		add(la2);
		add(tf2);
		
		add(la3);
		add(tf3);
		
		add(la4);
		add(tf4);
		
		add(la5);
		add(tf5);
		
		
		
		js.setBounds(850, 590, 720, 210); // 채팅창
		add(js);
		// div {x:10 y:10}
		tf.setBounds(850, 810, 720, 30); // 채팅
		add(tf);
		
		JPanel p=new JPanel();
		p.setLayout(new GridLayout(1, 3, 5, 5)); // 버튼
		p.setOpaque(false);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		
		p.setBounds(1270, 15, 300, 25);
		add(p);
		
		
		add(gp);
		
		// 윈도우 크기 결정
		setSize(1600, 900);
		setVisible(true);
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE); // 프로그램 종료
		
		tf.addActionListener(this);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameRoom();
		
		
	
	}
	// 스킨입힐때
	   protected void paintComponent(Graphics g) {
	      g.drawImage(back, 0, 0, getWidth(),getHeight(),this);
	   }
	   
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
