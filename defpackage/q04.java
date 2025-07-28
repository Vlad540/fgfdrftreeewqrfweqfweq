package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;

/* renamed from: q04  reason: default package */
public final /* synthetic */ class q04 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ int c;

    public /* synthetic */ q04(DateTimePicker dateTimePicker, int i, int i2) {
        this.a = i2;
        this.b = dateTimePicker;
        this.c = i;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                RecyclerView recyclerView = dateTimePicker.K0;
                recyclerView.getLayoutManager().n1(this.c, dateTimePicker.U0);
                recyclerView.post(new r04(dateTimePicker, 0));
                return;
            case 1:
                DateTimePicker dateTimePicker2 = this.b;
                RecyclerView recyclerView2 = dateTimePicker2.M0;
                recyclerView2.getLayoutManager().n1(this.c, dateTimePicker2.U0);
                recyclerView2.post(new r04(dateTimePicker2, 2));
                return;
            default:
                DateTimePicker dateTimePicker3 = this.b;
                RecyclerView recyclerView3 = dateTimePicker3.L0;
                recyclerView3.getLayoutManager().n1(this.c, dateTimePicker3.U0);
                recyclerView3.post(new r04(dateTimePicker3, 1));
                return;
        }
    }
}
