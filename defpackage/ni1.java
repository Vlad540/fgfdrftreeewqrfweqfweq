package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ni1  reason: default package */
public final class ni1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ aj1 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ni1(aj1 aj1, Continuation continuation) {
        super(2, continuation);
        this.Y = aj1;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ni1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ni1(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            aj1 aj1 = this.Y;
            bc s = ez3.s(aj1.G0, aj1.A0, aj1.H0, new mi1(aj1, (Continuation) null, 0));
            this.X = 1;
            if (ez3.p(s, this) == pu3) {
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
