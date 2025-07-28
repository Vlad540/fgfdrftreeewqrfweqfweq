package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gp5  reason: default package */
public final class gp5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ip5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gp5(ip5 ip5, Continuation continuation) {
        super(2, continuation);
        this.Y = ip5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gp5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ip5 ip5 = this.Y;
            ck5 b = ip5.c.b();
            hcd hcd = ip5.a;
            this.X = 1;
            if (b.c(hcd, this) == pu3) {
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
