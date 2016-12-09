package com.ltsznh.java.toupiao;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;

public class tpLPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// private String userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 7_1_2 like
	// Mac OS X) "
	// + "AppleWebKit/537.51.1 (KHTML, like Gecko) Mobile/11D257 " +
	// "MicroMessenger/5.3.1";
	private String userAgent = "Mozilla/5.0 (iPhone; CPU iPhone OS 7_0_2 like Mac OS X) "
			+ "AppleWebKit/537.51.1 (KHTML, like Gecko) CriOS/30.0.1599.12 Mobile/11A501 Safari/8536.25"
			+ "MicroMessenger/5.3.1";

	private String tpymUrl = "http://vote.hnzgw.org/template/10003/tp_person.jsp?id=75";

	private String mainUrl = "http://vote.hnzgw.org/template/10003/votepage.jsp?qid=41&svote_41=842";
	// private String touUrl =
	// "http://tp.lhworld.cn/plugin.php?id=tom_weixin_vote" + "&mod=save" +
	// "&act=clicks"
	// + "&formhash=9630b5a8" + "&vid=5";
	//
	// private String touString =
	// "http://tp.lhworld.cn/plugin.php?id=tom_weixin_vote&mod=save"
	// + "&tpxm=%E5%BC%A0%E5%B3%B0" + "&tptel=18381646987" +
	// "&formhash=ac7af5c1" + "&tomhash=145076" + "&vid=5"
	// + "&tid=120" + "&act=tpadd";

	Clipboard clipboard;
	JWebBrowser webBrowser;

	public tpLPanel() {

		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		webBrowser = new JWebBrowser();
		setLayout(null);
		JPanel panel1 = new JPanel();
		panel1.setLocation(0, 0);
		add(panel1);
		panel1.setSize(450, 30);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		JLabel label = new JLabel("");
		panel1.add(label);

		JLabel label_1 = new JLabel("");
		panel1.add(label_1);

		webBrowser.setJavascriptEnabled(true);
		webBrowser.setBarsVisible(false);
		// webBrowser.setLocationBarVisible(false);
		// webBrowser.setMenuBarVisible(false);
		// webBrowser.setButtonBarVisible(false);
		webBrowser.setStatusBarVisible(true);

		clearCookie();

		webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
			public void loadingProgressChanged(WebBrowserEvent wbe) {
				JWebBrowser wb = wbe.getWebBrowser();
				// String pageUrl = wb.getResourceLocation();
				int progress = wb.getLoadingProgress();
				if (progress == 100) {
					// String jsCommand = "";
					// ....
					// wb.executeJavascript(jsCommand);
					System.out.println("��ҳ�������");
					System.out.println(JWebBrowser.getCookie(mainUrl, "JSESSIONID"));
					System.out.println(webBrowser.getHTMLContent());
					if (webBrowser.getHTMLContent() == null) {
						// System.out.println(webBrowser.getHTMLContent());
						// if (webBrowser.getHTMLContent().contains("")) {
						clearCookie();
						navigateUrl();
						// // rXm();
						//
					}
				}
			};
		});

		navigateUrl();
		// rXm();

		// JPanel panel = new JPanel();
		webBrowser.setBounds(0, 30, 700, 530);
		// add(panel);
		add(webBrowser);

		// System.out.println("ͶƱ������");
		// System.out.println("1����ϵͳ��˫����ͶƱ.bat����ͶƱҳ�棬һ���ڿ�������Ϣ��ʾ��һ��ͶƱҳ�棺����ͶƱ");
		// System.out.println("2����ͶƱ��ͶƱҳ��ˢ�³����ݺ�������ҳ�����ͶƱ������ͶƱ�����������ֻ��ſ�");
		// System.out.println("3�������������ֻ��ţ���껬���Զ����ɵ���������ϵͳ�Զ�����������ճ������������ֻ�����ͬ");
		// System.out.println("4����ͶƱ�����ͶƱ����");
		// System.out.println("5��ϵͳ��ת����ˢ�£�Ȼ���ظ�1-4����");
	}

	protected void navigateUrl() {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		// m.put("Referer", referer);
		// m.put("Accept",
		// "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		// m.put("Accept-Language", "en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4");
		// m.put("User-Agent", userAgent);
		// m.put("Accept-Encoding", "gzip, deflate, sdch");
		// m.put("Host", "tp.lhworld.cn");
		// m.put("Connection", "Keep-Alive");
		// m.put("Upgrade-Insecure-Requests", "1");
		// m.put("Cookie", "");

		WebBrowserNavigationParameters p = new WebBrowserNavigationParameters();
		p.setHeaders(m);

		webBrowser.navigate(mainUrl, p);
		System.out.println("ˢ��ҳ��");
	}

	protected void clearCookie() {
		// TODO Auto-generated method stub
		System.out.println("���cookie");
		JWebBrowser.clearSessionCookies();
		System.out.println(JWebBrowser.getCookie(mainUrl, "JSESSIONID"));
		// JWebBrowser.setCookie(mainUrl, "xcse_2132_lastact=");
		// JWebBrowser.setCookie(mainUrl, "xcse_2132_lastvisit=");
		// JWebBrowser.setCookie(mainUrl, "xcse_2132_saltkey=");
		// JWebBrowser.setCookie(mainUrl, "xcse_2132_sid=");
		// JWebBrowser.setCookie(mainUrl, "xcse_2132_tom_wx_vote_vid5_userid=");
	}

}
