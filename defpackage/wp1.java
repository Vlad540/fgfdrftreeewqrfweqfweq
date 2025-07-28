package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: wp1  reason: default package */
public abstract class wp1 {
    public static final t97 a = ez3.O(3, new di1(23));

    public static final boolean a(sgc sgc) {
        String str;
        Object obj;
        Object obj2;
        t97 t97 = a;
        Iterator it = ((List) t97.getValue()).iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (sgc.g((String) obj) != null) {
                break;
            }
        }
        String str2 = (String) obj;
        if (str2 == null) {
            Iterator it2 = sgc.e().iterator();
            loop1:
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                vgc vgc = (vgc) obj2;
                List<String> list = (List) t97.getValue();
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (String str3 : list) {
                        String str4 = vgc.b;
                        if (str4 != null && h0e.R(str4, str3, false)) {
                            break loop1;
                        }
                    }
                    continue;
                }
            }
            vgc vgc2 = (vgc) obj2;
            if (vgc2 != null) {
                str = vgc2.b;
            }
            str2 = str;
        }
        if (str2 != null) {
            sgc.D(str2);
        }
        return str2 != null;
    }
}
