package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uf0  reason: default package */
public final class uf0 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ xf0 Y;
    public final /* synthetic */ t97 Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uf0(xf0 xf0, t97 t97, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Y = xf0;
        this.Z = t97;
        this.w0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((uf0) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new uf0(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        xf0 xf0 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            fg0 fg0 = xf0.c;
            this.X = 1;
            fg0.getClass();
            Object f = n1g.f(new eg0(fg0, (sf0) this.Z.getValue(), (Continuation) null), this);
            if (f != pu3) {
                f = jue;
            }
            if (f == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        xf0.Z.m((Object) null, xf0.q(this.w0));
        return jue;
    }
}
