package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.Calendar;

public final class c extends f6c {
    public final nfc X;
    public final int Y;
    public final kw0 o;

    public c(ContextThemeWrapper contextThemeWrapper, kw0 kw0, nfc nfc) {
        e69 e69 = kw0.a;
        e69 e692 = kw0.o;
        if (e69.a.compareTo(e692.a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (e692.a.compareTo(kw0.b.a) <= 0) {
            this.Y = (contextThemeWrapper.getResources().getDimensionPixelSize(vmb.mtrl_calendar_day_height) * f69.o) + (MaterialDatePicker.o1(contextThemeWrapper, 16843277) ? contextThemeWrapper.getResources().getDimensionPixelSize(vmb.mtrl_calendar_day_height) : 0);
            this.o = kw0;
            this.X = nfc;
            A(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public final int j() {
        return this.o.Z;
    }

    public final long k(int i) {
        Calendar b = jze.b(this.o.a.a);
        b.add(2, i);
        return new e69(b).a.getTimeInMillis();
    }

    public final void r(b7c b7c, int i) {
        b bVar = (b) b7c;
        kw0 kw0 = this.o;
        Calendar b = jze.b(kw0.a.a);
        b.add(2, i);
        e69 e69 = new e69(b);
        bVar.J0.setText(e69.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.K0.findViewById(lob.month_grid);
        if (materialCalendarGridView.a() == null || !e69.equals(materialCalendarGridView.a().a)) {
            new f69(e69, kw0);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(wrb.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.o1(viewGroup.getContext(), 16843277)) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new n6c(-1, this.Y));
        return new b(linearLayout, true);
    }
}
