package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.LedSeekBar;

/* renamed from: ga7  reason: default package */
public final class ga7 extends b7c {
    public final LedSeekBar J0;
    public final FrgBaseSettings K0;
    public final SwitchCompat L0;
    public final View M0;
    public final View N0;
    public final TextView O0;
    public e4d P0;

    public ga7(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        this.K0 = frgBaseSettings;
        LedSeekBar ledSeekBar = (LedSeekBar) view.findViewById(yqb.row_setting_led__ls_seekbar);
        this.J0 = ledSeekBar;
        TextView textView = (TextView) view.findViewById(yqb.row_setting_led__title);
        this.O0 = textView;
        textView.setTextColor(E.F);
        SwitchCompat findViewById = view.findViewById(yqb.row_setting_led__cb_check);
        this.L0 = findViewById;
        js.c(E, findViewById);
        View findViewById2 = view.findViewById(yqb.row_setting__separator);
        this.M0 = findViewById2;
        findViewById2.setBackgroundColor(E.H);
        view.findViewById(yqb.row_setting_led__separator_small).setBackgroundColor(E.K);
        this.N0 = view.findViewById(yqb.row_setting_led__ll_led_container);
        ledSeekBar.setListener(new e44(this, 17, frgBaseSettings));
        view.findViewById(yqb.row_setting_led__ll_root).setOnClickListener(new eu5(8, this));
    }
}
