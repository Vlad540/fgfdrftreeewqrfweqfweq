package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: wh5  reason: default package */
public final class wh5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bi5 b;
    public final /* synthetic */ TextView c;
    public final /* synthetic */ zh5 o;

    public /* synthetic */ wh5(bi5 bi5, TextView textView, zh5 zh5, int i) {
        this.a = i;
        this.b = bi5;
        this.c = textView;
        this.o = zh5;
    }

    public final void run() {
        switch (this.a) {
            case 0:
                bi5 bi5 = this.b;
                boolean z = bi5.b;
                zh5 zh5 = this.o;
                TextView textView = this.c;
                if (z) {
                    afa.a(textView, new wh5((View) textView, textView, bi5, zh5));
                    return;
                }
                textView.invalidate();
                zh5.c.set(false);
                return;
            case 1:
                bi5 bi52 = this.b;
                boolean z2 = bi52.b;
                zh5 zh52 = this.o;
                TextView textView2 = this.c;
                if (z2) {
                    afa.a(textView2, new wh5((View) textView2, textView2, bi52, zh52));
                    return;
                }
                textView2.invalidate();
                zh52.c.set(false);
                return;
            default:
                tge.b(this.c, this.b);
                this.o.c.set(false);
                return;
        }
    }

    public wh5(View view, TextView textView, bi5 bi5, zh5 zh5) {
        this.a = 2;
        this.c = textView;
        this.b = bi5;
        this.o = zh5;
    }
}
