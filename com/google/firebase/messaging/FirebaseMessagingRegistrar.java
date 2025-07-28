package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;

@Keep
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    @Keep
    public List<t73> getComponents() {
        pjb pjb = new pjb(pre.class, rre.class);
        boolean z = false;
        g68 g68 = new g68(FirebaseMessaging.class, new Class[0]);
        g68.b = LIBRARY_NAME;
        g68.a(oe4.a(ih5.class));
        g68.a(new oe4(0, 0, nh5.class));
        g68.a(new oe4(0, 1, dc4.class));
        g68.a(new oe4(0, 1, if6.class));
        g68.a(oe4.a(mh5.class));
        g68.a(new oe4(pjb, 0, 1));
        g68.a(oe4.a(c1e.class));
        g68.f = new x74(pjb, 1);
        if (g68.d == 0) {
            z = true;
        }
        if (z) {
            g68.d = 1;
            return Arrays.asList(new t73[]{g68.b(), xy6.m(LIBRARY_NAME, "24.0.1")});
        }
        throw new IllegalStateException("Instantiation type has already been set.");
    }
}
