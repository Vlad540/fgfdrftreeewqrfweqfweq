package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: poa  reason: default package */
public final class poa extends l5e implements i26 {
    public int X;
    public final /* synthetic */ voa Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public poa(voa voa, Continuation continuation) {
        super(2, continuation);
        this.Y = voa;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new poa(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            voa voa = this.Y;
            voa.getClass();
            Object f = n1g.f(new qoa(voa, (Continuation) null), this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
