package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: ux5  reason: default package */
public final class ux5 implements sx5 {
    public final /* synthetic */ c a;

    public ux5(c cVar) {
        this.a = cVar;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        c cVar = this.a;
        hd0 hd0 = (hd0) rf0.e(cVar.d, 1);
        cVar.h = hd0;
        Iterator it = hd0.a.iterator();
        while (it.hasNext()) {
            a aVar = ((dy5) it.next()).b;
            if (aVar != null) {
                aVar.C0 = true;
            }
        }
        boolean V = cVar.V(arrayList, arrayList2, -1, 0);
        if (!cVar.n.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                linkedHashSet.addAll(c.G((hd0) it2.next()));
            }
            Iterator it3 = cVar.n.iterator();
            while (it3.hasNext()) {
                hr1.r(it3.next());
                Iterator it4 = linkedHashSet.iterator();
                if (it4.hasNext()) {
                    a aVar2 = (a) it4.next();
                    throw null;
                }
            }
        }
        return V;
    }
}
