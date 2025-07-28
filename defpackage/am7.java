package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Pair;
import android.util.Rational;
import android.util.SparseBooleanArray;
import androidx.camera.core.ImageProcessingUtil;
import com.facebook.fresco.middleware.HasExtraData;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import me.leolin.shortcutbadger.BuildConfig;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: am7  reason: default package */
public abstract class am7 {
    public static String a;
    public static final String[] b = {"com.sec.android.app.sbrowser"};
    public static final nu7 c = new nu7((Bundle) null);
    public static final jk9 d = new Object();
    public static final /* synthetic */ int e = 0;
    public static Boolean f;
    public static String g;
    public static final /* synthetic */ int h = 0;

    public static long A(InputStream inputStream, int i) {
        byte[] y = y(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (y[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    public static void B(kya kya, jc8 jc8) {
        int i = jc8.b;
        ws6 ws6 = jc8.a;
        if (i != -1) {
            boolean t1 = kya.t1(20);
            long j = jc8.c;
            if (t1) {
                kya.H0(jc8.b, j, ws6);
            } else if (!ws6.isEmpty()) {
                kya.t((l68) ws6.get(0), j);
            }
        } else if (kya.t1(20)) {
            kya.O0(ws6);
        } else if (!ws6.isEmpty()) {
            kya.C0((l68) ws6.get(0));
        }
    }

    public static String C(String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x01f2  */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ba  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x01ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List D(java.util.List r18, defpackage.zx1 r19, defpackage.zx1 r20, mi3 r21, long r22, long r24) {
        /*
            r0 = 2
            r1 = 1
            if (r18 == 0) goto L_0x0247
            boolean r3 = r18.isEmpty()
            if (r3 == 0) goto L_0x000c
            goto L_0x0247
        L_0x000c:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r5 = r18.iterator()
        L_0x001a:
            boolean r6 = r5.hasNext()
            r7 = 0
            if (r6 == 0) goto L_0x0036
            java.lang.Object r6 = r5.next()
            uj3 r6 = (uj3) r6
            long r9 = r6.Z
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x001a
            java.lang.Long r6 = java.lang.Long.valueOf(r9)
            r4.add(r6)
            goto L_0x001a
        L_0x0036:
            boolean r5 = r4.isEmpty()
            if (r5 != 0) goto L_0x0053
            r5 = r20
            java.lang.Object r5 = r5.b
            di3 r5 = (di3) r5
            nj4 r5 = r5.f
            java.lang.Object r5 = r5.get()
            a04 r5 = (a04) r5
            hz3 r5 = (hz3) r5
            oec r5 = r5.e
            java.util.ArrayList r4 = r5.f(r4)
            goto L_0x0057
        L_0x0053:
            java.util.List r4 = java.util.Collections.emptyList()
        L_0x0057:
            java.util.Iterator r5 = r18.iterator()
        L_0x005b:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x0245
            java.lang.Object r6 = r5.next()
            uj3 r6 = (uj3) r6
            long r9 = r6.a
            r15 = r19
            java.lang.Object r11 = r15.b
            di3 r11 = (di3) r11
            r13 = 0
            tf3 r9 = r11.i(r9, r13)
            long r11 = r6.b
            if (r9 == 0) goto L_0x0083
            oi3 r10 = r9.a
            ni3 r10 = r10.c
            long r13 = r10.g
            int r10 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r10 <= 0) goto L_0x0083
            goto L_0x005b
        L_0x0083:
            if (r9 == 0) goto L_0x008d
            oi3 r9 = r9.a
            long r13 = r9.b
            int r10 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r10 != 0) goto L_0x0093
        L_0x008d:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00bb
        L_0x0093:
            ni3 r9 = r9.c
            long r13 = r9.s
            long r13 = r13 + r22
            int r10 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r10 > 0) goto L_0x00b5
            java.lang.String r10 = "am7"
            java.lang.String r13 = "force update non-contact"
            defpackage.udd.p(r10, r13, new java.lang.Object[0])
            long r13 = r9.t
            r9 = r6
            r10 = r21
            r16 = r3
            r2 = r11
            r11 = r24
            r17 = 0
            ni3 r9 = i(r9, r10, r11, r13)
            goto L_0x00c6
        L_0x00b5:
            r16 = r3
            r2 = r11
            r17 = 0
            goto L_0x00c6
        L_0x00bb:
            r13 = 0
            r9 = r6
            r10 = r21
            r11 = r24
            ni3 r9 = i(r9, r10, r11, r13)
        L_0x00c6:
            long r10 = r6.Z
            int r12 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            r13 = 0
            if (r12 != 0) goto L_0x00cf
        L_0x00cd:
            r14 = r13
            goto L_0x00e9
        L_0x00cf:
            java.util.Iterator r12 = r4.iterator()
        L_0x00d3:
            boolean r14 = r12.hasNext()
            if (r14 == 0) goto L_0x00cd
            java.lang.Object r14 = r12.next()
            ioa r14 = (ioa) r14
            long r7 = r14.Y
            int r7 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r7 != 0) goto L_0x00e6
            goto L_0x00e9
        L_0x00e6:
            r7 = 0
            goto L_0x00d3
        L_0x00e9:
            gi3 r7 = r9.c()
            long r8 = r6.a
            r7.a = r8
            r7.g = r2
            r7.h = r10
            int r2 = r6.x0
            int r3 = defpackage.hr1.t(r2)
            java.lang.String r8 = " in proto model"
            java.lang.String r9 = "No such value for "
            if (r3 == 0) goto L_0x0130
            if (r3 == r1) goto L_0x012e
            if (r3 != r0) goto L_0x0107
            r2 = 3
            goto L_0x0131
        L_0x0107:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r9)
            if (r2 == r1) goto L_0x011e
            if (r2 == r0) goto L_0x011b
            r0 = 3
            if (r2 == r0) goto L_0x0118
            java.lang.String r0 = "null"
            goto L_0x0120
        L_0x0118:
            java.lang.String r0 = "FEMALE"
            goto L_0x0120
        L_0x011b:
            java.lang.String r0 = "MALE"
            goto L_0x0120
        L_0x011e:
            java.lang.String r0 = "UNKNOWN"
        L_0x0120:
            r4.append(r0)
            r4.append(r8)
            java.lang.String r0 = r4.toString()
            r3.<init>(r0)
            throw r3
        L_0x012e:
            r2 = r0
            goto L_0x0131
        L_0x0130:
            r2 = r1
        L_0x0131:
            r7.l = r2
            java.lang.String r2 = r6.z0
            r7.o = r2
            java.lang.String r2 = r6.A0
            r7.p = r2
            long r2 = r6.Y
            r7.e = r2
            java.lang.String r2 = r6.B0
            r7.q = r2
            s77 r2 = r6.C0
            if (r2 != 0) goto L_0x0149
            r3 = r13
            goto L_0x0152
        L_0x0149:
            ji3 r3 = new ji3
            java.lang.Object r2 = r2.a
            java.lang.String r2 = (java.lang.String) r2
            r3.<init>(r2)
        L_0x0152:
            r7.u = r3
            int[] r2 = r6.D0
            r7.v = r2
            li3 r2 = li3.b
            ln3 r3 = r6.w0
            if (r3 != 0) goto L_0x015f
            goto L_0x0181
        L_0x015f:
            int r10 = r3.ordinal()
            if (r10 == 0) goto L_0x017e
            if (r10 != r1) goto L_0x0169
            r13 = r2
            goto L_0x0181
        L_0x0169:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            r1.append(r3)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x017e:
            li3 r3 = li3.a
            r13 = r3
        L_0x0181:
            r7.i = r13
            if (r13 == 0) goto L_0x018c
            mi3 r3 = mi3.b
            r7.k = r3
            r3 = r21
            goto L_0x0190
        L_0x018c:
            r3 = r21
            r7.k = r3
        L_0x0190:
            java.lang.String r8 = r6.c
            boolean r9 = defpackage.r1g.p(r8)
            java.lang.String r10 = ""
            if (r9 != 0) goto L_0x019d
            r7.b = r8
            goto L_0x01a1
        L_0x019d:
            if (r13 == r2) goto L_0x01a1
            r7.b = r10
        L_0x01a1:
            java.lang.String r8 = r6.o
            boolean r9 = defpackage.r1g.p(r8)
            if (r9 != 0) goto L_0x01ac
            r7.c = r8
            goto L_0x01b0
        L_0x01ac:
            if (r13 == r2) goto L_0x01b0
            r7.c = r10
        L_0x01b0:
            java.util.List r2 = r6.X
            java.util.ArrayList r2 = fu7.j(r2)
            r7.f = r2
            if (r14 == 0) goto L_0x01ee
            java.lang.String r2 = r14.y0
            boolean r8 = defpackage.r1g.p(r2)
            if (r8 != 0) goto L_0x01c6
            r7.d = r2
            r13 = r1
            goto L_0x01c8
        L_0x01c6:
            r13 = r17
        L_0x01c8:
            java.lang.String r2 = r14.w0
            boolean r8 = defpackage.r1g.p(r2)
            if (r8 != 0) goto L_0x01f0
            java.lang.String r8 = r14.x0
            if (r8 == 0) goto L_0x01d5
            goto L_0x01d6
        L_0x01d5:
            r8 = r10
        L_0x01d6:
            ii3 r9 = new ii3
            hi3 r11 = hi3.b
            r9.<init>(r2, r11, r8)
            java.util.List r2 = r7.f
            if (r2 != 0) goto L_0x01e8
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r7.f = r2
        L_0x01e8:
            java.util.List r2 = r7.f
            r2.add(r9)
            goto L_0x01f0
        L_0x01ee:
            r13 = r17
        L_0x01f0:
            if (r13 != 0) goto L_0x01f4
            r7.d = r10
        L_0x01f4:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.List r6 = r6.y0
            java.util.Iterator r6 = r6.iterator()
        L_0x01ff:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0234
            java.lang.Object r8 = r6.next()
            tj3 r8 = (tj3) r8
            int r8 = r8.ordinal()
            if (r8 == r1) goto L_0x022d
            r9 = 3
            if (r8 == r9) goto L_0x0227
            r10 = 4
            if (r8 == r10) goto L_0x0221
            r10 = 5
            if (r8 == r10) goto L_0x021b
            goto L_0x01ff
        L_0x021b:
            ki3 r8 = ki3.o
            r2.add(r8)
            goto L_0x01ff
        L_0x0221:
            ki3 r8 = ki3.c
            r2.add(r8)
            goto L_0x01ff
        L_0x0227:
            ki3 r8 = ki3.b
            r2.add(r8)
            goto L_0x01ff
        L_0x022d:
            r9 = 3
            ki3 r8 = ki3.a
            r2.add(r8)
            goto L_0x01ff
        L_0x0234:
            r9 = 3
            r7.n = r2
            ni3 r2 = r7.a()
            r6 = r16
            r6.add(r2)
            r3 = r6
            r7 = 0
            goto L_0x005b
        L_0x0245:
            r6 = r3
            return r6
        L_0x0247:
            java.util.List r0 = java.util.Collections.emptyList()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am7.D(java.util.List, zx1, zx1, mi3, long, long):java.util.List");
    }

    public static final Object E(hu3 hu3, Object obj, Object obj2, i26 i26, Continuation continuation) {
        Object obj3;
        Object updateThreadContext = ThreadContextKt.updateThreadContext(hu3, obj2);
        try {
            hod hod = new hod(hu3, continuation);
            if (!(i26 instanceof bh0)) {
                obj3 = urd.T(i26, obj, hod);
            } else {
                ete.g(2, i26);
                obj3 = i26.invoke(obj, hod);
            }
            return obj3;
        } finally {
            ThreadContextKt.restoreThreadContext(hu3, updateThreadContext);
        }
    }

    public static final mc7 F(em emVar, fm fmVar, nc7 nc7) {
        return new mc7(fmVar, nc7.R(), emVar);
    }

    public static void G(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((int) ((j >> (i2 * 8)) & 255));
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void H(int i, ByteArrayOutputStream byteArrayOutputStream) {
        G(byteArrayOutputStream, (long) i, 2);
    }

    public static byte[] I(lr6 lr6, Rect rect, int i, int i2) {
        if (lr6.k0() == 35) {
            mv4 mv4 = lr6.v()[0];
            mv4 mv42 = lr6.v()[1];
            mv4 mv43 = lr6.v()[2];
            ByteBuffer E = mv4.E();
            ByteBuffer E2 = mv42.E();
            ByteBuffer E3 = mv43.E();
            E.rewind();
            E2.rewind();
            E3.rewind();
            int remaining = E.remaining();
            byte[] bArr = new byte[(((lr6.getHeight() * lr6.getWidth()) / 2) + remaining)];
            int i3 = 0;
            for (int i4 = 0; i4 < lr6.getHeight(); i4++) {
                E.get(bArr, i3, lr6.getWidth());
                i3 += lr6.getWidth();
                E.position(Math.min(remaining, mv4.H() + (E.position() - lr6.getWidth())));
            }
            int height = lr6.getHeight() / 2;
            int width = lr6.getWidth() / 2;
            int H = mv43.H();
            int H2 = mv42.H();
            int F = mv43.F();
            int F2 = mv42.F();
            byte[] bArr2 = new byte[H];
            byte[] bArr3 = new byte[H2];
            for (int i5 = 0; i5 < height; i5++) {
                E3.get(bArr2, 0, Math.min(H, E3.remaining()));
                E2.get(bArr3, 0, Math.min(H2, E2.remaining()));
                int i6 = 0;
                int i7 = 0;
                for (int i8 = 0; i8 < width; i8++) {
                    int i9 = i3 + 1;
                    bArr[i3] = bArr2[i6];
                    i3 += 2;
                    bArr[i9] = bArr3[i7];
                    i6 += F;
                    i7 += F2;
                }
            }
            YuvImage yuvImage = new YuvImage(bArr, 17, lr6.getWidth(), lr6.getHeight(), (int[]) null);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            z25[] z25Arr = n25.c;
            m25 m25 = new m25(ByteOrder.BIG_ENDIAN);
            String valueOf = String.valueOf(1);
            ArrayList arrayList = m25.a;
            m25.c("Orientation", valueOf, arrayList);
            m25.c("XResolution", "72/1", arrayList);
            m25.c("YResolution", "72/1", arrayList);
            m25.c("ResolutionUnit", String.valueOf(2), arrayList);
            m25.c("YCbCrPositioning", String.valueOf(1), arrayList);
            m25.c("Make", Build.MANUFACTURER, arrayList);
            m25.c("Model", Build.MODEL, arrayList);
            if (lr6.getImageInfo() != null) {
                lr6.getImageInfo().c(m25);
            }
            m25.d(i2);
            m25.c("ImageWidth", String.valueOf(lr6.getWidth()), arrayList);
            m25.c("ImageLength", String.valueOf(lr6.getHeight()), arrayList);
            ArrayList list = Collections.list(new l25(m25));
            if (!((Map) list.get(1)).isEmpty()) {
                m25.b("ExposureProgram", String.valueOf(0), list);
                m25.b("ExifVersion", "0230", list);
                m25.b("ComponentsConfiguration", "1,2,3,0", list);
                m25.b("MeteringMode", String.valueOf(0), list);
                m25.b("LightSource", String.valueOf(0), list);
                m25.b("FlashpixVersion", "0100", list);
                m25.b("FocalPlaneResolutionUnit", String.valueOf(2), list);
                m25.b("FileSource", String.valueOf(3), list);
                m25.b("SceneType", String.valueOf(1), list);
                m25.b("CustomRendered", String.valueOf(0), list);
                m25.b("SceneCaptureType", String.valueOf(0), list);
                m25.b("Contrast", String.valueOf(0), list);
                m25.b("Saturation", String.valueOf(0), list);
                m25.b("Sharpness", String.valueOf(0), list);
            }
            if (!((Map) list.get(2)).isEmpty()) {
                m25.b("GPSVersionID", "2300", list);
                m25.b("GPSSpeedRef", "K", list);
                m25.b("GPSTrackRef", "T", list);
                m25.b("GPSImgDirectionRef", "T", list);
                m25.b("GPSDestBearingRef", "T", list);
                m25.b("GPSDestDistanceRef", "K", list);
            }
            if (yuvImage.compressToJpeg(rect == null ? new Rect(0, 0, lr6.getWidth(), lr6.getHeight()) : rect, i, new y25(byteArrayOutputStream, new n25(m25.b, list)))) {
                return byteArrayOutputStream.toByteArray();
            }
            throw new Exception("YuvImage failed to encode jpeg.");
        }
        throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + lr6.k0());
    }

    public static int a(int i, int i2) {
        return c3d.d(i, i2, 31);
    }

    public static boolean b(n2d n2d, n2d n2d2) {
        jya jya = n2d.a;
        int i = jya.b;
        jya jya2 = n2d2.a;
        return i == jya2.b && jya.e == jya2.e && jya.h == jya2.h && jya.i == jya2.i;
    }

    public static final rn1 c(nv9 nv9) {
        return ez3.h(new oic(nv9, (Continuation) null));
    }

    public static Uri d(String str, String str2, String str3) {
        Uri.Builder encodedPath = new Uri.Builder().scheme(str2).encodedAuthority(str3).encodedPath(h0e.w0(str, "?").toLowerCase(Locale.ROOT));
        StringBuilder sb = new StringBuilder();
        int a0 = h0e.a0(str, "?", 0, false, 6);
        String substring = a0 == -1 ? BuildConfig.FLAVOR : str.substring(a0 + 1, str.length());
        int length = substring.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (substring.charAt(i2) == '=') {
                fz6 S = gwf.S(i, i2);
                sb.append(substring.substring(S.a, S.b + 1).toLowerCase(Locale.ROOT));
            } else if (substring.charAt(i2) == '&') {
                fz6 S2 = gwf.S(i, i2);
                sb.append(substring.substring(S2.a, S2.b + 1));
            } else {
                if (i2 == substring.length() - 1) {
                    fz6 S3 = gwf.S(i, i2 + 1);
                    sb.append(substring.substring(S3.a, S3.b + 1));
                }
            }
            i = i2;
        }
        return encodedPath.encodedQuery(sb.toString()).build();
    }

    public static int e(long j, long j2) {
        if (j == -9223372036854775807L || j2 == -9223372036854775807L) {
            return 0;
        }
        if (j2 == 0) {
            return 100;
        }
        return oze.j((int) ((j * 100) / j2), 0, 100);
    }

    public static void f(gi3 gi3, String str, String str2) {
        if (str != null) {
            if (str2 == null) {
                str2 = BuildConfig.FLAVOR;
            }
            hi3 hi3 = hi3.o;
            if (!gi3.f.isEmpty()) {
                gi3.f.set(0, new ii3(str, ((ii3) gi3.f.get(0)).c, str2));
                return;
            }
            gi3.f.add(0, new ii3(str, hi3, str2));
            return;
        }
        gi3.f.remove(0);
    }

    public static byte[] g(byte[] bArr) {
        DeflaterOutputStream deflaterOutputStream;
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
        throw th;
    }

    public static Bitmap h(lr6 lr6) {
        int k0 = lr6.k0();
        if (k0 == 1) {
            Bitmap createBitmap = Bitmap.createBitmap(lr6.getWidth(), lr6.getHeight(), Bitmap.Config.ARGB_8888);
            lr6.v()[0].E().rewind();
            ImageProcessingUtil.e(createBitmap, lr6.v()[0].E(), lr6.v()[0].H());
            return createBitmap;
        } else if (k0 == 35) {
            return ImageProcessingUtil.b(lr6);
        } else {
            if (k0 != 256 && k0 != 4101) {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + lr6.k0() + ", only ImageFormat.YUV_420_888 and PixelFormat.RGBA_8888 are supported");
            } else if (u(lr6.k0())) {
                ByteBuffer E = lr6.v()[0].E();
                int capacity = E.capacity();
                byte[] bArr = new byte[capacity];
                E.rewind();
                E.get(bArr);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, capacity, (BitmapFactory.Options) null);
                if (decodeByteArray != null) {
                    return decodeByteArray;
                }
                throw new UnsupportedOperationException("Decode jpeg byte array failed");
            } else {
                throw new IllegalArgumentException("Incorrect image format of the input image proxy: " + lr6.k0());
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [gi3, java.lang.Object] */
    public static ni3 i(uj3 uj3, mi3 mi3, long j, long j2) {
        ArrayList j3 = fu7.j(uj3.X);
        s77 s77 = uj3.C0;
        ji3 ji3 = s77 == null ? null : new ji3((String) s77.a);
        ? obj = new Object();
        obj.a = uj3.a;
        obj.f = j3;
        obj.o = uj3.z0;
        obj.p = uj3.A0;
        obj.k = mi3;
        obj.b = null;
        obj.c = null;
        obj.e = uj3.Y;
        obj.s = j;
        obj.t = j2;
        obj.u = ji3;
        obj.v = uj3.D0;
        return obj.a();
    }

    public static boolean j(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static String k(String str) {
        Uri parse = Uri.parse(str);
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        Uri.Builder clearQuery = parse.buildUpon().clearQuery();
        for (String next : queryParameterNames) {
            if (next.equals("token")) {
                clearQuery.appendQueryParameter(next, "<HIDDEN>");
            } else {
                clearQuery.appendQueryParameter(next, parse.getQueryParameter(next));
            }
        }
        return clearQuery.build().toString();
    }

    public static String l(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("joinLink")) {
                jSONObject.put("joinLink", "<HIDDEN>");
            }
            if (jSONObject.has("conversation")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("conversation");
                if (jSONObject2.has("joinLink")) {
                    jSONObject2.put("joinLink", "<HIDDEN>");
                }
            }
            if (jSONObject.has("endpoint")) {
                jSONObject.put("endpoint", k(jSONObject.getString("endpoint")));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return str;
        }
    }

    public static String m(Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = null;
        for (Map.Entry entry : map.entrySet()) {
            int q = q((String) entry.getKey());
            if (q != 0 && (str == null || q > q(str))) {
                str = (String) entry.getKey();
            }
        }
        if (str != null) {
            return (String) map.get(str);
        }
        return null;
    }

    public static Drawable n(Context context, int i) {
        return mbc.c().f(context, i);
    }

    public static Rational o(int i, Rational rational) {
        return (i == 90 || i == 270) ? rational == null ? rational : new Rational(rational.getDenominator(), rational.getNumerator()) : new Rational(rational.getNumerator(), rational.getDenominator());
    }

    public static long p(fza fza, long j, long j2, long j3) {
        boolean equals = fza.c.equals(n2d.l);
        n2d n2d = fza.c;
        boolean z = equals || j2 < n2d.c;
        if (!fza.v) {
            return (z || j == -9223372036854775807L) ? n2d.a.f : j;
        }
        if (!z && j != -9223372036854775807L) {
            return j;
        }
        if (j3 == -9223372036854775807L) {
            j3 = SystemClock.elapsedRealtime() - n2d.c;
        }
        long j4 = n2d.a.f + ((long) (((float) j3) * fza.g.a));
        long j5 = n2d.d;
        return j5 != -9223372036854775807L ? Math.min(j4, j5) : j4;
    }

    public static int q(String str) {
        if (r1g.p(str)) {
            return 0;
        }
        if (!str.startsWith("MP4") && !str.startsWith("mp4")) {
            return 0;
        }
        try {
            return Integer.parseInt(str.split("_")[1]);
        } catch (Exception e2) {
            udd.s("am7", "failed to parse mp4 video key: ".concat(str), e2);
            return 0;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|7|8|9|10|11) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.a13 r(defpackage.uaf r4) {
        /*
            jk9 r0 = d
            monitor-enter(r0)
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            java.lang.AutoCloseable r1 = r4.c(r1)     // Catch:{ all -> 0x002b }
            a13 r1 = (defpackage.a13) r1     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x002d
            bw4 r1 = defpackage.bw4.a     // Catch:{ all -> 0x002b }
            ha4 r2 = defpackage.oi4.a     // Catch:{ el9 | IllegalStateException -> 0x0017 }
            zr7 r2 = kotlinx.coroutines.internal.MainDispatcherLoader.dispatcher     // Catch:{ el9 | IllegalStateException -> 0x0017 }
            zr7 r1 = r2.getImmediate()     // Catch:{ el9 | IllegalStateException -> 0x0017 }
        L_0x0017:
            a13 r2 = new a13     // Catch:{ all -> 0x002b }
            n3e r3 = x87.c()     // Catch:{ all -> 0x002b }
            hu3 r1 = r1.plus(r3)     // Catch:{ all -> 0x002b }
            r2.<init>(r1)     // Catch:{ all -> 0x002b }
            java.lang.String r1 = "androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY"
            r4.a(r1, r2)     // Catch:{ all -> 0x002b }
            r1 = r2
            goto L_0x002d
        L_0x002b:
            r4 = move-exception
            goto L_0x002f
        L_0x002d:
            monitor-exit(r0)
            return r1
        L_0x002f:
            monitor-exit(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.am7.r(uaf):a13");
    }

    public static eya s(eya eya, eya eya2) {
        if (eya == null || eya2 == null) {
            return eya.b;
        }
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        for (int i = 0; i < eya.e(); i++) {
            wi5 wi5 = eya.a;
            if (eya2.a(wi5.b(i))) {
                int b2 = wi5.b(i);
                oyb.k(!false);
                sparseBooleanArray.append(b2, true);
            }
        }
        oyb.k(!false);
        return new eya(new wi5(sparseBooleanArray));
    }

    public static kr5 t(ws8 ws8) {
        int i;
        String str;
        long j;
        ws8 ws82 = ws8;
        try {
            i = jjd.K(ws8);
        } catch (Throwable th) {
            Throwable th2 = th;
            udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th2);
            Iterator it = uzc.a.iterator();
            while (it.hasNext()) {
                ((ny9) it.next()).getClass();
                ny9.a(th2);
            }
            int t = hr1.t(m4b.a);
            if (t == 0) {
                i = 0;
            } else if (t != 1) {
                throw new NoWhenBranchMatchedException();
            } else {
                throw th2;
            }
        }
        long j2 = 0;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Long l = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        for (int i2 = 0; i2 < i; i2++) {
            try {
                str = jjd.M(ws8);
            } catch (Throwable th3) {
                udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th3);
                Iterator it2 = uzc.a.iterator();
                while (it2.hasNext()) {
                    ((ny9) it2.next()).getClass();
                    ny9.a(th3);
                }
                int t2 = hr1.t(m4b.a);
                if (t2 != 0) {
                    if (t2 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    throw th3;
                }
            }
            if (str != null) {
                try {
                    switch (str.hashCode()) {
                        case -1724546052:
                            if (str.equals("description")) {
                                str4 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case -1587556021:
                            if (str.equals("startParam")) {
                                str5 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case -1332194002:
                            if (str.equals("background")) {
                                str3 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case 3355:
                            if (str.equals(HasExtraData.KEY_ID)) {
                                j2 = jjd.J(ws82, 0);
                                continue;
                            }
                            break;
                        case 116079:
                            if (str.equals("url")) {
                                str6 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case 3373707:
                            if (str.equals("name")) {
                                str2 = jjd.M(ws8);
                                continue;
                            }
                            break;
                        case 93028124:
                            if (str.equals("appId")) {
                                j = jjd.J(ws82, 0);
                                Long valueOf = Long.valueOf(j);
                                if (j != 0) {
                                    l = valueOf;
                                    break;
                                } else {
                                    l = null;
                                    continue;
                                }
                            }
                            break;
                        case 1638765110:
                            if (str.equals("iconUrl")) {
                                str7 = jjd.M(ws8);
                                continue;
                            }
                            break;
                    }
                    ws8.z();
                } catch (Throwable th4) {
                    udd.S("ServerPayload/PayloadCatching", "payloadCatching catch error", th4);
                    Iterator it3 = uzc.a.iterator();
                    while (it3.hasNext()) {
                        ((ny9) it3.next()).getClass();
                        ny9.a(th4);
                    }
                    int t3 = hr1.t(m4b.a);
                    if (t3 != 0) {
                        if (t3 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        throw th4;
                    }
                }
            }
        }
        if (j2 == 0 || str2 == null || str2.length() == 0 || str3 == null || str3.length() == 0) {
            return null;
        }
        if (str2 == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        } else if (str3 != null) {
            return new kr5(j2, str2, str3, str4, l, str5, str6, str7);
        } else {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public static boolean u(int i) {
        return i == 256 || i == 4101;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [p3e, v3e, java.lang.Object] */
    public static p3e v(p3e p3e) {
        if ((p3e instanceof v3e) || (p3e instanceof u3e)) {
            return p3e;
        }
        if (p3e instanceof Serializable) {
            return new u3e(p3e);
        }
        ? obj = new Object();
        obj.a = p3e;
        return obj;
    }

    public static Pair w(fza fza, dza dza, fza fza2, dza dza2, eya eya) {
        boolean z = dza2.a;
        boolean z2 = dza2.b;
        if (z && eya.a(17) && !dza.a) {
            fza2 = fza2.l(fza.j);
            dza2 = new dza(false, z2);
        }
        if (z2 && eya.a(30) && !dza.b) {
            fza2 = fza2.b(fza.D);
            dza2 = new dza(dza2.a, false);
        }
        return new Pair(fza2, dza2);
    }

    public static final boolean x(Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static byte[] y(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                throw new IllegalStateException(wn6.h(i, "Not enough bytes to read: "));
            }
        }
        return bArr;
    }

    public static byte[] z(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read >= 0) {
                    inflater.setInput(bArr2, 0, read);
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } else {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
            }
            if (i3 != i) {
                throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            } else if (inflater.finished()) {
                inflater.end();
                return bArr;
            } else {
                throw new IllegalStateException("Inflater did not finish");
            }
        } catch (DataFormatException e2) {
            throw new IllegalStateException(e2.getMessage());
        } catch (Throwable th) {
            inflater.end();
            throw th;
        }
    }
}
