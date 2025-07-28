package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: wkf  reason: default package */
public final class wkf extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ xkf Z;
    public final /* synthetic */ alf w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wkf(xkf xkf, alf alf, Continuation continuation) {
        super(2, continuation);
        this.Z = xkf;
        this.w0 = alf;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((Throwable) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        wkf wkf = new wkf(this.Z, this.w0, continuation);
        wkf.Y = obj;
        return wkf;
    }

    public final Object o(Object obj) {
        o57 o57;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            Throwable th = (Throwable) this.Y;
            xkf xkf = this.Z;
            xkf.getClass();
            skf skf = th instanceof skf ? (skf) th : null;
            if (skf instanceof skf) {
                o57 = new m57(new p57("request_denied", 0));
            } else if (skf == null) {
                o57 = n57.d;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            o57 o572 = o57;
            tkf tkf = tkf.b;
            String str = this.w0.a;
            this.X = 1;
            if (((m53) xkf.c.getValue()).a(xkf.e, o572, tkf, str, this) == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
