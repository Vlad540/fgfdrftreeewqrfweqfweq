package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;

/* renamed from: m2b  reason: default package */
public final class m2b implements Serializable {
    public static final m2b c = new m2b(5, 0);
    public final int a;
    public final int b;

    public m2b(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static m2b a(ws8 ws8) {
        int i = 1;
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < K; i4++) {
            String z0 = ws8.z0();
            z0.getClass();
            if (z0.equals("on")) {
                String z02 = ws8.z0();
                z02.getClass();
                char c2 = 65535;
                switch (z02.hashCode()) {
                    case 2527:
                        if (z02.equals("ON")) {
                            c2 = 0;
                            break;
                        }
                        break;
                    case 76512:
                        if (z02.equals("MOB")) {
                            c2 = 1;
                            break;
                        }
                        break;
                    case 76641:
                        if (z02.equals("MSG")) {
                            c2 = 2;
                            break;
                        }
                        break;
                    case 85812:
                        if (z02.equals("WEB")) {
                            c2 = 3;
                            break;
                        }
                        break;
                    case 433141802:
                        if (z02.equals("UNKNOWN")) {
                            c2 = 4;
                            break;
                        }
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = 5;
                        continue;
                    case 1:
                        i2 = 3;
                        continue;
                    case 2:
                        i2 = 4;
                        continue;
                    case 3:
                        i2 = 2;
                        continue;
                    case 4:
                        udd.R("PresenceType", (IOException) null, "unknown! %s", Arrays.copyOf(new Object[]{z02}, 1));
                        break;
                    default:
                        udd.R("PresenceType", (IOException) null, "not contains enum value %s", Arrays.copyOf(new Object[]{z02}, 1));
                        break;
                }
                i2 = 1;
            } else if (!z0.equals("seen")) {
                ws8.z();
            } else {
                i3 = ws8.v0();
            }
        }
        if (i2 != 0) {
            i = i2;
        }
        return new m2b(i, i3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{on=");
        int i = this.a;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "ON" : "MSG" : "MOB" : "WEB" : "UNKNOWN");
        sb.append(", seen=");
        return wn6.j(sb, this.b, "}");
    }
}
