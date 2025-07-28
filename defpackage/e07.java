package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.text.InputFilter;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.TransformationMethod;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import androidx.media3.common.ParserException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* renamed from: e07  reason: default package */
public abstract class e07 {
    public static final int[] a = new int[0];
    public static final long[] b = new long[0];
    public static final Object[] c = new Object[0];
    public static final float[] d = new float[9];
    public static yte e;
    public static final Object f = new Object();

    public static final boolean A(tf3 tf3) {
        return tf3 == null || tf3.w();
    }

    public static final qod B(pj5 pj5, yb7 yb7) {
        return xs7.E(yb7, (hu3) null, (ru3) null, new xb7(yb7, new vb7(pj5, (Continuation) null), (Continuation) null), 3);
    }

    public static int C(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static int E(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final void F(BottomSheetWidget bottomSheetWidget, String str, i26 i26) {
        ef7 ef7 = (ef7) y8d.a.getAccessor().d(ef7.class).getValue();
        ef7.getClass();
        i26.invoke(new ik5(new u09(ef7.e(Uri.parse(str)), 8), 2), new l(19, bottomSheetWidget));
    }

    public static void G(float[] fArr, float f2) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, 0.0f);
        Matrix.rotateM(fArr, 0, f2, 0.0f, 0.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, 0.0f);
    }

