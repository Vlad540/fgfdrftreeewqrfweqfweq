package ru.ok.tamtam.stickers.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

public class RecyclerAutofitGridView extends RecyclerView {
    public final GridLayoutManager Z1;
    public int a2 = 5;
    public int b2;
    public View c2;
    public final jw4 d2 = new jw4(5, this);

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, java.lang.Object, ru.ok.tamtam.stickers.view.RecyclerAutofitGridView, androidx.recyclerview.widget.RecyclerView] */
    public RecyclerAutofitGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        getContext();
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.a2);
        this.Z1 = gridLayoutManager;
        setLayoutManager(gridLayoutManager);
    }

    public final void F0() {
        if (this.c2 != null) {
            f6c adapter = getAdapter();
            this.c2.setVisibility((adapter == null || adapter.j() <= 0) ? 0 : 8);
        }
    }

    public int getSpanCount() {
        return this.a2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.view.View, ru.ok.tamtam.stickers.view.RecyclerAutofitGridView, androidx.recyclerview.widget.RecyclerView] */
    public final void onMeasure(int i, int i2) {
        RecyclerAutofitGridView.super.onMeasure(i, i2);
        if (this.b2 > 0) {
            this.Z1.A1(Math.max(1, getMeasuredWidth() / this.b2));
        }
    }

    public void setAdapter(f6c f6c) {
        f6c adapter = getAdapter();
        jw4 jw4 = this.d2;
        if (adapter != null) {
            adapter.B(jw4);
        }
        RecyclerAutofitGridView.super.setAdapter(f6c);
        if (this.c2 != null) {
            if (f6c != null) {
                f6c.z(jw4);
            }
            F0();
        }
    }

    public void setColumnWidth(int i) {
        this.b2 = i;
        requestLayout();
    }

    public void setDefaultColumns(int i) {
        this.a2 = i;
        this.Z1.A1(i);
        setLayoutManager((a) null);
        setLayoutManager(this.Z1);
    }

    public void setEmptyView(View view) {
        this.c2 = view;
        f6c adapter = getAdapter();
        if (adapter != null) {
            adapter.z(this.d2);
        }
        F0();
    }

    public void setSpanSizeLookup(gc6 gc6) {
        this.Z1.K = gc6;
    }
}
