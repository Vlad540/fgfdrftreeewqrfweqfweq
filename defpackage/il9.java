package defpackage;

/* renamed from: il9  reason: default package */
public final class il9 extends lbe {
    public long X;
    public String Y;
    public long c;
    public long o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1274507337:
                if (str.equals("fileId")) {
                    c2 = 0;
                    break;
                }
                break;
            case -661256303:
                if (str.equals("audioId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 96784904:
                if (str.equals("error")) {
                    c2 = 2;
                    break;
                }
                break;
            case 452782838:
                if (str.equals("videoId")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.X = jjd.J(ws8, 0);
                return;
            case 1:
                this.c = jjd.J(ws8, 0);
                return;
            case 2:
                this.Y = jjd.M(ws8);
                return;
            case 3:
                this.o = jjd.J(ws8, 0);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        long j3 = this.X;
        String str = this.Y;
        StringBuilder k = hr1.k(j, "{audioId=", ", videoId=");
        k.append(j2);
        hr1.s(k, ", fileId=", j3, ", error='");
        return wn6.l(k, str, "'}");
    }
}
