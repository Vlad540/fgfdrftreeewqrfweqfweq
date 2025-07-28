package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import one.me.android.MainActivity;
import ru.ok.tamtam.android.services.NotificationTamService;

/* renamed from: o7a  reason: default package */
public final class o7a {
    public final Context a;
    public final t97 b;
    public final t97 c;
    public final t97 d;
    public final t97 e;
    public final t97 f;
    public final t97 g;
    public ip9 h;
    public NotificationManager i;
    public final String j;
    public final String k;

    public o7a(String str, String str2, Context context, t97 t97, t97 t972, t97 t973, t97 t974, t97 t975, t97 t976) {
        this.a = context;
        this.d = t97;
        this.b = t972;
        this.c = t973;
        this.e = t974;
        this.f = t976;
        this.g = t975;
        c();
        this.j = str;
        this.k = str2;
    }

    public final void a(int i2) {
        ((h7a) this.d.getValue()).getClass();
        b(i2, (String) null);
    }

    public final void b(int i2, String str) {
        Locale locale = Locale.ENGLISH;
        udd.p("o7a", "cancel: notificationId = " + i2 + ", notificationTag = " + str, new Object[0]);
        j(true).b.cancel(str, i2);
    }

    public final void c() {
        try {
            ((en9) this.e.getValue()).f();
        } catch (Throwable th) {
            udd.s("o7a", "fail to create missing channels", th);
            ((g15) this.f.getValue()).a(th);
        }
    }

