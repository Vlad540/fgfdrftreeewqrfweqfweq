package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: e14  reason: default package */
public final class e14 extends l5e implements u16 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ m14 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e14(m14 m14, Continuation continuation, int i) {
        super(1, continuation);
        this.X = i;
        this.Z = m14;
    }

    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.X) {
            case 0:
                return new e14(this.Z, continuation, 0).o(jue.a);
            case 1:
                return new e14(this.Z, continuation, 1).o(jue.a);
            case 2:
                return new e14(this.Z, continuation, 2).o(jue.a);
            default:
                return new e14(this.Z, continuation, 3).o(jue.a);
        }
    }

    public final Object o(Object obj) {
        switch (this.X) {
            case 0:
                pu3 pu3 = pu3.a;
                int i = this.Y;
                if (i == 0) {
                    wx3.H(obj);
                    udd.q(m14.k, "cancelAll");
                    d14 d14 = d14.f;
                    m14 m14 = this.Z;
                    m14.g = d14;
                    this.Y = 1;
                    if (((x19) ((l19) m14.a.getValue())).c(this) == pu3) {
                        return pu3;
                    }
                } else if (i == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            case 1:
                pu3 pu32 = pu3.a;
                int i2 = this.Y;
                if (i2 == 0) {
                    wx3.H(obj);
                    m14 m142 = this.Z;
                    d14 d142 = m142.g;
                    d14 d143 = new d14(d142.a, d142.b, d142.e, d142.c, (cb5) null);
                    this.Y = 1;
                    if (m14.a(m142, d143, this) == pu32) {
                        return pu32;
                    }
                } else if (i2 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            case 2:
                pu3 pu33 = pu3.a;
                int i3 = this.Y;
                if (i3 == 0) {
                    wx3.H(obj);
                    m14 m143 = this.Z;
                    d14 d144 = m143.g;
                    d14 d145 = new d14(d144.a, d144.b, d144.e, d144.c, (cb5) null);
                    this.Y = 1;
                    if (m14.a(m143, d145, this) == pu33) {
                        return pu33;
                    }
                } else if (i3 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
            default:
                pu3 pu34 = pu3.a;
                int i4 = this.Y;
                if (i4 == 0) {
                    wx3.H(obj);
                    m14 m144 = this.Z;
                    d14 d146 = new d14(false, false, m144.g.e, true, (cb5) null);
                    this.Y = 1;
                    if (m14.a(m144, d146, this) == pu34) {
                        return pu34;
                    }
                } else if (i4 == 1) {
                    wx3.H(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                return jue.a;
        }
    }
}
