package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: ya8  reason: default package */
public final class ya8 extends b7c {
    public final View J0;
    public final ImageView K0;
    public final ProgressBar L0;
    public final TextView M0;
    public final /* synthetic */ za8 N0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ya8(za8 za8, View view) {
        super(view);
        this.N0 = za8;
        this.J0 = view;
        this.K0 = (ImageView) view.findViewById(gob.mr_picker_route_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(gob.mr_picker_route_progress_bar);
        this.L0 = progressBar;
        this.M0 = (TextView) view.findViewById(gob.mr_picker_route_name);
        fc8.j(za8.y0.w0, progressBar);
    }
}
