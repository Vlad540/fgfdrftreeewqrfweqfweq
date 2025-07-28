package defpackage;

import android.os.Bundle;
import java.util.Set;

/* renamed from: r63  reason: default package */
public final class r63 extends qid {
    public static final r63 b = new qid();

    public final h34 c() {
        return new h34(new hk2(17), new hk2(18));
    }

    public final i34 d(Bundle bundle) {
        return new q63(x87.E0("chat_id", bundle), 0);
    }

    public final void e(pid pid) {
        g34.a(pid, ":complaint", new String[]{"chat_id"}, (Set) null, 0, 14);
    }
}
