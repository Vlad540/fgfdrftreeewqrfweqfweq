package defpackage;

import android.content.Intent;

/* renamed from: r8d  reason: default package */
public final class r8d extends t81 {
    public final Intent b;

    public r8d(Intent intent) {
        super(14);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r8d) && hhd.f(this.b, ((r8d) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
