package defpackage;

import androidx.work.WorkRequest;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* renamed from: ztf  reason: default package */
public final class ztf {
    public static final String u = a24.e0("WorkSpec");
    public static final sr1 v = new sr1(17);
    public final String a;
    public ctf b;
    public final String c;
    public String d;
    public zy3 e;
    public final zy3 f;
    public long g;
    public long h;
    public long i;
    public if3 j;
    public int k;
    public he0 l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public vga r;
    public final int s;
    public final int t;

    public ztf(String str, ctf ctf, String str2, String str3, zy3 zy3, zy3 zy32, long j2, long j3, long j4, if3 if3, int i2, he0 he0, long j5, long j6, long j7, long j8, boolean z, vga vga, int i3, int i4) {
        this.a = str;
        this.b = ctf;
        this.c = str2;
        this.d = str3;
        this.e = zy3;
        this.f = zy32;
        this.g = j2;
        this.h = j3;
        this.i = j4;
        this.j = if3;
        this.k = i2;
        this.l = he0;
        this.m = j5;
        this.n = j6;
        this.o = j7;
        this.p = j8;
        this.q = z;
        this.r = vga;
        this.s = i3;
        this.t = i4;
    }

    public static ztf b(ztf ztf, String str, ctf ctf, String str2, zy3 zy3, int i2, long j2, int i3, int i4) {
        ztf ztf2 = ztf;
        int i5 = i4;
        String str3 = (i5 & 1) != 0 ? ztf2.a : str;
        ctf ctf2 = (i5 & 2) != 0 ? ztf2.b : ctf;
        String str4 = (i5 & 4) != 0 ? ztf2.c : str2;
        String str5 = ztf2.d;
        zy3 zy32 = (i5 & 16) != 0 ? ztf2.e : zy3;
        zy3 zy33 = ztf2.f;
        long j3 = ztf2.g;
        long j4 = ztf2.h;
        long j5 = ztf2.i;
        if3 if3 = ztf2.j;
        int i6 = (i5 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 ? ztf2.k : i2;
        long j6 = j5;
        he0 he0 = ztf2.l;
        int i7 = i5 & 8192;
        long j7 = ztf2.m;
        long j8 = i7 != 0 ? ztf2.n : j2;
        long j9 = ztf2.o;
        long j10 = ztf2.p;
        boolean z = ztf2.q;
        if3 if32 = if3;
        vga vga = ztf2.r;
        int i8 = ztf2.s;
        int i9 = (i5 & 524288) != 0 ? ztf2.t : i3;
        ztf.getClass();
        return new ztf(str3, ctf2, str4, str5, zy32, zy33, j3, j4, j6, if32, i6, he0, j7, j8, j9, j10, z, vga, i8, i9);
    }

    public final long a() {
        int i2;
        if (this.b != ctf.a || (i2 = this.k) <= 0) {
            long j2 = 0;
            if (d()) {
                int i3 = this.s;
                long j3 = this.n;
                if (i3 == 0) {
                    j3 += this.g;
                }
                long j4 = this.i;
                long j5 = this.h;
                if (j4 != j5) {
                    if (i3 == 0) {
                        j2 = ((long) -1) * j4;
                    }
                    j3 += j5;
                } else if (i3 != 0) {
                    j2 = j5;
                }
                return j2 + j3;
            }
            long j6 = this.n;
            if (j6 == 0) {
                j6 = System.currentTimeMillis();
            }
            return j6 + this.g;
        }
        long scalb = this.l == he0.b ? this.m * ((long) i2) : (long) Math.scalb((float) this.m, i2 - 1);
        long j7 = this.n;
        if (scalb > WorkRequest.MAX_BACKOFF_MILLIS) {
            scalb = 18000000;
        }
        return scalb + j7;
    }

    public final boolean c() {
        return !if3.i.equals(this.j);
    }

    public final boolean d() {
        return this.h != 0;
    }

    public final void e(long j2) {
        int i2 = (j2 > WorkRequest.MAX_BACKOFF_MILLIS ? 1 : (j2 == WorkRequest.MAX_BACKOFF_MILLIS ? 0 : -1));
        String str = u;
        if (i2 > 0) {
            a24.B().k0(str, "Backoff delay duration exceeds maximum value");
        }
        if (j2 < WorkRequest.MIN_BACKOFF_MILLIS) {
            a24.B().k0(str, "Backoff delay duration less than minimum value");
        }
        this.m = gwf.k(j2, WorkRequest.MIN_BACKOFF_MILLIS, WorkRequest.MAX_BACKOFF_MILLIS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztf)) {
            return false;
        }
        ztf ztf = (ztf) obj;
        return hhd.f(this.a, ztf.a) && this.b == ztf.b && hhd.f(this.c, ztf.c) && hhd.f(this.d, ztf.d) && hhd.f(this.e, ztf.e) && hhd.f(this.f, ztf.f) && this.g == ztf.g && this.h == ztf.h && this.i == ztf.i && hhd.f(this.j, ztf.j) && this.k == ztf.k && this.l == ztf.l && this.m == ztf.m && this.n == ztf.n && this.o == ztf.o && this.p == ztf.p && this.q == ztf.q && this.r == ztf.r && this.s == ztf.s && this.t == ztf.t;
    }

