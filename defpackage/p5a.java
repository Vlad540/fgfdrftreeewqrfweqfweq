package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p5a  reason: default package */
public final class p5a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ s5a Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p5a(s5a s5a, Continuation continuation) {
        super(2, continuation);
        this.Y = s5a;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((p5a) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new p5a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((h49) this.Y.b.getValue()).d(this);
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
