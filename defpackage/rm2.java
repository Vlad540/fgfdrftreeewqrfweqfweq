package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: rm2  reason: default package */
public final class rm2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public rm2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((rm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new rm2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ik5 ik5 = new ik5(this.Y.Z0, 2);
            this.X = 1;
            obj = ez3.D(ik5, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return new Long(((i22) obj).a);
    }
}
