package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.LinkedHashMap;
import java.util.Map;
import one.me.sdk.richvector.EnhancedVectorDrawable;

/* renamed from: x2a  reason: default package */
public final class x2a extends ChipGroup implements mhe {
    public v2a D0;
    public final Rect E0 = new Rect();
    public final Rect F0 = new Rect();
    public final EditText G0;
    public final LinkedHashMap H0;
    public final LinkedHashMap I0;
    public final t97 J0;
    public final t97 K0;

    /* JADX WARNING: type inference failed for: r8v0, types: [x2a, android.view.View, com.google.android.material.chip.ChipGroup, java.lang.Object, android.view.ViewGroup] */
    public x2a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        EditText editText = new EditText(context);
        editText.setMinHeight(a24.X(((float) 32) * dh4.c().getDisplayMetrics().density));
        nte.m.a(editText.getPaint(), editText.getResources().getDisplayMetrics(), yq4.b);
        s59 s59 = km4.y0;
        editText.setTextColor(s59.r(editText).getText().e);
        editText.setHintTextColor(s59.r(editText).getText().h);
        editText.setBackgroundColor(0);
        editText.setFallbackLineSpacing(false);
        editText.setGravity(16);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        editText.setGravity(16);
        float f = (float) 4;
        editText.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(((float) 6) * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f));
        editText.setLayoutParams(marginLayoutParams);
        editText.setMaxLines(1);
        this.G0 = editText;
        this.H0 = new LinkedHashMap();
        this.I0 = new LinkedHashMap();
        this.J0 = ez3.O(3, new t2a(context, 0));
        this.K0 = ez3.O(3, new zu4((Object) context, 22, (Object) this));
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setChipSpacing(a24.X(f * dh4.c().getDisplayMetrics().density));
        setSingleLine(false);
        setSingleSelection(true);
        addView(editText);
        float f2 = (float) 12;
        setPadding(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(((float) 0) * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density));
        editText.setKeyListener(new w2a(this));
        d();
    }

    private final EnhancedVectorDrawable getCancelChipDrawable() {
        return (EnhancedVectorDrawable) this.K0.getValue();
    }

    private final ContextThemeWrapper getMaterialThemeWrapper() {
        return (ContextThemeWrapper) this.J0.getValue();
    }

    private final void setChipStyle(Chip chip) {
        boolean isChecked = chip.isChecked();
        s59 s59 = km4.y0;
        if (isChecked) {
            s59.r(chip).b().a.getClass();
            chip.setChipBackgroundColor(ColorStateList.valueOf(-16745729));
            s59.r(chip);
            chip.setTextColor(-1);
            return;
        }
        chip.setChipBackgroundColor(ColorStateList.valueOf(s59.r(chip).b().k));
        chip.setTextColor(s59.r(chip).getText().e);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [x2a, android.view.ViewGroup] */
    public final void a(long j, long j2, CharSequence charSequence, String str, String str2) {
        Long valueOf = Long.valueOf(j);
        LinkedHashMap linkedHashMap = this.H0;
        if (!linkedHashMap.containsKey(valueOf)) {
            Chip chip = new Chip(getMaterialThemeWrapper(), (AttributeSet) null);
            chip.setId(Long.hashCode(j));
            chip.setText(str);
            nte.m.a(chip.getPaint(), chip.getResources().getDisplayMetrics(), yq4.b);
            chip.setClickable(true);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setCheckedIcon((Drawable) null);
            chip.setFallbackLineSpacing(false);
            chip.setEnsureMinTouchTargetSize(false);
            long j3 = j;
            long j4 = j2;
            CharSequence charSequence2 = charSequence;
            String str3 = str2;
            b(chip, chip.isChecked(), j3, j4, charSequence2, str3);
            chip.setOnCheckedChangeListener(new s2a(this, chip, j3, j4, charSequence2, str3));
            for (Map.Entry value : linkedHashMap.entrySet()) {
                ((Chip) value.getValue()).setChecked(false);
            }
            linkedHashMap.put(Long.valueOf(j), chip);
            addView(chip, getChildCount() - 1);
            d();
            v2a v2a = this.D0;
            if (v2a != null) {
                v2a.f();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [x2a, android.view.View] */
    public final void b(Chip chip, boolean z, long j, long j2, CharSequence charSequence, String str) {
        if (z) {
            chip.setChipIcon(getCancelChipDrawable());
            chip.setOnTouchListener(new wd1(chip, 3, new u2a(this, j, chip)));
        } else {
            Long valueOf = Long.valueOf(j2);
            LinkedHashMap linkedHashMap = this.I0;
            if (!linkedHashMap.containsKey(valueOf)) {
                linkedHashMap.put(Long.valueOf(j2), new az9(getContext()));
            }
            az9 az9 = (az9) linkedHashMap.get(Long.valueOf(j2));
            az9.b(new ub0(charSequence, j2));
            az9.c(str);
            chip.setChipIcon(az9);
            chip.setOnTouchListener((View.OnTouchListener) null);
        }
        setChipStyle(chip);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [x2a, android.view.ViewGroup] */
    public final void c(long j) {
        LinkedHashMap linkedHashMap = this.H0;
        Chip chip = (Chip) linkedHashMap.get(Long.valueOf(j));
        if (chip != null) {
            linkedHashMap.remove(Long.valueOf(j));
            removeView(chip);
            d();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [x2a, android.view.View, java.lang.Object] */
    public final void d() {
        if (!isLaidOut() || isLayoutRequested()) {
            addOnLayoutChangeListener(new mp0(7, this));
            return;
        }
        EditText editText = getEditText();
        Rect rect = this.E0;
        editText.getHitRect(rect);
        Rect rect2 = this.F0;
        rect2.set(rect);
        rect2.left = rect2.right;
        rect2.right = getRight();
    }

    public final v2a getCallback() {
        return this.D0;
    }

    public final EditText getEditText() {
        return this.G0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [x2a, android.view.View] */
    public final void onDetachedFromWindow() {
        this.I0.clear();
        this.H0.clear();
        x2a.super.onDetachedFromWindow();
    }

    public final void onThemeChanged(pda pda) {
        EnhancedVectorDrawable enhancedVectorDrawable;
        EditText editText = this.G0;
        editText.setTextColor(pda.getText().e);
        editText.setHintTextColor(pda.getText().h);
        for (Map.Entry value : this.H0.entrySet()) {
            setChipStyle((Chip) value.getValue());
        }
        t97 t97 = this.K0;
        if (!t97.a()) {
            t97 = null;
        }
        if (t97 != null && (enhancedVectorDrawable = (EnhancedVectorDrawable) t97.getValue()) != null) {
            xs7.P(enhancedVectorDrawable, "circle_background", -1);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [x2a, android.view.View] */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.F0.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
            return x2a.super.onTouchEvent(motionEvent);
        }
        Rect rect = this.E0;
        motionEvent.setLocation((float) rect.right, ((float) rect.bottom) / 2.0f);
        return this.G0.dispatchTouchEvent(motionEvent);
    }

    public final void setCallback(v2a v2a) {
        this.D0 = v2a;
    }
}
