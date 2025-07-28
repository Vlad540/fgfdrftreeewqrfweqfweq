package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: dr  reason: default package */
public final class dr extends taf {
    public static final /* synthetic */ k77[] N0;
    public volatile Map A0;
    public volatile Map B0;
    public volatile ud0 C0;
    public volatile ud0 D0;
    public final e3 E0 = hwf.t();
    public final t97 F0;
    public final t97 G0;
    public bq H0;
    public final grd I0;
    public final t0c J0;
    public final l05 K0;
    public final grd L0;
    public final t0c M0;
    public final t97 X;
    public final t97 Y;
    public final t97 Z;
    public final t97 b;
    public final kp c;
    public final t97 o;
    public final t97 w0;
    public final t97 x0;
    public final t97 y0;
    public final km4 z0;

    static {
        hc9 hc9 = new hc9(dr.class, "updateSelectedTheme", "getUpdateSelectedTheme()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        N0 = new k77[]{hc9};
    }

    public dr(t97 t97, j2b j2b, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976, t97 t977, t97 t978) {
        bq bqVar;
        this.b = t97;
        this.c = j2b.c;
        this.o = t972;
        this.X = t973;
        this.Y = t974;
        this.Z = t975;
        this.w0 = t976;
        this.x0 = t977;
        this.y0 = t978;
        km4 n = km4.y0.n(t());
        this.z0 = n;
        iw4 iw4 = iw4.a;
        this.A0 = iw4;
        this.B0 = iw4;
        this.F0 = ez3.O(3, new xq(0, t978));
        this.G0 = ez3.O(3, new x2((Object) t978, 2, (Object) this));
        bk9 r = ((jg8) n.Y).r();
        if ((r instanceof wj9) || (r instanceof zj9) || r.equals(ak9.b)) {
            bqVar = bq.a;
        } else if (r.equals(xj9.b)) {
            bqVar = bq.b;
        } else if (r.equals(yj9.b)) {
            bqVar = bq.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.H0 = bqVar;
        List s0 = o23.s0(bq.X);
        ArrayList arrayList = new ArrayList(q23.H(s0, 10));
        Iterator it = s0.iterator();
        while (true) {
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            bq bqVar2 = (bq) it.next();
            if (bqVar2 == this.H0) {
                z = true;
            }
            arrayList.add(new dq(bqVar2, Boolean.valueOf(z)));
        }
        grd a = hrd.a(arrayList);
        this.I0 = a;
        this.J0 = new t0c(a);
        this.K0 = new l05(0);
        grd a2 = hrd.a(hw4.a);
        this.L0 = a2;
        this.M0 = new t0c(a2);
        if (v()) {
            s(true, true);
            s(false, false);
            return;
        }
        s(false, true);
        s(true, false);
    }

    public final xm8 q(int i, String str) {
        long m = u().a.m();
        long s = u().a.s();
        bp8 bp8 = bp8.Z;
        ls8 ls8 = ls8.b;
        long m2 = u().a.m();
        ArrayList arrayList = r0;
        ArrayList arrayList2 = new ArrayList();
        vo8 vo8 = r0;
        vo8 vo82 = new vo8((long) i, 0, 0, 0, m, s, 0, str, bp8, ls8, m2, (String) null, (String) null, (jj7) null, 0, 0, 0, (vo8) null, (String) null, (String) null, false, 0, 0, 2, 0, 0, (vo8) null, 0, 0, 0, 0, 0, arrayList, (yr8) null, (nd4) null);
        return rp8.a((rp8) this.Z.getValue(), vo8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object r(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof defpackage.zq
            if (r0 == 0) goto L_0x0013
            r0 = r12
            zq r0 = (defpackage.zq) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.Z = r1
            goto L_0x0018
        L_0x0013:
            zq r0 = new zq
            r0.<init>(r11, r12)
        L_0x0018:
            java.lang.Object r12 = r0.X
            pu3 r1 = defpackage.pu3.a
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            dr r11 = r0.o
            defpackage.wx3.H(r12)
            goto L_0x005a
        L_0x0029:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0031:
            defpackage.wx3.H(r12)
            r0.o = r11
            r0.Z = r3
            t97 r12 = r11.y0
            java.lang.Object r12 = r12.getValue()
            pae r12 = (pae) r12
            n3a r12 = (defpackage.n3a) r12
            ju3 r12 = r12.b()
            c6 r2 = new c6
            r4 = 8
            r2.<init>(r4, r11)
            c07 r4 = new c07
            r5 = 0
            r4.<init>(r2, r5)
            java.lang.Object r12 = defpackage.xs7.U(r12, r4, r0)
            if (r12 != r1) goto L_0x005a
            return r1
        L_0x005a:
            r5 = r12
            i22 r5 = (i22) r5
            android.content.Context r12 = r11.t()
            int r0 = defpackage.ky9.g
            java.lang.String r12 = defpackage.d8.u(r12, r0)
            r0 = -2
            xm8 r7 = r11.q(r0, r12)
            android.content.Context r12 = r11.t()
            int r0 = defpackage.ky9.f
            java.lang.String r12 = defpackage.d8.u(r12, r0)
            r0 = -1
            xm8 r6 = r11.q(r0, r12)
            sj2 r12 = new sj2
            dcf r8 = dcf.X
            t97 r0 = r11.x0
            java.lang.Object r0 = r0.getValue()
            r9 = r0
            sw8 r9 = (sw8) r9
            km4 r11 = r11.z0
            pda r11 = r11.g()
            c33 r11 = r11.g()
            int r11 = r11.ordinal()
            if (r11 == 0) goto L_0x00a8
            if (r11 == r3) goto L_0x00a4
            r0 = 2
            if (r11 != r0) goto L_0x009e
            goto L_0x00a8
        L_0x009e:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        L_0x00a4:
            jk9 r11 = defpackage.jk9.b
        L_0x00a6:
            r10 = r11
            goto L_0x00ab
        L_0x00a8:
            kk9 r11 = defpackage.kk9.b
            goto L_0x00a6
        L_0x00ab:
            r4 = r12
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.r(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void s(boolean z, boolean z2) {
        taf.n(this, ((pae) this.y0.getValue()).b(), (ru3) null, new ar(this, z, z2, (Continuation) null), 2);
    }

    public final Context t() {
        return (Context) this.o.getValue();
    }

    public final g2b u() {
        return (g2b) this.b.getValue();
    }

    public final boolean v() {
        return ((xce) this.X.getValue()).e();
    }

    public final void w() {
        String str = pb6.e0.e;
        jg8 jg8 = (jg8) this.z0.Y;
        SharedPreferences.Editor edit = jg8.s().edit();
        edit.putString("nighttheme", str);
        edit.apply();
        ((hcd) jg8.b).g("nighttheme");
        t97 t97 = this.X;
        xce xce = (xce) t97.getValue();
        xce.A0 = null;
        xce.b.c.l("app.night.theme", str);
        jg8 jg82 = (jg8) km4.y0.n(xce.a).Y;
        SharedPreferences.Editor edit2 = jg82.s().edit();
        edit2.putString("nighttheme", str);
        edit2.apply();
        ((hcd) jg82.b).g("nighttheme");
        ((xce) t97.getValue()).b(true);
    }

    public final void x() {
        String str = x04.e0.e;
        this.c.l("app.theme", str);
        this.z0.l(str);
        ((xce) this.X.getValue()).a(str, true);
    }

    public final void y(boolean z, ud0 ud0, g32 g32, s16 s16) {
        if (!hhd.f(ud0, g32.b)) {
            s16.invoke();
            z();
            taf.n(this, ((pae) this.y0.getValue()).b(), (ru3) null, new br(g32, z, this, (Continuation) null), 2);
        }
    }

    public final void z() {
        qod n = taf.n(this, ((pae) this.y0.getValue()).b(), (ru3) null, new cr(this, (Continuation) null), 2);
        this.E0.o1(this, N0[0], n);
    }
}
