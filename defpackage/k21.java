package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: k21  reason: default package */
public final class k21 {
    public final Conversation a;
    public final ete b;
    public final boolean c;
    public final boolean d;

    public k21(Conversation conversation, ete ete, boolean z, boolean z2) {
        this.a = conversation;
        this.b = ete;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k21)) {
            return false;
        }
        k21 k21 = (k21) obj;
        return hhd.f(this.a, k21.a) && hhd.f(this.b, k21.b) && this.c == k21.c && this.d == k21.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + th2.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Result(conversation=" + this.a + ", callTarget=" + this.b + ", isNewCall=" + this.c + ", isIncoming=" + this.d + ")";
    }
}
