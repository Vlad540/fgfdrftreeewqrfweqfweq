package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rq1  reason: default package */
public final /* synthetic */ class rq1 implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ew0 b;

    public /* synthetic */ rq1(ew0 ew0, int i) {
        this.a = i;
        this.b = ew0;
    }

    public final String z(sn1 sn1) {
        int i = this.a;
        ew0 ew0 = this.b;
        ew0.getClass();
        switch (i) {
            case 0:
                ((Executor) ew0.o).execute(new qq1(ew0, sn1, 1));
                return "addCaptureRequestOptions";
            default:
                ((Executor) ew0.o).execute(new qq1(ew0, sn1, 0));
                return "clearCaptureRequestOptions";
        }
    }
}
