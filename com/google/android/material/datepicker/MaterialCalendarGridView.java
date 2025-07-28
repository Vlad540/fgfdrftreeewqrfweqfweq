package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Calendar;

final class MaterialCalendarGridView extends GridView {
    public final boolean a;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        jze.d((Calendar) null);
        if (MaterialDatePicker.o1(getContext(), 16843277)) {
            setNextFocusLeftId(lob.cancel_button);
            setNextFocusRightId(lob.confirm_button);
        }
        this.a = MaterialDatePicker.o1(getContext(), wlb.nestedScrollable);
        eaf.j(this, new cw7(2));
    }

    public final f69 a() {
        return (f69) super.getAdapter();
    }

    public final Adapter getAdapter() {
        return (f69) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((f69) super.getAdapter()).notifyDataSetChanged();
    }

    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        f69 f69 = (f69) super.getAdapter();
        f69.getClass();
        int max = Math.max(f69.a(), getFirstVisiblePosition());
        int min = Math.min(f69.c(), getLastVisiblePosition());
        f69.getItem(max);
        f69.getItem(min);
        throw null;
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        if (!z) {
            super.onFocusChanged(false, i, rect);
        } else if (i == 33) {
            setSelection(((f69) super.getAdapter()).c());
        } else if (i == 130) {
            setSelection(((f69) super.getAdapter()).a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((f69) super.getAdapter()).a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((f69) super.getAdapter()).a());
        return true;
    }

    public final void onMeasure(int i, int i2) {
        if (this.a) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, Integer.MIN_VALUE));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setSelection(int i) {
        if (i < ((f69) super.getAdapter()).a()) {
            super.setSelection(((f69) super.getAdapter()).a());
        } else {
            super.setSelection(i);
        }
    }

    /* renamed from: getAdapter  reason: collision with other method in class */
    public final ListAdapter m14getAdapter() {
        return (f69) super.getAdapter();
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof f69) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), f69.class.getCanonicalName()}));
    }
}
