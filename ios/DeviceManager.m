#import "RCTViewManager.h"
#import <MapKit/MapKit.h>

@interface DeviceManager : RCTViewManager

@end

@implementation DeviceManager

RCT_EXPORT_MODULE()

- (UIView *)view
{
  return [[MKMapView alloc] init];
}



@end
