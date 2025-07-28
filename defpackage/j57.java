package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j57  reason: default package */
public final class j57 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b0d Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j57(b0d b0d, Continuation continuation) {
        super(2, continuation);
        this.Z = b0d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((h57) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        j57 j57 = new j57(this.Z, continuation);
        j57.Y = obj;
        return j57;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            us0 us0 = (us0) this.Z.X;
            this.X = 1;
            if (us0.o((h57) this.Y, this) == pu3) {
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
