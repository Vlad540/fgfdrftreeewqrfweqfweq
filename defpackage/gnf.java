package defpackage;

/* renamed from: gnf  reason: default package */
public final class gnf {
    public static final fnf Companion = new Object();
    public final boolean a;

    public /* synthetic */ gnf(int i, boolean z) {
        if (1 == (i & 1)) {
            this.a = z;
        } else {
            bm3.I(i, 1, enf.a.d());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnf) && this.a == ((gnf) obj).a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return hr1.j(new StringBuilder("WebAppSetupClosingBehaviorRequest(needConfirmation="), this.a, ")");
    }
}
