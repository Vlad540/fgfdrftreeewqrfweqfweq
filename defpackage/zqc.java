package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;

/* renamed from: zqc  reason: default package */
public final class zqc extends FrameLayout implements mhe {
    public final void onThemeChanged(pda pda) {
        View childAt = getChildAt(0);
        ProgressBar progressBar = childAt instanceof ProgressBar ? (ProgressBar) childAt : null;
        if (progressBar != null) {
            js.E(progressBar, pda.getIcon().h);
        }
    }
}
