package defpackage;

import android.graphics.Rect;
import android.widget.PopupWindow;

/* renamed from: ug7  reason: default package */
public abstract class ug7 {
    public static void a(PopupWindow popupWindow, Rect rect) {
        popupWindow.setEpicenterBounds(rect);
    }

    public static void b(PopupWindow popupWindow, boolean z) {
        popupWindow.setIsClippedToScreen(z);
    }
}
