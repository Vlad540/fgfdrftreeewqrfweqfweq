package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: wv3  reason: default package */
public final class wv3 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ yv3 Y;
    public final /* synthetic */ l02 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wv3(yv3 yv3, l02 l02, Continuation continuation) {
        super(2, continuation);
        this.Y = yv3;
        this.Z = l02;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new wv3(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            hcd hcd = this.Y.a;
            l02 l02 = this.Z;
            uv3 uv3 = new uv3(l02.a, l02.b);
            this.X = 1;
            if (hcd.a(uv3, this) == pu3) {
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
