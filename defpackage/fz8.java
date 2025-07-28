package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fz8  reason: default package */
public final class fz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fz8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fz8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        jue jue = pu3.a;
        int i = this.X;
        jue jue2 = jue.a;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y.F0;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, "Scrolling to first reacted message", (Throwable) null);
            }
            ipc ipc = ((jpc) this.Y.v1.getValue()).d;
            if (ipc != null) {
                long j = ipc.b;
                zz8 zz8 = this.Y;
                this.X = 1;
                zz8.F(j, false);
                if (jue2 == jue) {
                    return jue;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue2;
    }
}
