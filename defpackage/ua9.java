package defpackage;

import java.util.Map;

/* renamed from: ua9  reason: default package */
public final class ua9 {
    public final CharSequence a;
    public final CharSequence b;
    public final Map c;

    public ua9(CharSequence charSequence, CharSequence charSequence2, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ua9)) {
            return false;
        }
        ua9 ua9 = (ua9) obj;
        return hhd.f(this.a, ua9.a) && hhd.f(this.b, ua9.b) && hhd.f(this.c, ua9.c);
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return this.c.hashCode() + me4.f(this.b, (charSequence == null ? 0 : charSequence.hashCode()) * 31, 31);
    }

    public final String toString() {
        return "MediaMetadata(artist=" + this.a + ", track=" + this.b + ", extras=" + this.c + ")";
    }
}
