package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: b72  reason: default package */
public final class b72 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ n72 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b72(n72 n72, Continuation continuation) {
        super(2, continuation);
        this.Y = n72;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new b72(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            n72 n72 = this.Y;
            boolean z = n72.B && n72.C;
            long j = n72.n;
            ((luf) n72.u.getValue()).a(new f0d(j, z));
            if (z) {
                hcd hcd = n72.d;
                y8b y8b = new y8b(j);
                this.X = 1;
                if (hcd.a(y8b, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
