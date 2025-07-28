package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: fw8  reason: default package */
public final class fw8 extends l5e implements i26 {
    public int X;
    public final /* synthetic */ Long Y;
    public final /* synthetic */ gw8 Z;
    public final /* synthetic */ long w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public fw8(Long l, gw8 gw8, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = l;
        this.Z = gw8;
        this.w0 = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((ou3) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new fw8(this.Y, this.Z, this.w0, continuation);
    }

    public final Object o(Object obj) {
        pu3 pu3 = pu3.a;
        int i = this.X;
        gw8 gw8 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            Long l = this.Y;
            if (l == null) {
                return null;
            }
            long longValue = l.longValue();
            this.X = 1;
            obj = ((b29) gw8.a.getValue()).a(longValue, this);
            if (obj == pu3) {
                return pu3;
            }
        } else if (i == 1) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        vo8 vo8 = (vo8) obj;
        if (vo8 == null) {
            return null;
        }
        xm8 a = rp8.a((rp8) gw8.b.getValue(), vo8);
        long j = a.a.c;
        long j2 = this.w0;
        return new sq8(1, j2, a, (String) null, (String) null, j2, j);
    }
}
