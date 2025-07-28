package defpackage;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import com.google.android.exoplayer2.ParserException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ScopeCoroutine;
import one.me.common.drawable.SavedMessagesIconDrawable;

/* renamed from: d8  reason: default package */
public abstract class d8 {
    public static final Object b = null;
    public static final int[] c = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] d = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};
    public static final x3a e = new x3a(28, (Object) "SYSTRACE");
    public final /* synthetic */ int a;

    public /* synthetic */ d8(int i) {
        this.a = i;
    }

    public static void A(File file, File file2) {
        file.getClass();
        file2.delete();
        if (!file.renameTo(file2)) {
            Throwable fileNotFoundException = !file2.exists() ? file.getParentFile().exists() ? !file.exists() ? new FileNotFoundException(file.getAbsolutePath()) : null : new FileNotFoundException(file.getAbsolutePath()) : new IOException(file2.getAbsolutePath());
            IOException iOException = new IOException("Unknown error renaming " + file.getAbsolutePath() + " to " + file2.getAbsolutePath());
            iOException.initCause(fileNotFoundException);
            throw iOException;
        }
    }

    public static void B(Activity activity, String[] strArr, int i) {
        HashSet hashSet = new HashSet();
        int i2 = 0;
        while (i2 < strArr.length) {
            if (!TextUtils.isEmpty(strArr[i2])) {
                if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(strArr[i2], "android.permission.POST_NOTIFICATIONS")) {
                    hashSet.add(Integer.valueOf(i2));
                }
                i2++;
            } else {
                throw new IllegalArgumentException(wn6.l(new StringBuilder("Permission request for permissions "), Arrays.toString(strArr), " must not contain null or empty values"));
            }
        }
        int size = hashSet.size();
        String[] strArr2 = size > 0 ? new String[(strArr.length - size)] : strArr;
        if (size > 0) {
            if (size != strArr.length) {
                int i3 = 0;
                for (int i4 = 0; i4 < strArr.length; i4++) {
                    if (!hashSet.contains(Integer.valueOf(i4))) {
                        strArr2[i3] = strArr[i4];
                        i3++;
                    }
                }
            } else {
                return;
            }
        }
        if (activity instanceof c8) {
            ((c8) activity).getClass();
        }
        z7.b(activity, strArr, i);
    }

    public static long C(long j, long j2) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j2) + Long.numberOfLeadingZeros(j2) + Long.numberOfLeadingZeros(~j) + Long.numberOfLeadingZeros(j);
        if (numberOfLeadingZeros > 65) {
            return j * j2;
        }
        long j3 = ((j ^ j2) >>> 63) + Long.MAX_VALUE;
        boolean z = false;
        boolean z2 = numberOfLeadingZeros < 64;
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        boolean z3 = i < 0;
        if (j2 == Long.MIN_VALUE) {
            z = true;
        }
        if (z2 || (z & z3)) {
            return j3;
        }
        long j4 = j * j2;
        return (i == 0 || j4 / j == j2) ? j4 : j3;
    }

    public static sz0 D(int i, q74 q74, yze yze) {
        sz0 b2 = sz0.b(q74, yze);
        while (true) {
            int i2 = b2.b;
            if (i2 == i) {
                return b2;
            }
            long j = b2.c + 8;
            if (j <= 2147483647L) {
                q74.z((int) j);
                b2 = sz0.b(q74, yze);
            } else {
                StringBuilder sb = new StringBuilder(51);
                sb.append("Chunk is too large (~2GB+) to skip; id: ");
                sb.append(i2);
                throw ParserException.c(sb.toString());
            }
        }
    }

    public static Bitmap E(Drawable drawable, int i, int i2) {
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return (i == bitmapDrawable.getBitmap().getWidth() && i2 == bitmapDrawable.getBitmap().getHeight()) ? bitmapDrawable.getBitmap() : Bitmap.createScaledBitmap(bitmapDrawable.getBitmap(), i, i2, true);
            }
            throw new IllegalArgumentException("bitmap is null");
        }
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(new Canvas(createBitmap));
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public static final String F(int i, long j) {
        if (j >= 0) {
            iu7.f(i);
            return Long.toString(j, i);
        }
        long j2 = (long) i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        iu7.f(i);
        String l = Long.toString(j3, i);
        iu7.f(i);
        return l.concat(Long.toString(j4, i));
    }

    public static void G(RippleDrawable rippleDrawable, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = rippleDrawable.getBounds().left;
        }
        if ((i4 & 2) != 0) {
            i2 = rippleDrawable.getBounds().top;
        }
        int i5 = rippleDrawable.getBounds().right;
        if ((i4 & 8) != 0) {
            i3 = rippleDrawable.getBounds().bottom;
        }
        rippleDrawable.setBounds(i, i2, i5, i3);
    }

    public static final void H(bve bve) {
        bve.e(xg9.class, new xpc(24));
        bve.e(hsd.class, new xpc(25));
        bve.e(ye1.class, new xpc(26));
        bve.e(xr7.class, new xpc(27));
        bve.e(uma.class, new xpc(28));
        bve.e(mna.class, new xpc(29));
        bve.e(gg0.class, new vrd(0));
        bve.e(iq1.class, new vrd(1));
        bve.e(iff.class, new vrd(2));
        bve.e(tif.class, new xpc(22));
        bve.e(bo8.class, new xpc(23));
    }

    public static int I(Intent intent, int i) {
        boolean z = (33554432 & i) != 0;
        if (Build.VERSION.SDK_INT < 34) {
            return i;
        }
        String str = intent.getPackage();
        return ((str == null || str.length() == 0 || intent.getComponent() == null) && z) ? i | 16777216 : i;
    }

    public static final String a(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (j2 - (60000 * j3)) / ((long) 1000);
        if (hours > 0) {
            return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j4)}, 2));
        }
        return String.format(j3 + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
    }

    public static final String b(long j) {
        long hours = TimeUnit.MILLISECONDS.toHours(j);
        long j2 = j - (3600000 * hours);
        long j3 = j2 / 60000;
        long j4 = (long) 1000;
        long j5 = (j2 - (60000 * j3)) / j4;
        long j6 = (j % j4) / ((long) 10);
        if (hours <= 0) {
            return String.format("%02d:%02d,%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        }
        return String.format(hours + ":%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
    }

    public static boolean c(q74 q74) {
        yze yze = new yze(8);
        int i = sz0.b(q74, yze).b;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        q74.r(yze.a, 0, 4, false);
        yze.H(0);
        return yze.h() == 1463899717;
    }

    public static int d(Context context, String str) {
        if (str != null) {
            return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : cp9.a(new ip9(context).b) ? 0 : -1;
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static long e(long j, long j2) {
        long j3 = j + j2;
        boolean z = false;
        boolean z2 = (j ^ j2) < 0;
        if ((j ^ j3) >= 0) {
            z = true;
        }
        if (z2 || z) {
            return j3;
        }
        throw new ArithmeticException(wn6.k(hr1.k(j, "overflow: checkedAdd(", ", "), j2, ")"));
    }

    public static final void f(AutoCloseable autoCloseable, Throwable th) {
        if (autoCloseable == null) {
            return;
        }
        if (th == null) {
            autoCloseable.close();
            return;
        }
        try {
            autoCloseable.close();
        } catch (Throwable th2) {
            jjd.d(th, th2);
        }
    }

    public static final Object g(rj5 rj5, s16 s16, k26 k26, Continuation continuation, pj5[] pj5Arr) {
        o33 o33 = new o33(rj5, s16, k26, (Continuation) null, pj5Arr);
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(continuation.getContext(), continuation);
        Object D = h2g.D(scopeCoroutine, scopeCoroutine, o33);
        return D == pu3.a ? D : jue.a;
    }

    public static long j(long j, long j2, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j3 = j / j2;
        long j4 = j - (j2 * j3);
        int i = (j4 > 0 ? 1 : (j4 == 0 ? 0 : -1));
        if (i == 0) {
            return j3;
        }
        int i2 = ((int) ((j ^ j2) >> 63)) | 1;
        switch (nq7.a[roundingMode.ordinal()]) {
            case 1:
                if (i == 0) {
                    return j3;
                }
                throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
            case 2:
                return j3;
            case 3:
                if (i2 >= 0) {
                    return j3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i2 <= 0) {
                    return j3;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j4);
                int i3 = ((abs - (Math.abs(j2) - abs)) > 0 ? 1 : ((abs - (Math.abs(j2) - abs)) == 0 ? 0 : -1));
                if (i3 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j3) == 0)) {
                        return j3;
                    }
                } else if (i3 <= 0) {
                    return j3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j3 + ((long) i2);
    }

    public static p7 k(i39 i39) {
        long j;
        i39 i392 = i39;
        i392.m(4);
        int readUnsignedShort = i39.readUnsignedShort();
        if (readUnsignedShort <= 100) {
            i392.m(6);
            int i = 0;
            while (true) {
                if (i >= readUnsignedShort) {
                    j = -1;
                    break;
                }
                int k = i39.k();
                i392.m(4);
                j = i39.s();
                i392.m(4);
                if (1835365473 == k) {
                    break;
                }
                i++;
            }
            if (j != -1) {
                i392.m((int) (j - i39.g()));
                i392.m(12);
                long s = i39.s();
                for (int i2 = 0; ((long) i2) < s; i2++) {
                    int k2 = i39.k();
                    long s2 = i39.s();
                    long s3 = i39.s();
                    if (1164798569 == k2 || 1701669481 == k2) {
                        return new p7(s2 + j, s3, 7);
                    }
                }
            }
            throw new IOException("Cannot read metadata.");
        }
        throw new IOException("Cannot read metadata.");
    }

    public static final int l(int i) {
        return (Build.VERSION.SDK_INT < 31 || (67108864 & i) != 0) ? i : i | 33554432;
    }

    public static final int m(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        if (z2) {
            z |= true;
        }
        if (z3) {
            z |= true;
        }
        if (z4) {
            z |= true;
        }
        if (z5) {
            z |= true;
        }
        boolean z11 = z | true;
        if (z6) {
            z11 = z | true;
        }
        if (z7) {
            z11 |= true;
        }
        if (z8) {
            z11 |= true;
        }
        if (z9) {
            z11 |= true;
        }
        if (z10) {
            z11 |= true;
        }
        if (!z11) {
            return -1;
        }
        return z11 ? 1 : 0;
    }

    public static long n(long j, long j2) {
        a06.l(j, "a");
        a06.l(j2, "b");
        if (j == 0) {
            return j2;
        }
        if (j2 == 0) {
            return j;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j);
        long j3 = j >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j2);
        long j4 = j2 >> numberOfTrailingZeros2;
        while (j3 != j4) {
            long j5 = j3 - j4;
            long j6 = (j5 >> 63) & j5;
            long j7 = (j5 - j6) - j6;
            j4 += j6;
            j3 = j7 >> Long.numberOfTrailingZeros(j7);
        }
        return j3 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.be6 o(javax.net.ssl.SSLSession r6) {
        /*
            hw4 r0 = defpackage.hw4.a
            java.lang.String r1 = r6.getCipherSuite()
            if (r1 == 0) goto L_0x0090
            int r2 = r1.hashCode()
            r3 = 1019404634(0x3cc2e15a, float:0.023789097)
            if (r2 == r3) goto L_0x0020
            r3 = 1208658923(0x480aabeb, float:141999.67)
            if (r2 == r3) goto L_0x0017
            goto L_0x0028
        L_0x0017:
            java.lang.String r2 = "SSL_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
            goto L_0x0028
        L_0x0020:
            java.lang.String r2 = "TLS_NULL_WITH_NULL_NULL"
            boolean r2 = r1.equals(r2)
            if (r2 != 0) goto L_0x0084
        L_0x0028:
            gk9 r2 = defpackage.ky2.t
            ky2 r1 = r2.f(r1)
            java.lang.String r2 = r6.getProtocol()
            if (r2 == 0) goto L_0x0078
            java.lang.String r3 = "NONE"
            boolean r3 = r3.equals(r2)
            if (r3 != 0) goto L_0x0070
            jle r2 = defpackage.a24.A(r2)
            java.security.cert.Certificate[] r3 = r6.getPeerCertificates()     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            if (r3 == 0) goto L_0x0052
            int r4 = r3.length     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.security.cert.Certificate[] r3 = (java.security.cert.Certificate[]) r3     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            java.util.List r3 = defpackage.nze.k(r3)     // Catch:{ SSLPeerUnverifiedException -> 0x0052 }
            goto L_0x0053
        L_0x0052:
            r3 = r0
        L_0x0053:
            be6 r4 = new be6
            java.security.cert.Certificate[] r6 = r6.getLocalCertificates()
            if (r6 == 0) goto L_0x0066
            int r0 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.security.cert.Certificate[] r6 = (java.security.cert.Certificate[]) r6
            java.util.List r0 = defpackage.nze.k(r6)
        L_0x0066:
            ke r6 = new ke
            r5 = 3
            r6.<init>((int) r5, (java.lang.Object) r3)
            r4.<init>(r2, r1, r0, r6)
            return r4
        L_0x0070:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "tlsVersion == NONE"
            r6.<init>(r0)
            throw r6
        L_0x0078:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "tlsVersion == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L_0x0084:
            java.io.IOException r6 = new java.io.IOException
            java.lang.String r0 = "cipherSuite == "
            java.lang.String r0 = r0.concat(r1)
            r6.<init>(r0)
            throw r6
        L_0x0090:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "cipherSuite == null"
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8.o(javax.net.ssl.SSLSession):be6");
    }

    public static final PendingIntent p(Context context, int i, Intent intent) {
        return PendingIntent.getActivity(context, i, intent, I(intent, l(134217728)));
    }

    public static final int q(int i) {
        if (i == 0 || i == 1) {
            return 0;
        }
        if (i == 3) {
            return 180;
        }
        if (i != 6) {
            return i != 8 ? 0 : 270;
        }
        return 90;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (r5.c == r8.hashCode()) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.content.res.ColorStateList r(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            rbc r1 = new rbc
            r1.<init>(r0, r8)
            java.lang.Object r2 = defpackage.ubc.c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = defpackage.ubc.b     // Catch:{ all -> 0x003c }
            java.lang.Object r3 = r3.get(r1)     // Catch:{ all -> 0x003c }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x003c }
            r4 = 0
            if (r3 == 0) goto L_0x0050
            int r5 = r3.size()     // Catch:{ all -> 0x003c }
            if (r5 <= 0) goto L_0x0050
            java.lang.Object r5 = r3.get(r9)     // Catch:{ all -> 0x003c }
            qbc r5 = (defpackage.qbc) r5     // Catch:{ all -> 0x003c }
            if (r5 == 0) goto L_0x0050
            android.content.res.Configuration r6 = r5.b     // Catch:{ all -> 0x003c }
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch:{ all -> 0x003c }
            boolean r6 = r6.equals(r7)     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x004d
            if (r8 != 0) goto L_0x003f
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            if (r6 == 0) goto L_0x0049
            goto L_0x003f
        L_0x003c:
            r8 = move-exception
            goto L_0x00b0
        L_0x003f:
            if (r8 == 0) goto L_0x004d
            int r6 = r5.c     // Catch:{ all -> 0x003c }
            int r7 = r8.hashCode()     // Catch:{ all -> 0x003c }
            if (r6 != r7) goto L_0x004d
        L_0x0049:
            android.content.res.ColorStateList r3 = r5.a     // Catch:{ all -> 0x003c }
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            goto L_0x0052
        L_0x004d:
            r3.remove(r9)     // Catch:{ all -> 0x003c }
        L_0x0050:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            r3 = r4
        L_0x0052:
            if (r3 == 0) goto L_0x0055
            goto L_0x00af
        L_0x0055:
            java.lang.ThreadLocal r2 = defpackage.ubc.a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L_0x0067
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L_0x0067:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L_0x0076
            r3 = 31
            if (r2 > r3) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = defpackage.i33.a(r0, r2, r8)     // Catch:{ Exception -> 0x007e }
        L_0x007e:
            if (r4 == 0) goto L_0x00ab
            java.lang.Object r2 = defpackage.ubc.c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = defpackage.ubc.b     // Catch:{ all -> 0x0096 }
            java.lang.Object r3 = r0.get(r1)     // Catch:{ all -> 0x0096 }
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch:{ all -> 0x0096 }
            if (r3 != 0) goto L_0x0098
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch:{ all -> 0x0096 }
            r3.<init>()     // Catch:{ all -> 0x0096 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0096 }
            goto L_0x0098
        L_0x0096:
            r8 = move-exception
            goto L_0x00a9
        L_0x0098:
            qbc r0 = new qbc     // Catch:{ all -> 0x0096 }
            android.content.res.Resources r1 = r1.a     // Catch:{ all -> 0x0096 }
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch:{ all -> 0x0096 }
            r0.<init>(r4, r1, r8)     // Catch:{ all -> 0x0096 }
            r3.append(r9, r0)     // Catch:{ all -> 0x0096 }
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            r3 = r4
            goto L_0x00af
        L_0x00a9:
            monitor-exit(r2)     // Catch:{ all -> 0x0096 }
            throw r8
        L_0x00ab:
            android.content.res.ColorStateList r3 = defpackage.pbc.b(r0, r9, r8)
        L_0x00af:
            return r3
        L_0x00b0:
            monitor-exit(r2)     // Catch:{ all -> 0x003c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d8.r(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static HashMap s() {
        HashMap hashMap = new HashMap(286);
        ArrayList arrayList = new ArrayList(25);
        arrayList.add("US");
        arrayList.add("AG");
        arrayList.add("AI");
        arrayList.add("AS");
        arrayList.add("BB");
        arrayList.add("BM");
        arrayList.add("BS");
        arrayList.add("CA");
        arrayList.add("DM");
        arrayList.add("DO");
        arrayList.add("GD");
        arrayList.add("GU");
        arrayList.add("JM");
        arrayList.add("KN");
        arrayList.add("KY");
        arrayList.add("LC");
        arrayList.add("MP");
        arrayList.add("MS");
        arrayList.add("PR");
        arrayList.add("SX");
        arrayList.add("TC");
        arrayList.add("TT");
        arrayList.add("VC");
        arrayList.add("VG");
        arrayList.add("VI");
        hashMap.put(1, arrayList);
        ArrayList arrayList2 = new ArrayList(2);
        arrayList2.add("RU");
        arrayList2.add("KZ");
        ArrayList h = th2.h(36, hashMap, th2.h(34, hashMap, th2.h(33, hashMap, th2.h(32, hashMap, th2.h(31, hashMap, th2.h(30, hashMap, th2.h(27, hashMap, th2.h(20, hashMap, th2.h(7, hashMap, arrayList2, 1, "EG"), 1, "ZA"), 1, "GR"), 1, "NL"), 1, "BE"), 1, "FR"), 1, "ES"), 1, "HU"), 2, "IT");
        h.add("VA");
        hashMap.put(39, h);
        ArrayList arrayList3 = new ArrayList(1);
        arrayList3.add("RO");
        ArrayList h2 = th2.h(43, hashMap, th2.h(41, hashMap, th2.h(40, hashMap, arrayList3, 1, "CH"), 1, "AT"), 4, "GB");
        h2.add("GG");
        h2.add("IM");
        h2.add("JE");
        hashMap.put(44, h2);
        ArrayList arrayList4 = new ArrayList(1);
        arrayList4.add("DK");
        ArrayList h3 = th2.h(46, hashMap, th2.h(45, hashMap, arrayList4, 1, "SE"), 2, "NO");
        h3.add("SJ");
        hashMap.put(47, h3);
        ArrayList arrayList5 = new ArrayList(1);
        arrayList5.add("PL");
        ArrayList h4 = th2.h(60, hashMap, th2.h(58, hashMap, th2.h(57, hashMap, th2.h(56, hashMap, th2.h(55, hashMap, th2.h(54, hashMap, th2.h(53, hashMap, th2.h(52, hashMap, th2.h(51, hashMap, th2.h(49, hashMap, th2.h(48, hashMap, arrayList5, 1, "DE"), 1, "PE"), 1, "MX"), 1, "CU"), 1, "AR"), 1, "BR"), 1, "CL"), 1, "CO"), 1, "VE"), 1, "MY"), 3, "AU");
        h4.add("CC");
        h4.add("CX");
        hashMap.put(61, h4);
        ArrayList arrayList6 = new ArrayList(1);
        arrayList6.add("ID");
        ArrayList h5 = th2.h(211, hashMap, th2.h(98, hashMap, th2.h(95, hashMap, th2.h(94, hashMap, th2.h(93, hashMap, th2.h(92, hashMap, th2.h(91, hashMap, th2.h(90, hashMap, th2.h(86, hashMap, th2.h(84, hashMap, th2.h(82, hashMap, th2.h(81, hashMap, th2.h(66, hashMap, th2.h(65, hashMap, th2.h(64, hashMap, th2.h(63, hashMap, th2.h(62, hashMap, arrayList6, 1, "PH"), 1, "NZ"), 1, "SG"), 1, "TH"), 1, "JP"), 1, "KR"), 1, "VN"), 1, "CN"), 1, "TR"), 1, "IN"), 1, "PK"), 1, "AF"), 1, "LK"), 1, "MM"), 1, "IR"), 1, "SS"), 2, "MA");
        h5.add("EH");
        hashMap.put(212, h5);
        ArrayList arrayList7 = new ArrayList(1);
        arrayList7.add("DZ");
        ArrayList h6 = th2.h(261, hashMap, th2.h(260, hashMap, th2.h(258, hashMap, th2.h(257, hashMap, th2.h(256, hashMap, th2.h(255, hashMap, th2.h(254, hashMap, th2.h(253, hashMap, th2.h(252, hashMap, th2.h(251, hashMap, th2.h(250, hashMap, th2.h(249, hashMap, th2.h(248, hashMap, th2.h(247, hashMap, th2.h(246, hashMap, th2.h(245, hashMap, th2.h(244, hashMap, th2.h(243, hashMap, th2.h(242, hashMap, th2.h(241, hashMap, th2.h(240, hashMap, th2.h(239, hashMap, th2.h(238, hashMap, th2.h(237, hashMap, th2.h(236, hashMap, th2.h(235, hashMap, th2.h(234, hashMap, th2.h(233, hashMap, th2.h(232, hashMap, th2.h(231, hashMap, th2.h(230, hashMap, th2.h(229, hashMap, th2.h(228, hashMap, th2.h(227, hashMap, th2.h(226, hashMap, th2.h(225, hashMap, th2.h(224, hashMap, th2.h(223, hashMap, th2.h(222, hashMap, th2.h(221, hashMap, th2.h(220, hashMap, th2.h(218, hashMap, th2.h(216, hashMap, th2.h(213, hashMap, arrayList7, 1, "TN"), 1, "LY"), 1, "GM"), 1, "SN"), 1, "MR"), 1, "ML"), 1, "GN"), 1, "CI"), 1, "BF"), 1, "NE"), 1, "TG"), 1, "BJ"), 1, "MU"), 1, "LR"), 1, "SL"), 1, "GH"), 1, "NG"), 1, "TD"), 1, "CF"), 1, "CM"), 1, "CV"), 1, "ST"), 1, "GQ"), 1, "GA"), 1, "CG"), 1, "CD"), 1, "AO"), 1, "GW"), 1, "IO"), 1, "AC"), 1, "SC"), 1, "SD"), 1, "RW"), 1, "ET"), 1, "SO"), 1, "DJ"), 1, "KE"), 1, "TZ"), 1, "UG"), 1, "BI"), 1, "MZ"), 1, "ZM"), 1, "MG"), 2, "RE");
        h6.add("YT");
        hashMap.put(262, h6);
        ArrayList arrayList8 = new ArrayList(1);
        arrayList8.add("ZW");
        ArrayList h7 = th2.h(269, hashMap, th2.h(268, hashMap, th2.h(267, hashMap, th2.h(266, hashMap, th2.h(265, hashMap, th2.h(264, hashMap, th2.h(263, hashMap, arrayList8, 1, "NA"), 1, "MW"), 1, "LS"), 1, "BW"), 1, "SZ"), 1, "KM"), 2, "SH");
        h7.add("TA");
        hashMap.put(290, h7);
        ArrayList arrayList9 = new ArrayList(1);
        arrayList9.add("ER");
        ArrayList h8 = th2.h(357, hashMap, th2.h(356, hashMap, th2.h(355, hashMap, th2.h(354, hashMap, th2.h(353, hashMap, th2.h(352, hashMap, th2.h(351, hashMap, th2.h(350, hashMap, th2.h(299, hashMap, th2.h(298, hashMap, th2.h(297, hashMap, th2.h(291, hashMap, arrayList9, 1, "AW"), 1, "FO"), 1, "GL"), 1, "GI"), 1, "PT"), 1, "LU"), 1, "IE"), 1, "IS"), 1, "AL"), 1, "MT"), 1, "CY"), 2, "FI");
        h8.add("AX");
        hashMap.put(358, h8);
        ArrayList arrayList10 = new ArrayList(1);
        arrayList10.add("BG");
        ArrayList h9 = th2.h(509, hashMap, th2.h(508, hashMap, th2.h(507, hashMap, th2.h(506, hashMap, th2.h(505, hashMap, th2.h(504, hashMap, th2.h(503, hashMap, th2.h(502, hashMap, th2.h(501, hashMap, th2.h(500, hashMap, th2.h(423, hashMap, th2.h(421, hashMap, th2.h(420, hashMap, th2.h(389, hashMap, th2.h(387, hashMap, th2.h(386, hashMap, th2.h(385, hashMap, th2.h(383, hashMap, th2.h(382, hashMap, th2.h(381, hashMap, th2.h(380, hashMap, th2.h(378, hashMap, th2.h(377, hashMap, th2.h(376, hashMap, th2.h(375, hashMap, th2.h(374, hashMap, th2.h(373, hashMap, th2.h(372, hashMap, th2.h(371, hashMap, th2.h(370, hashMap, th2.h(359, hashMap, arrayList10, 1, "LT"), 1, "LV"), 1, "EE"), 1, "MD"), 1, "AM"), 1, "BY"), 1, "AD"), 1, "MC"), 1, "SM"), 1, "UA"), 1, "RS"), 1, "ME"), 1, "XK"), 1, "HR"), 1, "SI"), 1, "BA"), 1, "MK"), 1, "CZ"), 1, "SK"), 1, "LI"), 1, "FK"), 1, "BZ"), 1, "GT"), 1, "SV"), 1, "HN"), 1, "NI"), 1, "CR"), 1, "PA"), 1, "PM"), 1, "HT"), 3, "GP");
        h9.add("BL");
        h9.add("MF");
        hashMap.put(590, h9);
        ArrayList arrayList11 = new ArrayList(1);
        arrayList11.add("BO");
        ArrayList h10 = th2.h(598, hashMap, th2.h(597, hashMap, th2.h(596, hashMap, th2.h(595, hashMap, th2.h(594, hashMap, th2.h(593, hashMap, th2.h(592, hashMap, th2.h(591, hashMap, arrayList11, 1, "GY"), 1, "EC"), 1, "GF"), 1, "PY"), 1, "MQ"), 1, "SR"), 1, "UY"), 2, "CW");
        h10.add("BQ");
        hashMap.put(599, h10);
        ArrayList arrayList12 = new ArrayList(1);
        arrayList12.add("TL");
        hashMap.put(998, th2.h(996, hashMap, th2.h(995, hashMap, th2.h(994, hashMap, th2.h(993, hashMap, th2.h(992, hashMap, th2.h(979, hashMap, th2.h(977, hashMap, th2.h(976, hashMap, th2.h(975, hashMap, th2.h(974, hashMap, th2.h(973, hashMap, th2.h(972, hashMap, th2.h(971, hashMap, th2.h(970, hashMap, th2.h(968, hashMap, th2.h(967, hashMap, th2.h(966, hashMap, th2.h(965, hashMap, th2.h(964, hashMap, th2.h(963, hashMap, th2.h(962, hashMap, th2.h(961, hashMap, th2.h(960, hashMap, th2.h(888, hashMap, th2.h(886, hashMap, th2.h(883, hashMap, th2.h(882, hashMap, th2.h(881, hashMap, th2.h(880, hashMap, th2.h(878, hashMap, th2.h(870, hashMap, th2.h(856, hashMap, th2.h(855, hashMap, th2.h(853, hashMap, th2.h(852, hashMap, th2.h(850, hashMap, th2.h(808, hashMap, th2.h(800, hashMap, th2.h(692, hashMap, th2.h(691, hashMap, th2.h(690, hashMap, th2.h(689, hashMap, th2.h(688, hashMap, th2.h(687, hashMap, th2.h(686, hashMap, th2.h(685, hashMap, th2.h(683, hashMap, th2.h(682, hashMap, th2.h(681, hashMap, th2.h(680, hashMap, th2.h(679, hashMap, th2.h(678, hashMap, th2.h(677, hashMap, th2.h(676, hashMap, th2.h(675, hashMap, th2.h(674, hashMap, th2.h(673, hashMap, th2.h(672, hashMap, th2.h(670, hashMap, arrayList12, 1, "NF"), 1, "BN"), 1, "NR"), 1, "PG"), 1, "TO"), 1, "SB"), 1, "VU"), 1, "FJ"), 1, "PW"), 1, "WF"), 1, "CK"), 1, "NU"), 1, "WS"), 1, "KI"), 1, "NC"), 1, "TV"), 1, "PF"), 1, "TK"), 1, "FM"), 1, "MH"), 1, "001"), 1, "001"), 1, "KP"), 1, "HK"), 1, "MO"), 1, "KH"), 1, "LA"), 1, "001"), 1, "001"), 1, "BD"), 1, "001"), 1, "001"), 1, "001"), 1, "TW"), 1, "001"), 1, "MV"), 1, "LB"), 1, "JO"), 1, "SY"), 1, "IQ"), 1, "KW"), 1, "SA"), 1, "YE"), 1, "OM"), 1, "PS"), 1, "AE"), 1, "IL"), 1, "BH"), 1, "QA"), 1, "BT"), 1, "MN"), 1, "NP"), 1, "001"), 1, "TJ"), 1, "TM"), 1, "AZ"), 1, "GE"), 1, "KG"), 1, "UZ"));
        return hashMap;
    }

    public static int t(wx1 wx1) {
        int i = wx1.i(4);
        if (i == 15) {
            return wx1.i(24);
        }
        if (i < 13) {
            return c[i];
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    public static String u(Context context, int i) {
        xl7 xl7;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            Object systemService = context.getSystemService("locale");
            xl7 = systemService != null ? new xl7(new yl7(zl7.a(systemService))) : xl7.b;
        } else {
            xl7 = xl7.a(pa2.G(context));
        }
        if (i2 <= 32 && !xl7.a.a.isEmpty()) {
            Configuration configuration = new Configuration(context.getResources().getConfiguration());
            va3.b(configuration, xl7);
            context = context.createConfigurationContext(configuration);
        }
        return context.getString(i);
    }

    public static final boolean v(int i, int i2) {
        return (i & i2) == i2;
    }

    public static void w(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                if (!file.delete()) {
                    String absolutePath = file.getAbsolutePath();
                    IOException iOException = new IOException(file.getAbsolutePath());
                    IOException iOException2 = new IOException(absolutePath);
                    iOException2.initCause(iOException);
                    throw iOException2;
                }
            } else {
                return;
            }
        }
        if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException(file.getAbsolutePath());
        }
    }

    public static e x(wx1 wx1, boolean z) {
        int i = wx1.i(5);
        if (i == 31) {
            i = wx1.i(6) + 32;
        }
        int t = t(wx1);
        int i2 = wx1.i(4);
        String h = m4b.h(19, i, "mp4a.40.");
        if (i == 5 || i == 29) {
            t = t(wx1);
            int i3 = wx1.i(5);
            if (i3 == 31) {
                i3 = wx1.i(6) + 32;
            }
            i = i3;
            if (i == 22) {
                i2 = wx1.i(4);
            }
        }
        if (z) {
            if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 6 || i == 7 || i == 17)) {
                switch (i) {
                    case 19:
                    case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(i);
                        throw ParserException.c(sb.toString());
                }
            }
            wx1.h();
            if (wx1.h()) {
                wx1.t(14);
            }
            boolean h2 = wx1.h();
            if (i2 != 0) {
                if (i == 6 || i == 20) {
                    wx1.t(3);
                }
                if (h2) {
                    if (i == 22) {
                        wx1.t(16);
                    }
                    if (i == 17 || i == 19 || i == 20 || i == 23) {
                        wx1.t(3);
                    }
                    wx1.t(1);
                }
                switch (i) {
                    case 17:
                    case 19:
                    case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                    case 21:
                    case 22:
                    case 23:
                        int i4 = wx1.i(2);
                        if (i4 == 2 || i4 == 3) {
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(i4);
                            throw ParserException.c(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i5 = d[i2];
        if (i5 != -1) {
            return new e(t, i5, h);
        }
        throw ParserException.a((RuntimeException) null, (String) null);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [gt7, h39] */
    public static h39 y(FileInputStream fileInputStream) {
        ws4 ws4 = new ws4(fileInputStream);
        p7 k = k(ws4);
        ws4.m((int) (k.b - ws4.a));
        long j = k.c;
        ByteBuffer allocate = ByteBuffer.allocate((int) j);
        int read = fileInputStream.read(allocate.array());
        if (((long) read) == j) {
            ? gt7 = new gt7();
            allocate.order(ByteOrder.LITTLE_ENDIAN);
            int position = allocate.position() + allocate.getInt(allocate.position());
            gt7.o = allocate;
            gt7.a = position;
            int i = position - allocate.getInt(position);
            gt7.b = i;
            gt7.c = ((ByteBuffer) gt7.o).getShort(i);
            return gt7;
        }
        throw new IOException("Needed " + j + " bytes, got " + read);
    }

    public static Intent z(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, int i) {
        int i2 = i & 2;
        if (i2 == 0 && (i & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        } else if (i2 == 0 || (i & 4) == 0) {
            return Build.VERSION.SDK_INT >= 33 ? lq3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i) : jq3.a(context, broadcastReceiver, intentFilter, str, (Handler) null, i);
        } else {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
    }

    public abstract void J(zs0 zs0);

    public abstract long h();

    public int hashCode() {
        switch (this.a) {
            case 17:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public abstract lg8 i();

    public String toString() {
        switch (this.a) {
            case 17:
                return m7c.a(getClass()).b();
            default:
                return super.toString();
        }
    }
}
