package defpackage;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.util.Range;
import android.util.Size;

/* renamed from: by4  reason: default package */
public abstract class by4 {
    public static final qr a = new qr();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(((float) i) / ((float) i2)) * i2;
        }
        return (int) (Math.floor((double) (((float) i) / ((float) i2))) * ((double) i2));
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int i2 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r8.equals("video/avc") == false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.e8c c(int r7, java.lang.String r8) {
        /*
            r8.getClass()
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 4096(0x1000, float:5.74E-42)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 6
            r4 = 7
            r5 = -1
            int r6 = r8.hashCode()
            switch(r6) {
                case -1662735862: goto L_0x0039;
                case -1662541442: goto L_0x002e;
                case 1331836730: goto L_0x0025;
                case 1599127257: goto L_0x001a;
                default: goto L_0x0018;
            }
        L_0x0018:
            r0 = r5
            goto L_0x0043
        L_0x001a:
            java.lang.String r0 = "video/x-vnd.on2.vp9"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0023
            goto L_0x0018
        L_0x0023:
            r0 = 3
            goto L_0x0043
        L_0x0025:
            java.lang.String r6 = "video/avc"
            boolean r8 = r8.equals(r6)
            if (r8 != 0) goto L_0x0043
            goto L_0x0018
        L_0x002e:
            java.lang.String r0 = "video/hevc"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0037
            goto L_0x0018
        L_0x0037:
            r0 = 1
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "video/av01"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0042
            goto L_0x0018
        L_0x0042:
            r0 = 0
        L_0x0043:
            switch(r0) {
                case 0: goto L_0x0071;
                case 1: goto L_0x0063;
                case 2: goto L_0x0056;
                case 3: goto L_0x0047;
                default: goto L_0x0046;
            }
        L_0x0046:
            goto L_0x007f
        L_0x0047:
            if (r7 == r4) goto L_0x004b
            if (r7 != r3) goto L_0x007f
        L_0x004b:
            r7 = 8192(0x2000, float:1.14794E-41)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            e8c r7 = defpackage.ws6.o(r2, r7)
            return r7
        L_0x0056:
            if (r7 != r4) goto L_0x007f
            r7 = 16
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            e8c r7 = defpackage.ws6.n(r7)
            return r7
        L_0x0063:
            if (r7 != r4) goto L_0x006a
            e8c r7 = defpackage.ws6.n(r1)
            return r7
        L_0x006a:
            if (r7 != r3) goto L_0x007f
            e8c r7 = defpackage.ws6.n(r2)
            return r7
        L_0x0071:
            if (r7 != r4) goto L_0x0078
            e8c r7 = defpackage.ws6.n(r1)
            return r7
        L_0x0078:
            if (r7 != r3) goto L_0x007f
            e8c r7 = defpackage.ws6.n(r2)
            return r7
        L_0x007f:
            po5 r7 = defpackage.ws6.b
            e8c r7 = defpackage.e8c.X
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by4.c(int, java.lang.String):e8c");
    }

    public static Range d(MediaCodecInfo mediaCodecInfo, String str) {
        return mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().getBitrateRange();
    }

    public static ws6 e(MediaCodecInfo mediaCodecInfo, String str) {
        return ws6.j(xie.f(mediaCodecInfo.getCapabilitiesForType(str).colorFormats));
    }

    public static synchronized ws6 f(String str) {
        ws6 j;
        synchronized (by4.class) {
            j();
            j = ws6.j(a.f(fja.A(str)));
        }
        return j;
    }

    public static e8c g(String str, z23 z23) {
        if (oze.a < 33 || z23 == null) {
            return ws6.m();
        }
        ws6 f = f(str);
        e8c c = c(z23.c, str);
        ts6 ts6 = new ts6();
        for (int i = 0; i < f.size(); i++) {
            MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) f.get(i);
            if (!mediaCodecInfo.isAlias() && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing")) {
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                    if (c.contains(Integer.valueOf(codecProfileLevel.profile))) {
                        ts6.d(mediaCodecInfo);
                    }
                }
            }
        }
        return ts6.j();
    }

    public static Size h(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int a2 = a(i, widthAlignment);
        int a3 = a(i2, heightAlignment);
        if (i(mediaCodecInfo, str, a2, a3)) {
            return new Size(a2, a3);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int a4 = a(Math.round(((float) i) * f), widthAlignment);
            int a5 = a(Math.round(((float) i2) * f), heightAlignment);
            if (i(mediaCodecInfo, str, a4, a5)) {
                return new Size(a4, a5);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2)).intValue();
        if (intValue != i2) {
            i = a((int) Math.round((((double) i) * ((double) intValue)) / ((double) i2)), widthAlignment);
            i2 = a(intValue, heightAlignment);
        }
        if (i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        if (mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities().isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void j() {
        synchronized (by4.class) {
            qr qrVar = a;
            qrVar.getClass();
            if (qrVar.X == 0) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String A : mediaCodecInfo.getSupportedTypes()) {
                            a.g(fja.A(A), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
