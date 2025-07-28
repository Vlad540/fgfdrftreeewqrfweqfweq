package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: cq4  reason: default package */
public final class cq4 extends l5e implements i26 {
    public long X;
    public int Y;
    public final /* synthetic */ dq4 Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cq4(dq4 dq4, Continuation continuation) {
        super(2, continuation);
        this.Z = dq4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((cq4) n((ou3) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new cq4(this.Z, continuation);
    }

    public final Object o(Object obj) {
        long j;
        Object value;
        long longValue;
        pu3 pu3 = pu3.a;
        int i = this.Y;
        dq4 dq4 = this.Z;
        if (i == 0) {
            wx3.H(obj);
            j = System.currentTimeMillis();
            long longValue2 = ((Number) dq4.c.getValue()).longValue();
            this.X = j;
            this.Y = 1;
            if (ek8.q(longValue2, this) == pu3) {
                return pu3;
            }
        } else if (i == 1 || i == 2) {
            j = this.X;
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            grd grd = dq4.d;
            do {
                value = grd.getValue();
                Long l = (Long) value;
            } while (!grd.b(value, new Long((System.currentTimeMillis() - j) / ((long) 1000))));
            longValue = ((Number) dq4.c.getValue()).longValue();
            this.X = j;
            this.Y = 2;
        } while (ek8.q(longValue, this) != pu3);
        return pu3;
    }
}
