package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: s77  reason: default package */
public final class s77 implements Serializable {
    public final Object a;

    public s77(String str) {
        this.a = str;
    }

    public void a(Object obj, Object obj2) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.a;
        List list = (List) linkedHashMap.get(obj);
        if (list == null) {
            list = new ArrayList();
            linkedHashMap.put(obj, list);
        }
        list.add(obj2);
    }

    public int b() {
        int i = 0;
        for (List size : ((LinkedHashMap) this.a).values()) {
            i += size.size();
        }
        return i;
    }

    public s77(f71 f71) {
        this.a = f71.a;
    }

    public s77() {
        this.a = new LinkedHashMap();
    }
}
