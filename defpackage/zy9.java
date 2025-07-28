package defpackage;

/* renamed from: zy9  reason: default package */
public final class zy9 {
    public final a5 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;

    public zy9(t97 t97, t97 t972, a5 a5Var, t97 t973) {
        this.a = a5Var;
        this.b = t97;
        this.c = t972;
        this.d = t973;
    }

    public final c5 a() {
        return (c5) this.c.getValue();
    }

    public final g2b b() {
        return (g2b) this.b.getValue();
    }

    public final kp0 c() {
        boolean d2 = d();
        boolean z = false;
        boolean c2 = ((j2b) b()).d.c("auth.account.external", false);
        if (d2 && c2) {
            z = true;
        }
        return new kp0(d2, z);
    }

    public final boolean d() {
        if (((j2b) b()).a.s() != -1) {
            String string = ((j2b) b()).d.g.getString("auth.token", (String) null);
            if (string != null && string.length() != 0) {
                return true;
            }
            c5 a2 = a();
            a2.a();
            a2.a.getClass();
        }
        return false;
    }

    public final boolean e() {
        return d() && ((j2b) b()).d.c("auth.account.external", false);
    }

    public final String f() {
        String string;
        if (((j2b) b()).a.s() == 0 || (string = ((j2b) b()).d.g.getString("auth.token", (String) null)) == null || string.length() == 0) {
            return null;
        }
        String string2 = ((j2b) b()).d.g.getString("auth.token", (String) null);
        if (string2 != null && string2.length() != 0) {
            return string2;
        }
        c5 a2 = a();
        a2.a();
        a2.a.getClass();
        return null;
    }

    public final void g(boolean z) {
        udd.q("zy9", "removeAccount");
        ((j2b) b()).d.b();
        a().b();
        if (z) {
            int i = s0d.o;
            boolean e = e();
            int i2 = zp4.o;
            s0d.c = mt0.Q(System.nanoTime(), eq4.b);
            ((luf) this.d.getValue()).a(new s0d(e));
        }
    }

    public final void h(String str, boolean z) {
        ((j2b) b()).d.n(a().a(), str, z);
        a().getClass();
    }
}
