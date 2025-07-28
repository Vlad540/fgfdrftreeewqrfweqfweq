package defpackage;

import android.content.Context;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* renamed from: vf2  reason: default package */
public final class vf2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ah2 Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf2(ah2 ah2, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = ah2;
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vf2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vf2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            ah2 ah2 = this.Y;
            b29 b29 = ah2.w0;
            long j = ah2.o;
            this.X = 1;
            obj2 = b29.a(j, this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj2;
        if (vo8 == null) {
            return jue;
        }
        if (!this.Y.Y || !vo8.w()) {
            long j2 = vo8.o;
            ah2 ah22 = this.Y;
            new Long(j2);
            ah22.getClass();
            s78 s78 = (s78) this.Y.w().l().I(this.Y.b).getValue();
            ah2 ah23 = this.Y;
            ah23.M0.updateAndGet(new uf2(ah23, s78, vo8));
            String str = this.Y.A0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                tn7 tn7 = tn7.X;
                fn6.d(tn7, str, "Media viewer. Create loader with initialTime:" + j2 + ", saved markers:" + s78, (Throwable) null);
            }
            ah2 ah24 = this.Y;
            t78 t78 = this.Y;
            long j3 = t78.b;
            long j4 = t78.o;
            Set set = t78.L0;
            w4 w4Var = ((wa2) this.Z.getValue()).a;
            r7e d = w4Var.d(bv2.class);
            r7e d2 = w4Var.d(b29.class);
            r7e d3 = w4Var.d(to8.class);
            r7e d4 = w4Var.d(n1b.class);
            Class<l3a> cls = l3a.class;
            r7e d5 = w4Var.d(cls);
            ah2 ah25 = ah24;
            jue jue2 = jue;
            r7e r7e = d4;
            pae pae = (pae) w4Var.c(pae.class);
            Set set2 = set;
            Context context = (Context) w4Var.c(Context.class);
            long j5 = j3;
            j60 j60 = new j60(d, j3, j4, j2, set2);
            kh6 kh6 = new kh6(us8.i(j5, "MediaLoader#"));
            yt gd2 = new gd2(d, w4Var.d(cls), w4Var.d(g15.class), d2, w4Var.d(jb5.class), pae, j5, set2);
            o8c zd2 = new zd2(d, d3, w4Var.d(f03.class), w4Var.d(pk.class), gd2, j5, set2, t78);
            Context context2 = context;
            r7e r7e2 = new r7e(new va2(context2, w4Var, 1));
            r7e r7e3 = new r7e(new va2(context2, w4Var, 0));
            pae pae2 = pae;
            r7e r7e4 = d;
            r7e r7e5 = d2;
            r7e r7e6 = d5;
            fw fwVar = new fw(r7e4, r7e5, r7e6, w4Var.d(s76.class), j5, pae2, kh6, new ew8(j5, (tt0) w4Var.c(tt0.class), pae2), r7e2, r7e3, (ku3) w4Var.c(ku3.class), new d3a(r7e2, r7e3, r7e, w4Var.d(ap3.class)), j60, gd2, zd2, (ua3) w4Var.c(ua3.class), 100, 100);
            ah2 ah26 = this.Y;
            ah26.getClass();
            ez3.N(ez3.J(new ck5(new vg2(fwVar.B, ah26, 1), new zg2(ah26, (Continuation) null), 5), ah26.x0.b()), ah26.a);
            ez3.N(ez3.J(new ck5(new vg2(new t0c(ah26.w().l().I(ah26.b)), ah26, 0), new wg2(ah26, (Continuation) null), 5), ah26.x0.a()), ah26.a);
            udd.p(ah26.A0, "Media viewer. Start load around", new Object[0]);
            fwVar.r(j2);
            ah25.J0 = fwVar;
            return jue2;
        }
        ah2 ah27 = this.Y;
        this.X = 2;
        return ah2.t(ah27, vo8, this) == pu3 ? pu3 : jue;
    }
}
