package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: dw7  reason: default package */
public final class dw7 extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ MaterialCalendar F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dw7(MaterialCalendar materialCalendar, int i, int i2) {
        super(i, false);
        this.F = materialCalendar;
        this.E = i2;
    }

    public final void I0(RecyclerView recyclerView, int i) {
        yi9 yi9 = new yi9(recyclerView.getContext(), 1);
        yi9.a = i;
        J0(yi9);
    }

    public final void L0(x6c x6c, int[] iArr) {
        int i = this.E;
        MaterialCalendar materialCalendar = this.F;
        if (i == 0) {
            iArr[0] = materialCalendar.w1.getWidth();
            iArr[1] = materialCalendar.w1.getWidth();
            return;
        }
        iArr[0] = materialCalendar.w1.getHeight();
        iArr[1] = materialCalendar.w1.getHeight();
    }
}
