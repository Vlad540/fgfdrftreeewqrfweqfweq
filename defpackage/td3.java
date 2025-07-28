package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: td3  reason: default package */
public final class td3 {
    public final grd a;

    public td3(pae pae, f3d f3d) {
        ContextScope a2 = n1g.a(((n3a) pae).a().limitedParallelism(1, "conn-events"));
        h3d h3d = (h3d) f3d;
        grd a3 = hrd.a(Integer.valueOf(h3d.h));
        this.a = a3;
        ez3.N(new ck5(am7.c(h3d.e), new zv(2, a3, mc9.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 15), 5), a2);
    }
}
