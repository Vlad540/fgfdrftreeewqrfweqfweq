package defpackage;

import android.content.Context;
import android.view.View;
import one.me.messages.list.loader.MessageModel;

/* renamed from: c23  reason: default package */
public final class c23 extends ao8 {
    public final /* synthetic */ int X0;
    public final u16 Y0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public c23(Context context, h87 h87, int i) {
        super(context, new b23(context));
        this.X0 = i;
        switch (i) {
            case 1:
                super(context, new h23(context));
                this.Y0 = h87;
                return;
            case 2:
                super(context, new thd(context));
                this.Y0 = h87;
                return;
            case 3:
                super(context, new uhd(context));
                this.Y0 = h87;
                return;
            default:
                this.Y0 = h87;
                return;
        }
    }

    public final void M(MessageModel messageModel) {
        switch (this.X0) {
            case 0:
                rz rzVar = messageModel.y0.d;
                w13 w13 = rzVar instanceof w13 ? (w13) rzVar : null;
                if (w13 != null) {
                    b23 b23 = (b23) this.M0;
                    b23.setModel(w13);
                    b23.setOnFinalImageSetCallback(new to1(this, w13, messageModel, 3));
                    return;
                }
                return;
            case 1:
                rz rzVar2 = messageModel.y0.d;
                w13 w132 = rzVar2 instanceof w13 ? (w13) rzVar2 : null;
                if (w132 != null) {
                    h23 h23 = (h23) this.M0;
                    h23.setModel(w132);
                    h23.setOnFinalImageSetCallback(new to1(this, w132, messageModel, 4));
                    return;
                }
                return;
            case 2:
                rz rzVar3 = messageModel.y0.d;
                qhd qhd = rzVar3 instanceof qhd ? (qhd) rzVar3 : null;
                if (qhd != null) {
                    View view = this.M0;
                    ((thd) view).setModel(qhd);
                    ((thd) view).B0.setOnFinalImageSetCallback(new k61(this, qhd, messageModel, 9));
                    return;
                }
                return;
            default:
                rz rzVar4 = messageModel.y0.d;
                qhd qhd2 = rzVar4 instanceof qhd ? (qhd) rzVar4 : null;
                if (qhd2 != null) {
                    uhd uhd = (uhd) this.M0;
                    uhd.setModel(qhd2);
                    uhd.H0.setOnFinalImageSetCallback(new k61(this, qhd2, messageModel, 10));
                    return;
                }
                return;
        }
    }

    public void N(dr0 dr0) {
        switch (this.X0) {
            case 1:
                ((h23) this.M0).w(dr0);
                return;
            case 3:
                ((uhd) this.M0).w(dr0);
                return;
            default:
                return;
        }
    }

    public final void P(j53 j53) {
        switch (this.X0) {
            case 0:
                b23 b23 = (b23) this.M0;
                b23.setDateTextColor(j53.b.a);
                b23.A0.f();
                return;
            case 1:
                ((h23) this.M0).G0.f();
                return;
            case 2:
                ((thd) this.M0).setDateTextColor(j53.b.a);
                return;
            default:
                uhd uhd = (uhd) this.M0;
                if (!uhd.v()) {
                    uhd.getDate$message_list_release().setTextColor$message_list_release(j53.b.a);
                    return;
                }
                return;
        }
    }
}
