package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ewd  reason: default package */
public final class ewd extends ViewGroup implements mhe {
    public final gwd a;
    public final RecyclerView b;

    public ewd(Context context) {
        super(context, (AttributeSet) null);
        gwd gwd = new gwd(context);
        this.a = gwd;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(gaa.f);
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setOverScrollMode(2);
        int X = a24.X(((float) 4) * dh4.c().getDisplayMetrics().density);
        a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        recyclerView.j(new vi2(X, X, 5));
        recyclerView.setHasFixedSize(true);
        this.b = recyclerView;
        setClipChildren(false);
        addView(gwd);
        addView(recyclerView);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        gwd gwd = this.a;
        gwd gwd2 = this.a;
        xy6.z(paddingStart, paddingTop, gwd.getMeasuredWidth() + paddingStart, gwd2.getMeasuredHeight() + paddingTop, gwd, this);
        RecyclerView recyclerView = this.b;
        xy6.z(0, gwd2.getBottom(), getMeasuredWidth(), recyclerView.getMeasuredHeight() + gwd2.getBottom(), recyclerView, this);
    }

    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        gwd gwd = this.a;
        gwd.measure(i, i2);
        RecyclerView recyclerView = this.b;
        recyclerView.measure(i, i2);
        setMeasuredDimension(size, recyclerView.getMeasuredHeight() + gwd.getMeasuredHeight());
    }

    public final void onThemeChanged(pda pda) {
        this.a.onThemeChanged(pda);
    }

    public final void setHeaderClickAction(s16 s16) {
        a24.a0(this.a.getHeaderButton(), new q6(27, s16));
    }
}
