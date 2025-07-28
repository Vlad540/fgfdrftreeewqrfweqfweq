package ru.ok.tamtam.photoeditor.view.colorselector;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ColorSelectorView extends RecyclerView {
    public final d33 Z1;
    public final int a2 = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.tamtam.photoeditor.view.colorselector.ColorSelectorView, android.view.View, androidx.recyclerview.widget.RecyclerView] */
    public ColorSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, dwb.ColorSelectorView);
        this.a2 = obtainStyledAttributes.getInt(dwb.ColorSelectorView_color_selector_orientation, 0);
        obtainStyledAttributes.recycle();
        getContext();
        int i = this.a2;
        setLayoutManager(new LinearLayoutManager(i == 0 ? 0 : 1, i == 0 ? true : z));
        d33 d33 = new d33(getContext(), this.a2);
        this.Z1 = d33;
        setAdapter(d33);
    }

    public void setColors(int[] iArr) {
        d33 d33 = this.Z1;
        d33.X = iArr;
        d33.m();
    }

    public void setListener(f33 f33) {
        this.Z1.y0 = f33;
    }
}
