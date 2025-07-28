package defpackage;

import android.content.Intent;

/* renamed from: qdb  reason: default package */
public final class qdb extends t81 {
    public final Intent b;

    public qdb(Intent intent) {
        super(11);
        this.b = intent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qdb) && hhd.f(this.b, ((qdb) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "CropAvatar(intent=" + this.b + ")";
    }
}
