package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: c86  reason: default package */
public final class c86 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ z63 Z;
    public final /* synthetic */ boolean w0;
    public final /* synthetic */ g86 x0;
    public final /* synthetic */ yc4 y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c86(Object obj, Continuation continuation, z63 z63, boolean z, g86 g86, yc4 yc4) {
        super(2, continuation);
        this.Y = obj;
        this.Z = z63;
        this.w0 = z;
        this.x0 = g86;
        this.y0 = yc4;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new c86(this.Y, continuation, this.Z, this.w0, this.x0, this.y0);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            xm8 xm8 = (xm8) this.Y;
            this.Z.makeCompleting$kotlinx_coroutines_core(new Long(xm8.a.x0));
            if (this.w0) {
                return new h0d(new g0d(xm8));
            }
            this.X = 1;
            obj = g86.a(this.x0, this.y0, xm8, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        h1d h1d = new h1d(0, (String) null, false, hw4.a);
        h1d.b = (sq8) obj;
        return new j1d(h1d);
    }
}
