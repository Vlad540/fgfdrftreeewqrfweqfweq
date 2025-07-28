package defpackage;

import android.media.MediaCodecInfo;

/* renamed from: l74  reason: default package */
public final /* synthetic */ class l74 implements n74 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;

    public /* synthetic */ l74(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
        this.c = i;
    }

    public final int a(MediaCodecInfo mediaCodecInfo) {
        int i = this.c;
        String str = this.b;
        switch (this.a) {
            case 0:
                return Math.abs(((Integer) by4.d(mediaCodecInfo, str).clamp(Integer.valueOf(i))).intValue() - i);
            default:
                qr qrVar = by4.a;
                return mediaCodecInfo.getCapabilitiesForType(str).getEncoderCapabilities().isBitrateModeSupported(i) ? 0 : Integer.MAX_VALUE;
        }
    }
}
