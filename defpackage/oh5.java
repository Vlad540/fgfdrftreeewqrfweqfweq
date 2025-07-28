package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;

/* renamed from: oh5  reason: default package */
public final /* synthetic */ class oh5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ oh5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void run() {
        n6g n6g;
        int i;
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                if (firebaseMessaging.e.k() && firebaseMessaging.i(firebaseMessaging.e())) {
                    synchronized (firebaseMessaging) {
                        if (!firebaseMessaging.i) {
                            firebaseMessaging.h(0);
                        }
                    }
                    return;
                }
                return;
            default:
                FirebaseMessaging firebaseMessaging2 = this.b;
                Context context = firebaseMessaging2.b;
                oyb.G(context);
                boolean g = firebaseMessaging2.g();
                SharedPreferences B = udd.B(context);
                if (!B.contains("proxy_retention") || B.getBoolean("proxy_retention", false) != g) {
                    zgc zgc = (zgc) firebaseMessaging2.c.c;
                    if (zgc.c.g() >= 241100000) {
                        Bundle bundle = new Bundle();
                        bundle.putBoolean("proxy_retention", g);
                        i6g g2 = i6g.g(zgc.b);
                        synchronized (g2) {
                            i = g2.b;
                            g2.b = i + 1;
                        }
                        n6g = g2.h(new v5g(i, 4, bundle, 0));
                    } else {
                        n6g = gwf.n(new IOException("SERVICE_NOT_AVAILABLE"));
                    }
                    n6g.d(new gr(2), new qib(0, context, g));
                }
                if (firebaseMessaging2.g()) {
                    firebaseMessaging2.f();
                    return;
                }
                return;
        }
    }
}
