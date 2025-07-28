package ru.ok.messages.messages.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

public class ChatMsgSearchResultView extends ConstraintLayout implements mhe {
    public static final /* synthetic */ int P0 = 0;
    public final TextView K0 = ((TextView) findViewById(yqb.chat_msg_search_result_view__result));
    public final ImageView L0;
    public final ImageView M0;
    public final ProgressBar N0;
    public final View O0;

    /* JADX WARNING: type inference failed for: r3v0, types: [ru.ok.messages.messages.widgets.ChatMsgSearchResultView, android.view.View, java.lang.Object, android.view.ViewGroup] */
    public ChatMsgSearchResultView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, zrb.chat_msg_search_result_view, this);
        ImageView imageView = (ImageView) findViewById(yqb.chat_msg_search_result_view__next);
        this.L0 = imageView;
        a24.Z(imageView, 100, new d5(17, (Object) this));
        ImageView imageView2 = (ImageView) findViewById(yqb.chat_msg_search_result_view__prev);
        this.M0 = imageView2;
        a24.Z(imageView2, 100, new d5(17, (Object) this));
        this.N0 = (ProgressBar) findViewById(yqb.chat_msg_search_result_view__pb_loading);
        this.O0 = findViewById(yqb.chat_msg_search_result_view_next_prev_separator);
        c();
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [ru.ok.messages.messages.widgets.ChatMsgSearchResultView, android.view.View] */
    public final void c() {
        s59 s59 = km4.y0;
        pda r = s59.r(this);
        setBackgroundColor(r.a().d().a.a);
        ImageView imageView = this.L0;
        boolean isEnabled = imageView.isEnabled();
        boolean z = !isEnabled;
        pda r2 = s59.r(this);
        imageView.setColorFilter(z ? r2.c().b.f : r2.getIcon().f);
        imageView.setEnabled(isEnabled);
        imageView.setVisibility(0);
        ImageView imageView2 = this.M0;
        boolean isEnabled2 = imageView2.isEnabled();
        boolean z2 = !isEnabled2;
        pda r3 = s59.r(this);
        imageView2.setColorFilter(z2 ? r3.c().b.f : r3.getIcon().f);
        imageView2.setEnabled(isEnabled2);
        imageView2.setVisibility(0);
        js.E(this.N0, -16745729);
        nge nge = nte.k;
        yq4 yq4 = yq4.b;
        TextView textView = this.K0;
        nge.b(textView, yq4);
        textView.setTextColor(r.getText().g);
        this.O0.setBackgroundColor(r.getIcon().g);
    }

    public final void onThemeChanged(pda pda) {
        c();
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }
}
