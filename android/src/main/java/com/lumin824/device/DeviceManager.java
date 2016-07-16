package com.lumin824.device;

import android.graphics.Color;
import android.view.View;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;

/**
 * Created by lumin on 16/7/1.
 */
public class DeviceManager extends SimpleViewManager<View> {

    @Override
    public String getName() {
        return "Device";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        View view = new View(reactContext);
        view.setBackgroundColor(Color.RED);
        return view;
    }
}
