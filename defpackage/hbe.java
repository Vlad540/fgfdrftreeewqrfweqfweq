package defpackage;

import android.content.Context;
import java.util.List;

/* renamed from: hbe  reason: default package */
public final class hbe {
    public final Context a;
    public final dr9 b = new dr9(9);
    public List c;
    public List d;

    public hbe(Context context) {
        this.a = context;
        hw4 hw4 = hw4.a;
        this.c = hw4;
        this.d = hw4;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [p44, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final pi0[] a(android.os.Handler r13, g45 r14, g45 r15, g45 r16, g45 r17) {
        /*
            r12 = this;
            r0 = r12
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            pv0 r10 = pv0.Y
            j38 r11 = new j38
            android.content.Context r3 = r0.a
            r6 = 5000(0x1388, double:2.4703E-320)
            dr9 r4 = r0.b
            r2 = r11
            r5 = r10
            r8 = r13
            r9 = r14
            r2.<init>(r3, r4, r5, r6, r8, r9)
            r1.add(r11)
            r0.d = r1
            p44 r2 = new p44
            r2.<init>()
            v20 r3 = v20.c
            r2.a = r3
            r9 = 0
            r2.e = r9
            om3 r4 = defpackage.om3.b
            r2.f = r4
            android.content.IntentFilter r4 = new android.content.IntentFilter
            java.lang.String r5 = "android.media.action.HDMI_AUDIO_PLUG"
            r4.<init>(r5)
            r5 = 0
            android.content.Context r6 = r0.a
            android.content.Intent r4 = r6.registerReceiver(r5, r4)
            int r5 = mze.a
            r7 = 17
            if (r5 < r7) goto L_0x0062
            java.lang.String r7 = mze.c
            java.lang.String r8 = "Amazon"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0052
            java.lang.String r8 = "Xiaomi"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0062
        L_0x0052:
            android.content.ContentResolver r7 = r6.getContentResolver()
            java.lang.String r8 = "external_surround_sound_enabled"
            int r7 = android.provider.Settings.Global.getInt(r7, r8, r9)
            r8 = 1
            if (r7 != r8) goto L_0x0062
            v20 r3 = v20.d
            goto L_0x00a4
        L_0x0062:
            r7 = 29
            r8 = 8
            if (r5 < r7) goto L_0x0088
            boolean r7 = mze.C(r6)
            if (r7 != 0) goto L_0x007e
            r7 = 23
            if (r5 < r7) goto L_0x0088
            android.content.pm.PackageManager r5 = r6.getPackageManager()
            java.lang.String r6 = "android.hardware.type.automotive"
            boolean r5 = r5.hasSystemFeature(r6)
            if (r5 == 0) goto L_0x0088
        L_0x007e:
            v20 r3 = new v20
            int[] r4 = r20.a()
            r3.<init>(r8, r4)
            goto L_0x00a4
        L_0x0088:
            if (r4 == 0) goto L_0x00a4
            java.lang.String r5 = "android.media.extra.AUDIO_PLUG_STATE"
            int r5 = r4.getIntExtra(r5, r9)
            if (r5 != 0) goto L_0x0093
            goto L_0x00a4
        L_0x0093:
            v20 r3 = new v20
            java.lang.String r5 = "android.media.extra.ENCODINGS"
            int[] r5 = r4.getIntArrayExtra(r5)
            java.lang.String r6 = "android.media.extra.MAX_CHANNEL_COUNT"
            int r4 = r4.getIntExtra(r6, r8)
            r3.<init>(r4, r5)
        L_0x00a4:
            r3.getClass()
            r2.a = r3
            r2.c = r9
            r2.d = r9
            r2.e = r9
            jj7 r3 = r2.b
            if (r3 != 0) goto L_0x00bc
            jj7 r3 = new jj7
            i50[] r4 = new i50[r9]
            r3.<init>(r4)
            r2.b = r3
        L_0x00bc:
            b54 r8 = new b54
            r8.<init>(r2)
            l28 r11 = new l28
            dr9 r4 = r0.b
            android.content.Context r3 = r0.a
            r2 = r11
            r5 = r10
            r6 = r13
            r7 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.add(r11)
            r0.c = r1
            android.os.Looper r0 = r13.getLooper()
            zfe r2 = new zfe
            r3 = r16
            r2.<init>(r3, r0)
            r1.add(r2)
            android.os.Looper r0 = r13.getLooper()
            l39 r2 = new l39
            r3 = r17
            r2.<init>(r3, r0)
            r1.add(r2)
            ou1 r0 = new ou1
            r0.<init>()
            r1.add(r0)
            pi0[] r0 = new pi0[r9]
            java.lang.Object[] r0 = r1.toArray(r0)
            pi0[] r0 = (pi0[]) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hbe.a(android.os.Handler, g45, g45, g45, g45):pi0[]");
    }
}
