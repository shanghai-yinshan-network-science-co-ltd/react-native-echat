#import "YsEchat.h"
#import <UIKit/UIKit.h>
#import "AppDelegate.h"
#import<EchatVisitorPort/EchatVisitorPort.h>

@implementation YsEchat

RCT_EXPORT_MODULE()


RCT_EXPORT_METHOD(openEChatActivity:(NSString *)uid location:(NSString *)metaData)
{
  dispatch_sync(dispatch_get_main_queue(), ^{
    //创建对话页参数对象
    Echat_accessConditions * condition = [[Echat_accessConditions alloc] init];
    //会员身份信息
    condition.metaData = metaData;
    //自定义业务参数
    condition.uid = uid;
    //打开对话页参数
    condition.lan = @"id";
    //打开对话页

    EchatViewController * vc = [[EchatViewController alloc]initWithAccess:condition];
    EchatNavController *nav = [[EchatNavController alloc] initWithRootViewController:vc];
    vc.modalPresentationStyle = UIModalPresentationFullScreen;
    AppDelegate *delegate = (AppDelegate *)[[UIApplication sharedApplication] delegate];
    [delegate.window.rootViewController presentViewController:nav animated:YES completion:nil];
  });
}

@end
