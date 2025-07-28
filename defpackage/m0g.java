package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.internal.a;

/* renamed from: m0g  reason: default package */
public final class m0g extends a {
    public final tee O0;

    public m0g(Context context, Looper looper, h2d h2d, tee tee, oa6 oa6, pa6 pa6) {
        super(context, looper, 270, h2d, oa6, pa6);
        this.O0 = tee;
    }

    public final int g() {
        return 203400000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return queryLocalInterface instanceof i0g ? (i0g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService", 0);
    }

    public final ib5[] m() {
        return kjd.q;
    }

    public final Bundle n() {
        tee tee = this.O0;
        tee.getClass();
        Bundle bundle = new Bundle();
        String str = tee.a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    public final String q() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    public final boolean r() {
        return true;
    }
}
