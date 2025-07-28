package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public final class MaterialTextInputPicker<S> extends PickerFragment<S> {
    public int q1;
    public kw0 r1;

    public final void M0(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.q1);
        bundle.putParcelable("DATE_SELECTOR_KEY", (Parcelable) null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.r1);
    }

    public final void w0(Bundle bundle) {
        super.w0(bundle);
        if (bundle == null) {
            bundle = this.Z;
        }
        this.q1 = bundle.getInt("THEME_RES_ID_KEY");
        wn6.n(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.r1 = (kw0) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    public final View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(e0(), this.q1));
        throw null;
    }
}
