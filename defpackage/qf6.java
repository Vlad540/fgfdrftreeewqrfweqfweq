package defpackage;

import java.util.ArrayList;

/* renamed from: qf6  reason: default package */
public abstract class qf6 extends ff3 {
    public ff3[] q0 = new ff3[4];
    public int r0 = 0;

    public final void R(int i, krf krf, ArrayList arrayList) {
        for (int i2 = 0; i2 < this.r0; i2++) {
            ff3 ff3 = this.q0[i2];
            ArrayList arrayList2 = krf.a;
            if (!arrayList2.contains(ff3)) {
                arrayList2.add(ff3);
            }
        }
        for (int i3 = 0; i3 < this.r0; i3++) {
            r1g.i(this.q0[i3], i, arrayList, krf);
        }
    }

    public void S() {
    }
}
