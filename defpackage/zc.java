package defpackage;

import com.google.android.exoplayer2.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: zc  reason: default package */
public final class zc implements d75 {
    public static final int[] p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] q;
    public static final byte[] r;
    public static final byte[] s;
    public static final int t;
    public final byte[] a = new byte[1];
    public final int b = 0;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public boolean g;
    public long h;
    public int i = -1;
    public int j;
    public long k;
    public h75 l;
    public ape m;
    public utc n;
    public boolean o;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        q = iArr;
        int i2 = mze.a;
        Charset charset = f22.c;
        r = "#!AMR\n".getBytes(charset);
        s = "#!AMR-WB\n".getBytes(charset);
        t = iArr[8];
    }

    public final int a(q74 q74) {
        boolean z;
        q74.Y = 0;
        byte[] bArr = this.a;
        q74.r(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) <= 0) {
            int i2 = (b2 >> 3) & 15;
            if (i2 >= 0 && i2 <= 15 && (((z = this.c) && (i2 < 10 || i2 > 13)) || (!z && (i2 < 12 || i2 > 14)))) {
                return z ? q[i2] : p[i2];
            }
            String str = this.c ? "WB" : "NB";
            StringBuilder sb = new StringBuilder(str.length() + 35);
            sb.append("Illegal AMR ");
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i2);
            throw ParserException.a((RuntimeException) null, sb.toString());
        }
        StringBuilder sb2 = new StringBuilder(42);
        sb2.append("Invalid padding bits for frame header ");
        sb2.append(b2);
        throw ParserException.a((RuntimeException) null, sb2.toString());
    }

    public final boolean b(q74 q74) {
        q74.Y = 0;
        byte[] bArr = r;
        byte[] bArr2 = new byte[bArr.length];
        q74.r(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            q74.z(bArr.length);
            return true;
        }
        q74.Y = 0;
        byte[] bArr3 = s;
        byte[] bArr4 = new byte[bArr3.length];
        q74.r(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        q74.z(bArr3.length);
        return true;
    }

    public final void d(long j2, long j3) {
        this.d = 0;
        this.e = 0;
        this.f = 0;
        if (j2 != 0) {
            utc utc = this.n;
            if (utc instanceof ee3) {
                ee3 ee3 = (ee3) utc;
                this.k = (Math.max(0, j2 - ee3.b) * 8000000) / ((long) ee3.e);
                return;
            }
        }
        this.k = 0;
    }

    public final void g(h75 h75) {
        this.l = h75;
        this.m = h75.B(0, 1);
        h75.w();
    }

    public final boolean h(f75 f75) {
        return b((q74) f75);
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int i(defpackage.f75 r20, le4 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            ape r3 = r0.m
            swb.i(r3)
            int r3 = defpackage.mze.a
            r3 = r1
            q74 r3 = (defpackage.q74) r3
            long r3 = r3.o
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0029
            r3 = r1
            q74 r3 = (defpackage.q74) r3
            boolean r3 = r0.b(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.lang.String r0 = "Could not find AMR header."
            r1 = 0
            com.google.android.exoplayer2.ParserException r0 = com.google.android.exoplayer2.ParserException.a(r1, r0)
            throw r0
        L_0x0029:
            boolean r3 = r0.o
            if (r3 != 0) goto L_0x0058
            r0.o = r2
            boolean r3 = r0.c
            if (r3 == 0) goto L_0x0036
            java.lang.String r4 = "audio/amr-wb"
            goto L_0x0038
        L_0x0036:
            java.lang.String r4 = "audio/3gpp"
        L_0x0038:
            if (r3 == 0) goto L_0x003d
            r3 = 16000(0x3e80, float:2.2421E-41)
            goto L_0x003f
        L_0x003d:
            r3 = 8000(0x1f40, float:1.121E-41)
        L_0x003f:
            ape r5 = r0.m
            tu5 r6 = new tu5
            r6.<init>()
            r6.k = r4
            int r4 = t
            r6.l = r4
            r6.x = r2
            r6.y = r3
            vu5 r3 = new vu5
            r3.<init>(r6)
            r5.d(r3)
        L_0x0058:
            int r3 = r0.f
            r4 = 20000(0x4e20, double:9.8813E-320)
            r6 = 0
            r7 = -1
            if (r3 != 0) goto L_0x0084
            r3 = r1
            q74 r3 = (defpackage.q74) r3     // Catch:{ EOFException -> 0x0082 }
            int r3 = r0.a(r3)     // Catch:{ EOFException -> 0x0082 }
            r0.e = r3     // Catch:{ EOFException -> 0x0082 }
            r0.f = r3
            int r8 = r0.i
            if (r8 != r7) goto L_0x0078
            r8 = r1
            q74 r8 = (defpackage.q74) r8
            long r8 = r8.o
            r0.h = r8
            r0.i = r3
        L_0x0078:
            int r8 = r0.i
            if (r8 != r3) goto L_0x0084
            int r3 = r0.j
            int r3 = r3 + r2
            r0.j = r3
            goto L_0x0084
        L_0x0082:
            r3 = r7
            goto L_0x00ad
        L_0x0084:
            ape r3 = r0.m
            int r8 = r0.f
            int r3 = r3.a(r1, r8, r2)
            if (r3 != r7) goto L_0x008f
            goto L_0x0082
        L_0x008f:
            int r8 = r0.f
            int r8 = r8 - r3
            r0.f = r8
            if (r8 <= 0) goto L_0x0098
        L_0x0096:
            r3 = r6
            goto L_0x00ad
        L_0x0098:
            ape r9 = r0.m
            long r10 = r0.k
            long r12 = r0.d
            long r10 = r10 + r12
            int r13 = r0.e
            r12 = 1
            r14 = 0
            r15 = 0
            r9.b(r10, r12, r13, r14, r15)
            long r8 = r0.d
            long r8 = r8 + r4
            r0.d = r8
            goto L_0x0096
        L_0x00ad:
            q74 r1 = (defpackage.q74) r1
            boolean r8 = r0.g
            if (r8 == 0) goto L_0x00b4
            goto L_0x010e
        L_0x00b4:
            int r8 = r0.b
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00fb
            r9 = -1
            long r12 = r1.c
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00fb
            int r1 = r0.i
            if (r1 == r7) goto L_0x00cb
            int r9 = r0.e
            if (r1 == r9) goto L_0x00cb
            goto L_0x00fb
        L_0x00cb:
            int r9 = r0.j
            r10 = 20
            if (r9 >= r10) goto L_0x00d3
            if (r3 != r7) goto L_0x010e
        L_0x00d3:
            r7 = r8 & 2
            if (r7 == 0) goto L_0x00da
            r18 = r2
            goto L_0x00dc
        L_0x00da:
            r18 = r6
        L_0x00dc:
            int r6 = r1 * 8
            long r6 = (long) r6
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r8
            long r6 = r6 / r4
            int r4 = (int) r6
            ee3 r5 = new ee3
            long r14 = r0.h
            r11 = r5
            r16 = r4
            r17 = r1
            r11.<init>(r12, r14, r16, r17, r18)
            r0.n = r5
            h75 r1 = r0.l
            r1.K(r5)
            r0.g = r2
            goto L_0x010e
        L_0x00fb:
            si5 r1 = new si5
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4)
            r0.n = r1
            h75 r4 = r0.l
            r4.K(r1)
            r0.g = r2
        L_0x010e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc.i(f75, le4):int");
    }

    public final void release() {
    }
}
