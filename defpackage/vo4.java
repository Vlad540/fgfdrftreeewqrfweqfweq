package defpackage;

import android.widget.AbsListView;

/* renamed from: vo4  reason: default package */
public abstract class vo4 {
    public static boolean a(AbsListView absListView) {
        return absListView.isSelectedChildViewEnabled();
    }

    public static void b(AbsListView absListView, boolean z) {
        absListView.setSelectedChildViewEnabled(z);
    }
}
