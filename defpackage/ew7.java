package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.c;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* renamed from: ew7  reason: default package */
public final class ew7 extends r6c {
    public final /* synthetic */ c a;
    public final /* synthetic */ MaterialButton b;
    public final /* synthetic */ MaterialCalendar c;

    public ew7(MaterialCalendar materialCalendar, c cVar, MaterialButton materialButton) {
        this.c = materialCalendar;
        this.a = cVar;
        this.b = materialButton;
    }

    public final void a(RecyclerView recyclerView, int i) {
        if (i == 0) {
            recyclerView.announceForAccessibility(this.b.getText());
        }
    }

    public final void b(RecyclerView recyclerView, int i, int i2) {
        MaterialCalendar materialCalendar = this.c;
        int W0 = i < 0 ? ((LinearLayoutManager) materialCalendar.w1.getLayoutManager()).W0() : ((LinearLayoutManager) materialCalendar.w1.getLayoutManager()).Y0();
        c cVar = this.a;
        Calendar b2 = jze.b(cVar.o.a.a);
        b2.add(2, W0);
        materialCalendar.s1 = new e69(b2);
        Calendar b3 = jze.b(cVar.o.a.a);
        b3.add(2, W0);
        b3.set(5, 1);
        Calendar b4 = jze.b(b3);
        b4.get(2);
        b4.get(1);
        b4.getMaximum(7);
        b4.getActualMaximum(5);
        b4.getTimeInMillis();
        this.b.setText(jze.a("yMMMM", Locale.getDefault()).format(new Date(b4.getTimeInMillis())));
    }
}
