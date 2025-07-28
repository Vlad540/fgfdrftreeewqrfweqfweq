package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ck2  reason: default package */
public final class ck2 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pj5 Z;
    public final /* synthetic */ ou3 w0;
    public final /* synthetic */ dk2 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ck2(ik5 ik5, Continuation continuation, ou3 ou3, dk2 dk2) {
        super(2, continuation);
        this.Z = ik5;
        this.w0 = ou3;
        this.x0 = dk2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((rj5) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        ck2 ck2 = new ck2(this.Z, continuation, this.w0, this.x0);
        ck2.Y = obj;
        return ck2;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bk2 bk2 = new bk2((rj5) this.Y, this.w0, this.x0);
            this.X = 1;
            if (this.Z.c(bk2, this) == pu3) {
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
