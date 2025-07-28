package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* renamed from: vh9  reason: default package */
public final class vh9 extends cf3 {
    public final ConnectivityManager Y = ((ConnectivityManager) ((Context) this.b).getSystemService("connectivity"));
    public final id3 Z = new id3(1, this);

    public vh9(Context context, duf duf) {
        super(context, duf);
    }

    public final Object i() {
        return wh9.a(this.Y);
    }

    public final void r() {
        try {
            a24.B().t(wh9.a, "Registering network callback");
            lh9.a(this.Y, this.Z);
        } catch (IllegalArgumentException e) {
            a24.B().y(wh9.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            a24.B().y(wh9.a, "Received exception while registering network callback", e2);
        }
    }

    public final void s() {
        try {
            a24.B().t(wh9.a, "Unregistering network callback");
            jh9.c(this.Y, this.Z);
        } catch (IllegalArgumentException e) {
            a24.B().y(wh9.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            a24.B().y(wh9.a, "Received exception while unregistering network callback", e2);
        }
    }
}
