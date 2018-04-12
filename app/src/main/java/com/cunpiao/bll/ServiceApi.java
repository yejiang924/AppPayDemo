package com.cunpiao.bll;


import com.cunpiao.bean.AliTradeResponse;
import com.cunpiao.bean.OrderDto;
import com.cunpiao.bean.WxTradeResponse;
import com.cunpiao.network.callback.HttpResult;

import retrofit2.http.Body;
import retrofit2.http.POST;
import rx.Observable;

/**
 * @AUTHOR : niejiuqian
 * @DATETIME: 2018-02-28 10:12
 * @DESCRIPTION:
 */

public interface ServiceApi {

    /**
     * 支付
     * @param body
     * @return
     */
    @POST("/pay/order")
    Observable<HttpResult<WxTradeResponse>> order(@Body OrderDto body);


    /**
     * 支付
     * @param body
     * @return
     */
    @POST("/pay/order")
    Observable<HttpResult<AliTradeResponse>> aliOrder(@Body OrderDto body);

}
