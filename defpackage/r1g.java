package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.Typeface;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Range;
import android.view.Surface;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONObject;

/* renamed from: r1g  reason: default package */
public abstract class r1g {
    public static ClassLoader a;
    public static Thread b;
    public static final x3a c = new x3a(28, (Object) "PERFORMANCE_METRICS");
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static boolean A(Parcel parcel) {
        return parcel.readByte() == 1;
    }

    public static String B(Parcel parcel) {
        if (parcel.readByte() == 1) {
            return parcel.readString();
        }
        return null;
    }

    public static fte C(yze yze, boolean z, boolean z2) {
        if (z) {
            F(3, yze, false);
        }
        yze.t((int) yze.m(), f22.c);
        long m = yze.m();
        String[] strArr = new String[((int) m)];
        for (int i2 = 0; ((long) i2) < m; i2++) {
            strArr[i2] = yze.t((int) yze.m(), f22.c);
        }
        if (!z2 || (yze.v() & 1) != 0) {
            return new fte((Object) strArr);
        }
        throw ParserException.a((RuntimeException) null, "framing bit expected to be set");
    }

    public static long D(int i2, long j2) {
        long j3 = (long) i2;
        e07.j("bytesPerFrame must be greater than 0.", j3 > 0);
        return j2 / j3;
    }

    public static boolean E(int i2, int i3, int i4, int i5) {
        return (i4 == 1 || i4 == 2 || (i4 == 4 && i2 != 2)) || (i5 == 1 || i5 == 2 || (i5 == 4 && i3 != 2));
    }

    public static boolean F(int i2, yze yze, boolean z) {
        if (yze.c() < 7) {
            if (z) {
                return false;
            }
            int c2 = yze.c();
            StringBuilder sb = new StringBuilder(29);
            sb.append("too short header: ");
            sb.append(c2);
            throw ParserException.a((RuntimeException) null, sb.toString());
        } else if (yze.v() != i2) {
            if (z) {
                return false;
            }
            String valueOf = String.valueOf(Integer.toHexString(i2));
            throw ParserException.a((RuntimeException) null, valueOf.length() != 0 ? "expected header type ".concat(valueOf) : new String("expected header type "));
        } else if (yze.v() == 118 && yze.v() == 111 && yze.v() == 114 && yze.v() == 98 && yze.v() == 105 && yze.v() == 115) {
            return true;
        } else {
            if (z) {
                return false;
            }
            throw ParserException.a((RuntimeException) null, "expected characters 'vorbis'");
        }
    }

    public static final int G(int i2, float f2) {
        return Color.argb(a24.X(f2 * 255.0f), Color.red(i2), Color.green(i2), Color.blue(i2));
    }

