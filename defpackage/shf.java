package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: shf  reason: default package */
public final class shf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ gif Z;
    public final /* synthetic */ qff w0;
    public final /* synthetic */ phf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public shf(qff qff, phf phf, gif gif, Continuation continuation) {
        super(2, continuation);
        this.Z = gif;
        this.w0 = qff;
        this.x0 = phf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((String) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        shf shf = new shf(this.w0, this.x0, this.Z, continuation);
        shf.Y = obj;
        return shf;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        phf phf = this.x0;
        gif gif = this.Z;
        if (i == 0) {
            wx3.H(obj);
            r57 r57 = gif.a;
            String str = this.w0.b;
            b2e b2e = c2e.Companion;
            tff tff = new tff(str, (String) this.Y);
            r57.getClass();
            f57 f57 = new f57(phf.a, r57.b(tff.Companion.serializer(), tff));
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
