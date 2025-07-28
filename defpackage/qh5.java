package defpackage;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.google.firebase.messaging.FirebaseMessaging;

/* renamed from: qh5  reason: default package */
public final /* synthetic */ class qh5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseMessaging b;
    public final /* synthetic */ vde c;

    public /* synthetic */ qh5(FirebaseMessaging firebaseMessaging, vde vde, int i) {
        this.a = i;
        this.b = firebaseMessaging;
        this.c = vde;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                FirebaseMessaging firebaseMessaging = this.b;
                vde vde = this.c;
                ea6 ea6 = FirebaseMessaging.k;
                firebaseMessaging.getClass();
                try {
                    mif mif = firebaseMessaging.c;
                    mif.getClass();
                    Bundle bundle = new Bundle();
                    bundle.putString("delete", "1");
                    gwf.a(mif.e(mif.n(z29.h((ih5) mif.a), "*", bundle)));
                    ea6 c2 = FirebaseMessaging.c(firebaseMessaging.b);
                    String d = firebaseMessaging.d();
                    String h = z29.h(firebaseMessaging.a);
                    synchronized (c2) {
                        String F = ea6.F(d, h);
                        SharedPreferences.Editor edit = ((SharedPreferences) c2.b).edit();
                        edit.remove(F);
                        edit.commit();
                    }
                    vde.b((Object) null);
                    return;
                } catch (Exception e) {
                    vde.a(e);
                    return;
                }
            default:
                vde vde2 = this.c;
                ea6 ea62 = FirebaseMessaging.k;
                FirebaseMessaging firebaseMessaging2 = this.b;
                firebaseMessaging2.getClass();
                try {
                    vde2.b(firebaseMessaging2.a());
                    return;
                } catch (Exception e2) {
                    vde2.a(e2);
                    return;
                }
        }
    }
}
