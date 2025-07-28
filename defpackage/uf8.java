package defpackage;

import android.app.Notification;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;

/* renamed from: uf8  reason: default package */
public final class uf8 extends io9 {
    public final kc8 e;
    public int[] f;

    public uf8(kc8 kc8) {
        this.e = kc8;
    }

    public final void b(b0d b0d) {
        if (oze.a >= 21) {
            Notification.MediaStyle a = tf8.a();
            int[] iArr = this.f;
            kc8 kc8 = this.e;
            Notification.MediaStyle b = tf8.b(a, iArr, kc8);
            Notification.Builder builder = (Notification.Builder) b0d.c;
            tf8.c(builder, b);
            Bundle bundle = new Bundle();
            bundle.putBundle("androidx.media3.session", kc8.a.j.b());
            builder.addExtras(bundle);
        }
    }

    public final RemoteViews h() {
        if (oze.a >= 21) {
            return null;
        }
        int min = Math.min(((un9) this.b).b.size(), 5);
        RemoteViews c = c(min <= 3 ? srb.media3_notification_template_big_media_narrow : srb.media3_notification_template_big_media);
        c.removeAllViews(fob.media_actions);
        if (min > 0) {
            for (int i = 0; i < min; i++) {
                c.addView(fob.media_actions, p((gn9) ((un9) this.b).b.get(i)));
            }
        }
        c.setViewVisibility(fob.cancel_action, 8);
        return c;
    }

    public final RemoteViews i() {
        if (oze.a >= 21) {
            return null;
        }
        RemoteViews c = c(srb.media3_notification_template_media);
        int size = ((un9) this.b).b.size();
        int[] iArr = this.f;
        if (iArr != null) {
            int min = Math.min(iArr.length, 3);
            c.removeAllViews(fob.media_actions);
            if (min > 0) {
                int i = 0;
                while (i < min) {
                    if (i < size) {
                        c.addView(fob.media_actions, p((gn9) ((un9) this.b).b.get(iArr[i])));
                        i++;
                    } else {
                        throw new IllegalArgumentException(String.format("setShowActionsInCompactView: action %d out of bounds (max %d)", new Object[]{Integer.valueOf(i), Integer.valueOf(size - 1)}));
                    }
                }
            }
        }
        c.setViewVisibility(fob.end_padder, 0);
        c.setViewVisibility(fob.cancel_action, 8);
        return c;
    }

    public final RemoteViews p(gn9 gn9) {
        boolean z = gn9.j == null;
        RemoteViews remoteViews = new RemoteViews(((un9) this.b).a.getPackageName(), srb.media3_notification_media_action);
        IconCompat a = gn9.a();
        if (a != null) {
            remoteViews.setImageViewResource(fob.action0, a.e());
        }
        if (!z) {
            remoteViews.setOnClickPendingIntent(fob.action0, gn9.j);
        }
        remoteViews.setContentDescription(fob.action0, gn9.i);
        return remoteViews;
    }

    public final void q(int... iArr) {
        this.f = iArr;
    }
}
