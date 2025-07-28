package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: l14  reason: default package */
public final class l14 extends l5e implements u16 {
    public int X;
    public final /* synthetic */ m14 Y;
    public final /* synthetic */ cb5 Z;
    public final /* synthetic */ boolean w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l14(m14 m14, cb5 cb5, boolean z, Continuation continuation) {
        super(1, continuation);
        this.Y = m14;
        this.Z = cb5;
        this.w0 = z;
    }

    public final Object invoke(Object obj) {
        return new l14(this.Y, this.Z, this.w0, (Continuation) obj).o(jue.a);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        if (i == 0) {
            wx3.H(obj);
            m14 m14 = this.Y;
            d14 d14 = m14.g;
            cb5 cb5 = this.Z;
            long j = cb5.a;
            zb9 zb9 = d14.e;
            zb9.a(j);
            d14 d142 = new d14(d14.a, this.w0, zb9, d14.c, cb5);
            this.X = 1;
            if (m14.a(m14, d142, this) == pu3) {
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
