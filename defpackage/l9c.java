package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l9c  reason: default package */
public final class l9c extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ i26 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l9c(i26 i26, Continuation continuation) {
        super(2, continuation);
        this.Z = i26;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((l9c) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        l9c l9c = new l9c(this.Z, continuation);
        l9c.Y = obj;
        return l9c;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (this.Z.invoke((ou3) this.Y, this) == pu3) {
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
