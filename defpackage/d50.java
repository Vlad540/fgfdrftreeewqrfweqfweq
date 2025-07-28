package defpackage;

import android.animation.Animator;
import android.view.View;

/* renamed from: d50  reason: default package */
public final class d50 implements Animator.AnimatorListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d50(View view, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = view;
        this.c = obj;
        this.d = obj2;
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 0:
                ((e50) this.b).E0 = false;
                s16 s16 = (s16) this.d;
                if (s16 != null) {
                    s16.invoke();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [e50, android.view.View] */
    public final void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 0:
                ? r2 = (e50) this.b;
                r2.E0 = false;
                r2.setVisibility(8);
                r2.C0 = null;
                s16 s16 = (s16) this.c;
                if (s16 != null) {
                    s16.invoke();
                    return;
                }
                return;
            default:
                ((zoc) this.b).y0.put((toc) this.c, (Object) null);
                return;
        }
    }

    public final void onAnimationRepeat(Animator animator) {
        int i = this.a;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [e50, android.view.View] */
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                ((e50) this.b).setVisibility(0);
                return;
            default:
                View view = (View) this.d;
                view.setVisibility(0);
                if (view.getTranslationY() == 0.0f) {
                    view.setTranslationY(dh4.c().getDisplayMetrics().density * 4.0f);
                    return;
                }
                return;
        }
    }
}
