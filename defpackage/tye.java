package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* renamed from: tye  reason: default package */
public final class tye {
    public static final List d = Arrays.asList(new Integer[]{1, 2, 4, 3, 7});
    public ybf a;
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();

    public final void a(mye mye) {
        this.b.add(mye);
    }

    public final jg8 b() {
        ArrayList arrayList = this.b;
        e07.j("UseCase must not be empty.", !arrayList.isEmpty());
        ArrayList arrayList2 = this.c;
        Iterator it = arrayList2.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = ((k5f) it.next()).a;
            hhd.n(i2, d);
            int i3 = i & i2;
            if (i3 <= 0) {
                i |= i2;
            } else {
                Locale locale = Locale.US;
                throw new IllegalArgumentException(wn6.i("More than one effects has targets ", hhd.A(i3), "."));
            }
        }
        return new jg8(this.a, arrayList, arrayList2, 16);
    }
}
