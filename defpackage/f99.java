package defpackage;

/* renamed from: f99  reason: default package */
public final class f99 extends lbe {
    public String X;
    public ym8 c;
    public j22 o;

    public f99(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -2091130755:
                if (str.equals("chatAccessToken")) {
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
                this.X = jjd.M(ws8);
                return;
            case 1:
                this.o = j22.a(ws8);
                return;
            case 2:
                this.c = hhd.H(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        ym8 ym8 = this.c;
        j22 j22 = this.o;
        return "Response{, message=" + ym8 + ", chat=" + j22 + "}";
    }
}
