#import <Foundation/Foundation.h>
#import <Cordova/CDVPlugin.h>

@interface CDVLocale : CDVPlugin
- (void)getCountryCode:(CDVInvokedUrlCommand*)command;
@end