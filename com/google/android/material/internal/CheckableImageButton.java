package com.google.android.material.internal;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;

public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] y0 = {16842912};
    public boolean o;
    public boolean w0 = true;
    public boolean x0 = true;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ylb.imageButtonStyle);
        eaf.j(this, new cq0(1, this));
    }

    public final boolean isChecked() {
        return this.o;
    }

    public final int[] onCreateDrawableState(int i) {
        return this.o ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), y0) : super.onCreateDrawableState(i);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof sw2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        sw2 sw2 = (sw2) parcelable;
        super.onRestoreInstanceState(sw2.a);
        setChecked(sw2.c);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.Parcelable, z, sw2] */
    public final Parcelable onSaveInstanceState() {
        ? zVar = new z(super.onSaveInstanceState());
        zVar.c = this.o;
        return zVar;
    }

    public void setCheckable(boolean z) {
        if (this.w0 != z) {
            this.w0 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.w0 && this.o != z) {
            this.o = z;
            refreshDrawableState();
            sendAccessibilityEvent(2048);
        }
    }

    public void setPressable(boolean z) {
        this.x0 = z;
    }

    public void setPressed(boolean z) {
        if (this.x0) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.o);
    }
}
