package defpackage;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.foreground.SystemForegroundService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: b8e  reason: default package */
public final class b8e implements usf, p15 {
    public static final String y0 = a24.e0("SystemFgDispatcher");
    public final LinkedHashMap X;
    public final HashMap Y;
    public final HashSet Z;
    public final itf a;
    public final bee b;
    public final Object c = new Object();
    public btf o;
    public final ydc w0;
    public a8e x0;

    public b8e(Context context) {
        itf d = itf.d(context);
        this.a = d;
        this.b = d.d;
        this.o = null;
        this.X = new LinkedHashMap();
        this.Z = new HashSet();
        this.Y = new HashMap();
        this.w0 = new ydc(d.j, this);
        d.f.a(this);
    }

    public static Intent c(Context context, btf btf, hu5 hu5) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", hu5.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hu5.b);
        intent.putExtra("KEY_NOTIFICATION", hu5.c);
        intent.putExtra("KEY_WORKSPEC_ID", btf.a);
        intent.putExtra("KEY_GENERATION", btf.b);
        return intent;
    }

    public static Intent d(Context context, btf btf, hu5 hu5) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", btf.a);
        intent.putExtra("KEY_GENERATION", btf.b);
        intent.putExtra("KEY_NOTIFICATION_ID", hu5.a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", hu5.b);
        intent.putExtra("KEY_NOTIFICATION", hu5.c);
        return intent;
    }

    public final void a(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ztf ztf = (ztf) it.next();
                String str = ztf.a;
                a24.B().t(y0, rf0.h("Constraints unmet for WorkSpec ", str));
                btf o2 = vx3.o(ztf);
                itf itf = this.a;
                itf.d.c(new uyd(itf, new nqd(o2), true));
            }
        }
    }

    public final void b(btf btf, boolean z) {
        Map.Entry entry;
        synchronized (this.c) {
            try {
                ztf ztf = (ztf) this.Y.remove(btf);
                if (ztf != null ? this.Z.remove(ztf) : false) {
                    this.w0.G(this.Z);
                }
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
        }
        hu5 hu5 = (hu5) this.X.remove(btf);
        if (btf.equals(this.o) && this.X.size() > 0) {
            Iterator it = this.X.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.o = (btf) entry.getKey();
            if (this.x0 != null) {
                hu5 hu52 = (hu5) entry.getValue();
                a8e a8e = this.x0;
                SystemForegroundService systemForegroundService = (SystemForegroundService) a8e;
                systemForegroundService.b.post(new a46(systemForegroundService, hu52.a, hu52.c, hu52.b));
                SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.x0;
                systemForegroundService2.b.post(new ui0(hu52.a, 3, systemForegroundService2));
            }
        }
        a8e a8e2 = this.x0;
        if (hu5 != null && a8e2 != null) {
            a24 B = a24.B();
            String str = y0;
            B.t(str, "Removing Notification (id: " + hu5.a + ", workSpecId: " + btf + ", notificationType: " + hu5.b);
            SystemForegroundService systemForegroundService3 = (SystemForegroundService) a8e2;
            systemForegroundService3.b.post(new ui0(hu5.a, 3, systemForegroundService3));
        }
    }

    public final void e(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        btf btf = new btf(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        a24 B = a24.B();
        StringBuilder sb = new StringBuilder("Notifying with (id:");
        sb.append(intExtra);
        sb.append(", workSpecId: ");
        sb.append(stringExtra);
        sb.append(", notificationType :");
        B.t(y0, wn6.j(sb, intExtra2, ")"));
        if (notification != null && this.x0 != null) {
            hu5 hu5 = new hu5(intExtra, notification, intExtra2);
            LinkedHashMap linkedHashMap = this.X;
            linkedHashMap.put(btf, hu5);
            if (this.o == null) {
                this.o = btf;
                SystemForegroundService systemForegroundService = (SystemForegroundService) this.x0;
                systemForegroundService.b.post(new a46(systemForegroundService, intExtra, notification, intExtra2));
                return;
            }
            SystemForegroundService systemForegroundService2 = (SystemForegroundService) this.x0;
            systemForegroundService2.b.post(new fo((Object) systemForegroundService2, intExtra, (Object) notification, 5));
            if (intExtra2 != 0) {
                for (Map.Entry value : linkedHashMap.entrySet()) {
                    i |= ((hu5) value.getValue()).b;
                }
                hu5 hu52 = (hu5) linkedHashMap.get(this.o);
                if (hu52 != null) {
                    SystemForegroundService systemForegroundService3 = (SystemForegroundService) this.x0;
                    systemForegroundService3.b.post(new a46(systemForegroundService3, hu52.a, hu52.c, i));
                }
            }
        }
    }

    public final void f(List list) {
    }

    public final void g() {
        this.x0 = null;
        synchronized (this.c) {
            this.w0.H();
        }
        this.a.f.e(this);
    }
}
