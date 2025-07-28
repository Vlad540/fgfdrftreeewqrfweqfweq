package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.util.TypedValue;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import java.io.IOException;
import java.io.InputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* renamed from: vx3  reason: default package */
public abstract class vx3 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final gf6 b = new gf6(12);
    public static final Object c = new Object();
    public static final Object d = new Object();
    public static boolean e;
    public static long f;

    public static final boolean A(int i, int i2, hbc hbc) {
        if (hbc == null) {
            if (((float) ((int) (((float) i) * 1.3333334f))) < 2048.0f || ((int) (((float) i2) * 1.3333334f)) < 2048) {
                return false;
            }
        } else if (((int) (((float) i) * 1.3333334f)) < hbc.a || ((int) (((float) i2) * 1.3333334f)) < hbc.b) {
            return false;
        }
        return true;
    }

    public static final boolean B(ax4 ax4, hbc hbc) {
        if (ax4 == null) {
            return false;
        }
        ax4.n0();
        int i = ax4.o;
        if (i == 90 || i == 270) {
            ax4.n0();
            int i2 = ax4.Z;
            ax4.n0();
            return A(i2, ax4.Y, hbc);
        }
        ax4.n0();
        int i3 = ax4.Y;
        ax4.n0();
        return A(i3, ax4.Z, hbc);
    }

    public static int C(int i, float f2, int i2) {
        return j33.f(j33.h(i2, Math.round(((float) Color.alpha(i2)) * f2)), i);
    }

    public static String F(Object obj) {
        return "'" + String.valueOf(obj) + "'";
    }

    public static long G(int i, byte[] bArr) {
        byte b2 = bArr[i];
        byte b3 = bArr[i + 1];
        byte b4 = bArr[i + 2];
        byte b5 = bArr[i + 3];
        byte b6 = b2 & true;
        int i2 = b2;
        if (b6 == true) {
            i2 = (b2 & Byte.MAX_VALUE) + 128;
        }
        byte b7 = b3 & true;
        int i3 = b3;
        if (b7 == true) {
            i3 = (b3 & Byte.MAX_VALUE) + 128;
        }
        byte b8 = b4 & true;
        int i4 = b4;
        if (b8 == true) {
            i4 = (b4 & Byte.MAX_VALUE) + 128;
        }
        byte b9 = b5 & true;
        int i5 = b5;
        if (b9 == true) {
            i5 = (b5 & Byte.MAX_VALUE) + 128;
        }
        return (((long) i2) << 24) + (((long) i3) << 16) + (((long) i4) << 8) + ((long) i5);
    }

    public static final int H(InputStream inputStream, int i, boolean z) {
        int i2;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int read = inputStream.read();
            if (read != -1) {
                if (z) {
                    i2 = (read & 255) << (i3 * 8);
                } else {
                    i4 <<= 8;
                    i2 = read & 255;
                }
                i4 |= i2;
                i3++;
            } else {
                throw new IOException("no more bytes");
            }
        }
        return i4;
    }

    public static long I(int i, byte[] bArr) {
        long G = G(i, bArr);
        long G2 = G(i + 4, bArr);
        if (G == 0 && G2 == 0) {
            return 0;
        }
        return ((G2 * 1000) / 4294967296L) + ((G - 2208988800L) * 1000);
    }

    public static void J(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    public static void K(i26 i26, Object obj, Continuation continuation) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(urd.y(urd.p(i26, obj, continuation)), jue.a, (u16) null);
        } catch (Throwable th) {
            continuation.resumeWith(new kcc(th));
            throw th;
        }
    }

    public static boolean L(String str) {
        return str != null && str.trim().length() > 0;
    }

    public static final q02 M(pj5 pj5, long j) {
        return new q02(new sk5(j, pj5, (Continuation) null), bw4.a, -2, 1, 0);
    }

    public static String N(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        int i2 = mze.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static long a() {
        DatagramSocket datagramSocket;
        long j;
        synchronized (d) {
        }
        InetAddress byName = InetAddress.getByName("time.android.com");
        DatagramSocket datagramSocket2 = new DatagramSocket();
        try {
            datagramSocket2.setSoTimeout(10000);
            byte[] bArr = new byte[48];
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long currentTimeMillis = System.currentTimeMillis();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (currentTimeMillis == 0) {
                Arrays.fill(bArr, 40, 48, (byte) 0);
                j = currentTimeMillis;
                datagramSocket = datagramSocket2;
            } else {
                long j2 = currentTimeMillis / 1000;
                long j3 = currentTimeMillis - (j2 * 1000);
                long j4 = j2 + 2208988800L;
                j = currentTimeMillis;
                bArr[40] = (byte) ((int) (j4 >> 24));
                bArr[41] = (byte) ((int) (j4 >> 16));
                datagramSocket = datagramSocket2;
                try {
                    bArr[42] = (byte) ((int) (j4 >> 8));
                    bArr[43] = (byte) ((int) j4);
                    long j5 = (j3 * 4294967296L) / 1000;
                    bArr[44] = (byte) ((int) (j5 >> 24));
                    bArr[45] = (byte) ((int) (j5 >> 16));
                    bArr[46] = (byte) ((int) (j5 >> 8));
                    bArr[47] = (byte) ((int) (Math.random() * 255.0d));
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        datagramSocket.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            datagramSocket.send(datagramPacket);
            datagramSocket.receive(new DatagramPacket(bArr, 48));
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            long j6 = (elapsedRealtime2 - elapsedRealtime) + j;
            byte b2 = bArr[0];
            long I = I(24, bArr);
            long I2 = I(32, bArr);
            long I3 = I(40, bArr);
            g((byte) ((b2 >> 6) & 3), (byte) (b2 & 7), bArr[1] & 255, I3);
            long j7 = (j6 + (((I3 - j6) + (I2 - I)) / 2)) - elapsedRealtime2;
            datagramSocket.close();
            return j7;
        } catch (Throwable th4) {
            th = th4;
            datagramSocket = datagramSocket2;
            Throwable th22 = th;
            datagramSocket.close();
            throw th22;
        }
    }

    public static final int b(char c2) {
        if ('0' <= c2 && '9' >= c2) {
            return c2 - '0';
        }
        if ('a' <= c2 && 'f' >= c2) {
            return c2 - 'W';
        }
        if ('A' <= c2 && 'F' >= c2) {
            return c2 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c2);
    }

    public static final boolean c(v2b v2b, String str) {
        Long l = (Long) ((Map) ((AtomicReference) ((r7e) v2b.c).getValue()).get()).get(str);
        return l != null && System.currentTimeMillis() < l.longValue();
    }

    public static final void d(ht7 ht7, String str, Long l) {
        Long l2;
        if (l.longValue() <= 0) {
            l2 = null;
        } else {
            l2 = Long.valueOf(l.longValue() + System.currentTimeMillis());
        }
        ht7.put(str, l2);
    }

    public static final void f(Animator animator) {
        animator.removeAllListeners();
        animator.cancel();
    }

    public static void g(byte b2, byte b3, int i, long j) {
        if (b2 == 3) {
            throw new IOException("SNTP: Unsynchronized server");
        } else if (b3 != 4 && b3 != 5) {
            throw new IOException(wn6.h(b3, "SNTP: Untrusted mode: "));
        } else if (i == 0 || i > 15) {
            throw new IOException(wn6.h(i, "SNTP: Untrusted stratum: "));
        } else if (j == 0) {
            throw new IOException("SNTP: Zero transmitTime");
        }
    }

    public static final ck5 h(pj5 pj5, long j, i26 i26) {
        return new ck5(new zi1(new q02(new yj5(j, pj5, (Continuation) null), bw4.a, -2, 1, 0), 29), i26, 0);
    }

    public static void i(qz3 qz3) {
        if (qz3 != null) {
            try {
                qz3.close();
            } catch (IOException unused) {
            }
        }
    }

    public static int j(int i, int i2) {
        return j33.h(i, (Color.alpha(i) * i2) / 255);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String, java.lang.String[]] */
    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:17|18|19|20|23|24) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x008c */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ab A[SYNTHETIC, Splitter:B:39:0x00ab] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b0 A[Catch:{ Exception -> 0x00b3 }, DONT_GENERATE] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri k(android.net.Uri r7, android.content.Context r8, bf5 r9) {
        /*
            java.lang.String r0 = "vx3"
            java.lang.String r1 = "Uri is from FileProvider, need copy: "
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r3.<init>(r1)     // Catch:{ all -> 0x0021 }
            r3.append(r7)     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x0021 }
            defpackage.udd.p(r0, r1, new java.lang.Object[0])     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ all -> 0x0021 }
            java.lang.String r1 = r1.getType(r7)     // Catch:{ all -> 0x0021 }
            if (r1 != 0) goto L_0x0025
            java.lang.String r1 = "application/octet-stream"
            goto L_0x0025
        L_0x0021:
            r8 = move-exception
            r4 = r2
            goto L_0x00a4
        L_0x0025:
            android.webkit.MimeTypeMap r3 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ all -> 0x0021 }
            java.lang.String r3 = r3.getExtensionFromMimeType(r1)     // Catch:{ all -> 0x0021 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0021 }
            r4.<init>()     // Catch:{ all -> 0x0021 }
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            if (r5 == 0) goto L_0x003f
            java.lang.String r5 = r7.getLastPathSegment()     // Catch:{ all -> 0x0021 }
            r4.append(r5)     // Catch:{ all -> 0x0021 }
        L_0x003f:
            if (r3 == 0) goto L_0x0053
            java.lang.String r5 = r4.toString()     // Catch:{ all -> 0x0021 }
            boolean r5 = r5.endsWith(r3)     // Catch:{ all -> 0x0021 }
            if (r5 != 0) goto L_0x0053
            java.lang.String r5 = "."
            r4.append(r5)     // Catch:{ all -> 0x0021 }
            r4.append(r3)     // Catch:{ all -> 0x0021 }
        L_0x0053:
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0021 }
            mg5 r9 = (mg5) r9     // Catch:{ all -> 0x0021 }
            java.io.File r9 = r9.q(r3)     // Catch:{ all -> 0x0021 }
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ all -> 0x0021 }
            r3.<init>(r9)     // Catch:{ all -> 0x0021 }
            android.content.ContentResolver r4 = r8.getContentResolver()     // Catch:{ all -> 0x00a1 }
            java.io.InputStream r4 = r4.openInputStream(r7)     // Catch:{ all -> 0x00a1 }
            defpackage.ete.s(r4, r3)     // Catch:{ all -> 0x0089 }
            r3.close()     // Catch:{ all -> 0x0089 }
            r4.close()     // Catch:{ all -> 0x0089 }
            android.net.Uri r9 = android.net.Uri.fromFile(r9)     // Catch:{ all -> 0x0089 }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0089 }
            r5.<init>()     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "mime_type"
            r5.put(r6, r1)     // Catch:{ all -> 0x0089 }
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x008c }
            r1.update(r9, r5, r2, r2)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x009a
        L_0x0089:
            r8 = move-exception
        L_0x008a:
            r2 = r3
            goto L_0x00a4
        L_0x008c:
            android.content.ContentResolver r8 = r8.getContentResolver()     // Catch:{ IllegalArgumentException -> 0x0094 }
            r8.insert(r9, r5)     // Catch:{ IllegalArgumentException -> 0x0094 }
            goto L_0x009a
        L_0x0094:
            r8 = move-exception
            java.lang.String r1 = "copyContentOfUri failed to copy mimetype"
            defpackage.udd.S(r0, r1, r8)     // Catch:{ all -> 0x0089 }
        L_0x009a:
            r3.close()     // Catch:{ Exception -> 0x00a0 }
            r4.close()     // Catch:{ Exception -> 0x00a0 }
        L_0x00a0:
            return r9
        L_0x00a1:
            r8 = move-exception
            r4 = r2
            goto L_0x008a
        L_0x00a4:
            java.lang.String r9 = "handleSingleMediaIntent failed to copy FileProvider uri: "
            defpackage.udd.s(r0, r9, r8)     // Catch:{ all -> 0x00b4 }
            if (r2 == 0) goto L_0x00ae
            r2.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00ae:
            if (r4 == 0) goto L_0x00b3
            r4.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            return r7
        L_0x00b4:
            r7 = move-exception
            if (r2 == 0) goto L_0x00ba
            r2.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00ba:
            if (r4 == 0) goto L_0x00bf
            r4.close()     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx3.k(android.net.Uri, android.content.Context, bf5):android.net.Uri");
    }

    public static String l(String str) {
        StringBuilder sb = new StringBuilder(me4.e(me4.e(5, str), str));
        sb.append(".");
        sb.append(str);
        sb.append(",.");
        sb.append(str);
        sb.append(" *");
        return sb.toString();
    }

    public static List m(n1c n1c, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (arrayList.size() == i) {
                break;
            }
            Object f2 = n1c.f();
            if (f2 instanceof l12) {
                Throwable a2 = m12.a(f2);
                if (a2 != null) {
                    throw a2;
                }
            } else {
                arrayList.add(f2);
            }
        }
        return arrayList;
    }

    public static final bc n(pj5 pj5, long j, i26 i26) {
        nl5 e0 = ez3.e0(new ck5(pj5, i26, 1), 1);
        int i = zp4.o;
        return new bc(new ik5(new tj5(0, new dl5(mt0.Q(j, eq4.MILLISECONDS), e0, (Continuation) null)), 0), 17, new ox2(3, (Continuation) null, 3));
    }

    public static final btf o(ztf ztf) {
        return new btf(ztf.a, ztf.t);
    }

    public static int p(int i, int i2, Context context) {
        Integer num;
        TypedValue D = bm3.D(context, i);
        if (D != null) {
            int i3 = D.resourceId;
            num = Integer.valueOf(i3 != 0 ? hq3.a(context, i3) : D.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    public static int q(int i, Context context, String str) {
        TypedValue F = bm3.F(i, context, str);
        int i2 = F.resourceId;
        return i2 != 0 ? hq3.a(context, i2) : F.data;
    }

    public static int r(View view, int i) {
        Context context = view.getContext();
        TypedValue F = bm3.F(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = F.resourceId;
        return i2 != 0 ? hq3.a(context, i2) : F.data;
    }

    public static int s(Intent intent) {
        String type = intent.getType();
        boolean z = false;
        if ((type != null ? p0e.Q(type, us8.f(10), true) : false) && intent.getParcelableExtra("android.intent.extra.STREAM") == null && intent.getParcelableArrayListExtra("android.intent.extra.STREAM") == null) {
            return 0;
        }
        if (type != null ? p0e.Q(type, us8.f(11), true) : false) {
            return 5;
        }
        if (type != null && type.length() != 0 && p0e.Q(type, "image/", true) && !h0e.R(type, "djvu", true)) {
            return 1;
        }
        if (!(type == null || type.length() == 0 || !p0e.Q(type, "video/", true))) {
            z = true;
        }
        return z ? 2 : 4;
    }

    public static String t(String str, fj0 fj0, ej0 ej0) {
        int ordinal = fj0.ordinal();
        ej0 ej02 = ej0.a;
        String str2 = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : ej0 == ej02 ? "sqr_720" : "w_1440" : ej0 == ej02 ? "sqr_480" : "w_1080" : ej0 == ej02 ? "sqr_192" : "w_480" : ej0 == ej02 ? "sqr_96" : "w_240" : ej0 == ej02 ? "sqr_64" : "w_180";
        if (r1g.p(str)) {
            return null;
        }
        return me4.i(str, "&fn=", str2);
    }

    public static ArrayList u(Intent intent, Context context, g15 g15, bf5 bf5) {
        ArrayList arrayList = new ArrayList();
        ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("android.intent.extra.STREAM");
        if (parcelableArrayListExtra != null) {
            Iterator it = parcelableArrayListExtra.iterator();
            while (it.hasNext()) {
                Parcelable parcelable = (Parcelable) it.next();
                Uri parse = parcelable == null ? null : parcelable instanceof Uri ? (Uri) parcelable : Uri.parse(parcelable.toString());
                if (parse != null && !js.y(parse, context, g15)) {
                    if (bf5 != null) {
                        parse = k(parse, context, bf5);
                    }
                    arrayList.add(parse);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList v(Intent intent, Context context, g15 g15, bf5 bf5) {
        ArrayList arrayList = new ArrayList();
        Parcelable parcelableExtra = intent.getParcelableExtra("android.intent.extra.STREAM");
        if (parcelableExtra == null) {
            return arrayList;
        }
        Uri parse = parcelableExtra instanceof Uri ? (Uri) parcelableExtra : Uri.parse(parcelableExtra.toString());
        if (parse == null) {
            return arrayList;
        }
        if (parse.toString().startsWith("content://ru.oneme.app")) {
            arrayList.add(parse);
        } else if (!js.y(parse, context, g15)) {
            if (bf5 != null) {
                parse = k(parse, context, bf5);
            }
            arrayList.add(parse);
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r2.getCharSequenceExtra("android.intent.extra.TEXT");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String w(android.content.Intent r2) {
        /*
            java.lang.String r0 = "android.intent.extra.TEXT"
            java.lang.String r1 = r2.getStringExtra(r0)
            if (r1 != 0) goto L_0x0012
            java.lang.CharSequence r2 = r2.getCharSequenceExtra(r0)
            if (r2 == 0) goto L_0x0012
            java.lang.String r1 = r2.toString()
        L_0x0012:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vx3.w(android.content.Intent):java.lang.String");
    }

    public static final int x(syc syc, syc[] sycArr) {
        int hashCode = (syc.a().hashCode() * 31) + Arrays.hashCode(sycArr);
        vyc vyc = new vyc(syc, 0);
        int i = 1;
        int i2 = 1;
        while (true) {
            int i3 = 0;
            if (!vyc.hasNext()) {
                break;
            }
            int i4 = i2 * 31;
            String a2 = ((syc) vyc.next()).a();
            if (a2 != null) {
                i3 = a2.hashCode();
            }
            i2 = i4 + i3;
        }
        vyc vyc2 = new vyc(syc, 0);
        while (vyc2.hasNext()) {
            int i5 = i * 31;
            d8 e2 = ((syc) vyc2.next()).e();
            i = i5 + (e2 != null ? e2.hashCode() : 0);
        }
        return (((hashCode * 31) + i2) * 31) + i;
    }

    public static final void y(Activity activity) {
        View currentFocus;
        if (activity != null && (currentFocus = activity.getWindow().getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            try {
                ((InputMethodManager) activity.getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
            } catch (Throwable unused) {
            }
        }
    }

    public static boolean z(int i) {
        return i != 0 && j33.d(i) > 0.5d;
    }

    public abstract void D(int i);

    public abstract void E(Typeface typeface);

    public void e(int i) {
        new Handler(Looper.getMainLooper()).post(new n30(i, 14, this));
    }
}
