package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: mn2  reason: default package */
public final class mn2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public mn2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((mn2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new mn2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        nn2 nn2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = nn2.y(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        nn2.o.l().g0(((Number) obj).longValue());
        taf.o(nn2.c1, new dm2(rhc.J, (Integer) null, new Integer(phc.m), 2));
        return jue.a;
    }
}
