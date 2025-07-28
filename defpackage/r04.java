package defpackage;

import ru.ok.tamtam.messages.scheduled.DateTimePicker;

/* renamed from: r04  reason: default package */
public final /* synthetic */ class r04 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ DateTimePicker b;

    public /* synthetic */ r04(DateTimePicker dateTimePicker, int i) {
        this.a = i;
        this.b = dateTimePicker;
    }

    public final void run() {
        int i = this.a;
        DateTimePicker dateTimePicker = this.b;
        switch (i) {
            case 0:
                DateTimePicker.setDays$lambda$7$lambda$6(dateTimePicker);
                return;
            case 1:
                DateTimePicker.setHours$lambda$9$lambda$8(dateTimePicker);
                return;
            default:
                DateTimePicker.setMinutes$lambda$11$lambda$10(dateTimePicker);
                return;
        }
    }
}
