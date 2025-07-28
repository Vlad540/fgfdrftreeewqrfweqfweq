package defpackage;

import java.util.Map;

/* renamed from: cye  reason: default package */
public final /* synthetic */ class cye implements h73, yx7 {
    public final /* synthetic */ dye a;
    public final /* synthetic */ fwe b;

    public /* synthetic */ cye(dye dye, fwe fwe) {
        this.a = dye;
        this.b = fwe;
    }

    public void b(x63 x63) {
        ((Map) this.a.b).remove(this.b);
        x63.b();
    }

    public void c(ex7 ex7) {
        wve wve = (wve) ((Map) this.a.b).get(this.b);
        if (wve != null) {
            if (!ex7.h()) {
                ex7.a(wve);
            }
        } else if (!ex7.h()) {
            ex7.b();
        }
    }
}
