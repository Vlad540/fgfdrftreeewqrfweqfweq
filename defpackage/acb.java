package defpackage;

/* renamed from: acb  reason: default package */
public final class acb extends mcb {
    public final CharSequence a;

    public acb(CharSequence charSequence) {
        this.a = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof acb) && hhd.f(this.a, ((acb) obj).a);
    }

    public final long getItemId() {
        return (long) 32768;
    }

    public final int hashCode() {
        CharSequence charSequence = this.a;
        if (charSequence == null) {
            return 0;
        }
        return charSequence.hashCode();
    }

    public final int l() {
        return 32768;
    }

    public final String toString() {
        return "ChannelLinkItem(link=" + this.a + ")";
    }
}
