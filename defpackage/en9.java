package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import java.util.HashSet;
import java.util.List;

/* renamed from: en9  reason: default package */
public final class en9 {
    public final Context a;
    public final h7a b;
    public final o54 c;
    public final b4a d;
    public final g2b e;
    public NotificationManager f;

    public en9(Context context, h7a h7a, o54 o54, b4a b4a, g2b g2b) {
        this.a = context;
        this.b = h7a;
        this.c = o54;
        this.d = b4a;
        this.e = g2b;
    }

    public final dn9 a() {
        this.c.getClass();
        return new dn9("ru.oneme.app.new.activeCalls", this.a.getString(avb.tt_notif_category_active_calls), false, false, (Uri) null, false, (long[]) null, false, 2, false);
    }

    public final dn9 b() {
        j2b j2b = (j2b) this.e;
        boolean z = !j2b.c.v("app.notification.chats.ringtone").equals("_NONE_");
        Uri h = h(false);
        this.c.getClass();
        return new dn9("ru.oneme.app.chats", this.a.getString(avb.tt_notif_category_chats), z, j2b.c.g.getBoolean("app.notification.chats.vibrate", true), h, j2b.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final dn9 c() {
        j2b j2b = (j2b) this.e;
        boolean z = !j2b.c.v("app.notification.ringtone").equals("_NONE_");
        Uri h = h(true);
        this.c.getClass();
        return new dn9("ru.oneme.app.dialogs", this.a.getString(avb.tt_notif_category_dialogs), z, j2b.c.c("app.notification.vibrate", true), h, j2b.c.g.getBoolean("app.notification.important.priority", true), (long[]) null, false, -1000, true);
    }

    public final dn9 d() {
        this.b.getClass();
        this.c.getClass();
        return new dn9("ru.oneme.app.inapp.2", this.a.getString(avb.tt_notif_category_inapp), true, ((j2b) this.e).c.g.getBoolean("app.notification.in.app.vibrate", true), (Uri) null, false, new long[]{0, 100}, false, -1000, true);
    }

    public final void e(dn9 dn9) {
        StringBuilder sb = new StringBuilder("createChannel: ");
        String str = dn9.a;
        sb.append(str);
        udd.q("en9", sb.toString());
        int i = dn9.c ? dn9.f ? 4 : 3 : 2;
        int i2 = 5;
        if (dn9.h) {
            i = 5;
        }
        int i3 = dn9.i;
        if (i3 != -1000) {
            i = i3;
        }
        NotificationChannel notificationChannel = new NotificationChannel(str, dn9.b, i);
        Uri uri = dn9.e;
        if (uri != null) {
            this.c.getClass();
            boolean equals = str.equals("ru.oneme.app.new.incomingCalls.");
            AudioAttributes.Builder contentType = new AudioAttributes.Builder().setContentType(4);
            if (equals) {
                i2 = 6;
            }
            notificationChannel.setSound(uri, contentType.setUsage(i2).build());
        } else {
            notificationChannel.setSound((Uri) null, (AudioAttributes) null);
        }
        notificationChannel.enableVibration(dn9.d);
        long[] jArr = dn9.g;
        if (jArr != null && jArr.length > 0) {
            notificationChannel.setVibrationPattern(jArr);
        }
        notificationChannel.enableLights(true);
        this.b.d();
        notificationChannel.setLightColor(-16745729);
        String b2 = this.d.b(str);
        if (b2 != null) {
            notificationChannel.setGroup(b2);
        }
        notificationChannel.setShowBadge(dn9.j);
        i().createNotificationChannel(notificationChannel);
    }

    public final void f() {
        b4a b4a = this.d;
        List<NotificationChannelGroup> notificationChannelGroups = ((NotificationManager) b4a.e.getValue()).getNotificationChannelGroups();
        if (notificationChannelGroups != null) {
            bs bsVar = new bs(0);
            for (NotificationChannelGroup id : notificationChannelGroups) {
                bsVar.add(id.getId());
            }
            if (!bsVar.contains("ru.oneme.app.notifications.group.chats")) {
                b4a.a(whc.z, "ru.oneme.app.notifications.group.chats");
            }
            if (!bsVar.contains("ru.oneme.app.notifications.group.other")) {
                b4a.a(whc.A, "ru.oneme.app.notifications.group.other");
            }
            if (!bsVar.contains("ru.oneme.app.notifications.group.calls")) {
                b4a.a(whc.y, "ru.oneme.app.notifications.group.calls");
            }
        }
        List<NotificationChannel> notificationChannels = i().getNotificationChannels();
        HashSet hashSet = new HashSet();
        for (NotificationChannel id2 : notificationChannels) {
            hashSet.add(id2.getId());
        }
        this.c.getClass();
        if (!hashSet.contains("ru.oneme.app.chats")) {
            e(b());
            hashSet.add("ru.oneme.app.chats");
        }
        if (!hashSet.contains("ru.oneme.app.dialogs")) {
            e(c());
            hashSet.add("ru.oneme.app.dialogs");
        }
        boolean contains = hashSet.contains("ru.oneme.app.misc");
        g2b g2b = this.e;
        Context context = this.a;
        if (!contains) {
            j2b j2b = (j2b) g2b;
            e(new dn9("ru.oneme.app.misc", context.getString(avb.tt_notif_category_misc), !j2b.c.v("app.notification.ringtone").equals("_NONE_"), j2b.c.c("app.notification.vibrate", true), h(true), false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.misc");
        }
        if (!hashSet.contains("ru.oneme.app.inapp.2")) {
            e(d());
            hashSet.add("ru.oneme.app.inapp.2");
        }
        if (!hashSet.contains("ru.oneme.app.fileUpload")) {
            e(new dn9("ru.oneme.app.fileUpload", context.getString(avb.tt_notif_category_file_loading), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.fileUpload");
        }
        if (!hashSet.contains("ru.oneme.app.media")) {
            e(new dn9("ru.oneme.app.media", context.getString(avb.tt_notif_category_media), true, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.media");
        }
        if (hashSet.contains("ru.oneme.app.incomingCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.incomingCalls");
            } catch (Throwable unused) {
            }
        }
        if (hashSet.contains("ru.oneme.app.activeCalls")) {
            try {
                i().deleteNotificationChannel("ru.oneme.app.activeCalls");
            } catch (Throwable unused2) {
            }
        }
        if (!hashSet.contains("ru.oneme.app.new.incomingCalls.")) {
            e(new dn9("ru.oneme.app.new.incomingCalls.", context.getString(avb.tt_notif_category_incoming_calls), false, ((j2b) g2b).c.c("app.notification.vibrate", true), (Uri) null, true, (long[]) null, true, -1000, false));
            hashSet.add("ru.oneme.app.new.incomingCalls.");
        }
        if (!hashSet.contains("ru.oneme.app.new.activeCalls")) {
            e(a());
            hashSet.add("ru.oneme.app.new.activeCalls");
        }
        if (!hashSet.contains("ru.oneme.app.liveLocation")) {
            e(new dn9("ru.oneme.app.liveLocation", context.getString(avb.tt_notif_category_live_location), false, false, (Uri) null, false, (long[]) null, false, -1000, false));
            hashSet.add("ru.oneme.app.liveLocation");
        }
    }

    public final NotificationChannel g(String str) {
        if (r1g.p(str)) {
            return null;
        }
        for (NotificationChannel next : i().getNotificationChannels()) {
            if (str.equals(next.getId())) {
                return next;
            }
        }
        return null;
    }

    public final Uri h(boolean z) {
        j2b j2b = (j2b) this.e;
        String v = z ? j2b.c.v("app.notification.ringtone") : j2b.c.v("app.notification.chats.ringtone");
        if (!"DEFAULT".equals(v)) {
            return Uri.parse(v);
        }
        this.b.getClass();
        return Settings.System.DEFAULT_NOTIFICATION_URI;
    }

    public final NotificationManager i() {
        if (this.f == null) {
            this.f = (NotificationManager) this.a.getSystemService("notification");
        }
        return this.f;
    }
}
