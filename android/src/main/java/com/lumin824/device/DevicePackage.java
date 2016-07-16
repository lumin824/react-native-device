package com.lumin824.device;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class DevicePackage implements ReactPackage {
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    return Arrays.<NativeModule>asList(
      new DeviceModule(reactContext)
    );
  }

  @Override
  public List<Class<? extends JavaScriptModule>> createJSModules() {
      return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
    return Arrays.<ViewManager>asList(
      new DeviceManager()
    );
  }
}
