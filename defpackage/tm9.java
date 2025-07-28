package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: tm9  reason: default package */
public final class tm9 extends lbe {
    public e00 X;
    public long c;
    public long o;

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
            case 3575610:
                if (str.equals("type")) {
                    c2 = 2;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = ws8.w0();
                return;
            case 1:
                this.o = ws8.w0();
                return;
            case 2:
                String M = jjd.M(ws8);
                if (M != null) {
                    this.X = e00.a(M);
                    return;
                }
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        long j = this.c;
        long j2 = this.o;
        e00 e00 = this.X;
        StringBuilder k = hr1.k(j, "{chatId=", ", userId=");
        k.append(j2);
        k.append(", type=");
        k.append(e00);
        k.append("}");
        return k.toString();
    }
}
