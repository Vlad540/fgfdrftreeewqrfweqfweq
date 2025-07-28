package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: oya  reason: default package */
public final class oya extends l5e implements i26 {
    public int X;
    public final /* synthetic */ rya Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oya(rya rya, Continuation continuation) {
        super(2, continuation);
        this.Y = rya;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new oya(this.Y, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            rya.a(this.Y);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
