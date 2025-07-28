package defpackage;

import java.util.List;

/* renamed from: n92  reason: default package */
public final class n92 extends lbe {
    public uj3 X;
    public List c;
    public j22 o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 0;
                    break;
                }
                break;
            case 3599307:
                if (str.equals("user")) {
                    c2 = 1;
                    break;
                }
                break;
            case 94623771:
                if (str.equals("chats")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = j22.a(ws8);
                return;
            case 1:
                this.X = uj3.e(ws8);
                return;
            case 2:
                this.c = zy.b(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        cqc.Y.getClass();
        Integer valueOf = Integer.valueOf(ete.p(this.c));
        j22 j22 = this.o;
        uj3 uj3 = this.X;
        return "{chats=" + valueOf + ", chat=" + j22 + ", contact=" + uj3 + "}";
    }
}
