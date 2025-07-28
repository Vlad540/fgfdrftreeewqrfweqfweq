package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/* renamed from: qe9  reason: default package */
public final class qe9 extends v2 implements xhe {
    public TextView X;
    public View Y;
    public boolean Z;
    public final tg o;

    public qe9(Context context, tg tgVar) {
        super(context);
        this.o = tgVar;
        m((ViewGroup) null, zrb.view_floating_video_trash);
    }

    public final void c() {
        if (this.Z) {
            Context context = ((View) this.c).getContext();
            r7e r7e = wce.a0;
            this.X.setTextColor(fja.E(context).k);
            return;
        }
        this.X.setTextColor(-1);
    }

    public final void n() {
        this.X = (TextView) ((View) this.c).findViewById(yqb.view_floating_video_trash__tv_tip);
        this.Y = ((View) this.c).findViewById(yqb.view_floating_video_trash__v_background);
        c();
    }
}
