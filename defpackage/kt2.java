package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: kt2  reason: default package */
public final class kt2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fu2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kt2(fu2 fu2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((kt2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new kt2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        fu2 fu2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            aw2 r = fu2.r(fu2);
            this.X = 1;
            obj = r.u(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        i22 i22 = (i22) obj;
        if (i22 != null) {
            taf.o(fu2.Q0, zu2.c.a2(i22.a));
        }
        return jue.a;
    }
}
