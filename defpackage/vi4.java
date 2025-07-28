package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vi4  reason: default package */
public final class vi4 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ wi4 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vi4(wi4 wi4, Continuation continuation) {
        super(2, continuation);
        this.Y = wi4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((vi4) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new vi4(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            wi4 wi4 = this.Y;
            int i2 = zp4.o;
            q02 M = vx3.M((lc9) wi4.c.getValue(), mt0.P(1, eq4.SECONDS));
            bw bwVar = new bw(5, wi4);
            this.X = 1;
            Object c = M.c(new ac(bwVar, 18, wi4), this);
            if (c != pu3) {
                c = jue;
            }
            if (c == pu3) {
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
