package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b40  reason: default package */
public final class b40 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ t97 Y;
    public final /* synthetic */ e40 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b40(t97 t97, e40 e40, Continuation continuation) {
        super(2, continuation);
        this.Y = t97;
        this.Z = e40;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b40(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        if (i == 0) {
            wx3.H(obj);
            t97 t97 = this.Y;
            t0c t0c = ((nb9) ((va9) t97.getValue())).H;
            e40 e40 = this.Z;
            bw bwVar = new bw(1, (Object) e40);
            this.X = 1;
            Object c = t0c.a.c(new a40((Object) bwVar, (Object) e40, (Object) t97, 0), this);
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
