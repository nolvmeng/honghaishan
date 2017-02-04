package ruangong;

import java.awt.Container;

import javax.swing.*;

public class main extends JFrame {
	JButton bu_rearch= new JButton("查询");
	JLabel la_airNo = new JLabel("航班号：");
	JTextField fie_airnNo =new JTextField();
	JTextArea air_Info = new JTextArea();

	Container c=getContentPane();
	
	/*构造函数*/
	main(String title){
		super(title);
		c.setLayout(null);
		
		c.add(la_airNo);
		c.add(bu_rearch);
		c.add(fie_airnNo);
		c.add(air_Info);
		
		air_Info.setEditable(false);
		
		
		la_airNo.setBounds(10,20, 60, 45);
		bu_rearch.setBounds(300, 20, 75, 50);
		fie_airnNo.setBounds(70, 25, 200, 30);
		air_Info.setBounds(30, 75, 400, 275);
		
		setSize(600	, 400);
	    setLocationRelativeTo(null);//居中
	   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	}
	public static void main(String[] args) {

		main frame = new main("航班查询系统");
		frame.setVisible(true);
		frame.setResizable(false);
		
		
		
	}

}
