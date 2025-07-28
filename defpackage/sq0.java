package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import ru.ok.messages.settings.FrgBaseSettings;
import ru.ok.messages.settings.view.BrightnessSeekBar;

/* renamed from: sq0  reason: default package */
public final class sq0 extends b7c {
    public final BrightnessSeekBar J0;
    public e4d K0;
    public boolean L0;

    /* JADX WARNING: type inference failed for: r0v2, types: [android.widget.SeekBar, ru.ok.messages.settings.view.BrightnessSeekBar, android.widget.ProgressBar, android.widget.AbsSeekBar] */
    public sq0(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        ? r0 = (BrightnessSeekBar) view.findViewById(yqb.row_setting_brightness__seek_bar);
        this.J0 = r0;
        r0.setMax(100);
        r0.setOnSeekBarChangeListener(new rq0(this, frgBaseSettings));
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        js.D(r0.getProgressDrawable(), E.k);
        js.D(r0.getThumb(), E.k);
        view.findViewById(yqb.row_setting__separator).setBackgroundColor(E.H);
        int i = E.F;
        ((ImageView) view.findViewById(yqb.row_setting_brightness__iv_brigthness_low)).setColorFilter(i);
        ((ImageView) view.findViewById(yqb.row_setting_brightness__iv_brigthness_high)).setColorFilter(i);
    }
}
