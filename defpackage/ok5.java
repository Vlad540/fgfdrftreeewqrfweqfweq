package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: ok5  reason: default package */
public final class ok5 extends l5e implements i26 {
    public final /* synthetic */ Object A0;
    public int X;
    public final /* synthetic */ k7c Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ long w0;
    public final /* synthetic */ long x0;
    public final /* synthetic */ hu3 y0;
    public final /* synthetic */ d5b z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ok5(k7c k7c, long j, long j2, long j3, hu3 hu3, d5b d5b, Object obj, Continuation continuation) {
        super(2, continuation);
        this.Y = k7c;
        this.Z = j;
        this.w0 = j2;
        this.x0 = j3;
        this.y0 = hu3;
        this.z0 = d5b;
        this.A0 = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new ok5(this.Y, this.Z, this.w0, this.x0, this.y0, this.z0, this.A0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        k7c k7c = this.Y;
        if (i == 0) {
            wx3.H(obj);
            this.X = 1;
            if (ek8.q(k7c.a - this.Z, this) == pu3) {
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
        if (this.w0 == k7c.a) {
            int i2 = zp4.o;
            k7c.a = zp4.e(mt0.Q(System.nanoTime(), eq4.b)) + this.x0;
            nk5 nk5 = new nk5(this.z0, this.A0, (Continuation) null);
            this.X = 2;
            if (xs7.U(this.y0, nk5, this) == pu3) {
                return pu3;
            }
        }
        return jue.a;
    }
}
