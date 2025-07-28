package com.google.android.material.timepicker;

import android.content.res.ColorStateList;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class ClockFaceView extends cxb implements u03 {
    public final ClockHandView N0;
    public final Rect O0 = new Rect();
    public final RectF P0 = new RectF();
    public final Rect Q0 = new Rect();
    public final SparseArray R0;
    public final c S0;
    public final int[] T0;
    public final float[] U0;
    public final int V0;
    public final int W0;
    public final int X0;
    public final int Y0;
    public final String[] Z0;
    public float a1;
    public final ColorStateList b1;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ClockFaceView(android.content.Context r12, android.util.AttributeSet r13) {
        /*
            r11 = this;
            r0 = 12
            r1 = 1
            int r2 = defpackage.wlb.materialClockStyle
            r11.<init>(r12, r13, r2)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.O0 = r3
            android.graphics.RectF r3 = new android.graphics.RectF
            r3.<init>()
            r11.P0 = r3
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r11.Q0 = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r11.R0 = r3
            r4 = 3
            float[] r4 = new float[r4]
            r4 = {0, 1063675494, 1065353216} // fill-array
            r11.U0 = r4
            int[] r4 = defpackage.xvb.ClockFaceView
            int r5 = defpackage.kvb.Widget_MaterialComponents_TimePicker_Clock
            android.content.res.TypedArray r13 = r12.obtainStyledAttributes(r13, r4, r2, r5)
            android.content.res.Resources r2 = r11.getResources()
            int r4 = defpackage.xvb.ClockFaceView_clockNumberTextColor
            android.content.res.ColorStateList r4 = defpackage.wx3.i(r12, r13, r4)
            r11.b1 = r4
            android.view.LayoutInflater r5 = android.view.LayoutInflater.from(r12)
            int r6 = defpackage.wrb.material_clockface_view
            r5.inflate(r6, r11, r1)
            int r5 = defpackage.lob.material_clock_hand
            android.view.View r5 = r11.findViewById(r5)
            com.google.android.material.timepicker.ClockHandView r5 = (com.google.android.material.timepicker.ClockHandView) r5
            r11.N0 = r5
            int r6 = defpackage.vmb.material_clock_hand_padding
            int r6 = r2.getDimensionPixelSize(r6)
            r11.V0 = r6
            r6 = 16842913(0x10100a1, float:2.369401E-38)
            int[] r6 = new int[]{r6}
            int r7 = r4.getDefaultColor()
            int r6 = r4.getColorForState(r6, r7)
            int r4 = r4.getDefaultColor()
            int[] r4 = new int[]{r6, r6, r4}
            r11.T0 = r4
            java.util.ArrayList r4 = r5.c
            r4.add(r11)
            int r4 = defpackage.hmb.material_timepicker_clockface
            android.content.res.ColorStateList r4 = defpackage.d8.r(r12, r4)
            int r4 = r4.getDefaultColor()
            int r5 = defpackage.xvb.ClockFaceView_clockFaceBackgroundColor
            android.content.res.ColorStateList r12 = defpackage.wx3.i(r12, r13, r5)
            if (r12 != 0) goto L_0x008c
            goto L_0x0090
        L_0x008c:
            int r4 = r12.getDefaultColor()
        L_0x0090:
            r11.setBackgroundColor(r4)
            android.view.ViewTreeObserver r12 = r11.getViewTreeObserver()
            com.google.android.material.timepicker.b r4 = new com.google.android.material.timepicker.b
            r4.<init>(r11)
            r12.addOnPreDrawListener(r4)
            r11.setFocusable(r1)
            r13.recycle()
            com.google.android.material.timepicker.c r12 = new com.google.android.material.timepicker.c
            r12.<init>(r11)
            r11.S0 = r12
            java.lang.String[] r12 = new java.lang.String[r0]
            java.lang.String r13 = ""
            java.util.Arrays.fill(r12, r13)
            r11.Z0 = r12
            android.content.Context r12 = r11.getContext()
            android.view.LayoutInflater r12 = android.view.LayoutInflater.from(r12)
            int r13 = r3.size()
            r4 = 0
            r5 = r4
            r6 = r5
        L_0x00c4:
            java.lang.String[] r7 = r11.Z0
            int r7 = r7.length
            int r7 = java.lang.Math.max(r7, r13)
            if (r5 >= r7) goto L_0x011a
            java.lang.Object r7 = r3.get(r5)
            android.widget.TextView r7 = (android.widget.TextView) r7
            java.lang.String[] r8 = r11.Z0
            int r8 = r8.length
            if (r5 < r8) goto L_0x00df
            r11.removeView(r7)
            r3.remove(r5)
            goto L_0x0118
        L_0x00df:
            if (r7 != 0) goto L_0x00ef
            int r7 = defpackage.wrb.material_clockface_textview
            android.view.View r7 = r12.inflate(r7, r11, r4)
            android.widget.TextView r7 = (android.widget.TextView) r7
            r3.put(r5, r7)
            r11.addView(r7)
        L_0x00ef:
            java.lang.String[] r8 = r11.Z0
            r8 = r8[r5]
            r7.setText(r8)
            int r8 = defpackage.lob.material_value_index
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.setTag(r8, r9)
            int r8 = r5 / 12
            int r8 = r8 + r1
            int r9 = defpackage.lob.material_clock_level
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r7.setTag(r9, r10)
            if (r8 <= r1) goto L_0x010e
            r6 = r1
        L_0x010e:
            com.google.android.material.timepicker.c r8 = r11.S0
            defpackage.eaf.j(r7, r8)
            android.content.res.ColorStateList r8 = r11.b1
            r7.setTextColor(r8)
        L_0x0118:
            int r5 = r5 + r1
            goto L_0x00c4
        L_0x011a:
            com.google.android.material.timepicker.ClockHandView r12 = r11.N0
            boolean r13 = r12.b
            if (r13 == 0) goto L_0x0124
            if (r6 != 0) goto L_0x0124
            r12.E0 = r1
        L_0x0124:
            r12.b = r6
            r12.invalidate()
            int r12 = defpackage.vmb.material_time_picker_minimum_screen_height
            int r12 = r2.getDimensionPixelSize(r12)
            r11.W0 = r12
            int r12 = defpackage.vmb.material_time_picker_minimum_screen_width
            int r12 = r2.getDimensionPixelSize(r12)
            r11.X0 = r12
            int r12 = defpackage.vmb.material_clock_size
            int r12 = r2.getDimensionPixelSize(r12)
            r11.Y0 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.timepicker.ClockFaceView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) x3a.D(1, this.Z0.length, 1).b);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        x();
    }

    public final void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int max = (int) (((float) this.Y0) / Math.max(Math.max(((float) this.W0) / ((float) displayMetrics.heightPixels), ((float) this.X0) / ((float) displayMetrics.widthPixels)), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        setMeasuredDimension(max, max);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public final void w() {
        bf3 bf3 = new bf3();
        bf3.c(this);
        HashMap hashMap = new HashMap();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt.getId() != lob.circle_center && !"skip".equals(childAt.getTag())) {
                int i2 = (Integer) childAt.getTag(lob.material_clock_level);
                if (i2 == null) {
                    i2 = 1;
                }
                if (!hashMap.containsKey(i2)) {
                    hashMap.put(i2, new ArrayList());
                }
                ((List) hashMap.get(i2)).add(childAt);
            }
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            List<View> list = (List) entry.getValue();
            int round = ((Integer) entry.getKey()).intValue() == 2 ? Math.round(((float) this.L0) * 0.66f) : this.L0;
            float f = 0.0f;
            for (View id : list) {
                int id2 = id.getId();
                int i3 = lob.circle_center;
                xe3 xe3 = bf3.g(id2).d;
                xe3.z = i3;
                xe3.A = round;
                xe3.B = f;
                f += 360.0f / ((float) list.size());
            }
        }
        bf3.a(this);
        int i4 = 0;
        while (true) {
            SparseArray sparseArray = this.R0;
            if (i4 < sparseArray.size()) {
                ((TextView) sparseArray.get(i4)).setVisibility(0);
                i4++;
            } else {
                return;
            }
        }
    }

    public final void x() {
        SparseArray sparseArray;
        RectF rectF;
        Rect rect;
        RectF rectF2 = this.N0.y0;
        float f = Float.MAX_VALUE;
        TextView textView = null;
        int i = 0;
        while (true) {
            sparseArray = this.R0;
            int size = sparseArray.size();
            rectF = this.P0;
            rect = this.O0;
            if (i >= size) {
                break;
            }
            TextView textView2 = (TextView) sparseArray.get(i);
            if (textView2 != null) {
                textView2.getHitRect(rect);
                rectF.set(rect);
                rectF.union(rectF2);
                float height = rectF.height() * rectF.width();
                if (height < f) {
                    textView = textView2;
                    f = height;
                }
            }
            i++;
        }
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            TextView textView3 = (TextView) sparseArray.get(i2);
            if (textView3 != null) {
                textView3.setSelected(textView3 == textView);
                textView3.getHitRect(rect);
                rectF.set(rect);
                Rect rect2 = this.Q0;
                textView3.getLineBounds(0, rect2);
                rectF.inset((float) rect2.left, (float) rect2.top);
                textView3.getPaint().setShader(!RectF.intersects(rectF2, rectF) ? null : new RadialGradient(rectF2.centerX() - rectF.left, rectF2.centerY() - rectF.top, 0.5f * rectF2.width(), this.T0, this.U0, Shader.TileMode.CLAMP));
                textView3.invalidate();
            }
        }
    }
}
