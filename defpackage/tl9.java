package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: tl9  reason: default package */
public final class tl9 extends lbe {
    public long X;
    public nzc Y;
    public long c;
    public long o;

    public tl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 1;
                    break;
                }
                break;
            case 3560141:
                if (str.equals("time")) {
                    c2 = 2;
                    break;
                }
                break;
            case 95844769:
                if (str.equals("draft")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = jjd.J(ws8, 0);
                return;
            case 1:
                this.o = jjd.J(ws8, 0);
                return;
            case 2:
                this.X = jjd.J(ws8, 0);
                return;
            case 3:
                this.Y = lp.B(ws8);
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
        nzc nzc = this.Y;
        StringBuilder k = hr1.k(j, "Response{chatId=", "userId=");
        k.append(j2);
        hr1.s(k, ", time=", j3, ", draft=");
        k.append(nzc);
        k.append("}");
        return k.toString();
    }
}
