package defpackage;

import android.content.Context;
import android.provider.Settings;
import java.util.WeakHashMap;

/* renamed from: kp  reason: default package */
public final class kp extends qpc {
    public static int[] m;
    public final WeakHashMap l = new WeakHashMap(1);

    public kp(Context context, we5 we5) {
        super(context, we5);
    }

    public final boolean s() {
        return this.g.getBoolean("app.messages.enable.animations", true);
    }

    public final int t() {
        return u()[3];
    }

    public final int[] u() {
        if (m == null) {
            Context context = this.f;
            m = new int[]{context.getResources().getColor(imb.led_1), context.getResources().getColor(imb.led_2), context.getResources().getColor(imb.led_3), context.getResources().getColor(imb.led_4), context.getResources().getColor(imb.led_5), context.getResources().getColor(imb.led_6), context.getResources().getColor(imb.led_7)};
        }
        return m;
    }

    public final String v(String str) {
        x97 x97 = this.g;
        String string = x97.getString(str, "DEFAULT");
        if (!string.equals("DEFAULT") && !string.equals("_NONE_")) {
            if (x97.getBoolean("app.oldSounds", false)) {
                this.f.getResources();
                throw null;
            } else if (string.equals(Settings.System.DEFAULT_NOTIFICATION_URI.toString())) {
                return "DEFAULT";
            }
        }
        return string;
    }

    public final void w(gze gze) {
        udd.p("kp", "updateUserSettings, settings = %s", new Object[]{gze});
        Long l2 = gze.b;
        if (l2 != null) {
            k("app.notification.dontDisturbUntil", l2);
        }
        Boolean bool = gze.a;
        if (bool != null) {
            i("app.notification.show.new.users", bool.booleanValue());
        }
        int i = 2;
        String str = gze.c;
        if (str != null) {
            int i2 = !str.equals("OFF") ? !str.equals("REPLY") ? 0 : 2 : 1;
            j(i2, "app.notification.dialogs.show");
            this.j.c(Integer.valueOf(i2));
        }
        String str2 = gze.d;
        if (str2 != null) {
            if (str2.equals("OFF")) {
                i = 1;
            } else if (!str2.equals("REPLY")) {
                i = 0;
            }
            r(i);
        }
        String str3 = gze.e;
        if (str3 != null) {
            l("app.notification.ringtone", str3);
        }
        String str4 = gze.f;
        if (str4 != null) {
            l("app.notification.dialogs.ringtone", str4);
        }
        String str5 = gze.g;
        if (str5 != null) {
            l("app.notification.chats.ringtone", str5);
        }
        Integer num = gze.i;
        if (num != null) {
            j(h2g.o(num.intValue()), "app.notification.led.color");
        }
        Boolean bool2 = gze.h;
        if (bool2 != null) {
            i("app.privacy.online.show", !bool2.booleanValue());
        }
        Integer num2 = gze.j;
        if (num2 != null) {
            j(h2g.o(num2.intValue()), "app.notification.dialogs.led.color");
        }
        Integer num3 = gze.k;
        if (num3 != null) {
            j(h2g.o(num3.intValue()), "app.notification.chats.led.color");
        }
        Boolean bool3 = gze.l;
        if (bool3 != null) {
            i("app.notification.vibrate", bool3.booleanValue());
        }
        Boolean bool4 = gze.m;
        if (bool4 != null) {
            i("app.notification.dialogs.vibrate", bool4.booleanValue());
        }
        Boolean bool5 = gze.n;
        if (bool5 != null) {
            i("app.notification.chats.vibrate", bool5.booleanValue());
        }
        int i3 = gze.p;
        if (i3 != 0) {
            l("app.privacy.incoming.call", sxe.k(i3));
        }
        int i4 = gze.o;
        if (i4 != 0) {
            l("app.privacy.chats.invite", sxe.k(i4));
        }
        fze fze = gze.q;
        if (fze != null) {
            l("app.privacy.inactive.ttl", fze.a);
        }
        int i5 = gze.r;
        if (i5 != 0) {
            l("app.group.chat.call.notification.status", sxe.j(i5));
        }
        int i6 = gze.s;
        if (i6 != 0) {
            l("app.suggest.stickers.status", sxe.l(i6));
        }
        Boolean bool6 = gze.t;
        if (bool6 != null) {
            i("audio.transcription.enabled", bool6.booleanValue());
        }
        Boolean bool7 = gze.u;
        if (bool7 != null) {
            i("app.privacy.safe_mode", bool7.booleanValue());
        }
        int i7 = gze.v;
        if (i7 != 0) {
            l("app.privacy.search_by_phone", sxe.k(i7));
        }
    }
}
