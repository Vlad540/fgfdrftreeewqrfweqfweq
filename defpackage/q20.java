package defpackage;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;

/* renamed from: q20  reason: default package */
public abstract class q20 {
    /* JADX WARNING: type inference failed for: r0v0, types: [ms6, ft6] */
    private static gt6 a() {
        ? ms6 = new ms6(4);
        ms6.b(8, 7);
        int i = oze.a;
        if (i >= 31) {
            ms6.b(26, 27);
        }
        if (i >= 33) {
            ms6.a(30);
        }
        return ms6.l();
    }

    public static boolean b(AudioManager audioManager, i30 i30) {
        AudioDeviceInfo[] audioDeviceInfoArr;
        if (i30 == null) {
            audioManager.getClass();
            audioDeviceInfoArr = audioManager.getDevices(2);
        } else {
            audioDeviceInfoArr = new AudioDeviceInfo[]{i30.a};
        }
        gt6 a = a();
        for (AudioDeviceInfo type : audioDeviceInfoArr) {
            if (a.contains(Integer.valueOf(type.getType()))) {
                return true;
            }
        }
        return false;
    }
}
