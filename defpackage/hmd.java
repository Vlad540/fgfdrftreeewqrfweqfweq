package defpackage;

import java.util.List;

/* renamed from: hmd  reason: default package */
public final class hmd {
    public final List a;
    public final ws7 b;
    public final bga c;

    public hmd(List list, ws7 ws7, bga bga) {
        this.a = list;
        this.b = ws7;
        this.c = bga;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hmd)) {
            return false;
        }
        hmd hmd = (hmd) obj;
        return hhd.f(this.a, hmd.a) && hhd.f(this.b, hmd.b) && hhd.f(this.c, hmd.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = 0;
        ws7 ws7 = this.b;
        int hashCode2 = (hashCode + (ws7 == null ? 0 : ws7.hashCode())) * 31;
        bga bga = this.c;
        if (bga != null) {
            i = bga.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "SpeakerModeState(opponentsPages=" + this.a + ", mainOpponentState=" + this.b + ", opponentPipState=" + this.c + ")";
    }
}
