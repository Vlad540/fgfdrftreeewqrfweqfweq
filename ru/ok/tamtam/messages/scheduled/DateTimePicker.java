package ru.ok.tamtam.messages.scheduled;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000e\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ok/tamtam/messages/scheduled/DateTimePicker;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lade;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Ls04;", "listener", "Ljue;", "setListener$scheduled_send_picker_dialog_release", "(Ls04;)V", "setListener", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
public final class DateTimePicker extends ConstraintLayout implements ade {
    public final RecyclerView K0;
    public final RecyclerView L0;
    public final RecyclerView M0;
    public final View N0 = findViewById(brb.top_line);
    public final View O0 = findViewById(brb.bottom_line);
    public final TextView P0 = ((TextView) findViewById(brb.time_divider));
    public s04 Q0;
    public boolean R0;
    public boolean S0;
    public boolean T0;
    public final int U0;

    /* JADX WARNING: type inference failed for: r10v0, types: [android.view.View, java.lang.Object, ru.ok.tamtam.messages.scheduled.DateTimePicker, android.view.ViewGroup] */
    public DateTimePicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        wce wce;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(omb.date_picker_today_margin_top);
        this.U0 = dimensionPixelSize;
        View.inflate(context, qrb.date_time_picker, this);
        RecyclerView findViewById = findViewById(brb.days_recycler_view);
        this.K0 = findViewById;
        RecyclerView findViewById2 = findViewById(brb.hours_recycler_view);
        this.L0 = findViewById2;
        RecyclerView findViewById3 = findViewById(brb.minutes_recycler_view);
        this.M0 = findViewById3;
        int dimensionPixelSize2 = getContext().getResources().getDimensionPixelSize(omb.date_picker_item_height);
        ig7 ig7 = new ig7(w04.k);
        ig7.A(true);
        findViewById.setAdapter(ig7);
        findViewById.setHasFixedSize(true);
        findViewById.j(new n51(dimensionPixelSize, 2));
        findViewById.setLayoutManager(new SliderLayoutManager(context, new j9(this, 21, ig7)));
        findViewById.setEdgeEffectFactory(new uha(dimensionPixelSize2));
        bje bje = new bje();
        findViewById2.setAdapter(bje);
        findViewById2.setHasFixedSize(true);
        findViewById2.setItemAnimator((k6c) null);
        findViewById2.j(new n51(dimensionPixelSize, 2));
        findViewById2.setLayoutManager(new SliderLayoutManager(context, new p04(this, bje, 0)));
        findViewById2.setEdgeEffectFactory(new uha(dimensionPixelSize2));
        bje bje2 = new bje();
        findViewById3.setAdapter(bje2);
        findViewById3.setItemAnimator((k6c) null);
        findViewById3.setHasFixedSize(true);
        findViewById3.j(new n51(dimensionPixelSize, 2));
        findViewById3.setLayoutManager(new SliderLayoutManager(context, new p04(this, bje2, 1)));
        findViewById3.setEdgeEffectFactory(new uha(dimensionPixelSize2));
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context2);
        }
        z(wce);
    }

    /* access modifiers changed from: private */
    public static final void setDays$lambda$7$lambda$6(DateTimePicker dateTimePicker) {
        dateTimePicker.R0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setHours$lambda$9$lambda$8(DateTimePicker dateTimePicker) {
        dateTimePicker.S0 = false;
    }

    /* access modifiers changed from: private */
    public static final void setMinutes$lambda$11$lambda$10(DateTimePicker dateTimePicker) {
        dateTimePicker.T0 = false;
    }

    public final void setListener$scheduled_send_picker_dialog_release(s04 s04) {
        this.Q0 = s04;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View, ru.ok.tamtam.messages.scheduled.DateTimePicker] */
    public final void z(wce wce) {
        setBackgroundColor(wce.m);
        View view = this.N0;
        int i = wce.k;
        view.setBackgroundColor(i);
        this.O0.setBackgroundColor(i);
        this.P0.setTextColor(wce.F);
    }
}
