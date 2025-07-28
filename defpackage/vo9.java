package defpackage;

import java.util.Map;

/* renamed from: vo9  reason: default package */
public final class vo9 {
    public final Map a;
    public final kp9 b;
    public final int c;
    public final int d;
    public final String e;
    public final boolean f;
    public final String g;

    public vo9(Map map, kp9 kp9, int i, int i2, String str, boolean z, String str2) {
        this.a = map;
        this.b = kp9;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo9)) {
            return false;
        }
        vo9 vo9 = (vo9) obj;
        return hhd.f(this.a, vo9.a) && hhd.f(this.b, vo9.b) && this.c == vo9.c && this.d == vo9.d && hhd.f(this.e, vo9.e) && this.f == vo9.f && hhd.f(this.g, vo9.g);
    }

    public final int hashCode() {
        int f2 = th2.f(me4.d(c3d.d(this.d, c3d.d(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31, this.e), 31, this.f);
        String str = this.g;
        return f2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotificationData(notificationsMap=");
        sb.append(this.a);
        sb.append(", notificationSettings=");
        sb.append(this.b);
        sb.append(", totalUnreadMessagesCount=");
        sb.append(this.c);
        sb.append(", notificationId=");
        sb.append(this.d);
        sb.append(", groupSummaryKey=");
        sb.append(this.e);
        sb.append(", checkCount=");
        sb.append(this.f);
        sb.append(", tag=");
        return wn6.l(sb, this.g, ")");
    }
}
