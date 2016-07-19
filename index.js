import {
  NativeModules,
  requireNativeComponent
} from 'react-native';

let { DeviceModule } = NativeModules;

export var info = DeviceModule.info;

export var Device = requireNativeComponent('Device');
