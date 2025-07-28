package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: nt5  reason: default package */
public final class nt5 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ k7c Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nt5(k7c k7c, long j, Continuation continuation) {
        super(2, continuation);
        this.Z = k7c;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((nt5) n((we6) obj, (Continuation) obj2)).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        nt5 nt5 = new nt5(this.Z, this.w0, continuation);
        nt5.Y = obj;
        return nt5;
    }

    public final Object o(Object obj) {
        we6 we6;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            we6 we62 = (we6) this.Y;
            long currentTimeMillis = System.currentTimeMillis() - this.Z.a;
            long j = this.w0;
            if (currentTimeMillis > j) {
                return we62;
            }
            this.Y = we62;
            this.X = 1;
            if (ek8.q(j - currentTimeMillis, this) == pu3) {
                return pu3;
            }
            we6 = we62;
        } else if (i == 1) {
            we6 = (we6) this.Y;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return we6;
    }
}
