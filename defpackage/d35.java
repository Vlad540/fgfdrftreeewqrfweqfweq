package defpackage;

import android.media.MediaCodec;
import java.util.ArrayList;

/* renamed from: d35  reason: default package */
public final class d35 extends c35 {
    public final boolean T0;
    public final k13 U0;
    public final int V0;
    public final ArrayList W0 = new ArrayList();
    public juc X0;
    public int Y0;

    public d35(boolean z, jg8 jg8, int i, xw2 xw2, zs zsVar) {
        super(2, xw2, zsVar);
        this.T0 = z;
        this.U0 = jg8;
        this.V0 = i;
    }

    public final boolean G() {
        if (this.J0.d()) {
            this.I0.e();
            this.K0 = true;
            return false;
        }
        w54 w54 = this.J0;
        MediaCodec.BufferInfo bufferInfo = w54.f(false) ? w54.a : null;
        if (bufferInfo == null) {
            return false;
        }
        long j = bufferInfo.presentationTimeUs;
        long j2 = j - this.G0;
        if (j2 >= 0) {
            ArrayList arrayList = this.W0;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                if (((Long) arrayList.get(i)).longValue() == j) {
                    arrayList.remove(i);
                } else {
                    i++;
                }
            }
            if (this.I0.c() == this.Y0 || !this.I0.h(j2)) {
                return false;
            }
            this.J0.j(j2, true);
            return true;
        }
        this.J0.i();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r3.V0 == 1) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(defpackage.xu5 r4) {
        /*
            r3 = this;
            ojc r0 = r3.I0
            defpackage.oyb.l(r0)
            z23 r0 = r4.A
            boolean r0 = defpackage.z23.g(r0)
            if (r0 == 0) goto L_0x0013
            int r0 = r3.V0
            r1 = 1
            if (r0 != r1) goto L_0x0013
            goto L_0x0014
        L_0x0013:
            r1 = 0
        L_0x0014:
            ojc r0 = r3.I0
            android.view.Surface r0 = r0.a()
            r0.getClass()
            k13 r2 = r3.U0
            w54 r4 = r2.b(r4, r0, r1)
            r3.J0 = r4
            int r4 = r4.f
            r3.Y0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d35.H(xu5):void");
    }

    public final void J(n24 n24) {
        long j = n24.Z;
        if (j < this.A0) {
            this.W0.add(Long.valueOf(j));
        }
    }

    public final void K(xu5 xu5) {
        if (this.T0) {
            this.X0 = new juc(xu5);
        }
    }

    public final xu5 L(xu5 xu5) {
        if (this.V0 != 3 || !z23.g(xu5.A)) {
            return xu5;
        }
        uu5 a = xu5.a();
        a.z = z23.h;
        return a.a();
    }

    public final xu5 M(xu5 xu5) {
        z23 z23 = xu5.A;
        if (z23 == null || !z23.e()) {
            z23 = z23.h;
        }
        if (this.V0 == 1 && z23.g(z23)) {
            z23 = z23.h;
        }
        uu5 a = xu5.a();
        a.z = z23;
        return new xu5(a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b4  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x012c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean P(defpackage.n24 r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 4
            boolean r3 = r1.f(r2)
            r4 = 0
            if (r3 == 0) goto L_0x000d
            return r4
        L_0x000d:
            java.nio.ByteBuffer r3 = r1.X
            r3.getClass()
            juc r5 = r0.X0
            r6 = 1
            if (r5 == 0) goto L_0x0136
            long r7 = r1.Z
            long r9 = r0.H0
            long r7 = r7 - r9
            ckd r9 = r5.b
            if (r9 != 0) goto L_0x0024
            r5.k = r7
            goto L_0x0111
        L_0x0024:
            int r9 = r3.position()
            int r10 = r9 + 4
            r3.position(r10)
            byte[] r10 = r5.a
            r3.get(r10, r4, r2)
            java.lang.String r2 = "video/avc"
            java.lang.String r11 = r5.c
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0061
            byte r2 = r10[r4]
            r2 = r2 & 31
            byte r11 = r10[r6]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 >> 7
            if (r11 != r6) goto L_0x004a
            r11 = r6
            goto L_0x004b
        L_0x004a:
            r11 = r4
        L_0x004b:
            r12 = 14
            if (r2 != r12) goto L_0x0053
            if (r11 == 0) goto L_0x0053
            r2 = r6
            goto L_0x0054
        L_0x0053:
            r2 = r4
        L_0x0054:
            java.lang.String r11 = "Missing SVC extension prefix NAL unit."
            defpackage.oyb.j(r11, r2)
            r2 = 3
            byte r2 = r10[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 >> 5
            goto L_0x006e
        L_0x0061:
            java.lang.String r2 = "video/hevc"
            boolean r2 = r11.equals(r2)
            if (r2 == 0) goto L_0x0130
            byte r2 = r10[r6]
            r2 = r2 & 7
            int r2 = r2 - r6
        L_0x006e:
            iuc r10 = r5.i
            if (r10 == 0) goto L_0x007c
            long r11 = r10.b
            int r11 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r11 < 0) goto L_0x007c
            r5.a()
            goto L_0x006e
        L_0x007c:
            if (r10 == 0) goto L_0x0089
            long r10 = r10.a
            int r10 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r10 < 0) goto L_0x0089
            r5.a()
        L_0x0087:
            r4 = r5
            goto L_0x00a7
        L_0x0089:
            iuc r10 = r5.h
            if (r10 == 0) goto L_0x0087
            long r11 = r10.b
            int r13 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0087
            long r13 = r5.j
            r16 = r5
            long r4 = r10.a
            long r11 = r11 - r4
            int r4 = r10.c
            int r4 = r4 - r6
            long r4 = (long) r4
            long r11 = r11 * r4
            long r11 = r11 + r13
            r4 = r16
            r4.j = r11
            r5 = 0
            r4.h = r5
        L_0x00a7:
            iuc r5 = r4.h
            if (r5 == 0) goto L_0x00ae
            int r5 = r5.d
            goto L_0x00b0
        L_0x00ae:
            int r5 = r4.g
        L_0x00b0:
            r10 = 30
            if (r2 <= r5) goto L_0x00ed
            iuc r5 = r4.i
            if (r5 == 0) goto L_0x00eb
            int r12 = r5.d
            if (r2 < r12) goto L_0x00bd
            goto L_0x00eb
        L_0x00bd:
            long r13 = r5.a
            long r13 = r13 - r7
            long r13 = r13 * r10
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r13 = r13 / r16
            int r5 = r4.f
            int r12 = r5 - r12
            int r12 = r6 << r12
            int r12 = -r12
            float r12 = (float) r12
            r16 = 1055286886(0x3ee66666, float:0.45)
            float r12 = r12 + r16
            r15 = r6
        L_0x00d4:
            iuc r10 = r4.i
            int r10 = r10.d
            if (r15 >= r10) goto L_0x00eb
            float r10 = (float) r13
            int r11 = r5 - r15
            int r11 = r6 << r11
            float r11 = (float) r11
            float r11 = r11 + r12
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 >= 0) goto L_0x00eb
            if (r2 > r15) goto L_0x00e8
            goto L_0x00ed
        L_0x00e8:
            int r15 = r15 + 1
            goto L_0x00d4
        L_0x00eb:
            r2 = 0
            goto L_0x00ee
        L_0x00ed:
            r2 = r6
        L_0x00ee:
            long r10 = r4.j
            long r10 = r10 + r7
            iuc r5 = r4.h
            if (r5 == 0) goto L_0x00fe
            long r12 = r5.a
            long r7 = r7 - r12
            int r5 = r5.c
            int r5 = r5 - r6
            long r12 = (long) r5
            long r7 = r7 * r12
            long r10 = r10 + r7
        L_0x00fe:
            r7 = 30
            long r10 = r10 * r7
            float r5 = (float) r10
            float r7 = r4.e
            float r5 = r5 / r7
            int r5 = java.lang.Math.round(r5)
            long r7 = (long) r5
            r4.k = r7
            if (r2 == 0) goto L_0x012c
            r3.position(r9)
        L_0x0111:
            long r2 = r0.H0
            juc r4 = r0.X0
            long r7 = r4.k
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x0122
            r5 = r6
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            defpackage.oyb.k(r5)
            long r4 = r4.k
            long r2 = r2 + r4
            r1.Z = r2
            goto L_0x0136
        L_0x012c:
            r3.clear()
            return r6
        L_0x0130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0136:
            w54 r2 = r0.J0
            if (r2 != 0) goto L_0x014b
            long r2 = r1.Z
            long r4 = r0.G0
            long r2 = r2 - r4
            r1.Z = r2
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x014b
            r19.v()
            return r6
        L_0x014b:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d35.P(n24):boolean");
    }

    public final String l() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
