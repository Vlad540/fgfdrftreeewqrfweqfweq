package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* renamed from: a6g  reason: default package */
public final class a6g implements ServiceConnection {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a6g(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.a) {
            case 0:
                f6g f6g = (f6g) this.b;
                f6g.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                f6g.a().post(new n3g(this, iBinder));
                return;
            default:
                r6g r6g = (r6g) this.b;
                r6g.b.b("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                r6g.a().post(new e6g(this, iBinder));
                return;
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.a) {
            case 0:
                f6g f6g = (f6g) this.b;
                f6g.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                f6g.a().post(new f5g(1, this));
                return;
            default:
                r6g r6g = (r6g) this.b;
                r6g.b.b("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                r6g.a().post(new z5g(1, this));
                return;
        }
    }
}
