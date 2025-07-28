package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l4d  reason: default package */
public final class l4d extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;
    public final /* synthetic */ ap3 Z;
    public final /* synthetic */ v4d w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l4d(t97 t97, ap3 ap3, v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
        this.Z = ap3;
        this.w0 = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new l4d(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            t97 t97 = this.Y;
            u09 u09 = new u09(new ck5(am7.c(((j2b) ((g2b) t97.getValue())).a.t()), new k4d(t97, (Continuation) null)), 25);
            this.X = 1;
            obj = ez3.D(u09, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0c c = this.Z.c(((Number) obj).longValue());
        bw bwVar = new bw(12, (Object) this.w0);
        this.X = 2;
        Object c2 = c.a.c(new sc5(bwVar, 5), this);
        if (c2 != pu3) {
            c2 = jue;
        }
        return c2 == pu3 ? pu3 : jue;
    }
}
