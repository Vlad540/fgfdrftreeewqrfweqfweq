package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.os.Build;
import android.support.v4.media.session.MediaSessionCompat;
import android.widget.RemoteViews;

/* renamed from: ao9  reason: default package */
public final class ao9 extends io9 {
    public int[] e;
    public MediaSessionCompat.Token f;

    public final void b(b0d b0d) {
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = (Notification.Builder) b0d.c;
        if (i >= 34) {
            in9.d(builder, in9.b(on9.a(in9.a(), (CharSequence) null, 0, (PendingIntent) null, Boolean.FALSE), this.e, this.f));
        } else {
            in9.d(builder, in9.b(in9.a(), this.e, this.f));
        }
    }

    public final RemoteViews h() {
        return null;
    }

    public final RemoteViews i() {
        return null;
    }
}
