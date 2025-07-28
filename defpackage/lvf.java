package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Locale;

/* renamed from: lvf  reason: default package */
public final class lvf extends f6c {
    public final MaterialCalendar o;

    public lvf(MaterialCalendar materialCalendar) {
        this.o = materialCalendar;
    }

    public final int j() {
        return this.o.r1.Y;
    }

    public final void r(b7c b7c, int i) {
        MaterialCalendar materialCalendar = this.o;
        int i2 = materialCalendar.r1.a.c + i;
        String format = String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)});
        TextView textView = ((kvf) b7c).J0;
        textView.setText(format);
        Context context = textView.getContext();
        textView.setContentDescription(jze.c().get(1) == i2 ? String.format(context.getString(wsb.mtrl_picker_navigate_to_current_year_description), new Object[]{Integer.valueOf(i2)}) : String.format(context.getString(wsb.mtrl_picker_navigate_to_year_description), new Object[]{Integer.valueOf(i2)}));
        afc afc = materialCalendar.u1;
        if (jze.c().get(1) == i2) {
            Object obj = afc.b;
        } else {
            Object obj2 = afc.a;
        }
        throw null;
    }

    public final b7c t(ViewGroup viewGroup, int i) {
        return new kvf((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(wrb.mtrl_calendar_year, viewGroup, false));
    }
}
