package defpackage;

import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: z57  reason: default package */
public final class z57 extends nle {
    public static final int w0;
    public static final int x0;
    public static final int y0;
    public static final bzc z0 = z94.a;
    public final int X = y0;
    public final bzc Y = z0;
    public final char Z = '\"';
    public final transient d22 a;
    public final transient qu0 b;
    public final int c = w0;
    public final int o = x0;

    static {
        int[] w = hr1.w(4);
        int length = w.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = w[i];
            if (i3 != 0) {
                i2 |= wn6.b(i3);
                i++;
            } else {
                throw null;
            }
        }
        w0 = i2;
        int i4 = 0;
        for (g67 g67 : g67.values()) {
            if (g67.a) {
                i4 |= g67.b;
            }
        }
        x0 = i4;
        int i5 = 0;
        for (a67 a67 : a67.values()) {
            if (a67.a) {
                i5 |= a67.b;
            }
        }
        y0 = i5;
    }

    public z57() {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = new d22((((int) currentTimeMillis) + ((int) (currentTimeMillis >>> 32))) | 1);
        long currentTimeMillis2 = System.currentTimeMillis();
        this.b = new qu0((((int) currentTimeMillis2) + ((int) (currentTimeMillis2 >>> 32))) | 1);
    }

    public tn6 a(Object obj, boolean z) {
        return new tn6(i(), obj, z);
    }

    public b67 b(Writer writer, tn6 tn6) {
        evf evf = new evf(tn6, this.X, writer, this.Z);
        bzc bzc = this.Y;
        if (bzc != z0) {
            evf.Z = bzc;
        }
        return evf;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: ste} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: ste} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v68, resolved type: ste} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x018f  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0128  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.i67 c(java.io.InputStream r26, defpackage.tn6 r27) {
        /*
            r25 = this;
            r0 = r25
            r3 = r26
            r8 = r27
            byte[] r1 = r8.e
            if (r1 != 0) goto L_0x0237
            hs0 r1 = r8.d
            r1.getClass()
            int[] r2 = defpackage.hs0.c
            r4 = 0
            r2 = r2[r4]
            if (r2 <= 0) goto L_0x0017
            goto L_0x0018
        L_0x0017:
            r2 = r4
        L_0x0018:
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r1.a
            r5 = 0
            java.lang.Object r1 = r1.getAndSet(r4, r5)
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0029
            int r6 = r1.length
            if (r6 >= r2) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r6 = r1
            goto L_0x002c
        L_0x0029:
            byte[] r1 = new byte[r2]
            goto L_0x0027
        L_0x002c:
            r8.e = r6
            int r1 = r4 - r4
            r2 = r4
        L_0x0031:
            r9 = 4
            r10 = 1
            if (r1 >= r9) goto L_0x0046
            if (r3 != 0) goto L_0x0039
            r11 = -1
            goto L_0x003f
        L_0x0039:
            int r11 = r6.length
            int r11 = r11 - r2
            int r11 = r3.read(r6, r2, r11)
        L_0x003f:
            if (r11 >= r10) goto L_0x0043
            r1 = r4
            goto L_0x0047
        L_0x0043:
            int r2 = r2 + r11
            int r1 = r1 + r11
            goto L_0x0031
        L_0x0046:
            r1 = r10
        L_0x0047:
            r11 = 65280(0xff00, float:9.1477E-41)
            r12 = 16
            r13 = 3
            r14 = 8
            r15 = 2
            java.lang.String r7 = "Internal error"
            if (r1 == 0) goto L_0x00ed
            byte r1 = r6[r4]
            int r1 = r1 << 24
            r16 = 0
            int r16 = r16 + 1
            byte r4 = r6[r16]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << r12
            r1 = r1 | r4
            r4 = 0
            int r4 = r4 + r15
            byte r12 = r6[r4]
            r12 = r12 & 255(0xff, float:3.57E-43)
            int r12 = r12 << r14
            r1 = r1 | r12
            r12 = 0
            int r12 = r12 + r13
            byte r13 = r6[r12]
            r13 = r13 & 255(0xff, float:3.57E-43)
            r1 = r1 | r13
            r13 = -16842752(0xfffffffffeff0000, float:-1.6947657E38)
            java.lang.String r16 = "3412"
            if (r1 == r13) goto L_0x00e9
            r13 = -131072(0xfffffffffffe0000, float:NaN)
            if (r1 == r13) goto L_0x00de
            r13 = 65279(0xfeff, float:9.1475E-41)
            if (r1 == r13) goto L_0x00da
            java.lang.String r17 = "2143"
            r14 = 65534(0xfffe, float:9.1833E-41)
            if (r1 == r14) goto L_0x00d6
            int r10 = r1 >>> 16
            if (r10 != r13) goto L_0x008f
            r1 = r4
            r5 = r15
        L_0x008d:
            r4 = 1
            goto L_0x00e2
        L_0x008f:
            if (r10 != r14) goto L_0x0095
            r1 = r4
            r5 = r15
        L_0x0093:
            r4 = 0
            goto L_0x00e2
        L_0x0095:
            int r4 = r1 >>> 8
            r13 = 15711167(0xefbbbf, float:2.2016034E-38)
            if (r4 != r13) goto L_0x00a0
            r1 = r12
            r4 = 1
            r5 = 1
            goto L_0x00e2
        L_0x00a0:
            int r4 = r1 >> 8
            if (r4 != 0) goto L_0x00a6
            r1 = 1
            goto L_0x00ad
        L_0x00a6:
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r4 = r4 & r1
            if (r4 != 0) goto L_0x00b2
            r1 = 0
        L_0x00ad:
            r5 = r9
        L_0x00ae:
            r4 = 0
            r10 = 1
            goto L_0x0126
        L_0x00b2:
            r4 = -16711681(0xffffffffff00ffff, float:-1.714704E38)
            r4 = r4 & r1
            if (r4 == 0) goto L_0x00d2
            r4 = -65281(0xffffffffffff00ff, float:NaN)
            r1 = r1 & r4
            if (r1 == 0) goto L_0x00ce
            r1 = r10 & r11
            if (r1 != 0) goto L_0x00c4
            r1 = 1
            goto L_0x00c9
        L_0x00c4:
            r1 = r10 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x00cb
            r1 = 0
        L_0x00c9:
            r5 = r15
            goto L_0x00ae
        L_0x00cb:
            r1 = 0
            goto L_0x0145
        L_0x00ce:
            defpackage.pfa.B(r17)
            throw r5
        L_0x00d2:
            defpackage.pfa.B(r16)
            throw r5
        L_0x00d6:
            defpackage.pfa.B(r17)
            throw r5
        L_0x00da:
            r1 = 0
            int r1 = r1 + r9
            r5 = r9
            goto L_0x008d
        L_0x00de:
            r1 = 0
            int r1 = r1 + r9
            r5 = r9
            goto L_0x0093
        L_0x00e2:
            r10 = 1
            r24 = r4
            r4 = r1
            r1 = r24
            goto L_0x0126
        L_0x00e9:
            defpackage.pfa.B(r16)
            throw r5
        L_0x00ed:
            int r1 = r2 + 0
        L_0x00ef:
            if (r1 >= r15) goto L_0x0105
            if (r3 != 0) goto L_0x00f6
            r4 = -1
        L_0x00f4:
            r5 = 1
            goto L_0x00fd
        L_0x00f6:
            int r4 = r6.length
            int r4 = r4 - r2
            int r4 = r3.read(r6, r2, r4)
            goto L_0x00f4
        L_0x00fd:
            if (r4 >= r5) goto L_0x0102
            r18 = 0
            goto L_0x0108
        L_0x0102:
            int r2 = r2 + r4
            int r1 = r1 + r4
            goto L_0x00ef
        L_0x0105:
            r5 = 1
            r18 = r5
        L_0x0108:
            if (r18 == 0) goto L_0x00cb
            r1 = 0
            byte r4 = r6[r1]
            r4 = r4 & 255(0xff, float:3.57E-43)
            r10 = 8
            int r4 = r4 << r10
            r10 = 0
            int r10 = r10 + r5
            byte r5 = r6[r10]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r4 = r4 | r5
            r5 = r4 & r11
            if (r5 != 0) goto L_0x011f
            r4 = 1
            goto L_0x0124
        L_0x011f:
            r4 = r4 & 255(0xff, float:3.57E-43)
            if (r4 != 0) goto L_0x0145
            r4 = r1
        L_0x0124:
            r5 = r15
            goto L_0x00e2
        L_0x0126:
            if (r5 == r10) goto L_0x0141
            if (r5 == r15) goto L_0x013a
            if (r5 != r9) goto L_0x0134
            if (r1 == 0) goto L_0x012f
            goto L_0x0130
        L_0x012f:
            r9 = 5
        L_0x0130:
            r10 = r2
            r5 = r9
        L_0x0132:
            r9 = r4
            goto L_0x0148
        L_0x0134:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L_0x013a:
            if (r1 == 0) goto L_0x013e
            r5 = r15
            goto L_0x013f
        L_0x013e:
            r5 = 3
        L_0x013f:
            r10 = r2
            goto L_0x0132
        L_0x0141:
            r10 = r2
            r9 = r4
        L_0x0143:
            r5 = 1
            goto L_0x0148
        L_0x0145:
            r9 = r1
            r10 = r2
            goto L_0x0143
        L_0x0148:
            r8.b = r5
            int r11 = r0.o
            int r12 = r0.c
            r1 = 1
            if (r5 != r1) goto L_0x018f
            boolean r2 = wn6.a(r15, r12)
            if (r2 == 0) goto L_0x018f
            qu0 r0 = r0.b
            r0.getClass()
            qu0 r4 = new qu0
            boolean r20 = wn6.a(r1, r12)
            r1 = 3
            boolean r22 = wn6.a(r1, r12)
            java.util.concurrent.atomic.AtomicReference r1 = r0.b
            java.lang.Object r1 = r1.get()
            r23 = r1
            pu0 r23 = (defpackage.pu0) r23
            int r1 = r0.c
            r18 = r4
            r19 = r0
            r21 = r1
            r18.<init>(r19, r20, r21, r22, r23)
            tte r12 = new tte
            r13 = 1
            r0 = r12
            r1 = r27
            r2 = r11
            r3 = r26
            r5 = r6
            r6 = r9
            r7 = r10
            r8 = r9
            r9 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x0236
        L_0x018f:
            r0c r13 = new r0c
            int r14 = r8.b
            r1 = 1
            if (r14 == r1) goto L_0x01ab
            r1 = 2
            r2 = 16
            if (r14 == r1) goto L_0x01a6
            r1 = 3
            if (r14 == r1) goto L_0x01a6
            r1 = 4
            r2 = 32
            if (r14 == r1) goto L_0x01a6
            r1 = 5
            if (r14 != r1) goto L_0x01a9
        L_0x01a6:
            r1 = 8
            goto L_0x01ae
        L_0x01a9:
            r0 = 0
            throw r0
        L_0x01ab:
            r2 = 8
            goto L_0x01a6
        L_0x01ae:
            if (r2 == r1) goto L_0x01e3
            r1 = 16
            if (r2 == r1) goto L_0x01e3
            r1 = 32
            if (r2 != r1) goto L_0x01dd
            ste r14 = new ste
            int r1 = r8.b
            r2 = 0
            r4 = 1
            if (r1 == r4) goto L_0x01cc
            r5 = 2
            if (r1 == r5) goto L_0x01d0
            r5 = 3
            if (r1 == r5) goto L_0x01cc
            r5 = 4
            if (r1 == r5) goto L_0x01d0
            r4 = 5
            if (r1 != r4) goto L_0x01ce
        L_0x01cc:
            r7 = r2
            goto L_0x01d1
        L_0x01ce:
            r0 = 0
            throw r0
        L_0x01d0:
            r7 = r4
        L_0x01d1:
            r1 = r14
            r2 = r27
            r3 = r26
            r4 = r6
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x0221
        L_0x01dd:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r7)
            throw r0
        L_0x01e3:
            if (r3 != 0) goto L_0x01eb
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6, r9, r10)
            goto L_0x01fc
        L_0x01eb:
            if (r9 >= r10) goto L_0x01fb
            mm8 r7 = new mm8
            r1 = r7
            r2 = r27
            r3 = r26
            r4 = r6
            r5 = r9
            r6 = r10
            r1.<init>(r2, r3, r4, r5, r6)
            goto L_0x01fc
        L_0x01fb:
            r1 = r3
        L_0x01fc:
            java.io.InputStreamReader r2 = new java.io.InputStreamReader
            r3 = 1
            if (r14 == r3) goto L_0x021b
            r3 = 2
            if (r14 == r3) goto L_0x0218
            r3 = 3
            if (r14 == r3) goto L_0x0215
            r3 = 4
            if (r14 == r3) goto L_0x0212
            r3 = 5
            if (r14 != r3) goto L_0x0210
            java.lang.String r3 = "UTF-32LE"
            goto L_0x021d
        L_0x0210:
            r0 = 0
            throw r0
        L_0x0212:
            java.lang.String r3 = "UTF-32BE"
            goto L_0x021d
        L_0x0215:
            java.lang.String r3 = "UTF-16LE"
            goto L_0x021d
        L_0x0218:
            java.lang.String r3 = "UTF-16BE"
            goto L_0x021d
        L_0x021b:
            java.lang.String r3 = "UTF-8"
        L_0x021d:
            r2.<init>(r1, r3)
            r14 = r2
        L_0x0221:
            d22 r1 = new d22
            d22 r0 = r0.a
            java.util.concurrent.atomic.AtomicReference r2 = r0.b
            java.lang.Object r2 = r2.get()
            c22 r2 = (defpackage.c22) r2
            int r3 = r0.c
            r1.<init>(r0, r12, r3, r2)
            r13.<init>(r8, r11, r14, r1)
            r12 = r13
        L_0x0236:
            return r12
        L_0x0237:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Trying to call same allocXxx() method second time"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z57.c(java.io.InputStream, tn6):i67");
    }

    public i67 d(Reader reader, tn6 tn6) {
        int i = this.c;
        d22 d22 = this.a;
        return new r0c(tn6, this.o, reader, new d22(d22, i, d22.c, (c22) d22.b.get()));
    }

    public i67 e(char[] cArr, int i, int i2, tn6 tn6, boolean z) {
        int i3 = this.c;
        d22 d22 = this.a;
        int i4 = d22.c;
        return new r0c(tn6, this.o, new d22(d22, i3, i4, (c22) d22.b.get()), cArr, i, i + i2, z);
    }

    public final InputStream f(InputStream inputStream, tn6 tn6) {
        return inputStream;
    }

    public final Reader g(Reader reader, tn6 tn6) {
        return reader;
    }

    public final Writer h(Writer writer, tn6 tn6) {
        return writer;
    }

    public hs0 i() {
        SoftReference softReference;
        if (!wn6.a(4, this.c)) {
            return new hs0();
        }
        ThreadLocal threadLocal = is0.b;
        SoftReference softReference2 = (SoftReference) threadLocal.get();
        hs0 hs0 = softReference2 == null ? null : (hs0) softReference2.get();
        if (hs0 == null) {
            hs0 = new hs0();
            s5c s5c = is0.a;
            if (s5c != null) {
                ReferenceQueue referenceQueue = (ReferenceQueue) s5c.c;
                softReference = new SoftReference(hs0, referenceQueue);
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) s5c.b;
                concurrentHashMap.put(softReference, Boolean.TRUE);
                while (true) {
                    SoftReference softReference3 = (SoftReference) referenceQueue.poll();
                    if (softReference3 == null) {
                        break;
                    }
                    concurrentHashMap.remove(softReference3);
                }
            } else {
                softReference = new SoftReference(hs0);
            }
            threadLocal.set(softReference);
        }
        return hs0;
    }

    public boolean j() {
        return true;
    }

    public b67 k(Writer writer) {
        tn6 a2 = a(writer, false);
        return b(h(writer, a2), a2);
    }

    public i67 l(InputStream inputStream) {
        tn6 a2 = a(inputStream, false);
        return c(f(inputStream, a2), a2);
    }

    public i67 m(Reader reader) {
        tn6 a2 = a(reader, false);
        return d(g(reader, a2), a2);
    }

    public i67 n(String str) {
        int length = str.length();
        if (length > 32768 || !j()) {
            return m(new StringReader(str));
        }
        tn6 a2 = a(str, true);
        if (a2.f == null) {
            char[] a3 = a2.d.a(0, length);
            a2.f = a3;
            str.getChars(0, length, a3, 0);
            return e(a3, 0, length, a2, true);
        }
        throw new IllegalStateException("Trying to call same allocXxx() method second time");
    }
}
