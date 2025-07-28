package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

/* renamed from: eb8  reason: default package */
public final class eb8 extends b7c {
    public final View J0;
    public final ImageView K0;
    public final ProgressBar L0;
    public final TextView M0;
    public final float N0;
    public xb8 O0;
    public final /* synthetic */ hb8 P0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public eb8(hb8 hb8, View view) {
        super(view);
        this.P0 = hb8;
        this.J0 = view;
        this.K0 = (ImageView) view.findViewById(gob.mr_cast_group_icon);
        ProgressBar progressBar = (ProgressBar) view.findViewById(gob.mr_cast_group_progress_bar);
        this.L0 = progressBar;
        this.M0 = (TextView) view.findViewById(gob.mr_cast_group_name);
        this.N0 = fc8.d(hb8.B0.C0);
        fc8.j(hb8.B0.C0, progressBar);
    }
}
