package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.internal.ContextScope;

/* renamed from: qwd  reason: default package */
public final class qwd {
    public static final /* synthetic */ k77[] j;
    public static final nwd k = new nwd(3, false, (List) null);
    public final t97 a;
    public final t97 b;
    public final ContextScope c;
    public final grd d;
    public final t0c e;
    public final grd f;
    public final AtomicReference g = new AtomicReference(new mwd((String) null, 3));
    public qod h;
    public final e3 i = hwf.t();

    static {
        k77 hc9 = new hc9(qwd.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        j = new k77[]{hc9};
    }

    public qwd(t97 t97, t97 t972, pae pae) {
        this.a = t97;
        this.b = t972;
        ContextScope a2 = n1g.a(((n3a) pae).b());
        this.c = a2;
        grd a3 = hrd.a(k);
        this.d = a3;
        this.e = new t0c(a3);
        grd a4 = hrd.a((Object) null);
        this.f = a4;
        ez3.N(new ck5(ez3.x(new nl5(a4, 0), 200), new kbb(2, this, qwd.class, "searchSetsByQuery", "searchSetsByQuery(Ljava/lang/String;)V", 4, 13), 5), a2);
    }

    public final boolean a() {
        String str = ((mwd) this.g.get()).b;
        return !(str == null || str.length() == 0);
    }
}
