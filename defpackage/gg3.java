package defpackage;

import android.animation.Animator;
import android.view.View;
import one.me.profile.screens.avatars.ContactAvatarsScreen;

/* renamed from: gg3  reason: default package */
public final class gg3 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ContactAvatarsScreen b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gg3(ContactAvatarsScreen contactAvatarsScreen, boolean z, int i) {
        this.a = i;
        this.b = contactAvatarsScreen;
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

    public final void onAnimationCancel(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationEnd(Animator animator) {
        int i = 8;
        boolean z = this.c;
        ContactAvatarsScreen contactAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ContactAvatarsScreen.D0;
                View x0 = contactAvatarsScreen.x0();
                if (z) {
                    i = 0;
                }
                x0.setVisibility(i);
                return;
            default:
                k77[] k77Arr2 = ContactAvatarsScreen.D0;
                nea y0 = contactAvatarsScreen.y0();
                if (z) {
                    i = 0;
                }
                y0.setVisibility(i);
                if (!z) {
                    contactAvatarsScreen.v0(false);
                    return;
                }
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    public final void onAnimationStart(Animator animator) {
        ContactAvatarsScreen contactAvatarsScreen = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ContactAvatarsScreen.D0;
                contactAvatarsScreen.x0().setVisibility(0);
                return;
            default:
                k77[] k77Arr2 = ContactAvatarsScreen.D0;
                contactAvatarsScreen.y0().setVisibility(0);
                if (this.c) {
                    contactAvatarsScreen.v0(true);
                    return;
                }
                return;
        }
    }
}
