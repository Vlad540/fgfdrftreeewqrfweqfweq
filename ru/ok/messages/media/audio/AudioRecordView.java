package ru.ok.messages.media.audio;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class AudioRecordView extends ConstraintLayout implements mhe {
    public static final /* synthetic */ int S0 = 0;
    public final TextView K0 = ((TextView) findViewById(yqb.view_audio_record__tv_duration));
    public final TextView L0 = ((TextView) findViewById(yqb.view_audio_record__tv_swipe_cancel));
    public final TextView M0;
    public final ImageView N0 = ((ImageView) findViewById(yqb.frg_chat__iv_icon));
    public final View O0;
    public final View P0;
    public final ImageView Q0;
    public final View R0;

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.media.audio.AudioRecordView, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public AudioRecordView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        xy6.c(this);
        xy6.w(this);
        getContext();
        vl.b().c();
        LayoutInflater.from(getContext()).inflate(zrb.view_audio_record, this, true);
        TextView textView = (TextView) findViewById(yqb.view_audio_record__tv_click_cancel);
        this.M0 = textView;
        findViewById(yqb.view_audio_record__duration_panel);
        View findViewById = findViewById(yqb.view_audio_record__static_circle);
        this.O0 = findViewById;
        this.P0 = findViewById(yqb.view_audio_record__audio_circle);
        View findViewById2 = findViewById(yqb.view_audio_record__slide_panel);
        ImageView imageView = (ImageView) findViewById(yqb.view_audio_record__im_arrow);
        this.Q0 = imageView;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setAutoMirrored(true);
        }
        this.R0 = findViewById(yqb.view_audio_record__root_panel);
        at7.i(findViewById2, new f5(1, this));
        at7.i(findViewById, new f5(1, this));
        at7.i(textView, new f5(1, this));
        onThemeChanged(km4.y0.r(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [ru.ok.messages.media.audio.AudioRecordView, android.view.View] */
    private int getStaticCircleSize() {
        int width = this.O0.getWidth();
        return width == 0 ? getResources().getDimensionPixelSize(mmb.audio_record_static_circle_size) : width;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [ru.ok.messages.media.audio.AudioRecordView, android.view.View] */
    public final void onThemeChanged(pda pda) {
        avf d = km4.y0.r(this).a().d();
        nge nge = nte.k;
        TextView textView = this.K0;
        nge.b(textView, yq4.b);
        textView.setTextColor(pda.getText().e);
        this.N0.setColorFilter(pda.getIcon().b);
        this.O0.setBackground(swb.H(-16745729, (Integer) null, (Integer) null));
        r7e r7e = wce.a0;
        this.P0.setBackground(swb.H(Integer.valueOf(n1g.c0(-16745729, 0.2f)), (Integer) null, (Integer) null));
        js.D(this.Q0.getDrawable(), pda.getText().f);
        nge nge2 = nte.o;
        TextView textView2 = this.L0;
        nge2.b(textView2, yq4.b);
        textView2.setTextColor(pda.getText().f);
        TextView textView3 = this.M0;
        nge2.b(textView3, yq4.b);
        textView3.setTextColor(pda.getText().b);
        this.R0.setBackgroundColor(d.a.a);
    }

    public void setListener(o50 o50) {
    }
}
