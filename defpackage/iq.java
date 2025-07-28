package defpackage;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: iq  reason: default package */
public final class iq extends l6c {
    public final /* synthetic */ int a;

    public /* synthetic */ iq(int i) {
        this.a = i;
    }

    public final void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        int R;
        switch (this.a) {
            case 0:
                recyclerView.getClass();
                int R2 = RecyclerView.R(view);
                f6c adapter = recyclerView.getAdapter();
                tp0 tp0 = null;
                Integer valueOf = adapter != null ? Integer.valueOf(adapter.j()) : null;
                if (R2 != -1 && valueOf != null) {
                    view.setClipToOutline(true);
                    if (R2 == 0) {
                        tp0 = new tp0(1, dh4.c().getDisplayMetrics().density * 16.0f);
                    } else if (R2 == valueOf.intValue() - 1) {
                        tp0 = new tp0(0, dh4.c().getDisplayMetrics().density * 16.0f);
                    }
                    view.setOutlineProvider(tp0);
                    return;
                }
                return;
            case 1:
                float f = (float) 4;
                rect.top = a24.X(dh4.c().getDisplayMetrics().density * f);
                rect.bottom = a24.X(f * dh4.c().getDisplayMetrics().density);
                return;
            case 2:
                recyclerView.getClass();
                int R3 = RecyclerView.R(view);
                if (xy6.w(view)) {
                    rect.right = a24.X((R3 == 0 ? (float) 16 : (float) 8) * dh4.c().getDisplayMetrics().density);
                    return;
                } else {
                    rect.left = a24.X((R3 == 0 ? (float) 16 : (float) 8) * dh4.c().getDisplayMetrics().density);
                    return;
                }
            case 3:
                b7c T = recyclerView.T(view);
                if (T != null) {
                    int i = T.Y;
                    if (i == f2a.a || i == f2a.b || i == f2a.u || i == f2a.v) {
                        float f2 = (float) 6;
                        rect.set(a24.X(dh4.c().getDisplayMetrics().density * f2), 0, a24.X(f2 * dh4.c().getDisplayMetrics().density), 0);
                        return;
                    }
                    return;
                }
                return;
            case 4:
                recyclerView.getClass();
                int R4 = RecyclerView.R(view);
                rect.set((R4 == -1 || R4 == 0) ? 0 : a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density), rect.right, 0);
                return;
            case 5:
                super.f(rect, view, recyclerView, x6c);
                f6c adapter2 = recyclerView.getAdapter();
                if (adapter2 != null && (R = RecyclerView.R(view)) > 0) {
                    int l = adapter2.l(R);
                    if ((l == p2a.m || l == p2a.s) && adapter2.l(R - 1) == u5a.c) {
                        rect.top = a24.X(((float) 10) * dh4.c().getDisplayMetrics().density);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                recyclerView.getClass();
                int R5 = RecyclerView.R(view);
                f6c adapter3 = recyclerView.getAdapter();
                Integer valueOf2 = adapter3 != null ? Integer.valueOf(adapter3.j()) : null;
                if (R5 != -1 && valueOf2 != null) {
                    int i2 = 0;
                    rect.top = R5 == 0 ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : 0;
                    float f3 = (float) 12;
                    rect.left = a24.X(dh4.c().getDisplayMetrics().density * f3);
                    rect.right = a24.X(f3 * dh4.c().getDisplayMetrics().density);
                    if (R5 == valueOf2.intValue() - 1) {
                        i2 = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                    }
                    rect.bottom = i2;
                    return;
                }
                return;
            case 7:
                recyclerView.getClass();
                int R6 = RecyclerView.R(view);
                f6c adapter4 = recyclerView.getAdapter();
                Integer valueOf3 = adapter4 != null ? Integer.valueOf(adapter4.j()) : null;
                if (R6 != -1 && valueOf3 != null) {
                    rect.top = R6 == 0 ? a24.X(((float) 16) * dh4.c().getDisplayMetrics().density) : 0;
                    return;
                }
                return;
            case 8:
                f6c adapter5 = recyclerView.getAdapter();
                if (adapter5 != null) {
                    if (RecyclerView.R(view) != adapter5.j() - 1) {
                    }
                    rect.left = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                    rect.top = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                    rect.right = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
                    rect.bottom = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                    return;
                }
                return;
            case 9:
                recyclerView.getClass();
                if (RecyclerView.R(view) != -1 && (view instanceof OneMeButton)) {
                    rect.set(rect.left, a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
            default:
                recyclerView.getClass();
                int R7 = RecyclerView.R(view);
                if (R7 != -1 && R7 != 0 && (view instanceof AppCompatTextView)) {
                    rect.set(rect.left, a24.X(((float) 12) * dh4.c().getDisplayMetrics().density), rect.right, rect.bottom);
                    return;
                }
                return;
        }
    }
}
