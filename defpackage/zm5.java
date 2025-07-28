package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zm5  reason: default package */
public final class zm5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ s16 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zm5(kqc kqc, Continuation continuation) {
        super(2, continuation);
        this.Z = kqc;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zm5 zm5 = new zm5(this.Z, continuation);
        zm5.Y = obj;
        return zm5;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Object invoke = this.Z.invoke();
            this.X = 1;
            if (((rj5) this.Y).a(invoke, this) == pu3) {
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
