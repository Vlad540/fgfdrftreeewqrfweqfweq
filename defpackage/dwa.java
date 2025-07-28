package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: dwa  reason: default package */
public final class dwa {
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();

    public final void a(ViewGroup viewGroup, cwa cwa) {
        LinkedHashMap linkedHashMap = this.b;
        Object obj = linkedHashMap.get(cwa);
        if (obj == null) {
            obj = new ArrayList();
            linkedHashMap.put(cwa, obj);
        }
        List list = (List) obj;
        if (!list.contains(viewGroup)) {
            list.add(viewGroup);
            if (viewGroup.getMeasuredWidth() != 0 && viewGroup.getMeasuredHeight() != 0) {
                c();
            }
        }
    }

    public final List b(cwa cwa) {
        ArrayList arrayList;
        List list = (List) this.b.get(cwa);
        if (list != null) {
            arrayList = new ArrayList();
            for (Object next : list) {
                View view = (View) next;
                if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        return arrayList == null ? hw4.a : arrayList;
    }

    public final void c() {
        int i = 0;
        int i2 = 0;
        for (View height : b(cwa.a)) {
            i2 += height.getHeight();
        }
        for (View height2 : b(cwa.b)) {
            i += height2.getHeight();
        }
        ewa ewa = new ewa(i2, i);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((ik1) ((bwa) it.next())).F(ewa);
        }
    }
}
