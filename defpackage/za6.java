package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.graphics.Typeface;
import android.view.View;
import androidx.camera.camera2.internal.compat.quirk.ExtraCroppingQuirk;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.facebook.animated.gif.GifImage;
import com.google.android.gms.common.internal.a;
import com.jakewharton.processphoenix.ProcessPhoenix;
import io.reactivex.rxjava3.exceptions.OnErrorNotImplementedException;
import io.reactivex.rxjava3.exceptions.UndeliverableException;
import java.io.EOFException;
import java.io.IOException;
import java.io.Serializable;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import one.me.android.OneMeApplication;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import ru.ok.android.webrtc.protocol.exceptions.RtcCommandException;

/* renamed from: za6  reason: default package */
public final class za6 implements gg, pu, mh0, tl8, vv1, uw9, cj7, tn1, gl8, of3, Loggable, tab, ghc, wy3 {
    public static int X;
    public static za6 b;
    public static final Object c = new Object();
    public static za6 o;
    public Object a;

    public /* synthetic */ za6(Object obj) {
        this.a = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        defpackage.urd.l(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002f, code lost:
        throw r5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.og0 K(long r4, ahc r6) {
        /*
            if (r6 == 0) goto L_0x0048
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            org.msgpack.core.buffer.OutputStreamBufferOutput r1 = new org.msgpack.core.buffer.OutputStreamBufferOutput     // Catch:{ JSONException -> 0x0027 }
            jr8 r2 = lr8.b     // Catch:{ JSONException -> 0x0027 }
            int r3 = r2.c     // Catch:{ JSONException -> 0x0027 }
            r1.<init>(r0, r3)     // Catch:{ JSONException -> 0x0027 }
            mr8 r3 = new mr8     // Catch:{ JSONException -> 0x0027 }
            r3.<init>(r1, r2)     // Catch:{ JSONException -> 0x0027 }
            O(r3, r4, r6)     // Catch:{ all -> 0x0029 }
            r4 = 0
            defpackage.urd.l(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            og0 r4 = new og0
            byte[] r5 = r0.toByteArray()
            r6 = 2
            r4.<init>((int) r6, (byte[]) r5)
            return r4
        L_0x0027:
            r4 = move-exception
            goto L_0x0030
        L_0x0029:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x002b }
        L_0x002b:
            r5 = move-exception
            defpackage.urd.l(r3, r4)     // Catch:{ JSONException -> 0x0027 }
            throw r5     // Catch:{ JSONException -> 0x0027 }
        L_0x0030:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.Class r6 = r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unable to serialize command: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r4)
            throw r5
        L_0x0048:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Illegal 'command' value: null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za6.K(long, ahc):og0");
    }

    public static void O(mr8 mr8, long j, ahc ahc) {
        if (ahc instanceof dac) {
            dac dac = (dac) ahc;
            mr8.m(1);
            mr8.m(0);
            mr8.n(j);
            mr8.n(dac.b);
            mr8.n(dac.a);
            return;
        }
        byte b2 = -62;
        if (ahc instanceof gve) {
            gve gve = (gve) ahc;
            mr8.m(0);
            mr8.m(0);
            mr8.n(j);
            if (gve.b) {
                b2 = -61;
            }
            mr8.m0(b2);
            List<mzc> list = gve.a;
            int size = list.size();
            if (size == 0) {
                mr8.m0((byte) -64);
            } else {
                mr8.g(size * 2);
                for (mzc mzc : list) {
                    mr8.U(x87.S(mzc));
                    lzc lzc = mzc.b;
                    if (lzc.a) {
                        mr8.m(1);
                    } else {
                        mr8.m(0);
                        mr8.m0((byte) -64);
                        mr8.m(lzc.b);
                        mr8.m(lzc.c);
                        mr8.m(hr1.t(lzc.d));
                    }
                }
            }
            mr8.m0((byte) -64);
        } else if (ahc instanceof mac) {
            mr8.m(3);
            mr8.m(0);
            mr8.n(j);
            if (((mac) ahc).a) {
                b2 = -61;
            }
            mr8.m0(b2);
        } else if (ahc instanceof bac) {
            bac bac = (bac) ahc;
            mr8.m(4);
            mr8.m(0);
            mr8.n(j);
            mr8.n(bac.a);
            mr8.n(bac.b);
        } else {
            throw new IllegalArgumentException("No serializer for command: " + j + " " + ahc.getClass());
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, za6] */
    public static za6 Q(Context context) {
        a24.o(context);
        synchronized (za6.class) {
            if (b == null) {
                p3g p3g = g5g.a;
                synchronized (g5g.class) {
                    try {
                        if (g5g.c == null) {
                            g5g.c = context.getApplicationContext();
                        }
                    } catch (Throwable th) {
                        while (true) {
                            throw th;
                        }
                    }
                }
                ? obj = new Object();
                obj.a = context.getApplicationContext();
                b = obj;
            }
        }
        return b;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, za6] */
    public static za6 S() {
        synchronized (c) {
            try {
                za6 za6 = o;
                if (za6 == null) {
                    return new Object();
                }
                o = (za6) za6.a;
                za6.a = null;
                X--;
                return za6;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
    }

    public static final j4g W(PackageInfo packageInfo, j4g... j4gArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length != 1) {
            return null;
        }
        o4g o4g = new o4g(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < j4gArr.length; i++) {
            if (j4gArr[i].equals(o4g)) {
                return j4gArr[i];
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0047 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean X(android.content.pm.PackageInfo r4, boolean r5) {
        /*
            r0 = 1
            r1 = 0
            if (r5 == 0) goto L_0x0027
            if (r4 == 0) goto L_0x0029
            java.lang.String r2 = "com.android.vending"
            java.lang.String r3 = r4.packageName
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x001a
            java.lang.String r2 = r4.packageName
            java.lang.String r3 = "com.google.android.gms"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L_0x0027
        L_0x001a:
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo
            if (r5 != 0) goto L_0x0020
        L_0x001e:
            r5 = r1
            goto L_0x0027
        L_0x0020:
            int r5 = r5.flags
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L_0x001e
            r5 = r0
        L_0x0027:
            r2 = r4
            goto L_0x002a
        L_0x0029:
            r2 = 0
        L_0x002a:
            if (r4 == 0) goto L_0x0048
            android.content.pm.Signature[] r4 = r2.signatures
            if (r4 == 0) goto L_0x0048
            if (r5 == 0) goto L_0x0039
            j4g[] r4 = defpackage.b5g.a
            j4g r4 = W(r2, r4)
            goto L_0x0045
        L_0x0039:
            j4g[] r4 = defpackage.b5g.a
            r4 = r4[r1]
            j4g[] r4 = new defpackage.j4g[]{r4}
            j4g r4 = W(r2, r4)
        L_0x0045:
            if (r4 == 0) goto L_0x0048
            return r0
        L_0x0048:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za6.X(android.content.pm.PackageInfo, boolean):boolean");
    }

    public boolean A() {
        return true;
    }

    public long C() {
        return 0;
    }

    public long D(long j) {
        return 1;
    }

    public long E(long j, long j2) {
        return 1;
    }

    public int I() {
        return ((GifImage) ((ue) this.a).e).i();
    }

    public jue J(long j, List list) {
        ((a73) ((z63) this.a)).makeCompleting$kotlinx_coroutines_core(list);
        return jue.a;
    }

    public xw2 L(int i, byte[] bArr) {
        if (i == 0) {
            throw new IllegalArgumentException("Illegal 'format' value: null");
        } else if (i == 2) {
            try {
                ws8 a2 = lr8.a(bArr);
                try {
                    int v0 = a2.v0();
                    int v02 = a2.v0();
                    int v03 = a2.v0();
                    if (v02 != 0) {
                        throw new UnsupportedOperationException("Unsupported version: " + v02 + " for command " + v0);
                    } else if (v03 == 0) {
                        xw2 xw2 = v0 != 0 ? v0 != 1 ? null : new xw2(a2.w0(), (Object) new eac(Integer.valueOf(a2.v0())), 8) : N(a2);
                        urd.l(a2, (Throwable) null);
                        return xw2;
                    } else {
                        throw new IllegalArgumentException("Error code " + v03 + " for command " + v0);
                    }
                } catch (Throwable th) {
                    urd.l(a2, th);
                    throw th;
                }
            } catch (Throwable th2) {
                throw new IllegalArgumentException("Unable to decode command body: ".concat(tf6.a(bArr)), th2);
            }
        } else {
            throw new UnsupportedOperationException("Only binary format is supported");
        }
    }

    public nsf M(View view, nsf nsf) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.a;
        if (!Objects.equals(coordinatorLayout.E0, nsf)) {
            coordinatorLayout.E0 = nsf;
            boolean z = nsf.d() > 0;
            coordinatorLayout.F0 = z;
            coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
            lsf lsf = nsf.a;
            if (!lsf.m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = eaf.a;
                    if (childAt.getFitsSystemWindows() && ((nt3) childAt.getLayoutParams()).a != null && lsf.m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return nsf;
    }

    public xw2 N(ws8 ws8) {
        xm1 xm1;
        long w0 = ws8.w0();
        HashMap hashMap = new HashMap();
        int x0 = ws8.x0();
        for (int i = 0; i < x0; i++) {
            if (ws8.n().a() == 5) {
                String z0 = ws8.z0();
                xm1 = x87.w0(z0);
                if (xm1 == null) {
                    throw new IllegalArgumentException("Not found video track participant key for ".concat(z0));
                }
            } else {
                int v0 = ws8.v0();
                xm1 = (xm1) ((ConcurrentHashMap) ((gvf) this.a).b).get(Integer.valueOf(v0));
                if (xm1 == null) {
                    throw new IllegalArgumentException(wn6.h(v0, "Not found video track participant key for "));
                }
            }
            hashMap.put(xm1, ws8.v0() == -1 ? hve.b : hve.a);
        }
        return new xw2(w0, (Object) new ive(hashMap), 8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0020, code lost:
        r17 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        r5 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        r0 = e;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086 A[EDGE_INSN: B:46:0x0086->B:35:0x0086 ?: BREAK  
    EDGE_INSN: B:48:0x0086->B:35:0x0086 ?: BREAK  
    EDGE_INSN: B:49:0x0086->B:35:0x0086 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00bf A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[ExcHandler: IllegalArgumentException (e java.lang.IllegalArgumentException), Splitter:B:1:0x000f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.text.StaticLayout P(java.lang.CharSequence r19, android.text.TextPaint r20, int r21, android.text.Layout.Alignment r22, boolean r23, android.text.TextUtils.TruncateAt r24, int r25) {
        /*
            r18 = this;
            r1 = r19
            r0 = r18
            java.lang.Object r0 = r0.a
            r2 = r0
            g15 r2 = (g15) r2
            java.lang.String r3 = "za6"
            r4 = 0
            r15 = r1
            r16 = r4
        L_0x000f:
            int r0 = r15.length()     // Catch:{ IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x001f }
            if (r16 == 0) goto L_0x0018
            r6 = r0
            r7 = r4
            goto L_0x001a
        L_0x0018:
            r7 = r0
            r6 = r4
        L_0x001a:
            if (r16 == 0) goto L_0x0027
            efe r0 = defpackage.gfe.e     // Catch:{ IndexOutOfBoundsException -> 0x0023, IllegalArgumentException -> 0x001f }
            goto L_0x0029
        L_0x001f:
            r0 = move-exception
            r17 = r15
            goto L_0x004a
        L_0x0023:
            r0 = move-exception
            r5 = r15
            goto L_0x009a
        L_0x0027:
            efe r0 = defpackage.gfe.c     // Catch:{ IndexOutOfBoundsException -> 0x0046, IllegalArgumentException -> 0x001f }
        L_0x0029:
            r5 = r15
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            r13 = r21
            r14 = r25
            r17 = r15
            r15 = r0
            android.text.StaticLayout r0 = defpackage.r1g.t(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)     // Catch:{ IndexOutOfBoundsException -> 0x0042, IllegalArgumentException -> 0x0040 }
            return r0
        L_0x0040:
            r0 = move-exception
            goto L_0x004a
        L_0x0042:
            r0 = move-exception
        L_0x0043:
            r5 = r17
            goto L_0x009a
        L_0x0046:
            r0 = move-exception
            r17 = r15
            goto L_0x0043
        L_0x004a:
            java.lang.String r5 = "seems we work with RTL text"
            defpackage.udd.s(r3, r5, r0)
            java.lang.String r5 = r0.getMessage()
            if (r5 != 0) goto L_0x0057
            java.lang.String r5 = ""
        L_0x0057:
            if (r16 != 0) goto L_0x0086
            java.lang.String r6 = "fromIndex"
            boolean r6 = defpackage.h0e.R(r5, r6, r4)
            if (r6 == 0) goto L_0x0086
            java.lang.String r6 = "toIndex"
            boolean r5 = defpackage.h0e.R(r5, r6, r4)
            if (r5 == 0) goto L_0x0086
            if (r2 == 0) goto L_0x0081
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r5 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "check range exception: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6, r0)
            g15.b(r2, r5)
        L_0x0081:
            r16 = 1
            r15 = r17
            goto L_0x000f
        L_0x0086:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "unknown: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        L_0x009a:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 != 0) goto L_0x00bf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Hit bug #35412, retrying with Spannables removed: "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            defpackage.udd.s(r3, r6, r0)
            if (r2 == 0) goto L_0x00b9
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r7 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            r7.<init>(r6, r0)
            g15.b(r2, r7)
        L_0x00b9:
            java.lang.String r15 = r5.toString()
            goto L_0x000f
        L_0x00bf:
            ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException r2 = new ru.ok.tamtam.messages.rendering.StaticLayoutFactory$StaticLayoutCreateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "strange: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1, r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za6.P(java.lang.CharSequence, android.text.TextPaint, int, android.text.Layout$Alignment, boolean, android.text.TextUtils$TruncateAt, int):android.text.StaticLayout");
    }

    public int R() {
        return ((GifImage) ((ue) this.a).e).h();
    }

    public a39 T(r74 r74, to6 to6) {
        ija ija = (ija) this.a;
        a39 a39 = null;
        int i = 0;
        while (true) {
            try {
                r74.r(ija.a, 0, 10, false);
                ija.G(0);
                if (ija.x() != 4801587) {
                    break;
                }
                ija.H(3);
                int t = ija.t();
                int i2 = t + 10;
                if (a39 == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(ija.a, 0, bArr, 0, 10);
                    r74.r(bArr, 10, t, false);
                    a39 = new wo6(to6).Z(i2, bArr);
                } else {
                    r74.b(t, false);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        r74.Y = 0;
        r74.b(i, false);
        return a39;
    }

    public void U() {
        synchronized (c) {
            try {
                int i = X;
                if (i < 5) {
                    X = i + 1;
                    za6 za6 = o;
                    if (za6 != null) {
                        this.a = za6;
                    }
                    o = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public int V() {
        return ((GifImage) ((ue) this.a).e).k();
    }

    public void accept(Object obj) {
        Throwable th = (Throwable) obj;
        if ((th instanceof OnErrorNotImplementedException) || (th instanceof UndeliverableException)) {
            udd.s("RxJavaErrorHandler", "rxjava undeliverable error", th);
            ((rf4) y0f.a.getAccessor().c(rf4.class)).e();
        } else if (th instanceof SQLiteDatabaseCorruptException) {
            ProcessPhoenix.b((OneMeApplication) this.a);
        } else {
            Thread currentThread = Thread.currentThread();
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = currentThread.getUncaughtExceptionHandler();
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(currentThread, th);
            }
        }
    }

    public long b(long j) {
        return 0;
    }

    public int c() {
        return ((GifImage) ((ue) this.a).e).e();
    }

    public void d(int i, Serializable serializable) {
        if (i == 6 || i == 7 || i == 8) {
            Throwable th = (Throwable) serializable;
        }
        ((ProfileInstallReceiver) this.a).setResultCode(i);
    }

    public void e(pl8 pl8, ul8 ul8) {
        ((dx1) this.a).Z.removeCallbacksAndMessages(pl8);
    }

    public xw2 f(int i, byte[] bArr) {
        try {
            return L(i, bArr);
        } catch (Throwable th) {
            throw new RtcCommandException((Long) null, false, th);
        }
    }

    public void g(fj7 fj7, long j, long j2, boolean z) {
        ((ty3) this.a).r((mja) fj7, j, j2);
    }

    public int i() {
        return ((ue) this.a).a;
    }

    public long j(long j, long j2) {
        return j2;
    }

    public void k(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.a).getClass();
    }

    public long l(long j, long j2) {
        return 0;
    }

    public void m(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.a).getClass();
    }

    public long n(long j, long j2) {
        return -9223372036854775807L;
    }

    public int o(int i) {
        return ((int[]) ((ue) this.a).g)[i];
    }

    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        xwb xwb;
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference != null && str != null && str2 != null && (xwb = (xwb) weakReference.get()) != null) {
            xwb.log(str2, str);
        }
    }

    public nxb p(long j) {
        return (nxb) this.a;
    }

    public void q(fj7 fj7, long j, long j2) {
        mja mja = (mja) fj7;
        ty3 ty3 = (ty3) this.a;
        ty3.getClass();
        long j3 = mja.a;
        xz3 xz3 = mja.b;
        esd esd = mja.o;
        xi7 xi7 = new xi7(j3, xz3, esd.c, esd.o, j, j2, esd.b);
        ty3.n.getClass();
        ty3.q.f(xi7, mja.c, -1, (vu5) null, 0, (Object) null, -9223372036854775807L, -9223372036854775807L);
        ty3.L = ((Long) mja.Y).longValue() - j;
        ty3.s(true);
    }

    public void r(Typeface typeface) {
        j23 j23 = (j23) this.a;
        if (j23.o(typeface)) {
            j23.i(false);
        }
    }

    public og0 t(long j, ahc ahc) {
        try {
            return K(j, ahc);
        } catch (Throwable th) {
            throw new RtcCommandException(Long.valueOf(j), false, th);
        }
    }

    public void u(Object obj) {
        ov0 ov0 = (ov0) obj;
        ((kk9) this.a).getClass();
    }

    public long v(long j, long j2) {
        return 0;
    }

    public void w(nd3 nd3) {
        boolean z = nd3.b == 0;
        a aVar = (a) this.a;
        if (z) {
            aVar.k((an6) null, aVar.L0);
            return;
        }
        k2e k2e = aVar.D0;
        if (k2e != null) {
            ((pa6) k2e.a).k(nd3);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: cx1} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void x(defpackage.pl8 r10, defpackage.ul8 r11) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.a
            dx1 r0 = (defpackage.dx1) r0
            android.os.Handler r1 = r0.Z
            r2 = 0
            r1.removeCallbacksAndMessages(r2)
            java.util.ArrayList r1 = r0.x0
            int r3 = r1.size()
            r4 = 0
        L_0x0011:
            r5 = -1
            if (r4 >= r3) goto L_0x0022
            java.lang.Object r6 = r1.get(r4)
            cx1 r6 = (defpackage.cx1) r6
            pl8 r6 = r6.b
            if (r10 != r6) goto L_0x001f
            goto L_0x0023
        L_0x001f:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x0022:
            r4 = r5
        L_0x0023:
            if (r4 != r5) goto L_0x0026
            return
        L_0x0026:
            int r4 = r4 + 1
            int r3 = r1.size()
            if (r4 >= r3) goto L_0x0035
            java.lang.Object r1 = r1.get(r4)
            r2 = r1
            cx1 r2 = (defpackage.cx1) r2
        L_0x0035:
            r5 = r2
            kuf r1 = new kuf
            r8 = 1
            r3 = r1
            r4 = r9
            r6 = r11
            r7 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            long r2 = android.os.SystemClock.uptimeMillis()
            r4 = 200(0xc8, double:9.9E-322)
            long r2 = r2 + r4
            android.os.Handler r9 = r0.Z
            r9.postAtTime(r1, r10, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.za6.x(pl8, ul8):void");
    }

    public sz0 y(fj7 fj7, long j, long j2, IOException iOException, int i) {
        IOException iOException2 = iOException;
        mja mja = (mja) fj7;
        ty3 ty3 = (ty3) this.a;
        ty3.getClass();
        long j3 = mja.a;
        esd esd = mja.o;
        ty3.q.i(new xi7(j3, mja.b, esd.c, esd.o, j, j2, esd.b), mja.c, iOException2, true);
        ty3.n.getClass();
        oyb.b("Failed to resolve time offset.", iOException2);
        ty3.s(true);
        return jj7.X;
    }

    public String z(sn1 sn1) {
        j36 j36 = (j36) this.a;
        e07.p("The result can only set once!", j36.b == null);
        j36.b = sn1;
        return "FutureChain[" + j36 + "]";
    }

    public za6(int i) {
        switch (i) {
            case 19:
                this.a = (ExtraCroppingQuirk) zf4.a.j(ExtraCroppingQuirk.class);
                return;
            default:
                this.a = new ija(10);
                return;
        }
    }
}
