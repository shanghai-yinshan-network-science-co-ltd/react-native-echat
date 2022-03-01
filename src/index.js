import {NativeModules, Platform} from 'react-native';

const nativeNavigation = Platform.select({
  android: NativeModules.IntentMoudle,
  ios: NativeModules.IntentModule,
  default: {},
});

function openEChatActivity({uid, metaData}) {
  return nativeNavigation.openEChatActivity(uid, metaData);
}

export default openEChatActivity;
