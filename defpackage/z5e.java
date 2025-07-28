package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z5e  reason: default package */
public final class z5e extends l5e implements m26 {
    public int X;
    public /* synthetic */ Throwable Y;
    public final /* synthetic */ h6e Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z5e(h6e h6e, Continuation continuation) {
        super(4, continuation);
        this.Z = h6e;
    }

    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        rj5 rj5 = (rj5) obj;
        ((Number) obj3).longValue();
        z5e z5e = new z5e(this.Z, (Continuation) obj4);
        z5e.Y = (Throwable) obj2;
        return z5e.o(jue.a);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Throwable th = this.Y;
            this.X = 1;
            obj = h6e.c(this.Z, th, this);
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
