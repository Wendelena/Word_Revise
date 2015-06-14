import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Word_Frame extends JFrame{
	public JButton import_list=new JButton("Import New Word List");
	public JButton change_list=new JButton("Change Word List");
	public JTextArea list_status=new JTextArea();
	public JPanel list_set=new JPanel();
	public JButton start_study=new JButton("Start Studying");
	public Database base;
	public int nowq;
	public Word_Frame(){
		//base=new Database("user");
		base=null;
		import_list.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
		change_list.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
		start_study.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
	}
	public static void main(String []args){
		Word_Frame gui=new Word_Frame();
		gui.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);//Quit the application
			}
		});
	}
}