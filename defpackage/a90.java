package defpackage;

import android.content.Context;

/* renamed from: a90  reason: default package */
public final class a90 extends dw3 {
    public final Context a;
    public final eye b;
    public final eye c;
    public final String d;

    public a90(Context context, eye eye, eye eye2, String str) {
        if (context != null) {
            this.a = context;
            if (eye != null) {
                this.b = eye;
                if (eye2 != null) {
                    this.c = eye2;
                    if (str != null) {
                        this.d = str;
                        return;
                    }
                    throw new NullPointerException("Null backendName");
                }
                throw new NullPointerException("Null monotonicClock");
            }
            throw new NullPointerException("Null wallClock");
        }
        throw new NullPointerException("Null applicationContext");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dw3)) {
            return false;
        }
        dw3 dw3 = (dw3) obj;
        if (this.a.equals(((a90) dw3).a)) {
            a90 a90 = (a90) dw3;
            if (this.b.equals(a90.b) && this.c.equals(a90.c) && this.d.equals(a90.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return wn6.l(sb, this.d, "}");
    }
}
