package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: coc  reason: default package */
public final class coc extends l5e implements i26 {
    public int X;
    public final /* synthetic */ doc Y;
    public final /* synthetic */ long Z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public coc(doc doc, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = doc;
        this.Z = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((coc) n((ou3) obj, (Continuation) obj2)).o(jue.a);
        return pu3.a;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        return new coc(this.Y, this.Z, continuation);
    }

    public final Object o(Object obj) {
        Object value;
        long longValue;
        pu3 pu3 = pu3.a;
        int i = this.X;
        doc doc = this.Y;
        if (i == 0) {
            wx3.H(obj);
            long longValue2 = ((Number) doc.x0.getValue()).longValue();
            this.X = 1;
            if (ek8.q(longValue2, this) == pu3) {
                return pu3;
            }
        } else if (i == 1 || i == 2) {
            wx3.H(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        do {
            grd grd = doc.y0;
            do {
                value = grd.getValue();
                Long l = (Long) value;
            } while (!grd.b(value, new Long((System.currentTimeMillis() - this.Z) / ((long) 1000))));
            longValue = ((Number) doc.x0.getValue()).longValue();
            this.X = 2;
        } while (ek8.q(longValue, this) != pu3);
        return pu3;
    }
}
