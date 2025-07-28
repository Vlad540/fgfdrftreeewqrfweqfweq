package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* renamed from: ax9  reason: default package */
public final class ax9 implements OnBackAnimationCallback {
    public final /* synthetic */ u16 a;
    public final /* synthetic */ u16 b;
    public final /* synthetic */ s16 c;
    public final /* synthetic */ s16 d;

    public ax9(u16 u16, u16 u162, s16 s16, s16 s162) {
        this.a = u16;
        this.b = u162;
        this.c = s16;
        this.d = s162;
    }

    public final void onBackCancelled() {
        this.d.invoke();
    }

    public final void onBackInvoked() {
        this.c.invoke();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        this.b.invoke(new gd0(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        this.a.invoke(new gd0(backEvent));
    }
}
