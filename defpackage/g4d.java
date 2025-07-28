package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import ru.ok.messages.settings.FrgBaseSettings;

/* renamed from: g4d  reason: default package */
public class g4d extends b7c {
    public final zg4 J0 = zg4.b();
    public final ImageView K0;
    public final TextView L0;
    public final TextView M0;
    public final TextView N0;
    public final View O0;
    public final View P0;
    public e4d Q0;
    public final FrgBaseSettings R0;
    public final wce S0;

    public g4d(View view, FrgBaseSettings frgBaseSettings) {
        super(view);
        vl vlVar = vl.o;
        Context context = view.getContext();
        r7e r7e = wce.a0;
        wce E = fja.E(context);
        this.S0 = E;
        view.setBackground(swb.C(0, E.i));
        ImageView imageView = (ImageView) view.findViewById(yqb.row_setting__iv_icon);
        this.K0 = imageView;
        if (imageView != null) {
            imageView.setColorFilter(E.w);
        }
        TextView textView = (TextView) view.findViewById(yqb.row_setting__tv_title);
        this.L0 = textView;
        if (textView != null) {
            textView.setTextColor(E.k);
        }
        TextView textView2 = (TextView) view.findViewById(yqb.row_setting__tv_subtitle);
        this.M0 = textView2;
        int i = E.M;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = (TextView) view.findViewById(yqb.row_setting__tv_description);
        this.N0 = textView3;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
        View findViewById = view.findViewById(yqb.row_setting__separator);
        this.O0 = findViewById;
        if (findViewById != null) {
            findViewById.setBackgroundColor(E.H);
        }
        View findViewById2 = view.findViewById(yqb.row_setting__small_separator);
        this.P0 = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setBackgroundColor(E.K);
        }
        this.R0 = frgBaseSettings;
        if (frgBaseSettings != null) {
            view.setOnClickListener(new wfc(3, this));
        }
    }

    public void A(e4d e4d, boolean z) {
        this.Q0 = e4d;
        e4d.getClass();
        View view = this.a;
        view.setEnabled(true);
        view.setAlpha(1.0f);
        ImageView imageView = this.K0;
        if (imageView != null) {
            this.Q0.getClass();
            imageView.setVisibility(8);
        }
        TextView textView = this.L0;
        if (textView != null) {
            textView.setText(this.Q0.b);
            this.Q0.getClass();
            textView.setEnabled(true);
            this.Q0.getClass();
            int i = this.Q0.Y;
            wce wce = this.S0;
            if (i == 3) {
                textView.setTextColor(wce.k);
            } else {
                textView.setTextColor(wce.F);
            }
            this.Q0.getClass();
            textView.setTypeface((Typeface) null, 0);
            this.Q0.getClass();
            textView.setSingleLine(false);
            textView.setMaxLines(999);
        }
        TextView textView2 = this.M0;
        if (textView2 != null) {
            if (TextUtils.isEmpty(this.Q0.c)) {
                textView2.setVisibility(8);
            } else {
                textView2.setText(this.Q0.c);
                textView2.setVisibility(0);
            }
        }
        View view2 = this.O0;
        if (view2 != null) {
            view2.setVisibility(this.Q0.Z ? 0 : 8);
        }
        View view3 = this.P0;
        if (view3 != null) {
            view3.setVisibility(!this.Q0.Z ? 0 : 8);
            at7.D(view3, z ? 0 : this.J0.o);
        }
        TextView textView3 = this.N0;
        if (textView3 != null) {
            if (TextUtils.isEmpty(this.Q0.o)) {
                textView3.setVisibility(8);
            } else {
                textView3.setText(this.Q0.o);
                textView3.setVisibility(0);
            }
        }
        int i2 = this.Q0.Y;
    }
}
