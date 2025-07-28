package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: lk1  reason: default package */
public final class lk1 extends lbe {
    public ci9 X;
    public String Y;
    public String c;
    public long o;

    public lk1(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1401988028:
                if (str.equals(ApiProtocol.PARAM_JOIN_LINK)) {
                    c2 = 1;
                    break;
                }
                break;
            case -992105955:
                if (str.equals(ApiProtocol.PARAM_PEER_ID)) {
                    c2 = 2;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 3;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = jjd.M(ws8);
                return;
            case 1:
                this.Y = jjd.M(ws8);
                return;
            case 2:
                this.o = jjd.J(ws8, 0);
                return;
            case 3:
                this.X = ci9.h(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        long j = this.o;
        ci9 ci9 = this.X;
        String str2 = this.Y;
        return "{conversationId='" + str + "', peerId=" + j + ", turnServer=" + ci9 + ", joinLink=" + str2 + "}";
    }
}
