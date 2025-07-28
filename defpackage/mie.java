package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: mie  reason: default package */
public final class mie extends taf {
    public static final /* synthetic */ k77[] X;
    public final grd b = hrd.a(hw4.a);
    public final e3 c;
    public final List o;

    static {
        hc9 hc9 = new hc9(mie.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        X = new k77[]{hc9};
    }

    public mie(x4a x4a) {
        e3 t = hwf.t();
        this.c = t;
        wia wia = new wia("single", x4a.c());
        k77[] k77Arr = x4a.p;
        k77 k77 = k77Arr[5];
        wia wia2 = new wia("trnsmt", x4a.d(x4a.k));
        k77 k772 = k77Arr[4];
        wia wia3 = new wia("net", x4a.d(x4a.j));
        k77 k773 = k77Arr[3];
        this.o = p23.B(wia, wia2, wia3, new wia("single-low", x4a.d(x4a.i)));
        t.o1(this, X[0], taf.n(this, (hu3) null, ru3.b, new lie(this, (Continuation) null), 1));
    }
}
