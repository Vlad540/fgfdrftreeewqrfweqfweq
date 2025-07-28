package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: g34  reason: default package */
public abstract class g34 {
    public final LinkedHashSet a = new LinkedHashSet(1);

    public static c34 a(g34 g34, String str, String[] strArr, Set set, int i, int i2) {
        Set set2 = (i2 & 2) != 0 ? null : set;
        if ((i2 & 4) != 0) {
            i = 2;
        }
        int i3 = i;
        boolean z = (i2 & 8) != 0;
        if (h0e.s0(str, ':')) {
            ArrayList arrayList = new ArrayList(strArr.length);
            for (String lowerCase : strArr) {
                arrayList.add(lowerCase.toLowerCase(Locale.ROOT));
            }
            c34 c34 = new c34(am7.d(str.toLowerCase(Locale.ROOT), "max", (String) null), i3, new LinkedHashSet(arrayList), z, set2);
            g34.a.add(c34);
            return c34;
        }
        throw new IllegalStateException("invalid route ".concat(str).toString());
    }
}
