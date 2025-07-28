package defpackage;

/* renamed from: nm9  reason: default package */
public final class nm9 extends lbe {
    public long X;
    public j22 c;
    public long o;

    public nm9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2129294769:
                if (str.equals("startTime")) {
                    c2 = 0;
                    break;
                }
                break;
            case -1607243192:
                if (str.equals("endTime")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3052376:
                if (str.equals("chat")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = jjd.J(ws8, 0);
                return;
            case 1:
                this.X = jjd.J(ws8, 0);
                return;
            case 2:
                this.c = j22.a(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.o;
        long j2 = this.X;
        j22 j22 = this.c;
        StringBuilder k = hr1.k(j, "{startTime=", ", endTime=");
        k.append(j2);
        k.append(", chat=");
        k.append(j22);
        k.append("}");
        return k.toString();
    }
}
