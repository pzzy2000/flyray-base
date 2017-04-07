package me.flyray.pay.service.refund.wechat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import me.flyray.pay.api.RefundHandleService;
import me.flyray.pay.dto.RefundHandleRequest;
import me.flyray.pay.dto.RefundHandleResponse;

/** 
* @author: bolei
* @date：2017年2月23日 下午1:40:55 
* @description：类说明 
*/

@Service("wechatRefundService")
public class WechatRefundService implements RefundHandleService{

	private static final Logger logger = LoggerFactory.getLogger(WechatRefundService.class);
	
	@Override
	public RefundHandleResponse refund(RefundHandleRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
