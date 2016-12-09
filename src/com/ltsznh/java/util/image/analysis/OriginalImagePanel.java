package com.ltsznh.java.util.image.analysis;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class OriginalImagePanel extends Panel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6710241014667842506L;
	private JLabel lbImage;

	public OriginalImagePanel() {

		FlowLayout flowLayout = new FlowLayout(FlowLayout.LEFT, 10, 10);
		setLayout(flowLayout);

		JLabel label_1 = new JLabel("\u539F\u59CB\u56FE\u7247");
		label_1.setForeground(Color.WHITE);
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		add(label_1);

		lbImage = new JLabel("");
		lbImage.setIcon(
				new ImageIcon(OriginalImagePanel.class.getResource("/com/ltsznh/java/util/image/analysis/test.jpg")));
		add(lbImage);
		// TODO Auto-generated constructor stub

	}

	public void setImage(String fileName) {

		lbImage.setIcon(new ImageIcon(fileName));
	}

	public void setImage(Image image) {
		lbImage.setIcon(new ImageIcon(image));
	}

	public void setImage(Icon icon) {
		lbImage.setIcon(icon);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Frame frame = new Frame("");

		frame.setBackground(Color.BLACK);
		OriginalImagePanel originalImagePanel = new OriginalImagePanel();
		originalImagePanel.setImage("test.jpg");

		frame.setSize(300, 200);
		frame.add(originalImagePanel);
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				frame.dispose();
			}
		});
		frame.setLocationRelativeTo(null);

		frame.setVisible(true);
	}

}
