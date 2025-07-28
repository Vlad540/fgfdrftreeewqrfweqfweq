package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: id2  reason: default package */
public final class id2 extends qd2 {
    public final Intent b;
    public final Uri c;

    public id2(Intent intent, Uri uri) {
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof id2)) {
            return false;
        }
        id2 id2 = (id2) obj;
        return hhd.f(this.b, id2.b) && hhd.f(this.c, id2.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
