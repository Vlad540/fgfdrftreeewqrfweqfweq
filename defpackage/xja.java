package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;

/* renamed from: xja  reason: default package */
public abstract class xja {
    public static final me1 a() {
        le1 le1 = le1.c;
        le1 le12 = le1;
        ParticipantId d = d(le1);
        k88 k88 = k88.a;
        hw4 hw4 = hw4.a;
        t8f t8f = r5;
        t8f t8f2 = new t8f(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(d).build(), false);
        t8f t8f3 = r5;
        t8f t8f4 = new t8f(false, new ConversationVideoTrackParticipantKey.Builder().setParticipantId(d).setType(w8f.b).build(), false);
        return new me1(le12, k88, k88, k88, false, false, t8f, t8f3, false, false, false, false, false, 0, true, false, false, false, false, false, hw4, 1);
    }

    public static final le1 b(ParticipantId participantId) {
        Integer G;
        int i = 0;
        List q0 = h0e.q0(participantId.id, new String[]{":"}, false, 6);
        if (q0.size() > 1 && (G = o0e.G((String) q0.get(1))) != null) {
            i = G.intValue();
        }
        return new le1(Long.parseLong((String) o23.V(q0)), i);
    }

    public static final ParticipantId c(long j) {
        return ParticipantId.authorized(String.valueOf(j));
    }

    public static final ParticipantId d(le1 le1) {
        return new ParticipantId(String.valueOf(le1.a), false, le1.b);
    }
}
