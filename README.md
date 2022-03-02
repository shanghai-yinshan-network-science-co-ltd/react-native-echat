# react-native-ys-echat

echat

## Installation

```sh
package.json add "react-native-ys-echat": "git+https://github.com/shanghai-yinshan-network-science-co-ltd/react-native-echat.git#Version",

```

## Usage

```js
import openEChatView from 'react-native-ys-echat';
openEChatView({uid,metaData});
// ...

```iOS
cd ios
pod install

Appdelegate.m
#import<EchatVisitorPort/EchatVisitorPort.h>

- (BOOL)application:(UIApplication *)application didFinishLaunchingWithOptions:(NSDictionary *)launchOptions{
  ....
  [EchatSDK AppID:@"" AppSecret:@"" server:@"https://id.echatsoft.com"];
}

```

## Contributing

See the [contributing guide](CONTRIBUTING.md) to learn how to contribute to the repository and the development workflow.

## License

MIT
