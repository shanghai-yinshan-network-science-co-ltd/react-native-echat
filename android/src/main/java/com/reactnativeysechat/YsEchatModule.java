package com.reactnativeysechat;

import android.app.Application;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.echatsoft.echatsdk.core.EChatSDK;
import com.echatsoft.echatsdk.model.ChatParamConfig;

public class YsEchatModule extends ReactContextBaseJavaModule {
    public static final String NAME = "YsEchat";
    private static ReactApplicationContext context;

    public YsEchatModule(ReactApplicationContext reactContext) {
        super(reactContext);
        context = reactContext;
    }

    @Override
    public String getName() {
        return NAME;
    }


  //eChat用户登录
  @ReactMethod
  private void openEChatActivity(String uid, String metaData) {
    try {
      ChatParamConfig chatParamConfig = new ChatParamConfig();
      chatParamConfig.setUid(uid);//会员数据参数中的uid
      chatParamConfig.setMetaData(metaData); //会员数据参数
      chatParamConfig.setLan("id");
      EChatSDK.openEChatActivity(getCurrentActivity(), chatParamConfig);
    } catch (Exception e) {
    }
  }

    //eChat用户登录
    @ReactMethod
    private void initEchatSdk(String eChat_id, String eChat_secret) {
        try {
    EChatSDK.init(context, eChat_id,eChat_secret);
    EChatSDK.getInstance().setEChatServerURL("https://id.echatsoft.com/");
//       EChatSDK.setDebug(true);
        } catch (Exception e) {
        }
    }
}
