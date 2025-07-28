package defpackage;

import android.view.View;

/* renamed from: c14  reason: default package */
public final class c14 extends n14 implements View.OnClickListener {
    public final View.OnClickListener o;

    public /* synthetic */ c14(View.OnClickListener onClickListener, int i) {
        this(300, onClickListener);
    }

    public final void onClick(View view) {
        if (this.b) {
            this.b = false;
            this.o.onClick(view);
            view.postDelayed(new re(13, (gz3) this.c), this.a);
        }
    }

    public c14(long j, View.OnClickListener onClickListener) {
        super(j);
        this.o = onClickListener;
    }
}
