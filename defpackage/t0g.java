package defpackage;

import android.app.PendingIntent;

/* renamed from: t0g  reason: default package */
public final class t0g extends bdc {
    public final PendingIntent a;
    public final boolean b;

    public t0g(PendingIntent pendingIntent, boolean z) {
        if (pendingIntent != null) {
            this.a = pendingIntent;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null pendingIntent");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bdc) {
            bdc bdc = (bdc) obj;
            return this.a.equals(((t0g) bdc).a) && this.b == ((t0g) bdc).b;
        }
    }

    public final int hashCode() {
        return (true != this.b ? 1237 : 1231) ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return hr1.j(hr1.m("ReviewInfo{pendingIntent=", this.a.toString(), ", isNoOp="), this.b, "}");
    }
}
