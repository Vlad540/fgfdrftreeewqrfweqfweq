package defpackage;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: z74  reason: default package */
public final class z74 implements hf6, if6 {
    public final jib a;
    public final Context b;
    public final jib c;
    public final Set d;
    public final Executor e;

    public z74(Context context, String str, Set set, jib jib, Executor executor) {
        this.a = new k83(context, 1, str);
        this.d = set;
        this.e = executor;
        this.c = jib;
        this.b = context;
    }

    public final n6g a() {
        return dze.a(this.b) ^ true ? gwf.o(BuildConfig.FLAVOR) : gwf.c(new y74(this, 0), this.e);
    }

    public final void b() {
        if (this.d.size() <= 0) {
            gwf.o((Object) null);
        } else if (!dze.a(this.b)) {
            gwf.o((Object) null);
        } else {
            gwf.c(new y74(this, 1), this.e);
        }
    }
}
