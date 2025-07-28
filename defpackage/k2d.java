package defpackage;

/* renamed from: k2d  reason: default package */
public final class k2d extends lbe {
    public int X;
    public zy Y;
    public String c;
    public String o;

    public k2d(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1669782576:
                if (str.equals("proxy-domains")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106941038:
                if (str.equals("proxy")) {
                    c2 = 1;
                    break;
                }
                break;
            case 1808396306:
                if (str.equals("app-update-type")) {
                    c2 = 2;
                    break;
                }
                break;
            case 1901043637:
                if (str.equals("location")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.Y = zy.g(ws8);
                return;
            case 1:
                this.c = jjd.M(ws8);
                return;
            case 2:
                this.X = jjd.I(ws8);
                return;
            case 3:
                this.o = jjd.M(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        int i = this.X;
        zy zyVar = this.Y;
        StringBuilder j = c3d.j("{  proxy='", str, "', locationCountryCode='", str2, "', appUpdateType=");
        j.append(i);
        j.append(", proxyDomains=");
        j.append(zyVar);
        j.append("}");
        return j.toString();
    }
}
