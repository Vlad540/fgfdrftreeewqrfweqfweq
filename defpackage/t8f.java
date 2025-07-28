package defpackage;

import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: t8f  reason: default package */
public final class t8f {
    public final boolean a;
    public final ConversationVideoTrackParticipantKey b;
    public final boolean c;

    public t8f(boolean z, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey, boolean z2) {
        this.a = z;
        this.b = conversationVideoTrackParticipantKey;
        this.c = z2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        r5 = (defpackage.t8f) r5;
        r1 = r5.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof defpackage.t8f
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            t8f r5 = (defpackage.t8f) r5
            boolean r1 = r5.a
            boolean r3 = r4.a
            if (r3 == r1) goto L_0x0013
            return r2
        L_0x0013:
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r1 = r4.b
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r3 = r5.b
            boolean r1 = defpackage.hhd.f(r1, r3)
            if (r1 != 0) goto L_0x001e
            return r2
        L_0x001e:
            boolean r4 = r4.c
            boolean r5 = r5.c
            if (r4 == r5) goto L_0x0025
            return r2
        L_0x0025:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t8f.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return Boolean.hashCode(this.c) + ((hashCode + (Boolean.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoState(isEnabled=");
        sb.append(this.a);
        sb.append(", track=");
        sb.append(this.b);
        sb.append(", isSelf=");
        return hr1.j(sb, this.c, ")");
    }
}
