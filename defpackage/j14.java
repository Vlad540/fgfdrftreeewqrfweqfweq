package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: j14  reason: default package */
public final class j14 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ m14 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j14(long j, m14 m14, Continuation continuation) {
        super(2, continuation);
        this.Y = j;
        this.Z = m14;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new j14(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            long j = this.Y;
            if (j > 0) {
                this.X = 1;
                if (ek8.q(j, this) == pu3) {
                    return pu3;
                }
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
            return jue.a;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        m14 m14 = this.Z;
        d14 d14 = m14.g;
        this.X = 2;
        if (m14.a(m14, d14, this) == pu3) {
            return pu3;
        }
        return jue.a;
    }
}
