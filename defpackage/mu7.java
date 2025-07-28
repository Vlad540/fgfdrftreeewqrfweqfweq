package defpackage;

import androidx.fragment.app.a;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: mu7  reason: default package */
public final class mu7 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public final Object f;

    public mu7(t97 t97, t97 t972, rw6 rw6, t97 t973, long j) {
        this.a = j;
        this.b = mu7.class.getName();
        this.c = t97;
        this.d = t972;
        this.e = rw6;
        this.f = t973;
    }

    public static ViewPager2 a(RecyclerView recyclerView) {
        ViewPager2 parent = recyclerView.getParent();
        if (parent instanceof ViewPager2) {
            return parent;
        }
        throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
    }

    public void b(boolean z) {
        int currentItem;
        a aVar;
        o88 o88 = (o88) this.f;
        if (!o88.X.Q() && ((ViewPager2) this.e).getScrollState() == 0) {
            uq7 uq7 = o88.Y;
            if (uq7.h() != 0) {
                List list = o88.B0;
                if (list.size() != 0 && (currentItem = ((ViewPager2) this.e).getCurrentItem()) < list.size()) {
                    long j = (long) currentItem;
                    if ((j != this.a || z) && (aVar = (a) uq7.c(j)) != null && aVar.p0()) {
                        this.a = j;
                        c cVar = o88.X;
                        cVar.getClass();
                        hd0 hd0 = new hd0(cVar);
                        ArrayList arrayList = new ArrayList();
                        a aVar2 = null;
                        for (int i = 0; i < uq7.h(); i++) {
                            long e2 = uq7.e(i);
                            a aVar3 = (a) uq7.i(i);
                            if (aVar3.p0()) {
                                if (e2 != this.a) {
                                    hd0.i(aVar3, ob7.o);
                                    gvf gvf = o88.y0;
                                    gvf.getClass();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = ((CopyOnWriteArrayList) gvf.b).iterator();
                                    if (!it.hasNext()) {
                                        arrayList.add(arrayList2);
                                    } else {
                                        hr1.r(it.next());
                                        throw null;
                                    }
                                } else {
                                    aVar2 = aVar3;
                                }
                                aVar3.a1(e2 == this.a);
                            }
                        }
                        if (aVar2 != null) {
                            hd0.i(aVar2, ob7.X);
                            gvf gvf2 = o88.y0;
                            gvf2.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            Iterator it2 = ((CopyOnWriteArrayList) gvf2.b).iterator();
                            if (!it2.hasNext()) {
                                arrayList.add(arrayList3);
                            } else {
                                hr1.r(it2.next());
                                throw null;
                            }
                        }
                        if (!hd0.a.isEmpty()) {
                            hd0.e();
                            Collections.reverse(arrayList);
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                o88.y0.getClass();
                                gvf.e((List) it3.next());
                            }
                        }
                    }
                }
            }
        }
    }

    public mu7(o88 o88) {
        this.f = o88;
        this.a = -1;
    }
}
