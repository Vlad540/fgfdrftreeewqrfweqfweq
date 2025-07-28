package defpackage;

import java.util.function.UnaryOperator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* renamed from: ay0  reason: default package */
public final /* synthetic */ class ay0 implements UnaryOperator {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ py0 b;

    public /* synthetic */ ay0(boolean z, py0 py0) {
        this.a = z;
        this.b = py0;
    }

    public final Object apply(Object obj) {
        boolean z;
        bs bsVar = (bs) obj;
        bsVar.getClass();
        ur urVar = new ur(bsVar);
        while (true) {
            boolean hasNext = urVar.hasNext();
            z = this.a;
            if (!hasNext) {
                break;
            }
            ParticipantId c = xja.c(((Number) urVar.next()).longValue());
            py0 py0 = this.b;
            if (z) {
                Conversation a2 = py0.d().a();
                if (a2 != null) {
                    a2.promoteParticipant(c, true);
                }
            } else {
                Conversation a3 = py0.d().a();
                if (a3 != null) {
                    a3.removeParticipant(c);
                }
            }
        }
        return z ? bsVar : new bs(0);
    }
}
