package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: h7b  reason: default package */
public final class h7b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ q7b Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h7b(q7b q7b, Continuation continuation) {
        super(2, continuation);
        this.Y = q7b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new h7b(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        q7b q7b = this.Y;
        if (i == 0) {
            wx3.H(obj);
            ap3 ap3 = q7b.Z;
            this.X = 1;
            obj = ap3.d(this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long n = ((tf3) obj).n();
        long j = q7b.c;
        int i2 = (n > j ? 1 : (n == j ? 0 : -1));
        jue jue = jue.a;
        if (i2 == 0) {
            taf.o(q7b.F0, new u6b(new hge(i8a.g1), (Integer) null));
            return jue;
        }
        s8b.c.getClass();
        taf.o(q7b.E0, new a34(":profile?id=" + j + "&type=contact"));
        return jue;
    }
}
