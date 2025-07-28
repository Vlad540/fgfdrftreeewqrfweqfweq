package defpackage;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* renamed from: kmf  reason: default package */
public final class kmf extends taf {
    public static final /* synthetic */ k77[] V0;
    public final t97 A0;
    public final t97 B0;
    public final t97 C0;
    public final t97 D0;
    public jff E0;
    public final e3 F0 = hwf.t();
    public final b0d G0;
    public final grd H0;
    public final grd I0;
    public final grd J0;
    public final grd K0;
    public boolean L0;
    public volatile String M0;
    public final t0c N0;
    public final l05 O0;
    public final r7e P0;
    public final t97 Q0;
    public e57 R0;
    public ajf S0;
    public final ConcurrentHashMap T0;
    public qod U0;
    public final String X;
    public final u00 Y;
    public final f03 Z;
    public final long b;
    public final bff c;
    public final Long o;
    public final pv3 w0;
    public final p86 x0;
    public final t97 y0;
    public final t97 z0;

    static {
        k77 hc9 = new hc9(kmf.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        V0 = new k77[]{hc9};
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [u00, java.lang.Object] */
    public kmf(long j, bff bff, Long l, String str) {
        long j2 = j;
        uif uif = uif.a;
        Class<f03> cls = f03.class;
        long s = ((lqc) ((f03) uif.getAccessor().c(cls))).s();
        xzc xzc = (xzc) uif.getAccessor().c(xzc.class);
        ? obj = new Object();
        obj.a = j2;
        obj.b = s;
        obj.c = (Context) uif.getAccessor().c(Context.class);
        obj.d = new r7e(new rpf(obj, xzc, 0));
        obj.e = new r7e(new rpf(obj, xzc, 1));
        i57 i57 = (i57) uif.getAccessor().c(i57.class);
        r7e d = uif.getAccessor().d(pae.class);
        r7e d2 = uif.getAccessor().d(bv2.class);
        r7e d3 = uif.getAccessor().d(ap3.class);
        r7e d4 = uif.getAccessor().d(iff.class);
        r7e d5 = uif.getAccessor().d(jc5.class);
        r7e d6 = uif.getAccessor().d(kff.class);
        this.b = j2;
        this.c = bff;
        this.o = l;
        this.X = str;
        this.Y = obj;
        this.Z = (f03) uif.getAccessor().c(cls);
        this.w0 = (pv3) uif.getAccessor().c(pv3.class);
        this.x0 = (p86) uif.getAccessor().c(p86.class);
        this.y0 = d;
        this.z0 = d2;
        this.A0 = d3;
        this.B0 = d4;
        this.C0 = d5;
        this.D0 = ez3.O(3, new r9c(13, d6));
        this.G0 = new b0d(this.a, (pae) i57.a.getValue(), i57.b);
        grd a = hrd.a(oia.a);
        this.H0 = a;
        Boolean bool = Boolean.FALSE;
        grd a2 = hrd.a(bool);
        this.I0 = a2;
        this.J0 = hrd.a(bool);
        pj5 z = ez3.z(new v11(ez3.P(a, new l5e(2, (Continuation) null)), a2, new ah1(3, (Continuation) null, 6), 4));
        e5f e5f = new e5f(new ik5(((ap3) d3.getValue()).c(j2), 2), 1);
        grd a3 = hrd.a("");
        this.K0 = a3;
        pj5 z2 = ez3.z(ez3.s(a3, e5f, z, new l5e(4, (Continuation) null)));
        pmf pmf = new pmf("", false, nmf.a);
        this.N0 = ez3.d0(z2, this.a, ucd.a, pmf);
        this.O0 = new l05(0);
        this.P0 = new r7e(new nya(this, 28, d));
        this.Q0 = ez3.O(3, new q6e(11, this));
        this.T0 = new ConcurrentHashMap();
        taf.n(this, (hu3) null, (ru3) null, new xlf(this, (Continuation) null), 3);
        taf.n(this, ((pae) d.getValue()).a(), (ru3) null, new emf(this, (Continuation) null), 2);
    }

    /* JADX WARNING: type inference failed for: r9v23, types: [e57] */
    /* JADX WARNING: type inference failed for: r9v24, types: [e57] */
    /* JADX WARNING: type inference failed for: r9v25, types: [e57] */
    /* JADX WARNING: type inference failed for: r9v27, types: [e57] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018a  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object q(defpackage.kmf r9, defpackage.azd r10, kotlin.coroutines.Continuation r11) {
        /*
            r9.getClass()
            boolean r0 = r11 instanceof defpackage.fmf
            if (r0 == 0) goto L_0x0016
            r0 = r11
            fmf r0 = (defpackage.fmf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            fmf r0 = new fmf
            r0.<init>(r9, r11)
        L_0x001b:
            java.lang.Object r11 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            jue r3 = jue.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r2 == 0) goto L_0x0060
            if (r2 == r7) goto L_0x0057
            if (r2 == r6) goto L_0x004d
            if (r2 == r5) goto L_0x0043
            if (r2 != r4) goto L_0x003b
            e57 r9 = r0.o
            r10 = r9
            azd r10 = (defpackage.azd) r10
            wx3.H(r11)
            goto L_0x0182
        L_0x003b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0043:
            e57 r9 = r0.o
            r10 = r9
            azd r10 = (defpackage.azd) r10
            wx3.H(r11)
            goto L_0x013a
        L_0x004d:
            e57 r9 = r0.o
            r10 = r9
            azd r10 = (defpackage.azd) r10
            wx3.H(r11)
            goto L_0x00eb
        L_0x0057:
            e57 r9 = r0.o
            r10 = r9
            azd r10 = (defpackage.azd) r10
            wx3.H(r11)
            goto L_0x009d
        L_0x0060:
            wx3.H(r11)
            boolean r11 = r10 instanceof defpackage.zyd
            u00 r2 = r9.Y
            r8 = 0
            if (r11 == 0) goto L_0x00b8
            r11 = r10
            zyd r11 = (defpackage.zyd) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.M0
            if (r9 == 0) goto L_0x0077
            boolean r8 = hhd.f(r4, r9)
        L_0x0077:
            boolean r9 = r11.f
            if (r8 != 0) goto L_0x0086
            pnf r10 = new pnf
            r10.<init>(r9)
            r11.b(r10)
        L_0x0083:
            r1 = r3
            goto L_0x019d
        L_0x0086:
            qpf r9 = r2.c(r9)
            r2 = r10
            e57 r2 = (defpackage.e57) r2
            r0.o = r2
            r0.Z = r7
            java.lang.String r0 = r11.d
            java.lang.String r11 = r11.e
            java.lang.Boolean r11 = r9.a(r0, r11)
            if (r11 != r1) goto L_0x009d
            goto L_0x019d
        L_0x009d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00ab
            zyd r10 = (defpackage.zyd) r10
            r10.a(r3)
            goto L_0x0083
        L_0x00ab:
            zyd r10 = (defpackage.zyd) r10
            snf r9 = new snf
            boolean r11 = r10.f
            r9.<init>(r11)
            r10.b(r9)
            goto L_0x0083
        L_0x00b8:
            boolean r11 = r10 instanceof defpackage.yyd
            if (r11 == 0) goto L_0x0107
            r11 = r10
            yyd r11 = (defpackage.yyd) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.M0
            if (r9 == 0) goto L_0x00c9
            boolean r8 = hhd.f(r4, r9)
        L_0x00c9:
            boolean r9 = r11.e
            if (r8 != 0) goto L_0x00d6
            pnf r10 = new pnf
            r10.<init>(r9)
            r11.b(r10)
            goto L_0x0083
        L_0x00d6:
            qpf r9 = r2.c(r9)
            r2 = r10
            e57 r2 = (defpackage.e57) r2
            r0.o = r2
            r0.Z = r6
            java.lang.String r11 = r11.d
            java.lang.Boolean r11 = r9.remove(r11)
            if (r11 != r1) goto L_0x00eb
            goto L_0x019d
        L_0x00eb:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x00f9
            yyd r10 = (defpackage.yyd) r10
            r10.a(r3)
            goto L_0x0083
        L_0x00f9:
            yyd r10 = (defpackage.yyd) r10
            pnf r9 = new pnf
            boolean r11 = r10.e
            r9.<init>(r11)
            r10.b(r9)
            goto L_0x0083
        L_0x0107:
            boolean r11 = r10 instanceof defpackage.xyd
            if (r11 == 0) goto L_0x0151
            r11 = r10
            xyd r11 = (defpackage.xyd) r11
            java.lang.String r4 = r11.c
            java.lang.String r9 = r9.M0
            if (r9 == 0) goto L_0x0118
            boolean r8 = hhd.f(r4, r9)
        L_0x0118:
            if (r8 != 0) goto L_0x0124
            onf r9 = new onf
            r9.<init>()
            r11.b(r9)
            goto L_0x0083
        L_0x0124:
            boolean r9 = r11.e
            qpf r9 = r2.c(r9)
            r2 = r10
            e57 r2 = (defpackage.e57) r2
            r0.o = r2
            r0.Z = r5
            java.lang.String r11 = r11.d
            java.lang.String r11 = r9.b(r11)
            if (r11 != r1) goto L_0x013a
            goto L_0x019d
        L_0x013a:
            java.lang.String r11 = (java.lang.String) r11
            if (r11 == 0) goto L_0x0145
            xyd r10 = (defpackage.xyd) r10
            r10.a(r11)
            goto L_0x0083
        L_0x0145:
            xyd r10 = (defpackage.xyd) r10
            onf r9 = new onf
            r9.<init>()
            r10.b(r9)
            goto L_0x0083
        L_0x0151:
            boolean r11 = r10 instanceof defpackage.wyd
            if (r11 == 0) goto L_0x019e
            r11 = r10
            wyd r11 = (defpackage.wyd) r11
            java.lang.String r5 = r11.c
            java.lang.String r9 = r9.M0
            if (r9 == 0) goto L_0x0162
            boolean r8 = hhd.f(r5, r9)
        L_0x0162:
            if (r8 != 0) goto L_0x016e
            onf r9 = new onf
            r9.<init>()
            r11.b(r9)
            goto L_0x0083
        L_0x016e:
            boolean r9 = r11.d
            qpf r9 = r2.c(r9)
            r11 = r10
            e57 r11 = (defpackage.e57) r11
            r0.o = r11
            r0.Z = r4
            java.lang.Boolean r11 = r9.clear()
            if (r11 != r1) goto L_0x0182
            goto L_0x019d
        L_0x0182:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r9 = r11.booleanValue()
            if (r9 == 0) goto L_0x0191
            wyd r10 = (defpackage.wyd) r10
            r10.a(r3)
            goto L_0x0083
        L_0x0191:
            wyd r10 = (defpackage.wyd) r10
            onf r9 = new onf
            r9.<init>()
            r10.b(r9)
            goto L_0x0083
        L_0x019d:
            return r1
        L_0x019e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmf.q(kmf, azd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object r(defpackage.kmf r4, defpackage.e57 r5, kotlin.coroutines.Continuation r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof defpackage.gmf
            if (r0 == 0) goto L_0x0016
            r0 = r6
            gmf r0 = (defpackage.gmf) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x001b
        L_0x0016:
            gmf r0 = new gmf
            r0.<init>(r4, r6)
        L_0x001b:
            java.lang.Object r6 = r0.X
            pu3 r1 = pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            kmf r4 = r0.o
            wx3.H(r6)
            goto L_0x0052
        L_0x002c:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0034:
            wx3.H(r6)
            e57 r6 = r4.R0
            if (r6 == 0) goto L_0x0043
            s0 r2 = new s0
            r2.<init>()
            r6.b(r2)
        L_0x0043:
            r4.R0 = r5
            r0.o = r4
            r0.Z = r3
            grd r5 = r4.K0
            java.lang.Object r6 = ez3.D(r5, r0)
            if (r6 != r1) goto L_0x0052
            goto L_0x0060
        L_0x0052:
            java.lang.String r6 = (java.lang.String) r6
            l05 r4 = r4.O0
            tlf r5 = new tlf
            r5.<init>(r6)
            defpackage.taf.o(r4, r5)
            jue r1 = jue.a
        L_0x0060:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kmf.r(kmf, e57, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void p() {
        ckf ckf = (ckf) this.D0.getValue();
        ((tt0) ckf.a.getValue()).f(ckf);
        this.E0 = null;
        for (q57 d : (List) this.G0.o) {
            d.d((jff) null);
        }
    }

    public final zgf s() {
        return (zgf) this.P0.getValue();
    }

    public final void t(boolean z) {
        zgf s = s();
        s.getClass();
        xs7.E(s.c, (hu3) null, (ru3) null, new fgf(s, (Continuation) null, z), 3);
    }

    public final void u(boolean z) {
        if (z) {
            ajf ajf = this.S0;
            if (ajf != null) {
                ajf.a(jue.a);
            }
        } else {
            ajf ajf2 = this.S0;
            if (ajf2 != null) {
                ajf2.b(new Throwable());
            }
        }
        this.S0 = null;
    }

    public final void v(boolean z) {
        e57 e57 = this.R0;
        if (e57 != null) {
            if (z) {
                ap3 ap3 = (ap3) this.A0.getValue();
                di3 di3 = ap3.a;
                tf3 i = di3.i(((j2b) di3.h).a.s(), false);
                if (i == null) {
                    i = ap3.a(((Number) ap3.b.getValue()).longValue());
                }
                e57.a(String.valueOf(i.o()));
                return;
            }
            e57.b(new Throwable());
        }
    }
}
