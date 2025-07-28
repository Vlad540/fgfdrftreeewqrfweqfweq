package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* renamed from: xx9  reason: default package */
public abstract class xx9 {
    public static final ArrayList a = new ArrayList();

    static {
        Class<yx9> cls = yx9.class;
        Iterator<S> it = ServiceLoader.load(cls, cls.getClassLoader()).iterator();
        while (it.hasNext()) {
            ArrayList arrayList = a;
            hr1.r(it.next());
            arrayList.add((Object) null);
        }
    }
}
