package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: krf  reason: default package */
public final class krf {
    public static int f;
    public ArrayList a;
    public int b;
    public int c;
    public ArrayList d;
    public int e;

    public final void a(ArrayList arrayList) {
        int size = this.a.size();
        if (this.e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                krf krf = (krf) arrayList.get(i);
                if (this.e == krf.b) {
                    c(this.c, krf);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(id7 id7, int i) {
        int n;
        int n2;
        ArrayList arrayList = this.a;
        if (arrayList.size() == 0) {
            return 0;
        }
        gf3 gf3 = (gf3) ((ff3) arrayList.get(0)).T;
        id7.t();
        gf3.b(id7, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ff3) arrayList.get(i2)).b(id7, false);
        }
        if (i == 0 && gf3.z0 > 0) {
            xy6.b(gf3, id7, arrayList, 0);
        }
        if (i == 1 && gf3.A0 > 0) {
            xy6.b(gf3, id7, arrayList, 1);
        }
        try {
            id7.p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ff3 ff3 = (ff3) arrayList.get(i3);
            Object obj = new Object();
            new WeakReference(ff3);
            id7.n(ff3.I);
            id7.n(ff3.J);
            id7.n(ff3.K);
            id7.n(ff3.L);
            id7.n(ff3.M);
            this.d.add(obj);
        }
        if (i == 0) {
            n = id7.n(gf3.I);
            n2 = id7.n(gf3.K);
            id7.t();
        } else {
            n = id7.n(gf3.J);
            n2 = id7.n(gf3.L);
            id7.t();
        }
        return n2 - n;
    }

    public final void c(int i, krf krf) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ff3 ff3 = (ff3) it.next();
            ArrayList arrayList = krf.a;
            if (!arrayList.contains(ff3)) {
                arrayList.add(ff3);
            }
            int i2 = krf.b;
            if (i == 0) {
                ff3.n0 = i2;
            } else {
                ff3.o0 = i2;
            }
        }
        this.e = krf.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        String j = wn6.j(sb, this.b, "] <");
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            StringBuilder n = me4.n(j, " ");
            n.append(((ff3) it.next()).h0);
            j = n.toString();
        }
        return hr1.g(j, " >");
    }
}
