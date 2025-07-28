package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: doa  reason: default package */
public final class doa extends lbe {
    public Long X;
    public int Y;
    public String c;
    public uj3 o;

    public doa(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -309425751:
                if (str.equals("profile")) {
                    c2 = 0;
                    break;
                }
                break;
            case 106642798:
                if (str.equals("phone")) {
                    c2 = 1;
                    break;
                }
                break;
            case 110541305:
                if (str.equals(ApiProtocol.KEY_TOKEN)) {
                    c2 = 2;
                    break;
                }
                break;
            case 141498579:
                if (str.equals("tokenType")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.o = uj3.e(ws8);
                return;
            case 1:
                this.X = Long.valueOf(jjd.J(ws8, 0));
                return;
            case 2:
                this.c = jjd.M(ws8);
                return;
            case 3:
                this.Y = us8.v(jjd.M(ws8));
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        uj3 uj3 = this.o;
        Long l = this.X;
        int i = this.Y;
        return "{token='" + str + "', profile=" + uj3 + ", phone=" + l + ", tokenType=" + us8.q(i) + "}";
    }
}
