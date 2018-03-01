package org.weex.plugin.share;

import com.alibaba.weex.plugin.annotation.WeexModule;
import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

@WeexModule(name = "share")
public class ShareModule extends WXModule {
    
    //sync ret example
    //TODO: Auto-generated method example
    @JSMethod
    public String syncRet(String param) {
        return param;
    }

    //async ret example
    //TODO: Auto-generated method example
    @JSMethod
    public void asyncRet(String param, JSCallback callback) {
        callback.invoke(param);
    }
}