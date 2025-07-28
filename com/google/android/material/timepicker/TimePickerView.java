package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int L0 = 0;
    public final Chip K0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        e eVar = new e(this);
        LayoutInflater.from(context).inflate(wrb.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(lob.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(lob.material_clock_period_toggle)).c.add(new d(this));
        Chip chip = (Chip) findViewById(lob.material_minute_tv);
        Chip chip2 = (Chip) findViewById(lob.material_hour_tv);
        this.K0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(lob.material_clock_hand);
        r85 r85 = new r85(2, new GestureDetector(getContext(), new f(this)));
        chip.setOnTouchListener(r85);
        chip2.setOnTouchListener(r85);
        chip.setTag(lob.selection_type, 12);
        chip2.setTag(lob.selection_type, 10);
        chip.setOnClickListener(eVar);
        chip2.setOnClickListener(eVar);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.K0.sendAccessibilityEvent(8);
        }
    }
}
