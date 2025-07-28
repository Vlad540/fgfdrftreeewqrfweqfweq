package defpackage;

import android.content.Context;
import android.net.Uri;
import com.facebook.drawee.view.SimpleDraweeView;

/* renamed from: zk0  reason: default package */
public final class zk0 extends chd {
    public final /* synthetic */ int J0 = 0;
    public final u16 K0;

    public zk0(Context context, lr5 lr5) {
        super(new yk0(context));
        this.K0 = lr5;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, zk0, b7c] */
    public final void A(pg7 pg7) {
        tr6 tr6;
        tr6 tr62;
        switch (this.J0) {
            case 0:
                rr5 rr5 = (rr5) pg7;
                yk0 yk0 = (yk0) this.a;
                yk0.c.setText(rr5.b);
                yk0.o.setText(rr5.o);
                yk0.setBackgroundColor(rr5.c);
                String str = rr5.X;
                if (str != null) {
                    ur6 d = ur6.d(Uri.parse(str));
                    d.d = yk0.b;
                    tr6 = d.a();
                } else {
                    tr6 = null;
                }
                SimpleDraweeView simpleDraweeView = yk0.w0;
                if (tr6 != null) {
                    fr6 u = a06.u();
                    u.getClass();
                    er6 er6 = new er6(u, tr6, yk0);
                    qcc qcc = yk0.a;
                    qcc.a(er6);
                    if (simpleDraweeView.getController() == null) {
                        ywa a = a06.a.get();
                        a.g = qcc;
                        a.k = true;
                        simpleDraweeView.setController(a.a());
                    }
                    simpleDraweeView.setVisibility(0);
                } else {
                    simpleDraweeView.setController((gn4) null);
                    simpleDraweeView.setVisibility(8);
                }
                a24.Z(yk0, 300, new ub(this, 2, rr5));
                return;
            default:
                rr5 rr52 = (rr5) pg7;
                sr5 sr5 = (sr5) this.a;
                sr5.c.setText(rr52.b);
                sr5.o.setText(rr52.o);
                sr5.setBackgroundColor(rr52.c);
                String str2 = rr52.X;
                if (str2 != null) {
                    ur6 d2 = ur6.d(Uri.parse(str2));
                    d2.d = sr5.b;
                    tr62 = d2.a();
                } else {
                    tr62 = null;
                }
                SimpleDraweeView simpleDraweeView2 = sr5.w0;
                if (tr62 != null) {
                    fr6 u2 = a06.u();
                    u2.getClass();
                    er6 er62 = new er6(u2, tr62, sr5);
                    qcc qcc2 = sr5.a;
                    qcc2.a(er62);
                    if (simpleDraweeView2.getController() == null) {
                        ywa a2 = a06.a.get();
                        a2.g = qcc2;
                        a2.k = true;
                        simpleDraweeView2.setController(a2.a());
                    }
                    simpleDraweeView2.setVisibility(0);
                } else {
                    simpleDraweeView2.setController((gn4) null);
                    simpleDraweeView2.setVisibility(8);
                }
                a24.Z(sr5, 300, new ub(this, 29, rr52));
                return;
        }
    }

    public zk0(Context context, u16 u16) {
        super(new sr5(context));
        this.K0 = u16;
    }
}
