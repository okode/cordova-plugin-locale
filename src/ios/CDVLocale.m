#import "CDVLocale.h"

@implementation CDVLocale

- (void)getCountryCode:(CDVInvokedUrlCommand*)command
{
    NSLocale* currentLocale = [NSLocale currentLocale];
    NSString* countryCode = [currentLocale objectForKey: NSLocaleCountryCode];
    NSString* preferred = [[NSLocale preferredLanguages] objectAtIndex:0];
    if (preferred != nil) {
        NSArray* items = [preferred componentsSeparatedByString:@"-"];
        if (items != nil && [items count] > 1) {
            countryCode = [items objectAtIndex:1];
        }
    }
    CDVPluginResult* result = [CDVPluginResult resultWithStatus:CDVCommandStatus_OK messageAsString:countryCode];
    [self.commandDelegate sendPluginResult:result callbackId:command.callbackId];
}

@end
