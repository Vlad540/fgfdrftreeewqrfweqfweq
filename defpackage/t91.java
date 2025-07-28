package defpackage;

/* renamed from: t91  reason: default package */
public final class t91 implements v91 {
    public final String a;

    public t91(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t91) && hhd.f(this.a, ((t91) obj).a);
    }

    public final boolean g(pg7 pg7) {
        return 9223372036854775805L == pg7.getItemId();
    }

    public final long getItemId() {
        return 9223372036854775805L;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final int l() {
        return 3;
    }

    public final String toString() {
        return wn6.l(new StringBuilder("CallShareLinkPreviewState(link="), this.a, ")");
    }
}
