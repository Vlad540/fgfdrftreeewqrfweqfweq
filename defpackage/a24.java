package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.io.File;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.RejectedExecutionException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* renamed from: a24  reason: default package */
public abstract class a24 {
    public static final byte[] a = {0, 0, 0, 1};
    public static final String[] b = {BuildConfig.FLAVOR, "A", "B", "C"};
    public static final Object c = new Object();
    public static volatile a24 d;
    public static final float[] e = {0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    public static final float[] f = {1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f};
    public static final float[] g = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    public static final float[] h = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};

    public static jle A(String str) {
        int hashCode = str.hashCode();
        if (hashCode != 79201641) {
            if (hashCode != 79923350) {
                switch (hashCode) {
                    case -503070503:
                        if (str.equals("TLSv1.1")) {
                            return jle.TLS_1_1;
                        }
                        break;
                    case -503070502:
                        if (str.equals("TLSv1.2")) {
                            return jle.TLS_1_2;
                        }
                        break;
                    case -503070501:
                        if (str.equals("TLSv1.3")) {
                            return jle.TLS_1_3;
                        }
                        break;
                }
            } else if (str.equals("TLSv1")) {
                return jle.TLS_1_0;
            }
        } else if (str.equals("SSLv3")) {
            return jle.SSL_3_0;
        }
        throw new IllegalArgumentException("Unexpected TLS version: ".concat(str));
    }

