package defpackage;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;

/* renamed from: v5g  reason: default package */
public final class v5g {
    public final int a;
    public final vde b = new vde();
    public final int c;
    public final Bundle d;
    public final /* synthetic */ int e;

    public v5g(int i, int i2, Bundle bundle, int i3) {
        this.e = i3;
        this.a = i;
        this.c = i2;
        this.d = bundle;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [com.google.android.gms.cloudmessaging.zzt, java.lang.Exception] */
    public final void a(Bundle bundle) {
        switch (this.e) {
            case 0:
                if (bundle.getBoolean("ack", false)) {
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        toString();
                    }
                    this.b.b((Object) null);
                    return;
                }
                c(new Exception("Invalid response to one way request", (Throwable) null));
                return;
            default:
                Bundle bundle2 = bundle.getBundle("data");
                if (bundle2 == null) {
                    bundle2 = Bundle.EMPTY;
                }
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    toString();
                    String.valueOf(bundle2);
                }
                this.b.b(bundle2);
                return;
        }
    }

    public final boolean b() {
        switch (this.e) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    public final void c(zzt zzt) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            toString();
            zzt.toString();
        }
        this.b.a(zzt);
    }

    public final String toString() {
        return "Request { what=" + this.c + " id=" + this.a + " oneWay=" + b() + "}";
    }
}
