package com.ltsznh.java.util.image.analysis;

import java.awt.Color;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.Font;

public class SecurityCodeAnalysisFrame extends Frame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6286338319216776382L;
	/**
	 * @wbp.nonvisual location=40,57
	 */

	private OriginalImagePanel originalImage;

	public SecurityCodeAnalysisFrame() {
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setAlwaysOnTop(true);
		setBackground(Color.BLACK);
		setTitle("\u8BC6\u522B\u9A8C\u8BC1\u7801");

		setUndecorated(false);
		// setExtendedState(Frame.MAXIMIZED_BOTH);

		setSize(Toolkit.getDefaultToolkit().getScreenSize().width / 2,
				Toolkit.getDefaultToolkit().getScreenSize().height / 2);

		// getGraphicsConfiguration().getDevice().setFullScreenWindow(this);//全屏
		setLocationRelativeTo(null);// 居中显示
		// setLocation((Toolkit.getDefaultToolkit().getScreenSize().width) / 2,
		// (Toolkit.getDefaultToolkit().getScreenSize().height) / 2);

		setLocationByPlatform(true);

		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exit();
			}
		});

		// scrollPane.setBackground(Color.BLACK);

		ScrollPane scrollPane = new ScrollPane();
		add(scrollPane);

		Panel panel = new Panel();
		scrollPane.add(panel);
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));

		Panel panel_3 = new Panel();
		panel_3.setBounds(0, 0, 10, 10);
		panel.add(panel_3);
		panel_3.setLayout(new BoxLayout(panel_3, BoxLayout.Y_AXIS));

		Panel panel_4 = new Panel();
		panel_3.add(panel_4);
		panel_4.setLayout(new BoxLayout(panel_4, BoxLayout.Y_AXIS));

		originalImage = new OriginalImagePanel();
		panel_4.add(originalImage);

		Label originalImagePanel = new Label();
		panel_4.add(originalImagePanel);

		Panel panel_1 = new Panel();
		panel_4.add(panel_1);
		panel_1.setLayout(null);

		Panel panel_2 = new Panel();
		panel_4.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		Panel panel_5 = new Panel();
		panel.add(panel_5);
		panel_5.setLayout(new BoxLayout(panel_5, BoxLayout.X_AXIS));

		taMessage = new TextArea();
		taMessage.setEditable(false);
		taMessage.setFont(new Font("Dialog", Font.PLAIN, 13));
		taMessage.setText("test\u6D4B\u8BD5\u6587\u6863\r\n");
		taMessage.setForeground(Color.GREEN);
		taMessage.setBackground(Color.BLACK);
		panel_5.add(taMessage);

	}

	public void setOriginalImageString(String imageString) {
		showMessage("显示原始图片");
		originalImage.setImage(imageString);
		showMessage("显示原始图片");

	}

	protected void exit() {
		// TODO Auto-generated method stub
		dispose();
		System.exit(0);
	}

	public static void showMessage(String message) {
		System.out.println(message);
		taMessage.setText(taMessage.getText() + message + "\n");
	}

	private static String imageString = "test.jpg";
	private static TextArea taMessage;

	public static void main(String[] args) {
		// File file = new File("test.jpg");
		// System.out.println(file.getAbsolutePath());
		// FileInputStream fin = new FileInputStream(file);
		//
		// BufferedImage bi = ImageIO.read(fin);
		// SecurityCodeAnalysis flt = new SecurityCodeAnalysis(bi);
		// flt.changeGrey();
		// flt.getGrey();
		// flt.getBrighten();

		// bi = flt.getProcessedImg();
		// String pname = "te";
		// file = new File(pname + ".jpg");
		// System.out.println(file.getAbsolutePath());
		// ImageIO.write(bi, "jpg", file);

		SecurityCodeAnalysisFrame scaPanel = new SecurityCodeAnalysisFrame();

		scaPanel.setOriginalImageString(imageString);

		scaPanel.setVisible(true);

	}
}
