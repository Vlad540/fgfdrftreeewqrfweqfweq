package defpackage;

import java.util.ArrayList;

/* renamed from: rl9  reason: default package */
public final class rl9 extends lbe {
    public ArrayList X;
    public ArrayList c;
    public ArrayList o;

    public rl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        ArrayList arrayList = null;
        int i = 0;
        char c2 = 65535;
        switch (str.hashCode()) {
            case -989040443:
                if (str.equals("phones")) {
                    c2 = 0;
                    break;
                }
                break;
            case -930898016:
                if (str.equals("rindex")) {
                    c2 = 1;
                    break;
                }
                break;
            case 104120:
                if (str.equals("ids")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                if (ws8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s0 = ws8.s0();
                    while (i < s0) {
                        arrayList.add(jjd.M(ws8));
                        i++;
                    }
                } else {
                    ws8.z();
                }
                this.c = arrayList;
                return;
            case 1:
                if (ws8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s02 = ws8.s0();
                    while (i < s02) {
                        arrayList.add(Integer.valueOf(jjd.I(ws8)));
                        i++;
                    }
                } else {
                    ws8.z();
                }
                this.o = arrayList;
                return;
            case 2:
                if (ws8.n().a() == 7) {
                    arrayList = new ArrayList();
                    int s03 = ws8.s0();
                    while (i < s03) {
                        arrayList.add(Long.valueOf(jjd.J(ws8, 0)));
                        i++;
                    }
                } else {
                    ws8.z();
                }
                this.X = arrayList;
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        int p = ete.p(this.c);
        int p2 = ete.p(this.o);
        return wn6.j(rf0.i("{phones=", p, ", rindex=", p2, ", ids="), ete.p(this.X), "}");
    }
}
