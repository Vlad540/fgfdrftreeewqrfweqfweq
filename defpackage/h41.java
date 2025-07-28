package defpackage;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* renamed from: h41  reason: default package */
public final class h41 extends chd {
    public final /* synthetic */ int J0 = 1;
    public final Object K0;

    public h41(f41 f41) {
        super(f41);
        this.K0 = f41;
    }

    /* JADX WARNING: type inference failed for: r1v8, types: [mr5, ig7] */
    public final void A(pg7 pg7) {
        List list;
        switch (this.J0) {
            case 0:
                ((f41) this.K0).setLabel(((e41) pg7).b);
                return;
            case 1:
                tr5 tr5 = (tr5) pg7;
                p4a p4a = this.a;
                p4a p4a2 = p4a instanceof nr5 ? (nr5) p4a : null;
                if (p4a2 != null) {
                    p4a2.setIcon(phc.A0);
                    p4a2.setTitle(new hge(jtb.chats_list_empty_state_title));
                    p4a2.x(p4a2.getContext().getString(jtb.chats_list_empty_state_action), new d5(29, this));
                    return;
                }
                return;
            default:
                tr5 tr52 = (tr5) pg7;
                View view = this.a;
                zr5 zr5 = null;
                xr5 xr5 = view instanceof xr5 ? (xr5) view : null;
                if (xr5 != null) {
                    if (tr52 instanceof zr5) {
                        zr5 = (zr5) tr52;
                    }
                    if (zr5 != null && (list = zr5.a) != null) {
                        xr5.setVisibility(list.isEmpty() ^ true ? 0 : 8);
                        xr5.Z1.E(list);
                        xr5.setListener((vr5) this.K0);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public h41(Context context, ExecutorService executorService, zx1 zx1) {
        super(new xr5(context, executorService));
        this.K0 = zx1;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h41(android.content.Context r3, defpackage.gu2 r4) {
        /*
            r2 = this;
            r0 = 1
            r2.J0 = r0
            nr5 r0 = new nr5
            r1 = 0
            r0.<init>(r3, r1)
            android.view.ViewGroup$LayoutParams r3 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r3.<init>(r1, r1)
            r0.setLayoutParams(r3)
            r2.<init>(r0)
            r2.K0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.<init>(android.content.Context, gu2):void");
    }
}
