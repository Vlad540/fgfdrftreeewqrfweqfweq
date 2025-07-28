package defpackage;

import android.graphics.Bitmap;
import java.util.List;

/* renamed from: si2  reason: default package */
public final class si2 {
    public final long a;
    public final String b;
    public final long c;
    public final String d;
    public final ti2 e;
    public final List f;
    public final List g;
    public final Bitmap h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final long l;
    public final long m;
    public final String n;
    public final long o;

    public si2(long j2, String str, long j3, String str2, ti2 ti2, List list, List list2, Bitmap bitmap, int i2, boolean z, boolean z2, long j4, long j5, String str3, long j6) {
        this.a = j2;
        this.b = str;
        this.c = j3;
        this.d = str2;
        this.e = ti2;
        this.f = list;
        this.g = list2;
        this.h = bitmap;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = j4;
        this.m = j5;
        this.n = str3;
        this.o = j6;
    }

    public static si2 a(si2 si2, List list, List list2, boolean z, int i2) {
        si2 si22 = si2;
        int i3 = i2;
        long j2 = si22.a;
        String str = si22.b;
        long j3 = si22.c;
        String str2 = si22.d;
        ti2 ti2 = si22.e;
        List list3 = (i3 & 32) != 0 ? si22.f : list;
        List list4 = (i3 & 64) != 0 ? si22.g : list2;
        Bitmap bitmap = si22.h;
        int i4 = (i3 & 256) != 0 ? si22.i : 0;
        boolean z2 = (i3 & 512) != 0 ? si22.j : z;
        boolean z3 = si22.k;
        long j4 = si22.l;
        long j5 = si22.m;
        String str3 = si22.n;
        long j6 = j5;
        long j7 = si22.o;
        si2.getClass();
        return new si2(j2, str, j3, str2, ti2, list3, list4, bitmap, i4, z2, z3, j4, j6, str3, j7);
    }

    public final boolean b() {
        hr8 hr8 = (hr8) o23.f0(this.f);
        return hr8 != null && hr8.n;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si2)) {
            return false;
        }
        si2 si2 = (si2) obj;
        return this.a == si2.a && hhd.f(this.b, si2.b) && this.c == si2.c && hhd.f(this.d, si2.d) && this.e == si2.e && hhd.f(this.f, si2.f) && hhd.f(this.g, si2.g) && hhd.f(this.h, si2.h) && this.i == si2.i && this.j == si2.j && this.k == si2.k && this.l == si2.l && this.m == si2.m && hhd.f(this.n, si2.n) && this.o == si2.o;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i2 = 0;
        String str = this.b;
        int f2 = c3d.f(this.g, c3d.f(this.f, (this.e.hashCode() + me4.d(sxe.m((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d)) * 31, 31), 31);
        Bitmap bitmap = this.h;
        int m2 = sxe.m(sxe.m(th2.f(th2.f(c3d.d(this.i, (f2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
        String str2 = this.n;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return Long.hashCode(this.o) + ((m2 + i2) * 31);
    }

    public final String toString() {
        return "ChatNotification(pushId=" + this.a + ", eventKey=" + this.b + ", chatServerId=" + this.c + "', chatNotificationType=" + this.e + ", displayMessages=" + o23.c0(this.f, ",", "[", "]", new hd1(17), 24) + ", droppedMessages=" + this.g.size() + ", totalUnreadMessagesCount=" + this.i + ", needNotify=" + this.j + ", showNotificationText=" + this.k + ", lastMessageId=" + this.l + ", lastMessageDate=" + this.m + ", pushType=" + this.n + ", createdTime=" + this.o + ", isScheduled=" + b() + ")";
    }
}
