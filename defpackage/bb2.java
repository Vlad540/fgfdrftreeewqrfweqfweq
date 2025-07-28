package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: bb2  reason: default package */
public final class bb2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ j60 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bb2(j60 j60, Continuation continuation) {
        super(2, continuation);
        this.Y = j60;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bb2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new bb2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            j60 j60 = this.Y;
            this.X = 1;
            obj = ((bv2) ((t97) j60.X).getValue()).d(j60.a, this);
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
