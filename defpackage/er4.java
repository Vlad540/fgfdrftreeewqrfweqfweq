package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* renamed from: er4  reason: default package */
public final class er4 implements dr4 {
    public final DynamicRangeProfiles a;

    public er4(Object obj) {
        this.a = (DynamicRangeProfiles) obj;
    }

    public static Set d(Set set) {
        if (set.isEmpty()) {
            return Collections.emptySet();
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Long l = (Long) it.next();
            long longValue = l.longValue();
            zq4 zq4 = (zq4) ar4.a.get(l);
            e07.o(zq4, "Dynamic range profile cannot be converted to a DynamicRange object: " + longValue);
            hashSet.add(zq4);
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public final Set a() {
        return d(this.a.getSupportedProfiles());
    }

    public final DynamicRangeProfiles b() {
        return this.a;
    }

    public final Set c(zq4 zq4) {
        Long a2 = ar4.a(zq4, this.a);
        boolean z = a2 != null;
        e07.j("DynamicRange is not supported: " + zq4, z);
        return d(this.a.getProfileCaptureRequestConstraints(a2.longValue()));
    }
}
