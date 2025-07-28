package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: ijd  reason: default package */
public final class ijd {
    public final ArrayList a = new ArrayList();

    public final void a(w67... w67Arr) {
        ArrayList arrayList = new ArrayList();
        for (w67 w67 : w67Arr) {
            String canonicalName = ((vy2) w67).a().getCanonicalName();
            if (canonicalName != null) {
                arrayList.add(canonicalName);
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.a.add(o23.T(cs.g0((String[]) Arrays.copyOf(strArr, strArr.length))));
    }
}
