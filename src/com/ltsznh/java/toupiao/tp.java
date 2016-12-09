package com.ltsznh.java.toupiao;

import java.awt.BorderLayout;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.event.WindowStateListener;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import chrriis.common.UIUtils;
import chrriis.dj.nativeswing.swtimpl.NativeInterface;

public class tp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UIUtils.setPreferredLookAndFeel();
		NativeInterface.open();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame frame = new JFrame("投票");
				// frame.setUndecorated(true);// 禁用此窗体的装饰
				frame.setLocationRelativeTo(null);// 居中显示
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.getContentPane().add(new tpLPanel(), BorderLayout.CENTER);

				frame.setSize(720, 600);

//				frame.addWindowStateListener(new WindowStateListener() {
//
//					@Override
//					public void windowStateChanged(WindowEvent e) {
//						// TODO Auto-generated method stub
//						System.out.println(e.getNewState());
//					}
//				});
				// ;(new WindowListener() {
				//
				// @Override
				// public void windowOpened(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// @Override
				// public void windowIconified(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// @Override
				// public void windowDeiconified(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// @Override
				// public void windowDeactivated(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// @Override
				// public void windowClosing(WindowEvent e) {
				// // TODO Auto-generated method stub
				// frame.dispose();
				// }
				//
				// @Override
				// public void windowClosed(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// @Override
				// public void windowActivated(WindowEvent e) {
				// // TODO Auto-generated method stub
				//
				// }
				// });

				frame.setLocationByPlatform(true);
				frame.setVisible(true);
			}
		});
		NativeInterface.runEventPump();

		// new tpFrame().setVisible(true);
	}

}
