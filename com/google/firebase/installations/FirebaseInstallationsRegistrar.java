package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* access modifiers changed from: private */
    public static mh5 lambda$getComponents$0(f83 f83) {
        return new lh5((ih5) f83.a(ih5.class), f83.c(hf6.class), (ExecutorService) f83.f(new pjb(ld0.class, ExecutorService.class)), new qyc((Executor) f83.f(new pjb(eo0.class, Executor.class))));
    }

    public List<t73> getComponents() {
        g68 g68 = new g68(mh5.class, new Class[0]);
        g68.b = LIBRARY_NAME;
        g68.a(oe4.a(ih5.class));
        g68.a(new oe4(0, 1, hf6.class));
        g68.a(new oe4(new pjb(ld0.class, ExecutorService.class), 1, 0));
        g68.a(new oe4(new pjb(eo0.class, Executor.class), 1, 0));
        g68.f = new yc5(12);
        t73 b = g68.b();
        gf6 gf6 = new gf6(0);
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(pjb.a(gf6.class));
        return Arrays.asList(new t73[]{b, new t73((String) null, new HashSet(hashSet), new HashSet(hashSet2), 0, 1, new zx1(15, (Object) gf6), hashSet3), xy6.m(LIBRARY_NAME, "18.0.0")});
    }
}
