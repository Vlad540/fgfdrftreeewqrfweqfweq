package defpackage;

import android.view.View;

/* renamed from: vq4  reason: default package */
public final class vq4 extends bm3 {
    public final /* synthetic */ int x0;

    public /* synthetic */ vq4(int i) {
        this.x0 = i;
    }

    public final void G(Object obj, float f) {
        switch (this.x0) {
            case 0:
                ((View) obj).setAlpha(f);
                return;
            case 1:
                ((View) obj).setTranslationX(f);
                return;
            case 2:
                ((View) obj).setTranslationY(f);
                return;
            case 3:
                ((View) obj).setScaleX(f);
                return;
            case 4:
                ((View) obj).setScaleY(f);
                return;
            case 5:
                ((View) obj).setRotation(f);
                return;
            case 6:
                ((View) obj).setRotationX(f);
                return;
            default:
                ((View) obj).setRotationY(f);
                return;
        }
    }

    public final float o(Object obj) {
        switch (this.x0) {
            case 0:
                return ((View) obj).getAlpha();
            case 1:
                return ((View) obj).getTranslationX();
            case 2:
                return ((View) obj).getTranslationY();
            case 3:
                return ((View) obj).getScaleX();
            case 4:
                return ((View) obj).getScaleY();
            case 5:
                return ((View) obj).getRotation();
            case 6:
                return ((View) obj).getRotationX();
            default:
                return ((View) obj).getRotationY();
        }
    }
}
