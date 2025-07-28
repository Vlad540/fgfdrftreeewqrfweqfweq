package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: jl9  reason: default package */
public final class jl9 extends lbe {
    public long X;
    public long Y;
    public ci9 Z;
    public String c;
    public String o;
    public String w0;
    public int x0;

    public jl9(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        int i = 3;
        str.getClass();
        char c2 = 65535;
        switch (str.hashCode()) {
            case -1676095234:
                if (str.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                    c2 = 0;
                    break;
                }
                break;
            case -1361631597:
                if (str.equals(ApiProtocol.PARAM_CHAT_ID)) {
                    c2 = 1;
                    break;
                }
                break;
            case -172115450:
                if (str.equals("callerId")) {
                    c2 = 2;
                    break;
                }
                break;
            case 116579:
                if (str.equals("vcp")) {
                    c2 = 3;
                    break;
                }
                break;
            case 3575610:
                if (str.equals("type")) {
                    c2 = 4;
                    break;
                }
                break;
            case 86542880:
                if (str.equals("turnServer")) {
                    c2 = 5;
                    break;
                }
                break;
            case 398343517:
                if (str.equals("sdpOffer")) {
                    c2 = 6;
                    break;
                }
                break;
        }
        switch (c2) {
            case 0:
                this.c = jjd.M(ws8);
                return;
            case 1:
                this.Y = jjd.J(ws8, 0);
                return;
            case 2:
                this.X = jjd.J(ws8, 0);
                return;
            case 3:
                this.o = jjd.M(ws8);
                return;
            case 4:
                String M = jjd.M(ws8);
                M.getClass();
                if (M.equals("AUDIO")) {
                    i = 2;
                } else if (!M.equals("VIDEO")) {
                    i = 1;
                }
                this.x0 = i;
                return;
            case 5:
                this.Z = ci9.h(ws8);
                return;
            case 6:
                this.w0 = jjd.M(ws8);
                return;
            default:
                ws8.z();
                return;
        }
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.o;
        long j = this.X;
        long j2 = this.Y;
        ci9 ci9 = this.Z;
        String str3 = this.w0;
        int i = this.x0;
        StringBuilder j3 = c3d.j("{conversationId='", str, "'convParams='", str2, "', callerId=");
        j3.append(j);
        hr1.s(j3, ", chatId=", j2, ", turnServer=");
        j3.append(ci9);
        j3.append(", sdpOffer='");
        j3.append(str3);
        j3.append("', callType=");
        j3.append(rf0.p(i));
        j3.append("}");
        return j3.toString();
    }
}
