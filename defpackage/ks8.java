package defpackage;

import java.io.Serializable;

/* renamed from: ks8  reason: default package */
public final class ks8 implements Serializable {
    public final int a;
    public final int b;

    public ks8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static ks8 a(ws8 ws8) {
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        int i = 0;
        int i2 = 0;
        for (int i3 = 0; i3 < K; i3++) {
            String z0 = ws8.z0();
            z0.getClass();
            if (z0.equals("views")) {
                i = ws8.v0();
            } else if (!z0.equals("forwards")) {
                ws8.z();
            } else {
                i2 = ws8.v0();
            }
        }
        return new ks8(i, i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{views=");
        sb.append(this.a);
        sb.append(", forwards=");
        return wn6.j(sb, this.b, "}");
    }
}
