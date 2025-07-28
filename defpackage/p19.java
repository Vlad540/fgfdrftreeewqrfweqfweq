package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p19  reason: default package */
public final class p19 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ x19 Z;
    public final /* synthetic */ t97 w0;
    public final /* synthetic */ t97 x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p19(t97 t97, t97 t972, x19 x19, Continuation continuation) {
        super(2, continuation);
        this.Z = x19;
        this.w0 = t97;
        this.x0 = t972;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wna) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p19 p19 = new p19(this.w0, this.x0, this.Z, continuation);
        p19.Y = obj;
        return p19;
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        x19 x19 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            grd grd = x19.z0;
            this.X = 1;
            grd.setValue((wna) this.Y);
            if (jue2 == jue) {
                return jue;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xs7.E(x19.y0, (hu3) null, (ru3) null, new o19(this.w0, this.x0, x19, (Continuation) null), 3);
        return jue2;
    }
}
