package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: vf0  reason: default package */
public final class vf0 extends l5e implements i26 {
    public /* synthetic */ boolean X;
    public final /* synthetic */ xf0 Y;
    public final /* synthetic */ t97 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vf0(xf0 xf0, t97 t97, Continuation continuation) {
        super(2, continuation);
        this.Y = xf0;
        this.Z = t97;
    }

    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        jue jue = jue.a;
        ((vf0) n(bool, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vf0 vf0 = new vf0(this.Y, this.Z, continuation);
        vf0.X = ((Boolean) obj).booleanValue();
        return vf0;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        boolean z = this.X;
        k77[] k77Arr = xf0.y0;
        xf0 xf0 = this.Y;
        qod D = xs7.D(xf0.a, xf0.b.b(), ru3.b, new uf0(xf0, this.Z, z, (Continuation) null));
        xf0.x0.o1(xf0, xf0.y0[0], D);
        return jue.a;
    }
}
