package login;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.*;






public class login 
{
	public static void main(String args[])
	{
		new ex().setVisible(true);
		
	}
}
class chaxunjieguo extends JDialog{
	public chaxunjieguo(String[] str ,String[][] str1){
		Container container = getContentPane();
		container.setLayout(null);
		DefaultTableModel biaomodel = new DefaultTableModel(str1,str);
		JTable biao = new JTable(biaomodel);
		JTableHeader tou = biao.getTableHeader();
		tou.setBounds(5, 3, 800, 20);
		biao.setBounds(5,23,800,500);
		container.add(biao);
		container.add(tou);
		setSize(820,530);
		
	}
}

class ex extends JDialog{
	public ex(){
		super();
		Container container = getContentPane();
		container.setLayout(null);
		ImageIcon background = new ImageIcon("background.jpg");
		JLabel backgrounde = new JLabel(background);
		backgrounde.setSize(1100,619);
		container.add(backgrounde);
		JTabbedPane xianshi = new JTabbedPane();
		xianshi.setTabLayoutPolicy(JTabbedPane.WRAP_TAB_LAYOUT);
		ImageIcon imageIcon = new ImageIcon("tab.jpg");
		JLabel tb1 = new JLabel();
		xianshi.addTab("ͬѧ", imageIcon,tb1,"ͬѧ");
		xianshi.setBounds(10,20,500,530);
		backgrounde.add(xianshi);
		JComboBox chazhaoliebiao = new JComboBox();
		chazhaoliebiao.addItem("ͬѧ");

		chazhaoliebiao.setBounds(850,80,150,30);
		String[] changshangtou = {"ѧ��","����","��ͥסַ","�绰","΢��","����","QQ","��������"};
		
		
		String[][] changshangshuju = getTable();		//�˴�Ӧ�����ݿ�
		
		
		DefaultTableModel changshangmodel = new DefaultTableModel(changshangshuju,changshangtou);
		JTable changshangbiao = new JTable(changshangmodel);
		changshangbiao.setBounds(3,20,495,500);
		JTableHeader changshangbiaotou = changshangbiao.getTableHeader();
		changshangbiaotou.setBounds(3,0,changshangbiao.getWidth(),20);
		tb1.add(changshangbiaotou);
		tb1.add(changshangbiao);
		
		//���Ҳ���
		JComboBox xiugailiebiao = new JComboBox();
		JButton xiugai = new JButton("�޸�");
		JButton xiugaitijiao = new JButton("�޸�");
		JButton chazhao = new JButton("����");
		chazhao.setBounds(850, 30, 80, 30);
		JTextField jt21 = new JTextField("",20);
		JTextField jt22 = new JTextField("",20);
		JTextField jt23 = new JTextField("",20);
		JTextField jt24 = new JTextField("",20);
		JTextField jt25 = new JTextField("",20);
		JTextField jt26 = new JTextField("",20);
		
		JTextField jt27 = new JTextField("",20);
		JTextField jt28 = new JTextField("",20);
		JTextField jt29 = new JTextField("",20);
		JTextField jt2a = new JTextField("",20);
		JTextField jt2b = new JTextField("",20);
		JTextField jt2c = new JTextField("",20);
		JTextField jt2d = new JTextField("",20);
		jt21.setBounds(850,130,80,30);
		jt22.setBounds(850,180,80,30);
		jt23.setBounds(850,230,80,30);
		jt24.setBounds(850,280,80,30);
		jt25.setBounds(850,330,80,30);
		jt26.setBounds(850,380,80,30);
		jt27.setBounds(850,430,80,30);
		
		jt28.setBounds(950,130,80,30);
		jt29.setBounds(950,180,80,30);
		jt2a.setBounds(950,230,80,30);
		jt2b.setBounds(950,280,80,30);
		jt2c.setBounds(950,330,80,30);
		jt2d.setBounds(950,380,80,30);
		
		JLabel jl21 = new JLabel("");
		JLabel jl22 = new JLabel("");
		JLabel jl23 = new JLabel("");
		JLabel jl24 = new JLabel("");
		JLabel jl25 = new JLabel("");
		JLabel jl26 = new JLabel("");
		JLabel jl27 = new JLabel("");
		
		JLabel jl28 = new JLabel("");
		JLabel jl29 = new JLabel("");
		JLabel jl2a = new JLabel("");
		JLabel jl2b = new JLabel("");
		JLabel jl2c = new JLabel("");
		JLabel jl2d = new JLabel("");
		
		
		jl21.setBounds(850,110,80,20);
		jl22.setBounds(850,160,80,20);
		jl23.setBounds(850,210,80,20);
		jl24.setBounds(850,260,80,20);
		jl25.setBounds(850,310,80,20);
		jl26.setBounds(850,360,80,20);
		jl27.setBounds(850,410,80,20);
		jl28.setBounds(850,460,80,20);
		

		JButton chazhaotijiao = new JButton("�ύ");
		chazhaotijiao.setBounds(900,500,80,30);
		
		//ɾ������
		JButton shanchu = new JButton("ɾ��");
		shanchu.setBounds(700, 30, 80, 30);
		JButton daochu = new JButton("����");
		daochu.setBounds(700, 500, 80, 30);
		daochu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
			});

		backgrounde.add(daochu);
		JComboBox shanchuliebiao = new JComboBox();
		shanchuliebiao.addItem("ͬѧ");
		shanchuliebiao.setBounds(700, 80, 80, 30);
		
		
		JButton tianjia = new JButton("���");
		tianjia.setBounds(550, 30, 80, 30);
		JComboBox tianjialiebiao = new JComboBox();
		tianjialiebiao.addItem("ͬѧ");
		tianjialiebiao.setBounds(550, 80, 80, 30);
		JTextField jt1 = new JTextField("",20);
		jt1.setBounds(550,130,80,30);
		JTextField jt2 = new JTextField("",20);
		jt2.setBounds(550,180,80,30);
		JTextField jt3 = new JTextField("",20);
		jt3.setBounds(550, 230, 80, 30);
		JTextField jt4 = new JTextField("",20);
		jt4.setBounds(550, 280, 80, 30);
		JTextField jt5 = new JTextField("",20);
		jt5.setBounds(550, 330, 80, 30);
		JTextField jt6 = new JTextField("",20);
		jt6.setBounds(550, 380, 80, 30);
		JTextField jt7 = new JTextField("",20);
		jt7.setBounds(550, 430, 80, 30);
		JTextField jt8 = new JTextField("",20);
		jt7.setBounds(550, 480, 80, 30);
		JLabel jl1 = new JLabel("");
		JLabel jl2 = new JLabel("");
		JLabel jl3 = new JLabel("");
		JLabel jl4 = new JLabel("");
		JLabel jl5 = new JLabel("");
		JLabel jl6 = new JLabel("");
		JLabel jl7 = new JLabel("");
		JLabel jl8 = new JLabel("");
		jl1.setBounds(550, 110, 100, 20);
		jl2.setBounds(550, 160, 100, 20);
		jl3.setBounds(550, 210, 100, 20);
		jl4.setBounds(550, 260, 100, 20);
		jl5.setBounds(550, 310, 100, 20);
		jl6.setBounds(550, 360, 100, 20);
		jl7.setBounds(550, 410, 100, 20);
		jl8.setBounds(550, 460, 100, 20);
		JButton tijiaotianjia = new JButton("�ύ");
		tijiaotianjia.setBounds(550, 450, 80, 30);
		tijiaotianjia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					String a0=jt1.getText()+","+jt2.getText()+","+jt3.getText()+","+jt4.getText()+","+jt5.getText()+","+jt6.getText()+","+jt7.getText()+","+jt8.getText();
					String[] a=a0.split(",");
					try {
						makeInsert(a);
					} catch (SQLException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}
					/*String��ʽ jt1.getText()Ϊ�̺ţ�������2.������������3 ��ַ 4 ��ϵ��ʽ5��ע*/
					
					
					String[][] changshangshuju =getTable();//////
					
					
					changshangmodel.setDataVector(changshangshuju, changshangtou);
					changshangbiao.repaint();
				
				
			}
		});
		tianjialiebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt1);
					backgrounde.remove(jt2);
					backgrounde.remove(jt3);
					backgrounde.remove(jt4);
					backgrounde.remove(jt5);
					backgrounde.remove(jt6);
					backgrounde.remove(jt7);
					backgrounde.remove(jt8);
					backgrounde.remove(jl1);
					backgrounde.remove(jl2);
					backgrounde.remove(jl3);
					backgrounde.remove(jl4);
					backgrounde.remove(jl5);
					backgrounde.remove(jl6);
					backgrounde.remove(jl7);
					backgrounde.remove(jl8);
					jl1.setText("");
					jl2.setText("");
					jl3.setText("");
					jl4.setText("");
					jl5.setText("");
					jl6.setText("");
					jl7.setText("");
					jl8.setText("");
					jt1.setText("");
					jt2.setText("");
					jt3.setText("");
					jt4.setText("");
					jt5.setText("");
					jt6.setText("");
					jt7.setText("");
					jt8.setText("");
					
					
						jl1.setText("ѧ��");
						jl2.setText("����");
						jl3.setText("��ͥסַ");
						jl4.setText("�绰");
						jl5.setText("΢��");
						jl6.setText("����");
						jl7.setText("QQ");
						jl8.setText("��������");
						backgrounde.add(jl1);
						backgrounde.add(jl2);
						backgrounde.add(jl3);
						backgrounde.add(jl4);
						backgrounde.add(jl5);
						backgrounde.add(jl6);
						backgrounde.add(jl7);
						backgrounde.add(jl8);
						
						backgrounde.add(jt1);
						backgrounde.add(jt2);
						backgrounde.add(jt3);
						backgrounde.add(jt4);
						backgrounde.add(jt5);
						backgrounde.add(jt6);
						backgrounde.add(jt7);
						backgrounde.add(jt8);
						backgrounde.repaint();
					
				}
			}
		});
		JTextField jt11 = new JTextField("",20);
		JTextField jt12 = new JTextField("",20);
		JTextField jt13 = new JTextField("",20);
		JTextField jt14 = new JTextField("",20);
		JTextField jt15 = new JTextField("",20);
		JTextField jt16 = new JTextField("",20);
		JTextField jt17 = new JTextField("",20);
		JTextField jt18 = new JTextField("",20);
		jt11.setBounds(700,130,80,30);
		jt12.setBounds(700,180,80,30);
		jt13.setBounds(700,230,80,30);
		jt14.setBounds(700,280,80,30);
		jt15.setBounds(700,330,80,30);
		jt16.setBounds(700,380,80,30);
		jt17.setBounds(700,430,80,30);
		jt18.setBounds(700,480,80,30);
		JLabel jl11 = new JLabel("");
		JLabel jl12 = new JLabel("");
		JLabel jl13 = new JLabel("");
		JLabel jl14 = new JLabel("");
		JLabel jl15 = new JLabel("");
		JLabel jl16 = new JLabel("");
		JLabel jl17 = new JLabel("");
		JLabel jl18 = new JLabel("");
		jl11.setBounds(700,110,80,20);
		jl12.setBounds(700,160,80,20);
		jl13.setBounds(700,210,80,20);
		jl14.setBounds(700,260,80,20);
		jl15.setBounds(700,310,80,20);
		jl16.setBounds(700,360,80,20);
		jl17.setBounds(700,410,80,20);
		jl18.setBounds(700,460,80,20);
		JButton shanchutijiao = new JButton("�ύ");
		shanchutijiao.setBounds(700, 460, 80, 30);
		shanchuliebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt11);
					backgrounde.remove(jt12);
					backgrounde.remove(jt13);
					backgrounde.remove(jt14);
					backgrounde.remove(jt15);
					backgrounde.remove(jt16);
					backgrounde.remove(jt17);
					backgrounde.remove(jt18);
					backgrounde.remove(jl11);
					backgrounde.remove(jl12);
					backgrounde.remove(jl13);
					backgrounde.remove(jl14);
					backgrounde.remove(jl15);
					backgrounde.remove(jl16);
					backgrounde.remove(jl17);
					backgrounde.remove(jl18);
					jt11.setText("");
					jt12.setText("");
					jt13.setText("");
					jt14.setText("");
					jt15.setText("");
					jt16.setText("");
					jt17.setText("");
					jt18.setText("");
					jl11.setText("");
					jl12.setText("");
					jl13.setText("");
					jl14.setText("");
					jl15.setText("");
					jl16.setText("");
					jl17.setText("");
					jl18.setText("");
					backgrounde.add(shanchutijiao);
					
						jl11.setText("ѧ��");
						jl12.setText("����");
						jl13.setText("��ͥסַ");
						jl14.setText("�绰");
						jl15.setText("΢��");
						jl16.setText("����");
						jl17.setText("QQ");
						jl18.setText("��������");
						backgrounde.add(jl11);
						backgrounde.add(jl12);
						backgrounde.add(jl13);
						backgrounde.add(jl14);
						backgrounde.add(jl15);
						backgrounde.add(jl16);
						backgrounde.add(jl17);
						backgrounde.add(jl18);
						backgrounde.add(jt11);
						backgrounde.add(jt12);
						backgrounde.add(jt13);
						backgrounde.add(jt14);
						backgrounde.add(jt15);
						backgrounde.add(jt16);
						backgrounde.add(jt17);
						backgrounde.add(jt18);
						backgrounde.repaint();
					
				}
			}
		});
		shanchutijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.out.println(shanchuliebiao.getSelectedItem());
				
					String a0=jt11.getText()+","+ jt12.getText()+","+ jt13.getText()+","+ jt14.getText()+","+ jt15.getText()+","+ jt16.getText()+","+ jt17.getText()+","+ jt18.getText();
					String[] a=a0.split(",");
					try {
						makeDelete(a);
					} catch (SQLException e1) {
						// TODO �Զ����ɵ� catch ��
						e1.printStackTrace();
					}
					/*jt11.getText()�̺�*/
					
					
					String[][] changshangshuju =getTable();
					
					
					changshangmodel.setDataVector(changshangshuju, changshangtou);
					changshangbiao.repaint();
				
			}
		});
		shanchu.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jt29);
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.remove(jt2a);
				backgrounde.remove(jt2b);
				backgrounde.remove(jt2c);
				backgrounde.remove(jt2d);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(jl29);
				backgrounde.remove(jl2a);
				backgrounde.remove(jl2b);
				backgrounde.remove(jl2c);
				backgrounde.remove(jl2d);
				backgrounde.remove(jt21);
				backgrounde.remove(jt22);
				backgrounde.remove(jt23);
				backgrounde.remove(jt24);
				backgrounde.remove(jt25);
				backgrounde.remove(jt26);
				backgrounde.remove(jl21);
				backgrounde.remove(jl22);
				backgrounde.remove(jl23);
				backgrounde.remove(jl24);
				backgrounde.remove(jl25);
				backgrounde.remove(jl26);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(jl7);
				backgrounde.remove(jl6);
				backgrounde.remove(jl5);
				backgrounde.remove(jl4);
				backgrounde.remove(jl3);
				backgrounde.remove(jl2);
				backgrounde.remove(jl1);
				backgrounde.remove(jt1);
				backgrounde.remove(jt2);
				backgrounde.remove(jt3);
				backgrounde.remove(jt4);
				backgrounde.remove(jt5);
				backgrounde.remove(jt6);
				backgrounde.remove(jt7);
				backgrounde.remove(tijiaotianjia);
				backgrounde.add(shanchuliebiao);
				backgrounde.add(jl11);
				backgrounde.add(jt11);
				backgrounde.add(shanchutijiao);
				backgrounde.repaint();
			}
		});
		backgrounde.add(shanchu);
		tianjia.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.add(tianjialiebiao);
				backgrounde.repaint();
				tianjialiebiao.setSelectedItem("ͬѧ");
				jl1.setText("ѧ��");
				jl2.setText("����");
				jl3.setText("��ͥסַ");
				jl4.setText("�绰");
				jl5.setText("΢��");
				jl6.setText("����");
				jl7.setText("QQ");
				jl8.setText("��������");
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jt29);
				backgrounde.remove(jt2a);
				backgrounde.remove(jt2b);
				backgrounde.remove(jt2c);
				backgrounde.remove(jt2d);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(jl29);
				backgrounde.remove(jl2a);
				backgrounde.remove(jl2b);
				backgrounde.remove(jl2c);
				backgrounde.remove(jl2d);
				backgrounde.remove(jt21);
				backgrounde.remove(jt22);
				backgrounde.remove(jt23);
				backgrounde.remove(jt24);
				backgrounde.remove(jt25);
				backgrounde.remove(jt26);
				backgrounde.remove(jl21);
				backgrounde.remove(jl22);
				backgrounde.remove(jl23);
				backgrounde.remove(jl24);
				backgrounde.remove(jl25);
				backgrounde.remove(jl26);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(shanchutijiao);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(jl6);
				backgrounde.remove(jt6);
				backgrounde.add(tijiaotianjia);
				backgrounde.add(jl1);
				backgrounde.add(jl2);
				backgrounde.add(jl3);
				backgrounde.add(jl4);
				backgrounde.add(jt1);
				backgrounde.add(jt2);
				backgrounde.add(jt3);
				backgrounde.add(jt4);
				backgrounde.add(jt5);
				backgrounde.add(jl5);
				backgrounde.add(jt6);
				backgrounde.add(jl6);
				backgrounde.add(jt7);
				backgrounde.add(jl7);
				backgrounde.add(jt8);
				backgrounde.add(jl8);
				backgrounde.repaint();
			}
		});
		
		//����
		backgrounde.add(chazhao);
		chazhaotijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
					String[] a={jt21.getText(),jt22.getText(),jt23.getText(),jt24.getText(),jt25.getText()};
					/*jt21.getText()�̺�2����3��ַ4��ϵ��ʽ5��ע*/
					String[] str = {"����","��ͥסַ","�绰","΢��","����","QQ","��������"};
					
					
					String[][] str1 =makeSelect(a);///////
					
					
					new chaxunjieguo(str,str1).setVisible(true);
				
			}
		});
		chazhao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				jl21.setText("ѧ��");
				jl22.setText("����");
				jl23.setText("��ͥסַ");
				jl24.setText("�绰");
				jl25.setText("΢��");
				jl26.setText("����");
				jl27.setText("QQ");
				jl28.setText("��������");
				backgrounde.remove(xiugaitijiao);
				backgrounde.remove(xiugailiebiao);
				backgrounde.add(jl21);
				backgrounde.add(jl22);
				backgrounde.add(jl23);
				backgrounde.add(jl24);
				backgrounde.add(jl25);
				backgrounde.add(jl26);
				backgrounde.add(jl27);
				backgrounde.add(jl28);
				backgrounde.add(jt21);
				backgrounde.add(jt22);
				backgrounde.add(jt23);
				backgrounde.add(jt24);
				backgrounde.add(jt25);
				backgrounde.add(jt26);
				backgrounde.add(jt27);
				backgrounde.add(jt28);
				backgrounde.add(chazhaotijiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(jl1);
				backgrounde.remove(jl2);
				backgrounde.remove(jl3);
				backgrounde.remove(jl4);
				backgrounde.remove(jl5);
				backgrounde.remove(jl6);
				backgrounde.remove(jl7);
				backgrounde.remove(tijiaotianjia);
				backgrounde.remove(jt1);
				backgrounde.remove(jt2);
				backgrounde.remove(jt3);
				backgrounde.remove(jt4);
				backgrounde.remove(jt5);
				backgrounde.remove(jt6);
				backgrounde.remove(jt7);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jl26);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jt26);
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jt29);
				backgrounde.remove(jt2a);
				backgrounde.remove(jt2b);
				backgrounde.remove(jt2c);
				backgrounde.remove(jt2d);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(jl29);
				backgrounde.remove(jl2a);
				backgrounde.remove(jl2b);
				backgrounde.remove(jl2c);
				backgrounde.remove(jl2d);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(shanchutijiao);
				backgrounde.repaint();
			}
		});
		chazhaoliebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt21);
					backgrounde.remove(jt22);
					backgrounde.remove(jt23);
					backgrounde.remove(jt24);
					backgrounde.remove(jt25);
					backgrounde.remove(jt26);
					backgrounde.remove(jt27);
					backgrounde.remove(jt28);
					backgrounde.remove(jt29);
					backgrounde.remove(jt2a);
					backgrounde.remove(jt2b);
					backgrounde.remove(jt2c);
					backgrounde.remove(jt2d);
					backgrounde.remove(jl21);
					backgrounde.remove(jl22);
					backgrounde.remove(jl23);
					backgrounde.remove(jl24);
					backgrounde.remove(jl25);
					backgrounde.remove(jl26);
					backgrounde.remove(jl27);
					backgrounde.remove(jl28);
					backgrounde.remove(jl29);
					backgrounde.remove(jl2a);
					backgrounde.remove(jl2b);
					backgrounde.remove(jl2c);
					backgrounde.remove(jl2d);
					backgrounde.remove(chazhaotijiao);
					jt21.setText("");
					jt22.setText("");
					jt23.setText("");
					jt24.setText("");
					jt25.setText("");
					jt26.setText("");
					jt27.setText("");
					jt28.setText("");
					jt29.setText("");
					jt2a.setText("");
					jt2b.setText("");
					jt2c.setText("");
					jt2d.setText("");
					jl21.setText("ѧ��");
					jl22.setText("����");
					jl23.setText("��ͥסַ");
					jl24.setText("�绰");
					jl25.setText("΢��");
					jl26.setText("����");
					jl27.setText("QQ");
					jl28.setText("��������");
						backgrounde.add(jl21);
						backgrounde.add(jl22);
						backgrounde.add(jl23);
						backgrounde.add(jl24);
						backgrounde.add(jl25);
						backgrounde.add(jl26);
						backgrounde.add(jl27);
						backgrounde.add(jl28);
						backgrounde.add(jt21);
						backgrounde.add(jt22);
						backgrounde.add(jt23);
						backgrounde.add(jt24);
						backgrounde.add(jt25);
						backgrounde.add(jt26);
						backgrounde.add(jt27);
						backgrounde.add(jt28);
						backgrounde.add(chazhaotijiao);
						backgrounde.repaint();
					
				}
			}
		});
		
		
		backgrounde.add(xiugai);
		xiugaitijiao.setBounds(700, 500, 80, 30);
		xiugai.setBounds(950,30,80,30);
		
		xiugailiebiao.addItem("ͬѧ");
		xiugailiebiao.setBounds(700, 100, 80, 30);
		xiugailiebiao.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				if(e.getStateChange()==1){
					backgrounde.remove(jt21);
					backgrounde.remove(jt22);
					backgrounde.remove(jt23);
					backgrounde.remove(jt24);
					backgrounde.remove(jt25);
					backgrounde.remove(jt26);
					backgrounde.remove(jt27);
					backgrounde.remove(jt28);
					backgrounde.remove(jt29);
					backgrounde.remove(jt2a);
					backgrounde.remove(jt2b);
					backgrounde.remove(jt2c);
					backgrounde.remove(jt2d);
					backgrounde.remove(jl21);
					backgrounde.remove(jl22);
					backgrounde.remove(jl23);
					backgrounde.remove(jl24);
					backgrounde.remove(jl25);
					backgrounde.remove(jl26);
					backgrounde.remove(jl27);
					backgrounde.remove(jl28);
					backgrounde.remove(jl29);
					backgrounde.remove(jl2a);
					backgrounde.remove(jl2b);
					backgrounde.remove(jl2c);
					backgrounde.remove(jl2d);
					jt21.setText("");
					jt22.setText("");
					jt23.setText("");
					jt24.setText("");
					jt25.setText("");
					jt26.setText("");
					jt27.setText("");
					jt28.setText("");
					jt29.setText("");
					jt2a.setText("");
					jt2b.setText("");
					jt2c.setText("");
					jt2d.setText("");
					backgrounde.remove(jt1);
					backgrounde.remove(jt2);
					backgrounde.remove(jt3);
					backgrounde.remove(jt4);
					backgrounde.remove(jt5);
					backgrounde.remove(jt6);
					backgrounde.remove(jt7);
					backgrounde.remove(jt8);
					backgrounde.remove(jl1);
					backgrounde.remove(jl2);
					backgrounde.remove(jl3);
					backgrounde.remove(jl4);
					backgrounde.remove(jl5);
					backgrounde.remove(jl6);
					backgrounde.remove(jl7);
					backgrounde.remove(jl8);
					jl1.setText("");
					jl2.setText("");
					jl3.setText("");
					jl4.setText("");
					jl5.setText("");
					jl6.setText("");
					jl7.setText("");
					jl8.setText("");
					jt1.setText("");
					jt2.setText("");
					jt3.setText("");
					jt4.setText("");
					jt5.setText("");
					jt6.setText("");
					jt7.setText("");
					jt8.setText("");
					if(e.getItem()=="ͬѧ"){
						jl21.setText("ѧ��");
						jl22.setText("����");
						jl23.setText("��ͥסַ");
						jl24.setText("�绰");
						jl25.setText("΢��");
						jl26.setText("����");
						jl27.setText("QQ");
						jl28.setText("��������");
						backgrounde.add(jl21);
						backgrounde.add(jl22);
						backgrounde.add(jl23);
						backgrounde.add(jl24);
						backgrounde.add(jl25);
						backgrounde.add(jl26);
						backgrounde.add(jl27);
						backgrounde.add(jt21);
						backgrounde.add(jt22);
						backgrounde.add(jt23);
						backgrounde.add(jt24);
						backgrounde.add(jt25);
						backgrounde.add(jt26);
						backgrounde.add(jt27);
						jl1.setText("ѧ��");
						jl2.setText("����");
						jl3.setText("��ͥסַ");
						jl4.setText("�绰");
						jl5.setText("΢��");
						jl6.setText("����");
						jl7.setText("QQ");
						jl8.setText("��������");
						backgrounde.add(jl1);
						backgrounde.add(jl2);
						backgrounde.add(jl3);
						backgrounde.add(jl4);
						backgrounde.add(jl5);
						backgrounde.add(jl6);
						backgrounde.add(jl7);
						backgrounde.add(jt1);
						backgrounde.add(jt2);
						backgrounde.add(jt3);
						backgrounde.add(jt4);
						backgrounde.add(jt5);
						backgrounde.add(jt6);
						backgrounde.add(jt7);
						backgrounde.repaint();
					}
				}
			}
		});
		xiugai.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				backgrounde.add(xiugailiebiao);
				
				backgrounde.add(jl21);
				backgrounde.add(jl22);
				backgrounde.add(jl23);
				backgrounde.add(jl24);
				backgrounde.add(jl25);
				backgrounde.add(jt21);
				backgrounde.add(jt22);
				backgrounde.add(jt23);
				backgrounde.add(jt24);
				backgrounde.add(jt25);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(tianjialiebiao);
				backgrounde.remove(chazhaoliebiao);
				backgrounde.repaint();
				
				backgrounde.add(jl1);
				backgrounde.add(jl2);
				backgrounde.add(jl3);
				backgrounde.add(jl4);
				backgrounde.add(jt1);
				backgrounde.add(jt2);
				backgrounde.add(jt3);
				backgrounde.add(jt4);
				backgrounde.add(jt5);
				backgrounde.add(jl5);
				backgrounde.remove(jl6);
				backgrounde.remove(tijiaotianjia);
				backgrounde.remove(chazhaotijiao);
				backgrounde.remove(jt6);
				backgrounde.remove(jl11);
				backgrounde.remove(jl12);
				backgrounde.remove(jl13);
				backgrounde.remove(jl26);
				backgrounde.remove(jt11);
				backgrounde.remove(jt12);
				backgrounde.remove(jt13);
				backgrounde.remove(jt26);
				backgrounde.remove(jt27);
				backgrounde.remove(jt28);
				backgrounde.remove(jt29);
				backgrounde.remove(jt2a);
				backgrounde.remove(jt2b);
				backgrounde.remove(jt2c);
				backgrounde.remove(jt2d);
				backgrounde.remove(jl27);
				backgrounde.remove(jl28);
				backgrounde.remove(jl29);
				backgrounde.remove(jl2a);
				backgrounde.remove(jl2b);
				backgrounde.remove(jl2c);
				backgrounde.remove(jl2d);
				backgrounde.remove(shanchuliebiao);
				backgrounde.remove(shanchutijiao);
				backgrounde.add(xiugaitijiao);
				backgrounde.repaint();
			}
		});
		xiugaitijiao.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				String i = "";
				if(jt21.getText()==i&&jt22.getText()==i&&jt23.getText()==i&&jt24.getText()==i&&jt25.getText()==i&&jt26.getText()==i&&jt27.getText()==i&&jt28.getText()==i);
				else{
						String[] a1={jt21.getText(),jt22.getText(),jt23.getText(),jt24.getText(),jt25.getText(),jt26.getText(),jt27.getText(),jt28.getText()};
						String[] a={jt1.getText(),jt2.getText(),jt3.getText(),jt4.getText(),jt5.getText(),jt6.getText(),jt7.getText(),jt8.getText()};
						
						/*String��ʽ jt1.getText()Ϊ�̺ţ�������2.������������3 ��ַ 4 ��ϵ��ʽ5��ע*/
						
						
						String[][] changshangshuju = getTable();
						
						
						changshangmodel.setDataVector(changshangshuju, changshangtou);
						changshangbiao.repaint();
					
				}
				
			}
		});
		setTitle("����Աģʽ");
		backgrounde.add(tianjia);
		setSize(1100,619);
	}
	
	public static String[][] getTable()
	{
		String[][] table= null;
		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList"
				;
		int k=8;
		Connection conn=null;
		Statement stmt = null;
		ResultSet rs,rs1=null;
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=StudentList;";
		String user ="sa",pswd="123456";
		try
		{
			conn = DriverManager.getConnection(url,user,pswd);
			stmt = conn.createStatement();
			rs=stmt.executeQuery(sql);
			int sample = 0;
		    while (rs.next())
		    {
		    	sample++;
		    }
		    table=new String[sample][k];
		    rs = stmt.executeQuery(sql);
		    for (int i = 0; rs.next(); i++)
		    {
		    		int j=0;
	                for(;j<k;j++)
	                	table[i][j]=rs.getString(attr[j]);
	        }
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(stmt!=null)
		            stmt.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return table;
	}
	public void makeInsert(String[] a) throws SQLException
	{
		int k=8;
		String sql= "INSERT INTO StuList(SNO,SNAME,ADRESS,PHONE,WECHAT,EMAIL,QQ,WORDS) VALUES (?,?,?,?,?,?,?,?);";
		Connection conn=null;
		PreparedStatement pstmt = null;
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=StudentList;";
		String user ="sa",pswd="123456";
		try
		{
			
			conn = DriverManager.getConnection(url,user,pswd);
			try {
			   pstmt = conn.prepareStatement(sql);
			   for(int i=0;i<k;i++)
			   {
				   pstmt.setString(i+1,a[i]);
			   }
			   int rows = pstmt.executeUpdate();
			   System.out.println("Rows impacted : " + rows );
			}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("���ݿ����ʧ��");
			}
			finally {
				if(pstmt!=null)
		            pstmt.close();
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public void makeDelete(String[] a) throws SQLException
	{
		String sql= "DELETE FROM StuList WHERE mfno=?";
		int k=1;
		Connection conn=null;
		PreparedStatement pstmt = null;
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=StudentList;";
		String user ="sa",pswd="123456";
		try
		{
			conn = DriverManager.getConnection(url,user,pswd);
			try {
			   pstmt = conn.prepareStatement(sql);
			   for(int i=0;i<k;i++)
			   {
				   pstmt.setString(i+1,a[i]);
			   }
			   int rows = pstmt.executeUpdate();
			   System.out.println("Rows impacted : " + rows );
			}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("���ݿ�ɾ��ʧ��");
			}
			finally {
				if(pstmt!=null)
		            pstmt.close();
			}
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}
	public static String[][] makeSelect(String[] a)
	{
		String[][] table= null;
		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList where SNO like ?1 and SNAME like ?2 and ADRESS like PHONE and WECHAT like ?4 and EMAIL like ?5 and QQ like ?6 and WORDS like ?7"
				;
		int k=8;
		Connection conn=null;
		PreparedStatement pstmt = null;
		Statement stmt=null;
		ResultSet rs=null;
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=StudentList;";
		String user ="sa",pswd="123456";
		try
		{
			conn = DriverManager.getConnection(url,user,pswd);
			String tmp=sql;
			for(int i=1;i<=k;i++)
			{
				String b="?"+i;
				if(i>=10) b="?"+(char)((int)('a')+i-10);
				if(a[i-1].equals("")) tmp=tmp.replace(b,"'%'");
				else
				tmp=tmp.replace(b,"'"+a[i-1]+"'");
			}
			System.out.println(tmp);
			pstmt=conn.prepareStatement(tmp);
			rs=pstmt.executeQuery();
			int sample = 0;
		    while (rs.next())
		    {
		    	sample++;
		    }
		    int kt;
		    table=new String[sample][k];
		    rs=pstmt.executeQuery();
		    for (int i = 0;rs.next(); i++)
		    {
		    		int j=0;
	                for(;j<k;j++)
	                {
	                	table[i][j]=rs.getString(attr[j]);
	                }               
	        }

		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(pstmt!=null)
		            pstmt.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		return table;
	}
	public void makeUpDate(String[] a,String a1[]) throws SQLException
	{
		
		int sample=0;
		String[][] table= null;
		String[] attr1={"SNO=","SNAME=","ADRESS=","PHONE=","WECHAT=","EMAIL=","QQ=","WORDS="};
		String sql1= "update StuList set *1*2*3*4*5*6*7*8 where SNO like ?1 and SNAME like ?2 and ADRESS like ?3 and PHONE like ?4 and WECHAT like ?5 and EMAIL like ?6 and QQ like ?7 and WORDS like ?8";
		int k=8;
		Connection conn1=null;
		PreparedStatement pstmt1 = null;
		Statement stmt1=null;
		ResultSet rs1=null;
		String url = "jdbc:sqlserver://127.0.0.1:1433;DatabaseName=StudentList;";
		String user ="sa",pswd="123456";

		String[] attr={"SNO","SNAME","ADRESS","PHONE","WECHAT","EMAIL","QQ","WORDS"};
		String sql= "select * from StuList where SNO like ?1 and SNAME like ?2 and ADRESS like ?3 and PHONE like ?4 and WECHAT like ?5 and EMAIL like ?6 and QQ like ?7 and WORDS like ?8";
		Connection conn=null;
		PreparedStatement pstmt = null;
		Statement stmt=null;
		ResultSet rs=null;

		try
		{
			conn = DriverManager.getConnection(url,user,pswd);
			String tmp=sql;
			for(int i=1;i<=k;i++)
			{
				String b="?"+i;
				if(i>=10) b="?"+(char)((int)('a')+i-10);
				if(a[i-1].equals("")) tmp=tmp.replace(b,"'%'");
				else
				tmp=tmp.replace(b,"'"+a[i-1]+"'");
			}
			System.out.println(tmp);
			pstmt=conn.prepareStatement(tmp);
			rs=pstmt.executeQuery();
		    while (rs.next())
		    {
		    	sample++;
		    }
		    int kt;
		    table=new String[sample][k];
		    rs=pstmt.executeQuery();
		    for (int i = 0;rs.next(); i++)
		    {
		    		int j=0;
	                for(;j<k;j++)
	                {
	                	table[i][j]=rs.getString(attr[j]);
	                }               
	        }
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(pstmt!=null)
		            pstmt.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
		
		try
		{
			conn1 = DriverManager.getConnection(url,user,pswd);
			String tmp=sql1;
			for(int i=1;i<=k;i++)
			{
				String b="?"+i;
				if(i>=10) b="?"+(char)((int)('a')+i-10);
				if(a[i-1].equals("")) tmp=tmp.replace(b,"'%'");
				else
				tmp=tmp.replace(b,"'"+a[i-1]+"'");
			}
			int oip=0;
			for(int i=1;i<=k;i++)
			{
				String b="*"+i;
				String c;
				c=attr1[i-1]+a1[i-1];
				if(oip==0) ;
				else c=","+c;
				if(a1[i-1].equals("")) tmp=tmp.replace(b," ");
				else
				{tmp=tmp.replace(b,c);oip=1;}
			}
			System.out.println(tmp);
			pstmt1=conn1.prepareStatement(tmp);
			int rows = pstmt1.executeUpdate();
			System.out.println("Rows impacted : " + rows );
		}
		catch(SQLException e) 
		{
			e.printStackTrace();
			System.out.println("���ݿ�����ʧ��");
		}
		finally
		{
			try{
		         if(pstmt1!=null)
		            pstmt1.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
			try{
		         if(conn1!=null)
		            conn1.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }
		}
	}

}


