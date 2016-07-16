import {
  NativeModules,
  requireNativeComponent
} from 'react-native';

let { DeviceModule } = NativeModules;

export var test = DeviceModule.test;

export var Device = requireNativeComponent('Device');
