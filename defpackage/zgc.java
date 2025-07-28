package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: zgc  reason: default package */
public final class zgc {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final kgd a = new kgd(0);
    public final Context b;
    public final hw9 c;
    public final ScheduledThreadPoolExecutor d;
    public final Messenger e;
    public Messenger f;
    public m2g g;

    public zgc(Context context) {
        this.b = context;
        this.c = new hw9(context);
        this.e = new Messenger(new b1g(this, Looper.getMainLooper()));
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1);
        scheduledThreadPoolExecutor.setKeepAliveTime(60, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final n6g a(Bundle bundle) {
        String num;
        synchronized (zgc.class) {
            int i2 = h;
            h = i2 + 1;
            num = Integer.toString(i2);
        }
        vde vde = new vde();
        synchronized (this.a) {
            this.a.put(num, vde);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.h() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context = this.b;
        synchronized (zgc.class) {
            try {
                if (i == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    i = PendingIntent.getBroadcast(context, 0, intent2, w0g.a);
                }
                intent.putExtra("app", i);
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        intent.putExtra("kid", "|ID|" + num + "|");
        if (Log.isLoggable("Rpc", 3)) {
            "Sending ".concat(String.valueOf(intent.getExtras()));
        }
        intent.putExtra("google.messenger", this.e);
        if (!(this.f == null && this.g == null)) {
            Message obtain = Message.obtain();
            obtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(obtain);
                } else {
                    Messenger messenger2 = this.g.a;
                    messenger2.getClass();
                    messenger2.send(obtain);
                }
            } catch (RemoteException unused) {
            }
            vde.a.b(mh4.o, new it4(this, num, this.d.schedule(new lde(17, (Object) vde), 30, TimeUnit.SECONDS)));
            return vde.a;
        }
        if (this.c.h() == 2) {
            this.b.sendBroadcast(intent);
        } else {
            this.b.startService(intent);
        }
        vde.a.b(mh4.o, new it4(this, num, this.d.schedule(new lde(17, (Object) vde), 30, TimeUnit.SECONDS)));
        return vde.a;
    }

    public final void b(String str, Bundle bundle) {
        synchronized (this.a) {
            try {
                vde vde = (vde) this.a.remove(str);
                if (vde != null) {
                    vde.b(bundle);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
