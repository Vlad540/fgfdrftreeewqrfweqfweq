package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* renamed from: ae5  reason: default package */
public final class ae5 {
    public final Context a;
    public final o7a b;
    public final h7a c;
    public final o54 d;
    public final int e = avb.tt_notification_file_downloading_title;
    public final int f = avb.tt_worker_draft_sync;
    public final int g = avb.tt_worker_gif_upload;
    public final int h = avb.tt_worker_attach_upload;

    public ae5(Context context, o7a o7a, h7a h7a, o54 o54) {
        this.a = context;
        this.b = o7a;
        this.c = h7a;
        this.d = o54;
    }

    public final Notification a(String str, String str2, Long l, boolean z, int i, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        o7a o7a = this.b;
        o7a.c();
        this.d.getClass();
        un9 h2 = o7a.h("ru.oneme.app.fileUpload", true, true);
        h2.e = un9.c(str);
        h2.f = un9.c(str2);
        long longValue = l != null ? l.longValue() : 0;
        Notification notification = h2.F;
        notification.when = longValue;
        this.c.getClass();
        notification.icon = z ? zhc.o0 : zhc.k0;
        boolean z2 = i == -1;
        h2.o = 100;
        h2.p = i;
        h2.q = z2;
        h2.k = 0;
        h2.g(0);
        h2.p((Uri) null);
        h2.i(2, true);
        h2.i(16, false);
        h2.b.add(new gn9(0, this.a.getString(avb.tt_worker_cancel), pendingIntent2));
        h2.v = "progress";
        h2.g = pendingIntent;
        return h2.b();
    }

    public final Notification b(long j, Long l, Long l2, String str, String str2, int i, boolean z, PendingIntent pendingIntent) {
        Intent intent;
        int hashCode = Long.hashCode(j);
        long j2 = 0;
        int i2 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        o7a o7a = this.b;
        if (i2 == 0) {
            intent = o7a.f(false);
        } else {
            long longValue = l != null ? l.longValue() : 0;
            if (l2 != null) {
                j2 = l2.longValue();
            }
            o7a.getClass();
            sr7 sr7 = sr7.c;
            Long valueOf = Long.valueOf(longValue);
            Long valueOf2 = Long.valueOf(j2);
            sr7.getClass();
            intent = o7a.k(sr7.Z1(j, valueOf, valueOf2));
        }
        return a(str, str2, l, z, i, d8.p(this.a, hashCode, intent), pendingIntent);
    }
}
