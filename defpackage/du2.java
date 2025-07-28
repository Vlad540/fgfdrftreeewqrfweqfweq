package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: du2  reason: default package */
public final class du2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ fu2 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du2(fu2 fu2, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = fu2;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((du2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new du2(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (((g5e) this.Y.H0.getValue()).a(this.Z, this) == pu3) {
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
