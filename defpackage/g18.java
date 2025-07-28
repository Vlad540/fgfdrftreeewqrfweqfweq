package defpackage;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Messenger;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.IMediaSession;
import java.lang.ref.WeakReference;

/* renamed from: g18  reason: default package */
public final class g18 extends MediaBrowser.ConnectionCallback {
    public final /* synthetic */ jj7 a;

    public g18(jj7 jj7) {
        this.a = jj7;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [kn6, java.lang.Object] */
    public final void onConnected() {
        mn6 mn6;
        jj7 jj7 = this.a;
        h18 h18 = (h18) jj7.b;
        boolean z = true;
        if (h18 != null) {
            MediaBrowser mediaBrowser = h18.b;
            try {
                Bundle extras = mediaBrowser.getExtras();
                if (extras != null) {
                    extras.getInt("extra_service_version", 0);
                    IBinder binder = extras.getBinder("extra_messenger");
                    if (binder != null) {
                        qe4 qe4 = new qe4(binder, h18.c);
                        h18.f = qe4;
                        f18 f18 = h18.d;
                        Messenger messenger = new Messenger(f18);
                        h18.g = messenger;
                        f18.getClass();
                        f18.c = new WeakReference(messenger);
                        try {
                            Context context = h18.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("data_package_name", context.getPackageName());
                            bundle.putInt("data_calling_pid", Process.myPid());
                            bundle.putBundle("data_root_hints", (Bundle) qe4.c);
                            qe4.E(6, bundle, messenger);
                        } catch (RemoteException unused) {
                        }
                    }
                    IBinder binder2 = extras.getBinder("extra_session_binder");
                    int i = oc8.d;
                    if (binder2 == null) {
                        mn6 = null;
                    } else {
                        IInterface queryLocalInterface = binder2.queryLocalInterface(IMediaSession.DESCRIPTOR);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof mn6)) {
                            ? obj = new Object();
                            obj.c = binder2;
                            mn6 = obj;
                        } else {
                            mn6 = (mn6) queryLocalInterface;
                        }
                    }
                    if (mn6 != null) {
                        MediaSession.Token sessionToken = mediaBrowser.getSessionToken();
                        oyb.k(sessionToken != null);
                        if (sessionToken instanceof MediaSession.Token) {
                            h18.h = new uc8(sessionToken, mn6);
                        } else {
                            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                        }
                    }
                }
            } catch (IllegalStateException unused2) {
            }
        }
        u48 u48 = (u48) jj7.c;
        j18 j18 = u48.h;
        if (j18 != null) {
            h18 h182 = j18.a;
            if (h182.h == null) {
                MediaSession.Token sessionToken2 = h182.b.getSessionToken();
                if (sessionToken2 == null) {
                    z = false;
                }
                oyb.k(z);
                if (sessionToken2 instanceof MediaSession.Token) {
                    h182.h = new uc8(sessionToken2, (mn6) null);
                } else {
                    throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
                }
            }
            zo5 zo5 = new zo5(u48, 16, h182.h);
            r38 r38 = u48.b;
            r38.G(zo5);
            r38.X.post(new r48(u48, 0));
        }
    }

    public final void onConnectionFailed() {
        jj7 jj7 = this.a;
        Object obj = jj7.b;
        ((u48) jj7.c).b.release();
    }

    public final void onConnectionSuspended() {
        jj7 jj7 = this.a;
        h18 h18 = (h18) jj7.b;
        if (h18 != null) {
            h18.f = null;
            h18.g = null;
            h18.h = null;
            f18 f18 = h18.d;
            f18.getClass();
            f18.c = new WeakReference((Object) null);
        }
        ((u48) jj7.c).b.release();
    }
}
