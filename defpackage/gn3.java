package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* renamed from: gn3  reason: default package */
public final class gn3 implements Serializable {
    public final List X;
    public final int Y;
    public final boolean Z;
    public final uj3 a;
    public final String b;
    public final String c;
    public final m2b o;

    public gn3(uj3 uj3, String str, String str2, m2b m2b, ArrayList arrayList, int i, boolean z) {
        this.a = uj3;
        this.b = str;
        this.c = str2;
        this.o = m2b;
        this.X = arrayList;
        this.Y = i;
        this.Z = z;
    }

    public static gn3 a(ws8 ws8) {
        int K = jjd.K(ws8);
        ArrayList arrayList = null;
        int i = 0;
        boolean z = false;
        uj3 uj3 = null;
        String str = null;
        String str2 = null;
        m2b m2b = null;
        for (int i2 = 0; i2 < K; i2++) {
            String z0 = ws8.z0();
            z0.getClass();
            char c2 = 65535;
            switch (z0.hashCode()) {
                case -1857640538:
                    if (z0.equals("summary")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1297282981:
                    if (z0.equals("restricted")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1276666629:
                    if (z0.equals("presence")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -600094315:
                    if (z0.equals("friends")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case -191501435:
                    if (z0.equals("feedback")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 613469306:
                    if (z0.equals("friendsCount")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 951526432:
                    if (z0.equals("contact")) {
                        c2 = 6;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    str = ws8.z0();
                    break;
                case 1:
                    z = ws8.u0();
                    break;
                case 2:
                    m2b = m2b.a(ws8);
                    break;
                case 3:
                    int D = jjd.D(ws8);
                    ArrayList arrayList2 = new ArrayList();
                    for (int i3 = 0; i3 < D; i3++) {
                        arrayList2.add(Long.valueOf(ws8.w0()));
                    }
                    arrayList = arrayList2;
                    break;
                case 4:
                    str2 = ws8.z0();
                    break;
                case 5:
                    i = ws8.v0();
                    break;
                case 6:
                    uj3 = uj3.e(ws8);
                    break;
                default:
                    ws8.z();
                    break;
            }
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        return new gn3(uj3, str, str2, m2b, arrayList, i, z);
    }

    public final String toString() {
        String v = r1g.v(this.b);
        String v2 = r1g.v(this.c);
        int p = ete.p(this.X);
        return "{contact=" + this.a + ", summary='" + v + "', feedback='" + v2 + "', friends=" + p + ", friendsCount=" + this.Y + ", restricted=" + this.Z + "}";
    }
}
