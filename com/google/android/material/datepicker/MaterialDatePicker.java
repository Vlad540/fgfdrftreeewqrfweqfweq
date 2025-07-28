package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

public final class MaterialDatePicker<S> extends DialogFragment {
    public final LinkedHashSet F1 = new LinkedHashSet();
    public final LinkedHashSet G1 = new LinkedHashSet();
    public int H1;
    public PickerFragment I1;
    public kw0 J1;
    public MaterialCalendar K1;
    public int L1;
    public CharSequence M1;
    public boolean N1;
    public int O1;
    public int P1;
    public CharSequence Q1;
    public int R1;
    public CharSequence S1;
    public int T1;
    public CharSequence U1;
    public int V1;
    public CharSequence W1;
    public TextView X1;
    public CheckableImageButton Y1;
    public lw7 Z1;
    public boolean a2;
    public CharSequence b2;
    public CharSequence c2;

    public MaterialDatePicker() {
        new LinkedHashSet();
        new LinkedHashSet();
    }

    public static int n1(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(vmb.mtrl_calendar_content_padding);
        Calendar c = jze.c();
        c.set(5, 1);
        Calendar b = jze.b(c);
        b.get(2);
        b.get(1);
        int maximum = b.getMaximum(7);
        b.getActualMaximum(5);
        b.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(vmb.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(vmb.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean o1(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(bm3.F(wlb.materialCalendarStyle, context, MaterialCalendar.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [jw0, java.lang.Object] */
    public final void M0(Bundle bundle) {
        Bundle bundle2 = bundle;
        super.M0(bundle);
        bundle2.putInt("OVERRIDE_THEME_RES_ID", this.H1);
        bundle2.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        kw0 kw0 = this.J1;
        ? obj = new Object();
        int i = jw0.b;
        int i2 = jw0.b;
        long j = kw0.a.Y;
        long j2 = kw0.b.Y;
        obj.a = Long.valueOf(kw0.o.Y);
        MaterialCalendar materialCalendar = this.K1;
        e69 e69 = materialCalendar == null ? null : materialCalendar.s1;
        if (e69 != null) {
            obj.a = Long.valueOf(e69.Y);
        }
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("DEEP_COPY_VALIDATOR_KEY", kw0.c);
        e69 b = e69.b(j);
        e69 b3 = e69.b(j2);
        t04 t04 = (t04) bundle3.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.a;
        bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", new kw0(b, b3, t04, l == null ? null : e69.b(l.longValue()), kw0.X));
        bundle2.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle2.putInt("TITLE_TEXT_RES_ID_KEY", this.L1);
        bundle2.putCharSequence("TITLE_TEXT_KEY", this.M1);
        bundle2.putInt("INPUT_MODE_KEY", this.O1);
        bundle2.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.P1);
        bundle2.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.Q1);
        bundle2.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.R1);
        bundle2.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.S1);
        bundle2.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.T1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.U1);
        bundle2.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.V1);
        bundle2.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.W1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v17, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v21, resolved type: psf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v11, resolved type: psf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v30, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v31, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v15, resolved type: osf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v16, resolved type: osf} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void N0() {
        /*
            r11 = this;
            super.N0()
            android.app.Dialog r0 = r11.j1()
            android.view.Window r0 = r0.getWindow()
            boolean r1 = r11.N1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00e8
            r1 = -1
            r0.setLayout(r1, r1)
            lw7 r1 = r11.Z1
            r0.setBackgroundDrawable(r1)
            boolean r1 = r11.a2
            if (r1 != 0) goto L_0x0119
            android.view.View r1 = r11.W0()
            int r4 = defpackage.lob.fullscreen_header
            android.view.View r1 = r1.findViewById(r4)
            android.graphics.drawable.Drawable r4 = r1.getBackground()
            android.content.res.ColorStateList r4 = defpackage.js.n(r4)
            if (r4 == 0) goto L_0x003b
            int r4 = r4.getDefaultColor()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            r5 = 0
            if (r4 == 0) goto L_0x0048
            int r6 = r4.intValue()
            if (r6 != 0) goto L_0x0046
            goto L_0x0048
        L_0x0046:
            r6 = r5
            goto L_0x0049
        L_0x0048:
            r6 = r3
        L_0x0049:
            android.content.Context r7 = r0.getContext()
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = defpackage.vx3.p(r8, r9, r7)
            if (r6 == 0) goto L_0x005c
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
        L_0x005c:
            defpackage.gt0.J(r0, r5)
            r0.getContext()
            r0.getContext()
            r0.setStatusBarColor(r5)
            r0.setNavigationBarColor(r5)
            int r4 = r4.intValue()
            boolean r4 = defpackage.vx3.z(r4)
            boolean r6 = defpackage.vx3.z(r5)
            if (r6 != 0) goto L_0x007e
            if (r4 == 0) goto L_0x007c
            goto L_0x007e
        L_0x007c:
            r4 = r5
            goto L_0x007f
        L_0x007e:
            r4 = r3
        L_0x007f:
            android.view.View r6 = r0.getDecorView()
            mod r8 = new mod
            r8.<init>((android.view.View) r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r6 < r9) goto L_0x009a
            psf r6 = new psf
            android.view.WindowInsetsController r10 = r0.getInsetsController()
            r6.<init>(r10, r8)
            r6.l = r0
            goto L_0x009f
        L_0x009a:
            osf r6 = new osf
            r6.<init>(r0, r8)
        L_0x009f:
            r6.H(r4)
            boolean r4 = defpackage.vx3.z(r7)
            boolean r6 = defpackage.vx3.z(r5)
            if (r6 != 0) goto L_0x00ae
            if (r4 == 0) goto L_0x00af
        L_0x00ae:
            r5 = r3
        L_0x00af:
            android.view.View r4 = r0.getDecorView()
            mod r6 = new mod
            r6.<init>((android.view.View) r4)
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r9) goto L_0x00c8
            psf r4 = new psf
            android.view.WindowInsetsController r7 = r0.getInsetsController()
            r4.<init>(r7, r6)
            r4.l = r0
            goto L_0x00cd
        L_0x00c8:
            osf r4 = new osf
            r4.<init>(r0, r6)
        L_0x00cd:
            r4.G(r5)
            int r0 = r1.getPaddingTop()
            android.view.ViewGroup$LayoutParams r4 = r1.getLayoutParams()
            int r4 = r4.height
            hw9 r5 = new hw9
            r6 = 7
            r5.<init>(r1, r4, r0, r6)
            java.util.WeakHashMap r0 = defpackage.eaf.a
            defpackage.t9f.u(r1, r5)
            r11.a2 = r3
            goto L_0x0119
        L_0x00e8:
            r1 = -2
            r0.setLayout(r1, r1)
            android.content.res.Resources r1 = r11.h0()
            int r4 = defpackage.vmb.mtrl_calendar_dialog_background_inset
            int r10 = r1.getDimensionPixelOffset(r4)
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>(r10, r10, r10, r10)
            android.graphics.drawable.InsetDrawable r4 = new android.graphics.drawable.InsetDrawable
            lw7 r6 = r11.Z1
            r5 = r4
            r7 = r10
            r8 = r10
            r9 = r10
            r5.<init>(r6, r7, r8, r9, r10)
            r0.setBackgroundDrawable(r4)
            android.view.View r0 = r0.getDecorView()
            oy6 r4 = new oy6
            android.app.Dialog r5 = r11.j1()
            r4.<init>(r5, r1)
            r0.setOnTouchListener(r4)
        L_0x0119:
            r11.V0()
            int r0 = r11.H1
            if (r0 == 0) goto L_0x0194
            r11.m1()
            kw0 r1 = r11.J1
            com.google.android.material.datepicker.MaterialCalendar r4 = new com.google.android.material.datepicker.MaterialCalendar
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r2)
            java.lang.String r7 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r8 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r8, r2)
            e69 r1 = r1.o
            java.lang.String r8 = "CURRENT_MONTH_KEY"
            r5.putParcelable(r8, r1)
            r4.Y0(r5)
            r11.K1 = r4
            int r1 = r11.O1
            if (r1 != r3) goto L_0x0170
            r11.m1()
            kw0 r1 = r11.J1
            com.google.android.material.datepicker.MaterialTextInputPicker r4 = new com.google.android.material.datepicker.MaterialTextInputPicker
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r5.putParcelable(r0, r2)
            r5.putParcelable(r7, r1)
            r4.Y0(r5)
        L_0x0170:
            r11.I1 = r4
            android.widget.TextView r0 = r11.X1
            int r1 = r11.O1
            if (r1 != r3) goto L_0x0188
            android.content.res.Resources r1 = r11.h0()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r3 = 2
            if (r1 != r3) goto L_0x0188
            java.lang.CharSequence r1 = r11.c2
            goto L_0x018a
        L_0x0188:
            java.lang.CharSequence r1 = r11.b2
        L_0x018a:
            r0.setText(r1)
            r11.m1()
            r11.e0()
            throw r2
        L_0x0194:
            r11.m1()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.MaterialDatePicker.N0():void");
    }

    public final void O0() {
        this.I1.p1.clear();
        super.O0();
    }

    public final Dialog i1() {
        Context V0 = V0();
        V0();
        int i = this.H1;
        if (i != 0) {
            Dialog dialog = new Dialog(V0, i);
            Context context = dialog.getContext();
            this.N1 = o1(context, 16843277);
            this.Z1 = new lw7(context, (AttributeSet) null, wlb.materialCalendarStyle, kvb.Widget_MaterialComponents_MaterialCalendar);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, xvb.MaterialCalendar, wlb.materialCalendarStyle, kvb.Widget_MaterialComponents_MaterialCalendar);
            int color = obtainStyledAttributes.getColor(xvb.MaterialCalendar_backgroundTint, 0);
            obtainStyledAttributes.recycle();
            this.Z1.j(context);
            this.Z1.l(ColorStateList.valueOf(color));
            lw7 lw7 = this.Z1;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = eaf.a;
            lw7.k(t9f.i(decorView));
            return dialog;
        }
        m1();
        throw null;
    }

    public final void m1() {
        wn6.n(this.Z.getParcelable("DATE_SELECTOR_KEY"));
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.F1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.G1.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.Y0;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.H1 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        wn6.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.J1 = (kw0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wn6.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.L1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.M1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.O1 = bundle.getInt("INPUT_MODE_KEY");
        this.P1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.Q1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.R1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.S1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.T1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.U1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.V1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.W1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.M1;
        if (charSequence == null) {
            charSequence = V0().getResources().getText(this.L1);
        }
        this.b2 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.c2 = charSequence;
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.N1 ? wrb.mtrl_picker_fullscreen : wrb.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.N1) {
            inflate.findViewById(lob.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(n1(context), -2));
        } else {
            inflate.findViewById(lob.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(n1(context), -1));
        }
        WeakHashMap weakHashMap = eaf.a;
        ((TextView) inflate.findViewById(lob.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.Y1 = (CheckableImageButton) inflate.findViewById(lob.mtrl_picker_header_toggle);
        this.X1 = (TextView) inflate.findViewById(lob.mtrl_picker_title_text);
        this.Y1.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.Y1;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, am7.n(context, bob.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], am7.n(context, bob.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.Y1;
        if (this.O1 != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        eaf.j(this.Y1, (b4) null);
        CheckableImageButton checkableImageButton3 = this.Y1;
        this.Y1.setContentDescription(this.O1 == 1 ? checkableImageButton3.getContext().getString(wsb.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton3.getContext().getString(wsb.mtrl_picker_toggle_to_text_input_mode));
        this.Y1.setOnClickListener(new eu5(9, this));
        Button button = (Button) inflate.findViewById(lob.confirm_button);
        m1();
        throw null;
    }
}
