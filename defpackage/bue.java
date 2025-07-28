package defpackage;

/* renamed from: bue  reason: default package */
public final class bue {
    public final CharSequence a;
    public final CharSequence b;
    public final y11 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public bue(CharSequence charSequence, String str, y11 y11, boolean z, boolean z2, boolean z3) {
        this.a = charSequence;
        this.b = str;
        this.c = y11;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bue)) {
            return false;
        }
        bue bue = (bue) obj;
        return hhd.f(this.a, bue.a) && hhd.f(this.b, bue.b) && hhd.f(this.c, bue.c) && this.d == bue.d && this.e == bue.e && this.f == bue.f;
    }

    public final int hashCode() {
        int i = 0;
        CharSequence charSequence = this.a;
        int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
        CharSequence charSequence2 = this.b;
        int hashCode2 = (hashCode + (charSequence2 == null ? 0 : charSequence2.hashCode())) * 31;
        y11 y11 = this.c;
        if (y11 != null) {
            i = y11.hashCode();
        }
        return Boolean.hashCode(this.f) + th2.f(th2.f((hashCode2 + i) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        return "UnavailableCallState(callDescription=" + this.a + ", callStateStatus=" + this.b + ", chatInfo=" + this.c + ", isCallBackAvailable=" + this.d + ", isVideoCall=" + this.e + ", isPrivacyReason=" + this.f + ")";
    }
}
