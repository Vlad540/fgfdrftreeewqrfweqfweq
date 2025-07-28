package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

/* renamed from: esc  reason: default package */
public final /* synthetic */ class esc implements Predicate {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Collection c;
    public final /* synthetic */ Collection d;

    public /* synthetic */ esc(List list, Collection collection, Collection collection2, int i) {
        this.a = i;
        this.b = list;
        this.c = collection;
        this.d = collection2;
    }

    public final boolean test(Object obj) {
        boolean contains;
        switch (this.a) {
            case 0:
                prc prc = (prc) obj;
                i22 i22 = prc.o;
                if (i22 != null) {
                    contains = ((Set) this.c).contains(Long.valueOf(i22.a));
                } else {
                    tf3 tf3 = prc.X;
                    if (tf3 == null) {
                        return true;
                    }
                    if (ek8.f(this.b, new f00(tf3.n(), 27))) {
                        return false;
                    }
                    contains = ((Set) this.d).contains(Long.valueOf(tf3.n()));
                }
                return true ^ contains;
            default:
                yib yib = (yib) obj;
                j22 j22 = yib.a;
                if (j22 != null) {
                    return ((List) this.c).contains(Long.valueOf(j22.a));
                }
                gn3 gn3 = yib.c;
                if (gn3 == null) {
                    return false;
                }
                uj3 uj3 = gn3.a;
                if (ek8.f(this.b, new f00(uj3.a, 27))) {
                    return true;
                }
                return ((List) this.d).contains(Long.valueOf(uj3.a));
        }
    }
}
