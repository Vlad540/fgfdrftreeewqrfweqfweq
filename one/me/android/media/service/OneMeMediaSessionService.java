package one.me.android.media.service;

import android.content.Intent;
import android.os.Bundle;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.internal.ContextScope;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/android/media/service/OneMeMediaSessionService;", "Lvd8;", "<init>", "()V", "media_release"}, k = 1, mv = {2, 0, 0})
public final class OneMeMediaSessionService extends vd8 {
    public kc8 w0;
    public ContextScope x0;

    /* JADX WARNING: type inference failed for: r2v2, types: [i26, l5e] */
    public final void onCreate() {
        kc8 kc8;
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "OneMeMediaSessionService", "onCreate", (Throwable) null);
        }
        super.onCreate();
        fn6 fn62 = udd.e;
        if (fn62 != null && fn62.c()) {
            fn62.d(tn7.X, "OneMeMediaSessionService", "createMediaSession", (Throwable) null);
        }
        q35 q35 = new q35(this);
        qe8 qe8 = (qe8) l38.a.getAccessor().c(qe8.class);
        oyb.k(!q35.v);
        qe8.getClass();
        q35.d = new k94(2, qe8);
        n45 a = q35.a();
        n05 n05 = new n05();
        g44 g44 = a.H0;
        g44.getClass();
        g44.Y.a(n05);
        try {
            Bundle bundle = Bundle.EMPTY;
            po5 po5 = ws6.b;
            kc8 = new kc8(this, a, e8c.X, new hk9(14), bundle, bundle, new mn(4, (Object) new sz3(this)));
        } catch (RuntimeException e) {
            udd.s("OneMeMediaSessionService", "Failed to create media session", e);
            a.release();
            kc8 = null;
        }
        this.w0 = kc8;
        if (kc8 != null) {
            n3e c = x87.c();
            l38 l38 = l38.a;
            Class<pae> cls = pae.class;
            ContextScope a2 = n1g.a(c.plus(((pae) l38.getAccessor().c(cls)).c().getImmediate()));
            this.x0 = a2;
            xs7.E(a2, ((pae) l38.getAccessor().c(cls)).b(), (ru3) null, new l5e(2, (Continuation) null), 2);
        }
    }

    public final void onDestroy() {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            fn6.d(tn7.X, "OneMeMediaSessionService", "onDestroy", (Throwable) null);
        }
        ContextScope contextScope = this.x0;
        if (contextScope != null) {
            n1g.c(contextScope, (CancellationException) null);
        }
        this.x0 = null;
        kc8 kc8 = this.w0;
        if (kc8 != null) {
            kc8.c().release();
            try {
                synchronized (kc8.b) {
                    kc8.c.remove(kc8.a.i);
                }
                kc8.a.r();
            } catch (Exception unused) {
            }
            this.w0 = null;
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.X;
            fn6.d(tn7, "OneMeMediaSessionService", "onStartCommand, intent=" + intent + ", flags=" + i + ", startId=" + i2, (Throwable) null);
        }
        if (this.w0 == null) {
            fn6 fn62 = udd.e;
            if (fn62 != null && fn62.c()) {
                fn62.d(tn7.w0, "OneMeMediaSessionService", "onStartCommand, media session is null, abort service", (Throwable) null);
            }
            stopSelf();
            return 2;
        }
        super.onStartCommand(intent, i, i2);
        return 1;
    }

    public final void onTaskRemoved(Intent intent) {
        stopSelf();
    }
}
