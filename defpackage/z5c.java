package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: z5c  reason: default package */
public final class z5c implements a2f {
    public final wjb b;
    public final HashMap c = new HashMap();
    public final HashMap d = new HashMap();

    /* JADX WARNING: type inference failed for: r6v1, types: [it4, java.lang.Object] */
    public z5c(int i, fu1 fu1) {
        duf duf;
        boolean z = i == 0 || i == 1;
        e07.j("Not a supported video capabilities source: " + i, z);
        yx4 o = fu1.o();
        xe6 xe6 = xf4.a;
        f2b f2b = new f2b(fu1, o, xe6);
        if (i == 1) {
            ma0 ma0 = ma0.d;
            f2b = new h2d(f2b, new ArrayList(ma0.l), Collections.singleton(zq4.d), fu1.q(34));
        }
        ? obj = new Object();
        obj.c = new HashMap();
        obj.a = f2b;
        obj.b = xe6;
        Iterator it = fu1.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                duf = obj;
                break;
            }
            zq4 zq4 = (zq4) it.next();
            if (Integer.valueOf(zq4.a).equals(3) && zq4.b == 10) {
                duf = new duf((it4) obj);
                break;
            }
        }
        this.b = new wjb(fu1, duf, xe6);
        for (zq4 zq42 : fu1.a()) {
            lw1 lw1 = new lw1(new w4g((yx4) this.b, zq42));
            if (!new ArrayList(lw1.a.keySet()).isEmpty()) {
                this.c.put(zq42, lw1);
            }
        }
        fu1.c();
    }

    public final nb0 a(Size size, zq4 zq4) {
        lw1 d2 = d(zq4);
        if (d2 == null) {
            return null;
        }
        return d2.a(size);
    }

    public final nb0 b(ma0 ma0, zq4 zq4) {
        lw1 d2 = d(zq4);
        if (d2 == null) {
            return null;
        }
        return d2.b(ma0);
    }

    public final ArrayList c(zq4 zq4) {
        lw1 d2 = d(zq4);
        return d2 == null ? new ArrayList() : new ArrayList(d2.a.keySet());
    }

    public final lw1 d(zq4 zq4) {
        boolean z;
        Object obj;
        boolean b2 = zq4.b();
        HashMap hashMap = this.c;
        if (b2) {
            return (lw1) hashMap.get(zq4);
        }
        HashMap hashMap2 = this.d;
        if (hashMap2.containsKey(zq4)) {
            return (lw1) hashMap2.get(zq4);
        }
        Set keySet = hashMap.keySet();
        lw1 lw1 = null;
        if (zq4.b()) {
            z = keySet.contains(zq4);
        } else {
            Iterator it = keySet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                zq4 zq42 = (zq4) obj;
                e07.p("Fully specified range is not actually fully specified.", zq42.b());
                int i = zq4.b;
                if (i == 0 || i == zq42.b) {
                    e07.p("Fully specified range is not actually fully specified.", zq42.b());
                    int i2 = zq4.a;
                    if (i2 != 0) {
                        int i3 = zq42.a;
                        if ((i2 == 2 && i3 != 1) || i2 == i3) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = obj != null;
        }
        if (z) {
            lw1 = new lw1(new w4g((yx4) this.b, zq4));
        }
        hashMap2.put(zq4, lw1);
        return lw1;
    }
}
