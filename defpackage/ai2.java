package defpackage;

import java.util.Collection;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: ai2  reason: default package */
public final class ai2 extends l5e implements i26 {
    public final /* synthetic */ Collection X;
    public final /* synthetic */ di2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ai2(Set set, di2 di2, Continuation continuation) {
        super(2, continuation);
        this.X = set;
        this.Y = di2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ai2((Set) this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        di2 di2 = this.Y;
        String c0 = o23.c0(this.X, ", ", (String) null, (String) null, new l(23, di2), 30);
        int t = hr1.t(di2.A0);
        l05 l05 = di2.B0;
        Collection collection = this.X;
        if (t == 0) {
            taf.o(l05, pfa.k(collection, new hge(l8a.g2), new lge(c0)));
        } else if (t == 1) {
            taf.o(l05, pfa.l(collection, new hge(l8a.h2), new lge(c0)));
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return jue.a;
    }
}
