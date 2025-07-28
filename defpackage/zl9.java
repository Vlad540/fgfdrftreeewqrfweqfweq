package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: zl9  reason: default package */
public final class zl9 extends lbe {
    public long X;
    public int Y;
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
            case -840272977:
                if (str.equals("unread")) {
                    c2 = 1;
                    break;
                }
                break;
            case -836030906:
                if (str.equals("userId")) {
                    c2 = 2;
                    break;
                }
                break;
            case 3344077:
                if (str.equals("mark")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = ws8.w0();
                return;
            case 1:
                this.Y = ws8.v0();
                return;
            case 2:
                this.o = ws8.w0();
                return;
            case 3:
                this.X = ws8.w0();
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
        int i = this.Y;
        StringBuilder k = hr1.k(j, "{chatId=", ", userId=");
        k.append(j2);
        hr1.s(k, ", mark=", j3, ", unread=");
        return wn6.j(k, i, "}");
    }
}
