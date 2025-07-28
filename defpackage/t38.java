package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.ResultReceiver;
import android.support.v4.media.session.IMediaSession;
import android.support.v4.media.session.MediaSessionCompat;
import java.lang.ref.WeakReference;

/* renamed from: t38  reason: default package */
public final class t38 extends ResultReceiver {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t38(int i, Handler handler, Object obj) {
        super(handler);
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [kn6, java.lang.Object] */
    public final void onReceiveResult(int i, Bundle bundle) {
        mn6 mn6 = null;
        switch (this.a) {
            case 0:
                v38 v38 = (v38) ((WeakReference) this.b).get();
                if (v38 != null && bundle != null) {
                    synchronized (v38.b) {
                        uc8 uc8 = v38.e;
                        IBinder binder = bundle.getBinder(MediaSessionCompat.KEY_EXTRA_BINDER);
                        int i2 = oc8.d;
                        if (binder != null) {
                            IInterface queryLocalInterface = binder.queryLocalInterface(IMediaSession.DESCRIPTOR);
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof mn6)) {
                                ? obj = new Object();
                                obj.c = binder;
                                mn6 = obj;
                            } else {
                                mn6 = (mn6) queryLocalInterface;
                            }
                        }
                        synchronized (uc8.a) {
                            uc8.c = mn6;
                        }
                        uc8 uc82 = v38.e;
                        i1f k = fja.k(bundle);
                        synchronized (uc82.a) {
                            uc82.o = k;
                        }
                        v38.a();
                    }
                    return;
                }
                return;
            case 1:
                if (bundle == null) {
                    bundle = Bundle.EMPTY;
                }
                ((a4d) this.b).l(new p2d(i, bundle));
                return;
            default:
                ((vde) this.b).d((Object) null);
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t38(Handler handler) {
        super(handler);
        this.a = 0;
    }
}
