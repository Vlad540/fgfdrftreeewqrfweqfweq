package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.net.Uri;
import android.util.Log;
import android.view.Surface;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import androidx.media3.transformer.ExportException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: i6g  reason: default package */
public final class i6g implements k13 {
    public static i6g X;
    public Object a;
    public int b;
    public Object c;
    public Object o;

    public static ExportException e(xu5 xu5, String str) {
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(str);
        String xu52 = xu5.toString();
        String str2 = xu5.n;
        str2.getClass();
        return ExportException.c(illegalArgumentException, 3003, new od3(xu52, (String) null, c49.k(str2), true));
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, i6g] */
    public static synchronized i6g g(Context context) {
        i6g i6g;
        synchronized (i6g.class) {
            try {
                if (X == null) {
                    ScheduledExecutorService unconfigurableScheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1, new zf9("MessengerIpcClient", 0)));
                    ? obj = new Object();
                    obj.o = new o5g(obj);
                    obj.b = 1;
                    obj.c = unconfigurableScheduledExecutorService;
                    obj.a = context.getApplicationContext();
                    X = obj;
                }
                i6g = X;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        return i6g;
    }

    public String a(int i, long j, long j2, String str) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            String[] strArr = (String[]) this.a;
            int i3 = this.b;
            if (i2 < i3) {
                sb.append(strArr[i2]);
                int i4 = ((int[]) this.c)[i2];
                if (i4 == 1) {
                    sb.append(str);
                } else {
                    String[] strArr2 = (String[]) this.o;
                    if (i4 == 2) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j)}));
                    } else if (i4 == 3) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Integer.valueOf(i)}));
                    } else if (i4 == 4) {
                        sb.append(String.format(Locale.US, strArr2[i2], new Object[]{Long.valueOf(j2)}));
                    }
                }
                i2++;
            } else {
                sb.append(strArr[i3]);
                return sb.toString();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r4.equals("SM-X900") == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005f, code lost:
        if (defpackage.oze.d.startsWith("SM-F936") != false) goto L_0x0062;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.w54 b(defpackage.xu5 r8, android.view.Surface r9, boolean r10) {
        /*
            r7 = this;
            z23 r0 = r8.A
            boolean r0 = defpackage.z23.g(r0)
            r1 = 29
            r2 = 31
            if (r0 == 0) goto L_0x0075
            if (r10 == 0) goto L_0x0069
            int r0 = defpackage.oze.a
            if (r0 < r2) goto L_0x0062
            z23 r3 = r8.A
            r3.getClass()
            java.lang.String r4 = defpackage.oze.c
            java.lang.String r5 = "Google"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x002b
            java.lang.String r4 = android.os.Build.ID
            java.lang.String r5 = "TP1A"
            boolean r4 = r4.startsWith(r5)
            if (r4 != 0) goto L_0x0062
        L_0x002b:
            int r3 = r3.c
            r4 = 7
            java.lang.String r5 = "SM-F936"
            if (r3 != r4) goto L_0x0052
            java.lang.String r4 = defpackage.oze.d
            boolean r6 = r4.startsWith(r5)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F916"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-F721"
            boolean r6 = r4.startsWith(r6)
            if (r6 != 0) goto L_0x0062
            java.lang.String r6 = "SM-X900"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x0062
        L_0x0052:
            r4 = 34
            if (r0 >= r4) goto L_0x0069
            r0 = 6
            if (r3 != r0) goto L_0x0069
            java.lang.String r0 = defpackage.oze.d
            boolean r0 = r0.startsWith(r5)
            if (r0 != 0) goto L_0x0062
            goto L_0x0069
        L_0x0062:
            java.lang.String r7 = "Tone-mapping HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = e(r8, r7)
            throw r7
        L_0x0069:
            int r0 = defpackage.oze.a
            if (r0 < r1) goto L_0x006e
            goto L_0x0075
        L_0x006e:
            java.lang.String r7 = "Decoding HDR is not supported on this device."
            androidx.media3.transformer.ExportException r7 = e(r8, r7)
            throw r7
        L_0x0075:
            int r0 = defpackage.oze.a
            if (r0 >= r2) goto L_0x00ab
            int r3 = r8.t
            r4 = 7680(0x1e00, float:1.0762E-41)
            if (r3 < r4) goto L_0x00ab
            int r3 = r8.u
            r4 = 4320(0x10e0, float:6.054E-42)
            if (r3 < r4) goto L_0x00ab
            java.lang.String r3 = r8.n
            if (r3 == 0) goto L_0x00ab
            java.lang.String r4 = "video/hevc"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ab
            java.lang.String r3 = defpackage.oze.d
            java.lang.String r4 = "SM-F711U1"
            boolean r4 = r3.equals(r4)
            if (r4 != 0) goto L_0x00a4
            java.lang.String r4 = "SM-F926U1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L_0x00a4
            goto L_0x00ab
        L_0x00a4:
            java.lang.String r7 = "Decoding 8k is not supported on this device."
            androidx.media3.transformer.ExportException r7 = e(r8, r7)
            throw r7
        L_0x00ab:
            r3 = 30
            if (r0 >= r3) goto L_0x00c7
            java.lang.String r3 = defpackage.oze.b
            java.lang.String r4 = "joyeuse"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00c7
            uu5 r8 = r8.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r8.u = r3
            xu5 r3 = new xu5
            r3.<init>(r8)
            r8 = r3
        L_0x00c7:
            android.media.MediaFormat r3 = defpackage.iu7.l(r8)
            r4 = 0
            if (r0 < r1) goto L_0x00df
            java.lang.Object r5 = r7.a
            android.content.Context r5 = (android.content.Context) r5
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo()
            int r5 = r5.targetSdkVersion
            if (r5 < r1) goto L_0x00df
            java.lang.String r1 = "allow-frame-drop"
            r3.setInteger(r1, r4)
        L_0x00df:
            if (r0 < r2) goto L_0x00e9
            if (r10 == 0) goto L_0x00e9
            java.lang.String r10 = "color-transfer-request"
            r1 = 3
            r3.setInteger(r10, r1)
        L_0x00e9:
            android.util.Pair r10 = defpackage.g38.d(r8)
            if (r10 == 0) goto L_0x0109
            java.lang.Object r1 = r10.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.String r2 = "profile"
            defpackage.iu7.I(r3, r2, r1)
            java.lang.Object r10 = r10.second
            java.lang.Integer r10 = (java.lang.Integer) r10
            int r10 = r10.intValue()
            java.lang.String r1 = "level"
            defpackage.iu7.I(r3, r1, r10)
        L_0x0109:
            r10 = 35
            if (r0 < r10) goto L_0x0119
            int r10 = r7.b
            int r10 = -r10
            int r10 = java.lang.Math.max(r4, r10)
            java.lang.String r0 = "importance"
            r3.setInteger(r0, r10)
        L_0x0119:
            int r10 = r8.t
            int r0 = r8.u
            int r10 = r10 * r0
            r0 = 2073600(0x1fa400, float:2.905732E-39)
            if (r10 < r0) goto L_0x0136
            java.lang.String r10 = defpackage.oze.d
            java.lang.String r0 = "vivo 1906"
            boolean r0 = defpackage.fja.e(r10, r0)
            if (r0 != 0) goto L_0x0135
            java.lang.String r0 = "redmi 8"
            boolean r10 = defpackage.fja.e(r10, r0)
            if (r10 == 0) goto L_0x0136
        L_0x0135:
            r4 = 1
        L_0x0136:
            w54 r7 = r7.c(r3, r8, r9, r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i6g.b(xu5, android.view.Surface, boolean):w54");
    }

    public w54 c(MediaFormat mediaFormat, xu5 xu5, Surface surface, boolean z) {
        xu5 xu52 = xu5;
        po5 po5 = ws6.b;
        e8c e8c = e8c.X;
        xu52.n.getClass();
        try {
            ArrayList h = g38.h(xu52, g38.g((pv0) this.o, xu52, false, false));
            if (!h.isEmpty()) {
                if (z) {
                    ArrayList arrayList = new ArrayList();
                    for (int i = 0; i < h.size(); i++) {
                        p28 p28 = (p28) h.get(i);
                        if (!p28.g) {
                            arrayList.add(p28);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        h = arrayList;
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Context context = (Context) this.a;
                for (p28 p282 : h.subList(0, 1)) {
                    mediaFormat.setString("mime", p282.c);
                    try {
                        w54 w54 = new w54(context, xu5, mediaFormat, p282.a, true, surface);
                        w54.b();
                        ((hs1) this.c).getClass();
                        return w54;
                    } catch (ExportException e) {
                        arrayList2.add(e);
                    }
                }
                throw ((ExportException) arrayList2.get(0));
            }
            throw e(xu52, "No decoders for format");
        } catch (MediaCodecUtil$DecoderQueryException e2) {
            ez3.B("Error querying decoders", e2);
            throw e(xu52, "Querying codecs failed");
        }
    }

    public w54 d(xu5 xu5) {
        return c(iu7.l(xu5), xu5, (Surface) null, false);
    }

    public dhd f(Resources resources, mbe mbe) {
        sd0 sd0 = (sd0) this.o;
        if (sd0 != null) {
            return dhd.g(sd0);
        }
        Drawable drawable = (Drawable) this.c;
        if (drawable != null) {
            sd0 sd02 = new sd0(drawable);
            this.o = sd02;
            return dhd.g(sd02);
        } else if (((Uri) this.a) == null) {
            sd0 sd03 = new sd0(new ColorDrawable(this.b));
            this.o = sd03;
            return dhd.g(sd03);
        } else {
            phd h = new mv9(2, new m5(12, this)).h(new ss8(14, resources));
            mbe.getClass();
            nbe nbe = (nbe) mbe;
            return new mhd(h.m(nbe.a()).i(nbe.b()), new ss8(15, this), 2);
        }
    }

    public synchronized n6g h(v5g v5g) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                "Queueing ".concat(v5g.toString());
            }
            if (!((o5g) this.o).d(v5g)) {
                o5g o5g = new o5g(this);
                this.o = o5g;
                o5g.d(v5g);
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
        return v5g.b.a;
    }
}
