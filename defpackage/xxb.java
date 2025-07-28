package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;

/* renamed from: xxb  reason: default package */
public final class xxb extends ChipGroup implements mhe {
    public wxb D0;
    public final LinkedHashMap E0 = new LinkedHashMap();
    public final t97 F0;

    public xxb(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.F0 = ez3.O(3, new t2a(context, 20));
        setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        setChipSpacingVertical(a24.X(((float) 10) * dh4.c().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(false);
        setPaddingRelative(0, 0, 0, a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.F0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        s59 s59 = km4.y0;
        if (isChecked) {
            chip.setChipBackgroundColor(ColorStateList.valueOf(s59.r(chip).b().a.f));
            chip.setTextColor(s59.r(chip).getText().a);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(s59.r(chip).b().k));
        chip.setTextColor(s59.r(chip).getText().e);
    }

    public final void a(int i, String str) {
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.E0;
        if (!linkedHashMap.containsKey(valueOf)) {
            Chip chip = new Chip(getMaterialThemeWrapper(), (AttributeSet) null);
            chip.setId(Integer.hashCode(i));
            chip.setText(str);
            chip.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
            chip.setTextAlignment(4);
            nge.c(nte.k, chip.getPaint(), chip.getResources().getDisplayMetrics());
            chip.setClickable(true);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setCheckedIcon((Drawable) null);
            chip.setEnsureMinTouchTargetSize(false);
            b(chip, chip.isChecked(), i);
            chip.setOnCheckedChangeListener(new vxb(this, chip, i));
            for (Map.Entry value : linkedHashMap.entrySet()) {
                ((Chip) value.getValue()).setChecked(false);
            }
            linkedHashMap.put(Integer.valueOf(i), chip);
            addView(chip);
        }
    }

    public final void b(Chip chip, boolean z, int i) {
        if (z) {
            wxb wxb = this.D0;
            if (wxb != null) {
                qf1 A0 = ((CallRateBottomSheet) wxb).A0();
                grd grd = A0.Z;
                ub9 ub9 = ((of1) grd.getValue()).b;
                ub9 ub92 = new ub9();
                ub92.b(ub9);
                ub92.a(i);
                grd.m((Object) null, of1.a((of1) grd.getValue(), (Integer) null, ub92, (CharSequence) null, 5));
                uxb.b.getClass();
                if (smc.o(i) == uxb.OTHER) {
                    taf.o(A0.D0, lf1.a);
                    A0.w0.m((Object) null, new hge(r1a.m0));
                }
            }
        } else {
            wxb wxb2 = this.D0;
            if (wxb2 != null) {
                grd grd2 = ((CallRateBottomSheet) wxb2).A0().Z;
                ub9 ub93 = ((of1) grd2.getValue()).b;
                ub9 ub94 = new ub9();
                ub94.b(ub93);
                ub94.h(i);
                grd2.m((Object) null, of1.a((of1) grd2.getValue(), (Integer) null, ub94, (CharSequence) null, 5));
            }
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    public final void onDetachedFromWindow() {
        this.E0.clear();
        super.onDetachedFromWindow();
    }

    public final void onThemeChanged(pda pda) {
        for (Map.Entry value : this.E0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
    }

    public final void setListener(wxb wxb) {
        this.D0 = wxb;
    }
}
