package defpackage;

import android.view.WindowInsets;

/* renamed from: bz1  reason: default package */
public final class bz1 extends az1 {
    /* JADX WARNING: type inference failed for: r3v0, types: [bz1, android.view.ViewGroup] */
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).dispatchApplyWindowInsets(windowInsets);
        }
        return windowInsets;
    }
}
