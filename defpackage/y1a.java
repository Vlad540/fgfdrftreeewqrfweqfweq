package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* renamed from: y1a  reason: default package */
public final class y1a implements t72 {
    public final t97 a;
    public final hcd b;

    public y1a(pae pae, t97 t97, ku3 ku3) {
        this.a = t97;
        ContextScope a2 = n1g.a(((n3a) pae).a().limitedParallelism(1, "AnimojiVerifier").plus(ku3));
        hcd b2 = icd.b(0, 10, 0, 5);
        this.b = b2;
        int i = zp4.o;
        ez3.N(new ck5(ez3.z(vx3.M(b2, mt0.P(1, eq4.SECONDS))), new tg9(2, this, y1a.class, "internalVerify", "internalVerify(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 1), 5), a2);
    }
}
