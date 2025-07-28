package defpackage;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import me.leolin.shortcutbadger.BuildConfig;

/* renamed from: qv7  reason: default package */
public final class qv7 extends jm {
    public final float A0;
    public ColorStateList B0;
    public int C0;
    public ColorStateList D0;
    public final xg7 w0;
    public final AccessibilityManager x0;
    public final Rect y0 = new Rect();
    public final int z0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public qv7(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = defpackage.wlb.autoCompleteTextViewStyle
            r6 = 0
            android.content.Context r8 = defpackage.tw7.a(r8, r9, r3, r6)
            r7.<init>(r8, r9, r3)
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r7.y0 = r8
            android.content.Context r8 = r7.getContext()
            int[] r2 = defpackage.xvb.MaterialAutoCompleteTextView
            int r4 = defpackage.kvb.Widget_AppCompat_AutoCompleteTextView
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            android.content.res.TypedArray r9 = defpackage.she.d(r0, r1, r2, r3, r4, r5)
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_android_inputType
            boolean r0 = r9.hasValue(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0035
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_android_inputType
            int r0 = r9.getInt(r0, r6)
            if (r0 != 0) goto L_0x0035
            r7.setKeyListener(r1)
        L_0x0035:
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_simpleItemLayout
            int r2 = defpackage.wrb.mtrl_auto_complete_simple_item
            int r0 = r9.getResourceId(r0, r2)
            r7.z0 = r0
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_android_popupElevation
            int r2 = defpackage.vmb.mtrl_exposed_dropdown_menu_popup_elevation
            int r0 = r9.getDimensionPixelOffset(r0, r2)
            float r0 = (float) r0
            r7.A0 = r0
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_dropDownBackgroundTint
            boolean r0 = r9.hasValue(r0)
            if (r0 == 0) goto L_0x005e
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_dropDownBackgroundTint
            int r0 = r9.getColor(r0, r6)
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r7.B0 = r0
        L_0x005e:
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_simpleItemSelectedColor
            int r0 = r9.getColor(r0, r6)
            r7.C0 = r0
            int r0 = defpackage.xvb.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor
            android.content.res.ColorStateList r0 = defpackage.wx3.i(r8, r9, r0)
            r7.D0 = r0
            java.lang.String r0 = "accessibility"
            java.lang.Object r0 = r8.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r0 = (android.view.accessibility.AccessibilityManager) r0
            r7.x0 = r0
            xg7 r0 = new xg7
            int r2 = defpackage.ylb.listPopupWindowStyle
            r0.<init>(r8, r1, r2, r6)
            r7.w0 = r0
            r8 = 1
            r0.N0 = r8
            ln r1 = r0.O0
            r1.setFocusable(r8)
            r0.D0 = r7
            r8 = 2
            ln r1 = r0.O0
            r1.setInputMethodMode(r8)
            android.widget.ListAdapter r8 = r7.getAdapter()
            r0.o(r8)
            xn r8 = new xn
            r1 = 1
            r8.<init>(r1, r7)
            r0.E0 = r8
            int r8 = defpackage.xvb.MaterialAutoCompleteTextView_simpleItems
            boolean r8 = r9.hasValue(r8)
            if (r8 == 0) goto L_0x00b1
            int r8 = defpackage.xvb.MaterialAutoCompleteTextView_simpleItems
            int r8 = r9.getResourceId(r8, r6)
            r7.setSimpleItems((int) r8)
        L_0x00b1:
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv7.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void b(qv7 qv7, Object obj) {
        qv7.setText(qv7.convertSelectionToString(obj), false);
    }

    public final TextInputLayout c() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean d() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.x0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (!(accessibilityManager == null || !accessibilityManager.isEnabled() || (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) == null)) {
                for (AccessibilityServiceInfo next : enabledAccessibilityServiceList) {
                    if (next.getSettingsActivityName() == null || !next.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final void dismissDropDown() {
        if (d()) {
            this.w0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.B0;
    }

    public CharSequence getHint() {
        TextInputLayout c = c();
        return (c == null || !c.W0) ? super.getHint() : c.getHint();
    }

    public float getPopupElevation() {
        return this.A0;
    }

    public int getSimpleItemSelectedColor() {
        return this.C0;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.D0;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout c = c();
        if (c != null && c.W0 && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : BuildConfig.FLAVOR).equals("meizu")) {
                setHint(BuildConfig.FLAVOR);
            }
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.w0.dismiss();
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout c = c();
            int i3 = 0;
            if (!(adapter == null || c == null)) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                xg7 xg7 = this.w0;
                int min = Math.min(adapter.getCount(), Math.max(0, !xg7.O0.isShowing() ? -1 : xg7.c.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, c);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = xg7.O0.getBackground();
                if (background != null) {
                    Rect rect = this.y0;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = c.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public final void onWindowFocusChanged(boolean z) {
        if (!d()) {
            super.onWindowFocusChanged(z);
        }
    }

    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.w0.o(getAdapter());
    }

    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        xg7 xg7 = this.w0;
        if (xg7 != null) {
            xg7.i(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.B0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof lw7) {
            ((lw7) dropDownBackground).l(this.B0);
        }
    }

    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.w0.F0 = getOnItemSelectedListener();
    }

    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout c = c();
        if (c != null) {
            c.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.C0 = i;
        if (getAdapter() instanceof pv7) {
            ((pv7) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.D0 = colorStateList;
        if (getAdapter() instanceof pv7) {
            ((pv7) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    public final void showDropDown() {
        if (d()) {
            this.w0.g();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new pv7(this, getContext(), this.z0, strArr));
    }
}
