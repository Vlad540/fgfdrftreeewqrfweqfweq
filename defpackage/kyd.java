package defpackage;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: kyd  reason: default package */
public final class kyd extends taf {
    public static final /* synthetic */ k77[] G0;
    public final e3 A0 = hwf.t();
    public final grd B0;
    public final t0c C0;
    public final t0c D0;
    public final l05 E0;
    public final r7e F0;
    public final pae X;
    public final t97 Y;
    public final t97 Z;
    public final mvd b;
    public final long c;
    public final Context o;
    public final t97 w0;
    public final t97 x0;
    public final e3 y0 = hwf.t();
    public final e3 z0 = hwf.t();

    static {
        Class<kyd> cls = kyd.class;
        G0 = new k77[]{new hc9(cls, "clearJob", "getClearJob()Lkotlinx/coroutines/Job;"), c3d.g(m7c.a, cls, "deleteStickersJob", "getDeleteStickersJob()Lkotlinx/coroutines/Job;"), new hc9(cls, "deleteSetJob", "getDeleteSetJob()Lkotlinx/coroutines/Job;")};
    }

    public kyd(mvd mvd, long j, Context context, pae pae, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        w09 w09;
        fw4 fw4;
        mvd mvd2 = mvd;
        long j2 = j;
        pae pae2 = pae;
        this.b = mvd2;
        this.c = j2;
        this.o = context;
        this.X = pae2;
        this.Y = t972;
        this.Z = t973;
        this.w0 = t974;
        this.x0 = t976;
        grd a = hrd.a(hw4.a);
        this.B0 = a;
        this.C0 = new t0c(a);
        mvd mvd3 = mvd.SET;
        if (mvd2 != mvd3 || j2 == -1) {
            w09 = new djc(new eyd(new wxd(mvd2 == mvd.RECENT ? new hge(sca.q) : new hge(sca.e), (String) null, (String) null, q(false)), (Continuation) null));
        } else {
            rn1 c2 = am7.c(((lud) t975.getValue()).b(j2));
            l95 l95 = (l95) t974.getValue();
            l95.getClass();
            f00 f00 = new f00(j2, 15);
            jk0 jk0 = l95.w0;
            jk0.getClass();
            w09 = new w09(new v11(c2, am7.c(new au9(jk0, f00, 1)), dyd.w0, 4), this, 11);
        }
        n3a n3a = (n3a) pae2;
        this.D0 = ez3.d0(ez3.J(w09, n3a.b()), this.a, ucd.a, (Object) null);
        this.E0 = new l05(0);
        this.F0 = new r7e(new u5b(29, this));
        if (mvd2 == mvd3 && j2 == -1) {
            String name = kyd.class.getName();
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.Z, name, "Try load stickers from stickerSet by invalid id: -1", (Throwable) null);
            }
            fw4 = fw4.a;
        } else {
            int ordinal = mvd.ordinal();
            if (ordinal == 0) {
                fw4 = am7.c(((zsd) t97.getValue()).a());
            } else if (ordinal == 1) {
                fw4 = am7.c(((fa5) t973.getValue()).a());
            } else if (ordinal == 2) {
                fw4 = new u09(am7.c(((lud) t975.getValue()).b(j2)), 27);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        ez3.N(ez3.J(new ck5(fw4, new kbb(2, this, kyd.class, "processStickers", "processStickers(Ljava/util/List;)V", 4, 18), 5), n3a.b()), this.a);
    }

    public final lg7 q(boolean z) {
        lg7 c2 = hwf.c();
        mvd mvd = mvd.SET;
        mvd mvd2 = this.b;
        if (mvd2 != mvd) {
            c2.add(new pq3(rca.u, (mge) new hge(sca.z), Integer.valueOf(phc.G), Integer.valueOf(j9a.G), 4));
        } else {
            c2.add(new pq3(rca.i, (mge) new hge(sca.f), Integer.valueOf(phc.u), Integer.valueOf(j9a.G), 4));
            if (z) {
                c2.add(new pq3(rca.j, (mge) new hge(sca.m), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F)));
            }
        }
        int ordinal = mvd2.ordinal();
        Integer valueOf = ordinal != 0 ? ordinal != 1 ? null : Integer.valueOf(rca.t) : Integer.valueOf(rca.w);
        if (valueOf != null) {
            c2.add(new pq3(valueOf.intValue(), (mge) new hge(sca.D), Integer.valueOf(j9a.J), Integer.valueOf(phc.x), Integer.valueOf(j9a.F)));
        }
        return hwf.a(c2);
    }

    public final w99 r() {
        return (w99) this.F0.getValue();
    }

    public final String s(int i) {
        return this.o.getResources().getQuantityString(haa.a, i, new Object[]{Integer.valueOf(i)});
    }
}
