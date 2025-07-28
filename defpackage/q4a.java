package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: q4a  reason: default package */
public final class q4a extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public q4a(t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((q4a) n(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new q4a(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((i6a) this.Y.getValue()).k(this) == pu3) {
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
