package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gz8  reason: default package */
public final class gz8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ zz8 Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gz8(zz8 zz8, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = zz8;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new gz8(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            String str = this.Y.F0;
            long j = this.Z;
            fn6 fn6 = udd.e;
            if (fn6 != null && fn6.c()) {
                fn6.d(tn7.X, str, us8.i(j, "Scrolling to requested message with id="), (Throwable) null);
            }
            zz8 zz8 = this.Y;
            long j2 = this.Z;
            this.X = 1;
            if (zz8.r(zz8, j2, this) == pu3) {
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
