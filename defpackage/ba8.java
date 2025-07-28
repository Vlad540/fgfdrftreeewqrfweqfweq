package defpackage;

import android.media.MediaRouter2;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;

/* renamed from: ba8  reason: default package */
public final class ba8 extends nb8 {
    public final String a;
    public final aa8 b;

    public ba8(String str, aa8 aa8) {
        this.a = str;
        this.b = aa8;
    }

    public final void f(int i) {
        aa8 aa8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (aa8 = this.b) != null && (routingController = aa8.g) != null && !routingController.isReleased() && (messenger = aa8.h) != null) {
            int andIncrement = aa8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 7;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = aa8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }

    public final void i(int i) {
        aa8 aa8;
        MediaRouter2.RoutingController routingController;
        Messenger messenger;
        String str = this.a;
        if (str != null && (aa8 = this.b) != null && (routingController = aa8.g) != null && !routingController.isReleased() && (messenger = aa8.h) != null) {
            int andIncrement = aa8.l.getAndIncrement();
            Message obtain = Message.obtain();
            obtain.what = 8;
            obtain.arg1 = andIncrement;
            Bundle bundle = new Bundle();
            bundle.putInt("volume", i);
            bundle.putString("routeId", str);
            obtain.setData(bundle);
            obtain.replyTo = aa8.i;
            try {
                messenger.send(obtain);
            } catch (DeadObjectException | RemoteException unused) {
            }
        }
    }
}
