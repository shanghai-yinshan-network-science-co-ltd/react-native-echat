import {NativeModules, Platform} from 'react-native';

const native = Platform.select({
  android: NativeModules.IntentMoudle,
  ios: NativeModules.YsEchat,
  default: {},
});

function openEChatView({uid, metaData}) {
  return native.openEChatActivity(uid, metaData);
}

export default openEChatView;
