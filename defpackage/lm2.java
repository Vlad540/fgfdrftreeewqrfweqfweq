package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: lm2  reason: default package */
public final class lm2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ nn2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public lm2(nn2 nn2, Continuation continuation) {
        super(2, continuation);
        this.Y = nn2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((lm2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new lm2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            nn2 nn2 = this.Y;
            i22 i22 = (i22) nn2.Z0.a.getValue();
            if (i22 != null) {
                this.X = 1;
                if (((zod) nn2.D0.getValue()).a(i22.a, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
