package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: db7  reason: default package */
public final class db7 implements zt1 {
    public final int b;

    public db7(int i) {
        this.b = i;
    }

    public final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            fu1 fu1 = (fu1) it.next();
            e07.j("The camera info doesn't contain internal implementation.", fu1 instanceof fu1);
            if (fu1.g() == this.b) {
                arrayList.add(fu1);
            }
        }
        return arrayList;
    }
}
