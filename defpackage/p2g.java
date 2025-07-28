package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* renamed from: p2g  reason: default package */
public final class p2g extends a {
    public final int g() {
        return 212800000;
    }

    public final /* synthetic */ IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.appset.internal.IAppSetService");
        return queryLocalInterface instanceof w3g ? (w3g) queryLocalInterface : new w3g(iBinder);
    }

    public final ib5[] m() {
        return fja.c;
    }

    public final String p() {
        return "com.google.android.gms.appset.internal.IAppSetService";
    }

    public final String q() {
        return "com.google.android.gms.appset.service.START";
    }

    public final boolean r() {
        return true;
    }
}
