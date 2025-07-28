package defpackage;

import android.os.Build;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: pzd  reason: default package */
public abstract class pzd {
    public static final z80 a = new z80(Long.TYPE, (Object) null, "camera2.streamSpec.streamUseCase");
    public static final HashMap b;
    public static final HashMap c;

    static {
        HashMap hashMap = new HashMap();
        b = hashMap;
        HashMap hashMap2 = new HashMap();
        c = hashMap2;
        if (Build.VERSION.SDK_INT >= 33) {
            HashSet hashSet = new HashSet();
            rye rye = rye.b;
            hashSet.add(rye);
            rye rye2 = rye.Y;
            hashSet.add(rye2);
            hashMap.put(4L, hashSet);
            HashSet hashSet2 = new HashSet();
            hashSet2.add(rye);
            hashSet2.add(rye2);
            hashSet2.add(rye.c);
            hashMap.put(1L, hashSet2);
            HashSet hashSet3 = new HashSet();
            rye rye3 = rye.a;
            hashSet3.add(rye3);
            hashMap.put(2L, hashSet3);
            HashSet hashSet4 = new HashSet();
            rye rye4 = rye.o;
            hashSet4.add(rye4);
            hashMap.put(3L, hashSet4);
            HashSet hashSet5 = new HashSet();
            hashSet5.add(rye);
            hashSet5.add(rye3);
            hashSet5.add(rye4);
            hashMap2.put(4L, hashSet5);
            HashSet hashSet6 = new HashSet();
            hashSet6.add(rye);
            hashSet6.add(rye4);
            hashMap2.put(3L, hashSet6);
        }
    }

    public static js1 a(ia3 ia3, long j) {
        z80 z80 = a;
        if (ia3.l(z80) && ((Long) ia3.h(z80)).longValue() == j) {
            return null;
        }
        fc9 e = fc9.e(ia3);
        e.j(z80, Long.valueOf(j));
        return new mv4(7, e);
    }

    public static boolean b(rye rye, long j, List list) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (rye == rye.X) {
            HashMap hashMap = c;
            if (!hashMap.containsKey(Long.valueOf(j))) {
                return false;
            }
            Set set = (Set) hashMap.get(Long.valueOf(j));
            if (list.size() != set.size()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!set.contains((rye) it.next())) {
                    return false;
                }
            }
            return true;
        }
        HashMap hashMap2 = b;
        return hashMap2.containsKey(Long.valueOf(j)) && ((Set) hashMap2.get(Long.valueOf(j))).contains(rye);
    }

    public static boolean c(ia3 ia3, rye rye) {
        if (((Boolean) ia3.d(pye.q0, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        z80 z80 = cq6.b;
        if (!ia3.l(z80)) {
            return false;
        }
        return rye.ordinal() == 0 && ((Integer) ia3.h(z80)).intValue() == 2;
    }
}
