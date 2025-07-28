package defpackage;

import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;

/* renamed from: p04  reason: default package */
public final /* synthetic */ class p04 implements rjd {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;
    public final /* synthetic */ bje c;

    public /* synthetic */ p04(DateTimePicker dateTimePicker, bje bje, int i) {
        this.a = i;
        this.b = dateTimePicker;
        this.c = bje;
    }

    public final void a(int i) {
        switch (this.a) {
            case 0:
                DateTimePicker dateTimePicker = this.b;
                if (!dateTimePicker.S0) {
                    zie zie = (zie) this.c.C(i);
                    s04 s04 = dateTimePicker.Q0;
                    if (s04 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel = (ScheduledSendPickerViewModel) s04;
                        udd.q("ScheduledSendPickerViewModel", "hour = " + zie);
                        grd grd = scheduledSendPickerViewModel.e;
                        k04 k04 = (k04) grd.getValue();
                        if (k04 != null && !hhd.f(k04.b, zie)) {
                            grd.m((Object) null, k04.a(k04, (v04) null, zie, (zie) null, 5));
                            scheduledSendPickerViewModel.f();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                DateTimePicker dateTimePicker2 = this.b;
                if (!dateTimePicker2.T0) {
                    zie zie2 = (zie) this.c.C(i);
                    s04 s042 = dateTimePicker2.Q0;
                    if (s042 != null) {
                        ScheduledSendPickerViewModel scheduledSendPickerViewModel2 = (ScheduledSendPickerViewModel) s042;
                        udd.q("ScheduledSendPickerViewModel", "minute = " + zie2);
                        grd grd2 = scheduledSendPickerViewModel2.e;
                        k04 k042 = (k04) grd2.getValue();
                        if (k042 != null && !hhd.f(k042.c, zie2)) {
                            grd2.m((Object) null, k04.a(k042, (v04) null, (zie) null, zie2, 3));
                            scheduledSendPickerViewModel2.h();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
