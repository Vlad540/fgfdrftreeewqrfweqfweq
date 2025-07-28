package defpackage;

import kotlin.coroutines.Continuation;

/* renamed from: uga  reason: default package */
public final class uga extends taf {
    public static final /* synthetic */ k77[] w0;
    public final grd X;
    public final t0c Y;
    public final e3 Z = hwf.t();
    public final t97 b;
    public final t97 c;
    public final t97 o;

    static {
        k77 hc9 = new hc9(uga.class, "changePushNewUserJob", "getChangePushNewUserJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        w0 = new k77[]{hc9};
    }

    public uga() {
        mq9 mq9 = mq9.a;
        r7e d = mq9.getAccessor().d(ip.class);
        r7e d2 = mq9.getAccessor().d(pk.class);
        r7e d3 = mq9.getAccessor().d(pae.class);
        this.b = d2;
        this.c = d;
        this.o = d3;
        grd a = hrd.a(hw4.a);
        this.X = a;
        this.Y = new t0c(a);
        a.setValue(q());
    }

    public final lg7 q() {
        lg7 c2 = hwf.c();
        c2.add(new o7d((long) q7a.q, 0, new hge(r7a.m), (d7d) null, (mge) null, (Integer) null, new z6d(((kp) ((ip) this.c.getValue())).g.getBoolean("app.notification.show.new.users", true), true), (u6d) null, (mge) null, 0, (r6d) null, 1976));
        return hwf.a(c2);
    }

    public final void r(long j) {
        if (j == ((long) q7a.q)) {
            qod D = xs7.D(this.a, ((pae) this.o.getValue()).b(), ru3.b, new tga(this, (Continuation) null));
            this.Z.o1(this, w0[0], D);
        }
    }
}
