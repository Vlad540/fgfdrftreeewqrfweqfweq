package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.Set;

/* renamed from: fr4  reason: default package */
public final class fr4 implements dr4 {
    public static final mod a = new mod(14, new Object());
    public static final Set b = Collections.singleton(zq4.d);

    public final Set a() {
        return b;
    }

    public final DynamicRangeProfiles b() {
        return null;
    }

    public final Set c(zq4 zq4) {
        boolean equals = zq4.d.equals(zq4);
        e07.j("DynamicRange is not supported: " + zq4, equals);
        return b;
    }
}
