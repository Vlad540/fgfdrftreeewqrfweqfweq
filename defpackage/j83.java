package defpackage;

import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Collections;
import java.util.concurrent.Executors;

/* renamed from: j83  reason: default package */
public final /* synthetic */ class j83 implements jib {
    public final /* synthetic */ int a;

    public /* synthetic */ j83(int i) {
        this.a = i;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return Collections.emptySet();
            case 1:
                return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(4, ExecutorsRegistrar.factory("Firebase Background", 10, ExecutorsRegistrar.bgPolicy())));
            case 2:
                return ExecutorsRegistrar.scheduled(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), ExecutorsRegistrar.factory("Firebase Lite", 0, ExecutorsRegistrar.litePolicy())));
            case 3:
                return ExecutorsRegistrar.scheduled(Executors.newCachedThreadPool(ExecutorsRegistrar.factory("Firebase Blocking", 11)));
            case 4:
                return Executors.newSingleThreadScheduledExecutor(ExecutorsRegistrar.factory("Firebase Scheduler", 0));
            case 5:
                ea6 ea6 = FirebaseMessaging.k;
                return null;
            default:
                return null;
        }
    }
}
