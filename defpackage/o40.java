package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: o40  reason: default package */
public final class o40 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r40 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o40(r40 r40, Continuation continuation) {
        super(2, continuation);
        this.Y = r40;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((x40) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o40 o40 = new o40(this.Y, continuation);
        o40.X = obj;
        return o40;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        x40 x40 = (x40) this.X;
        r40 r40 = this.Y;
        r40.U0 = x40;
        if (x40 != null) {
            if (hhd.f(x40.a, r40.S0)) {
                qr4 qr4 = qr4.b;
                o20 o20 = x40.c;
                if (hhd.f(o20, qr4)) {
                    r40.H0.c(0.0f, false);
                }
                r40.d(o20);
                return jue.a;
            }
        }
        r40.d(m54.b);
        return jue.a;
    }
}
