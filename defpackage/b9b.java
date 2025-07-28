package defpackage;

import android.content.Intent;

/* renamed from: b9b  reason: default package */
public final class b9b extends t81 {
    public final Intent b;

    public b9b(Intent intent) {
        super(9);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b9b) && hhd.f(this.b, ((b9b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SelectPhotoFromCamera(intent=" + this.b + ")";
    }
}
