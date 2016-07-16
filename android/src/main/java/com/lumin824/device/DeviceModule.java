package com.lumin824.device;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;


public class DeviceModule extends ReactContextBaseJavaModule {

  public DeviceModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  public String getName(){
    return "DeviceModule";
  }

  @ReactMethod
  public void test(Promise promise){
    promise.resolve("ok");
  }
}
