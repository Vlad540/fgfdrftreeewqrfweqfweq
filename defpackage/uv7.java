package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: uv7  reason: default package */
public final class uv7 implements OnBackAnimationCallback {
    public final /* synthetic */ sv7 a;
    public final /* synthetic */ vv7 b;

    public uv7(vv7 vv7, sv7 sv7) {
        this.b = vv7;
        this.a = sv7;
    }

    public final void onBackCancelled() {
        if (this.b.a != null) {
            this.a.d();
        }
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.b(new gd0(backEvent));
        }
    }

    public final void onBackStarted(BackEvent backEvent) {
        if (this.b.a != null) {
            this.a.c(new gd0(backEvent));
        }
    }
}
