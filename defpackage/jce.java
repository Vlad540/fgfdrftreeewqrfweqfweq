package defpackage;

import java.util.Comparator;

/* renamed from: jce  reason: default package */
public final /* synthetic */ class jce implements Comparator {
    public final /* synthetic */ Iterable a;
    public final /* synthetic */ j26 b;

    public /* synthetic */ jce(Iterable iterable, j26 j26) {
        this.a = iterable;
        this.b = j26;
    }

    public final int compare(Object obj, Object obj2) {
        j26 j26 = this.b;
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        for (Long l : this.a) {
            try {
                if (l.equals(j26.apply(obj))) {
                    i2 = i;
                } else if (l.equals(j26.apply(obj2))) {
                    i3 = i;
                }
                if (i2 != -1 && i3 != -1) {
                    break;
                }
                i++;
            } catch (Throwable th) {
                throw new RuntimeException(th);
            }
        }
        if (i2 < i3) {
            return -1;
        }
        return i2 == i3 ? 0 : 1;
    }
}
