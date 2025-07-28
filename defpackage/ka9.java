package defpackage;

import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ka9  reason: default package */
public final class ka9 extends d8 {
    public static final lg8 j = oyb.A("multipart/form-data");
    public static final byte[] k = {(byte) 58, (byte) 32};
    public static final byte[] l = {(byte) 13, (byte) 10};
    public static final byte[] m;
    public final lg8 f;
    public long g = -1;
    public final uu0 h;
    public final List i;

    static {
        Pattern pattern = lg8.d;
        oyb.A("multipart/mixed");
        oyb.A("multipart/alternative");
        oyb.A("multipart/digest");
        oyb.A("multipart/parallel");
        byte b = (byte) 45;
        m = new byte[]{b, b};
    }

    public ka9(uu0 uu0, lg8 lg8, List list) {
        super(3);
        this.h = uu0;
        this.i = list;
        Pattern pattern = lg8.d;
        this.f = oyb.A(lg8 + "; boundary=" + uu0.j());
    }

    public final void J(zs0 zs0) {
        K(zs0, false);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: zs0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: zs0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: wr0} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: zs0} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long K(defpackage.zs0 r17, boolean r18) {
        /*
            r16 = this;
            r0 = r16
            if (r18 == 0) goto L_0x000b
            wr0 r1 = new wr0
            r1.<init>()
            r2 = r1
            goto L_0x000f
        L_0x000b:
            r1 = 0
            r2 = r1
            r1 = r17
        L_0x000f:
            java.util.List r3 = r0.i
            int r4 = r3.size()
            r5 = 0
            r6 = 0
            r8 = r5
        L_0x0019:
            uu0 r9 = r0.h
            byte[] r10 = m
            byte[] r11 = l
            if (r8 >= r4) goto L_0x009d
            java.lang.Object r12 = r3.get(r8)
            ja9 r12 = (defpackage.ja9) r12
            ye6 r13 = r12.a
            r1.write(r10)
            r1.M(r9)
            r1.write(r11)
            if (r13 == 0) goto L_0x0057
            int r9 = r13.size()
            r10 = r5
        L_0x0039:
            if (r10 >= r9) goto L_0x0057
            java.lang.String r14 = r13.b(r10)
            zs0 r14 = r1.L(r14)
            byte[] r15 = k
            zs0 r14 = r14.write(r15)
            java.lang.String r15 = r13.d(r10)
            zs0 r14 = r14.L(r15)
            r14.write(r11)
            int r10 = r10 + 1
            goto L_0x0039
        L_0x0057:
            d8 r9 = r12.b
            lg8 r10 = r9.i()
            if (r10 == 0) goto L_0x006e
            java.lang.String r12 = "Content-Type: "
            zs0 r12 = r1.L(r12)
            java.lang.String r10 = r10.a
            zs0 r10 = r12.L(r10)
            r10.write(r11)
        L_0x006e:
            long r12 = r9.h()
            r14 = -1
            int r10 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r10 == 0) goto L_0x0086
            java.lang.String r10 = "Content-Length: "
            zs0 r10 = r1.L(r10)
            zs0 r10 = r10.i0(r12)
            r10.write(r11)
            goto L_0x008c
        L_0x0086:
            if (r18 == 0) goto L_0x008c
            r2.m()
            return r14
        L_0x008c:
            r1.write(r11)
            if (r18 == 0) goto L_0x0093
            long r6 = r6 + r12
            goto L_0x0096
        L_0x0093:
            r9.J(r1)
        L_0x0096:
            r1.write(r11)
            int r8 = r8 + 1
            goto L_0x0019
        L_0x009d:
            r1.write(r10)
            r1.M(r9)
            r1.write(r10)
            r1.write(r11)
            if (r18 == 0) goto L_0x00b1
            long r0 = r2.b
            long r6 = r6 + r0
            r2.m()
        L_0x00b1:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka9.K(zs0, boolean):long");
    }

    public final long h() {
        long j2 = this.g;
        if (j2 != -1) {
            return j2;
        }
        long K = K((zs0) null, true);
        this.g = K;
        return K;
    }

    public final lg8 i() {
        return this.f;
    }
}
