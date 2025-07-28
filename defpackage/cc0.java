package defpackage;

import android.content.Intent;

/* renamed from: cc0  reason: default package */
public final class cc0 implements ec0 {
    public final Intent a;

    public cc0(Intent intent) {
        this.a = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cc0) && hhd.f(this.a, ((cc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CameraScreenIntentReady(intent=" + this.a + ")";
    }
}
