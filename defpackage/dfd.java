package defpackage;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.a;

/* renamed from: dfd  reason: default package */
public final class dfd extends a implements ok {
    public static final /* synthetic */ int S0 = 0;
    public final boolean O0 = true;
    public final h2d P0;
    public final Bundle Q0;
    public final Integer R0;

    public dfd(Context context, Looper looper, h2d h2d, Bundle bundle, oa6 oa6, pa6 pa6) {
        super(context, looper, 44, h2d, oa6, pa6);
        this.P0 = h2d;
        this.Q0 = bundle;
        this.R0 = (Integer) h2d.Z;
    }

    public final int g() {
        return 12451000;
    }

    public final boolean j() {
        return this.O0;
    }

    public final IInterface l(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof b0g ? (b0g) queryLocalInterface : new vyf(iBinder, "com.google.android.gms.signin.internal.ISignInService", 0);
    }

    public final Bundle n() {
        h2d h2d = this.P0;
        boolean equals = this.c.getPackageName().equals((String) h2d.o);
        Bundle bundle = this.Q0;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", (String) h2d.o);
        }
        return bundle;
    }

    public final String p() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    public final String q() {
        return "com.google.android.gms.signin.service.START";
    }

    public final void w() {
        e(new za6((Object) this));
    }

    public final void x(yzf yzf) {
        Parcel obtain;
        Parcel obtain2;
        a24.p(yzf, "Expecting a valid ISignInCallbacks");
        try {
            Account account = (Account) this.P0.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            GoogleSignInAccount b = "<<default account>>".equals(account.name) ? vyd.a(this.c).b() : null;
            Integer num = this.R0;
            a24.o(num);
            p0g p0g = new p0g(2, account, num.intValue(), b);
            b0g b0g = (b0g) o();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(b0g.e);
            int i = kzf.a;
            obtain.writeInt(1);
            int n0 = ek8.n0(obtain, 20293);
            ek8.p0(obtain, 1, 4);
            obtain.writeInt(1);
            ek8.j0(obtain, 2, p0g, 0);
            ek8.o0(obtain, n0);
            obtain.writeStrongBinder(yzf.asBinder());
            obtain2 = Parcel.obtain();
            b0g.d.transact(12, obtain, obtain2, 0);
            obtain2.readException();
            obtain.recycle();
            obtain2.recycle();
        } catch (RemoteException e) {
            try {
                rzf rzf = (rzf) yzf;
                rzf.e.post(new q36((Object) rzf, (Object) new k0g(1, new nd3(8, (PendingIntent) null), (q0g) null), false, 28));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        } catch (Throwable th) {
            obtain.recycle();
            obtain2.recycle();
            throw th;
        }
    }
}
