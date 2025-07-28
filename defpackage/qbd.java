package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: qbd  reason: default package */
public final class qbd extends qid {
    public static final qbd b = new qid();

    public final h34 c() {
        h34 h34 = h34.c;
        return h34.c;
    }

    public final i34 d(Bundle bundle) {
        long E0 = x87.E0("msg_id", bundle);
        long E02 = x87.E0("attach_id", bundle);
        String G0 = x87.G0("local_attach_id", bundle);
        int D0 = x87.D0("cause_ordinal", bundle);
        String string = bundle.getString("snack_bot_margin");
        return new pbd(E0, E02, G0, D0, string != null ? Integer.valueOf(Integer.parseInt(string)) : null, x87.s0("force_dark", bundle));
    }

    public final void e(pid pid) {
        g34.a(pid, ":dialogs/share-media", new String[]{"msg_id", "attach_id", "local_attach_id", "cause_ordinal"}, (Set) null, 0, 14);
    }
}
