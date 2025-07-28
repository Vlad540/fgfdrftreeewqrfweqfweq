package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: v2g  reason: default package */
public final class v2g extends a {
    public final kgd O0 = new kgd(0);
    public final kgd P0 = new kgd(0);
    public final kgd Q0 = new kgd(0);

    public v2g(Context context, Looper looper, h2d h2d, oa6 oa6, pa6 pa6) {
        super(context, looper, 23, h2d, oa6, pa6);
    }

    public final int g() {
        return 11717000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return queryLocalInterface instanceof g6g ? (g6g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService", 2);
    }

    public final ib5[] m() {
        return swb.c;
    }

    public final String p() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    public final String q() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    public final void s() {
        System.currentTimeMillis();
        synchronized (this.O0) {
            this.O0.clear();
        }
        synchronized (this.P0) {
            this.P0.clear();
        }
        synchronized (this.Q0) {
            this.Q0.clear();
        }
    }

    public final boolean t() {
        return true;
    }
}
