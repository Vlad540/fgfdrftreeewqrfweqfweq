package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public final List getComponents() {
        String str;
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<dc4> cls = dc4.class;
        hashSet.add(pjb.a(cls));
        for (Class cls2 : new Class[0]) {
            n06.j(cls2, "Null interface");
            hashSet.add(pjb.a(cls2));
        }
        oe4 oe4 = new oe4(2, 0, u90.class);
        if (!hashSet.contains(oe4.a)) {
            hashSet2.add(oe4);
            arrayList.add(new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new i74(5), hashSet3));
            pjb pjb = new pjb(ld0.class, Executor.class);
            g68 g68 = new g68(z74.class, new Class[]{hf6.class, if6.class});
            g68.a(oe4.a(Context.class));
            g68.a(oe4.a(ih5.class));
            g68.a(new oe4(2, 0, gf6.class));
            g68.a(new oe4(1, 1, (Class) cls));
            g68.a(new oe4(pjb, 1, 0));
            g68.f = new x74(pjb, 0);
            arrayList.add(g68.b());
            arrayList.add(xy6.m("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
            arrayList.add(xy6.m("fire-core", "21.0.0"));
            arrayList.add(xy6.m("device-name", a(Build.PRODUCT)));
            arrayList.add(xy6.m("device-model", a(Build.DEVICE)));
            arrayList.add(xy6.m("device-brand", a(Build.BRAND)));
            arrayList.add(xy6.o("android-target-sdk", new yc5(8)));
            arrayList.add(xy6.o("android-min-sdk", new yc5(9)));
            arrayList.add(xy6.o("android-platform", new yc5(10)));
            arrayList.add(xy6.o("android-installer", new yc5(11)));
            try {
                w87.b.getClass();
                str = "2.0.20";
            } catch (NoClassDefFoundError unused) {
                str = null;
            }
            if (str != null) {
                arrayList.add(xy6.m("kotlin", str));
            }
            return arrayList;
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