    public static a24 B() {
        a24 a24;
        synchronized (c) {
            try {
                if (d == null) {
                    d = new do7(3);
                }
                a24 = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return a24;
    }

    public static Integer D(int i, xy2 xy2) {
        if (xy2.equals(m7c.a(cb7.class))) {
            return Integer.valueOf(rhc.p0);
        }
        if (xy2.equals(m7c.a(yc.class))) {
            return Integer.valueOf(rhc.o0);
        }
        if (xy2.equals(m7c.a(fk9.class))) {
            return Integer.valueOf(rhc.q0);
        }
        if (xy2.equals(m7c.a(ew4.class))) {
            int t = hr1.t(i);
            if (t == 0) {
                return Integer.valueOf(rhc.m0);
            }
            if (t == 1) {
                return null;
            }
            if (t == 2) {
                return Integer.valueOf(rhc.n0);
            }
            throw new NoWhenBranchMatchedException();
        }
        xy2 a2 = m7c.a(xy2.class);
        throw new IllegalStateException("Such validation rule (" + a2 + " is not implemented");
    }

    public static final String F(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static Intent K(Activity activity) {
        Intent parentActivityIntent = activity.getParentActivityIntent();
        if (parentActivityIntent != null) {
            return parentActivityIntent;
        }
        try {
            String M = M(activity, activity.getComponentName());
            if (M == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, M);
            try {
                return M(activity, componentName) == null ? Intent.makeMainActivity(componentName) : new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    public static Intent L(Context context, ComponentName componentName) {
        String M = M(context, componentName);
        if (M == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), M);
        return M(context, componentName2) == null ? Intent.makeMainActivity(componentName2) : new Intent().setComponent(componentName2);
    }

    public static String M(Context context, ComponentName componentName) {
        String string;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 269222528);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final boolean R(int i) {
        return (8400 <= i && i < 8448) || (8596 <= i && i < 8601) || ((9100 <= i && i < 9301) || ((9723 <= i && i < 9727) || ((9728 <= i && i < 9984) || ((9984 <= i && i < 10176) || ((65024 <= i && i < 65040) || ((127462 <= i && i < 127488) || ((127744 <= i && i < 128512) || ((128512 <= i && i < 128592) || ((128640 <= i && i < 128768) || ((128992 <= i && i < 129004) || ((129648 <= i && i < 129661) || ((129664 <= i && i < 129734) || ((129742 <= i && i < 129756) || ((129760 <= i && i < 129769) || ((129776 <= i && i < 129785) || ((129280 <= i && i < 129536) || ((127000 <= i && i < 127601) || ((917536 <= i && i < 917632) || i == 126980 || i == 129008 || i == 8252 || i == 8265 || i == 8482 || i == 8505 || i == 8601 || i == 8617 || i == 8618 || i == 8986 || i == 8987 || i == 9000 || i == 9410 || i == 9642 || i == 9643 || i == 9654 || i == 9664 || i == 10548 || i == 10549 || i == 11013 || i == 11014 || i == 11015 || i == 11035 || i == 11036 || i == 11088 || i == 11093 || i == 12336 || i == 12349 || i == 12951 || i == 12953 || i == 169 || i == 174))))))))))))))))));
    }

    public static String V(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static int W(double d2) {
        if (Double.isNaN(d2)) {
            throw new IllegalArgumentException("Cannot round NaN value.");
        } else if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        } else {
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
    }

    public static int X(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static long Y(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        throw new IllegalArgumentException("Cannot round NaN value.");
    }

    public static final void Z(View view, long j, View.OnClickListener onClickListener) {
        if (onClickListener != null) {
            view.setOnClickListener(new c14(j, onClickListener));
        } else {
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static jc3 a(mge mge, Bundle bundle, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        return new jc3(mge, bundle, (mnc) null);
    }

    public static Object b(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static final void c0(View view, Layout layout, ImageReceiver imageReceiver) {
        CharSequence text = layout.getText();
        int length = text.length();
        Object[] objArr = null;
        try {
            Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
            if (spanned != null) {
                objArr = spanned.getSpans(0, length, ak.class);
            }
        } catch (Throwable unused) {
        }
        if (objArr == null) {
            objArr = new ak[0];
        }
        for (Object obj : objArr) {
            ak akVar = (ak) obj;
            zj zjVar = akVar.w0;
            RLottieDrawable b2 = zjVar.b();
            RLottieDrawable rLottieDrawable = zjVar.B0;
            if (b2 == rLottieDrawable && rLottieDrawable != null) {
                rLottieDrawable.addParentView(imageReceiver);
            }
            zj zjVar2 = akVar.w0;
            zjVar2.setCallback(view);
            zjVar2.start();
        }
    }

    public static final yq4 d(int i) {
        if (i == 0) {
            return yq4.a;
        }
        if (i == 1) {
            return yq4.b;
        }
        if (i == 2) {
            return yq4.c;
        }
        if (i == 3) {
            return yq4.o;
        }
        if (i == 4) {
            return yq4.X;
        }
        yq4 yq4 = yq4.Y;
        if (i == 5) {
            return yq4;
        }
        udd.s("OneMeDynamicFont", wn6.h(i, "unknown font size mode "), new IllegalStateException(wn6.h(i, "unknown font size mode ")));
        return yq4;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void d0(android.text.Layout r6, one.me.rlottie.ImageReceiver r7) {
        /*
            java.lang.CharSequence r6 = r6.getText()
            int r0 = r6.length()
            r1 = 0
            r2 = 0
            boolean r3 = r6 instanceof android.text.Spanned     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x0011
            android.text.Spanned r6 = (android.text.Spanned) r6     // Catch:{ all -> 0x001b }
            goto L_0x0012
        L_0x0011:
            r6 = r1
        L_0x0012:
            if (r6 == 0) goto L_0x001b
            java.lang.Class<ak> r3 = ak.class
            java.lang.Object[] r6 = r6.getSpans(r2, r0, r3)     // Catch:{ all -> 0x001b }
            goto L_0x001c
        L_0x001b:
            r6 = r1
        L_0x001c:
            if (r6 != 0) goto L_0x0020
            ak[] r6 = new ak[r2]
        L_0x0020:
            int r0 = r6.length
        L_0x0021:
            if (r2 >= r0) goto L_0x0047
            r3 = r6[r2]
            ak r3 = (ak) r3
            zj r4 = r3.w0
            r4.setCallback(r1)
            zj r3 = r3.w0
            one.me.rlottie.RLottieDrawable r4 = r3.B0
            if (r4 == 0) goto L_0x0035
            r4.removeParentView(r7)
        L_0x0035:
            one.me.rlottie.RLottieDrawable r4 = r3.B0
            if (r4 == 0) goto L_0x0041
            boolean r4 = r4.hasParentViews()
            r5 = 1
            if (r4 != r5) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r3.stop()
        L_0x0044:
            int r2 = r2 + 1
            goto L_0x0021
        L_0x0047:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a24.d0(android.text.Layout, one.me.rlottie.ImageReceiver):void");
    }

    public static String e(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        Object[] objArr = {b[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)};
        int i5 = oze.a;
        StringBuilder sb = new StringBuilder(String.format(Locale.US, "hvc1.%s%d.%X.%c%d", objArr));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i6 = 0; i6 < length; i6++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i6])}));
        }
        return sb.toString();
    }

    public static String e0(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [kcc] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String f0(kotlin.coroutines.Continuation r3) {
        /*
            boolean r0 = r3 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r0 == 0) goto L_0x000b
            kotlinx.coroutines.internal.DispatchedContinuation r3 = (kotlinx.coroutines.internal.DispatchedContinuation) r3
            java.lang.String r3 = r3.toString()
            goto L_0x0053
        L_0x000b:
            r0 = 64
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0024 }
            r1.<init>()     // Catch:{ all -> 0x0024 }
            r1.append(r3)     // Catch:{ all -> 0x0024 }
            r1.append(r0)     // Catch:{ all -> 0x0024 }
            java.lang.String r2 = F(r3)     // Catch:{ all -> 0x0024 }
            r1.append(r2)     // Catch:{ all -> 0x0024 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0024 }
            goto L_0x002b
        L_0x0024:
            r1 = move-exception
            kcc r2 = new kcc
            r2.<init>(r1)
            r1 = r2
        L_0x002b:
            java.lang.Throwable r2 = defpackage.mcc.a(r1)
            if (r2 != 0) goto L_0x0032
            goto L_0x0050
        L_0x0032:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r3 = F(r3)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L_0x0050:
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L_0x0053:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a24.f0(kotlin.coroutines.Continuation):java.lang.String");
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void i(boolean z, String str, Object... objArr) {
        if (!z) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static final void i0(bve bve) {
        bve.e(r6f.class, new yud(4));
        bve.e(j5f.class, new yud(5));
        bve.e(n50.class, new yud(6));
    }

    public static void j(Handler handler) {
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            throw new IllegalStateException(c3d.i("Must be called on ", handler.getLooper().getThread().getName(), " thread, but got ", myLooper != null ? myLooper.getThread().getName() : "null current looper", "."));
        }
    }

    public static void k(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Given String is empty or null");
        }
    }

    public static void l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void m() {
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            String name = myLooper.getThread().getName();
            if (name == "GoogleApiHandler" || (name != null && name.equals("GoogleApiHandler"))) {
                throw new IllegalStateException("Must not be called on GoogleApiHandler thread.");
            }
        }
    }

    public static final Object m0(aec aec, u16 u16, Continuation continuation) {
        dec dec = new dec(aec, u16, (Continuation) null);
        ype ype = (ype) continuation.getContext().get(ype.c);
        fr3 fr3 = ype != null ? ype.a : null;
        if (fr3 != null) {
            return xs7.U(fr3, dec, continuation);
        }
        hu3 context = continuation.getContext();
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        try {
            qm qmVar = aec.c;
            if (qmVar == null) {
                qmVar = null;
            }
            qmVar.execute(new kuf(5, context, zv1, aec, dec, false));
        } catch (RejectedExecutionException e2) {
            zv1.cancel(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e2));
        }
        return zv1.m();
    }

    public static void n(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw new IllegalStateException(str);
        }
    }

    public static void o(Object obj) {
        if (obj == null) {
            throw new NullPointerException("null reference");
        }
    }

    public static void p(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static void q(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static void r(long j, yze yze, ape[] apeArr) {
        int i;
        while (true) {
            boolean z = true;
            if (yze.c() > 1) {
                int i2 = 0;
                while (true) {
                    if (yze.c() != 0) {
                        int v = yze.v();
                        i2 += v;
                        if (v != 255) {
                            i = i2;
                            break;
                        }
                    } else {
                        i = -1;
                        break;
                    }
                }
                int i3 = 0;
                while (true) {
                    if (yze.c() != 0) {
                        int v2 = yze.v();
                        i3 += v2;
                        if (v2 != 255) {
                            break;
                        }
                    } else {
                        i3 = -1;
                        break;
                    }
                }
                int i4 = yze.b + i3;
                if (i3 == -1 || i3 > yze.c()) {
                    i4 = yze.c;
                } else if (i == 4 && i3 >= 8) {
                    int v3 = yze.v();
                    int A = yze.A();
                    int h2 = A == 49 ? yze.h() : 0;
                    int v4 = yze.v();
                    if (A == 47) {
                        yze.I(1);
                    }
                    boolean z2 = v3 == 181 && (A == 49 || A == 47) && v4 == 3;
                    if (A == 49) {
                        if (h2 != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        s(j, yze, apeArr);
                    }
                }
                yze.H(i4);
            } else {
                return;
            }
        }
    }

    public static void s(long j, yze yze, ape[] apeArr) {
        int v = yze.v();
        if ((v & 64) != 0) {
            yze.I(1);
            int i = (v & 31) * 3;
            int i2 = yze.b;
            for (ape ape : apeArr) {
                yze.H(i2);
                ape.c(i, yze);
                if (j != -9223372036854775807L) {
                    ape.b(j, 1, i, 0, (yoe) null);
                }
            }
        }
    }

    public static boolean v(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            int length = listFiles.length;
            boolean z = true;
            for (int i = 0; i < length; i++) {
                z = v(listFiles[i]) && z;
            }
            return z;
        }
        file.delete();
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [er3] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0091, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0092, code lost:
        if (r9 != false) goto L_0x0094;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0096, code lost:
        if ((r7 instanceof java.util.concurrent.CancellationException) != false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0098, code lost:
        r3 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x009b, code lost:
        if (r3 == null) goto L_0x009d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x009d, code lost:
        r3 = new java.util.concurrent.CancellationException("Channel was consumed, consumer had failed");
        r3.initCause(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a7, code lost:
        r8.cancel(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00aa, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066 A[Catch:{ all -> 0x0091 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0073 A[Catch:{ all -> 0x0091 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object w(defpackage.rj5 r7, defpackage.n1c r8, boolean r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.vk5
            if (r0 == 0) goto L_0x0013
            r0 = r10
            vk5 r0 = (defpackage.vk5) r0
            int r1 = r0.x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.x0 = r1
            goto L_0x0018
        L_0x0013:
            vk5 r0 = new vk5
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.w0
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.x0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004b
            if (r2 == r5) goto L_0x003f
            if (r2 != r4) goto L_0x0037
            boolean r9 = r0.Z
            os0 r7 = r0.Y
            n1c r8 = r0.X
            rj5 r2 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x0035 }
        L_0x0032:
            r10 = r7
            r7 = r2
            goto L_0x0056
        L_0x0035:
            r7 = move-exception
            goto L_0x0090
        L_0x0037:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x003f:
            boolean r9 = r0.Z
            os0 r7 = r0.Y
            n1c r8 = r0.X
            rj5 r2 = r0.o
            defpackage.wx3.H(r10)     // Catch:{ all -> 0x0035 }
            goto L_0x006b
        L_0x004b:
            defpackage.wx3.H(r10)
            boolean r10 = r7 instanceof defpackage.sie
            if (r10 != 0) goto L_0x00ab
            os0 r10 = r8.iterator()     // Catch:{ all -> 0x0035 }
        L_0x0056:
            r0.o = r7     // Catch:{ all -> 0x0035 }
            r0.X = r8     // Catch:{ all -> 0x0035 }
            r0.Y = r10     // Catch:{ all -> 0x0035 }
            r0.Z = r9     // Catch:{ all -> 0x0035 }
            r0.x0 = r5     // Catch:{ all -> 0x0035 }
            java.lang.Object r2 = r10.b(r0)     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0067
            return r1
        L_0x0067:
            r6 = r2
            r2 = r7
            r7 = r10
            r10 = r6
        L_0x006b:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch:{ all -> 0x0035 }
            boolean r10 = r10.booleanValue()     // Catch:{ all -> 0x0035 }
            if (r10 == 0) goto L_0x0088
            java.lang.Object r10 = r7.c()     // Catch:{ all -> 0x0035 }
            r0.o = r2     // Catch:{ all -> 0x0035 }
            r0.X = r8     // Catch:{ all -> 0x0035 }
            r0.Y = r7     // Catch:{ all -> 0x0035 }
            r0.Z = r9     // Catch:{ all -> 0x0035 }
            r0.x0 = r4     // Catch:{ all -> 0x0035 }
            java.lang.Object r10 = r2.a(r10, r0)     // Catch:{ all -> 0x0035 }
            if (r10 != r1) goto L_0x0032
            return r1
        L_0x0088:
            if (r9 == 0) goto L_0x008d
            r8.cancel(r3)
        L_0x008d:
            jue r7 = defpackage.jue.a
            return r7
        L_0x0090:
            throw r7     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r10 = move-exception
            if (r9 == 0) goto L_0x00aa
            boolean r9 = r7 instanceof java.util.concurrent.CancellationException
            if (r9 == 0) goto L_0x009b
            r3 = r7
            java.util.concurrent.CancellationException r3 = (java.util.concurrent.CancellationException) r3
        L_0x009b:
            if (r3 != 0) goto L_0x00a7
            java.util.concurrent.CancellationException r3 = new java.util.concurrent.CancellationException
            java.lang.String r9 = "Channel was consumed, consumer had failed"
            r3.<init>(r9)
            r3.initCause(r7)
        L_0x00a7:
            r8.cancel(r3)
        L_0x00aa:
            throw r10
        L_0x00ab:
            sie r7 = (defpackage.sie) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a24.w(rj5, n1c, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static float z(float f2) {
        return f2 == 0.0f ? 1.0f : 0.0f;
    }

    public abstract int C(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int E();

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract int J(View view);

    public abstract int N(CoordinatorLayout coordinatorLayout);

    public abstract int O();

    public abstract void P(String str, String str2);

    public abstract void Q(String str, CancellationException cancellationException);

    public abstract boolean S(float f2);

    public abstract boolean T(View view);

    public abstract boolean U(float f2, float f3);

    public abstract boolean b0(View view, float f2);

    public abstract int f(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float g(int i);

    public abstract void g0(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void h0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract void j0();

    public abstract void k0(String str, String str2);

    public abstract void l0(String str, String str2, RuntimeException runtimeException);

    public abstract void t(String str, String str2);

    public abstract void u(String str, String str2, Throwable th);

    public abstract void x(String str, String str2);

    public abstract void y(String str, String str2, Throwable th);
}
