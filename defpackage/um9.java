package defpackage;

import java.util.Objects;

/* renamed from: um9  reason: default package */
public final class um9 {
    public static final um9 b = new um9((Object) null);
    public final Object a;

    public um9(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof um9) {
            return Objects.equals(this.a, ((um9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (obj instanceof yo9) {
            return "OnErrorNotification[" + ((yo9) obj).a + "]";
        }
        return "OnNextNotification[" + obj + "]";
    }
}
