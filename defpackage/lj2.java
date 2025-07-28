package defpackage;

/* renamed from: lj2  reason: default package */
public final class lj2 extends taf {
    public final t0c X;
    public final t97 b;
    public final t97 c;
    public final grd o;

    public lj2() {
        mq9 mq9 = mq9.a;
        r7e d = mq9.getAccessor().d(ip.class);
        this.b = mq9.getAccessor().d(pk.class);
        this.c = d;
        grd a = hrd.a(hw4.a);
        this.o = a;
        this.X = new t0c(a);
        a.setValue(q());
    }

    public final lg7 q() {
        lg7 c2 = hwf.c();
        boolean z = false;
        boolean z2 = ((qpc) r()).n() != 1;
        boolean z3 = ((qpc) r()).n() == 0;
        if (((qpc) r()).n() == 2) {
            z = true;
        }
        o7d o7d = r5;
        o7d o7d2 = new o7d((long) q7a.a, 0, new hge(r7a.a), (d7d) null, (mge) null, (Integer) null, new z6d(z2, true), (u6d) null, (mge) null, 0, (r6d) null, 1976);
        c2.add(o7d);
        if (z2) {
            c2.add(new o7d((long) q7a.f, 1, new hge(r7a.e), (d7d) null, (mge) null, (Integer) null, new y6d(z3, true), (u6d) null, (mge) null, 0, (r6d) null, 1976));
            c2.add(new o7d((long) q7a.g, 1, new hge(r7a.f), (d7d) null, (mge) null, (Integer) null, new y6d(z, true), (u6d) null, (mge) null, 0, (r6d) null, 1976));
        }
        return hwf.a(c2);
    }

    public final ip r() {
        return (ip) this.c.getValue();
    }

    public final void s(long j) {
        if (j == ((long) q7a.a)) {
            int i = 1;
            if (((qpc) r()).n() == 1) {
                i = ((qpc) r()).g.getInt("app.notification.chats.show.last", 0);
            }
            t(i);
        } else if (j == ((long) q7a.f)) {
            t(0);
        } else if (j == ((long) q7a.g)) {
            t(2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [eze, java.lang.Object] */
    public final void t(int i) {
        String str = i != 1 ? i != 2 ? "ON" : "REPLY" : "OFF";
        ((qpc) r()).r(i);
        ? obj = new Object();
        obj.d = str;
        ((pk) this.b.getValue()).a(new gze(obj));
        this.o.setValue(q());
    }
}
