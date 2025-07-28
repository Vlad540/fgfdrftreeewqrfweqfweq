package defpackage;

/* renamed from: xl9  reason: default package */
public final class xl9 extends lbe {
    public em7 X;
    public long c;
    public String o;

    public xl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 0;
                    break;
                }
                break;
            case 1109191185:
                if (str.equals("deviceId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = jjd.J(ws8, 0);
                return;
            case 1:
                this.o = jjd.M(ws8);
                return;
            case 2:
                this.X = em7.a(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        String str = this.o;
        em7 em7 = this.X;
        StringBuilder j2 = m4b.j("Response{userId=", j, ", deviceId='", str);
        j2.append("', location=");
        j2.append(em7);
        j2.append("}");
        return j2.toString();
    }
}
