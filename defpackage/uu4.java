package defpackage;

import java.util.List;

/* renamed from: uu4  reason: default package */
public final class uu4 extends nt4 implements nu4 {
    public final t97 a;
    public final t97 b;
    public tt4 c;
    public dv4 d;
    public boolean e;

    public uu4(t97 t97, t97 t972) {
        this.a = t97;
        this.b = t972;
    }

    public final boolean a(int i, CharSequence charSequence) {
        return j().a(i, charSequence);
    }

    public final List c(CharSequence charSequence) {
        return j().c(charSequence);
    }

    public final CharSequence e(CharSequence charSequence) {
        return j().e(charSequence);
    }

    public final List f(CharSequence charSequence) {
        return j().f(charSequence);
    }

    public final boolean g(CharSequence charSequence) {
        return j().g(charSequence);
    }

    public final void h(Throwable th) {
        pu4 pu4;
        t97 t97 = this.b;
        if (t97 != null && (pu4 = (pu4) t97.getValue()) != null) {
            ((g15) pu4.e.getValue()).c(new Exception("Can't load emoji", th), true);
        }
    }

    public final void i() {
        pu4 pu4;
        this.c = new tt4(pt4.a());
        this.e = true;
        t97 t97 = this.b;
        if (t97 != null && (pu4 = (pu4) t97.getValue()) != null) {
            ((nbe) ((mbe) pu4.d.getValue())).a().b(new oc4(11, pu4));
            mu4 mu4 = (mu4) pu4.f.getValue();
            if (mu4.d == null) {
                udd.q("mu4", "invalidate: palette is null. Ignore");
                return;
            }
            udd.q("mu4", "invalidate");
            new au9(ms9.j(mu4.d), new lu4(mu4, 0), 1).v().m(((nbe) mu4.b).a()).k(new pn1(new lu4(mu4, 1), 2, new i74(11)));
        }
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [dv4, java.lang.Object] */
    public final nu4 j() {
        tt4 tt4 = this.c;
        if (tt4 != null) {
            return tt4;
        }
        if (this.d == null) {
            this.d = new Object();
        }
        return this.d;
    }
}
