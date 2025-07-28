package defpackage;

/* renamed from: dt3  reason: default package */
public final class dt3 implements ct3 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dt3) && hhd.f(this.a, ((dt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wn6.i("ConversationIdProviderImpl(conversationId=", this.a, ")");
    }
}
