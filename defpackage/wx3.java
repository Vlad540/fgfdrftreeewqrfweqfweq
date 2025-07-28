package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Layout;
import android.util.TypedValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: wx3  reason: default package */
public abstract class wx3 {
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final lq6 e = new lq6("drawable", ".drawable");
    public static final Object f = new Object();
    public static boolean g = true;
    public static final /* synthetic */ int h = 0;

    public static final int A(vga vga) {
        int ordinal = vga.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static void B(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, 0});
        ofInt.setDuration(j);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    public static void C(Set set, kh0 kh0, boolean z) {
        udd.p("wx3", "event: " + kh0.getClass().getName() + " postponed", new Object[0]);
        if (z) {
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                kh0 kh02 = (kh0) it.next();
                if (kh02.getClass().equals(kh0.getClass())) {
                    arrayList.add(kh02);
                }
            }
            set.removeAll(arrayList);
        }
        set.add(kh0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        defpackage.urd.l(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0051, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0052, code lost:
        defpackage.urd.l(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final byte[] D(java.util.Set r4) {
        /*
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x000a
            r4 = 0
            byte[] r4 = new byte[r4]
            return r4
        L_0x000a:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ObjectOutputStream r1 = new java.io.ObjectOutputStream     // Catch:{ all -> 0x0048 }
            r1.<init>(r0)     // Catch:{ all -> 0x0048 }
            int r2 = r4.size()     // Catch:{ all -> 0x003a }
            r1.writeInt(r2)     // Catch:{ all -> 0x003a }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x003a }
        L_0x001f:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x003a }
            if (r2 == 0) goto L_0x003c
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x003a }
            hf3 r2 = (defpackage.hf3) r2     // Catch:{ all -> 0x003a }
            android.net.Uri r3 = r2.a     // Catch:{ all -> 0x003a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x003a }
            r1.writeUTF(r3)     // Catch:{ all -> 0x003a }
            boolean r2 = r2.b     // Catch:{ all -> 0x003a }
            r1.writeBoolean(r2)     // Catch:{ all -> 0x003a }
            goto L_0x001f
        L_0x003a:
            r4 = move-exception
            goto L_0x004a
        L_0x003c:
            r4 = 0
            defpackage.urd.l(r1, r4)     // Catch:{ all -> 0x0048 }
            defpackage.urd.l(r0, r4)
            byte[] r4 = r0.toByteArray()
            return r4
        L_0x0048:
            r4 = move-exception
            goto L_0x0050
        L_0x004a:
            throw r4     // Catch:{ all -> 0x004b }
        L_0x004b:
            r2 = move-exception
            defpackage.urd.l(r1, r4)     // Catch:{ all -> 0x0048 }
            throw r2     // Catch:{ all -> 0x0048 }
        L_0x0050:
            throw r4     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r1 = move-exception
            defpackage.urd.l(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.D(java.util.Set):byte[]");
    }

    public static final void E(eje eje, long j) {
        if (eje instanceof fje) {
            fje fje = (fje) eje;
            synchronized (fje) {
                if (j != 0) {
                    if (fje.a == null) {
                        fje.a = Long.valueOf(TimeUnit.NANOSECONDS.toMillis(j));
                        fje.b = Long.valueOf(SystemClock.elapsedRealtime());
                    }
                }
            }
        }
    }

    public static void F(j0b j0b, long j) {
        if (j >= 0) {
            while (j > 0) {
                long skip = j0b.skip(j);
                if (skip <= 0) {
                    if (j0b.read() != -1) {
                        skip = 1;
                    } else {
                        return;
                    }
                }
                j -= skip;
            }
            return;
        }
        throw new IllegalArgumentException();
    }

    public static final int G(ctf ctf) {
        int ordinal = ctf.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        if (ordinal == 2) {
            return 2;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal == 4) {
            return 4;
        }
        if (ordinal == 5) {
            return 5;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final void H(Object obj) {
        if (obj instanceof kcc) {
            throw ((kcc) obj).a;
        }
    }

    public static final void I(bve bve) {
        bve.c(z24.class, new w8d(3));
    }

    public static void J(g0 g0Var) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        CountDownLatch countDownLatch = new CountDownLatch(1);
        n4 n4Var = new n4(1);
        n4 n4Var2 = new n4(1);
        g0Var.m(new vz3(n4Var, countDownLatch, n4Var2), new mh4(5));
        countDownLatch.await();
        Object obj = n4Var2.a;
        if (obj != null) {
            throw ((Throwable) obj);
        }
    }

    public static float K() {
        return ((float) Math.pow((((double) 50.0f) + 16.0d) / 116.0d, 3.0d)) * 100.0f;
    }

    public static final int a(he0 he0) {
        int ordinal = he0.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        if (ordinal == 1) {
            return 1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        defpackage.urd.l(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0041, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.LinkedHashSet b(byte[] r8) {
        /*
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            int r1 = r8.length
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r8)
            r8 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch:{ IOException -> 0x003a }
            r2.<init>(r1)     // Catch:{ IOException -> 0x003a }
            int r3 = r2.readInt()     // Catch:{ all -> 0x0032 }
            r4 = 0
        L_0x0019:
            if (r4 >= r3) goto L_0x0034
            java.lang.String r5 = r2.readUTF()     // Catch:{ all -> 0x0032 }
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch:{ all -> 0x0032 }
            boolean r6 = r2.readBoolean()     // Catch:{ all -> 0x0032 }
            hf3 r7 = new hf3     // Catch:{ all -> 0x0032 }
            r7.<init>(r5, r6)     // Catch:{ all -> 0x0032 }
            r0.add(r7)     // Catch:{ all -> 0x0032 }
            int r4 = r4 + 1
            goto L_0x0019
        L_0x0032:
            r3 = move-exception
            goto L_0x003c
        L_0x0034:
            defpackage.urd.l(r2, r8)     // Catch:{ IOException -> 0x003a }
            goto L_0x0045
        L_0x0038:
            r8 = move-exception
            goto L_0x0049
        L_0x003a:
            r2 = move-exception
            goto L_0x0042
        L_0x003c:
            throw r3     // Catch:{ all -> 0x003d }
        L_0x003d:
            r4 = move-exception
            defpackage.urd.l(r2, r3)     // Catch:{ IOException -> 0x003a }
            throw r4     // Catch:{ IOException -> 0x003a }
        L_0x0042:
            r2.printStackTrace()     // Catch:{ all -> 0x0038 }
        L_0x0045:
            defpackage.urd.l(r1, r8)
            return r0
        L_0x0049:
            throw r8     // Catch:{ all -> 0x004a }
        L_0x004a:
            r0 = move-exception
            defpackage.urd.l(r1, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.b(byte[]):java.util.LinkedHashSet");
    }

    public static int d(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    public static final rn1 e(pj5 pj5, pc7 pc7, ob7 ob7) {
        return ez3.h(new kk5(pc7, ob7, pj5, (Continuation) null));
    }

    public static lg7 f(i26 i26, i26 i262) {
        fj0 fj0 = fj0.a;
        fj0 fj02 = fj0.X;
        lg7 c2 = hwf.c();
        Iterator it = new nv7((List) ij0.a).iterator();
        while (true) {
            ListIterator listIterator = ((zcc) it).b;
            if (!listIterator.hasPrevious()) {
                return hwf.a(c2);
            }
            fj0 fj03 = (fj0) listIterator.previous();
            if (fj03.compareTo(fj0) >= 0 && fj03.compareTo(fj02) <= 0) {
                ej0 ej0 = ej0.b;
                String str = (String) i262.invoke(fj03, ej0);
                if (str != null) {
                    c2.add(str);
                }
                ej0 ej02 = ej0.a;
                String str2 = (String) i262.invoke(fj03, ej02);
                if (str2 != null) {
                    c2.add(str2);
                }
                String str3 = (String) i26.invoke(fj03, ej0);
                if (str3 != null) {
                    c2.add(str3);
                }
                String str4 = (String) i26.invoke(fj03, ej02);
                if (str4 != null) {
                    c2.add(str4);
                }
            }
        }
    }

    public static final lg7 g(fj0 fj0, fj0 fj02, u16 u16) {
        String str;
        lg7 c2 = hwf.c();
        Iterator it = new nv7((List) ij0.a).iterator();
        while (true) {
            ListIterator listIterator = ((zcc) it).b;
            if (!listIterator.hasPrevious()) {
                return hwf.a(c2);
            }
            fj0 fj03 = (fj0) listIterator.previous();
            if (fj03.compareTo(fj0) >= 0 && fj03.compareTo(fj02) <= 0 && (str = (String) u16.invoke(fj03)) != null) {
                c2.add(str);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0011, code lost:
        r2 = defpackage.d8.r(r2, (r0 = r0.getResourceId(r4, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList h(android.content.Context r2, ydc r3, int r4) {
        /*
            java.lang.Object r0 = r3.c
            android.content.res.TypedArray r0 = (android.content.res.TypedArray) r0
            boolean r1 = r0.hasValue(r4)
            if (r1 == 0) goto L_0x0018
            r1 = 0
            int r0 = r0.getResourceId(r4, r1)
            if (r0 == 0) goto L_0x0018
            android.content.res.ColorStateList r2 = defpackage.d8.r(r2, r0)
            if (r2 == 0) goto L_0x0018
            return r2
        L_0x0018:
            android.content.res.ColorStateList r2 = r3.w(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.h(android.content.Context, ydc, int):android.content.res.ColorStateList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.d8.r(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList i(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.content.res.ColorStateList r1 = defpackage.d8.r(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.content.res.ColorStateList r1 = r2.getColorStateList(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.i(android.content.Context, android.content.res.TypedArray, int):android.content.res.ColorStateList");
    }

    public static int j(Context context, TypedArray typedArray, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i, i2);
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i2);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000d, code lost:
        r1 = defpackage.am7.n(r1, (r0 = r2.getResourceId(r3, 0)));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.drawable.Drawable k(android.content.Context r1, android.content.res.TypedArray r2, int r3) {
        /*
            boolean r0 = r2.hasValue(r3)
            if (r0 == 0) goto L_0x0014
            r0 = 0
            int r0 = r2.getResourceId(r3, r0)
            if (r0 == 0) goto L_0x0014
            android.graphics.drawable.Drawable r1 = defpackage.am7.n(r1, r0)
            if (r1 == 0) goto L_0x0014
            return r1
        L_0x0014:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.k(android.content.Context, android.content.res.TypedArray, int):android.graphics.drawable.Drawable");
    }

    public static int l() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        int[] iArr = new int[2];
        EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1);
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        EGL14.eglChooseConfig(eglGetDisplay, new int[]{12351, 12430, 12329, 0, 12352, 4, 12339, 1, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0);
        if (iArr2[0] == 0) {
            return 0;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eglGetDisplay, eGLConfig, new int[]{12375, 64, 12374, 64, 12344}, 0);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eglGetDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        EGL14.eglMakeCurrent(eglGetDisplay, eglCreatePbufferSurface, eglCreatePbufferSurface, eglCreateContext);
        int[] iArr3 = new int[1];
        GLES20.glGetIntegerv(3379, iArr3, 0);
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eglGetDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        EGL14.eglDestroySurface(eglGetDisplay, eglCreatePbufferSurface);
        EGL14.eglDestroyContext(eglGetDisplay, eglCreateContext);
        EGL14.eglTerminate(eglGetDisplay);
        return iArr3[0];
    }

    public static final int m(Layout layout) {
        if (layout != null) {
            return layout.getHeight();
        }
        return 0;
    }

    public static final int n(Layout layout) {
        if (layout == null) {
            return 0;
        }
        return layout.getLineCount() > 0 ? (int) layout.getLineMax(0) : layout.getWidth();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [sgd, g0] */
    public static sgd o(Throwable th) {
        ? g0Var = new g0();
        th.getClass();
        g0Var.j(th, (Map) null);
        return g0Var;
    }

    public static int p(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return j33.b((double) (f6 * fArr[0]), (double) (f4 * fArr[1]), (double) (f5 * fArr[2]));
    }

    public static final he0 q(int i) {
        if (i == 0) {
            return he0.a;
        }
        if (i == 1) {
            return he0.b;
        }
        throw new IllegalArgumentException(rf0.f(i, "Could not convert ", " to BackoffPolicy"));
    }

    public static final int r(int i) {
        if (i == 0) {
            return 1;
        }
        int i2 = 2;
        if (i != 1) {
            if (i == 2) {
                return 3;
            }
            i2 = 4;
            if (i != 3) {
                if (i == 4) {
                    return 5;
                }
                if (Build.VERSION.SDK_INT >= 30 && i == 5) {
                    return 6;
                }
                throw new IllegalArgumentException(rf0.f(i, "Could not convert ", " to NetworkType"));
            }
        }
        return i2;
    }

    public static final vga s(int i) {
        if (i == 0) {
            return vga.a;
        }
        if (i == 1) {
            return vga.b;
        }
        throw new IllegalArgumentException(rf0.f(i, "Could not convert ", " to OutOfQuotaPolicy"));
    }

    public static final ctf t(int i) {
        if (i == 0) {
            return ctf.a;
        }
        if (i == 1) {
            return ctf.b;
        }
        if (i == 2) {
            return ctf.c;
        }
        if (i == 3) {
            return ctf.o;
        }
        if (i == 4) {
            return ctf.X;
        }
        if (i == 5) {
            return ctf.Y;
        }
        throw new IllegalArgumentException(rf0.f(i, "Could not convert ", " to State"));
    }

    public static boolean u(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    public static int v(int i, int i2, int i3) {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        throw new IOException(me4.g("PROTOCOL_ERROR padding ", i3, i, " > remaining length "));
    }

    public static float w(int i) {
        float f2 = ((float) i) / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((double) ((f2 + 0.055f) / 1.055f), 2.4000000953674316d)) * 100.0f;
    }

    public static final int x(int i) {
        int t = hr1.t(i);
        if (t == 0) {
            return 0;
        }
        if (t == 1) {
            return 1;
        }
        if (t == 2) {
            return 2;
        }
        if (t == 3) {
            return 3;
        }
        if (t == 4) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 6) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + us8.u(i) + " to int");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v4, resolved type: kgd} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: java.util.Map} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v16, resolved type: java.util.Map} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x023f, code lost:
        r11 = r18;
        r9 = r5;
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        r18.z();
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x037b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x037c, code lost:
        r1 = r0;
        defpackage.udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", r1);
        r0 = uzc.a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x038a, code lost:
        if (r0.hasNext() != false) goto L_0x038c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x038c, code lost:
        ((defpackage.ny9) r0.next()).getClass();
        defpackage.ny9.a(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0399, code lost:
        r0 = defpackage.hr1.t(m4b.a);
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x039f, code lost:
        if (r0 != 0) goto L_0x03a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x03a2, code lost:
        if (r0 != 1) goto L_0x03a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x03a9, code lost:
        throw new kotlin.NoWhenBranchMatchedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x03aa, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x03af, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x03b0, code lost:
        r12 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008d, code lost:
        r11 = r18;
        r9 = r5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static ra3 y(ws8 r18) {
        /*
            r1 = 1
            java.lang.String r2 = "payloadCatching catch error"
            java.lang.String r3 = "ServerPayload/PayloadCatching"
            r4 = 0
            int r0 = defpackage.jjd.K(r18)     // Catch:{ all -> 0x000c }
            r5 = r0
            goto L_0x003c
        L_0x000c:
            r0 = move-exception
            r5 = r0
            defpackage.udd.S(r3, r2, r5)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0017:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r0.next()
            ny9 r6 = (defpackage.ny9) r6
            r6.getClass()
            defpackage.ny9.a(r5)
            goto L_0x0017
        L_0x002a:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x003b
            if (r0 == r1) goto L_0x003a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003a:
            throw r5
        L_0x003b:
            r5 = r4
        L_0x003c:
            r6 = 0
            if (r5 != 0) goto L_0x0040
            return r6
        L_0x0040:
            iw4 r0 = defpackage.iw4.a
            r7 = r0
            r8 = r4
            r10 = r6
            r12 = r10
            r13 = r12
            r14 = r13
        L_0x0048:
            if (r8 >= r5) goto L_0x03b6
            java.lang.String r0 = defpackage.jjd.M(r18)     // Catch:{ all -> 0x004f }
            goto L_0x007f
        L_0x004f:
            r0 = move-exception
            r9 = r0
            defpackage.udd.S(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x005a:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x006d
            java.lang.Object r11 = r0.next()
            ny9 r11 = (defpackage.ny9) r11
            r11.getClass()
            defpackage.ny9.a(r9)
            goto L_0x005a
        L_0x006d:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x007e
            if (r0 == r1) goto L_0x007d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x007d:
            throw r9
        L_0x007e:
            r0 = r6
        L_0x007f:
            if (r0 != 0) goto L_0x0086
            r11 = r18
            r9 = r5
            goto L_0x03b0
        L_0x0086:
            int r9 = r0.hashCode()
            switch(r9) {
                case -905826493: goto L_0x036c;
                case 3195150: goto L_0x0328;
                case 3599307: goto L_0x0316;
                case 94623771: goto L_0x0244;
                case 1287422797: goto L_0x0092;
                default: goto L_0x008d;
            }
        L_0x008d:
            r11 = r18
            r9 = r5
            goto L_0x0377
        L_0x0092:
            java.lang.String r9 = "chatFolders"
            boolean r0 = r0.equals(r9)
            if (r0 != 0) goto L_0x009b
            goto L_0x008d
        L_0x009b:
            u72 r0 = u72.c
            int r0 = defpackage.jjd.K(r18)     // Catch:{ all -> 0x00a3 }
            r9 = r0
            goto L_0x00d3
        L_0x00a3:
            r0 = move-exception
            r9 = r0
            defpackage.udd.S(r3, r2, r9)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00ae:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x00c1
            java.lang.Object r11 = r0.next()
            ny9 r11 = (defpackage.ny9) r11
            r11.getClass()
            defpackage.ny9.a(r9)
            goto L_0x00ae
        L_0x00c1:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x00d2
            if (r0 == r1) goto L_0x00d1
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x00d1:
            throw r9
        L_0x00d2:
            r9 = r4
        L_0x00d3:
            if (r9 != 0) goto L_0x00da
            u72 r0 = u72.c
        L_0x00d7:
            r14 = r0
            goto L_0x023f
        L_0x00da:
            bs r11 = new bs
            r11.<init>((int) r4)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            r15 = r4
        L_0x00e5:
            if (r15 >= r9) goto L_0x0230
            java.lang.String r0 = defpackage.jjd.M(r18)     // Catch:{ all -> 0x00ec }
            goto L_0x011c
        L_0x00ec:
            r0 = move-exception
            r4 = r0
            defpackage.udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x00f7:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x010a
            java.lang.Object r16 = r0.next()
            ny9 r16 = (defpackage.ny9) r16
            r16.getClass()
            defpackage.ny9.a(r4)
            goto L_0x00f7
        L_0x010a:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x011b
            if (r0 == r1) goto L_0x011a
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x011a:
            throw r4
        L_0x011b:
            r0 = r6
        L_0x011c:
            if (r0 != 0) goto L_0x0121
        L_0x011e:
            r4 = r1
            goto L_0x022a
        L_0x0121:
            java.lang.String r4 = "ALL_FILTER_EXCLUDE"
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L_0x01a8
            int r0 = defpackage.jjd.D(r18)     // Catch:{ all -> 0x012f }
            r4 = r0
            goto L_0x015f
        L_0x012f:
            r0 = move-exception
            r4 = r0
            defpackage.udd.S(r3, r2, r4)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x013a:
            boolean r16 = r0.hasNext()
            if (r16 == 0) goto L_0x014d
            java.lang.Object r16 = r0.next()
            ny9 r16 = (defpackage.ny9) r16
            r16.getClass()
            defpackage.ny9.a(r4)
            goto L_0x013a
        L_0x014d:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x015e
            if (r0 == r1) goto L_0x015d
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x015d:
            throw r4
        L_0x015e:
            r4 = 0
        L_0x015f:
            r6 = 0
        L_0x0160:
            if (r6 >= r4) goto L_0x011e
            java.lang.String r0 = defpackage.jjd.M(r18)     // Catch:{ all -> 0x016a }
            r17 = r4
            r4 = r1
            goto L_0x019e
        L_0x016a:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0175:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x0188
            java.lang.Object r17 = r0.next()
            ny9 r17 = (defpackage.ny9) r17
            r17.getClass()
            defpackage.ny9.a(r1)
            goto L_0x0175
        L_0x0188:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x019a
            r4 = 1
            if (r0 == r4) goto L_0x0199
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0199:
            throw r1
        L_0x019a:
            r17 = r4
            r4 = 1
            r0 = 0
        L_0x019e:
            if (r0 == 0) goto L_0x01a3
            r11.add(r0)
        L_0x01a3:
            int r6 = r6 + r4
            r1 = r4
            r4 = r17
            goto L_0x0160
        L_0x01a8:
            java.lang.String r1 = "FOLDERS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x01f5
            int r0 = defpackage.jjd.D(r18)     // Catch:{ all -> 0x01b5 }
            goto L_0x01e6
        L_0x01b5:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x01c0:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x01d3
            java.lang.Object r4 = r0.next()
            ny9 r4 = (defpackage.ny9) r4
            r4.getClass()
            defpackage.ny9.a(r1)
            goto L_0x01c0
        L_0x01d3:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x01e5
            r4 = 1
            if (r0 == r4) goto L_0x01e4
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x01e4:
            throw r1
        L_0x01e5:
            r0 = 0
        L_0x01e6:
            r1 = 0
        L_0x01e7:
            if (r1 >= r0) goto L_0x01f8
            s72 r4 = defpackage.jjd.s(r18)
            if (r4 == 0) goto L_0x01f2
            r14.add(r4)
        L_0x01f2:
            r4 = 1
            int r1 = r1 + r4
            goto L_0x01e7
        L_0x01f5:
            r18.z()     // Catch:{ all -> 0x01fa }
        L_0x01f8:
            r4 = 1
            goto L_0x022a
        L_0x01fa:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0205:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0218
            java.lang.Object r4 = r0.next()
            ny9 r4 = (defpackage.ny9) r4
            r4.getClass()
            defpackage.ny9.a(r1)
            goto L_0x0205
        L_0x0218:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x01f8
            r4 = 1
            if (r0 == r4) goto L_0x0229
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0229:
            throw r1
        L_0x022a:
            int r15 = r15 + r4
            r1 = r4
            r4 = 0
            r6 = 0
            goto L_0x00e5
        L_0x0230:
            u72 r0 = new u72
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r11)
            java.util.List r4 = java.util.Collections.unmodifiableList(r14)
            r0.<init>(r4, r1)
            goto L_0x00d7
        L_0x023f:
            r11 = r18
            r9 = r5
            goto L_0x03af
        L_0x0244:
            java.lang.String r1 = "chats"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x024e
            goto L_0x008d
        L_0x024e:
            int r0 = defpackage.jjd.K(r18)     // Catch:{ all -> 0x0254 }
            r1 = r0
            goto L_0x0285
        L_0x0254:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x025f:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0272
            java.lang.Object r4 = r0.next()
            ny9 r4 = (defpackage.ny9) r4
            r4.getClass()
            defpackage.ny9.a(r1)
            goto L_0x025f
        L_0x0272:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0284
            r4 = 1
            if (r0 == r4) goto L_0x0283
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0283:
            throw r1
        L_0x0284:
            r1 = 0
        L_0x0285:
            yr r12 = new yr
            r12.<init>(r1)
            r4 = 0
        L_0x028b:
            if (r4 >= r1) goto L_0x023f
            r9 = r5
            r5 = 0
            r11 = r18
            long r5 = defpackage.jjd.J(r11, r5)     // Catch:{ all -> 0x0297 }
            goto L_0x02c9
        L_0x0297:
            r0 = move-exception
            r15 = r0
            defpackage.udd.S(r3, r2, r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02a2:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x02b5
            java.lang.Object r17 = r0.next()
            ny9 r17 = (defpackage.ny9) r17
            r17.getClass()
            defpackage.ny9.a(r15)
            goto L_0x02a2
        L_0x02b5:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x02c7
            r5 = 1
            if (r0 == r5) goto L_0x02c6
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02c6:
            throw r15
        L_0x02c7:
            r5 = 0
        L_0x02c9:
            tn2 r0 = tn2.a(r18)     // Catch:{ all -> 0x02d0 }
            r17 = r1
            goto L_0x0303
        L_0x02d0:
            r0 = move-exception
            r15 = r0
            defpackage.udd.S(r3, r2, r15)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x02db:
            boolean r17 = r0.hasNext()
            if (r17 == 0) goto L_0x02ee
            java.lang.Object r17 = r0.next()
            ny9 r17 = (defpackage.ny9) r17
            r17.getClass()
            defpackage.ny9.a(r15)
            goto L_0x02db
        L_0x02ee:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x0300
            r1 = 1
            if (r0 == r1) goto L_0x02ff
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x02ff:
            throw r15
        L_0x0300:
            r17 = r1
            r0 = 0
        L_0x0303:
            if (r0 == 0) goto L_0x030f
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.Object r0 = r12.put(r1, r0)
            tn2 r0 = (tn2) r0
        L_0x030f:
            r1 = 1
            int r4 = r4 + r1
            r5 = r9
            r1 = r17
            goto L_0x028b
        L_0x0316:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "user"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0322
            goto L_0x0377
        L_0x0322:
            gze r13 = defpackage.ez3.U(r18)
            goto L_0x03af
        L_0x0328:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "hash"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0377
            java.lang.String r0 = defpackage.jjd.M(r18)     // Catch:{ all -> 0x033a }
            r10 = r0
            goto L_0x03af
        L_0x033a:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0345:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0358
            java.lang.Object r4 = r0.next()
            ny9 r4 = (defpackage.ny9) r4
            r4.getClass()
            defpackage.ny9.a(r1)
            goto L_0x0345
        L_0x0358:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x036a
            r4 = 1
            if (r0 == r4) goto L_0x0369
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0369:
            throw r1
        L_0x036a:
            r10 = 0
            goto L_0x03af
        L_0x036c:
            r11 = r18
            r9 = r5
            java.lang.String r1 = "server"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x03ab
        L_0x0377:
            r18.z()     // Catch:{ all -> 0x037b }
            goto L_0x03af
        L_0x037b:
            r0 = move-exception
            r1 = r0
            defpackage.udd.S(r3, r2, r1)
            java.util.concurrent.CopyOnWriteArraySet r0 = uzc.a
            java.util.Iterator r0 = r0.iterator()
        L_0x0386:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x0399
            java.lang.Object r4 = r0.next()
            ny9 r4 = (defpackage.ny9) r4
            r4.getClass()
            defpackage.ny9.a(r1)
            goto L_0x0386
        L_0x0399:
            int r0 = m4b.a
            int r0 = defpackage.hr1.t(r0)
            if (r0 == 0) goto L_0x03af
            r4 = 1
            if (r0 == r4) goto L_0x03aa
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x03aa:
            throw r1
        L_0x03ab:
            java.util.Map r7 = defpackage.ez3.X(r18)
        L_0x03af:
            r1 = 1
        L_0x03b0:
            int r8 = r8 + r1
            r5 = r9
            r4 = 0
            r6 = 0
            goto L_0x0048
        L_0x03b6:
            ra3 r0 = new ra3
            zzc r11 = new zzc
            r11.<init>(r7)
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wx3.y(ws8):ra3");
    }

    public static void z(Bundle bundle, Set set) {
        List list;
        udd.n("wx3", "onCreate");
        if (bundle.containsKey("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS") && (list = (List) bundle.get("ru.ok.tamtam.extra.EXTRA_UNHANDLED_EVENTS")) != null) {
            set.clear();
            set.addAll(list);
        }
    }

    public abstract void c();
}
