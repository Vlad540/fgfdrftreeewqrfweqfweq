package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: ay4  reason: default package */
public abstract class ay4 {
    public static boolean a(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isHardwareAccelerated();
    }

    public static boolean b(MediaCodecInfo mediaCodecInfo) {
        return mediaCodecInfo.isSoftwareOnly();
    }
}
