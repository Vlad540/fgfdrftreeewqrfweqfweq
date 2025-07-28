package defpackage;

/* renamed from: ju4  reason: default package */
public final class ju4 {
    public final String a;
    public final iu4 b;
    public final iu4 c;

    public ju4(String str, iu4 iu4, iu4 iu42) {
        this.a = str;
        this.b = iu4;
        this.c = iu42;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ju4)) {
            return false;
        }
        ju4 ju4 = (ju4) obj;
        return hhd.f(this.a, ju4.a) && hhd.f(this.b, ju4.b) && hhd.f(this.c, ju4.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        iu4 iu4 = this.b;
        int hashCode2 = (hashCode + (iu4 == null ? 0 : iu4.hashCode())) * 31;
        iu4 iu42 = this.c;
        if (iu42 != null) {
            i = iu42.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "EmojiLottie(emoji=" + this.a + ", emojiAnimation=" + this.b + ", reactionAnimation=" + this.c + ")";
    }
}
