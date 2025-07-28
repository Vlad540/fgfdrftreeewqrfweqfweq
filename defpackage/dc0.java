package defpackage;

import android.content.Intent;

/* renamed from: dc0  reason: default package */
public final class dc0 implements ec0 {
    public final Intent a;

    public dc0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dc0) && hhd.f(this.a, ((dc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CropAvatarScreenIntentReady(intent=" + this.a + ")";
    }
}
