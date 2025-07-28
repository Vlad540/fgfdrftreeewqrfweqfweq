package defpackage;

import java.io.Serializable;
import java.util.List;

/* renamed from: s2f  reason: default package */
public final class s2f implements Serializable {
    public final int X;
    public final long Y;
    public final List Z;
    public final uj3 a;
    public final String b;
    public final String c;
    public final String o;

    public s2f(pjc pjc) {
        this.a = (uj3) pjc.d;
        this.b = (String) pjc.e;
        this.o = (String) pjc.f;
        this.c = (String) pjc.g;
        this.X = pjc.b;
        this.Y = pjc.c;
        this.Z = (List) pjc.h;
    }

    public final String toString() {
        int p = ete.p(this.Z);
        return "VideoConference{owner=" + this.a + ", joinLink='" + this.b + "', conversationId='" + this.c + "', callName='" + this.o + "', participantsCount=" + this.X + ", startedAt=" + this.Y + ", previewParticipantIds=" + p + "}";
    }
}
