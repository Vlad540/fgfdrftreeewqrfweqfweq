package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: tn2  reason: default package */
public final class tn2 {
    public final List a;
    public final long b;
    public final Long c;

    public tn2(kg5 kg5) {
        this.a = (List) kg5.b;
        this.b = kg5.a;
        this.c = (Long) kg5.c;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [kg5, java.lang.Object] */
    public static tn2 a(ws8 ws8) {
        int K = jjd.K(ws8);
        if (K == 0) {
            return null;
        }
        ? obj = new Object();
        ArrayList arrayList = new ArrayList(mj2.X);
        for (int i = 0; i < K; i++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -246214960:
                    if (z0.equals("dontDisturbUntil")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case 107019:
                    if (z0.equals("led")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 3619395:
                    if (z0.equals("vibr")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109627663:
                    if (z0.equals("sound")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1015572087:
                    if (z0.equals("favIndex")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    obj.a = ws8.w0();
                    break;
                case 1:
                    if (!ws8.u0()) {
                        break;
                    } else {
                        arrayList.add(mj2.LED);
                        break;
                    }
                case 2:
                    if (!ws8.u0()) {
                        break;
                    } else {
                        arrayList.add(mj2.VIBRATION);
                        break;
                    }
                case 3:
                    if (!ws8.u0()) {
                        break;
                    } else {
                        arrayList.add(mj2.SOUND);
                        break;
                    }
                case 4:
                    obj.c = Long.valueOf(jjd.J(ws8, 0));
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        obj.b = arrayList;
        return new tn2(obj);
    }

    public final String toString() {
        Long l = this.c;
        String l2 = l != null ? l.toString() : "null";
        return "ChatSettings{options=" + this.a + ", dontDisturbUntil=" + this.b + ", favoriteIndex = " + l2 + "}";
    }
}
