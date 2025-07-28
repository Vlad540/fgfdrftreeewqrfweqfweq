package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ny8  reason: default package */
public final class ny8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ny8(zz8 zz8, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ny8(this.Y, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            zz8 zz8 = this.Y;
            bv2 bv2 = zz8.w0;
            long j = zz8.b.a;
            this.X = 1;
            obj = bv2.d(j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        long j2 = ((i22) obj).o.a.b;
        String str = this.Y.F0;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, str, us8.i(j2, "Scrolling to last mention with id="), (Throwable) null);
        }
        zz8 zz82 = this.Y;
        this.X = 2;
        if (zz8.r(zz82, j2, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
