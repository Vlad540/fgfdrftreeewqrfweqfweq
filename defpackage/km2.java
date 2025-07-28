package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: km2  reason: default package */
public final class km2 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ nn2 Z;
    public final /* synthetic */ jv5 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public km2(long j, nn2 nn2, jv5 jv5, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = nn2;
        this.w0 = jv5;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((km2) n((ou3) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new km2(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        nn2 nn2 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            et0 q = nn2.q(nn2);
            this.X = 1;
            obj = ns7.b(this.Y, 1, q, this.w0, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        taf.o(nn2.c1, (yl2) obj);
        return jue.a;
    }
}
