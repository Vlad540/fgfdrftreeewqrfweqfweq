package defpackage;

import java.util.List;

/* renamed from: fk3  reason: default package */
public final class fk3 extends lbe {
    public List c;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("contacts")) {
            ws8.z();
        } else {
            this.c = zy.c(ws8);
        }
    }

    public final String toString() {
        return rf0.f(ete.p(this.c), "{contactInfos=", "}");
    }
}
