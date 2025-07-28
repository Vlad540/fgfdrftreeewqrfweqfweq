package defpackage;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: eu1  reason: default package */
public final /* synthetic */ class eu1 implements zt1 {
    public final /* synthetic */ fu1 b;

    public /* synthetic */ eu1(fu1 fu1) {
        this.b = fu1;
    }

    public final List a(List list) {
        String d = this.b.d();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fu1 fu1 = (fu1) it.next();
            e07.k(fu1 instanceof fu1);
            if (fu1.d().equals(d)) {
                return Collections.singletonList(fu1);
            }
        }
        throw new IllegalStateException(wn6.i("Unable to find camera with id ", d, " from list of available cameras."));
    }
}
