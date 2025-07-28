package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Base64;
import com.google.android.gms.common.internal.a;

/* renamed from: q5g  reason: default package */
public final class q5g extends a {
    public final u60 O0;

    /* JADX WARNING: type inference failed for: r8v1, types: [it4, java.lang.Object] */
    public q5g(Context context, Looper looper, h2d h2d, u60 u60, oa6 oa6, pa6 pa6) {
        super(context, looper, 68, h2d, oa6, pa6);
        u60 = u60 == null ? u60.o : u60;
        ? obj = new Object();
        obj.b = Boolean.FALSE;
        obj.a = u60.a;
        obj.b = Boolean.valueOf(u60.b);
        obj.c = u60.c;
        byte[] bArr = new byte[16];
        s1g.a.nextBytes(bArr);
        obj.c = Base64.encodeToString(bArr, 11);
        this.O0 = new u60(obj);
    }

    public final int g() {
        return 12800000;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof l6g ? (l6g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService", 4);
    }

    public final Bundle n() {
        u60 u60 = this.O0;
        u60.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", u60.a);
        bundle.putBoolean("force_save_dialog", u60.b);
        bundle.putString("log_session_id", u60.c);
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    public final String q() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