    public static void H(Parcel parcel, String str) {
        byte b2 = str != null ? (byte) 1 : 0;
        parcel.writeByte(b2);
        if (b2 != 0) {
            parcel.writeString(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x008c, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.ClassLoader I() {
        /*
            java.lang.Class<r1g> r0 = defpackage.r1g.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = a     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x00a7
            java.lang.Thread r1 = b     // Catch:{ all -> 0x008f }
            r2 = 0
            if (r1 != 0) goto L_0x0093
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x008f }
            java.lang.Thread r1 = r1.getThread()     // Catch:{ all -> 0x008f }
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x001d
            r1 = r2
            goto L_0x008a
        L_0x001d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch:{ all -> 0x008f }
            int r4 = r1.activeGroupCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch:{ SecurityException -> 0x0041 }
            r1.enumerate(r5)     // Catch:{ SecurityException -> 0x0041 }
            r6 = 0
            r7 = r6
        L_0x002b:
            if (r7 >= r4) goto L_0x0043
            r8 = r5[r7]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r9 = r9.equals(r10)     // Catch:{ SecurityException -> 0x0041 }
            if (r9 == 0) goto L_0x003c
            goto L_0x0044
        L_0x003c:
            int r7 = r7 + 1
            goto L_0x002b
        L_0x003f:
            r1 = move-exception
            goto L_0x0091
        L_0x0041:
            r1 = move-exception
            goto L_0x0083
        L_0x0043:
            r8 = r2
        L_0x0044:
            if (r8 != 0) goto L_0x004d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x004d:
            int r1 = r8.activeCount()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch:{ SecurityException -> 0x0041 }
            r8.enumerate(r4)     // Catch:{ SecurityException -> 0x0041 }
        L_0x0056:
            if (r6 >= r1) goto L_0x006a
            r5 = r4[r6]     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch:{ SecurityException -> 0x0041 }
            boolean r7 = r7.equals(r9)     // Catch:{ SecurityException -> 0x0041 }
            if (r7 == 0) goto L_0x0067
            goto L_0x006b
        L_0x0067:
            int r6 = r6 + 1
            goto L_0x0056
        L_0x006a:
            r5 = r2
        L_0x006b:
            if (r5 != 0) goto L_0x0088
            xw r1 = new xw     // Catch:{ SecurityException -> 0x0081 }
            java.lang.String r4 = "GmsDynamite"
            r1.<init>((java.lang.ThreadGroup) r8, (java.lang.String) r4)     // Catch:{ SecurityException -> 0x0081 }
            r1.setContextClassLoader(r2)     // Catch:{ SecurityException -> 0x007c }
            r1.start()     // Catch:{ SecurityException -> 0x007c }
            r5 = r1
            goto L_0x0088
        L_0x007c:
            r4 = move-exception
            r5 = r1
            goto L_0x0085
        L_0x007f:
            r4 = r1
            goto L_0x0085
        L_0x0081:
            r1 = move-exception
            goto L_0x007f
        L_0x0083:
            r4 = r1
            r5 = r2
        L_0x0085:
            r4.getMessage()     // Catch:{ all -> 0x003f }
        L_0x0088:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            r1 = r5
        L_0x008a:
            b = r1     // Catch:{ all -> 0x008f }
            if (r1 != 0) goto L_0x0093
            goto L_0x00a2
        L_0x008f:
            r1 = move-exception
            goto L_0x00ab
        L_0x0091:
            monitor-exit(r3)     // Catch:{ all -> 0x003f }
            throw r1     // Catch:{ all -> 0x008f }
        L_0x0093:
            monitor-enter(r1)     // Catch:{ all -> 0x008f }
            java.lang.Thread r3 = b     // Catch:{ SecurityException -> 0x009d }
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch:{ SecurityException -> 0x009d }
            goto L_0x00a1
        L_0x009b:
            r2 = move-exception
            goto L_0x00a5
        L_0x009d:
            r3 = move-exception
            r3.getMessage()     // Catch:{ all -> 0x009b }
        L_0x00a1:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
        L_0x00a2:
            a = r2     // Catch:{ all -> 0x008f }
            goto L_0x00a7
        L_0x00a5:
            monitor-exit(r1)     // Catch:{ all -> 0x009b }
            throw r2     // Catch:{ all -> 0x008f }
        L_0x00a7:
            java.lang.ClassLoader r1 = a     // Catch:{ all -> 0x008f }
            monitor-exit(r0)
            return r1
        L_0x00ab:
            monitor-exit(r0)     // Catch:{ all -> 0x008f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.I():java.lang.ClassLoader");
    }

    public static void a(CaptureRequest.Builder builder, ia3 ia3) {
        mv4 p = lv1.q(ia3).p();
        for (z80 z80 : p.f()) {
            CaptureRequest.Key key = (CaptureRequest.Key) z80.c;
            try {
                builder.set(key, p.h(z80));
            } catch (IllegalArgumentException unused) {
                Objects.toString(key);
            }
        }
    }

    public static void b(CaptureRequest.Builder builder, int i2, kp0 kp0) {
        Map map;
        if (i2 != 3 || !kp0.a) {
            if (i2 != 4) {
                kp0.getClass();
            } else if (kp0.b) {
                HashMap hashMap = new HashMap();
                hashMap.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 2);
                map = Collections.unmodifiableMap(hashMap);
            }
            map = Collections.emptyMap();
        } else {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(CaptureRequest.CONTROL_CAPTURE_INTENT, 1);
            map = Collections.unmodifiableMap(hashMap2);
        }
        for (Map.Entry entry : map.entrySet()) {
            builder.set((CaptureRequest.Key) entry.getKey(), entry.getValue());
        }
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence != null ? charSequence.equals(charSequence2) : charSequence2 == null;
    }

    public static CaptureRequest d(pw1 pw1, CameraDevice cameraDevice, Map map, boolean z, kp0 kp0) {
        CaptureRequest.Builder builder;
        ws1 ws1;
        if (cameraDevice == null) {
            return null;
        }
        List<xc4> unmodifiableList = Collections.unmodifiableList(pw1.a);
        ArrayList arrayList = new ArrayList();
        for (xc4 xc4 : unmodifiableList) {
            Surface surface = (Surface) map.get(xc4);
            if (surface != null) {
                arrayList.add(surface);
            } else {
                throw new IllegalArgumentException("DeferrableSurface not in configuredSurfaceMap");
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        int i2 = pw1.c;
        if (i2 == 5 && (ws1 = pw1.h) != null && (ws1.o() instanceof TotalCaptureResult)) {
            builder = cameraDevice.createReprocessCaptureRequest((TotalCaptureResult) ws1.o());
        } else if (i2 == 5) {
            builder = cameraDevice.createCaptureRequest(z ? 1 : 2);
        } else {
            builder = cameraDevice.createCaptureRequest(i2);
        }
        b(builder, i2, kp0);
        z80 z80 = pw1.k;
        Range range = va0.f;
        ia3 ia3 = pw1.b;
        Range range2 = (Range) ia3.d(z80, range);
        Objects.requireNonNull(range2);
        if (!range2.equals(range)) {
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE;
            Range range3 = (Range) ia3.d(z80, range);
            Objects.requireNonNull(range3);
            builder.set(key, range3);
        }
        if (pw1.b() == 1 || pw1.c() == 1) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 0);
        } else if (pw1.b() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 2);
        } else if (pw1.c() == 2) {
            builder.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, 1);
        }
        z80 z802 = pw1.i;
        if (ia3.l(z802)) {
            builder.set(CaptureRequest.JPEG_ORIENTATION, (Integer) ia3.h(z802));
        }
        z80 z803 = pw1.j;
        if (ia3.l(z803)) {
            builder.set(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) ia3.h(z803)).byteValue()));
        }
        a(builder, ia3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            builder.addTarget((Surface) it.next());
        }
        builder.setTag(pw1.g);
        return builder.build();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x005a A[LOOP:1: B:10:0x005a->B:13:0x006c, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:3:0x0035 A[LOOP:0: B:3:0x0035->B:6:0x0047, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void e(android.content.Context r3, g2b r4) {
        /*
            r3.getResources()
            int r3 = mzb.a
            j2b r4 = (j2b) r4
            yzc r3 = r4.b
            r3.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.reactions-max
            r1 = 8
            long r1 = (long) r1
            long r0 = r3.o(r0, r1)
            int r3 = (int) r0
            mzb.a = r3
            android.util.Size r3 = new android.util.Size
            r0 = 160(0xa0, float:2.24E-43)
            r3.<init>(r0, r0)
            mzb.b = r3
            yzc r3 = r4.b
            r3.getClass()
            java.util.Set r3 = java.util.Collections.emptySet()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0031
            goto L_0x0049
        L_0x0031:
            java.util.Iterator r3 = r3.iterator()
        L_0x0035:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0049
            java.lang.Object r4 = r3.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "REACTION_BADGE"
            boolean r4 = defpackage.p0e.K(r0, r4)
            if (r4 == 0) goto L_0x0035
        L_0x0049:
            int r3 = mzb.a
            java.util.Set r3 = java.util.Collections.emptySet()
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L_0x0056
            goto L_0x006e
        L_0x0056:
            java.util.Iterator r3 = r3.iterator()
        L_0x005a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x006e
            java.lang.Object r4 = r3.next()
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r0 = "REACTION_SELECT_PANEL"
            boolean r4 = defpackage.p0e.K(r0, r4)
            if (r4 == 0) goto L_0x005a
        L_0x006e:
            int r3 = mzb.a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.e(android.content.Context, g2b):void");
    }

    public static final Object g(aec aec, CancellationSignal cancellationSignal, Callable callable, Continuation continuation) {
        hu3 hu3;
        if (aec.n() && aec.k()) {
            return callable.call();
        }
        ype ype = (ype) continuation.getContext().get(ype.c);
        if (ype == null || (hu3 = ype.a) == null) {
            hu3 = h2g.l(aec);
        }
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        zv1.d(new av3(cancellationSignal, 0, xs7.E(ha6.a, hu3, (ru3) null, new bv3(callable, zv1, (Continuation) null), 2)));
        return zv1.m();
    }

    public static final Object h(aec aec, Callable callable, Continuation continuation) {
        hu3 hu3;
        if (aec.n() && aec.k()) {
            return callable.call();
        }
        ype ype = (ype) continuation.getContext().get(ype.c);
        if (ype == null || (hu3 = ype.a) == null) {
            hu3 = h2g.m(aec);
        }
        return xs7.U(hu3, new zu3(callable, (Continuation) null), continuation);
    }

    /* JADX WARNING: type inference failed for: r10v5, types: [java.lang.Object, krf] */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.krf i(defpackage.ff3 r7, int r8, java.util.ArrayList r9, defpackage.krf r10) {
        /*
            if (r8 != 0) goto L_0x0005
            int r0 = r7.n0
            goto L_0x0007
        L_0x0005:
            int r0 = r7.o0
        L_0x0007:
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L_0x002f
            if (r10 == 0) goto L_0x0011
            int r3 = r10.b
            if (r0 == r3) goto L_0x002f
        L_0x0011:
            r3 = r1
        L_0x0012:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x0032
            java.lang.Object r4 = r9.get(r3)
            krf r4 = (defpackage.krf) r4
            int r5 = r4.b
            if (r5 != r0) goto L_0x002c
            if (r10 == 0) goto L_0x002a
            r10.c(r8, r4)
            r9.remove(r10)
        L_0x002a:
            r10 = r4
            goto L_0x0032
        L_0x002c:
            int r3 = r3 + 1
            goto L_0x0012
        L_0x002f:
            if (r0 == r2) goto L_0x0032
            return r10
        L_0x0032:
            r0 = 1
            if (r10 != 0) goto L_0x008f
            boolean r3 = r7 instanceof defpackage.qf6
            if (r3 == 0) goto L_0x006f
            r3 = r7
            qf6 r3 = (defpackage.qf6) r3
            r4 = r1
        L_0x003d:
            int r5 = r3.r0
            if (r4 >= r5) goto L_0x0056
            ff3[] r5 = r3.q0
            r5 = r5[r4]
            if (r8 != 0) goto L_0x004c
            int r6 = r5.n0
            if (r6 == r2) goto L_0x004c
            goto L_0x0057
        L_0x004c:
            if (r8 != r0) goto L_0x0053
            int r6 = r5.o0
            if (r6 == r2) goto L_0x0053
            goto L_0x0057
        L_0x0053:
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0056:
            r6 = r2
        L_0x0057:
            if (r6 == r2) goto L_0x006f
            r3 = r1
        L_0x005a:
            int r4 = r9.size()
            if (r3 >= r4) goto L_0x006f
            java.lang.Object r4 = r9.get(r3)
            krf r4 = (defpackage.krf) r4
            int r5 = r4.b
            if (r5 != r6) goto L_0x006c
            r10 = r4
            goto L_0x006f
        L_0x006c:
            int r3 = r3 + 1
            goto L_0x005a
        L_0x006f:
            if (r10 != 0) goto L_0x008c
            krf r10 = new krf
            r10.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r10.a = r3
            r3 = 0
            r10.d = r3
            r10.e = r2
            int r2 = defpackage.krf.f
            int r3 = r2 + 1
            defpackage.krf.f = r3
            r10.b = r2
            r10.c = r8
        L_0x008c:
            r9.add(r10)
        L_0x008f:
            java.util.ArrayList r2 = r10.a
            boolean r3 = r2.contains(r7)
            if (r3 == 0) goto L_0x0098
            goto L_0x00d3
        L_0x0098:
            r2.add(r7)
            boolean r2 = r7 instanceof defpackage.bd6
            if (r2 == 0) goto L_0x00ac
            r2 = r7
            bd6 r2 = (defpackage.bd6) r2
            me3 r3 = r2.t0
            int r2 = r2.u0
            if (r2 != 0) goto L_0x00a9
            r1 = r0
        L_0x00a9:
            r3.c(r1, r10, r9)
        L_0x00ac:
            int r0 = r10.b
            if (r8 != 0) goto L_0x00bd
            r7.n0 = r0
            me3 r0 = r7.I
            r0.c(r8, r10, r9)
            me3 r0 = r7.K
            r0.c(r8, r10, r9)
            goto L_0x00ce
        L_0x00bd:
            r7.o0 = r0
            me3 r0 = r7.J
            r0.c(r8, r10, r9)
            me3 r0 = r7.M
            r0.c(r8, r10, r9)
            me3 r0 = r7.L
            r0.c(r8, r10, r9)
        L_0x00ce:
            me3 r7 = r7.P
            r7.c(r8, r10, r9)
        L_0x00d3:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.i(ff3, int, java.util.ArrayList, krf):krf");
    }

    public static long j(int i2, long j2) {
        long j3 = (long) i2;
        e07.j("sampleRate must be greater than 0.", j3 > 0);
        return (TimeUnit.SECONDS.toNanos(1) * j2) / j3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        r8.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        if (r8 != null) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        return null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String k(android.content.Context r8, android.net.Uri r9, java.lang.String r10, java.lang.String[] r11) {
        /*
            java.lang.String r0 = "_data"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            r6 = 0
            r2 = r9
            r4 = r10
            r5 = r11
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0034, all -> 0x0032 }
            if (r8 == 0) goto L_0x002c
            boolean r9 = r8.moveToFirst()     // Catch:{ IllegalArgumentException -> 0x002a }
            if (r9 == 0) goto L_0x002c
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ IllegalArgumentException -> 0x002a }
            java.lang.String r9 = r8.getString(r9)     // Catch:{ IllegalArgumentException -> 0x002a }
            r8.close()
            return r9
        L_0x0027:
            r9 = move-exception
            r7 = r8
            goto L_0x0040
        L_0x002a:
            r9 = move-exception
            goto L_0x0036
        L_0x002c:
            if (r8 == 0) goto L_0x003f
        L_0x002e:
            r8.close()
            goto L_0x003f
        L_0x0032:
            r9 = move-exception
            goto L_0x0040
        L_0x0034:
            r9 = move-exception
            r8 = r7
        L_0x0036:
            java.util.Locale.getDefault()     // Catch:{ all -> 0x0027 }
            r9.getMessage()     // Catch:{ all -> 0x0027 }
            if (r8 == 0) goto L_0x003f
            goto L_0x002e
        L_0x003f:
            return r7
        L_0x0040:
            if (r7 == 0) goto L_0x0045
            r7.close()
        L_0x0045:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.k(android.content.Context, android.net.Uri, java.lang.String, java.lang.String[]):java.lang.String");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0092, code lost:
        if (r0.equals("error.limit.violate") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00cb, code lost:
        if (r0.equals("error.code.attempt.limit") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e0, code lost:
        if (r0.equals("code.limit") == false) goto L_0x00ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e3, code lost:
        r1 = cic.m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ee, code lost:
        r1 = cic.E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00f3, code lost:
        r1 = new hge(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0113, code lost:
        r4 = r2.Y;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static so7 l(uae r4) {
        /*
            java.lang.String r0 = r4.b
            java.lang.String r1 = "service.unavailable"
            boolean r1 = defpackage.hhd.f(r0, r1)
            r2 = 0
            if (r1 != 0) goto L_0x010a
            java.lang.String r1 = "service.timeout"
            boolean r1 = defpackage.hhd.f(r0, r1)
            if (r1 != 0) goto L_0x010a
            java.lang.String r1 = "errors.event.unavailable"
            boolean r1 = defpackage.hhd.f(r0, r1)
            if (r1 == 0) goto L_0x001d
            goto L_0x010a
        L_0x001d:
            boolean r1 = r4 instanceof lae
            if (r1 == 0) goto L_0x0037
            ro7 r4 = new ro7
            int r0 = rhc.O
            hge r1 = new hge
            r1.<init>(r0)
            int r0 = rhc.N
            hge r2 = new hge
            r2.<init>(r0)
            r0 = 1
            r4.<init>(r1, r2, r0)
            goto L_0x013d
        L_0x0037:
            java.lang.String r1 = "error.limit.violate"
            boolean r3 = defpackage.hhd.f(r0, r1)
            if (r3 == 0) goto L_0x0073
            boolean r0 = r4 instanceof vae
            if (r0 == 0) goto L_0x0046
            r2 = r4
            vae r2 = (vae) r2
        L_0x0046:
            po7 r4 = new po7
            if (r2 == 0) goto L_0x0054
            java.lang.String r0 = r2.Y
            if (r0 == 0) goto L_0x0054
            lge r1 = new lge
            r1.<init>(r0)
            goto L_0x005b
        L_0x0054:
            int r0 = utb.oneme_login_sms_count_exceeded_title
            hge r1 = new hge
            r1.<init>(r0)
        L_0x005b:
            if (r2 == 0) goto L_0x0067
            java.lang.String r0 = r2.Z
            if (r0 == 0) goto L_0x0067
            lge r2 = new lge
            r2.<init>(r0)
            goto L_0x006e
        L_0x0067:
            int r0 = utb.oneme_login_sms_count_exceeded_description
            hge r2 = new hge
            r2.<init>(r0)
        L_0x006e:
            r4.<init>(r1, r2)
            goto L_0x013d
        L_0x0073:
            java.lang.String r2 = r4.o
            if (r2 == 0) goto L_0x0085
            int r3 = r2.length()
            if (r3 != 0) goto L_0x007e
            goto L_0x0085
        L_0x007e:
            lge r1 = new lge
            r1.<init>(r2)
            goto L_0x00f9
        L_0x0085:
            int r2 = r0.hashCode()
            switch(r2) {
                case -2107093715: goto L_0x00e6;
                case -1988099974: goto L_0x00da;
                case -1927764058: goto L_0x00ce;
                case -1458260801: goto L_0x00c5;
                case -890707199: goto L_0x00b9;
                case -802380906: goto L_0x00ad;
                case 106239865: goto L_0x00a1;
                case 255501108: goto L_0x0095;
                case 1415134249: goto L_0x008e;
                default: goto L_0x008c;
            }
        L_0x008c:
            goto L_0x00ee
        L_0x008e:
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x0095:
            java.lang.String r1 = "login.token"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x009e
            goto L_0x00ee
        L_0x009e:
            int r1 = cic.n
            goto L_0x00f3
        L_0x00a1:
            java.lang.String r1 = "verify.code.expired"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00aa
            goto L_0x00ee
        L_0x00aa:
            int r1 = cic.l
            goto L_0x00f3
        L_0x00ad:
            java.lang.String r1 = "error.phone.blacklisted"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00b6
            goto L_0x00ee
        L_0x00b6:
            int r1 = cic.k
            goto L_0x00f3
        L_0x00b9:
            java.lang.String r1 = "verify.code.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00c2
            goto L_0x00ee
        L_0x00c2:
            int r1 = cic.j
            goto L_0x00f3
        L_0x00c5:
            java.lang.String r1 = "error.code.attempt.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00ce:
            java.lang.String r1 = "auth.blocked"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00d7
            goto L_0x00ee
        L_0x00d7:
            int r1 = cic.h
            goto L_0x00f3
        L_0x00da:
            java.lang.String r1 = "code.limit"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00e3
            goto L_0x00ee
        L_0x00e3:
            int r1 = cic.m
            goto L_0x00f3
        L_0x00e6:
            java.lang.String r1 = "phone.wrong"
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L_0x00f1
        L_0x00ee:
            int r1 = cic.E
            goto L_0x00f3
        L_0x00f1:
            int r1 = cic.o
        L_0x00f3:
            hge r2 = new hge
            r2.<init>(r1)
            r1 = r2
        L_0x00f9:
            no7 r2 = new no7
            dae r4 = r4.X
            if (r4 == 0) goto L_0x0100
            goto L_0x0105
        L_0x0100:
            java.lang.Throwable r4 = new java.lang.Throwable
            r4.<init>(r0)
        L_0x0105:
            r2.<init>(r1, r4)
            r4 = r2
            goto L_0x013d
        L_0x010a:
            boolean r0 = r4 instanceof vae
            if (r0 == 0) goto L_0x0111
            r2 = r4
            vae r2 = (vae) r2
        L_0x0111:
            if (r2 == 0) goto L_0x011d
            java.lang.String r4 = r2.Y
            if (r4 == 0) goto L_0x011d
            lge r0 = new lge
            r0.<init>(r4)
            goto L_0x0124
        L_0x011d:
            int r4 = rhc.Q
            hge r0 = new hge
            r0.<init>(r4)
        L_0x0124:
            if (r2 == 0) goto L_0x0130
            java.lang.String r4 = r2.Z
            if (r4 == 0) goto L_0x0130
            lge r1 = new lge
            r1.<init>(r4)
            goto L_0x0137
        L_0x0130:
            int r4 = rhc.P
            hge r1 = new hge
            r1.<init>(r4)
        L_0x0137:
            ro7 r4 = new ro7
            r2 = 2
            r4.<init>(r0, r1, r2)
        L_0x013d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.l(uae):so7");
    }

    public static int n(int i2) {
        int i3 = 0;
        while (i2 > 0) {
            i3++;
            i2 >>>= 1;
        }
        return i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x016d, code lost:
        if (r0.isEmpty() != false) goto L_0x016f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static em4 o(ws8 r17) {
        /*
            r1 = r17
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 1
            r5 = 0
            int r0 = defpackage.jjd.K(r17)     // Catch:{ all -> 0x000e }
            r6 = r0
            goto L_0x003e
        L_0x000e:
            r0 = move-exception
            r6 = r0
            defpackage.udd.S(r3, r2, r6)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0019:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x002c
            java.lang.Object r7 = r0.next()
            ny9 r7 = (defpackage.ny9) r7
            r7.getClass()
            defpackage.ny9.a(r6)
            goto L_0x0019
        L_0x002c:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x003d
            if (r0 == r4) goto L_0x003c
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003c:
            throw r6
        L_0x003d:
            r6 = r5
        L_0x003e:
            r7 = 0
            if (r6 != 0) goto L_0x0042
            return r7
        L_0x0042:
            r8 = r5
            r9 = r7
            r10 = r9
        L_0x0045:
            if (r8 >= r6) goto L_0x01d8
            java.lang.String r0 = defpackage.jjd.M(r17)     // Catch:{ all -> 0x004c }
            goto L_0x007c
        L_0x004c:
            r0 = move-exception
            r11 = r0
            defpackage.udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x006a
            java.lang.Object r12 = r0.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r11)
            goto L_0x0057
        L_0x006a:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x007b
            if (r0 == r4) goto L_0x007a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007a:
            throw r11
        L_0x007b:
            r0 = r7
        L_0x007c:
            if (r0 != 0) goto L_0x0080
            goto L_0x01d4
        L_0x0080:
            java.lang.String r11 = "discarded"
            boolean r11 = r0.equals(r11)
            r12 = 8
            r13 = 0
            if (r11 == 0) goto L_0x00fb
            sp8 r0 = r17.n()     // Catch:{ all -> 0x00c6 }
            int r0 = r0.a()     // Catch:{ all -> 0x00c6 }
            if (r0 != r12) goto L_0x00b8
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x00c6 }
            r0.<init>()     // Catch:{ all -> 0x00c6 }
            int r9 = r17.x0()     // Catch:{ all -> 0x00c6 }
            r11 = r5
        L_0x00a0:
            if (r11 >= r9) goto L_0x00bc
            long r15 = defpackage.jjd.J(r1, r13)     // Catch:{ all -> 0x00c6 }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c6 }
            long r15 = defpackage.jjd.J(r1, r13)     // Catch:{ all -> 0x00c6 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x00c6 }
            r0.put(r12, r15)     // Catch:{ all -> 0x00c6 }
            int r11 = r11 + 1
            goto L_0x00a0
        L_0x00b8:
            r17.z()     // Catch:{ all -> 0x00c6 }
            r0 = r7
        L_0x00bc:
            if (r0 == 0) goto L_0x00c4
            boolean r9 = r0.isEmpty()     // Catch:{ all -> 0x00c6 }
            if (r9 == 0) goto L_0x00c8
        L_0x00c4:
            r0 = r7
            goto L_0x00c8
        L_0x00c6:
            r0 = move-exception
            goto L_0x00cb
        L_0x00c8:
            r9 = r0
            goto L_0x01d4
        L_0x00cb:
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r9 = uzc.a
            java.util.Iterator r9 = r9.iterator()
        L_0x00d4:
            boolean r11 = r9.hasNext()
            if (r11 == 0) goto L_0x00e7
            java.lang.Object r11 = r9.next()
            ny9 r11 = (defpackage.ny9) r11
            r11.getClass()
            defpackage.ny9.a(r0)
            goto L_0x00d4
        L_0x00e7:
            int r9 = m4b.a
            int r9 = defpackage.hr1.t(r9)
            if (r9 == 0) goto L_0x00f8
            if (r9 == r4) goto L_0x00f7
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00f7:
            throw r0
        L_0x00f8:
            r9 = r7
            goto L_0x01d4
        L_0x00fb:
            java.lang.String r11 = "saved"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x01a1
            sp8 r0 = r17.n()     // Catch:{ all -> 0x0163 }
            int r0 = r0.a()     // Catch:{ all -> 0x0163 }
            if (r0 != r12) goto L_0x012b
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch:{ all -> 0x0163 }
            r0.<init>()     // Catch:{ all -> 0x0163 }
            int r10 = r17.x0()     // Catch:{ all -> 0x0163 }
            r11 = r5
        L_0x0117:
            if (r11 >= r10) goto L_0x012f
            long r15 = defpackage.jjd.J(r1, r13)     // Catch:{ all -> 0x0163 }
            java.lang.Long r12 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x0163 }
            nzc r15 = defpackage.lp.B(r17)     // Catch:{ all -> 0x0163 }
            r0.put(r12, r15)     // Catch:{ all -> 0x0163 }
            int r11 = r11 + 1
            goto L_0x0117
        L_0x012b:
            r17.z()     // Catch:{ all -> 0x0163 }
            r0 = r7
        L_0x012f:
            if (r0 == 0) goto L_0x016f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0163 }
            r10.<init>()     // Catch:{ all -> 0x0163 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0163 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0163 }
        L_0x013e:
            boolean r11 = r0.hasNext()     // Catch:{ all -> 0x0163 }
            if (r11 == 0) goto L_0x0165
            java.lang.Object r11 = r0.next()     // Catch:{ all -> 0x0163 }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x0163 }
            java.lang.Object r12 = r11.getValue()     // Catch:{ all -> 0x0163 }
            nzc r12 = (nzc) r12     // Catch:{ all -> 0x0163 }
            if (r12 != 0) goto L_0x0154
            r13 = r7
            goto L_0x015d
        L_0x0154:
            java.lang.Object r11 = r11.getKey()     // Catch:{ all -> 0x0163 }
            wia r13 = new wia     // Catch:{ all -> 0x0163 }
            r13.<init>(r11, r12)     // Catch:{ all -> 0x0163 }
        L_0x015d:
            if (r13 == 0) goto L_0x013e
            r10.add(r13)     // Catch:{ all -> 0x0163 }
            goto L_0x013e
        L_0x0163:
            r0 = move-exception
            goto L_0x0172
        L_0x0165:
            java.util.Map r0 = defpackage.ju7.V(r10)     // Catch:{ all -> 0x0163 }
            boolean r10 = r0.isEmpty()     // Catch:{ all -> 0x0163 }
            if (r10 == 0) goto L_0x0170
        L_0x016f:
            r0 = r7
        L_0x0170:
            r10 = r0
            goto L_0x01d4
        L_0x0172:
            defpackage.udd.S(r3, r2, r0)
            java.util.concurrent.CopyOnWriteArraySet r10 = uzc.a
            java.util.Iterator r10 = r10.iterator()
        L_0x017b:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x018e
            java.lang.Object r11 = r10.next()
            ny9 r11 = (defpackage.ny9) r11
            r11.getClass()
            defpackage.ny9.a(r0)
            goto L_0x017b
        L_0x018e:
            int r10 = m4b.a
            int r10 = defpackage.hr1.t(r10)
            if (r10 == 0) goto L_0x019f
            if (r10 == r4) goto L_0x019e
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x019e:
            throw r0
        L_0x019f:
            r10 = r7
            goto L_0x01d4
        L_0x01a1:
            r17.z()     // Catch:{ all -> 0x01a5 }
            goto L_0x01d4
        L_0x01a5:
            r0 = move-exception
            r11 = r0
            defpackage.udd.S(r3, r2, r11)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01b0:
            boolean r12 = r0.hasNext()
            if (r12 == 0) goto L_0x01c3
            java.lang.Object r12 = r0.next()
            ny9 r12 = (defpackage.ny9) r12
            r12.getClass()
            defpackage.ny9.a(r11)
            goto L_0x01b0
        L_0x01c3:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x01d4
            if (r0 == r4) goto L_0x01d3
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01d3:
            throw r11
        L_0x01d4:
            int r8 = r8 + 1
            goto L_0x0045
        L_0x01d8:
            em4 r0 = new em4
            r0.<init>(r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r1g.o(ws8):em4");
    }

    public static boolean p(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean q(CharSequence charSequence) {
        return !p(charSequence);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [gyc, kotlin.coroutines.Continuation, java.lang.Object] */
    public static gyc r(i26 i26) {
        ? obj = new Object();
        obj.o = urd.p(i26, obj, obj);
        return obj;
    }

    public static String s(Collection collection) {
        if (collection == null) {
            return null;
        }
        Iterator it = collection.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    public static StaticLayout t(CharSequence charSequence, int i2, int i3, TextPaint textPaint, int i4, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i5, int i6, efe efe) {
        StaticLayout.Builder indents = StaticLayout.Builder.obtain(charSequence, i2, i3, textPaint, i4).setAlignment(alignment).setLineSpacing(0.0f, 1.0f).setIncludePad(z).setEllipsize(truncateAt).setEllipsizedWidth(i5).setMaxLines(i6).setTextDirection(h2g.k(efe)).setBreakStrategy(0).setHyphenationFrequency(0).setIndents((int[]) null, (int[]) null);
        indents.setJustificationMode(0);
        indents.setUseLineSpacingFromFallbacks(false);
        return indents.build();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, xs8] */
    public static ys8 u(at8 at8) {
        dr8 dr8;
        ? obj = new Object();
        ir1 ir1 = at8.a;
        f3f f3f = null;
        if (ir1 == null) {
            dr8 = null;
        } else {
            dr8 = new dr8(ir1.a, (String) ir1.c, ir1.b);
        }
        obj.a = dr8;
        obj.c = at8.c;
        obj.b = at8.b;
        obj.d = at8.d;
        l10 l10 = at8.e;
        if (l10 != null) {
            l10 l102 = new l10(1);
            l102.a = l10.a;
            l102.c = l10.c;
            l102.b = l10.b;
            l102.d = l10.d;
            f3f = l102.a();
        }
        obj.e = f3f;
        return new ys8(obj);
    }

    public static String v(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        int length = charSequence.length() / 4;
        if (length == 0) {
            length = 1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < length; i2++) {
            sb.append("*");
        }
        sb.append(charSequence.subSequence(length, charSequence.length()));
        return sb.toString();
    }

    public static Typeface w(Configuration configuration, Typeface typeface) {
        if (Build.VERSION.SDK_INT < 31 || configuration.fontWeightAdjustment == Integer.MAX_VALUE || configuration.fontWeightAdjustment == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, xy6.j(configuration.fontWeightAdjustment + typeface.getWeight(), 1, 1000), typeface.isItalic());
    }

    public static final String x(JSONObject jSONObject, String str) {
        if (jSONObject.has(str)) {
            return jSONObject.optString(str);
        }
        return null;
    }

    public static y29 z(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = (String) list.get(i2);
            int i3 = mze.a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                if (str.length() != 0) {
                    "Failed to parse Vorbis comment: ".concat(str);
                }
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(nua.a(new yze(Base64.decode(split[1], 0))));
                } catch (RuntimeException e2) {
                    oyb.b("Failed to parse vorbis picture", e2);
                }
            } else {
                arrayList.add(new wdf(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new y29((List) arrayList);
    }

    public abstract Intent f(Object obj);

    public gvf m(Context context, Object obj) {
        return null;
    }

    public abstract Object y(Intent intent, int i2);
}
