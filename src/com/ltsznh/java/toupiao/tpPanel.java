package com.ltsznh.java.toupiao;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.util.HashMap;
import java.util.Map;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import chrriis.dj.nativeswing.swtimpl.components.JWebBrowser;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserAdapter;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserEvent;
import chrriis.dj.nativeswing.swtimpl.components.WebBrowserNavigationParameters;

public class tpPanel extends JPanel {

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

	private String mainUrl = "http://tp.lhworld.cn/plugin.php?id=tom_weixin_vote&mod=info&vid=5&tid=120";
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

	private String xing = "��Ǯ��������֣��������������������������ʩ�ſײ��ϻ���κ�ս���л������ˮ��������˸��ɷ�����³Τ������ﻨ������Ԭ��ۺ��ʷ�Ʒ����Ѧ�׺����������ޱϺ�����������ʱ��Ƥ���뿵����Ԫ������ƽ�ƺ�������Ҧ��տ����ë����ױ���갼Ʒ��ɴ�̸��é���ܼ�������ף������������ϯ����ǿ��·¦Σ��ͯ�չ�÷ʢ�ֵ�����������Ĳ��﷮���������֧���ù�¬Ī�������Ѹɽ�Ӧ�ڶ����ڵ��������������ʯ�޼�ť�������ϻ���½��������춻�����ҷ����ഢ���������ɾ��θ����ڽ��͹�����ɽ�ȳ������ȫۭ�����������������ﱩ�����������������ղ����Ҷ��˾��۬�輻��ӡ�ް׻���ۢ�Ӷ����̼���׿�����ɳ����������ܲ�˫��ݷ����̷�����̼������Ƚ��۪Ӻ���ɣ���ţ��ͨ�����༽ۣ����ũ�±�ׯ�̲����ֳ�Ľ����ϰ�°���������������������߾Ӻⲽ�����������Ŀܹ�»�ڶ�Ź�����εԽ��¡ʦ�������˹��������������Ǽ��Ŀ�����ɳؿ������ᳲ��������ᾣ������Ȩ�ָ��滸����ٹ˾���Ϲ�ŷ���ĺ�������˶��������ʸ�ξ�ٹ����̨��ұ����������ڵ���̫����������������ԯ����������ĳ���Ľ����������˾ͽ˾������˾���붽�ӳ�����ľ����������������ṫ���ذϼй��׸����������Ʒ���۳Ϳ�նθɰ��ﶫ�����ź��ӹ麣����΢����˧�ÿ�������������������������Ĳ��٦�����Ϲ�ī�������갮��١�����Ը�";
	private String ming = "Ȼ�鿵����ǿ����𢳽�����������ǲ�平����平�ط�������������ӿ�ط���������ǳ��M�ǰ���ԣΫʢ����Ȼ��˳��������𶰼��������˳˻����طȨ�ڿ��뼪ΰ��������۷��������������𿬶�������幺׿����ʢ������轲��ӿ���衿����ҿ����ǳ����������ٺ��ݳ�����Ϋ���󆴷���ԣ��˺���ԣ�����ں����˸�ڼ���������㻸���������������������������˳Ͽ�����������平ϼ�����ŲĹ�Τ�����ͷ�������ط������ԣ�������������Ѵ����ڰ�Ȼ����𩳽������ط���˸��������������������ط���������������˲���平�Ȼ�����M��平��������׿�������Ȼ����׿�������Ȩ������۳������˺躣���ǿ��������M�۷��㺣�������ּ��Ȩ��������ط�����ĳ�����ȿ����³���κ��ҿ��γ��Ѹ���������ȶ������������Ȼ����ط��������ڵ۳������ٿ��濥���� ���갿���������������������ڼ���Ң�ʿ��˳�ط�ƿ��ѳ�����������˳������ڳ˳ۼγ۳�Ȼ�ֆ�����迥Զ�������˿���ƽ�˺����������׿��Ͷ�������������妳����˱�����𶰼��п���幱���ط���˱������������˰����������л�����˸����˿����������Z��ʳ��������̾��޳����ݺ׫h�����ʫ�����ѩ�����������ӱ�ɶ��ͮ��ε���β�����ѩ�����������������ϼɼ���������������������ͮ�Z��¶ѩ衽���֥���������Ȳ�ܰᰲʲʺ�����櫺������溯��ɼ������÷���ܰ����������β����h����ѩ��ѩ�����������ټλ���÷�����������ɺ�����黪��ѩ��������·��÷������ӱ��ӱ�������Ĳ��ȫhᰱ�������櫷�����÷֥������������Ź�����������ɼޱ��ɼ���ϲʷ��������÷�ޱ����������֥�ڷ㶬�ڿ��ɳ����ٲ�������������÷�������������ྲ����ޱ���������ν���꿹�衲�ɼ�����ݲʫh�����Ʋ�����÷�ŭZ������ε����Z���꺮����������÷�ֽ��ʲ��������û��һ������ν�᰹�ܰ�������ս�ɼ��ѩ����ž��±���÷����骽�骲ɲʾ������溳���÷ܰ��������������������ʱ����ܰ�����ӱ���²ʻ�����ܰ�짻�����ѩ������ø��Ͻ���ŷ㷼��������ͮ����ε����������ѩ÷���ε����ѩ���ᷫ������ѩ����ޱ����骱�ӱ�������ͮ�����׾������������������㾲ͮ��¹�����������ŷ�������ѩ�����ϼ������������������������Z÷����ٻ������ѩܰ�����ٷ���";
	private JTextField lbXm;
	private JTextField lbPhone;

