package defpackage;

import java.util.List;

/* renamed from: tra  reason: default package */
public final class tra {
    public final String a;
    public final List b;

    public tra(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tra)) {
            return false;
        }
        tra tra = (tra) obj;
        return hhd.f(this.a, tra.a) && hhd.f(this.b, tra.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "SearchState(query=" + this.a + ", chats=" + this.b + ")";
    }
}
