package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: n3g  reason: default package */
public final class n3g extends m4g {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n3g(g4g g4g, vde vde, vde vde2) {
        super(vde);
        this.c = vde2;
        this.o = g4g;
    }

    public final void a() {
        HashMap hashMap;
        Parcel obtain;
        IInterface iInterface = null;
        switch (this.b) {
            case 0:
                try {
                    g4g g4g = (g4g) this.o;
                    o3g o3g = (o3g) g4g.a.m;
                    String str = g4g.b;
                    Bundle bundle = new Bundle();
                    HashMap hashMap2 = l4g.a;
                    synchronized (l4g.class) {
                        hashMap = l4g.a;
                        hashMap.put("java", 20002);
                    }
                    bundle.putInt("playcore_version_code", ((Integer) hashMap.get("java")).intValue());
                    if (hashMap.containsKey("native")) {
                        bundle.putInt("playcore_native_version", ((Integer) hashMap.get("native")).intValue());
                    }
                    if (hashMap.containsKey("unity")) {
                        bundle.putInt("playcore_unity_version", ((Integer) hashMap.get("unity")).intValue());
                    }
                    g4g g4g2 = (g4g) this.o;
                    String str2 = g4g2.b;
                    a4g a4g = new a4g(g4g2, (vde) this.c);
                    k2g k2g = (k2g) o3g;
                    k2g.getClass();
                    obtain = Parcel.obtain();
                    obtain.writeInterfaceToken("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    obtain.writeString(str);
                    int i = y1g.a;
                    obtain.writeInt(1);
                    bundle.writeToParcel(obtain, 0);
                    obtain.writeStrongBinder(a4g);
                    k2g.c.transact(2, obtain, (Parcel) null, 1);
                    obtain.recycle();
                    return;
                } catch (RemoteException e) {
                    mj4 mj4 = g4g.c;
                    Object[] objArr = {((g4g) this.o).b};
                    if (Log.isLoggable("PlayCore", 6)) {
                        mj4.d(mj4.a, "error requesting in-app review for %s", objArr);
                    } else {
                        mj4.getClass();
                    }
                    ((vde) this.c).c(new RuntimeException(e));
                    return;
                } catch (Throwable th) {
                    obtain.recycle();
                    throw th;
                }
            default:
                int i2 = w2g.d;
                IBinder iBinder = (IBinder) this.c;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.inappreview.protocol.IInAppReviewService");
                    iInterface = queryLocalInterface instanceof o3g ? (o3g) queryLocalInterface : new k2g(iBinder);
                }
                a6g a6g = (a6g) this.o;
                f6g f6g = (f6g) a6g.b;
                f6g.m = iInterface;
                mj4 mj42 = f6g.b;
                mj42.b("linkToDeath", new Object[0]);
                try {
                    f6g.m.asBinder().linkToDeath(f6g.j, 0);
                } catch (RemoteException unused) {
                    Object[] objArr2 = new Object[0];
                    if (Log.isLoggable("PlayCore", 6)) {
                        mj4.d(mj42.a, "linkToDeath failed", objArr2);
                    } else {
                        mj42.getClass();
                    }
                }
                f6g f6g2 = (f6g) a6g.b;
                f6g2.g = false;
                Iterator it = f6g2.d.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
                f6g2.d.clear();
                return;
        }
    }

    public n3g(a6g a6g, IBinder iBinder) {
        this.c = iBinder;
        this.o = a6g;
    }
}
