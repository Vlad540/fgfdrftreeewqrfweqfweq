package defpackage;

import android.os.Parcel;

/* renamed from: szf  reason: default package */
public final class szf extends ms6 {
    public final /* synthetic */ int d = 1;
    public Object e;

    public szf() {
        this.c = null;
        this.a = false;
        this.b = 0;
    }

    public final void g(ok okVar, vde vde) {
        switch (this.d) {
            case 0:
                ((n8c) ((bq0) this.e).d).accept(okVar, vde);
                return;
            default:
                this.e = vde;
                t3g t3g = (t3g) ((d4g) okVar).o();
                x4g x4g = new x4g(this);
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i = d2g.a;
                obtain.writeStrongBinder(x4g);
                Parcel obtain2 = Parcel.obtain();
                try {
                    t3g.c.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    public szf(bq0 bq0, ib5[] ib5Arr, boolean z, int i) {
        this.e = bq0;
        this.c = ib5Arr;
        boolean z2 = false;
        if (ib5Arr != null && z) {
            z2 = true;
        }
        this.a = z2;
        this.b = i;
    }
}
