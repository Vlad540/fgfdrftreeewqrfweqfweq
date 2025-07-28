package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;
import me.leolin.shortcutbadger.ShortcutBadger;

/* renamed from: ue0  reason: default package */
public final class ue0 implements pp7 {
    public final Context a;
    public final bv2 b;
    public final xg0 c;
    public final ContextScope o;

    public ue0(Context context, bv2 bv2, xg0 xg0, pae pae, ku3 ku3) {
        this.a = context;
        this.b = bv2;
        this.c = xg0;
        this.o = n1g.a(((n3a) pae).a().limitedParallelism(1, "badge-count").plus(ku3));
    }

    public final void a() {
        ShortcutBadger.removeCount(this.a);
    }
}
