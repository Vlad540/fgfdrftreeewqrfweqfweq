package defpackage;

import android.animation.Animator;
import android.app.Activity;
import android.view.Window;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* renamed from: tf2  reason: default package */
public final class tf2 implements Animator.AnimatorListener {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ float d;

    public tf2(float f, ChatMediaViewerScreen chatMediaViewerScreen, boolean z) {
        this.d = f;
        this.b = chatMediaViewerScreen;
        this.c = z;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    /* JADX WARNING: type inference failed for: r3v6, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void onAnimationEnd(Animator animator) {
        Window window;
        sf8 sf8;
        switch (this.a) {
            case 0:
                if (this.d == 0.0f) {
                    k77[] k77Arr = ChatMediaViewerScreen.O0;
                    ? r3 = (ChatMediaViewerScreen) this.b;
                    r3.A0().setVisibility(8);
                    r3.y0().setVisibility(8);
                    if (this.c && (sf8 = r3.E0) != null) {
                        sf8.c(false);
                    }
                    Activity activity = r3.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        window.setNavigationBarColor(0);
                    }
                    r3.v0(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [one.me.chatmedia.viewer.ChatMediaViewerScreen, rr3] */
    public final void onAnimationStart(Animator animator) {
        Window window;
        sf8 sf8;
        int i = 0;
        boolean z = this.c;
        Object obj = this.b;
        float f = this.d;
        switch (this.a) {
            case 0:
                return;
            case 1:
                k77[] k77Arr = ChatMediaViewerScreen.O0;
                ? r1 = (ChatMediaViewerScreen) obj;
                if (r1.A0().getVisibility() != 0) {
                    r1.A0().setVisibility(0);
                }
                if (r1.y0().getVisibility() != 0) {
                    r1.y0().setVisibility(0);
                }
                if (z && (sf8 = r1.E0) != null) {
                    sf8.c(true);
                }
                if (f == 1.0f) {
                    Activity activity = r1.getActivity();
                    if (!(activity == null || (window = activity.getWindow()) == null)) {
                        window.setNavigationBarColor(-15263716);
                    }
                    r1.v0(true);
                    return;
                }
                return;
            default:
                pea pea = (pea) obj;
                pea.setAlpha(f);
                if (!z) {
                    i = 8;
                }
                pea.setVisibility(i);
                return;
        }
    }

    public tf2(pea pea, float f, boolean z) {
        this.b = pea;
        this.d = f;
        this.c = z;
    }

    public tf2(ChatMediaViewerScreen chatMediaViewerScreen, boolean z, float f) {
        this.b = chatMediaViewerScreen;
        this.c = z;
        this.d = f;
    }
}
