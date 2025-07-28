package defpackage;

import java.io.Serializable;
import java.util.Objects;

/* renamed from: yo9  reason: default package */
public final class yo9 implements Serializable {
    public final Throwable a;

    public yo9(Throwable th) {
        this.a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yo9) {
            return Objects.equals(this.a, ((yo9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.a + "]";
    }
}
