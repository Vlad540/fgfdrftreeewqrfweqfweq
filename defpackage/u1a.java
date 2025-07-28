package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: u1a  reason: default package */
public final class u1a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ v1a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public u1a(v1a v1a, Continuation continuation) {
        super(2, continuation);
        this.Y = v1a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new u1a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            v1a v1a = this.Y;
            long j = v1a.b;
            this.X = 1;
            obj = ((bv2) v1a.d.getValue()).d(j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
