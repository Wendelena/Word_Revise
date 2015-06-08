import java.io.*;
import java.util.*;
import java.awt.*;
import javax.swing.*;
public class Study_Panel extends JFrame{
	public JButton dontknow=new JButton("I Don't Remember");
	public JButton pron=new JButton("Picture");
	public JButton option1=new JButton("Button 1");
	public JButton option2=new JButton("Button 2");
	public JButton option3=new JButton("Button 3");
	public JButton option4=new JButton("Button 4");
	public JTextField title=new JTextField();
	public JTextField time=new JTextField();
	public JTextField spell=new JTextField();
	public JButton spellc=new JButton("OK");
	public JPanel Pselect=new JPanel();
	public JPanel Pspell=new JPanel();
	public final Core;
	public Question nowq;
	public Study_Panel(){
		option1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				if(nowq.ans==0) nowq.obj.Correct();
				else nowq.obj.Incorrect();
			}
		});
		option2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
		option3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
		option4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
			}
		});
	}
}