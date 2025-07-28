package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: yhf  reason: default package */
public final class yhf extends l5e implements i26 {
    public int X;
    public final /* synthetic */ gif Y;
    public final /* synthetic */ jif Z;
    public final /* synthetic */ phf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public yhf(phf phf, gif gif, jif jif, Continuation continuation) {
        super(2, continuation);
        this.Y = gif;
        this.Z = jif;
        this.w0 = phf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jue) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new yhf(this.w0, this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        phf phf = this.w0;
        gif gif = this.Y;
        if (i == 0) {
            wx3.H(obj);
            r57 r57 = gif.a;
            d2e d2e = new d2e(c2e.X, this.Z.b);
            r57.getClass();
            f57 f57 = new f57(phf.a, r57.b(d2e.Companion.serializer(), d2e));
            this.X = 1;
            if (gif.g.o(f57, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        gif.e(gif, phf.a);
        return jue.a;
    }
}
