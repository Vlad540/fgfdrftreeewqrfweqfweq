package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: bl8  reason: default package */
public final class bl8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ cl8 Y;
    public final /* synthetic */ boolean Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bl8(cl8 cl8, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = cl8;
        this.Z = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ii8) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        bl8 bl8 = new bl8(this.Y, this.Z, continuation);
        bl8.X = obj;
        return bl8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ii8 ii8 = (ii8) this.X;
        k77[] k77Arr = cl8.O0;
        cl8 cl8 = this.Y;
        i22 t = cl8.t();
        jue jue = jue.a;
        if (t == null) {
            return jue;
        }
        if (hhd.f(ii8, gi8.a)) {
            qod n = taf.n(cl8, cl8.Z.a(), (ru3) null, new zk8(cl8, t, (Continuation) null), 2);
            cl8.G0.o1(cl8, cl8.O0[1], n);
        } else if (!hhd.f(ii8, hi8.a)) {
            throw new NoWhenBranchMatchedException();
        } else if (!this.Z) {
            return jue;
        } else {
            qod n2 = taf.n(cl8, cl8.Z.a(), (ru3) null, new al8(cl8, t, (Continuation) null), 2);
            cl8.H0.o1(cl8, cl8.O0[2], n2);
        }
        return jue;
    }
}
