package defpackage;

/* renamed from: pm4  reason: default package */
public final class pm4 {
    public final em4 a;
    public final em4 b;

    public pm4(em4 em4, em4 em42) {
        this.a = em4;
        this.b = em42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm4)) {
            return false;
        }
        pm4 pm4 = (pm4) obj;
        return hhd.f(this.a, pm4.a) && hhd.f(this.b, pm4.b);
    }

    public final int hashCode() {
        int i = 0;
        em4 em4 = this.a;
        int hashCode = (em4 == null ? 0 : em4.hashCode()) * 31;
        em4 em42 = this.b;
        if (em42 != null) {
            i = em42.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        return "DraftsNews(chats=" + this.a + ", users=" + this.b + ")";
    }
}
