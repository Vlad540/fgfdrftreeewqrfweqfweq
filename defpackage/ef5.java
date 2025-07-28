package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ef5  reason: default package */
public final class ef5 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ ff5 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ef5(ff5 ff5, Continuation continuation) {
        super(2, continuation);
        this.Y = ff5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ef5) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ef5(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.b;
            cf5 cf5 = cf5.a;
            this.X = 1;
            if (hcd.a(cf5, this) == pu3) {
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
