package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: zq2  reason: default package */
public final class zq2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kr2 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zq2(kr2 kr2, Continuation continuation) {
        super(2, continuation);
        this.Y = kr2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zq2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new zq2(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.Y.y0.set(true);
            this.Y.A0.clear();
            this.Y.a.h.clear();
            kr2 kr2 = this.Y;
            kr2.a.j = kr2;
            kr2 kr22 = this.Y;
            this.X = 1;
            if (kr22.d(this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        this.Y.z0.set(false);
        return jue.a;
    }
}