    public final List d(String str) {
        try {
            List asList = Arrays.asList(i().getActiveNotifications());
            if (r1g.p(str)) {
                return asList;
            }
            if ((asList instanceof Collection) && asList.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (Object next : asList) {
                try {
                    if (str.equals(((StatusBarNotification) next).getTag())) {
                        arrayList.add(next);
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return Collections.emptyList();
        }
    }

    public final fn9 e(si2 si2, int i2, int i3) {
        int i4 = NotificationTamService.y0;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.DIRECT_REPLY");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", si2.c);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", si2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", si2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", si2.l);
        PendingIntent service = PendingIntent.getService(context, i2, intent, d8.I(intent, d8.l(134217728)));
        HashSet hashSet = new HashSet();
        u8c u8c = new u8c("ru.ok.tamtam.extra.TEXT_REPLY", context.getString(avb.tt_reply), (CharSequence[]) null, true, 0, new Bundle(), hashSet);
        fn9 fn9 = new fn9(i3, context.getString(avb.tt_reply), service);
        fn9.f = new ArrayList();
        fn9.f.add(u8c);
        fn9.g = 1;
        fn9.h = false;
        return fn9;
    }

    public final Intent f(boolean z) {
        sr7.c.getClass();
        Intent k2 = k(sr7.a2((String) null, z));
        if (z) {
            k2.putExtra("push_action", "push_action_open_chats");
        }
        return k2;
    }

    public final fn9 g(si2 si2, int i2, int i3) {
        int i4 = NotificationTamService.y0;
        Context context = this.a;
        Intent intent = new Intent(context, NotificationTamService.class);
        intent.setAction("ru.ok.tamtam.action.MARK_AS_READ");
        intent.putExtra("ru.ok.tamtam.extra.CHAT_SERVER_ID", si2.c);
        intent.putExtra("ru.ok.tamtam.extra.MARK", si2.m);
        intent.putExtra("ru.ok.tamtam.extra.PUSH_ID", si2.a);
        intent.putExtra("ru.ok.tamtam.extra.EVENT_KEY", si2.b);
        intent.putExtra("ru.ok.tamtam.extra.MESSAGE_SERVER_ID", si2.l);
        fn9 fn9 = new fn9(i3, context.getString(avb.tt_mark_as_read), PendingIntent.getService(context, i2, intent, d8.I(intent, d8.l(201326592))));
        fn9.g = 2;
        fn9.h = false;
        return fn9;
    }

    public final un9 h(String str, boolean z, boolean z2) {
        String str2;
        boolean z3;
        Uri uri;
        c();
        un9 un9 = new un9(this.a, str);
        t97 t97 = this.d;
        ((h7a) t97.getValue()).getClass();
        un9.F.icon = dob.ic_notification;
        ((h7a) t97.getValue()).d();
        un9.x = -16745729;
        un9.i(16, true);
        un9.f(((h7a) t97.getValue()).a.getString(ysb.oneme_app_name));
        un9.z = str;
        kp kpVar = ((g2b) this.b.getValue()).c;
        t97 t972 = this.c;
        if (((aq) t972.getValue()).c()) {
            z3 = kpVar.g.getBoolean("app.notification.in.app.vibrate", true);
            str2 = kpVar.c("app.notification.in.app.sound", true) ? kpVar.v("app.notification.ringtone") : null;
        } else {
            z3 = kpVar.c("app.notification.vibrate", true);
            str2 = kpVar.v("app.notification.ringtone");
        }
        int i2 = 0;
        boolean z4 = kpVar.g.getBoolean("app.notification.important.priority", true) && !((aq) t972.getValue()).c();
        int d2 = kpVar.d("app.notification.led.color", kpVar.t());
        if (z) {
            if (z3) {
                i2 = 2;
            } else {
                un9.F.vibrate = new long[0];
            }
            if (str2 == null || "_NONE_".equals(str2)) {
                un9.p((Uri) null);
            } else {
                if ("DEFAULT".equals(str2)) {
                    ((h7a) t97.getValue()).getClass();
                    uri = Settings.System.DEFAULT_NOTIFICATION_URI;
                } else {
                    uri = Uri.parse(str2);
                }
                un9.p(uri);
            }
            un9.g(i2);
        }
        if (d2 != 0) {
            Notification notification = un9.F;
            notification.ledARGB = d2;
            notification.ledOnMS = 1000;
            notification.ledOffMS = 1000;
            notification.flags = (notification.flags & -2) | 1;
        }
        if (z4) {
            un9.k = 2;
        }
        un9.u = z2;
        return un9;
    }

    public final NotificationManager i() {
        if (this.i == null) {
            this.i = (NotificationManager) this.a.getSystemService("notification");
            c();
        }
        return this.i;
    }

    public final ip9 j(boolean z) {
        if (this.h == null) {
            this.h = new ip9(this.a);
        }
        if (z) {
            c();
        }
        return this.h;
    }

    public final Intent k(a34 a34) {
        sr7.c.getClass();
        Context context = this.a;
        String str = this.j;
        String str2 = this.k;
        Intent intent = new Intent(context, MainActivity.class);
        intent.setAction("CUSTOM_DEEP_LINK");
        sr7.c.getClass();
        intent.setData(Uri.parse(str + "://" + str2 + "/" + a34.b));
        return intent;
    }

    public final void l(un9 un9, Intent intent, Intent intent2, int i2, String str) {
        Context context = this.a;
        un9.g = d8.p(context, i2, intent);
        if (intent2 != null) {
            un9.F.deleteIntent = PendingIntent.getService(context, i2, intent2, d8.I(intent2, d8.l(134217728)));
        }
        Notification b2 = un9.b();
        ((h7a) this.d.getValue()).e();
        j(true).a(str, i2, b2);
        udd.P("o7a", "notify: tag = %s, id = %d, %s", str, Integer.valueOf(i2), b2);
    }

    public final void m() {
        try {
            en9 en9 = (en9) this.e.getValue();
            en9.c.getClass();
            NotificationChannel g2 = en9.g("ru.oneme.app.new.activeCalls");
            dn9 a2 = en9.a();
            if (g2 == null) {
                en9.e(a2);
            } else if (!(g2.getSound() == null && !g2.shouldVibrate() && g2.getAudioAttributes() == null && g2.getImportance() == 2)) {
                en9.i().deleteNotificationChannel("ru.oneme.app.new.activeCalls");
                en9.e(a2);
            }
            udd.p("o7a", "recreateActiveCallChannelIfNeeded: created = $created", new Object[0]);
        } catch (Throwable th) {
            udd.s("o7a", "recreateActiveCallChannelIfNeeded", th);
        }
    }
}
