package defpackage;

/* renamed from: em7  reason: default package */
public final class em7 {
    public final dm7 a;
    public final long b;

    public em7(dm7 dm7, long j) {
        this.a = dm7;
        this.b = j;
    }

    public static em7 a(ws8 ws8) {
        ws8 ws82 = ws8;
        int K = jjd.K(ws8);
        Double valueOf = Double.valueOf(1.401298464324817E-45d);
        Float valueOf2 = Float.valueOf(0.0f);
        double d = 1.401298464324817E-45d;
        double d2 = 1.401298464324817E-45d;
        long j = 0;
        double d3 = 0.0d;
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i < K; i++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c = 65535;
            switch (z0.hashCode()) {
                case 96681:
                    if (z0.equals("alt")) {
                        c = 0;
                        break;
                    }
                    break;
                case 100650:
                    if (z0.equals("epu")) {
                        c = 1;
                        break;
                    }
                    break;
                case 103154:
                    if (z0.equals("hdn")) {
                        c = 2;
                        break;
                    }
                    break;
                case 106911:
                    if (z0.equals("lat")) {
                        c = 3;
                        break;
                    }
                    break;
                case 107301:
                    if (z0.equals("lng")) {
                        c = 4;
                        break;
                    }
                    break;
                case 114087:
                    if (z0.equals("spd")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3560141:
                    if (z0.equals("time")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    d3 = jjd.G(ws82, Double.valueOf(0.0d)).doubleValue();
                    break;
                case 1:
                    f = jjd.H(ws82, valueOf2).floatValue();
                    break;
                case 2:
                    f2 = jjd.H(ws82, valueOf2).floatValue();
                    break;
                case 3:
                    d = jjd.G(ws82, valueOf).doubleValue();
                    break;
                case 4:
                    d2 = jjd.G(ws82, valueOf).doubleValue();
                    break;
                case 5:
                    f3 = jjd.H(ws82, valueOf2).floatValue();
                    break;
                case 6:
                    j = jjd.J(ws82, 0);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        return new em7(new dm7(d, d2, d3, f, f2, f3), j);
    }

    public final String toString() {
        return "LocationInfo{location=" + this.a + ", time=" + this.b + "}";
    }
}
