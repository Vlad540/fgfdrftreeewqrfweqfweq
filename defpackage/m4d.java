package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: m4d  reason: default package */
public final class m4d extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ v4d Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public m4d(v4d v4d, Continuation continuation) {
        super(2, continuation);
        this.Y = v4d;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((jab) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        m4d m4d = new m4d(this.Y, continuation);
        m4d.X = obj;
        return m4d;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        jab jab = (jab) this.X;
        if (jab instanceof jab) {
            Long l = jab.a;
            v4d v4d = this.Y;
            long j = v4d.I0.get();
            mge mge = jab.b;
            l05 l05 = v4d.B0;
            if (l != null && l.longValue() == j) {
                xs7.E(v4d.a, v4d.r().b(), (ru3) null, new q4d(v4d, (Continuation) null), 2);
                taf.o(l05, new t8d(mge, Integer.valueOf(phc.J)));
            } else if (l == null) {
                taf.o(l05, new t8d(mge, Integer.valueOf(phc.J)));
            }
        }
        return jue.a;
    }
}
