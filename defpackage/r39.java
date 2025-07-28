package defpackage;

import java.util.UUID;

/* renamed from: r39  reason: default package */
public final class r39 implements pye {
    public final fc9 a;

    public r39() {
        fc9 c = fc9.c();
        c.j(pye.m0, new Object());
        c.j(qq6.z, 34);
        Class<s39> cls = s39.class;
        c.j(gde.d0, cls);
        c.j(gde.c0, cls.getCanonicalName() + "-" + UUID.randomUUID());
        this.a = c;
    }

    public final ia3 getConfig() {
        return this.a;
    }

    public final rye t() {
        return rye.Y;
    }
}
