package com.reactnativeysechat;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = YsEchatModule.NAME)
public class YsEchatModule extends ReactContextBaseJavaModule {
    public static final String NAME = "YsEchat";

    public YsEchatModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    @NonNull
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
}
