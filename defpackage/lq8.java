package defpackage;

import android.text.Layout;

/* renamed from: lq8  reason: default package */
public final class lq8 implements mq8 {
    public final long a;
    public final Layout b;
    public final Layout c;

    public lq8(long j, Layout layout, Layout layout2) {
        this.a = j;
        this.b = layout;
        this.c = layout2;
    }

    public final Layout a() {
        return this.b;
    }

    public final Layout b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq8)) {
            return false;
        }
        lq8 lq8 = (lq8) obj;
        return this.a == lq8.a && hhd.f(this.b, lq8.b) && hhd.f(this.c, lq8.c);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Long.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "User(senderId=" + this.a + ", bodyLayout=" + this.b + ", forwardedTitleLayout=" + this.c + ")";
    }
}
