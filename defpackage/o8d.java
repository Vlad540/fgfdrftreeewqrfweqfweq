package defpackage;

import android.content.Intent;

/* renamed from: o8d  reason: default package */
public final class o8d extends t81 {
    public final Intent b;

    public o8d(Intent intent) {
        super(14);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8d) && hhd.f(this.b, ((o8d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
