package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: g30  reason: default package */
public final class g30 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ h30 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ m68 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g30(h30 h30, long j, m68 m68, Continuation continuation) {
        super(2, continuation);
        this.Y = h30;
        this.Z = j;
        this.w0 = m68;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new g30(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        Object obj2;
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            ju3 b = ((pae) this.Y.Z.getValue()).b();
            f30 f30 = new f30(this.Y, this.Z, (Continuation) null);
            this.X = 1;
            obj2 = xs7.U(b, f30, this);
            if (obj2 == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
            obj2 = obj;
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj2;
        if (vo8 != null) {
            this.Y.z0 = this.Z;
            this.Y.A0 = vo8.x0;
            h30 h30 = this.Y;
            h30.s(this.Z, this.w0, h30.A0);
        } else {
            this.Y.s(this.Z, this.w0, -1);
        }
        return jue.a;
    }
}
