package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* renamed from: l5g  reason: default package */
public final class l5g implements ServiceConnection {
    public final k5g X;
    public ComponentName Y;
    public final /* synthetic */ c6g Z;
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder o;

    public l5g(c6g c6g, k5g k5g) {
        this.Z = c6g;
        this.X = k5g;
    }

    public final void a(String str, Executor executor) {
        this.b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            c6g c6g = this.Z;
            nfc nfc = c6g.d;
            Context context = c6g.b;
            boolean s = nfc.s(context, str, this.X.a(context), this, 4225, executor);
            this.c = s;
            if (s) {
                this.Z.c.sendMessageDelayed(this.Z.c.obtainMessage(1, this.X), this.Z.f);
            } else {
                this.b = 2;
                try {
                    c6g c6g2 = this.Z;
                    c6g2.d.r(c6g2.b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }

    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = iBinder;
                this.Y = componentName;
                for (ServiceConnection onServiceConnected : this.a.values()) {
                    onServiceConnected.onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.Z.a) {
            try {
                this.Z.c.removeMessages(1, this.X);
                this.o = null;
                this.Y = componentName;
                for (ServiceConnection onServiceDisconnected : this.a.values()) {
                    onServiceDisconnected.onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
