package defpackage;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;

/* renamed from: x86  reason: default package */
public final class x86 extends o3 {
    public static final Parcelable.Creator<x86> CREATOR = new o1g(14);
    public static final Scope[] D0 = new Scope[0];
    public static final ib5[] E0 = new ib5[0];
    public final int A0;
    public boolean B0;
    public final String C0;
    public IBinder X;
    public Scope[] Y;
    public Bundle Z;
    public final int a;
    public final int b;
    public final int c;
    public String o;
    public Account w0;
    public ib5[] x0;
    public ib5[] y0;
    public final boolean z0;

    public x86(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, ib5[] ib5Arr, ib5[] ib5Arr2, boolean z, int i4, boolean z2, String str2) {
        Account account2;
        int i5 = i;
        String str3 = str;
        IBinder iBinder2 = iBinder;
        Scope[] scopeArr2 = scopeArr == null ? D0 : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        ib5[] ib5Arr3 = E0;
        ib5[] ib5Arr4 = ib5Arr == null ? ib5Arr3 : ib5Arr;
        ib5Arr3 = ib5Arr2 != null ? ib5Arr2 : ib5Arr3;
        this.a = i5;
        this.b = i2;
        this.c = i3;
        if ("com.google.android.gms".equals(str3)) {
            this.o = "com.google.android.gms";
        } else {
            this.o = str3;
        }
        if (i5 < 2) {
            account2 = null;
            if (iBinder2 != null) {
                int i6 = x4.d;
                IInterface queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                Object vyf = queryLocalInterface instanceof an6 ? (an6) queryLocalInterface : new vyf(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
                if (vyf != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        k6g k6g = (k6g) vyf;
                        Parcel k = k6g.k(k6g.G0(), 2);
                        Account account3 = (Account) e2g.a(k, Account.CREATOR);
                        k.recycle();
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                }
            }
        } else {
            this.X = iBinder2;
            account2 = account;
        }
        this.w0 = account2;
        this.Y = scopeArr2;
        this.Z = bundle2;
        this.x0 = ib5Arr4;
        this.y0 = ib5Arr3;
        this.z0 = z;
        this.A0 = i4;
        this.B0 = z2;
        this.C0 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        o1g.a(this, parcel, i);
    }
}
