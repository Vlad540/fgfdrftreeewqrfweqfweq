package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: ju7  reason: default package */
public abstract class ju7 extends gt0 {
    public static Object Q(Map map, Object obj) {
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static HashMap R(wia... wiaArr) {
        HashMap hashMap = new HashMap(S(wiaArr.length));
        for (wia wia : wiaArr) {
            hashMap.put(wia.a, wia.b);
        }
        return hashMap;
    }

    public static int S(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((((float) i) / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map T(wia... wiaArr) {
        if (wiaArr.length <= 0) {
            return iw4.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(S(wiaArr.length));
        for (wia wia : wiaArr) {
            linkedHashMap.put(wia.a, wia.b);
        }
        return linkedHashMap;
    }

    public static void U(List list, Map map) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            wia wia = (wia) it.next();
            map.put(wia.a, wia.b);
        }
    }

    public static Map V(ArrayList arrayList) {
        iw4 iw4 = iw4.a;
        int size = arrayList.size();
        if (size == 0) {
            return iw4;
        }
        if (size != 1) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(S(arrayList.size()));
            U(arrayList, linkedHashMap);
            return linkedHashMap;
        }
        wia wia = (wia) arrayList.get(0);
        return Collections.singletonMap(wia.a, wia.b);
    }

    public static Map W(Map map) {
        int size = map.size();
        if (size == 0) {
            return iw4.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }
}