	Clipboard clipboard;
	JWebBrowser webBrowser;

	public tpPanel() {

		clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

		webBrowser = new JWebBrowser();
		setLayout(null);
		JPanel panel1 = new JPanel();
		panel1.setLocation(0, 0);
		add(panel1);
		panel1.setSize(450, 30);
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));

		lbXm = new JTextField();
		lbXm.setText("zhagnshan");
		panel1.add(lbXm);
		// panel1.add

		lbXm.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				// System.out.println("test");
				clipboard.setContents(new StringSelection(lbXm.getText()), null);
				System.out.println("�����Ѹ���");

			}
		});

		JLabel label = new JLabel("");
		panel1.add(label);

		JLabel label_1 = new JLabel("");
		panel1.add(label_1);

		lbPhone = new JTextField();
		lbPhone.setText("1564546546546");
		panel1.add(lbPhone);

		lbPhone.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				clipboard.setContents(new StringSelection(lbPhone.getText()), null);
				System.out.println("�ֻ����Ѹ���");
			};
		});

		webBrowser.setJavascriptEnabled(true);
		webBrowser.setBarsVisible(false);
		// webBrowser.setLocationBarVisible(false);
		// webBrowser.setMenuBarVisible(false);
		// webBrowser.setButtonBarVisible(false);
		webBrowser.setStatusBarVisible(true);

		clearCookie();

		webBrowser.getNativeComponent().addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseMoved(MouseEvent e) {
				// eventOutput("Mouse moved--", e);
				// System.out.println(e.getX() + " " + e.getY());

				// System.out.println(webBrowser.getNativeComponent().getComponentAt(e.getX(),
				// e.getY()).getName());
				// System.out.println(
				// webBrowser.getNativeComponent().getComponentAt(e.getX(),
				// e.getY()).getLocation().getX());

				// System.out.println(webBrowser.getNativeComponent().get);
				// webBrowser.mouseDown(new Event(), e.getX(), e.getY());};
			}

		});

		webBrowser.getNativeComponent().addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
//				System.out.println(e.getX() + " == " + e.getY());
			}
		});

		webBrowser.addWebBrowserListener(new WebBrowserAdapter() {
			public void loadingProgressChanged(WebBrowserEvent wbe) {
				JWebBrowser wb = wbe.getWebBrowser();
//				String pageUrl = wb.getResourceLocation();
				int progress = wb.getLoadingProgress();
				if (progress == 100) {
					// String jsCommand = "";
					// ....
					// wb.executeJavascript(jsCommand);
					System.out.println("��ҳ�������");
					 System.out.println(webBrowser.getHTMLContent());
					if (webBrowser.getHTMLContent().contains("ֻ������΢���д�")) {
						clearCookie();
						navigateUrl();
						rXm();

					}
				}
			};
		});

		navigateUrl();
		rXm();

		// JPanel panel = new JPanel();
		webBrowser.setBounds(0, 30, 400, 530);
		// add(panel);
		add(webBrowser);

		System.out.println("ͶƱ������");
		System.out.println("1����ϵͳ��˫����ͶƱ.bat����ͶƱҳ�棬һ���ڿ�������Ϣ��ʾ��һ��ͶƱҳ�棺����ͶƱ");
		System.out.println("2����ͶƱ��ͶƱҳ��ˢ�³����ݺ�������ҳ�����ͶƱ������ͶƱ�����������ֻ��ſ�");
		System.out.println("3�������������ֻ��ţ���껬���Զ����ɵ���������ϵͳ�Զ�����������ճ������������ֻ�����ͬ");
		System.out.println("4����ͶƱ�����ͶƱ����");
		System.out.println("5��ϵͳ��ת����ˢ�£�Ȼ���ظ�1-4����");
	}

	protected void navigateUrl() {
		// TODO Auto-generated method stub
		Map<String, String> m = new HashMap<String, String>();
		// m.put("Referer", referer);
		m.put("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
		m.put("Accept-Language", "en-US,en;q=0.8,zh-CN;q=0.6,zh;q=0.4");
		m.put("User-Agent", userAgent);
		m.put("Accept-Encoding", "gzip, deflate, sdch");
		m.put("Host", "tp.lhworld.cn");
		m.put("Connection", "Keep-Alive");
		m.put("Upgrade-Insecure-Requests", "1");
		m.put("Cookie", "");

		WebBrowserNavigationParameters p = new WebBrowserNavigationParameters();
		p.setHeaders(m);

		webBrowser.navigate(mainUrl, p);
		System.out.println("ˢ��ҳ��");
	}

	protected void clearCookie() {
		// TODO Auto-generated method stub
		System.out.println("���cookie");
		JWebBrowser.clearSessionCookies();
		JWebBrowser.setCookie(mainUrl, "xcse_2132_lastact=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_lastvisit=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_saltkey=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_sid=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_tom_wx_vote_vid5_userid=");
	}

	private void rXm() {
		// TODO Auto-generated method stub
		System.out.println("\n��������������ֻ���");
		int x = (int) ((long) (Math.random() * 1000000L) % xing.length());
		int y = (int) ((long) (Math.random() * 1000000L) % ming.length());
		lbXm.setText(xing.substring(x, x + 1) + ming.substring(y, y + 1));
		lbPhone.setText("13" + (long) (Math.random() * 1000000000L));
		if (lbPhone.getText().length() < 11)
			do {

				lbPhone.setText(lbPhone.getText() + "0");
			} while (lbPhone.getText().length() < 11);

	}
}
