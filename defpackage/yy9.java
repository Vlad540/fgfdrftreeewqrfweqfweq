package defpackage;

import org.apache.http.cookie.ClientCookie;

/* renamed from: yy9  reason: default package */
public final class yy9 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public yy9(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final f03 a() {
        return (f03) this.b.getValue();
    }

    public final Object b(String str, fp7 fp7) {
        String str2;
        long j;
        long o = ((lqc) a()).o();
        long j2 = ((lqc) a()).g.getLong("user.contactsLastSync", 0);
        long e = ((lqc) a()).e("user.presenceLastSync", 0);
        String name = yy9.class.getName();
        String T = ez3.T(new Long(o));
        String T2 = ez3.T(new Long(j2));
        String T3 = ez3.T(new Long(e));
        StringBuilder j3 = c3d.j("LoginTamTask: chatsLastSync = ", T, ", contactLastSync = ", T2, ", presenceLastSync = ");
        j3.append(T3);
        udd.q(name, j3.toString());
        t97 t97 = this.c;
        String v = ((vqc) ((xzc) t97.getValue())).v(uqc.a, (String) null);
        if (((vqc) ((xzc) t97.getValue())).g.getInt(ClientCookie.VERSION_ATTR, 1) < 6) {
            ((vqc) ((xzc) t97.getValue())).j(6, ClientCookie.VERSION_ATTR);
            j = 0;
            str2 = null;
        } else {
            j = o;
            str2 = v;
        }
        return ((sce) this.a.getValue()).e(new io7(str, ((rf4) this.d.getValue()).d(), j, j2, e, str2, ((lqc) a()).g.getLong("user.callsLastSync", 0), ((lqc) a()).g.getLong("app.last.login.time", 0), ((lqc) a()).g.getLong("user.draftsLastSync", -1)), fp7);
    }
}
