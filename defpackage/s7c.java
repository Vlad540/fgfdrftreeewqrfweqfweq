package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.SparseArray;

/* renamed from: s7c  reason: default package */
public final class s7c implements IBinder.DeathRecipient {
    public final Messenger a;
    public final qc b;
    public final Messenger c;
    public int d = 1;
    public int e = 1;
    public int f;
    public int g;
    public final SparseArray h = new SparseArray();
    public final /* synthetic */ x7c i;

    public s7c(x7c x7c, Messenger messenger) {
        this.i = x7c;
        this.a = messenger;
        qc qcVar = new qc(this);
        this.b = qcVar;
        this.c = new Messenger(qcVar);
    }

    public final void a(int i2) {
        int i3 = this.d;
        this.d = i3 + 1;
        b(5, i3, i2, (Bundle) null, (Bundle) null);
    }

    public final boolean b(int i2, int i3, int i4, Bundle bundle, Bundle bundle2) {
        Message obtain = Message.obtain();
        obtain.what = i2;
        obtain.arg1 = i3;
        obtain.arg2 = i4;
        obtain.obj = bundle;
        obtain.setData(bundle2);
        obtain.replyTo = this.c;
        try {
            this.a.send(obtain);
            return true;
        } catch (DeadObjectException | RemoteException unused) {
            return false;
        }
    }

    public final void binderDied() {
        this.i.y0.post(new r7c(this, 1));
    }

    public final void c(int i2, int i3) {
        Bundle g2 = wn6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(7, i4, i2, (Bundle) null, g2);
    }

    public final void d(int i2, int i3) {
        Bundle g2 = wn6.g(i3, "volume");
        int i4 = this.d;
        this.d = i4 + 1;
        b(8, i4, i2, (Bundle) null, g2);
    }
}
