package androidx.work;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public final class OverwritingInputMerger extends jx6 {
    public final zy3 a(ArrayList arrayList) {
        x3a x3a = new x3a(9);
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            hashMap.putAll(Collections.unmodifiableMap(((zy3) it.next()).a));
        }
        x3a.I(hashMap);
        return x3a.k();
    }
}
