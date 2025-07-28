package defpackage;

import android.content.Intent;

/* renamed from: ko2  reason: default package */
public final class ko2 extends t81 {
    public final Intent b;

    public ko2(Intent intent) {
        super(1);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ko2) && hhd.f(this.b, ((ko2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropPhoto(data=" + this.b + ")";
    }
}
