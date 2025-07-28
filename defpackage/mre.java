package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: mre  reason: default package */
public final class mre {
    public final HashMap a = new HashMap();
    public final View b;
    public final ArrayList c = new ArrayList();

    public mre(View view) {
        this.b = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r3 = (defpackage.mre) r3;
        r0 = r3.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            boolean r0 = r3 instanceof defpackage.mre
            if (r0 == 0) goto L_0x0018
            mre r3 = (defpackage.mre) r3
            android.view.View r0 = r3.b
            android.view.View r1 = r2.b
            if (r1 != r0) goto L_0x0018
            java.util.HashMap r2 = r2.a
            java.util.HashMap r3 = r3.a
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0018
            r2 = 1
            return r2
        L_0x0018:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mre.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder n = me4.n("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        n.append(this.b);
        n.append("\n");
        String g = hr1.g(n.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            g = g + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return g;
    }
}
