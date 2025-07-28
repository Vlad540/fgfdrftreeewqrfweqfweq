package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: f14  reason: default package */
public final class f14 extends l5e implements u16 {
    public final /* synthetic */ int X = 0;
    public int Y;
    public final /* synthetic */ m14 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f14(long j, m14 m14, Continuation continuation) {
        super(1, continuation);
        this.w0 = j;
        this.Z = m14;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new f14(this.w0, this.Z, continuation).o(jue.a);
            default:
                return new f14(this.Z, this.w0, continuation).o(jue.a);
        }
    }

    public final Object o(Object obj) {
        jue jue = jue.a;
        long j = this.w0;
        m14 m14 = this.Z;
        pu3 pu3 = pu3.a;
        switch (this.X) {
            case 0:
                int i = this.Y;
                if (i == 0) {
                    wx3.H(obj);
                    udd.p(m14.k, "cancelServerChatId %d", new Object[]{new Long(j)});
                    m14.g.e.l(j);
                    this.Y = 1;
                    return ((x19) ((l19) m14.a.getValue())).d(j, this) == pu3 ? pu3 : jue;
                } else if (i == 1) {
                    wx3.H(obj);
                    return jue;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                int i2 = this.Y;
                if (i2 == 0) {
                    wx3.H(obj);
                    d14 d14 = m14.g;
                    d14 d142 = d14.f;
                    boolean z = d14.b;
                    zb9 zb9 = d14.e;
                    zb9.a(j);
                    d14 d143 = new d14(d14.a, z, zb9, d14.c, (cb5) null);
                    this.Y = 1;
                    return m14.a(m14, d143, this) == pu3 ? pu3 : jue;
                } else if (i2 == 1) {
                    wx3.H(obj);
                    return jue;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f14(m14 m14, long j, Continuation continuation) {
        super(1, continuation);
        this.Z = m14;
        this.w0 = j;
    }
}
