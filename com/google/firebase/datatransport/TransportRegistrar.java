package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    public List<t73> getComponents() {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        Class<rre> cls = rre.class;
        hashSet.add(pjb.a(cls));
        for (Class cls2 : new Class[0]) {
            n06.j(cls2, "Null interface");
            hashSet.add(pjb.a(cls2));
        }
        Class<Context> cls3 = Context.class;
        oe4 a = oe4.a(cls3);
        if (!hashSet.contains(a.a)) {
            hashSet2.add(a);
            t73 t73 = new t73(LIBRARY_NAME, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new are(2), hashSet3);
            g68 a2 = t73.a(new pjb(ya7.class, cls));
            a2.a(oe4.a(cls3));
            a2.f = new are(3);
            t73 b = a2.b();
            g68 a3 = t73.a(new pjb(pre.class, cls));
            a3.a(oe4.a(cls3));
            a3.f = new are(4);
            return Arrays.asList(new t73[]{t73, b, a3.b(), xy6.m(LIBRARY_NAME, "18.2.0")});
        }
        throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
    }
}
