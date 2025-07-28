package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: a12  reason: default package */
public final class a12 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ b12 Z;
    public final /* synthetic */ rj5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a12(b12 b12, rj5 rj5, Continuation continuation) {
        super(2, continuation);
        this.Z = b12;
        this.w0 = rj5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((a12) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        a12 a12 = new a12(this.Z, this.w0, continuation);
        a12.Y = obj;
        return a12;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Object obj2 = new Object();
            b12 b12 = this.Z;
            pj5 pj5 = b12.o;
            t02 t02 = new t02(obj2, (ou3) this.Y, b12, this.w0, 1);
            this.X = 1;
            if (pj5.c(t02, this) == pu3) {
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
