package defpackage;

/* renamed from: ld7  reason: default package */
public final class ld7 extends md7 {
    public final long a;
    public final Long b;
    public final Long c;
    public final gn3 d;
    public final zc6 e;
    public final s2f f;
    public final Long g;
    public final String h;

    public ld7(long j, Long l, Long l2, gn3 gn3, zc6 zc6, s2f s2f, Long l3, String str) {
        this.a = j;
        this.b = l;
        this.c = l2;
        this.d = gn3;
        this.e = zc6;
        this.f = s2f;
        this.g = l3;
        this.h = str;
    }

    public final long a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld7)) {
            return false;
        }
        ld7 ld7 = (ld7) obj;
        return this.a == ld7.a && hhd.f(this.b, ld7.b) && hhd.f(this.c, ld7.c) && hhd.f(this.d, ld7.d) && hhd.f(this.e, ld7.e) && hhd.f(this.f, ld7.f) && hhd.f(this.g, ld7.g) && hhd.f(this.h, ld7.h);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        int i = 0;
        Long l = this.b;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        gn3 gn3 = this.d;
        int hashCode4 = (hashCode3 + (gn3 == null ? 0 : gn3.hashCode())) * 31;
        zc6 zc6 = this.e;
        int hashCode5 = (hashCode4 + (zc6 == null ? 0 : zc6.hashCode())) * 31;
        s2f s2f = this.f;
        int hashCode6 = (hashCode5 + (s2f == null ? 0 : s2f.hashCode())) * 31;
        Long l3 = this.g;
        int hashCode7 = (hashCode6 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.h;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        return "SuccessLinkInfo(requestId=" + this.a + ", chatId=" + this.b + ", messageId=" + this.c + ", contactSearchResult=" + this.d + ", groupChatInfo=" + this.e + ", videoConference=" + this.f + ", stickerSetId=" + this.g + ", startPayload=" + this.h + ")";
    }
}
