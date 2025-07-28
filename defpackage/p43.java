package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: p43  reason: default package */
public final class p43 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ r43 Y;
    public final /* synthetic */ gv6 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public p43(r43 r43, gv6 gv6, Continuation continuation) {
        super(2, continuation);
        this.Y = r43;
        this.Z = gv6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        p43 p43 = new p43(this.Y, this.Z, continuation);
        p43.X = obj;
        return p43;
    }

    public final Object o(Object obj) {
        xm8 xm8;
        wx3.H(obj);
        ou3 ou3 = (ou3) this.X;
        r43 r43 = this.Y;
        gv6 gv6 = this.Z;
        try {
            sk7 sk7 = (sk7) r43.d.getValue();
            long j = gv6.c;
            sk7.getClass();
            xm8 = (xm8) sk7.b(sk7, j, false, 26).e();
        } catch (Throwable th) {
            xm8 = new kcc(th);
        }
        if (xm8 instanceof kcc) {
            return null;
        }
        return xm8;
    }
}
