package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* renamed from: fec  reason: default package */
public final class fec extends l5e implements i26 {
    public int X;
    public final /* synthetic */ md4 Y;
    public final /* synthetic */ nec Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fec(md4 md4, nec nec, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = md4;
        this.Z = nec;
        this.w0 = j;
        this.x0 = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fec(this.Y, this.Z, this.w0, this.x0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            int ordinal = this.Y.ordinal();
            nec nec = this.Z;
            if (ordinal == 0) {
                cw8 d = nec.d();
                this.X = 1;
                d.getClass();
                if (r1g.h(d.a, new zv8(d, this.w0, this.x0, 0), this) == pu3) {
                    return pu3;
                }
            } else if (ordinal == 1) {
                cw8 d2 = nec.d();
                this.X = 2;
                d2.getClass();
                if (r1g.h(d2.a, new zv8(d2, this.w0, this.x0, 1), this) == pu3) {
                    return pu3;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return jue.a;
    }
}
