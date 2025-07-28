package defpackage;

/* renamed from: k11  reason: default package */
public final class k11 {
    public static final k11 g = new k11((Long) null, (CharSequence) null, (String) null, (Long) null, (CharSequence) null, 62);
    public final Long a;
    public final CharSequence b;
    public final String c;
    public final Long d;
    public final CharSequence e;
    public final boolean f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k11(Long l, CharSequence charSequence, String str, Long l2, CharSequence charSequence2, int i) {
        this(l, (i & 2) != 0 ? null : charSequence, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? null : charSequence2, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k11)) {
            return false;
        }
        k11 k11 = (k11) obj;
        return hhd.f(this.a, k11.a) && hhd.f(this.b, k11.b) && hhd.f(this.c, k11.c) && hhd.f(this.d, k11.d) && hhd.f(this.e, k11.e) && this.f == k11.f;
    }

    public final int hashCode() {
        int i = 0;
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode4 = (hashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        CharSequence charSequence2 = this.e;
        if (charSequence2 != null) {
            i = charSequence2.hashCode();
        }
        return Boolean.hashCode(this.f) + ((hashCode4 + i) * 31);
    }

    public final String toString() {
        return "CallChatInfo(chatId=" + this.a + ", name=" + this.b + ", avatar=" + this.c + ", avatarColorId=" + this.d + ", avatarAbbreviation=" + this.e + ", isLinkCall=" + this.f + ")";
    }

    public k11(Long l, CharSequence charSequence, String str, Long l2, CharSequence charSequence2, boolean z) {
        this.a = l;
        this.b = charSequence;
        this.c = str;
        this.d = l2;
        this.e = charSequence2;
        this.f = z;
    }
}
