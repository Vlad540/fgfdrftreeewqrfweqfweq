package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: eif  reason: default package */
public final class eif extends l5e implements i26 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ sif Z;
    public final /* synthetic */ gif w0;
    public final /* synthetic */ phf x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eif(String str, sif sif, gif gif, phf phf, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = sif;
        this.w0 = gif;
        this.x0 = phf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((jue) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new eif(this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        phf phf = this.x0;
        gif gif = this.w0;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y;
            d2e d2e = new d2e((str == null || str.length() == 0) ? c2e.c : c2e.b, this.Z.b);
            us0 us0 = gif.g;
            String str2 = phf.a;
            r57 r57 = gif.a;
            r57.getClass();
            f57 f57 = new f57(str2, r57.b(d2e.Companion.serializer(), d2e));
            this.X = 1;
            if (us0.o(f57, this) == pu3) {
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
