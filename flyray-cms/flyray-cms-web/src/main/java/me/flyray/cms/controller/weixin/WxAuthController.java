package me.flyray.cms.controller.weixin;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.bean.result.WxMpOAuth2AccessToken;
import me.chanjar.weixin.mp.bean.result.WxMpUser;
import me.flyray.cms.service.WeixinService;
import me.flyray.cms.util.BeanUtil;

/** 
* @author: bolei
* @date：2017年3月11日 下午10:55:05 
* @description：微信授权
*/

@Controller
public class WxAuthController {

	protected Logger logger = LoggerFactory.getLogger(getClass());
	
	@Autowired
	private WeixinService weixinService;
	
	@RequestMapping(value="/weixin/getWxCode", method = RequestMethod.GET)
	public void getWxCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String code = request.getParameter("code");
        try {
			WxMpOAuth2AccessToken wxMpOAuth2AccessToken = weixinService.oauth2getAccessToken(code);
			WxMpUser wxMpUser = weixinService.oauth2getUserInfo(wxMpOAuth2AccessToken, null);
			logger.info("微信授权用户信息------{}",BeanUtil.objectToMap(wxMpUser));
			/* 将用户信息保存到数据库 */
		} catch (WxErrorException e) {
			e.printStackTrace();
		}
	} 
	
	
}
