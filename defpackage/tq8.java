package defpackage;

import android.text.Layout;

/* renamed from: tq8  reason: default package */
public final class tq8 {
    public final long a;
    public final long b;
    public final Layout c;
    public final qq8 d;
    public final mq8 e;

    public tq8(long j, long j2, Layout layout, qq8 qq8, mq8 mq8) {
        this.a = j;
        this.b = j2;
        this.c = layout;
        this.d = qq8;
        this.e = mq8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq8)) {
            return false;
        }
        tq8 tq8 = (tq8) obj;
        return this.a == tq8.a && this.b == tq8.b && hhd.f(this.c, tq8.c) && hhd.f(this.d, tq8.d) && hhd.f(this.e, tq8.e);
    }

    public final int hashCode() {
        int m = sxe.m(Long.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        Layout layout = this.c;
        int hashCode = (m + (layout == null ? 0 : layout.hashCode())) * 31;
        qq8 qq8 = this.d;
        int hashCode2 = (hashCode + (qq8 == null ? 0 : qq8.hashCode())) * 31;
        mq8 mq8 = this.e;
        if (mq8 != null) {
            i = mq8.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "MessageLink(messageId=" + this.a + ", messageLinkId=" + this.b + ", senderLayout=" + this.c + ", replyModel=" + this.d + ", forwardModel=" + this.e + ")";
    }
}
