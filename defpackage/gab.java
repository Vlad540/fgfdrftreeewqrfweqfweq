package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: gab  reason: default package */
public final class gab extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hab Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public gab(hab hab, Continuation continuation) {
        super(2, continuation);
        this.Y = hab;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n((j8b) obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        gab gab = new gab(this.Y, continuation);
        gab.X = obj;
        return gab;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        j8b j8b = (j8b) this.X;
        boolean z = j8b instanceof i8b;
        hab hab = this.Y;
        if (z) {
            i8b i8b = (i8b) j8b;
            Long l = i8b.a;
            bs4 bs4 = hab.b;
            long j = bs4.m.get();
            mge mge = i8b.b;
            l05 l05 = hab.A0;
            if (l != null && l.longValue() == j) {
                xs7.E(hab.a, hab.q().b(), (ru3) null, new bab(hab, (Continuation) null), 2);
                taf.o(l05, new e9b(mge, Integer.valueOf(phc.J)));
            } else {
                long j2 = bs4.l.get();
                if (l != null && l.longValue() == j2) {
                    taf.o(l05, new e9b(mge, Integer.valueOf(phc.J)));
                } else if (l == null) {
                    taf.o(l05, new e9b(mge, Integer.valueOf(phc.J)));
                }
            }
        } else if (j8b instanceof f8b) {
            Long l2 = new Long(((f8b) j8b).a);
            if (l2.longValue() == hab.b.m.get()) {
                taf.o(hab.A0, new e9b(new hge(i8a.q), Integer.valueOf(phc.m)));
            }
        } else if (j8b instanceof h8b) {
            taf.o(hab.A0, new e9b(new hge(i8a.q), new Integer(phc.m)));
        }
        return jue.a;
    }
}
