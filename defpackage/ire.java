package defpackage;

import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: ire  reason: default package */
public abstract class ire {
    public static final i80 a = new i80();
    public static final ThreadLocal b = new ThreadLocal();
    public static final ArrayList c = new ArrayList();

    /* JADX WARNING: type inference failed for: r0v7, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object, hre, android.view.View$OnAttachStateChangeListener] */
    public static void a(ViewGroup viewGroup, cre cre) {
        ArrayList arrayList = c;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (cre == null) {
                cre = a;
            }
            cre l = cre.clone();
            ArrayList arrayList2 = (ArrayList) c().get(viewGroup);
            if (arrayList2 != null && arrayList2.size() > 0) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((cre) it.next()).C(viewGroup);
                }
            }
            if (l != null) {
                l.j(viewGroup, true);
            }
            hr1.r(viewGroup.getTag(job.transition_current_scene));
            viewGroup.setTag(job.transition_current_scene, (Object) null);
            ? obj = new Object();
            obj.a = l;
            obj.b = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void b(ViewGroup viewGroup) {
        c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) c().get(viewGroup);
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                ((cre) arrayList2.get(size)).r(viewGroup);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kgd, yr, java.lang.Object] */
    public static yr c() {
        yr yrVar;
        ThreadLocal threadLocal = b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (yrVar = (yr) weakReference.get()) != null) {
            return yrVar;
        }
        ? kgd = new kgd();
        threadLocal.set(new WeakReference(kgd));
        return kgd;
    }
}
