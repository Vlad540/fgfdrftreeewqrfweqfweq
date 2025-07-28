package defpackage;

import androidx.media3.common.ParserException;
import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: ad  reason: default package */
public final class ad implements e75 {
    public static final int[] E0 = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] F0;
    public static final byte[] G0;
    public static final byte[] H0;
    public static final int I0;
    public i75 A0;
    public bpe B0;
    public vtc C0;
    public boolean D0;
    public int X;
    public int Y;
    public boolean Z;
    public final byte[] a;
    public final int b;
    public boolean c;
    public long o;
    public long w0;
    public int x0;
    public int y0;
    public long z0;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        F0 = iArr;
        int i = oze.a;
        Charset charset = f22.c;
        G0 = "#!AMR\n".getBytes(charset);
        H0 = "#!AMR-WB\n".getBytes(charset);
        I0 = iArr[8];
    }

    public ad(int i) {
        this.b = (i & 2) != 0 ? i | 1 : i;
        this.a = new byte[1];
        this.x0 = -1;
    }

    public final void S(i75 i75) {
        this.A0 = i75;
        this.B0 = i75.B(0, 1);
        i75.w();
    }

    public final int a(r74 r74) {
        boolean z;
        r74.Y = 0;
        byte[] bArr = this.a;
        r74.r(bArr, 0, 1, false);
        byte b2 = bArr[0];
        if ((b2 & 131) <= 0) {
            int i = (b2 >> 3) & 15;
            if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
                return z ? F0[i] : E0[i];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            sb.append(this.c ? "WB" : "NB");
            sb.append(" frame type ");
            sb.append(i);
            throw ParserException.a((RuntimeException) null, sb.toString());
        }
        throw ParserException.a((RuntimeException) null, "Invalid padding bits for frame header " + b2);
    }

    public final boolean b(r74 r74) {
        r74.Y = 0;
        byte[] bArr = G0;
        byte[] bArr2 = new byte[bArr.length];
        r74.r(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            r74.z(bArr.length);
            return true;
        }
        r74.Y = 0;
        byte[] bArr3 = H0;
        byte[] bArr4 = new byte[bArr3.length];
        r74.r(bArr4, 0, bArr3.length, false);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        r74.z(bArr3.length);
        return true;
    }

    public final void d(long j, long j2) {
        this.o = 0;
        this.X = 0;
        this.Y = 0;
        if (j != 0) {
            vtc vtc = this.C0;
            if (vtc instanceof fe3) {
                fe3 fe3 = (fe3) vtc;
                this.z0 = (Math.max(0, j - fe3.b) * 8000000) / ((long) fe3.X);
                return;
            }
        }
        this.z0 = 0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g(defpackage.g75 r20, le4 r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 1
            bpe r3 = r0.B0
            defpackage.oyb.l(r3)
            int r3 = defpackage.oze.a
            r3 = r1
            r74 r3 = (defpackage.r74) r3
            long r3 = r3.o
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L_0x0029
            r3 = r1
            r74 r3 = (defpackage.r74) r3
            boolean r3 = r0.b(r3)
            if (r3 == 0) goto L_0x0021
            goto L_0x0029
        L_0x0021:
            java.lang.String r0 = "Could not find AMR header."
            r1 = 0
            androidx.media3.common.ParserException r0 = androidx.media3.common.ParserException.a(r1, r0)
            throw r0
        L_0x0029:
            boolean r3 = r0.D0
            if (r3 != 0) goto L_0x005c
            r0.D0 = r2
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
            bpe r5 = r0.B0
            uu5 r6 = new uu5
            r6.<init>()
            java.lang.String r4 = defpackage.c49.l(r4)
            r6.m = r4
            int r4 = I0
            r6.n = r4
            r6.A = r2
            r6.B = r3
            xu5 r3 = new xu5
            r3.<init>(r6)
            r5.e(r3)
        L_0x005c:
            int r3 = r0.Y
            r4 = 20000(0x4e20, double:9.8813E-320)
            r6 = 0
            r7 = -1
            if (r3 != 0) goto L_0x0088
            r3 = r1
            r74 r3 = (defpackage.r74) r3     // Catch:{ EOFException -> 0x0086 }
            int r3 = r0.a(r3)     // Catch:{ EOFException -> 0x0086 }
            r0.X = r3     // Catch:{ EOFException -> 0x0086 }
            r0.Y = r3
            int r8 = r0.x0
            if (r8 != r7) goto L_0x007c
            r8 = r1
            r74 r8 = (defpackage.r74) r8
            long r8 = r8.o
            r0.w0 = r8
            r0.x0 = r3
        L_0x007c:
            int r8 = r0.x0
            if (r8 != r3) goto L_0x0088
            int r3 = r0.y0
            int r3 = r3 + r2
            r0.y0 = r3
            goto L_0x0088
        L_0x0086:
            r3 = r7
            goto L_0x00b1
        L_0x0088:
            bpe r3 = r0.B0
            int r8 = r0.Y
            int r3 = r3.c(r1, r8, r2)
            if (r3 != r7) goto L_0x0093
            goto L_0x0086
        L_0x0093:
            int r8 = r0.Y
            int r8 = r8 - r3
            r0.Y = r8
            if (r8 <= 0) goto L_0x009c
        L_0x009a:
            r3 = r6
            goto L_0x00b1
        L_0x009c:
            bpe r9 = r0.B0
            long r10 = r0.z0
            long r12 = r0.o
            long r10 = r10 + r12
            int r13 = r0.X
            r12 = 1
            r14 = 0
            r15 = 0
            r9.a(r10, r12, r13, r14, r15)
            long r8 = r0.o
            long r8 = r8 + r4
            r0.o = r8
            goto L_0x009a
        L_0x00b1:
            r74 r1 = (defpackage.r74) r1
            boolean r8 = r0.Z
            if (r8 == 0) goto L_0x00b8
            goto L_0x0110
        L_0x00b8:
            int r8 = r0.b
            r9 = r8 & 1
            if (r9 == 0) goto L_0x00fd
            r9 = -1
            long r12 = r1.c
            int r1 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00fd
            int r1 = r0.x0
            if (r1 == r7) goto L_0x00cf
            int r9 = r0.X
            if (r1 == r9) goto L_0x00cf
            goto L_0x00fd
        L_0x00cf:
            int r9 = r0.y0
            r10 = 20
            if (r9 >= r10) goto L_0x00d7
            if (r3 != r7) goto L_0x0110
        L_0x00d7:
            r7 = r8 & 2
            if (r7 == 0) goto L_0x00de
            r18 = r2
            goto L_0x00e0
        L_0x00de:
            r18 = r6
        L_0x00e0:
            long r6 = (long) r1
            r8 = 8000000(0x7a1200, double:3.952525E-317)
            long r6 = r6 * r8
            long r6 = r6 / r4
            int r4 = (int) r6
            fe3 r5 = new fe3
            long r14 = r0.w0
            r11 = r5
            r16 = r4
            r17 = r1
            r11.<init>(r12, r14, r16, r17, r18)
            r0.C0 = r5
            i75 r1 = r0.A0
            r1.M(r5)
            r0.Z = r2
            goto L_0x0110
        L_0x00fd:
            wc0 r1 = new wc0
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.<init>(r4)
            r0.C0 = r1
            i75 r4 = r0.A0
            r4.M(r1)
            r0.Z = r2
        L_0x0110:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ad.g(g75, le4):int");
    }

    public final boolean n(g75 g75) {
        return b((r74) g75);
    }

    public final void release() {
    }
}
