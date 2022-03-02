import {NativeModules, Platform} from 'react-native';

const native = Platform.select({
  android: NativeModules.YsEchat,
  ios: NativeModules.YsEchat,
  default: {},
});

function openEChatView({uid, metaData}) {
  return native.openEChatActivity(uid, metaData);
}

function initEChatSdk({eChat_id, eChat_secret}) {
  return native.initEchatSdk(eChat_id, eChat_secret);
}

export {
  openEChatView,
  initEChatSdk
};
