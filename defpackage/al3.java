package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: al3  reason: default package */
public final class al3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kl3 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public al3(kl3 kl3, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = kl3;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((al3) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new al3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            ((mn3) this.Y.w0.getValue()).a(this.Z);
            if (jue == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue;
    }
}
