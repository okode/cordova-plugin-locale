#import "CDVLocale.h"

@implementation CDVLocale

- (void)getCountryCode:(CDVInvokedUrlCommand*)command
{
    NSLocale* currentLocale = [NSLocale currentLocale];
    NSString* countryCode = [currentLocale countryCode];
    CDVPluginResult* result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:countryCode];
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
