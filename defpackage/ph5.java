package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: ph5  reason: default package */
public final /* synthetic */ class ph5 implements tx9 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;

    public /* synthetic */ ph5(FirebaseMessaging firebaseMessaging, int i) {
        this.a = i;
        this.b = firebaseMessaging;
    }

    public final void a(Object obj) {
        boolean z;
        switch (this.a) {
            case 0:
                xme xme = (xme) obj;
                if (this.b.e.k() && xme.h.a() != null) {
                    synchronized (xme) {
                        z = xme.g;
                    }
                    if (!z) {
                        xme.f(0);
                        return;
                    }
                    return;
                }
                return;
            default:
                h13 h13 = (h13) obj;
                ea6 ea6 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging = this.b;
                firebaseMessaging.getClass();
                if (h13 != null) {
                    h2g.q(h13.a);
                    firebaseMessaging.f();
                    return;
                }
                return;
        }
    }
}
