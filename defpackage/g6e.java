package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g6e  reason: default package */
public final class g6e extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ h6e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g6e(h6e h6e, Continuation continuation) {
        super(2, continuation);
        this.Z = h6e;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((wve) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        g6e g6e = new g6e(this.Z, continuation);
        g6e.Y = obj;
        return g6e;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            wve wve = (wve) this.Y;
            if (wve.a()) {
                fwe fwe = wve.a;
                int i2 = fwe.c;
                boolean z = i2 == 6;
                h6e h6e = this.Z;
                if (z || sxe.a(i2)) {
                    this.X = 1;
                    if (h6e.h(fwe, this) == pu3) {
                        return pu3;
                    }
                } else {
                    this.X = 2;
                    if (h6e.f(wve, this) == pu3) {
                        return pu3;
                    }
                }
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
