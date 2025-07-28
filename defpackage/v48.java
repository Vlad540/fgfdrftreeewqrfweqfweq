package defpackage;

/* renamed from: v48  reason: default package */
public final /* synthetic */ class v48 implements y48, bd8 {
    public final /* synthetic */ eya a;

    public /* synthetic */ v48(eya eya) {
        this.a = eya;
    }

    public void a(hc8 hc8, int i) {
        hc8.h(i, this.a);
    }

    public void c(o48 o48) {
        boolean z;
        if (o48.isConnected()) {
            eya eya = o48.s;
            eya eya2 = this.a;
            if (!oze.a(eya, eya2)) {
                o48.s = eya2;
                eya eya3 = o48.t;
                eya i = o48.i(o48.r, eya2);
                o48.t = i;
                if (!i.equals(eya3)) {
                    e8c e8c = o48.p;
                    e8c a2 = t33.a(o48.o, o48.q, o48.t);
                    o48.p = a2;
                    z = !a2.equals(e8c);
                    o48.h.f(13, new b48(o48, 19));
                } else {
                    z = false;
                }
                if (z) {
                    o48.a.o(new b48(o48, 0));
                }
            }
        }
    }
}
