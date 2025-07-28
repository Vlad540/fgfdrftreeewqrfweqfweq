package defpackage;

import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: wo7  reason: default package */
public final class wo7 {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;

    public wo7(t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
        this.e = t975;
        this.f = t976;
    }

    public final void a(uae uae) {
        ((j2b) ((g2b) this.a.getValue())).a.k("user.lastSentLogTime", 0L);
        ((j2b) ((g2b) this.a.getValue())).a.k("user.lastSentCriticalLogTime", 0L);
        udd.t("wo7", "onLoginFail", new Object[]{uae});
        if ("login.blocked".equals(uae.b) || "login.flood".equals(uae.b) || "login.token".equals(uae.b)) {
            ((j2b) ((g2b) this.a.getValue())).a.l("server.loginError", uae.b);
            ((zy9) this.b.getValue()).g(true);
        } else if ("session.state".equals(uae.b)) {
            String str = uae.c;
            udd.q("wo7", "session state error: " + str + " do nothing");
        } else if (!(uae instanceof lae)) {
            if ("proto.state".equals(uae.b)) {
                ((g15) this.c.getValue()).c(new TamErrorException(uae), true);
            }
            ((dce) this.f.getValue()).i();
        } else if (((zy9) this.b.getValue()).d() && ((h3d) ((f3d) this.d.getValue())).h == 2) {
            ((bp7) this.e.getValue()).r();
        }
    }
}
