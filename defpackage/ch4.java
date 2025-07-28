package defpackage;

import java.util.Iterator;

/* renamed from: ch4  reason: default package */
public class ch4 extends se4 {
    public int m;

    public ch4(lrf lrf) {
        super(lrf);
        if (lrf instanceof ak6) {
            this.e = 2;
        } else {
            this.e = 3;
        }
    }

    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            Iterator it = this.k.iterator();
            while (it.hasNext()) {
                pe4 pe4 = (pe4) it.next();
                pe4.a(pe4);
            }
        }
    }
}
