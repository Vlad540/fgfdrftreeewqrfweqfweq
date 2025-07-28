package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hm2  reason: default package */
public final class hm2 extends l5e implements i26 {
    public final /* synthetic */ nn2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hm2(nn2 nn2, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = nn2;
        this.Y = j;
        this.Z = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((hm2) n((ou3) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hm2(this.X, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        t52 l = this.X.o.l();
        i22 B = l.B(this.Y);
        if (B != null) {
            l.l(this.Z, B);
            ((pk) l.p.get()).r(B.a);
        }
        return jue.a;
    }
}