    public final int hashCode() {
        int d2 = me4.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int hashCode = str == null ? 0 : str.hashCode();
        int m2 = sxe.m(sxe.m(sxe.m(sxe.m((this.l.hashCode() + c3d.d(this.k, (this.j.hashCode() + sxe.m(sxe.m(sxe.m((this.f.hashCode() + ((this.e.hashCode() + ((d2 + hashCode) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31, 31)) * 31, 31, this.m), 31, this.n), 31, this.o), 31, this.p);
        boolean z = this.q;
        if (z) {
            z = true;
        }
        return Integer.hashCode(this.t) + c3d.d(this.s, (this.r.hashCode() + ((m2 + (z ? 1 : 0)) * 31)) * 31, 31);
    }

    public final String toString() {
        return me4.l(new StringBuilder("{WorkSpec: "), this.a, '}');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ztf(java.lang.String r31, defpackage.ctf r32, java.lang.String r33, java.lang.String r34, defpackage.zy3 r35, defpackage.zy3 r36, long r37, long r39, long r41, defpackage.if3 r43, int r44, defpackage.he0 r45, long r46, long r48, long r50, long r52, boolean r54, defpackage.vga r55, int r56, int r57, int r58) {
        /*
            r30 = this;
            r0 = r57
            r1 = r0 & 2
            if (r1 == 0) goto L_0x000a
            ctf r1 = defpackage.ctf.a
            r4 = r1
            goto L_0x000c
        L_0x000a:
            r4 = r32
        L_0x000c:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0013
            r1 = 0
            r6 = r1
            goto L_0x0015
        L_0x0013:
            r6 = r34
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001d
            zy3 r1 = defpackage.zy3.b
            r7 = r1
            goto L_0x001f
        L_0x001d:
            r7 = r35
        L_0x001f:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0027
            zy3 r1 = defpackage.zy3.b
            r8 = r1
            goto L_0x0029
        L_0x0027:
            r8 = r36
        L_0x0029:
            r1 = r0 & 64
            r2 = 0
            if (r1 == 0) goto L_0x0031
            r9 = r2
            goto L_0x0033
        L_0x0031:
            r9 = r37
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r39
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0041
            r13 = r2
            goto L_0x0043
        L_0x0041:
            r13 = r41
        L_0x0043:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004b
            if3 r1 = defpackage.if3.i
            r15 = r1
            goto L_0x004d
        L_0x004b:
            r15 = r43
        L_0x004d:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r5 = 0
            if (r1 == 0) goto L_0x0055
            r16 = r5
            goto L_0x0057
        L_0x0055:
            r16 = r44
        L_0x0057:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            he0 r1 = defpackage.he0.a
            r17 = r1
            goto L_0x0062
        L_0x0060:
            r17 = r45
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0069
            r18 = 30000(0x7530, double:1.4822E-319)
            goto L_0x006b
        L_0x0069:
            r18 = r46
        L_0x006b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0072
            r20 = r2
            goto L_0x0074
        L_0x0072:
            r20 = r48
        L_0x0074:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007b
            r22 = r2
            goto L_0x007d
        L_0x007b:
            r22 = r50
        L_0x007d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r1 = -1
            r24 = r1
            goto L_0x008a
        L_0x0088:
            r24 = r52
        L_0x008a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r26 = r5
            goto L_0x0094
        L_0x0092:
            r26 = r54
        L_0x0094:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009e
            vga r1 = defpackage.vga.a
            r27 = r1
            goto L_0x00a0
        L_0x009e:
            r27 = r55
        L_0x00a0:
            r1 = 262144(0x40000, float:3.67342E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00a8
            r28 = r5
            goto L_0x00aa
        L_0x00a8:
            r28 = r56
        L_0x00aa:
            r29 = 0
            r2 = r30
            r3 = r31
            r5 = r33
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r11, r13, r15, r16, r17, r18, r20, r22, r24, r26, r27, r28, r29)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztf.<init>(java.lang.String, ctf, java.lang.String, java.lang.String, zy3, zy3, long, long, long, if3, int, he0, long, long, long, long, boolean, vga, int, int, int):void");
    }
}
