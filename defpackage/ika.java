package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ika  reason: default package */
public final class ika extends l5e implements i26 {
    public int X;
    public final /* synthetic */ oka Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ika(oka oka, Continuation continuation) {
        super(2, continuation);
        this.Y = oka;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((ika) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ika(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        oka oka = this.Y;
        if (i == 0) {
            wx3.H(obj);
            km1 km1 = oka.b;
            this.X = 1;
            obj = xs7.U(((pae) km1.c.getValue()).b(), new im1(km1, (Continuation) null), this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        qja qja = new qja(xja.a(), (vl1) obj);
        bka bka = (bka) oka.w0.get();
        if (bka == null) {
            oka.e(new bka(qja));
        } else {
            oka.e(new bka(qja, bka.b, bka.c, bka.d, bka.e, bka.f, bka.g, bka.h));
        }
        oka.d();
        return jue.a;
    }
}
