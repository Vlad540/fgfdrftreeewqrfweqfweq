package defpackage;

import android.os.Parcelable;

/* renamed from: ofa  reason: default package */
public final class ofa extends sg9 {
    public final Parcelable b;
    public final String c;

    public ofa(nr8 nr8, String str) {
        super(jue.a);
        this.b = nr8;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofa)) {
            return false;
        }
        ofa ofa = (ofa) obj;
        return hhd.f(this.b, ofa.b) && hhd.f(this.c, ofa.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OpenImageLegacy(message=" + this.b + ", attachLocalId=" + this.c + ")";
    }
}
