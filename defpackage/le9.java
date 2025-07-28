package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: le9  reason: default package */
public final class le9 extends v2 implements je9, xhe, cm3 {
    public static final int H0 = zrb.layout_contact_location;
    public ProgressBar A0;
    public TextView B0;
    public TextView C0;
    public TextView D0;
    public RecyclerView E0;
    public View F0;
    public em3 G0;
    public final di3 X;
    public final g2b Y;
    public final ViewStub Z;
    public final w6a o;
    public final rf4 w0;
    public Group x0;
    public TextView y0;
    public ImageView z0;

    public le9(Context context, w6a w6a, di3 di3, g2b g2b, rf4 rf4, ViewStub viewStub) {
        super(context);
        this.o = w6a;
        this.X = di3;
        this.Y = g2b;
        this.w0 = rf4;
        this.Z = viewStub;
    }

    public final void c() {
        View view = (View) this.c;
        if (view != null) {
            pda r = km4.y0.r(view);
            ((View) this.c).setBackgroundColor(r.b().j);
            this.y0.setTextColor(r.getText().g);
            this.C0.setTextColor(r.getText().f);
            this.B0.setTextColor(r.getText().f);
            this.D0.setTextColor(-16745729);
            gp0.D((Drawable) null, (Drawable) null, js.q(zhc.c0, -16745729, (Context) this.b), (Drawable) null, this.D0);
        }
    }

    public final void n() {
        this.x0 = ((View) this.c).findViewById(yqb.layout_contact_location__current_group);
        TextView textView = (TextView) ((View) this.c).findViewById(yqb.layout_contact_location__tv_name);
        this.y0 = textView;
        nte.l.b(textView, yq4.b);
        this.z0 = (ImageView) ((View) this.c).findViewById(yqb.layout_contact_location__iv_live);
        this.A0 = (ProgressBar) ((View) this.c).findViewById(yqb.layout_contact_location__pb_request_location);
        this.B0 = (TextView) ((View) this.c).findViewById(yqb.layout_contact_location__iv_update);
        TextView textView2 = this.y0;
        nge nge = nte.o;
        nge.b(textView2, yq4.b);
        this.C0 = (TextView) ((View) this.c).findViewById(yqb.layout_contact_location__tv_address);
        nge.b(this.y0, yq4.b);
        this.D0 = (TextView) ((View) this.c).findViewById(yqb.layout_contact_location__tv_route);
        nte.B.b(this.y0, yq4.b);
        this.E0 = ((View) this.c).findViewById(yqb.layout_contact_location__rv_markers);
        this.F0 = ((View) this.c).findViewById(yqb.layout_contact_location__separator);
        c();
        em3 em3 = new em3(this.X);
        this.G0 = em3;
        em3.Z = this;
        em3.A(true);
        this.E0.setAdapter(this.G0);
        this.E0.setLayoutManager(new LinearLayoutManager(0, false));
        at7.i(this.D0, new ke9(this, 0));
        at7.i((View) this.c, new ke9(this, 1));
    }
}
