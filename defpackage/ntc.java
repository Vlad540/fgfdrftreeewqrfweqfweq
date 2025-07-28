package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: ntc  reason: default package */
public final class ntc {
    public final t97 a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e = ez3.O(3, new vfc(7));

    public ntc(t97 t97, t97 t972, t97 t973, t97 t974) {
        this.a = t97;
        this.b = t972;
        this.c = t973;
        this.d = t974;
    }

    public final w6a a() {
        return (w6a) this.a.getValue();
    }

    public final void b(lg7 lg7, tf3 tf3, i22 i22) {
        icb icb;
        vqc vqc = (vqc) ((xzc) this.d.getValue());
        vqc.getClass();
        if (vqc.m(PmsKey.f25debugprofileinfo, false) || ((i03) ((f03) this.c.getValue())).g.getBoolean("app.debug.profile.info.enabled", false)) {
            if (tf3 == null) {
                tf3 = i22 != null ? i22.k() : null;
            }
            if (tf3 != null) {
                icb = new icb(tf3.n());
            } else if (i22 != null) {
                icb = new icb(i22.b.a);
            } else {
                return;
            }
            lg7.add(icb);
        }
    }
}
