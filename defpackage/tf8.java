package defpackage;

import android.app.Notification;
import android.media.session.MediaSession;

/* renamed from: tf8  reason: default package */
public abstract class tf8 {
    public static Notification.MediaStyle a() {
        return new Notification.MediaStyle();
    }

    public static Notification.MediaStyle b(Notification.MediaStyle mediaStyle, int[] iArr, kc8 kc8) {
        mediaStyle.getClass();
        kc8.getClass();
        if (iArr != null) {
            d(mediaStyle, iArr);
        }
        mediaStyle.setMediaSession((MediaSession.Token) kc8.a.h.j.a.c.b);
        return mediaStyle;
    }

    public static void c(Notification.Builder builder, Notification.MediaStyle mediaStyle) {
        builder.setStyle(mediaStyle);
    }

    public static void d(Notification.MediaStyle mediaStyle, int... iArr) {
        mediaStyle.setShowActionsInCompactView(iArr);
    }
}
