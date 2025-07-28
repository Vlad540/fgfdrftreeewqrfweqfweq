package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: r17  reason: default package */
public final class r17 extends taf implements bd3 {
    public static final g02 E0 = new g02(12);
    public static final /* synthetic */ k77[] F0;
    public final e3 A0;
    public final e3 B0;
    public final p7c C0;
    public int D0;
    public final t97 X;
    public final t97 Y;
    public final l05 Z = new l05(0);
    public final /* synthetic */ waf b;
    public final t97 c;
    public final t97 o;
    public final hcd w0;
    public final q02 x0;
    public final grd y0;
    public final t0c z0;

    static {
        Class<r17> cls = r17.class;
        F0 = new k77[]{new hc9(cls, "findContactByPhoneJob", "getFindContactByPhoneJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    }

    public r17() {
        x07 x07 = x07.a;
        r7e d = x07.getAccessor().d(u76.class);
        r7e d2 = x07.getAccessor().d(loa.class);
        r7e d3 = x07.getAccessor().d(bv2.class);
        r7e d4 = x07.getAccessor().d(ap3.class);
        r7e d5 = x07.getAccessor().d(ed3.class);
        r7e d6 = x07.getAccessor().d(pae.class);
        waf waf = new waf(d5, new xz6(4));
        this.b = waf;
        this.c = d;
        this.o = d3;
        this.X = d4;
        this.Y = d6;
        hcd b2 = icd.b(0, 0, 0, 7);
        this.w0 = b2;
        this.x0 = ez3.Q(b2, new ik5(waf.o, 2));
        grd a = hrd.a(u3a.b);
        this.y0 = a;
        da1 da1 = new da1(a, this, d6, d2, 3);
        iv3 iv3 = new iv3((v3a) a.getValue(), Integer.MAX_VALUE, new hge(v5a.j));
        this.z0 = ez3.d0(da1, this.a, ucd.a, iv3);
        this.A0 = hwf.t();
        this.B0 = hwf.t();
        this.C0 = new p7c("[^0-9+]");
        this.D0 = Integer.MAX_VALUE;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.r17 r6, java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof defpackage.k17
            if (r0 == 0) goto L_0x0013
            r0 = r9
            k17 r0 = (defpackage.k17) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            k17 r0 = new k17
            r0.<init>(r6, r9)
        L_0x0018:
            java.lang.Object r9 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            java.lang.Object r6 = r0.o
            mge r6 = (mge) r6
            defpackage.wx3.H(r9)
            goto L_0x0095
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            java.lang.Object r6 = r0.o
            r17 r6 = (defpackage.r17) r6
            defpackage.wx3.H(r9)
            goto L_0x006d
        L_0x003f:
            defpackage.wx3.H(r9)
            int r8 = r8.length()
            if (r8 != 0) goto L_0x0052
            int r7 = rhc.e0
            hge r8 = new hge
            r8.<init>(r7)
        L_0x004f:
            r7 = r6
            r6 = r8
            goto L_0x0081
        L_0x0052:
            int r8 = r7.length()
            int r9 = r6.D0
            if (r8 <= r9) goto L_0x0062
            int r7 = rhc.f0
            hge r8 = new hge
            r8.<init>(r7)
            goto L_0x004f
        L_0x0062:
            r0.o = r6
            r0.Z = r4
            java.lang.Object r9 = r(r7, r6, r0)
            if (r9 != r1) goto L_0x006d
            goto L_0x009d
        L_0x006d:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r7 = r9.booleanValue()
            if (r7 == 0) goto L_0x007d
            int r7 = defpackage.v5a.e
            hge r8 = new hge
            r8.<init>(r7)
            goto L_0x004f
        L_0x007d:
            r7 = 0
            r5 = r7
            r7 = r6
            r6 = r5
        L_0x0081:
            if (r6 == 0) goto L_0x0095
            hcd r7 = r7.w0
            b17 r8 = new b17
            r8.<init>(r6)
            r0.o = r6
            r0.Z = r3
            java.lang.Object r7 = r7.a(r8, r0)
            if (r7 != r1) goto L_0x0095
            goto L_0x009d
        L_0x0095:
            if (r6 != 0) goto L_0x0098
            goto L_0x0099
        L_0x0098:
            r4 = 0
        L_0x0099:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
        L_0x009d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r17.q(r17, java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [er3] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(java.lang.String r8, defpackage.r17 r9, kotlin.coroutines.Continuation r10) {
        /*
            boolean r0 = r10 instanceof defpackage.l17
            if (r0 == 0) goto L_0x0013
            r0 = r10
            l17 r0 = (defpackage.l17) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Y = r1
            goto L_0x0018
        L_0x0013:
            l17 r0 = new l17
            r0.<init>(r10)
        L_0x0018:
            java.lang.Object r10 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0032
            if (r2 != r3) goto L_0x002a
            java.lang.Long r8 = r0.o
            defpackage.wx3.H(r10)
            goto L_0x006e
        L_0x002a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0032:
            defpackage.wx3.H(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            int r2 = r8.length()
            r5 = r4
        L_0x003f:
            if (r5 >= r2) goto L_0x0053
            char r6 = r8.charAt(r5)
            char r6 = (char) r6
            char r7 = (char) r6
            boolean r7 = java.lang.Character.isDigit(r7)
            if (r7 == 0) goto L_0x0050
            r10.append(r6)
        L_0x0050:
            int r5 = r5 + 1
            goto L_0x003f
        L_0x0053:
            java.lang.String r8 = r10.toString()
            java.lang.Long r8 = defpackage.o0e.H(r8)
            t97 r9 = r9.X
            java.lang.Object r9 = r9.getValue()
            ap3 r9 = (ap3) r9
            r0.o = r8
            r0.Y = r3
            java.lang.Object r10 = r9.d(r0)
            if (r10 != r1) goto L_0x006e
            return r1
        L_0x006e:
            tf3 r10 = (tf3) r10
            long r9 = r10.o()
            if (r8 != 0) goto L_0x0077
            goto L_0x0080
        L_0x0077:
            long r0 = r8.longValue()
            int r8 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r8 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r3 = r4
        L_0x0081:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r17.r(java.lang.String, r17, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final s0c f() {
        return this.b.o;
    }

    public final void p() {
        k77[] k77Arr = F0;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.A0;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
        k77 k772 = k77Arr[1];
        e3 e3Var2 = this.B0;
        g37 g372 = (g37) e3Var2.T0(this, k772);
        if (g372 != null) {
            g372.cancel((CancellationException) null);
        }
        e3Var2.o1(this, k77Arr[1], (Object) null);
    }
}
