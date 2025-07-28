package defpackage;

import android.app.Notification;

/* renamed from: hu5  reason: default package */
public final class hu5 {
    public final int a;
    public final int b;
    public final Notification c;

    public hu5(int i, Notification notification, int i2) {
        this.a = i;
        this.c = notification;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hu5.class != obj.getClass()) {
            return false;
        }
        hu5 hu5 = (hu5) obj;
        if (this.a == hu5.a && this.b == hu5.b) {
            return this.c.equals(hu5.c);
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a * 31) + this.b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.a + ", mForegroundServiceType=" + this.b + ", mNotification=" + this.c + '}';
    }
}
