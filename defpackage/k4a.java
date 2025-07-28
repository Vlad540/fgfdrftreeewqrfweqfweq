package defpackage;

/* renamed from: k4a  reason: default package */
public final class k4a implements dm4 {
    public final String a = k4a.class.getName();
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public k4a(t97 t97, t97 t972, t97 t973) {
        this.b = t97;
        this.c = t972;
        this.d = t973;
    }

    public final j4a a(j4a j4a, Long l) {
        if (!(j4a instanceof j4a)) {
            return j4a;
        }
        return new j4a(j4a.a, j4a.b, j4a.c, j4a.d, l, j4a.f, j4a.g);
    }

    public final j4a b(long j, nzc nzc) {
        h97 h97;
        k4a k4a;
        Long l;
        vo8 j2;
        long j3 = j;
        nzc nzc2 = nzc;
        String str = nzc2.b;
        Long l2 = null;
        if (str == null || str.length() == 0) {
            k4a = this;
            h97 = null;
        } else {
            h97 h972 = new h97(str, fu7.u(nzc2.d));
            k4a = this;
            h97 = h972;
        }
        t97 t97 = k4a.c;
        Long l3 = nzc2.e;
        if (l3 != null) {
            vo8 j4 = ((to8) t97.getValue()).j(j3, l3.longValue());
            l = j4 != null ? Long.valueOf(j4.b) : null;
        } else {
            l = null;
        }
        Long l4 = nzc2.f;
        if (!(l4 == null || (j2 = ((to8) t97.getValue()).j(j3, l4.longValue())) == null)) {
            l2 = Long.valueOf(j2.b);
        }
        return new j4a(nzc2.a, h97, l, l2, Long.valueOf(nzc2.g), true, 64);
    }

    public final j4a c(j4a j4a) {
        return j4a;
    }

    public final byte[] d(j4a j4a) {
        return am4.b(j4a);
    }

    public final j4a e(byte[] bArr) {
        return am4.a(bArr, (g15) this.b.getValue());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005a, code lost:
        r4 = r0.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final nzc f(j4a r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof j4a
            java.lang.String r1 = r10.a
            r2 = 0
            if (r0 != 0) goto L_0x0019
            java.lang.String r10 = "toServerDraft: Wrong draft type"
            defpackage.udd.s(r1, r10, r2)
            nzc r10 = new nzc
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0019:
            boolean r0 = r11.d()
            if (r0 == 0) goto L_0x0031
            java.lang.String r10 = "toServerDraft: draft is empty"
            defpackage.udd.s(r1, r10, r2)
            nzc r10 = new nzc
            r6 = 0
            r7 = 0
            r4 = 0
            r5 = 0
            r8 = 127(0x7f, float:1.78E-43)
            r3 = r10
            r3.<init>(r4, r5, r6, r7, r8)
            return r10
        L_0x0031:
            h97 r0 = r11.b
            if (r0 == 0) goto L_0x0056
            java.lang.String r3 = r0.a
            if (r3 == 0) goto L_0x0056
            t97 r4 = r10.d
            java.lang.Object r4 = r4.getValue()
            xzc r4 = (xzc) r4
            vqc r4 = (vqc) r4
            r4.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r5 = ru.ok.tamtam.android.prefs.PmsKey.max-msg-length
            r6 = 4000(0xfa0, float:5.605E-42)
            long r6 = (long) r6
            long r4 = r4.o(r5, r6)
            int r4 = (int) r4
            java.lang.String r3 = defpackage.h0e.y0(r4, r3)
            r5 = r3
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            r3 = 0
            if (r0 == 0) goto L_0x0063
            java.lang.String r4 = r0.a
            if (r4 == 0) goto L_0x0063
            int r4 = r4.length()
            goto L_0x0064
        L_0x0063:
            r4 = r3
        L_0x0064:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            if (r0 == 0) goto L_0x006e
            java.util.List r7 = r0.b
            goto L_0x006f
        L_0x006e:
            r7 = r2
        L_0x006f:
            if (r5 == 0) goto L_0x00c7
            if (r7 == 0) goto L_0x00c7
            boolean r8 = r7.isEmpty()
            if (r8 == 0) goto L_0x007a
            goto L_0x00c7
        L_0x007a:
            int r8 = r5.length()
            if (r8 != r4) goto L_0x0081
            goto L_0x00c7
        L_0x0081:
            java.util.Iterator r1 = r7.iterator()
        L_0x0085:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L_0x00cc
            java.lang.Object r7 = r1.next()
            fp8 r7 = (fp8) r7
            int r8 = r7.d
            if (r8 <= r4) goto L_0x00a6
            int r8 = r8 - r4
            r9 = 55
            fp8 r7 = fp8.a(r7, r8, r3, r9)
            fp8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00a6:
            int r9 = r7.e
            int r9 = r9 + r8
            if (r9 <= r4) goto L_0x00bd
            int r8 = r4 - r8
            r9 = 47
            fp8 r7 = fp8.a(r7, r3, r8, r9)
            fp8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00bd:
            fp8 r7 = r7.b()
            if (r7 == 0) goto L_0x0085
            r6.add(r7)
            goto L_0x0085
        L_0x00c7:
            java.lang.String r3 = "Don't need validate elements"
            defpackage.udd.p(r1, r3, new java.lang.Object[0])
        L_0x00cc:
            t97 r10 = r10.c
            java.lang.Long r1 = r11.c
            if (r1 == 0) goto L_0x00e9
            long r3 = r1.longValue()
            java.lang.Object r1 = r10.getValue()
            to8 r1 = (to8) r1
            vo8 r1 = r1.q(r3)
            if (r1 == 0) goto L_0x00e9
            long r3 = r1.c
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            goto L_0x00ea
        L_0x00e9:
            r1 = r2
        L_0x00ea:
            java.lang.Long r11 = r11.d
            if (r11 == 0) goto L_0x0105
            long r3 = r11.longValue()
            java.lang.Object r10 = r10.getValue()
            to8 r10 = (to8) r10
            vo8 r10 = r10.q(r3)
            if (r10 == 0) goto L_0x0105
            long r10 = r10.c
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            goto L_0x0106
        L_0x0105:
            r10 = r2
        L_0x0106:
            boolean r11 = r6.isEmpty()
            if (r11 == 0) goto L_0x0111
            if (r0 == 0) goto L_0x0110
            java.util.List r2 = r0.b
        L_0x0110:
            r6 = r2
        L_0x0111:
            java.util.ArrayList r11 = fu7.v(r6)
            if (r11 != 0) goto L_0x0119
            hw4 r11 = defpackage.hw4.a
        L_0x0119:
            r6 = r11
            r2 = 0
            if (r1 == 0) goto L_0x0123
            long r0 = r1.longValue()
            goto L_0x0124
        L_0x0123:
            r0 = r2
        L_0x0124:
            java.lang.Long r7 = java.lang.Long.valueOf(r0)
            if (r10 == 0) goto L_0x012e
            long r2 = r10.longValue()
        L_0x012e:
            java.lang.Long r8 = java.lang.Long.valueOf(r2)
            nzc r10 = new nzc
            r9 = 69
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k4a.f(j4a):nzc");
    }
}
