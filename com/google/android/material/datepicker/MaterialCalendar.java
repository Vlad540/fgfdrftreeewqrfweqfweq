package com.google.android.material.datepicker;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;

public final class MaterialCalendar<S> extends PickerFragment<S> {
    public View A1;
    public int q1;
    public kw0 r1;
    public e69 s1;
    public int t1;
    public afc u1;
    public RecyclerView v1;
    public RecyclerView w1;
    public View x1;
    public View y1;
    public View z1;

    public final void M0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.q1);
        bundle.putParcelable("GRID_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.r1);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", (Parcelable) null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.s1);
    }

    public final void f1(e69 e69) {
        c cVar = (c) this.w1.getAdapter();
        int d = cVar.o.a.d(e69);
        int d2 = d - cVar.o.a.d(this.s1);
        boolean z = false;
        boolean z2 = Math.abs(d2) > 3;
        if (d2 > 0) {
            z = true;
        }
        this.s1 = e69;
        if (z2 && z) {
            this.w1.x0(d - 3);
            this.w1.post(new ui0(d, 2, this));
        } else if (z2) {
            this.w1.x0(d + 3);
            this.w1.post(new ui0(d, 2, this));
        } else {
            this.w1.post(new ui0(d, 2, this));
        }
    }

    public final void g1(int i) {
        this.t1 = i;
        if (i == 2) {
            this.v1.getLayoutManager().y0(this.s1.c - ((lvf) this.v1.getAdapter()).o.r1.a.c);
            this.z1.setVisibility(0);
            this.A1.setVisibility(8);
            this.x1.setVisibility(8);
            this.y1.setVisibility(8);
        } else if (i == 1) {
            this.z1.setVisibility(8);
            this.A1.setVisibility(0);
            this.x1.setVisibility(0);
            this.y1.setVisibility(0);
            f1(this.s1);
        }
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.q1 = bundle.getInt("THEME_RES_ID_KEY");
        wn6.n(bundle.getParcelable("GRID_SELECTOR_KEY"));
        this.r1 = (kw0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        wn6.n(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.s1 = (e69) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        a14 a14;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(e0(), this.q1);
        this.u1 = new afc(contextThemeWrapper, 6);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        e69 e69 = this.r1.a;
        if (MaterialDatePicker.o1(contextThemeWrapper, 16843277)) {
            i2 = wrb.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = wrb.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        Resources resources = V0().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(vmb.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(vmb.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(vmb.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(vmb.mtrl_calendar_days_of_week_height);
        int i3 = f69.o;
        inflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(vmb.mtrl_calendar_month_vertical_padding) * (i3 - 1)) + (resources.getDimensionPixelSize(vmb.mtrl_calendar_day_height) * i3) + resources.getDimensionPixelOffset(vmb.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) inflate.findViewById(lob.mtrl_calendar_days_of_week);
        eaf.j(gridView, new cw7(0));
        int i4 = this.r1.X;
        if (i4 <= 0) {
            a14 = new a14();
        }
        gridView.setAdapter(a14);
        gridView.setNumColumns(e69.o);
        gridView.setEnabled(false);
        this.w1 = (RecyclerView) inflate.findViewById(lob.mtrl_calendar_months);
        e0();
        this.w1.setLayoutManager(new dw7(this, i, i));
        this.w1.setTag("MONTHS_VIEW_GROUP_TAG");
        c cVar = new c(contextThemeWrapper, this.r1, new nfc(19, (Object) this));
        this.w1.setAdapter(cVar);
        int integer = contextThemeWrapper.getResources().getInteger(krb.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(lob.mtrl_calendar_year_selector_frame);
        this.v1 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.v1.setLayoutManager(new GridLayoutManager(integer, 0));
            this.v1.setAdapter(new lvf(this));
            this.v1.j(new xj6(this));
        }
        if (inflate.findViewById(lob.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(lob.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            eaf.j(materialButton, new cq0(3, this));
            View findViewById = inflate.findViewById(lob.month_navigation_previous);
            this.x1 = findViewById;
            findViewById.setTag("NAVIGATION_PREV_TAG");
            View findViewById2 = inflate.findViewById(lob.month_navigation_next);
            this.y1 = findViewById2;
            findViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.z1 = inflate.findViewById(lob.mtrl_calendar_year_selector_frame);
            this.A1 = inflate.findViewById(lob.mtrl_calendar_day_selector_frame);
            g1(1);
            materialButton.setText(this.s1.c());
            this.w1.m(new ew7(this, cVar, materialButton));
            materialButton.setOnClickListener(new jsc(5, this));
            this.y1.setOnClickListener(new bw7(this, cVar, 1));
            this.x1.setOnClickListener(new bw7(this, cVar, 0));
        }
        if (!MaterialDatePicker.o1(contextThemeWrapper, 16843277)) {
            new e04(1).a(this.w1);
        }
        this.w1.x0(cVar.o.a.d(this.s1));
        eaf.j(this.w1, new cw7(1));
        return inflate;
    }
}
