package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p11  reason: default package */
public final class p11 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ x11 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p11(long j, x11 x11, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = x11;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((p11) n((i22) obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p11 p11 = new p11(this.Y, this.Z, continuation);
        p11.X = obj;
        return p11;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        i22 i22 = (i22) this.X;
        if (i22 != null) {
            x11 x11 = this.Z;
            xs7.E(x11.a, ((pae) x11.f.getValue()).a(), (ru3) null, new o11(x11, i22, (Continuation) null), 2);
            return jue.a;
        }
        throw new IllegalArgumentException("chat not found for id =#" + this.Y);
    }
}
