package defpackage;

import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: aj9  reason: default package */
public final class aj9 extends CoordinatorLayout {
    /* JADX WARNING: type inference failed for: r3v0, types: [aj9, android.view.ViewGroup] */
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
