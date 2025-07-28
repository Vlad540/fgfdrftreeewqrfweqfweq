package defpackage;

import java.util.List;

/* renamed from: vw6  reason: default package */
public final class vw6 implements r77 {
    public static final /* synthetic */ int c = 0;
    public final List a;
    public final String b;

    static {
        new vw6(new uw6());
    }

    public vw6(uw6 uw6) {
        this.a = uw6.a;
        this.b = uw6.b;
    }

    public final boolean a(r77 r77) {
        if (r77 == null) {
            return false;
        }
        vw6 vw6 = (vw6) r77;
        if (!r1g.c(vw6.b, this.b)) {
            return false;
        }
        List list = this.a;
        int size = list.size();
        List list2 = vw6.a;
        if (size != list2.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            fu0 fu0 = (fu0) list.get(i);
            if (fu0.size() != ((fu0) list2.get(i)).size()) {
                return false;
            }
            for (int i2 = 0; i2 < fu0.size(); i2++) {
                if (!((yt0) fu0.get(i2)).equals(((fu0) list2.get(i)).get(i2))) {
                    return false;
                }
            }
        }
        return true;
    }
}
