package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: hp9  reason: default package */
public final class hp9 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet o = new HashSet();

    public hp9(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(gp9 gp9) {
        boolean z;
        ArrayDeque arrayDeque;
        boolean isLoggable = Log.isLoggable("NotifManCompat", 3);
        ComponentName componentName = gp9.a;
        if (isLoggable) {
            Objects.toString(componentName);
            gp9.d.size();
        }
        if (!gp9.d.isEmpty()) {
            if (gp9.b) {
                z = true;
            } else {
                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
                Context context = this.a;
                boolean bindService = context.bindService(component, this, 33);
                gp9.b = bindService;
                if (bindService) {
                    gp9.e = 0;
                } else {
                    Objects.toString(componentName);
                    context.unbindService(this);
                }
                z = gp9.b;
            }
            if (!z || gp9.c == null) {
                b(gp9);
                return;
            }
            while (true) {
                arrayDeque = gp9.d;
                ep9 ep9 = (ep9) arrayDeque.peek();
                if (ep9 == null) {
                    break;
                }
                try {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        ep9.toString();
                    }
                    ep9.a(gp9.c);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable("NotifManCompat", 3)) {
                        Objects.toString(componentName);
                    }
                } catch (RemoteException unused2) {
                    Objects.toString(componentName);
                }
            }
            if (!arrayDeque.isEmpty()) {
                b(gp9);
            }
        }
    }

    public final void b(gp9 gp9) {
        Handler handler = this.b;
        ComponentName componentName = gp9.a;
        if (!handler.hasMessages(3, componentName)) {
            int i = gp9.e;
            int i2 = i + 1;
            gp9.e = i2;
            if (i2 > 6) {
                ArrayDeque arrayDeque = gp9.d;
                arrayDeque.size();
                Objects.toString(componentName);
                arrayDeque.clear();
                return;
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (long) ((1 << i) * 1000));
        }
    }

    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        if (i == 0) {
            ep9 ep9 = (ep9) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (ip9.c) {
                if (string != null) {
                    try {
                        if (!string.equals(ip9.d)) {
                            String[] split = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(split.length);
                            for (String unflattenFromString : split) {
                                ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                                if (unflattenFromString2 != null) {
                                    hashSet2.add(unflattenFromString2.getPackageName());
                                }
                            }
                            ip9.e = hashSet2;
                            ip9.d = string;
                        }
                    } finally {
                        while (true) {
                        }
                    }
                }
                hashSet = ip9.e;
            }
            if (!hashSet.equals(this.o)) {
                this.o = hashSet;
                List<ResolveInfo> queryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet hashSet3 = new HashSet();
                for (ResolveInfo next : queryIntentServices) {
                    if (hashSet.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            componentName.toString();
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                Iterator it = hashSet3.iterator();
                while (it.hasNext()) {
                    ComponentName componentName2 = (ComponentName) it.next();
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(componentName2);
                        }
                        this.c.put(componentName2, new gp9(componentName2));
                    }
                }
                Iterator it2 = this.c.entrySet().iterator();
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Objects.toString(entry.getKey());
                        }
                        gp9 gp9 = (gp9) entry.getValue();
                        if (gp9.b) {
                            this.a.unbindService(this);
                            gp9.b = false;
                        }
                        gp9.c = null;
                        it2.remove();
                    }
                }
            }
            for (gp9 gp92 : this.c.values()) {
                gp92.d.add(ep9);
                a(gp92);
            }
            return true;
        } else if (i == 1) {
            fp9 fp9 = (fp9) message.obj;
            ComponentName componentName3 = fp9.a;
            IBinder iBinder = fp9.b;
            gp9 gp93 = (gp9) this.c.get(componentName3);
            if (gp93 != null) {
                gp93.c = INotificationSideChannel.Stub.asInterface(iBinder);
                gp93.e = 0;
                a(gp93);
            }
            return true;
        } else if (i == 2) {
            gp9 gp94 = (gp9) this.c.get((ComponentName) message.obj);
            if (gp94 != null) {
                if (gp94.b) {
                    this.a.unbindService(this);
                    gp94.b = false;
                }
                gp94.c = null;
            }
            return true;
        } else if (i != 3) {
            return false;
        } else {
            gp9 gp95 = (gp9) this.c.get((ComponentName) message.obj);
            if (gp95 != null) {
                a(gp95);
            }
            return true;
        }
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(1, new fp9(componentName, iBinder)).sendToTarget();
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Objects.toString(componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
