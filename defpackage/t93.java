package defpackage;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: t93  reason: default package */
public final class t93 extends f6c {
    public final u93 o;

    public t93(f6c... f6cArr) {
        this(s93.c, f6cArr);
    }

    public final void C(f6c f6c) {
        this.o.a(0, f6c);
    }

    public final List D() {
        List list;
        ArrayList arrayList = this.o.d;
        if (arrayList.isEmpty()) {
            list = Collections.emptyList();
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((zg9) it.next()).c);
            }
            list = arrayList2;
        }
        return Collections.unmodifiableList(list);
    }

    public final Pair E(int i) {
        u93 u93 = this.o;
        w f = u93.f(i);
        Pair pair = new Pair(((zg9) f.c).c, Integer.valueOf(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        u93.h = f;
        return pair;
    }

    public final void F(f6c f6c) {
        u93 u93 = this.o;
        int i = u93.i(f6c);
        if (i != -1) {
            ArrayList arrayList = u93.d;
            zg9 zg9 = (zg9) arrayList.get(i);
            int d = u93.d(zg9);
            arrayList.remove(i);
            ((t93) u93.e).a.f(d, zg9.e);
            Iterator it = u93.c.iterator();
            while (it.hasNext()) {
                RecyclerView recyclerView = (RecyclerView) ((WeakReference) it.next()).get();
                if (recyclerView != null) {
                    f6c.u(recyclerView);
                }
            }
            zg9.c.B(zg9.f);
            zg9.a.dispose();
            u93.c();
        }
    }

    public final int i(f6c f6c, b7c b7c, int i) {
        u93 u93 = this.o;
        zg9 zg9 = (zg9) ((IdentityHashMap) u93.g).get(b7c);
        if (zg9 == null) {
            return -1;
        }
        int d = i - u93.d(zg9);
        f6c f6c2 = zg9.c;
        int j = f6c2.j();
        if (d >= 0 && d < j) {
            return f6c2.i(f6c, b7c, d);
        }
        StringBuilder i2 = rf0.i("Detected inconsistent adapter updates. The local position of the view holder maps to ", d, " which is out of bounds for the adapter with size ", j, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        i2.append(b7c);
        i2.append("adapter:");
        i2.append(f6c);
        throw new IllegalStateException(i2.toString());
    }

    public final int j() {
        Iterator it = this.o.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((zg9) it.next()).e;
        }
        return i;
    }

    public final long k(int i) {
        u93 u93 = this.o;
        w f = u93.f(i);
        zg9 zg9 = (zg9) f.c;
        long b = zg9.b.b(zg9.c.k(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        u93.h = f;
        return b;
    }

    public final int l(int i) {
        u93 u93 = this.o;
        w f = u93.f(i);
        zg9 zg9 = (zg9) f.c;
        int f2 = zg9.a.f(zg9.c.l(f.a));
        f.b = false;
        f.c = null;
        f.a = -1;
        u93.h = f;
        return f2;
    }

    public final void q(RecyclerView recyclerView) {
        u93 u93 = this.o;
        ArrayList arrayList = u93.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = u93.d.iterator();
        while (it2.hasNext()) {
            ((zg9) it2.next()).c.q(recyclerView);
        }
    }

    public final void r(b7c b7c, int i) {
        u93 u93 = this.o;
        w f = u93.f(i);
        ((IdentityHashMap) u93.g).put(b7c, (zg9) f.c);
        ((zg9) f.c).c.h(b7c, f.a);
        f.b = false;
        f.c = null;
        f.a = -1;
        u93.h = f;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        zg9 a = ((icf) this.o.f).a(i);
        return a.c.t(viewGroup, a.a.c(i));
    }

    public final void u(RecyclerView recyclerView) {
        u93 u93 = this.o;
        ArrayList arrayList = u93.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = u93.d.iterator();
        while (it.hasNext()) {
            ((zg9) it.next()).c.u(recyclerView);
        }
    }

    public final boolean v(b7c b7c) {
        u93 u93 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) u93.g;
        zg9 zg9 = (zg9) identityHashMap.get(b7c);
        if (zg9 != null) {
            boolean v = zg9.c.v(b7c);
            identityHashMap.remove(b7c);
            return v;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b7c + ", seems like it is not bound by this adapter: " + u93);
    }

    public final void w(b7c b7c) {
        this.o.g(b7c).c.w(b7c);
    }

    public final void x(b7c b7c) {
        this.o.g(b7c).c.x(b7c);
    }

    public final void y(b7c b7c) {
        u93 u93 = this.o;
        IdentityHashMap identityHashMap = (IdentityHashMap) u93.g;
        zg9 zg9 = (zg9) identityHashMap.get(b7c);
        if (zg9 != null) {
            zg9.c.y(b7c);
            identityHashMap.remove(b7c);
            return;
        }
        throw new IllegalStateException("Cannot find wrapper for " + b7c + ", seems like it is not bound by this adapter: " + u93);
    }

    public t93(s93 s93, f6c... f6cArr) {
        List<f6c> asList = Arrays.asList(f6cArr);
        this.o = new u93(this, s93);
        for (f6c a : asList) {
            u93 u93 = this.o;
            u93.a(u93.d.size(), a);
        }
        A(this.o.b == 1 ? false : true);
    }
}
