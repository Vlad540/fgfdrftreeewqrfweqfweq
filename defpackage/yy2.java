package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: yy2  reason: default package */
public final class yy2 {
    public final HashMap a = new HashMap();
    public final Map b;

    public yy2(HashMap hashMap) {
        this.b = hashMap;
        for (Map.Entry entry : hashMap.entrySet()) {
            nb7 nb7 = (nb7) entry.getValue();
            List list = (List) this.a.get(nb7);
            if (list == null) {
                list = new ArrayList();
                this.a.put(nb7, list);
            }
            list.add((zy2) entry.getKey());
        }
    }

    public static void a(List list, nc7 nc7, nb7 nb7, Object obj) {
        if (list != null) {
            int size = list.size() - 1;
            while (size >= 0) {
                zy2 zy2 = (zy2) list.get(size);
                zy2.getClass();
                try {
                    int i = zy2.a;
                    Method method = zy2.b;
                    if (i == 0) {
                        method.invoke(obj, (Object[]) null);
                    } else if (i == 1) {
                        method.invoke(obj, new Object[]{nc7});
                    } else if (i == 2) {
                        method.invoke(obj, new Object[]{nc7, nb7});
                    }
                    size--;
                } catch (InvocationTargetException e) {
                    throw new RuntimeException("Failed to call observer method", e.getCause());
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
    }
}
