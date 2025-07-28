package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x7c  reason: default package */
public final class x7c extends ob8 implements ServiceConnection {
    public static final boolean F0 = Log.isLoggable("MediaRouteProviderProxy", 3);
    public boolean A0;
    public boolean B0;
    public s7c C0;
    public boolean D0;
    public ss8 E0;
    public final ComponentName x0;
    public final z59 y0;
    public final ArrayList z0 = new ArrayList();

    public x7c(Context context, ComponentName componentName) {
        super(context, new lv1(22, componentName));
        this.x0 = componentName;
        this.y0 = new z59();
    }

    public final mb8 c(String str) {
        if (str != null) {
            pb8 pb8 = this.Z;
            if (pb8 != null) {
                List list = pb8.c;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    if (((ta8) list.get(i)).c().equals(str)) {
                        v7c v7c = new v7c(this, str);
                        this.z0.add(v7c);
                        if (this.D0) {
                            v7c.b(this.C0);
                        }
                        m();
                        return v7c;
                    }
                }
            }
            return null;
        }
        throw new IllegalArgumentException("initialMemberRouteId cannot be null.");
    }

    public final nb8 d(String str) {
        if (str != null) {
            return j(str, (String) null);
        }
        throw new IllegalArgumentException("routeId cannot be null");
    }

    public final nb8 e(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("routeId cannot be null");
        } else if (str2 != null) {
            return j(str, str2);
        } else {
            throw new IllegalArgumentException("routeGroupId cannot be null");
        }
    }

    public final void f(va8 va8) {
        if (this.D0) {
            s7c s7c = this.C0;
            int i = s7c.d;
            s7c.d = i + 1;
            s7c.b(10, i, 0, va8 != null ? va8.a : null, (Bundle) null);
        }
        m();
    }

    public final void i() {
        if (!this.B0) {
            boolean z = F0;
            if (z) {
                toString();
            }
            Intent intent = new Intent("android.media.MediaRouteProviderService");
            intent.setComponent(this.x0);
            try {
                boolean bindService = this.a.bindService(intent, this, 4097);
                this.B0 = bindService;
                if (!bindService && z) {
                    toString();
                }
            } catch (SecurityException unused) {
                if (z) {
                    toString();
                }
            }
        }
    }

    public final w7c j(String str, String str2) {
        pb8 pb8 = this.Z;
        if (pb8 == null) {
            return null;
        }
        List list = pb8.c;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((ta8) list.get(i)).c().equals(str)) {
                w7c w7c = new w7c(this, str, str2);
                this.z0.add(w7c);
                if (this.D0) {
                    w7c.b(this.C0);
                }
                m();
                return w7c;
            }
        }
        return null;
    }

    public final void k() {
        if (this.C0 != null) {
            g((pb8) null);
            this.D0 = false;
            ArrayList arrayList = this.z0;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((t7c) arrayList.get(i)).c();
            }
            s7c s7c = this.C0;
            s7c.b(2, 0, 0, (Bundle) null, (Bundle) null);
            s7c.b.b.clear();
            s7c.a.getBinder().unlinkToDeath(s7c, 0);
            s7c.i.y0.post(new r7c(s7c, 0));
            this.C0 = null;
        }
    }

    public final void l() {
        if (this.B0) {
            if (F0) {
                toString();
            }
            this.B0 = false;
            k();
            try {
                this.a.unbindService(this);
            } catch (IllegalArgumentException unused) {
                toString();
            }
        }
    }

    public final void m() {
        if (!this.A0 || (this.X == null && this.z0.isEmpty())) {
            l();
        } else {
            i();
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        boolean z = F0;
        if (z) {
            toString();
        }
        if (this.B0) {
            k();
            Messenger messenger = iBinder != null ? new Messenger(iBinder) : null;
            if (messenger != null) {
                try {
                    if (messenger.getBinder() != null) {
                        s7c s7c = new s7c(this, messenger);
                        int i = s7c.d;
                        s7c.d = i + 1;
                        s7c.g = i;
                        if (s7c.b(1, i, 4, (Bundle) null, (Bundle) null)) {
                            try {
                                s7c.a.getBinder().linkToDeath(s7c, 0);
                                this.C0 = s7c;
                                return;
                            } catch (RemoteException unused) {
                                s7c.binderDied();
                            }
                        }
                        if (z) {
                            toString();
                            return;
                        }
                        return;
                    }
                } catch (NullPointerException unused2) {
                }
            }
            toString();
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (F0) {
            toString();
        }
        k();
    }

    public final String toString() {
        return "Service connection " + this.x0.flattenToShortString();
    }
}
