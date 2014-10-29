import java.awt.BorderLayout;
import java.awt.event.*;

import javax.swing.*;


public class CalScoreDemo extends JFrame implements ActionListener {
	JTextField [] jtxtScore = new JTextField[4];
	JTextField [] jtxtWeight = new JTextField[4];
	JButton jbtnCalScore = new JButton("Calcuate Score");
	JPanel jpnlScore = new JPanel(); 
	JTextField jtxtDisplay = new JTextField();
	//jpnlScore.setLayout();
	
	int [] score = new int [4];
	double [] weight = new double [4];
	public CalScoreDemo() {
		for(int i=0; i<jtxtScore.length; i++) {
			jtxtScore[i] = new JTextField(6);
			jtxtWeight[i] = new JTextField(6);
			jpnlScore.add(jtxtScore[i]);
			jpnlScore.add(jtxtWeight[i]);
		}
		jbtnCalScore.addActionListener(this);
		add(jtxtDisplay, BorderLayout.NORTH);
		add(jpnlScore);
		add(jbtnCalScore, BorderLayout.SOUTH);
		setVisible(true);
		pack();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		for(int i=0; i<score.length; i++) {
			score[i] = Integer.parseInt(jtxtScore[i].getText());
			weight[i] = Double.parseDouble(jtxtWeight[i].getText());
		}
		jtxtDisplay.setText(CalScore.calScore(score, weight)+"");
		//jtxtDisplay.setText("TEST");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CalScoreDemo();
	}

}
