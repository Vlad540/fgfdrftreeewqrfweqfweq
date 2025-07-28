package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gm2  reason: default package */
public final class gm2 extends l5e implements i26 {
    public oz2 X;
    public int Y;
    public final /* synthetic */ nn2 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gm2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Z = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gm2(this.Z, continuation);
    }

    public final Object o(Object obj) {
        oz2 oz2;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        if (i == 0) {
            wx3.H(obj);
            nn2 nn2 = this.Z;
            oz2 = nn2.Z;
            this.X = oz2;
            this.Y = 1;
            obj = nn2.y(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            oz2 = this.X;
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long longValue = ((Number) obj).longValue();
        this.X = null;
        this.Y = 2;
        if (oz2.i(longValue, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
