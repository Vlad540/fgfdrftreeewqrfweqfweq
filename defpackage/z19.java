package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: z19  reason: default package */
public final class z19 extends l5e implements u16 {
    public int X;
    public final /* synthetic */ b29 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ ym8 w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public z19(b29 b29, long j, ym8 ym8, Continuation continuation) {
        super(1, continuation);
        this.Y = b29;
        this.Z = j;
        this.w0 = ym8;
    }

    public final Object invoke(Object obj) {
        return new z19(this.Y, this.Z, this.w0, (Continuation) obj).o(jue.a);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        ym8 ym8 = this.w0;
        b29 b29 = this.Y;
        if (i == 0) {
            wx3.H(obj);
            long j = ym8.a;
            this.X = 1;
            obj = b29.a.j(this.Z, j, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else if (i == 2) {
            wx3.H(obj);
        } else if (i == 3) {
            wx3.H(obj);
        } else if (i == 4) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        if (vo8 != null) {
            return vo8;
        }
        ym8 ym82 = this.w0;
        long j2 = ym82.Y;
        if (j2 == 0) {
            long e = b29.a.e(this.Z, ((Number) b29.b.getValue()).longValue(), ym82);
            this.X = 2;
            obj = b29.a(e, this);
            return obj == pu3 ? pu3 : obj;
        }
        nec nec = b29.a;
        cw8 d = nec.d();
        long j3 = this.Z;
        jp8 h = d.h(j3, j2);
        vo8 b = h != null ? nec.b(h) : null;
        if (b != null) {
            s59 s59 = bp8.b;
            nec nec2 = b29.a;
            nec2.getClass();
            nec2.o(ym8, j3, false, (ls8) null);
            ro8 ro8 = new ro8(b, fu7.g(ym8.w0, (zpc) b29.c.getValue()), 1);
            long j4 = b.b;
            nec2.n(j4, ro8);
            this.X = 3;
            obj = b29.a(j4, this);
            return obj == pu3 ? pu3 : obj;
        }
        long e2 = b29.a.e(this.Z, ((Number) b29.b.getValue()).longValue(), this.w0);
        this.X = 4;
        obj = b29.a(e2, this);
        return obj == pu3 ? pu3 : obj;
    }
}
