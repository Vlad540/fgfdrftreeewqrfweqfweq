package defpackage;

/* renamed from: y11  reason: default package */
public final class y11 {
    public final Long a;
    public final CharSequence b;
    public final mc0 c;
    public final oc0 d;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y11(Long l, CharSequence charSequence, mc0 mc0, int i) {
        this((i & 1) != 0 ? null : l, charSequence, mc0, (oc0) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y11)) {
            return false;
        }
        y11 y11 = (y11) obj;
        return hhd.f(this.a, y11.a) && hhd.f(this.b, y11.b) && hhd.f(this.c, y11.c) && hhd.f(this.d, y11.d);
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        mc0 mc0 = this.c;
        int hashCode3 = (hashCode2 + (mc0 == null ? 0 : mc0.hashCode())) * 31;
        oc0 oc0 = this.d;
        if (oc0 != null) {
            i = oc0.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        return "CallChatState(chatId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", overlay=" + this.d + ")";
    }

    public y11(Long l, CharSequence charSequence, mc0 mc0, oc0 oc0) {
        this.a = l;
        this.b = charSequence;
        this.c = mc0;
        this.d = oc0;
    }
}
