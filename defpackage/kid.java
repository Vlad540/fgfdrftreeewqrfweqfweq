package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: kid  reason: default package */
public final class kid implements s88, dj7 {
    public boolean A0;
    public byte[] B0;
    public int C0;
    public final jn X;
    public final woe Y;
    public final ArrayList Z = new ArrayList();
    public final yz3 a;
    public final nz3 b;
    public final cqe c;
    public final mk9 o;
    public final long w0;
    public final ul7 x0 = new ul7("SingleSampleMediaPeriod", 1);
    public final xu5 y0;
    public final boolean z0;

    public kid(yz3 yz3, nz3 nz3, cqe cqe, xu5 xu5, long j, mk9 mk9, jn jnVar, boolean z) {
        this.a = yz3;
        this.b = nz3;
        this.c = cqe;
        this.y0 = xu5;
        this.w0 = j;
        this.o = mk9;
        this.X = jnVar;
        this.z0 = z;
        this.Y = new woe(new uoe(BuildConfig.FLAVOR, xu5));
    }

    public final void E(gj7 gj7, long j, long j2) {
        jid jid = (jid) gj7;
        this.C0 = (int) jid.c.b;
        byte[] bArr = jid.o;
        bArr.getClass();
        this.B0 = bArr;
        this.A0 = true;
        Uri uri = jid.c.c;
        yi7 yi7 = new yi7(j2);
        this.o.getClass();
        this.X.z(yi7, 1, -1, this.y0, 0, (Object) null, 0, this.w0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final sz0 U(defpackage.gj7 r19, long r20, long r22, java.io.IOException r24, int r25) {
        /*
            r18 = this;
            r0 = r18
            r11 = r24
            r1 = r25
            r2 = 1
            r3 = r19
            jid r3 = (defpackage.jid) r3
            fsd r3 = r3.c
            yi7 r4 = new yi7
            android.net.Uri r3 = r3.c
            r5 = r22
            r4.<init>(r5)
            int r3 = defpackage.oze.a
            mk9 r3 = r0.o
            r3.getClass()
            boolean r3 = r11 instanceof androidx.media3.common.ParserException
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof java.io.FileNotFoundException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException
            if (r3 != 0) goto L_0x0057
            boolean r3 = r11 instanceof androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException
            if (r3 != 0) goto L_0x0057
            int r3 = androidx.media3.datasource.DataSourceException.b
            r3 = r11
        L_0x0035:
            if (r3 == 0) goto L_0x004a
            boolean r7 = r3 instanceof androidx.media3.datasource.DataSourceException
            if (r7 == 0) goto L_0x0045
            r7 = r3
            androidx.media3.datasource.DataSourceException r7 = (androidx.media3.datasource.DataSourceException) r7
            int r7 = r7.a
            r8 = 2008(0x7d8, float:2.814E-42)
            if (r7 != r8) goto L_0x0045
            goto L_0x0057
        L_0x0045:
            java.lang.Throwable r3 = r3.getCause()
            goto L_0x0035
        L_0x004a:
            int r3 = r1 + -1
            int r3 = r3 * 1000
            r7 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r7)
            long r7 = (long) r3
            r13 = r7
            goto L_0x0058
        L_0x0057:
            r13 = r5
        L_0x0058:
            int r3 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            r15 = 0
            if (r3 == 0) goto L_0x0063
            r5 = 3
            if (r1 < r5) goto L_0x0061
            goto L_0x0063
        L_0x0061:
            r1 = r15
            goto L_0x0064
        L_0x0063:
            r1 = r2
        L_0x0064:
            boolean r5 = r0.z0
            if (r5 == 0) goto L_0x0075
            if (r1 == 0) goto L_0x0075
            java.lang.String r1 = "Loading failed, treating as end-of-stream."
            defpackage.ez3.k0(r1, r11)
            r0.A0 = r2
            sz0 r1 = ul7.X
        L_0x0073:
            r13 = r1
            goto L_0x0085
        L_0x0075:
            if (r3 == 0) goto L_0x0082
            sz0 r1 = new sz0
            r16 = 5
            r17 = 0
            r12 = r1
            r12.<init>(r13, r15, r16, r17)
            goto L_0x0073
        L_0x0082:
            sz0 r1 = ul7.Y
            goto L_0x0073
        L_0x0085:
            boolean r1 = r13.a()
            r12 = r1 ^ 1
            r7 = 0
            long r9 = r0.w0
            jn r1 = r0.X
            r2 = 1
            r3 = -1
            xu5 r5 = r0.y0
            r6 = 0
            r14 = 0
            r0 = r1
            r1 = r4
            r4 = r5
            r5 = r6
            r6 = r14
            r11 = r24
            r0.B(r1, r2, r3, r4, r5, r6, r7, r9, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kid.U(gj7, long, long, java.io.IOException, int):sz0");
    }

    public final boolean b() {
        return this.x0.A();
    }

    public final long f() {
        return (this.A0 || this.x0.A()) ? Long.MIN_VALUE : 0;
    }

    public final long g(g55[] g55Arr, boolean[] zArr, yjc[] yjcArr, boolean[] zArr2, long j) {
        for (int i = 0; i < g55Arr.length; i++) {
            yjc yjc = yjcArr[i];
            ArrayList arrayList = this.Z;
            if (yjc != null && (g55Arr[i] == null || !zArr[i])) {
                arrayList.remove(yjc);
                yjcArr[i] = null;
            }
            if (yjcArr[i] == null && g55Arr[i] != null) {
                iid iid = new iid(this);
                arrayList.add(iid);
                yjcArr[i] = iid;
                zArr2[i] = true;
            }
        }
        return j;
    }

    public final long h(long j, xtc xtc) {
        return j;
    }

    public final void i() {
    }

    public final long k(long j) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.Z;
            if (i >= arrayList.size()) {
                return j;
            }
            iid iid = (iid) arrayList.get(i);
            if (iid.a == 2) {
                iid.a = 1;
            }
            i++;
        }
    }

    public final void l(q88 q88, long j) {
        q88.c(this);
    }

    public final boolean m(qj7 qj7) {
        if (this.A0) {
            return false;
        }
        ul7 ul7 = this.x0;
        if (ul7.A() || ul7.w()) {
            return false;
        }
        qz3 a2 = this.b.a();
        cqe cqe = this.c;
        if (cqe != null) {
            a2.H(cqe);
        }
        jid jid = new jid(a2, this.a);
        this.o.getClass();
        this.X.F(new yi7(jid.a, this.a, ul7.F(jid, this, 3)), 1, -1, this.y0, 0, (Object) null, 0, this.w0);
        return true;
    }

    public final long o() {
        return -9223372036854775807L;
    }

    public final woe p() {
        return this.Y;
    }

    public final long r() {
        return this.A0 ? Long.MIN_VALUE : 0;
    }

    public final void s(long j, boolean z) {
    }

    public final void u(long j) {
    }

    public final void x(gj7 gj7, long j, long j2, boolean z) {
        Uri uri = ((jid) gj7).c.c;
        yi7 yi7 = new yi7(j2);
        this.o.getClass();
        this.X.x(yi7, 1, -1, (xu5) null, 0, (Object) null, 0, this.w0);
    }
}
