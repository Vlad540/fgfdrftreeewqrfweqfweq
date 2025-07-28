package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: jk8  reason: default package */
public final class jk8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ pk8 Y;
    public final /* synthetic */ String Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public jk8(pk8 pk8, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = pk8;
        this.Z = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((jk8) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new jk8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            pk8 pk8 = this.Y;
            v11 v11 = new v11(new ik5(pk8.i, 25), pk8.h, new od1((Object) pk8, (Object) this.Z, (Continuation) null, 4), 4);
            gk8 gk8 = new gk8(pk8, (Continuation) null);
            this.X = 1;
            if (ez3.q(v11, gk8, this) == pu3) {
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
