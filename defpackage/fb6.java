package defpackage;

import android.content.Context;
import com.google.firebase.messaging.FirebaseMessaging;
import one.me.sdk.vendor.StoreServicesInfo$ServicesNotAvailableException;

/* renamed from: fb6  reason: default package */
public final class fb6 implements ezd {
    public final Context a;
    public final String b = fb6.class.getName();
    public final r7e c;
    public int d;
    public int e;
    public final String f;

    public fb6(Context context, t97 t97, t97 t972) {
        this.a = context;
        this.c = new r7e(new k61(this, t972, t97, 2));
        this.d = -1;
        this.e = -1;
        this.f = "Google Play Services";
    }

    public final boolean a() {
        if (this.d == -1) {
            this.d = ma6.d.b(this.a, na6.a);
        }
        return this.d == 0;
    }

    public final Object b(z8e z8e) {
        FirebaseMessaging instance;
        if (a()) {
            cjc cjc = new cjc(urd.y(z8e));
            ea6 ea6 = FirebaseMessaging.k;
            synchronized (FirebaseMessaging.class) {
                instance = FirebaseMessaging.getInstance(ih5.b());
            }
            instance.getClass();
            vde vde = new vde();
            instance.f.execute(new qh5(instance, vde, 1));
            vde.a.i(new mn(this, cjc, false, 18));
            return cjc.a();
        }
        throw new StoreServicesInfo$ServicesNotAvailableException();
    }
}
