package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: lfa  reason: default package */
public final class lfa extends nfa {
    public final Intent a;
    public final Uri b;

    public lfa(Intent intent, Uri uri) {
        this.a = intent;
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lfa)) {
            return false;
        }
        lfa lfa = (lfa) obj;
        return hhd.f(this.a, lfa.a) && hhd.f(this.b, lfa.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.a + ", uri=" + this.b + ")";
    }
}
