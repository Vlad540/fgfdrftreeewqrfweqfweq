package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gi2  reason: default package */
public final class gi2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ hi2 Y;
    public final /* synthetic */ ym8 Z;
    public final /* synthetic */ ds8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gi2(hi2 hi2, ym8 ym8, ds8 ds8, Continuation continuation) {
        super(2, continuation);
        this.Y = hi2;
        this.Z = ym8;
        this.w0 = ds8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((gi2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gi2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        hi2 hi2 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = hi2.b(hi2, this.Z, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        ((grd) hi2.h).m((Object) null, new cg6(vo8.o, vo8.b, vo8.c, this.w0.o));
        return jue.a;
    }
}
