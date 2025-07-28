package defpackage;

import java.util.List;

/* renamed from: ijb  reason: default package */
public final class ijb {
    public final t97 a;

    public /* synthetic */ ijb(t97 t97) {
        this.a = t97;
    }

    public f03 a() {
        return (f03) this.a.getValue();
    }

    public void b(boolean z) {
        udd.q("SavedBackgroundThemeMigration", "Start theme background migration for theme: isDark=" + z + ".");
        String m = js.m(a(), z);
        List list = z ? ud0.c : ud0.b;
        i03 i03 = (i03) a();
        if (z ? i03.g.getBoolean("app.chat.background.was.set.as.solid.color.dark", false) : i03.g.getBoolean("app.chat.background.was.set.as.solid.color.light", false)) {
            js.C((String) null, z, a());
        } else if (m == null || !list.contains(m)) {
            js.C((String) o23.X(list), z, a());
        } else {
            js.C(m, z, a());
        }
    }

    public ijb(t97 t97, t97 t972) {
        this.a = t972;
        new r7e(new u5b(2, this));
    }

    public ijb() {
        this.a = tad.a.getAccessor().d(u98.class);
    }
}
