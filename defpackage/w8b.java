package defpackage;

import android.content.Intent;

/* renamed from: w8b  reason: default package */
public final class w8b extends t81 {
    public final Intent b;

    public w8b(Intent intent) {
        super(9);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w8b) && hhd.f(this.b, ((w8b) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
