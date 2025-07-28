package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.coroutines.Continuation;

/* renamed from: gec  reason: default package */
public final class gec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nec Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ Collection w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gec(nec nec, long j, Collection collection, Continuation continuation) {
        super(2, continuation);
        this.Y = nec;
        this.Z = j;
        this.w0 = collection;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gec(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            cw8 d = this.Y.d();
            List s0 = o23.s0(this.w0);
            this.X = 1;
            d.getClass();
            if (r1g.h(d.a, new lm4((Object) d, (Collection) s0, this.Z, 1), this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
