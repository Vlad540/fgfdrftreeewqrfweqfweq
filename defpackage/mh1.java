package defpackage;

/* renamed from: mh1  reason: default package */
public final class mh1 extends wh1 {
    public final CharSequence C;

    public mh1(CharSequence charSequence) {
        this.C = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mh1) && hhd.f(this.C, ((mh1) obj).C);
    }

    public final int hashCode() {
        return this.C.hashCode();
    }

    public final String toString() {
        return "RecordStart(name=" + this.C + ")";
    }
}
