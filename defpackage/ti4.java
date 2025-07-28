package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: ti4  reason: default package */
public final class ti4 {
    public final ConversationVideoTrackParticipantKey a;
    public final int b;
    public final int c;

    public ti4(ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, int i, int i2) {
        this.a = conversationVideoTrackParticipantKey;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ti4)) {
            return false;
        }
        ti4 ti4 = (ti4) obj;
        return hhd.f(this.a, ti4.a) && this.b == ti4.b && this.c == ti4.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + c3d.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DisplayLayout(track=");
        sb.append(this.a);
        sb.append(", w=");
        sb.append(this.b);
        sb.append(", h=");
        return wn6.j(sb, this.c, ")");
    }
}
