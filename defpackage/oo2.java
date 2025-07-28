package defpackage;

import android.content.Intent;

/* renamed from: oo2  reason: default package */
public final class oo2 extends t81 {
    public final Intent b;

    public oo2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oo2) && hhd.f(this.b, ((oo2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "PickPhotoFromCamera(data=" + this.b + ")";
    }
}
