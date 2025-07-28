package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: hq9  reason: default package */
public final class hq9 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ kq9 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public hq9(kq9 kq9, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = kq9;
        this.Z = j;
        this.w0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new hq9(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            obj = this.Y.c(this.Z, this.w0, this);
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
        if (((Boolean) obj).booleanValue()) {
            this.X = 2;
            if (((mr9) this.Y.X.getValue()).g(this.Z, this.w0, this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
