package defpackage;

import android.text.Layout;

/* renamed from: kq8  reason: default package */
public final class kq8 implements mq8 {
    public final long a;
    public final String b;
    public final Layout c;
    public final Layout d;

    public kq8(long j, String str, Layout layout, Layout layout2) {
        this.a = j;
        this.b = str;
        this.c = layout;
        this.d = layout2;
    }

    public final Layout a() {
        return this.c;
    }

    public final Layout b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq8)) {
            return false;
        }
        kq8 kq8 = (kq8) obj;
        return this.a == kq8.a && hhd.f(this.b, kq8.b) && hhd.f(this.c, kq8.c) && hhd.f(this.d, kq8.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        return "Channel(chatId=" + this.a + ", channelLink=" + this.b + ", bodyLayout=" + this.c + ", forwardedTitleLayout=" + this.d + ")";
    }
}
