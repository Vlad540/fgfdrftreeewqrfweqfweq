package defpackage;

import android.content.Intent;
import android.net.Uri;

/* renamed from: jfa  reason: default package */
public final class jfa extends sg9 {
    public final Intent b;
    public final Uri c;

    public jfa(Intent intent, Uri uri) {
        super(jue.a);
        this.b = intent;
        this.c = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jfa)) {
            return false;
        }
        jfa jfa = (jfa) obj;
        return hhd.f(this.b, jfa.b) && hhd.f(this.c, jfa.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenFile(intent=" + this.b + ", uri=" + this.c + ")";
    }
}
