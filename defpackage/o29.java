package defpackage;

/* renamed from: o29  reason: default package */
public final class o29 extends taf {
    public final l05 X = new l05(0);
    public final ip b;
    public final grd c;
    public final t0c o;

    public o29(ip ipVar) {
        this.b = ipVar;
        grd a = hrd.a(hw4.a);
        this.c = a;
        this.o = new t0c(a);
        q();
    }

    public final void q() {
        lg7 c2 = hwf.c();
        o7d o7d = r2;
        o7d o7d2 = new o7d(Long.MAX_VALUE, 0, new hge(j7a.a), (d7d) null, (mge) null, (Integer) null, new z6d(((kp) this.b).g.getBoolean("app.messages.send.by.enter", false), true), (u6d) null, (mge) null, 0, (r6d) null, 1976);
        c2.add(o7d);
        c2.add(new o7d(9223372036854775806L, 0, new hge(j7a.b), (d7d) null, (mge) null, (Integer) null, w6d.a, (u6d) null, (mge) null, 0, (r6d) null, 1976));
        lg7 a = hwf.a(c2);
        this.c.setValue(a);
        String name = o29.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, name, wn6.h(a.getSize(), "process sections. finish, size:"), (Throwable) null);
        }
    }
}