    public static void H(float[] fArr) {
        Matrix.translateM(fArr, 0, 0.0f, 0.5f, 0.0f);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, 0.0f);
    }

    public static String I(long j) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(millis);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(millis - timeUnit2.toMillis(hours));
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((millis - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds))});
    }

    public static void J(rw3 rw3) {
        rw3.k = -3.4028235E38f;
        rw3.j = Integer.MIN_VALUE;
        CharSequence charSequence = rw3.a;
        if (charSequence instanceof Spanned) {
            if (!(charSequence instanceof Spannable)) {
                rw3.a = SpannableString.valueOf(charSequence);
            }
            CharSequence charSequence2 = rw3.a;
            charSequence2.getClass();
            Spannable spannable = (Spannable) charSequence2;
            for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
                if ((obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan)) {
                    spannable.removeSpan(obj);
                }
            }
        }
    }

    public static float K(float f2, int i, int i2, int i3) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i == 0) {
            f3 = (float) i3;
        } else if (i == 1) {
            f3 = (float) i2;
        } else if (i != 2) {
            return -3.4028235E38f;
        } else {
            return f2;
        }
        return f2 * f3;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [hu3, e0, mvf] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003d, code lost:
        if (kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5) == false) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object O(kotlin.coroutines.Continuation r5) {
        /*
            hu3 r0 = r5.getContext()
            defpackage.lp.m(r0)
            kotlin.coroutines.Continuation r5 = defpackage.urd.y(r5)
            boolean r1 = r5 instanceof kotlinx.coroutines.internal.DispatchedContinuation
            if (r1 == 0) goto L_0x0012
            kotlinx.coroutines.internal.DispatchedContinuation r5 = (kotlinx.coroutines.internal.DispatchedContinuation) r5
            goto L_0x0013
        L_0x0012:
            r5 = 0
        L_0x0013:
            pu3 r1 = defpackage.pu3.a
            jue r2 = defpackage.jue.a
            if (r5 != 0) goto L_0x001b
        L_0x0019:
            r5 = r2
            goto L_0x0040
        L_0x001b:
            ju3 r3 = r5.dispatcher
            boolean r3 = r3.isDispatchNeeded(r0)
            if (r3 == 0) goto L_0x0027
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            goto L_0x003f
        L_0x0027:
            mvf r3 = new mvf
            hk9 r4 = defpackage.mvf.b
            r3.<init>(r4)
            hu3 r0 = r0.plus(r3)
            r5.dispatchYield$kotlinx_coroutines_core(r0, r2)
            boolean r0 = r3.a
            if (r0 == 0) goto L_0x003f
            boolean r5 = kotlinx.coroutines.internal.DispatchedContinuationKt.yieldUndispatched(r5)
            if (r5 == 0) goto L_0x0019
        L_0x003f:
            r5 = r1
        L_0x0040:
            if (r5 != r1) goto L_0x0043
            return r5
        L_0x0043:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e07.O(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final yte a(Context context) {
        yte yte;
        yte yte2 = e;
        if (yte2 != null) {
            return yte2;
        }
        synchronized (f) {
            yte = new yte();
            e = yte;
        }
        return yte;
    }

    public static final byte[] b(String str) {
        try {
            return str.getBytes(Charset.forName("ASCII"));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("ASCII not found!", e2);
        }
    }

    public static final Object c(v63 v63, Continuation continuation) {
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        v63.i(new kic(zv1, 0));
        Object m = zv1.m();
        return m == pu3.a ? m : jue.a;
    }

    public static final Object d(dhd dhd, Continuation continuation) {
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        dhd.k(new kic(zv1, 1));
        return zv1.m();
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [bw9, k96, java.lang.Object] */
    public static final Object e(ms9 ms9, Continuation continuation) {
        zv1 zv1 = new zv1(1, urd.y(continuation));
        zv1.n();
        ? obj = new Object();
        obj.c = zv1;
        obj.a = 1;
        obj.Y = null;
        ms9.a(obj);
        return zv1.m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r10.right <= r12.left) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r10.top >= r12.bottom) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0041, code lost:
        if (r10.left >= r12.right) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r10.bottom <= r12.top) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean f(int r9, android.graphics.Rect r10, android.graphics.Rect r11, android.graphics.Rect r12) {
        /*
            boolean r0 = g(r9, r10, r11)
            boolean r1 = g(r9, r10, r12)
            r2 = 0
            if (r1 != 0) goto L_0x0078
            if (r0 != 0) goto L_0x000f
            goto L_0x0078
        L_0x000f:
            java.lang.String r0 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1 = 130(0x82, float:1.82E-43)
            r3 = 33
            r4 = 66
            r5 = 17
            r6 = 1
            if (r9 == r5) goto L_0x003d
            if (r9 == r3) goto L_0x0036
            if (r9 == r4) goto L_0x002f
            if (r9 != r1) goto L_0x0029
            int r7 = r10.bottom
            int r8 = r12.top
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0029:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x002f:
            int r7 = r10.right
            int r8 = r12.left
            if (r7 > r8) goto L_0x0077
            goto L_0x0043
        L_0x0036:
            int r7 = r10.top
            int r8 = r12.bottom
            if (r7 < r8) goto L_0x0077
            goto L_0x0043
        L_0x003d:
            int r7 = r10.left
            int r8 = r12.right
            if (r7 < r8) goto L_0x0077
        L_0x0043:
            if (r9 == r5) goto L_0x0077
            if (r9 != r4) goto L_0x0048
            goto L_0x0077
        L_0x0048:
            int r11 = C(r9, r10, r11)
            if (r9 == r5) goto L_0x006a
            if (r9 == r3) goto L_0x0065
            if (r9 == r4) goto L_0x0060
            if (r9 != r1) goto L_0x005a
            int r9 = r12.bottom
            int r10 = r10.bottom
        L_0x0058:
            int r9 = r9 - r10
            goto L_0x006f
        L_0x005a:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            r9.<init>(r0)
            throw r9
        L_0x0060:
            int r9 = r12.right
            int r10 = r10.right
            goto L_0x0058
        L_0x0065:
            int r9 = r10.top
            int r10 = r12.top
            goto L_0x0058
        L_0x006a:
            int r9 = r10.left
            int r10 = r12.left
            goto L_0x0058
        L_0x006f:
            int r9 = java.lang.Math.max(r6, r9)
            if (r11 >= r9) goto L_0x0076
            r2 = r6
        L_0x0076:
            return r2
        L_0x0077:
            return r6
        L_0x0078:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e07.f(int, android.graphics.Rect, android.graphics.Rect, android.graphics.Rect):boolean");
    }

    public static boolean g(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final int h(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final int i(int i, long j, long[] jArr) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static void j(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static void k(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void l(int i, String str, int i2, int i3) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        } else if (i > i3) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
        }
    }

    public static void m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    public static void n(int i, Object[] objArr) {
        int i2 = 0;
        while (i2 < i) {
            if (objArr[i2] != null) {
                i2++;
            } else {
                throw new NullPointerException(wn6.h(i2, "at index "));
            }
        }
    }

    public static void o(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(str));
        }
    }

    public static void p(String str, boolean z) {
        if (!z) {
            throw new IllegalStateException(str);
        }
    }

    public static Bitmap q(byte[] bArr, int i, BitmapFactory.Options options) {
        int i2 = 0;
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, i, options);
        if (decodeByteArray != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                v25 v25 = new v25((InputStream) byteArrayInputStream);
                byteArrayInputStream.close();
                switch (v25.e(1, "Orientation")) {
                    case 3:
                    case 4:
                        i2 = 180;
                        break;
                    case 5:
                    case 8:
                        i2 = 270;
                        break;
                    case 6:
                    case 7:
                        i2 = 90;
                        break;
                }
                if (i2 == 0) {
                    return decodeByteArray;
                }
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.postRotate((float) i2);
                return Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, false);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            throw ParserException.a(new IllegalStateException(), "Could not decode image data");
        }
        throw th;
    }

    public static void r(zq4 zq4) {
        if (zq4.equals(zq4.f)) {
            throw new RuntimeException("The specified dynamic range=" + zq4 + " is not supported yet", (Throwable) null);
        }
    }

    public static ApiException s(Status status) {
        return status.c != null ? new ApiException(status) : new ApiException(status);
    }

    public static float u(android.graphics.Matrix matrix) {
        double pow = Math.pow((double) v(matrix, 0), 2.0d);
        float[] fArr = d;
        matrix.getValues(fArr);
        return (float) Math.sqrt(Math.pow((double) fArr[3], 2.0d) + pow);
    }

    public static float v(android.graphics.Matrix matrix, int i) {
        float[] fArr = d;
        matrix.getValues(fArr);
        return fArr[i];
    }

    public static final boolean x(byte[] bArr, byte[] bArr2, int i) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        dz6 dz6 = new dz6(0, bArr2.length - 1, 1);
        if (!(dz6 instanceof Collection) || !((Collection) dz6).isEmpty()) {
            Iterator it = dz6.iterator();
            while (((ez6) it).c) {
                int a2 = ((ez6) it).a();
                if (bArr[i + a2] != bArr2[a2]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean y(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        } else if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        } else if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        } else if (i == 130) {
            int i8 = rect.top;
            int i9 = rect2.top;
            return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
    }

    public abstract vfd D(pfd pfd);

    public abstract void L(boolean z);

    public abstract void M(boolean z);

    public abstract TransformationMethod N(TransformationMethod transformationMethod);

    public abstract InputFilter[] t(InputFilter[] inputFilterArr);

    public abstract CharSequence w();

    public abstract boolean z();
}
