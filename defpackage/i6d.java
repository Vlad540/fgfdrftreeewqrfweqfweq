package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i6d  reason: default package */
public final class i6d extends l5e implements i26 {
    public final /* synthetic */ k6d X;
    public final /* synthetic */ long Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i6d(k6d k6d, long j, Continuation continuation) {
        super(2, continuation);
        this.X = k6d;
        this.Y = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((ou3) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i6d(this.X, this.Y, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        k6d k6d = this.X;
        i22 q = ((aw2) ((bv2) k6d.X.getValue())).q(this.Y);
        if (q != null) {
            c9d.c.getClass();
            taf.o(k6d.C0, new a34(wn6.k(new StringBuilder(":profile?id="), q.a, "&type=local_chat&is_opened_from_dialog=false")));
        }
        return jue.a;
    }
}
