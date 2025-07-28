package defpackage;

import java.io.Serializable;

/* renamed from: mcc  reason: default package */
public final class mcc implements Serializable {
    public final Object a;

    public /* synthetic */ mcc(Object obj) {
        this.a = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof kcc) {
            return ((kcc) obj).a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mcc)) {
            return false;
        }
        return hhd.f(this.a, ((mcc) obj).a);
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof kcc) {
            return obj.toString();
        }
        return "Success(" + obj + ')';
    }
}
