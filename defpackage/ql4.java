package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.List;

/* renamed from: ql4  reason: default package */
public final class ql4 implements kl4 {
    public final Context a;
    public final ml4 b;
    public final boolean c;
    public final Class d;
    public rl4 e;

    public ql4(Context context, ml4 ml4, boolean z, Class cls) {
        this.a = context;
        this.b = ml4;
        this.c = z;
        this.d = cls;
        ml4.e.add(this);
    }

    public final void a(ml4 ml4) {
        rl4 rl4 = this.e;
        if (rl4 != null) {
            rl4.a(rl4, ml4.l);
        }
    }

    public final void b() {
        boolean z = this.b.k;
    }

    public final void c() {
        rl4 rl4 = this.e;
        if (rl4 != null) {
            rl4.c();
        }
    }

    public final void d(ml4 ml4, boolean z) {
        if (!z && !ml4.i) {
            rl4 rl4 = this.e;
            if (rl4 == null || rl4.w0) {
                List list = ml4.l;
                for (int i = 0; i < list.size(); i++) {
                    if (((zj4) list.get(i)).b == 0) {
                        g();
                        return;
                    }
                }
            }
        }
    }

    public final void e(zj4 zj4, Exception exc) {
        rl4 rl4 = this.e;
        if (rl4 != null) {
            rl4.getClass();
        }
        rl4 rl42 = this.e;
        if ((rl42 == null || rl42.w0) && rl4.b(zj4.b)) {
            ez3.j0("DownloadService wasn't running. Restarting.");
            g();
        }
    }

    public final void f(ml4 ml4, zj4 zj4) {
        rl4 rl4 = this.e;
        if (rl4 != null) {
            rl4.getClass();
        }
    }

    public final void g() {
        boolean z = this.c;
        Class cls = this.d;
        Context context = this.a;
        if (z) {
            try {
                Intent action = new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.RESTART");
                if (oze.a >= 26) {
                    context.startForegroundService(action);
                } else {
                    context.startService(action);
                }
            } catch (IllegalStateException unused) {
                ez3.j0("Failed to restart (foreground launch restriction)");
            }
        } else {
            try {
                context.startService(new Intent(context, cls).setAction("androidx.media3.exoplayer.downloadService.action.INIT"));
            } catch (IllegalStateException unused2) {
                ez3.j0("Failed to restart (process is idle)");
            }
        }
    }
}
