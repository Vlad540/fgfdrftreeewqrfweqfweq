package ru.ok.messages.views.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class RecyclerAutofitGridView extends ty4 {
    public int n2;
    public int o2;
    public int p2;

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ty4, ru.ok.messages.views.widgets.RecyclerAutofitGridView] */
    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (2 == getContext().getResources().getConfiguration().orientation) {
            this.p2 = 8;
        } else {
            this.p2 = 4;
        }
        getContext();
        setLayoutManager(new GridLayoutManager(this.p2));
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, androidx.recyclerview.widget.RecyclerView, ru.ok.messages.views.widgets.RecyclerAutofitGridView] */
    public final void onMeasure(int i, int i2) {
        RecyclerAutofitGridView.super.onMeasure(i, i2);
        GridLayoutManager layoutManager = getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && this.n2 > 0) {
            int max = Math.max(2, getMeasuredWidth() / this.n2);
            int i3 = this.p2;
            if (max > i3) {
                max = i3;
            }
            layoutManager.A1(max);
        }
        if ((layoutManager instanceof StaggeredGridLayoutManager) && this.o2 > 0) {
            int max2 = Math.max(2, getMeasuredWidth() / this.o2);
            int i4 = this.p2;
            if (max2 > i4) {
                max2 = i4;
            }
            ((StaggeredGridLayoutManager) layoutManager).m1(max2);
        }
    }

    public void setColumnWidth(int i) {
        this.n2 = i;
        requestLayout();
    }

    public void setMaxColumns(int i) {
        this.p2 = i;
    }

    public void setStaggeredColumnWidth(int i) {
        this.o2 = i;
        requestLayout();
    }
}
