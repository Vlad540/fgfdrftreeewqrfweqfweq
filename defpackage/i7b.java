package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: i7b  reason: default package */
public final class i7b extends l5e implements i26 {
    public int X;
    public final /* synthetic */ q7b Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i7b(q7b q7b, Continuation continuation) {
        super(2, continuation);
        this.Y = q7b;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new i7b(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        q7b q7b = this.Y;
        boolean z = true;
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
        k77[] k77Arr = q7b.J0;
        i22 s = q7b.s();
        long j = q7b.c;
        if (s == null || !s.V(j)) {
            z = false;
        }
        if (n != j && !z) {
            taf.o(q7b.F0, new u6b(new hge(i8a.h1), new Integer(e8a.b)));
        }
        return jue.a;
    }
}
