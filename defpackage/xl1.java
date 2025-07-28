package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: xl1  reason: default package */
public final class xl1 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yl1 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public xl1(yl1 yl1, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = yl1;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((xl1) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new xl1(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        yl1 yl1 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = ((bv2) yl1.f.getValue()).u(this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j = ((i22) obj).a;
        hcd hcd = yl1.i;
        oc1.c.getClass();
        hcd.g(new a34(":profile?id=" + j + "&type=local_chat"));
        return jue.a;
    }
}
