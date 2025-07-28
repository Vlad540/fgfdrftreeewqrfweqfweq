package defpackage;

import java.util.HashMap;

/* renamed from: fbc  reason: default package */
public final class fbc extends rd4 {
    public final boolean c;
    public final wr6 d;
    public final z4b e;
    public boolean f = false;
    public final w37 g;
    public final /* synthetic */ gbc h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fbc(gbc gbc, ah0 ah0, z4b z4b, boolean z, wr6 wr6) {
        super(ah0);
        this.h = gbc;
        this.e = z4b;
        ji0 ji0 = (ji0) z4b;
        Boolean bool = ji0.a.s;
        this.c = bool != null ? bool.booleanValue() : z;
        this.d = wr6;
        this.g = new w37(gbc.a, new u5g(24, (Object) this));
        ji0.a(new um6(this, ah0, false, 2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006c, code lost:
        if (r7 != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(int r13, java.lang.Object r14) {
        /*
            r12 = this;
            ax4 r14 = (defpackage.ax4) r14
            boolean r0 = r12.f
            if (r0 == 0) goto L_0x0008
            goto L_0x00d1
        L_0x0008:
            boolean r0 = defpackage.ah0.a(r13)
            r1 = 1
            ah0 r2 = r12.b
            if (r14 != 0) goto L_0x0019
            if (r0 == 0) goto L_0x00d1
            r12 = 0
            r2.g(r1, r12)
            goto L_0x00d1
        L_0x0019:
            r14.n0()
            lq6 r3 = r14.c
            z4b r4 = r12.e
            ji0 r4 = (defpackage.ji0) r4
            tr6 r5 = r4.a
            wr6 r6 = r12.d
            boolean r7 = r12.c
            vr6 r6 = r6.createImageTranscoder(r3, r7)
            r6.getClass()
            r14.n0()
            lq6 r7 = r14.c
            lq6 r8 = defpackage.lq6.c
            r9 = 3
            r10 = 0
            if (r7 != r8) goto L_0x003c
            r8 = r9
            goto L_0x0084
        L_0x003c:
            r14.n0()
            lq6 r7 = r14.c
            boolean r7 = r6.c(r7)
            r8 = 2
            if (r7 != 0) goto L_0x0049
            goto L_0x0084
        L_0x0049:
            rfc r7 = r5.j
            boolean r11 = r7.a
            if (r11 != 0) goto L_0x0070
            int r11 = defpackage.z47.b(r7, r14)
            if (r11 != 0) goto L_0x006e
            boolean r7 = r7.a
            if (r7 == 0) goto L_0x005d
            r14.X = r10
            r7 = r10
            goto L_0x006c
        L_0x005d:
            zy r7 = defpackage.z47.a
            r14.n0()
            int r11 = r14.X
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            boolean r7 = r7.contains(r11)
        L_0x006c:
            if (r7 == 0) goto L_0x0070
        L_0x006e:
            r7 = r1
            goto L_0x0071
        L_0x0070:
            r7 = r10
        L_0x0071:
            if (r7 != 0) goto L_0x0080
            rfc r7 = r5.j
            hbc r5 = r5.i
            boolean r5 = r6.d(r14, r7, r5)
            if (r5 == 0) goto L_0x007e
            goto L_0x0080
        L_0x007e:
            r5 = r10
            goto L_0x0081
        L_0x0080:
            r5 = r1
        L_0x0081:
            if (r5 == 0) goto L_0x0084
            r8 = r1
        L_0x0084:
            if (r0 != 0) goto L_0x0089
            if (r8 != r9) goto L_0x0089
            goto L_0x00d1
        L_0x0089:
            if (r8 == r1) goto L_0x00bd
            lq6 r12 = defpackage.o84.a
            tr6 r0 = r4.a
            if (r3 == r12) goto L_0x009c
            lq6 r12 = defpackage.o84.k
            if (r3 != r12) goto L_0x0096
            goto L_0x009c
        L_0x0096:
            rfc r12 = r0.j
            r12.getClass()
            goto L_0x00b9
        L_0x009c:
            rfc r12 = r0.j
            boolean r12 = r12.a
            if (r12 != 0) goto L_0x00b9
            r14.n0()
            int r12 = r14.o
            if (r12 == 0) goto L_0x00b9
            r14.n0()
            int r12 = r14.o
            r0 = -1
            if (r12 == r0) goto L_0x00b9
            ax4 r14 = defpackage.ax4.a(r14)
            if (r14 == 0) goto L_0x00b9
            r14.o = r10
        L_0x00b9:
            r2.g(r13, r14)
            goto L_0x00d1
        L_0x00bd:
            w37 r12 = r12.g
            boolean r13 = r12.e(r14, r13)
            if (r13 != 0) goto L_0x00c6
            goto L_0x00d1
        L_0x00c6:
            if (r0 != 0) goto L_0x00ce
            boolean r13 = r4.f()
            if (r13 == 0) goto L_0x00d1
        L_0x00ce:
            r12.c()
        L_0x00d1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fbc.h(int, java.lang.Object):void");
    }

    /* JADX WARNING: type inference failed for: r4v5, types: [at6, java.util.HashMap] */
    public final at6 m(ax4 ax4, hbc hbc, ii5 ii5, String str) {
        String str2;
        long j;
        z4b z4b = this.e;
        if (!((ji0) z4b).c.i(z4b, "ResizeAndRotateProducer")) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        ax4.n0();
        sb.append(ax4.Y);
        sb.append("x");
        ax4.n0();
        sb.append(ax4.Z);
        String sb2 = sb.toString();
        if (hbc != null) {
            str2 = hbc.a + "x" + hbc.b;
        } else {
            str2 = "Unspecified";
        }
        HashMap hashMap = new HashMap();
        ax4.n0();
        hashMap.put("Image format", String.valueOf(ax4.c));
        hashMap.put("Original size", sb2);
        hashMap.put("Requested size", str2);
        w37 w37 = this.g;
        synchronized (w37) {
            j = w37.i - w37.h;
        }
        hashMap.put("queueTime", String.valueOf(j));
        hashMap.put("Transcoder id", str);
        hashMap.put("Transcoding result", String.valueOf(ii5));
        return new HashMap(hashMap);
    }
}
