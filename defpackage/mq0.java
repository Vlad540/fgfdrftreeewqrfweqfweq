package defpackage;

/* renamed from: mq0  reason: default package */
public abstract class mq0 {
    public final String a;

    public mq0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof mq0) {
                if (hhd.f(this.a, ((mq0) obj).a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
