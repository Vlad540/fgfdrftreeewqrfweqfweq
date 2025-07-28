package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;

/* renamed from: ef9  reason: default package */
public final class ef9 extends v2 implements gx2, xhe {
    public static final int C0 = zrb.layout_send_location;
    public hm7 A0;
    public final fq3 B0 = new fq3(new ss8(9, (Object) this));
    public Group X;
    public TextView Y;
    public ImageButton Z;
    public final boolean o;
    public ChipGroup w0;
    public OneMeTitleSubtitleButton x0;
    public Chip y0;
    public Chip z0;

    public ef9(Context context, boolean z) {
        super(context);
        this.o = z;
    }

    public final void A(hm7 hm7) {
        this.A0 = hm7;
        int t = hr1.t(hm7.d);
        if (t == 1) {
            this.X.setVisibility(8);
            this.x0.setTitle(((Context) this.b).getString(this.o ? cic.I2 : cic.t2));
        } else if (t == 2) {
            this.X.setVisibility(0);
            this.x0.setTitle((CharSequence) this.B0.get());
            int ordinal = hm7.e.ordinal();
            if (ordinal == 0) {
                ChipGroup chipGroup = this.w0;
                int i = yqb.layout_send_location__duration_20m;
                lga lga = chipGroup.z0;
                iw7 iw7 = (iw7) ((HashMap) lga.c).get(Integer.valueOf(i));
                if (iw7 != null && lga.f(iw7)) {
                    lga.m();
                }
            } else if (ordinal == 1) {
                ChipGroup chipGroup2 = this.w0;
                int i2 = yqb.layout_send_location__duration_1h;
                lga lga2 = chipGroup2.z0;
                iw7 iw72 = (iw7) ((HashMap) lga2.c).get(Integer.valueOf(i2));
                if (iw72 != null && lga2.f(iw72)) {
                    lga2.m();
                }
            } else if (ordinal == 2) {
                ChipGroup chipGroup3 = this.w0;
                int i3 = yqb.layout_send_location__duration_3h;
                lga lga3 = chipGroup3.z0;
                iw7 iw73 = (iw7) ((HashMap) lga3.c).get(Integer.valueOf(i3));
                if (iw73 != null && lga3.f(iw73)) {
                    lga3.m();
                }
            } else if (ordinal == 3) {
                ChipGroup chipGroup4 = this.w0;
                int i4 = yqb.layout_send_location__duration_24h;
                lga lga4 = chipGroup4.z0;
                iw7 iw74 = (iw7) ((HashMap) lga4.c).get(Integer.valueOf(i4));
                if (iw74 != null && lga4.f(iw74)) {
                    lga4.m();
                }
            } else if (ordinal == 4) {
                ChipGroup chipGroup5 = this.w0;
                int i5 = yqb.layout_send_location__duration_no_limit;
                lga lga5 = chipGroup5.z0;
                iw7 iw75 = (iw7) ((HashMap) lga5.c).get(Integer.valueOf(i5));
                if (iw75 != null && lga5.f(iw75)) {
                    lga5.m();
                }
            }
            B();
        }
        if (hm7.i) {
            this.z0.setVisibility(8);
            this.y0.setVisibility(0);
            return;
        }
        this.z0.setVisibility(0);
        this.y0.setVisibility(8);
    }

    public final void B() {
        int checkedChipId = this.w0.getCheckedChipId();
        int i = yqb.layout_send_location__duration_20m;
        Context context = (Context) this.b;
        this.x0.setSubtitle(context.getString(cic.z2, new Object[]{checkedChipId == i ? xs7.r(fsb.tt_dates_minutes, (int) gm7.c.a, context) : checkedChipId == yqb.layout_send_location__duration_1h ? xs7.r(fsb.tt_dates_hours, (int) gm7.o.a, context) : checkedChipId == yqb.layout_send_location__duration_3h ? xs7.r(fsb.tt_dates_hours, (int) gm7.X.a, context) : checkedChipId == yqb.layout_send_location__duration_24h ? xs7.r(fsb.tt_dates_hours, (int) gm7.Y.a, context) : checkedChipId == yqb.layout_send_location__duration_no_limit ? context.getString(cic.r0) : ""}));
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            Context context = view.getContext();
            r7e r7e = wce.a0;
            wce E = fja.E(context);
            this.Y.setTextColor(E.J);
            ChipGroup chipGroup = this.w0;
            int childCount = chipGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                Chip childAt = chipGroup.getChildAt(i);
                if (childAt instanceof Chip) {
                    Chip chip = childAt;
                    chip.setTextColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{E.m, E.F}));
                    chip.setChipBackgroundColor(new ColorStateList(new int[][]{new int[]{16842912}, new int[0]}, new int[]{E.k, E.H}));
                }
            }
            this.Z.setColorFilter(E.J, PorterDuff.Mode.SRC_IN);
            this.Z.setBackground(E.a());
        }
    }

    /* JADX WARNING: type inference failed for: r0v40, types: [one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v26, types: [java.lang.Object, android.view.View$OnTouchListener] */
    public final void n() {
        this.X = ((View) this.c).findViewById(yqb.layout_send_location__live_group);
        this.Y = (TextView) ((View) this.c).findViewById(yqb.layout_send_location__tv_pick_duration);
        this.Z = (ImageButton) ((View) this.c).findViewById(yqb.layout_send_location__cancel_button);
        this.w0 = ((View) this.c).findViewById(yqb.layout_send_location__cp_duration);
        OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) ((View) this.c).findViewById(yqb.layout_send_location__send_button);
        this.x0 = oneMeTitleSubtitleButton;
        int i = cic.z2;
        Context context = (Context) this.b;
        String string = context.getString(i);
        int i2 = cic.I2;
        oneMeTitleSubtitleButton.j(string, context.getString(i2));
        ((View) this.c).findViewById(yqb.layout_send_location__duration_20m).setText(xs7.r(fsb.tt_dates_minutes, (int) gm7.c.a, context));
        ((View) this.c).findViewById(yqb.layout_send_location__duration_1h).setText(xs7.r(fsb.tt_dates_hours, (int) gm7.o.a, context));
        ((View) this.c).findViewById(yqb.layout_send_location__duration_3h).setText(xs7.r(fsb.tt_dates_hours, (int) gm7.X.a, context));
        Chip findViewById = ((View) this.c).findViewById(yqb.layout_send_location__duration_24h);
        this.z0 = findViewById;
        findViewById.setText(xs7.r(fsb.tt_dates_hours, (int) gm7.Y.a, context));
        this.y0 = ((View) this.c).findViewById(yqb.layout_send_location__duration_no_limit);
        a24.a0(this.x0, new cf9(this, 0));
        a24.a0(this.Z, new cf9(this, 1));
        this.w0.setOnCheckedChangeListener(this);
        c();
        ((View) this.c).setOnTouchListener(new Object());
        if (!this.o) {
            i2 = cic.t2;
        }
        this.x0.setTitle(context.getString(i2));
    }
}
