package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.Window;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONObject;
import ru.ok.android.api.json.JsonSyntaxException;

/* renamed from: gt0  reason: default package */
public abstract class gt0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final int[] b = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};
    public static final int[] c = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};
    public static final int[] d = {12445, 13120, 12344, 12344};
    public static final int[] e = {12445, 13632, 12344, 12344};
    public static final int[] f = {12344};
    public static final Object g = new Object();

    public static final String A(loa loa, String str) {
        cpa e2 = loa.e(str);
        if (!loa.m(e2)) {
            return null;
        }
        String replaceAll = Pattern.compile("^\\+\\d{1,3}\\s?|[\\(\\)]").matcher(loa.d(e2, 2)).replaceAll(BuildConfig.FLAVOR);
        Pattern compile = Pattern.compile("\\d");
        String replaceAll2 = compile.matcher(replaceAll).replaceAll(String.valueOf('X'));
        StringBuilder sb = new StringBuilder();
        int length = replaceAll2.length();
        int i = 1;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = replaceAll2.charAt(i2);
            if (charAt == 'X') {
                sb.append(i);
                i = (i + 1) % 10;
            } else {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static boolean B(String str) {
        String eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return eglQueryString != null && eglQueryString.contains(str);
    }

    public static boolean C() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0088, code lost:
        if (r9 != 11) goto L_0x0090;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x008d, code lost:
        if (r9 != 8) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.x3 F(defpackage.wx1 r9) {
        /*
            r0 = 16
            int r1 = r9.i(r0)
            int r0 = r9.i(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L_0x0018
            r0 = 24
            int r0 = r9.i(r0)
            r2 = 7
            goto L_0x0019
        L_0x0018:
            r2 = r3
        L_0x0019:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L_0x0021
            int r0 = r0 + 2
        L_0x0021:
            r1 = 2
            int r2 = r9.i(r1)
            r4 = 3
            if (r2 != r4) goto L_0x0032
        L_0x0029:
            r9.i(r1)
            boolean r2 = r9.h()
            if (r2 != 0) goto L_0x0029
        L_0x0032:
            r2 = 10
            int r2 = r9.i(r2)
            boolean r5 = r9.h()
            if (r5 == 0) goto L_0x0047
            int r5 = r9.i(r4)
            if (r5 <= 0) goto L_0x0047
            r9.t(r1)
        L_0x0047:
            boolean r5 = r9.h()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L_0x0055
            r5 = r7
            goto L_0x0056
        L_0x0055:
            r5 = r6
        L_0x0056:
            int r9 = r9.i(r3)
            int[] r8 = a
            if (r5 != r6) goto L_0x0065
            r6 = 13
            if (r9 != r6) goto L_0x0065
            r9 = r8[r9]
            goto L_0x0093
        L_0x0065:
            if (r5 != r7) goto L_0x0092
            r6 = 14
            if (r9 >= r6) goto L_0x0092
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 1
            r8 = 8
            if (r2 == r7) goto L_0x008b
            r7 = 11
            if (r2 == r1) goto L_0x0086
            if (r2 == r4) goto L_0x008b
            if (r2 == r3) goto L_0x007d
            goto L_0x0090
        L_0x007d:
            if (r9 == r4) goto L_0x0083
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
        L_0x0083:
            int r9 = r6 + 1
            goto L_0x0093
        L_0x0086:
            if (r9 == r8) goto L_0x0083
            if (r9 != r7) goto L_0x0090
            goto L_0x0083
        L_0x008b:
            if (r9 == r4) goto L_0x0083
            if (r9 != r8) goto L_0x0090
            goto L_0x0083
        L_0x0090:
            r9 = r6
            goto L_0x0093
        L_0x0092:
            r9 = 0
        L_0x0093:
            x3 r1 = new x3
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.F(wx1):x3");
    }

    public static b2b G(yze yze) {
        yze.I(1);
        int x = yze.x();
        long j = ((long) yze.b) + ((long) x);
        int i = x / 18;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long p = yze.p();
            if (p == -1) {
                jArr = Arrays.copyOf(jArr, i2);
                jArr2 = Arrays.copyOf(jArr2, i2);
                break;
            }
            jArr[i2] = p;
            jArr2[i2] = yze.p();
            yze.I(2);
            i2++;
        }
        yze.I((int) (j - ((long) yze.b)));
        return new b2b(jArr, jArr2, false, 18);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        r3 = defpackage.n1g.f(new defpackage.p9c(r3, r4, r5, (kotlin.coroutines.Continuation) null), r6);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object H(defpackage.pc7 r3, defpackage.ob7 r4, defpackage.i26 r5, kotlin.coroutines.Continuation r6) {
        /*
            ob7 r0 = defpackage.ob7.b
            if (r4 == r0) goto L_0x001d
            ob7 r0 = r3.d
            ob7 r1 = defpackage.ob7.a
            jue r2 = defpackage.jue.a
            if (r0 != r1) goto L_0x000d
            return r2
        L_0x000d:
            p9c r0 = new p9c
            r1 = 0
            r0.<init>(r3, r4, r5, r1)
            java.lang.Object r3 = defpackage.n1g.f(r0, r6)
            pu3 r4 = defpackage.pu3.a
            if (r3 != r4) goto L_0x001c
            return r3
        L_0x001c:
            return r2
        L_0x001d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state."
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gt0.H(pc7, ob7, i26, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void I(Runnable runnable) {
        if (C()) {
            runnable.run();
        } else {
            e07.p("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }

    public static void J(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            qrf.a(window, z);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility & -1793 : systemUiVisibility | 1792);
    }

    public static void K(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void L(d67 d67, Appendable appendable) {
        int S = d67.S();
        if (!(S == 34 || S == 49)) {
            boolean z = true;
            if (S == 91) {
                d67.a(appendable);
                while (d67.S() != 93) {
                    if (!z) {
                        d67.d(44);
                        d67.a(appendable);
                    }
                    L(d67, appendable);
                    z = false;
                }
                d67.a(appendable);
                return;
            } else if (!(S == 98 || S == 110)) {
                if (S == 123) {
                    d67.a(appendable);
                    while (d67.S() != 125) {
                        if (!z) {
                            d67.d(44);
                            d67.a(appendable);
                        }
                        d67.d(34);
                        d67.a(appendable);
                        d67.d(58);
                        d67.a(appendable);
                        L(d67, appendable);
                        z = false;
                    }
                    d67.a(appendable);
                    return;
                }
                throw JsonSyntaxException.b((long) d67.o, d67.m(), d67.S());
            }
        }
        d67.a(appendable);
    }

    public static ArrayList M(Collection collection, e26 e26) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object apply : collection) {
            arrayList.add((Bundle) e26.apply(apply));
        }
        return arrayList;
    }

    public static final File N(Uri uri) {
        if (hhd.f(uri.getScheme(), "file")) {
            String path = uri.getPath();
            if (path != null) {
                return new File(path);
            }
            throw new IllegalArgumentException(("Uri path is null: " + uri).toString());
        }
        throw new IllegalArgumentException(("Uri lacks 'file' scheme: " + uri).toString());
    }

    public static final void O(bve bve) {
        bve.c(z24.class, new y7b(29));
    }

    public static final void P(bve bve) {
        bve.c(z24.class, new w8d(7));
    }

    public static double a(JSONObject jSONObject, String str, double d2) {
        return jSONObject != null ? jSONObject.optDouble(str, d2) : d2;
    }

    public static boolean b(JSONObject jSONObject, String str, boolean z) {
        return jSONObject != null ? jSONObject.optBoolean(str, z) : z;
    }

    public static void d(int i, int i2) {
        boolean z = true;
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i3 = iArr[0];
        if (i3 <= 0) {
            z = false;
        }
        oyb.j("Create a OpenGL context first or run the GL methods on an OpenGL thread.", z);
        if (i < 0 || i2 < 0) {
            throw new Exception("width or height is less than 0");
        } else if (i > i3 || i2 > i3) {
            throw new Exception(wn6.h(i3, "width or height is greater than GL_MAX_TEXTURE_SIZE "));
        }
    }

    public static void e(int i, int i2, int i3) {
        GLES20.glBindTexture(i, i2);
        g();
        GLES20.glTexParameteri(i, 10240, i3);
        g();
        GLES20.glTexParameteri(i, 10241, i3);
        g();
        GLES20.glTexParameteri(i, 10242, 33071);
        g();
        GLES20.glTexParameteri(i, 10243, 33071);
        g();
    }

    public static void f(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            StringBuilder n = me4.n(str, ", error code: 0x");
            n.append(Integer.toHexString(eglGetError));
            throw new Exception(n.toString());
        }
    }

    public static void g() {
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                break;
            }
            if (z) {
                sb.append(10);
            }
            String gluErrorString = GLU.gluErrorString(glGetError);
            if (gluErrorString == null) {
                gluErrorString = "error code: 0x" + Integer.toHexString(glGetError);
            }
            sb.append("glError: ");
            sb.append(gluErrorString);
            z = true;
        }
        if (z) {
            throw new Exception(sb.toString());
        }
    }

    public static void h(String str, boolean z) {
        if (!z) {
            throw new Exception(str);
        }
    }

    public static void i() {
        e07.p("Not in application's main thread", C());
    }

    public static void j() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        g();
    }

    public static float[] k() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static EGLContext l(EGLContext eGLContext, EGLDisplay eGLDisplay, int i, int[] iArr) {
        boolean z = true;
        oyb.d(Arrays.equals(iArr, b) || Arrays.equals(iArr, c));
        if (!(i == 2 || i == 3)) {
            z = false;
        }
        oyb.d(z);
        EGLContext eglCreateContext = EGL14.eglCreateContext(eGLDisplay, y(eGLDisplay, iArr), eGLContext, new int[]{12440, i, 12344}, 0);
        if (eglCreateContext != null) {
            g();
            return eglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new Exception(wn6.h(i, "eglCreateContext() failed to create a valid context. The device may not support EGL version "));
    }

    public static EGLSurface m(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        EGLSurface eGLSurface;
        int[] iArr = b;
        if (B("EGL_KHR_surfaceless_context")) {
            eGLSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, y(eGLDisplay, iArr), new int[]{12375, 1, 12374, 1, 12344}, 0);
            f("Error creating a new EGL Pbuffer surface");
        }
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        f("Error making context current");
        t(0, 1, 1);
        return eGLSurface;
    }

    public static long n() {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        g();
        if (((long) iArr[0]) < 3) {
            return 0;
        }
        long glFenceSync = GLES30.glFenceSync(37143, 0);
        g();
        GLES20.glFlush();
        g();
        return glFenceSync;
    }

    public static float[] o(List list) {
        float[] fArr = new float[(list.size() * 4)];
        for (int i = 0; i < list.size(); i++) {
            System.arraycopy(list.get(i), 0, fArr, i * 4, 4);
        }
        return fArr;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [nj4, java.lang.Object] */
    public static final nj4 p(s16 s16) {
        lhd lhd = new lhd(24, new wwc(10, s16));
        ? obj = new Object();
        obj.b = nj4.c;
        obj.a = lhd;
        return obj;
    }

    public static String q(ku1 ku1, Integer num, List list) {
        if (num == null || !list.contains("0") || !list.contains("1")) {
            return null;
        }
        if (num.intValue() == 1) {
            if (((Integer) ku1.a("0").a(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                return "1";
            }
            return null;
        } else if (num.intValue() == 0 && ((Integer) ku1.a("1").a(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
            return "0";
        } else {
            return null;
        }
    }

    public static void r(EGLContext eGLContext, EGLDisplay eGLDisplay) {
        if (eGLDisplay != null) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            f("Error releasing context");
            if (eGLContext != null) {
                EGL14.eglDestroyContext(eGLDisplay, eGLContext);
                f("Error destroying context");
            }
            EGL14.eglReleaseThread();
            f("Error releasing thread");
            EGL14.eglTerminate(eGLDisplay);
            f("Error terminating display");
        }
    }

    public static final boolean s(og6 og6, og6 og62) {
        if (og6.g() != og62.g() || og6.h() != og62.h() || og6.i().size() != og62.i().size()) {
            return false;
        }
        int size = og6.i().size();
        for (int i = 0; i < size; i++) {
            yx2 yx2 = (yx2) og6.i().get(i);
            yx2 yx22 = (yx2) og62.i().get(i);
            if (yx2.a() != yx22.a() || yx2.b() != yx22.b()) {
                return false;
            }
        }
        return true;
    }

    public static void t(int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i) {
            GLES20.glBindFramebuffer(36160, i);
        }
        g();
        GLES20.glViewport(0, 0, i2, i3);
        g();
    }

    public static final String u(loa loa, String str, String str2, String str3, int i) {
        try {
            cpa t = loa.t(str3, str2);
            if (loa.m(t)) {
                str2 = loa.d(t, 2);
            }
        } catch (NumberParseException unused) {
        }
        if (h0e.y0(str.length(), str2).equals(str)) {
            str2 = str2.substring(str.length(), str2.length());
        }
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            char charAt = str2.charAt(i3);
            if (i2 == i) {
                break;
            }
            sb.append(charAt);
            if (PhoneNumberUtils.isNonSeparator(charAt)) {
                i2++;
            }
        }
        return h0e.B0(sb.toString()).toString();
    }

    public static e8c v(e26 e26, List list) {
        ts6 i = ws6.i();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Bundle bundle = (Bundle) list.get(i2);
            bundle.getClass();
            i.a(e26.apply(bundle));
        }
        return i.j();
    }

    public static void w(int i, ija ija) {
        ija.D(7);
        byte[] bArr = ija.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static EGLDisplay x() {
        EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
        h("No EGL display.", !eglGetDisplay.equals(EGL14.EGL_NO_DISPLAY));
        h("Error in eglInitialize.", EGL14.eglInitialize(eglGetDisplay, new int[1], 0, new int[1], 0));
        g();
        return eglGetDisplay;
    }

    public static EGLConfig y(EGLDisplay eGLDisplay, int[] iArr) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new Exception("eglChooseConfig failed.");
    }

    public static final int z(loa loa, String str) {
        cpa e2 = loa.e(str);
        if (!loa.m(e2)) {
            return Integer.MAX_VALUE;
        }
        String d2 = loa.d(e2, 1);
        int i = e2.a;
        return h0e.B0(h0e.k0(d2, "+" + i)).toString().length();
    }

    public abstract void D();

    public void E() {
    }

    public abstract gt0 c(Object obj);
}
