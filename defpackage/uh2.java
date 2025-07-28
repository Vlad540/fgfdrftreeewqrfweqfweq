package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: uh2  reason: default package */
public final class uh2 extends lbe {
    public List X;
    public j22 c;
    public ym8 o;

    public uh2(ws8 ws8) {
        super(ws8);
        if (this.X == null) {
            this.X = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        ArrayList arrayList;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -573649366:
                if (str.equals("deletedMessageIds")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 1;
                    break;
                }
                break;
            case 954925063:
                if (str.equals("message")) {
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
                    for (int i = 0; i < s0; i++) {
                        arrayList.add(Long.valueOf(jjd.J(ws8, 0)));
                    }
                } else {
                    ws8.z();
                    arrayList = null;
                }
                this.X = arrayList;
                return;
            case 1:
                this.c = j22.a(ws8);
                return;
            case 2:
                this.o = hhd.H(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        j22 j22 = this.c;
        ym8 ym8 = this.o;
        int p = ete.p(this.X);
        StringBuilder sb = new StringBuilder("{chat=");
        sb.append(j22);
        sb.append(", message=");
        sb.append(ym8);
        sb.append(", deletedMessageIds=");
        return wn6.j(sb, p, "}");
    }
}
