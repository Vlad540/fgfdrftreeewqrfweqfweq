package ru.ok.android.externcalls.sdk.audio.internal.impl;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.audio.internal.impl.CallsBluethoothDeviceScanner;

@Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\t\u001a\u00020\u00052\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0007¨\u0006\n"}, d2 = {"ru/ok/android/externcalls/sdk/audio/internal/impl/CallsBluethoothDeviceScanner$createCallbackM$1", "Landroid/media/AudioDeviceCallback;", "", "Landroid/media/AudioDeviceInfo;", "addedDevices", "Ljue;", "onAudioDevicesAdded", "([Landroid/media/AudioDeviceInfo;)V", "removedDevices", "onAudioDevicesRemoved", "calls-audiomanager_release"}, k = 1, mv = {1, 9, 0})
public final class CallsBluethoothDeviceScanner$createCallbackM$1 extends AudioDeviceCallback {
    final /* synthetic */ CallsBluethoothDeviceScanner this$0;

    public CallsBluethoothDeviceScanner$createCallbackM$1(CallsBluethoothDeviceScanner callsBluethoothDeviceScanner) {
        this.this$0 = callsBluethoothDeviceScanner;
    }

    public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = this.this$0;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7) {
                    boolean onDeviceAvailable = callsBluethoothDeviceScanner.listener.onDeviceAvailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                }
            }
        }
    }

    public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        if (audioDeviceInfoArr != null) {
            CallsBluethoothDeviceScanner callsBluethoothDeviceScanner = this.this$0;
            for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                if (audioDeviceInfo.getType() == 7) {
                    boolean onDeviceUnavailable = callsBluethoothDeviceScanner.listener.onDeviceUnavailable(new CallsBluethoothDeviceScanner.BluetoothDeviceIntent(audioDeviceInfo.getId(), audioDeviceInfo.getProductName().toString()));
                }
            }
        }
    }
}
