package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* renamed from: g2c  reason: default package */
public final class g2c {
    public final int a;
    public final long b;
    public final long c;
    public final fpa d;

    public g2c(w52 w52) {
        this.a = w52.a;
        this.b = w52.b;
        this.c = w52.c;
        this.d = (fpa) w52.d;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [w52, java.lang.Object] */
    public static g2c a(ws8 ws8) {
        int i;
        String str;
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        ? obj = new Object();
        for (int i2 = 0; i2 < K; i2++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case 3355:
                    if (z0.equals(ApiProtocol.KEY_ID)) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 102340:
                    if (z0.equals("gif")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3575610:
                    if (z0.equals("type")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 238532408:
                    if (z0.equals("stickerId")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.b = ws8.w0();
                    break;
                case 1:
                    obj.d = (fpa) fy.b(ws8);
                    break;
                case 2:
                    String M = jjd.M(ws8);
                    int[] w = hr1.w(3);
                    int length = w.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            i = 1;
                        } else {
                            i = w[i3];
                            if (i == 1) {
                                str = "UNKNOWN";
                            } else if (i == 2) {
                                str = "STICKER";
                            } else if (i == 3) {
                                str = "GIF";
                            } else {
                                throw null;
                            }
                            if (!str.equals(M)) {
                                i3++;
                            }
                        }
                    }
                    obj.a = i;
                    break;
                case 3:
                    obj.c = jjd.J(ws8, 0);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new g2c(obj);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecentItem{type=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "GIF" : "STICKER" : "UNKNOWN");
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", stickerId=");
        sb.append(this.c);
        sb.append(", gif=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
