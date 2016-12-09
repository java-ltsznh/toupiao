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

	private String xing = "ÕÔÇ®ËïÀîÖÜÎâÖ£Íõ·ë³ÂñÒÎÀ½¯Éòº«ÑîÖìÇØÓÈĞíºÎÂÀÊ©ÕÅ¿×²ÜÑÏ»ª½ğÎºÌÕ½ªÆİĞ»×ŞÓ÷°ØË®ñ¼ÕÂÔÆËÕÅË¸ğŞÉ·¶ÅíÀÉÂ³Î¤²ıÂíÃç·ï»¨·½ÓáÈÎÔ¬ÁøÛº±«Ê·ÌÆ·ÑÁ®á¯Ñ¦À×ºØÄßÌÀëøÒóÂŞ±ÏºÂÚù°²³£ÀÖÓÚÊ±¸µÆ¤±åÆë¿µÎéÓàÔª²·¹ËÃÏÆ½»ÆºÍÄÂÏôÒüÒ¦ÉÛÕ¿ÍôÆîÃ«ÓíµÒÃ×±´Ã÷ê°¼Æ·ü³É´÷Ì¸ËÎÃ©ÅÓĞÜ¼ÍÊæÇüÏî×£¶­Á»¶ÅÈîÀ¶ãÉÏ¯¼¾ÂéÇ¿¼ÖÂ·Â¦Î£½­Í¯ÑÕ¹ùÃ·Ê¢ÁÖµóÖÓĞìÇñÂæ¸ßÏÄ²ÌÌï·®ºúÁè»ôÓİÍòÖ§¿ÂêÃ¹ÜÂ¬Äª¾­·¿ôÃçÑ¸É½âÓ¦×Ú¶¡ĞûêÚµËÓôµ¥º¼ºé°üÖî×óÊ¯´Ş¼ªÅ¥¹¨³ÌïúĞÏ»¬ÅáÂ½ÈÙÎÌÜ÷Ñòì¶»İÕçôğ¼Ò·âÜÇôà´¢½ù¼³ÚûÃÓËÉ¾®¶Î¸»Î×ÎÚ½¹°Í¹­ÄÁÚóÉ½¹È³µºîåµÅîÈ«Û­°àÑöÇïÖÙÒÁ¹¬Äş³ğèï±©¸Êî×À÷ÈÖ×æÎä·ûÁõ¾°Õ²ÊøÁúÒ¶ĞÒË¾ÉØÛ¬Àè¼»±¡Ó¡ËŞ°×»³ÆÑÛ¢´Ó¶õË÷ÏÌ¼®Àµ×¿İşÍÀÃÉ³ØÇÇÒõ™äñãÄÜ²ÔË«ÎÅİ·µ³µÔÌ·¹±ÀÍåÌ¼§Éê·ö¶ÂÈ½Ô×ÛªÓºôªè³É£¹ğå§Å£ÊÙÍ¨±ßìèÑà¼½Û£ÆÖÉĞÅ©ÎÂ±ğ×¯êÌ²ñöÄÑÖ³äÄ½Á¬ÈãÏ°»Â°¬ÓãÈİÏò¹ÅÒ×É÷¸êÁÎâ×ÖÕôß¾Óºâ²½¶¼¹¢Âúºë¿ï¹úÎÄ¿Ü¹ãÂ»ãÚ¶«Å¹ì¯ÎÖÀûÎµÔ½ÙçÂ¡Ê¦¹®ØÇÄôêË¹´°½ÈÚÀäö¤ĞÁãÛÄÇ¼òÈÄ¿ÕÔøÎãÉ³Ø¿Ñø¾ÏĞë·á³²¹ØØáÏà²éáá¾£ºìÓÎóÃÈ¨åÖ¸ÇÒæ»¸¹«ÍòÙ¹Ë¾ÂíÉÏ¹ÙÅ·ÑôÏÄºîÖî¸ğÎÅÈË¶«·½ºÕÁ¬»Ê¸¦Î¾³Ù¹«Ñòå£Ì¨¹«Ò±×ÚÕşå§Ñô´¾ÓÚµ¥ÓÚÌ«ÊåÉêÍÀ¹«ËïÖÙËïĞùÔ¯ÁîºüÖÓÀëÓîÎÄ³¤ËïÄ½ÈİÏÊÓÚãÌÇğË¾Í½Ë¾¿ÕØÁ¹ÙË¾¿ÜØë¶½×Ó³µò§Ëï¶ËÄ¾Î×Âí¹«Î÷ÆáµñÀÖÕıÈÀæá¹«Á¼ÍØ°Ï¼Ğ¹ÈÔ×¸¸¹ÈÁº½ú³şãÆ·¨ÈêÛ³Í¿ÇÕ¶Î¸É°ÙÀï¶«¹ùÄÏÃÅºôÑÓ¹éº£ÑòÉàÎ¢ÉúÔÀË§çÃ¿º¿öºóÓĞÇÙÁºÇğ×óÇğ¶«ÃÅÎ÷ÃÅÉÌÄ²ÙÜÙ¦²®ÉÍÄÏ¹¬Ä«¹şÚÛóÎÄê°®ÑôÙ¡µÚÎåÑÔ¸£";
	private String ming = "È»Ïé¿µÉı×ÓÇ¿°¿½Üğ¢³½¿¡êÑÔËÁ¼ÏÀĞÇ²©å¹³½±ò½Üå¹³ÛØ·³ÛÊ÷¿µ³¿×ÓÅô×Ó¿¥Ø·»±¿­ÁÖÔËĞÇ³õÆMĞÇ°²ĞùÔ£Î«Ê¢µÛè÷È»ğ©ÔË³¿¿¡ºãÔËÈğ¶°¼ÎĞùĞÇÓÂÊË³Ë»±³Ûå¹Ø·È¨ÌÚ¿¥ºë¼ªÎ°±òĞÇğ©ÏÀ³Û·ãÒú¿¥ÎÄÁ¼³½³ÛÈğ¿¬¶°Òú³½ºèå¹º×¿¡°î¿¥ÒİÊ¢è÷ĞÇĞÇè½²ÄÑÓ¿¥±ó¿¥è¡¿¥²©¼Ò¿¥³½ĞÇ³½³¿ÏéĞùÔËÈÙº£Òİ³½¿¥¼ÑÎ«öÎÔó†´·åÁúÔ£·ã³Ëº²ÔËÔ£ºèöÎÌÚº×Óî¾ôË¸ÌÚ¼ÑÃúÌìÁÖÕğºã»¸À¤±şÎÄÔËÏÀÁúĞÇÔËÌì³ÛÁºìõĞùğ©ÔË³Ï¿¥¸£ìûÕñ·«Áú¼Îå¹³Ï¼Òå¹ìõĞÅ²Ä¹úÎ¤ÒúÔËêÍ·²¶°Ê÷ÕğØ·èî±ò°îÔËÔ£º£¿¥ºèĞù³©†´êÑ´ÇìûÌÚ°²È»Èğ¿µÌìğ©³½Ğù¸£¼ÒØ·å¹ÖĞË¸¿¥ÌÚÑôÒú¿¡Ê÷ºÆè÷Õñ³¿ÕñØ·å¹Á¼¼Îî£¼Îìû³½ÌÎÑÓÔË²©¼Òå¹³ËÈ»³½ÌìÆM¿µå¹³¿å¦ÎÄÁ¼Õñ×¿²©·ã²ÄÔËÈ»ÕğÌÚ×¿ºèÉıÅôğ©È¨Á¼³¿ÕñµÛ³¿ÈáÌÚÔËºèº£¸£ĞÇ¿¡±òÕñÕñÆM³Û·å±ò·ãº£¶°êÑÕÜÁÖ¼Îî£¿¥È¨¾ô³½½õ¿¥Ø·ğ©å¹ĞÅÎÄ³õè½å¹å¹îÈ¿¥¿¥µÂ³¿Õğ¼Îº£¼Ò¿¥¼Î³õ¼Ñ¸£ÆæÅôÕñ³ÛîÈ¶°¿¥Ãú¿¥º£å¹ÒİÈ»ÁÖìõØ·¿¥·ãº×ÕñÌÚµÛ³¿¿¥ÔËÈÙ¿¥Ææ¿¥»¸±ş ¼ÒÄê°¿ÑôÕñ³¿Õñ³½Õñ¸£ÔËÕñĞÇÕğĞÇÕñÌÚ¼ÎĞÇÒ¢ÔÊ¿¥ÔË³ËØ·ºÆ¿¥êÑ³¿³½å¹ÌÚÒúÕğÔË³½»±²ÄÌÚ³Ë³Û¼Î³Û³©È»ÁÖ†´ÌìÕñºè¿¥Ô¶ÁúĞù³ÛÔË¿¥ÈÙÆ½ÔËº£³½ÔËÓî³½ÕñÕñ×¿ğ©êÍ¶°¿¡³¿¶°¿¥ÕñÁ¼å¦³¿Á¼ÔË±ş·ãå¦Õğ¶°¼ÎÖĞ¿¥´Çå¹±òÏéØ·ÑÕÔË±ò·ã³ÎÈñ¶°Éı³õ³½ÔË°²ÒİÅôÑôÁÖÚĞ»ª¹úÓÓË¸Ææº×ÔË¿¥³½º¯ê¿İÕÖé­ZÏã²Ê³õæÃÜçº×Ñå±Ì¾²ÖŞ³õ½õ»İº×«hè´İíÂşÊ«»ÛéÙá°Ñ©½õÁ«¸ñÃÀÑå¼ÒÓ±²É¶¬è´Í®¹ğ¾²Îµ²ÊÃÎ²ÊÔÆĞñÑ©º¯º­ÃÎÁÖæºÁÕÕÑÁÖÑåÏ¼É¼ÓÅÁáæÃÈá²ÊÁèÁèÖŞÔÆÂşÁÕÍ®­Z¼ÎÂ¶Ñ©è¡½õÃÎÖ¥åûÄÈÃôÏãÄÈ²ÉÜ°á°²Ê²Êº­ÒÀåûæ«ºèİæÊæÊæº¯ÑÅÉ¼İíÑş»İÃ·ç÷æºÜ°ÃÎÈá²Éè¯İæ¸ñÃÎ²¯»¨«h²ÊÃÎÑ©º­Ñ©»ÛÔÂæÂÓñæÂèÙ¼Î»¨¿ËÃ·è¡ĞÀÃÎÓêÁ«ÃÀÉºÃÀâùÏé»ªæÃÑ©Á«½àæÃì§ÔÂ·²éªÃ·´ºÁ«³õÓ±ÑÅÓ±ÒÀ·ã×ËÎÄ²ÊÄÈ«há°±òç÷·¼º®æ«·«åûÑÅÃ·Ö¥ÕäéªæÃÊææÂÅæÑÅ¹ğÃÎæºÈáÅæ²ÉÊçÉ¼Ş±ç÷É¼åûÔÏ²Ê·ãâù¼ÒÁèæÃ·²Ş±¾²½õÏÒÔÂÃôÖ¥îÚ·ã¶¬îÚ¿¡¿É³õ¹ğÀÙ²ÊçşæÃÁé±ùÌÒÈáè´Ã·âù½õº¯·«³ÊÃ÷½à¾²²¯½õŞ±¾²ÃÀâù¹ğÃÎ½õåûê¿¹ğè¡²ÊÉ¼²ÉÁ«Äİ²Ê«h·²¿ËÔÆ²É×ËĞÀÃ·ÓÅ­ZÂüÕÑÁÖÎµÕäÊæ­Zº¯Óêº®İæÏãê¿Ã÷Ïã¸ñÃ·ÁÖ½õ²Ê²ÊÄİİæ×ÏæÃ»¶ÌÒ»ÛèÙÂş¼Î½õá°¹ğÜ°²ÉÕı²ÉİÕ½õÉ¼³ÊÑ©Ğñ³õÑÅ¾²ÔÂ±òº­ÑåÃ·¹ğĞÀéª½àéª²É²Ê¾²Âşº®éªæº³õ·ãÃ·Ü°æºæÃè¯ÓñÔÂêØöÎİæ½õ¹ğâù²Ê±òÁèè´Ü°ÌÒÓñ²ÊÓ±»ªÔÂ²Ê»¶½õö©Ü°á°ì§»¶Âüç÷Ñ©éªâùåûæÃ¸ñÔÏ½õæºÓÅ·ã·¼º®ç÷»¨³¿Í®İæèÙÎµÑÅÃÎöÎÈáêØÑ©Ã·è´îÚÎµÁáÀöÑ©º®Èá·«ÔÆÒÀ³õÑ©·¼ÅæŞ±ÑÅîÚéª±ÌÓ±ÅæÃÎÑå²ÊÍ®¸ñÂüº×¾²·ÆÏÒÑÅÃÎæÃÃ÷³õåûÈã¾²Í®éªÔÂ¹ğ½àÌÒÑÅÖéåûÑÅ·¼½õâù´ºÑ©ĞÀ·«éªÏ¼²¯Ã÷ÓÅĞñ²ÊÁéæÃİí²ÊÓêÑåéªÂş­ZÃ·åûÃôÙ»æÃÔÆåûÑ©Ü°¸ñÄÈéÙ·ãİí";
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
				System.out.println("ĞÕÃûÒÑ¸´ÖÆ");

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
				System.out.println("ÊÖ»úºÅÒÑ¸´ÖÆ");
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
					System.out.println("ÍøÒ³¼ÓÔØÍê±Ï");
					 System.out.println(webBrowser.getHTMLContent());
					if (webBrowser.getHTMLContent().contains("Ö»ÔÊĞíÔÚÎ¢ĞÅÖĞ´ò¿ª")) {
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

		System.out.println("Í¶Æ±·½·¨£º");
		System.out.println("1¡¢´ò¿ªÏµÍ³£ºË«»÷¡°Í¶Æ±.bat¡±´ò¿ªÍ¶Æ±Ò³Ãæ£¬Ò»¸öºÚ¿ò£ºÓÃÓÚĞÅÏ¢ÌáÊ¾£»Ò»¸öÍ¶Æ±Ò³Ãæ£ºÓÃÓÚÍ¶Æ±");
		System.out.println("2¡¢µãÍ¶Æ±£ºÍ¶Æ±Ò³ÃæË¢ĞÂ³öÄÚÈİºó£¬Õı³£ÔÚÒ³ÃæÀïµãÍ¶Æ±£¬µ¯³öÍ¶Æ±ÊäÈëĞÕÃû¡¢ÊÖ»úºÅ¿ò");
		System.out.println("3¡¢ÊäÈëĞÕÃû¡¢ÊÖ»úºÅ£ºÊó±ê»¬µ¹×Ô¶¯Éú³ÉµÄĞÕÃû´¦£¬ÏµÍ³×Ô¶¯¸´ÖÆĞÕÃû£¬Õ³Ìùµ½ĞÕÃû¿òÀï£¬ÊÖ»úºÅÏàÍ¬");
		System.out.println("4¡¢µãÍ¶Æ±£¬Íê³ÉÍ¶Æ±¹ı³Ì");
		System.out.println("5¡¢ÏµÍ³Ìø×ª£¬µãË¢ĞÂ£¬È»ºóÖØ¸´1-4²½¡£");
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
		System.out.println("Ë¢ĞÂÒ³Ãæ");
	}

	protected void clearCookie() {
		// TODO Auto-generated method stub
		System.out.println("Çå¿Õcookie");
		JWebBrowser.clearSessionCookies();
		JWebBrowser.setCookie(mainUrl, "xcse_2132_lastact=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_lastvisit=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_saltkey=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_sid=");
		JWebBrowser.setCookie(mainUrl, "xcse_2132_tom_wx_vote_vid5_userid=");
	}

	private void rXm() {
		// TODO Auto-generated method stub
		System.out.println("\nÉú³ÉËæ»úĞÕÃû¡¢ÊÖ»úºÅ");
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
