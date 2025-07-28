package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: ir7  reason: default package */
public final class ir7 implements etd {
    public final /* synthetic */ int a;
    public final qud b;
    public final FrameLayout c;

    public ir7(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                tsd tsd = new tsd(context);
                this.c = tsd;
                this.b = new qud(tsd);
                return;
            case 2:
                cqf cqf = new cqf(context);
                this.c = cqf;
                this.b = new qud(cqf);
                return;
            default:
                gr7 gr7 = new gr7(context);
                this.c = gr7;
                this.b = new qud(gr7);
                return;
        }
    }

    private final void c(er7 er7) {
    }

    public final void a(ktd ktd) {
        switch (this.a) {
            case 0:
                qud qud = this.b;
                qud.b(ktd);
                qud.c();
                ((gr7) this.c).a(ktd, Math.max(350, qud.b ? qud.d : qud.c));
                return;
            case 1:
                qud qud2 = this.b;
                qud2.b(ktd);
                qud2.c();
                ((tsd) this.c).a(ktd);
                return;
            default:
                qud qud3 = this.b;
                qud3.b(ktd);
                qud3.c();
                ((cqf) this.c).a(ktd, Math.max(350, qud3.b ? qud3.d : qud3.c));
                return;
        }
    }

    public final void b(er7 er7) {
        switch (this.a) {
            case 0:
                ((gr7) this.c).b(er7);
                return;
            case 1:
                return;
            default:
                ((cqf) this.c).b(er7);
                return;
        }
    }

    public final void setParent(ViewGroup viewGroup) {
        switch (this.a) {
            case 0:
                qud qud = this.b;
                gr7 gr7 = (gr7) this.c;
                gr7.setSizeConfigurator(qud);
                viewGroup.addView(gr7, new ViewGroup.LayoutParams(-1, -1));
                return;
            case 1:
                qud qud2 = this.b;
                tsd tsd = (tsd) this.c;
                tsd.setSizeConfigurator(qud2);
                viewGroup.addView(tsd, new ViewGroup.LayoutParams(-1, -1));
                return;
            default:
                qud qud3 = this.b;
                cqf cqf = (cqf) this.c;
                cqf.setSizeConfigurator(qud3);
                viewGroup.addView(cqf, new ViewGroup.LayoutParams(-1, -1));
                return;
        }
    }
}
