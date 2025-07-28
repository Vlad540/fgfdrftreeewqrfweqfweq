package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: myc  reason: default package */
public abstract class myc extends nyc {
    public static int J(dyc dyc) {
        Iterator it = dyc.iterator();
        int i = 0;
        while (it.hasNext()) {
            it.next();
            i++;
            if (i < 0) {
                p23.F();
                throw null;
            }
        }
        return i;
    }

    public static dyc K(dyc dyc, int i) {
        if (i >= 0) {
            return i == 0 ? dyc : dyc instanceof ip4 ? ((ip4) dyc).b(i) : new hp4(dyc, i, 0);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " is less than zero.").toString());
    }

    public static sg5 L(dyc dyc, u16 u16) {
        return new sg5(dyc, true, u16);
    }

    public static sg5 M(dyc dyc, u16 u16) {
        return new sg5(dyc, false, u16);
    }

    public static Object N(vqe vqe) {
        Iterator it = vqe.a.iterator();
        if (it.hasNext()) {
            return vqe.b.invoke(it.next());
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public static Object O(dyc dyc) {
        Iterator it = dyc.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    public static final xi5 P(dyc dyc, u16 u16) {
        if (!(dyc instanceof vqe)) {
            return new xi5(dyc, x51.y0, u16);
        }
        vqe vqe = (vqe) dyc;
        return new xi5(vqe.a, vqe.b, u16);
    }

    public static sg5 Q(dyc dyc, u16 u16) {
        return M(new vqe(dyc, u16), x51.z0);
    }

    public static vqe R(dyc dyc, u16 u16) {
        return new vqe(dyc, new c0(8, u16));
    }

    public static dyc S(dyc dyc, int i) {
        if (i >= 0) {
            return i == 0 ? pw4.a : dyc instanceof ip4 ? ((ip4) dyc).a(i) : new hp4(dyc, i, 1);
        }
        throw new IllegalArgumentException(rf0.f(i, "Requested element count ", " is less than zero.").toString());
    }

    public static void T(dyc dyc, Collection collection) {
        for (Object add : dyc) {
            collection.add(add);
        }
    }

    public static List U(dyc dyc) {
        Iterator it = dyc.iterator();
        if (!it.hasNext()) {
            return hw4.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singletonList(next);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(next);
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }
}
