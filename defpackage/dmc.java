package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.appbar.MaterialToolbar;
import ru.ok.tamtam.messages.scheduled.DateTimePicker;
import ru.ok.utils.widgets.LongRoundedTitleSubtitleButton;

/* renamed from: dmc  reason: default package */
public final class dmc extends b75 {
    public static final /* synthetic */ k77[] x0;
    public final jg8 X = a(brb.date_picker_divider);
    public final jg8 Y = a(brb.send_with_notification_checkbox);
    public final jg8 Z = a(brb.send_button);
    public final jg8 c = a(brb.toolbar);
    public final jg8 o = a(brb.date_time_picker);
    public final jg8 w0 = a(brb.set_correct_time);

    static {
        Class<dmc> cls = dmc.class;
        k77 khb = new khb(cls, "toolbar", "getToolbar()Lcom/google/android/material/appbar/MaterialToolbar;", 0);
        n7c n7c = m7c.a;
        x0 = new k77[]{khb, wn6.e(n7c, cls, "dateTimePicker", "getDateTimePicker()Lru/ok/tamtam/messages/scheduled/DateTimePicker;", 0), wn6.f(cls, "datePickerDivider", "getDatePickerDivider()Landroid/view/View;", 0, n7c), wn6.f(cls, "notificationCheckbox", "getNotificationCheckbox()Landroidx/appcompat/widget/AppCompatCheckBox;", 0, n7c), wn6.f(cls, "sendButton", "getSendButton()Lru/ok/utils/widgets/LongRoundedTitleSubtitleButton;", 0, n7c), wn6.f(cls, "setCorrectTimeTextView", "getSetCorrectTimeTextView()Landroidx/appcompat/widget/AppCompatTextView;", 0, n7c)};
    }

    public final DateTimePicker b() {
        return (DateTimePicker) this.o.T0(this, x0[1]);
    }

    public final LongRoundedTitleSubtitleButton c() {
        return (LongRoundedTitleSubtitleButton) this.Z.T0(this, x0[4]);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [android.widget.TextView, ru.ok.utils.widgets.LongRoundedTitleSubtitleButton] */
    public final void z(wce wce) {
        k77[] k77Arr = x0;
        ((View) this.X.T0(this, k77Arr[2])).setBackgroundColor(wce.K);
        MaterialToolbar materialToolbar = (MaterialToolbar) this.c.T0(this, k77Arr[0]);
        int i = wce.w;
        materialToolbar.setTitleTextColor(i);
        materialToolbar.setNavigationIconTint(i);
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) this.Y.T0(this, k77Arr[3]);
        int i2 = wce.k;
        appCompatCheckBox.setHighlightColor(i2);
        appCompatCheckBox.setButtonTintList(ColorStateList.valueOf(i2));
        appCompatCheckBox.setTextColor(i);
        js.a(wce, c(), a24.X(((float) 42) * dh4.c().getDisplayMetrics().density));
        ((AppCompatTextView) this.w0.T0(this, k77Arr[5])).setTextColor(wce.y);
    }
}
