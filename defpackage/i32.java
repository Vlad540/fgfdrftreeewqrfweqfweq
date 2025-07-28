package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.TamAlertDialogLayout;
import com.google.android.material.chip.Chip;

/* renamed from: i32  reason: default package */
public final class i32 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;

    public /* synthetic */ i32(View view, int i) {
        this.a = i;
        this.b = view;
    }

    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                if (outline != null) {
                    j32 j32 = (j32) this.b;
                    outline.setRoundRect(0, 0, j32.getWidth(), j32.getHeight(), dh4.c().getDisplayMetrics().density * 12.0f);
                    return;
                }
                return;
            case 1:
                ex2 ex2 = ((Chip) this.b).w0;
                if (ex2 != null) {
                    ex2.getOutline(outline);
                    return;
                } else {
                    outline.setAlpha(0.0f);
                    return;
                }
            case 2:
                e33 e33 = this.b;
                outline.setOval(0, 0, e33.getWidth(), e33.getHeight());
                return;
            case 3:
                if (outline != null) {
                    vq3 vq3 = this.b;
                    outline.setRoundRect(vq3.getLeft(), vq3.getTop(), vq3.getRight(), vq3.getBottom(), vq3.a);
                    return;
                }
                return;
            case 4:
                if (outline != null) {
                    ImageView imageView = (ImageView) this.b;
                    outline.setOval(0, 0, imageView.getWidth(), imageView.getHeight());
                    return;
                }
                return;
            case 5:
                if (outline != null) {
                    TamAlertDialogLayout tamAlertDialogLayout = (TamAlertDialogLayout) this.b;
                    outline.setRoundRect(tamAlertDialogLayout.getLeft(), tamAlertDialogLayout.getTop(), tamAlertDialogLayout.getRight(), tamAlertDialogLayout.getBottom(), dh4.c().getDisplayMetrics().density * 16.0f);
                    return;
                }
                return;
            case 6:
                xp6 xp6 = this.b;
                outline.setOval(new Rect(0, 0, xp6.getMeasuredWidth(), xp6.getMeasuredHeight()));
                return;
            default:
                if (outline != null) {
                    k3b k3b = (k3b) this.b;
                    outline.setOval(0, 0, k3b.getMeasuredWidth(), k3b.getMeasuredHeight());
                    return;
                }
                return;
        }
    }
}
