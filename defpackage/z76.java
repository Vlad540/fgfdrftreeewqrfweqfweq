package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z76  reason: default package */
public final class z76 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ g86 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z76(Object obj, Continuation continuation, g86 g86) {
        super(2, continuation);
        this.Y = obj;
        this.Z = g86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new z76(this.Y, continuation, this.Z);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long longValue = ((Number) this.Y).longValue();
            sk7 sk7 = (sk7) this.Z.c.getValue();
            sk7.getClass();
            mv9 b = sk7.b(sk7, longValue, false, 26);
            this.X = 1;
            obj = e07.d(b, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
