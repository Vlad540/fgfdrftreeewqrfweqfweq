package defpackage;

import android.content.Context;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* renamed from: y20  reason: default package */
public final class y20 extends AudioDeviceCallback {
    public final /* synthetic */ a30 a;

    public y20(a30 a30) {
        this.a = a30;
    }

    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        a30 a30 = this.a;
        a30.g(w20.b((Context) a30.b, (k20) a30.y0, (i30) a30.x0));
    }

    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        a30 a30 = this.a;
        if (oze.m(audioDeviceInfoArr, (i30) a30.x0)) {
            a30.x0 = null;
        }
        a30.g(w20.b((Context) a30.b, (k20) a30.y0, (i30) a30.x0));
    }
}
