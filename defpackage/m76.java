package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m76  reason: default package */
public final class m76 extends l5e implements i26 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ n76 Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ boolean y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m76(n76 n76, long j, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.Z = n76;
        this.w0 = j;
        this.x0 = j2;
        this.y0 = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m76 m76 = new m76(this.Z, this.w0, this.x0, this.y0, continuation);
        m76.Y = obj;
        return m76;
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            bc n = vx3.n(ez3.H(((ap3) this.Z.a.getValue()).c(this.w0), new k76((ou3) this.Y, this.w0, this.Z, this.x0, this.y0, (Continuation) null)), zp4.e(this.x0), new l5e(2, (Continuation) null));
            this.X = 1;
            obj = ez3.D(n, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        Object obj2 = ((mcc) obj).a;
        if (obj2 instanceof kcc) {
            return null;
        }
        return obj2;
    }
}
