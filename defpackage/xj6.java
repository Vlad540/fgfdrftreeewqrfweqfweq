package defpackage;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;

/* renamed from: xj6  reason: default package */
public final class xj6 extends l6c {
    public final /* synthetic */ int a = 0;
    public final Object b;

    public xj6(hj2 hj2) {
        this.b = hj2;
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, x6c x6c) {
        switch (this.a) {
            case 2:
                xj6.super.f(rect, view, recyclerView, x6c);
                recyclerView.getClass();
                int R = RecyclerView.R(view);
                hj2 hj2 = (hj2) this.b;
                Character d = hj2.d(R);
                if (d != null) {
                    char charValue = d.charValue();
                    if (R > 0) {
                        Character d2 = hj2.d(R - 1);
                        if (d2 == null || charValue != d2.charValue()) {
                            rect.top = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                xj6.super.f(rect, view, recyclerView, x6c);
                return;
        }
    }

    public void g(Canvas canvas, RecyclerView recyclerView, x6c x6c) {
        switch (this.a) {
            case 1:
                if ((recyclerView.getAdapter() instanceof lvf) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                    lvf adapter = recyclerView.getAdapter();
                    GridLayoutManager layoutManager = recyclerView.getLayoutManager();
                    ((MaterialCalendar) this.b).getClass();
                    throw null;
                }
                return;
            default:
                return;
        }
    }

    public void h(Canvas canvas, RecyclerView recyclerView) {
        switch (this.a) {
            case 0:
                int paddingLeft = recyclerView.getPaddingLeft();
                int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                int childCount = recyclerView.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = recyclerView.getChildAt(i);
                    int bottom = childAt.getBottom() + childAt.getLayoutParams().bottomMargin;
                    Drawable drawable = (Drawable) this.b;
                    drawable.setBounds(paddingLeft, bottom, width, drawable.getIntrinsicHeight() + bottom);
                    drawable.draw(canvas);
                }
                return;
            default:
                return;
        }
    }

    public xj6(ColorDrawable colorDrawable) {
        this.b = colorDrawable.mutate();
    }

    public xj6(MaterialCalendar materialCalendar) {
        this.b = materialCalendar;
        jze.d((Calendar) null);
        jze.d((Calendar) null);
    }
}
