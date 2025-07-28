package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.arch.Widget;

/* renamed from: zd1  reason: default package */
public final class zd1 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ CallOpponentsListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zd1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.Y = callOpponentsListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        ((zd1) n(obj, (Continuation) obj2)).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        zd1 zd1 = new zd1(continuation, this.Y);
        zd1.X = obj;
        return zd1;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        wh1 wh1 = (sg9) this.X;
        if (wh1 instanceof wh1) {
            wh1 wh12 = wh1;
            k77[] k77Arr = CallOpponentsListWidget.L0;
            Widget widget = this.Y;
            widget.getClass();
            if (wh12 instanceof ch1) {
                widget.getRouter().B(widget);
            } else if (wh12 instanceof qh1) {
                oc1.c.Z1(((qh1) wh12).C, widget.getContext().getString(r1a.E1), CallOpponentsListWidget.class.getName());
            } else if (wh12 instanceof gh1) {
                hhd.q(widget.getContext(), ((gh1) wh12).C);
                if (hhd.y()) {
                    String string = widget.getContext().getString(ftb.call_link_share_dialog_share_link_copy);
                    hba hba = new hba(widget);
                    hba.i(string);
                    hba.d(new bm1(3, (s16) null));
                    hba.c(new pba(0, 0, 3));
                    hba.j();
                }
            } else {
                boolean z = wh12 instanceof uh1;
                t97 t97 = widget.o;
                if (z) {
                    ((oed) t97.getValue()).getClass();
                    oed.b(fh1.a, new mz4((Object) (uh1) wh12, (Object) widget, 0, 1));
                } else if (wh12 instanceof vh1) {
                    ((oed) t97.getValue()).getClass();
                    oed.b(fh1.b, new mz4((Object) widget, (Object) (vh1) wh12, 0, 2));
                }
            }
        } else if (wh1 instanceof a34) {
            oc1.c.R1((a34) wh1);
        }
        return jue.a;
    }
}
