package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: y1f  reason: default package */
public final class y1f {
    public final /* synthetic */ int a = 0;
    public String b;
    public long c;
    public long d;
    public ci9 e;
    public String f;
    public int g;

    public /* synthetic */ y1f() {
    }

    public static y1f a(ws8 ws8) {
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        y1f y1f = new y1f();
        for (int i = 0; i < K; i++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1676095234:
                    if (z0.equals(ApiProtocol.PARAM_CONVERSATION_ID)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1361631597:
                    if (z0.equals(ApiProtocol.PARAM_CHAT_ID)) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -172115450:
                    if (z0.equals("callerId")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 3575610:
                    if (z0.equals("type")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 86542880:
                    if (z0.equals("turnServer")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 398343517:
                    if (z0.equals("sdpOffer")) {
                        c2 = 5;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    y1f.b = ws8.z0();
                    break;
                case 1:
                    y1f.d = ws8.w0();
                    break;
                case 2:
                    y1f.c = ws8.w0();
                    break;
                case 3:
                    String z02 = ws8.z0();
                    z02.getClass();
                    y1f.g = !z02.equals("AUDIO") ? !z02.equals("VIDEO") ? 1 : 3 : 2;
                    break;
                case 4:
                    y1f.e = ci9.h(ws8);
                    break;
                case 5:
                    y1f.f = jjd.M(ws8);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new y1f(y1f);
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "{conversationId='" + this.b + "', callerId=" + this.c + ", chatId=" + this.d + ", turnServer=" + this.e + ", sdpOffer='" + this.f + "', type=" + rf0.p(this.g) + "}";
            default:
                return super.toString();
        }
    }

    public y1f(y1f y1f) {
        this.b = y1f.b;
        this.c = y1f.c;
        this.d = y1f.d;
        this.e = y1f.e;
        this.f = y1f.f;
        this.g = y1f.g;
    }
}
