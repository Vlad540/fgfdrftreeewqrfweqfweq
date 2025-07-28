package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hz4  reason: default package */
public final class hz4 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ iz4 Z;
    public final /* synthetic */ String w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hz4(iz4 iz4, String str, Continuation continuation) {
        super(2, continuation);
        this.Z = iz4;
        this.w0 = str;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        hz4 hz4 = new hz4(this.Z, this.w0, continuation);
        hz4.Y = obj;
        return hz4;
    }

    public final Object o(Object obj) {
        ou3 ou3;
        pu3 pu3 = pu3.a;
        int i = this.X;
        jue jue = jue.a;
        iz4 iz4 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            ou3 ou32 = (ou3) this.Y;
            iz4.x0 = true;
            r7e r7e = dy4.a;
            String a = dy4.a(this.w0);
            if (!n1g.A(ou32)) {
                iz4.x0 = false;
                return jue;
            }
            i03 i03 = (i03) ((f03) iz4.b.getValue());
            boolean f = hhd.f(i03.g.getString("app.pin_" + i03.s(), (String) null), a);
            l05 l05 = iz4.X;
            if (!f) {
                taf.o(l05, jz4.b);
                iz4.x0 = false;
                return jue;
            }
            taf.o(l05, jz4.a);
            this.Y = ou32;
            this.X = 1;
            if (ek8.q(1000, this) == pu3) {
                return pu3;
            }
            ou3 = ou32;
        } else if (i == 1) {
            ou3 = (ou3) this.Y;
            try {
                wx3.H(obj);
            } catch (Throwable th) {
                iz4.x0 = false;
                throw th;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        if (n1g.A(ou3)) {
            taf.o(iz4.Y, jue);
        }
        iz4.x0 = false;
        return jue;
    }
}
