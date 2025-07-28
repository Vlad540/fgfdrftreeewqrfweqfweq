package defpackage;

/* renamed from: bq5  reason: default package */
public final class bq5 extends dq5 {
    public final CharSequence a;
    public final boolean b;

    public bq5(CharSequence charSequence, boolean z) {
        this.a = charSequence;
        this.b = z;
    }

    public final CharSequence a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bq5)) {
            return false;
        }
        bq5 bq5 = (bq5) obj;
        return hhd.f(this.a, bq5.a) && this.b == bq5.b;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        return Boolean.hashCode(this.b) + ((charSequence == null ? 0 : charSequence.hashCode()) * 31);
    }

    public final String toString() {
        return "Creation(name=" + this.a + ", isCreateButtonEnabled=" + this.b + ")";
    }

    public /* synthetic */ bq5() {
        this((CharSequence) null, false);
    }
}
