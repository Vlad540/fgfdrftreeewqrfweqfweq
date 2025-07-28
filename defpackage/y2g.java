package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.common.internal.a;

/* renamed from: y2g  reason: default package */
public final class y2g implements ServiceConnection {
    public final int a;
    public final /* synthetic */ a b;

    public y2g(a aVar, int i) {
        this.b = aVar;
        this.a = i;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        if (iBinder == null) {
            a aVar = this.b;
            synchronized (aVar.Y) {
                i = aVar.B0;
            }
            if (i == 3) {
                aVar.I0 = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            p1g p1g = aVar.X;
            p1g.sendMessage(p1g.obtainMessage(i2, aVar.K0.get(), 16));
            return;
        }
        synchronized (this.b.Z) {
            try {
                a aVar2 = this.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                aVar2.w0 = (queryLocalInterface == null || !(queryLocalInterface instanceof z0g)) ? new z0g(iBinder) : (z0g) queryLocalInterface;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        a aVar3 = this.b;
        int i3 = this.a;
        aVar3.getClass();
        v3g v3g = new v3g(aVar3, 0);
        p1g p1g2 = aVar3.X;
        p1g2.sendMessage(p1g2.obtainMessage(7, i3, -1, v3g));
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        a aVar;
        synchronized (this.b.Z) {
            aVar = this.b;
            aVar.w0 = null;
        }
        int i = this.a;
        p1g p1g = aVar.X;
        p1g.sendMessage(p1g.obtainMessage(6, i, 1));
    }
}
