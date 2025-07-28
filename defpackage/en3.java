package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: en3  reason: default package */
public final class en3 extends lbe {
    public List c;
    public int o;

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("result")) {
            int i = zy.a;
            int D = jjd.D(ws8);
            ArrayList arrayList = new ArrayList(D);
            for (int i2 = 0; i2 < D; i2++) {
                arrayList.add(gn3.a(ws8));
            }
            this.c = arrayList;
        } else if (!str.equals("total")) {
            ws8.z();
        } else {
            this.o = ws8.v0();
        }
    }

    public final String toString() {
        return rf0.g("{contacts=", ete.p(this.c), ", total=", this.o, "}");
    }
}
