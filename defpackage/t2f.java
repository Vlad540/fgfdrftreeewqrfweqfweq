package defpackage;

import android.util.Range;
import android.util.Rational;
import android.util.Size;
import java.util.HashMap;
import java.util.Map;

/* renamed from: t2f  reason: default package */
public abstract class t2f {
    public static final HashMap a;
    public static final kje b = kje.a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        HashMap hashMap2 = new HashMap();
        jb0 jb0 = jb0.d;
        hashMap2.put(1, jb0);
        jb0 jb02 = jb0.f;
        hashMap2.put(2, jb02);
        jb0 jb03 = jb0.g;
        hashMap2.put(4096, jb03);
        hashMap2.put(8192, jb03);
        HashMap hashMap3 = new HashMap();
        hashMap3.put(1, jb0);
        hashMap3.put(2, jb02);
        hashMap3.put(4096, jb03);
        hashMap3.put(8192, jb03);
        HashMap hashMap4 = new HashMap();
        hashMap4.put(1, jb0);
        hashMap4.put(4, jb02);
        hashMap4.put(4096, jb03);
        hashMap4.put(16384, jb03);
        hashMap4.put(2, jb0);
        hashMap4.put(8, jb02);
        hashMap4.put(8192, jb03);
        hashMap4.put(32768, jb03);
        HashMap hashMap5 = new HashMap();
        hashMap5.put(256, jb02);
        hashMap5.put(512, jb0.e);
        hashMap.put("video/hevc", hashMap2);
        hashMap.put("video/av01", hashMap3);
        hashMap.put("video/x-vnd.on2.vp9", hashMap4);
        hashMap.put("video/dolby-vision", hashMap5);
    }

    public static jb0 a(int i, String str) {
        jb0 jb0;
        Map map = (Map) a.get(str);
        if (map != null && (jb0 = (jb0) map.get(Integer.valueOf(i))) != null) {
            return jb0;
        }
        String.format("Unsupported mime type %s or profile level %d. Data space is unspecified.", new Object[]{str, Integer.valueOf(i)});
        return jb0.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008a, code lost:
        r2 = r10;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static defpackage.kb0 b(defpackage.z90 r12, defpackage.zq4 r13, defpackage.nb0 r14) {
        /*
            boolean r0 = r13.b()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Dynamic range must be a fully specified dynamic range [provided dynamic range: "
            r1.<init>(r2)
            r1.append(r13)
            java.lang.String r2 = "]"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            defpackage.e07.p(r1, r0)
            int r12 = r12.c
            java.lang.String r0 = "video/avc"
            r1 = 1
            if (r12 == r1) goto L_0x0023
            r2 = r0
            goto L_0x0025
        L_0x0023:
            java.lang.String r2 = "video/x-vnd.on2.vp8"
        L_0x0025:
            r3 = -1
            r4 = 0
            int r5 = r13.a
            if (r14 == 0) goto L_0x008c
            java.util.HashMap r6 = defpackage.cr4.b
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r6 = r6.get(r7)
            java.util.Set r6 = (java.util.Set) r6
            if (r6 != 0) goto L_0x003d
            java.util.Set r6 = java.util.Collections.emptySet()
        L_0x003d:
            java.util.HashMap r7 = defpackage.cr4.a
            int r8 = r13.b
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object r7 = r7.get(r8)
            java.util.Set r7 = (java.util.Set) r7
            if (r7 != 0) goto L_0x0051
            java.util.Set r7 = java.util.Collections.emptySet()
        L_0x0051:
            java.util.List r8 = r14.d
            java.util.Iterator r8 = r8.iterator()
        L_0x0057:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x008c
            java.lang.Object r9 = r8.next()
            g90 r9 = (defpackage.g90) r9
            int r10 = r9.j
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x0057
            int r10 = r9.h
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            boolean r10 = r7.contains(r10)
            if (r10 != 0) goto L_0x007c
            goto L_0x0057
        L_0x007c:
            java.lang.String r10 = r9.b
            boolean r11 = r2.equals(r10)
            if (r11 == 0) goto L_0x0085
            goto L_0x008a
        L_0x0085:
            if (r12 != r3) goto L_0x0057
            r13.toString()
        L_0x008a:
            r2 = r10
            goto L_0x008d
        L_0x008c:
            r9 = r4
        L_0x008d:
            if (r9 != 0) goto L_0x00c7
            if (r12 != r3) goto L_0x00be
            if (r5 == r1) goto L_0x00bd
            r12 = 3
            if (r5 == r12) goto L_0x00bb
            r12 = 4
            if (r5 == r12) goto L_0x00bb
            r12 = 5
            if (r5 == r12) goto L_0x00bb
            r12 = 6
            if (r5 != r12) goto L_0x00a2
            java.lang.String r0 = "video/dolby-vision"
            goto L_0x00bd
        L_0x00a2:
            java.lang.UnsupportedOperationException r12 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "Unsupported dynamic range: "
            r14.<init>(r0)
            r14.append(r13)
            java.lang.String r13 = "\nNo supported default mime type available."
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            throw r12
        L_0x00bb:
            java.lang.String r0 = "video/hevc"
        L_0x00bd:
            r2 = r0
        L_0x00be:
            if (r14 != 0) goto L_0x00c4
            r13.toString()
            goto L_0x00c7
        L_0x00c4:
            r13.toString()
        L_0x00c7:
            if (r2 == 0) goto L_0x00d2
            if (r9 == 0) goto L_0x00cc
            r4 = r9
        L_0x00cc:
            kb0 r12 = new kb0
            r12.<init>(r2, r3, r4)
            return r12
        L_0x00d2:
            java.lang.NullPointerException r12 = new java.lang.NullPointerException
            java.lang.String r13 = "Null mimeType"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t2f.b(z90, zq4, nb0):kb0");
    }

    public static int c(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, Range range) {
        Range range2 = range;
        Rational rational = new Rational(i2, i3);
        Rational rational2 = new Rational(i4, i5);
        Rational rational3 = new Rational(i6, i7);
        Rational rational4 = new Rational(i8, i9);
        int doubleValue = (int) (rational4.doubleValue() * rational3.doubleValue() * rational2.doubleValue() * rational.doubleValue() * ((double) i));
        if (hwf.l(3, "VideoConfigUtil")) {
            Integer valueOf = Integer.valueOf(i);
            String.format("Base Bitrate(%dbps) * Bit Depth Ratio (%d / %d) * Frame Rate Ratio(%d / %d) * Width Ratio(%d / %d) * Height Ratio(%d / %d) = %d", new Object[]{valueOf, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(doubleValue)});
        }
        if (mb0.f.equals(range2)) {
            return doubleValue;
        }
        Integer num = (Integer) range2.clamp(Integer.valueOf(doubleValue));
        int intValue = num.intValue();
        if (hwf.l(3, "VideoConfigUtil")) {
            String.format("\nClamped to range %s -> %dbps", new Object[]{range2, num});
        }
        return intValue;
    }

    public static ib0 d(g90 g90) {
        km4 d = ib0.d();
        String str = g90.b;
        if (str != null) {
            d.a = str;
            d.b = Integer.valueOf(g90.g);
            d.o = new Size(g90.e, g90.f);
            d.Z = Integer.valueOf(g90.d);
            d.x0 = Integer.valueOf(g90.c);
            kje kje = b;
            if (kje != null) {
                d.c = kje;
                return d.b();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }
}
