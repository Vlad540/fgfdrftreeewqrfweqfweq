package defpackage;

import java.util.concurrent.Executor;

/* renamed from: rvf  reason: default package */
public final /* synthetic */ class rvf implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pd b;
    public final /* synthetic */ yvf c;

    public /* synthetic */ rvf(pd pdVar, r90 r90, int i) {
        this.a = i;
        this.b = pdVar;
        this.c = r90;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                pd pdVar = this.b;
                pdVar.getClass();
                ((Executor) pdVar.c).execute(new svf(pdVar, sn1, this.c, 0));
                return "setZoomRatio";
            default:
                pd pdVar2 = this.b;
                pdVar2.getClass();
                ((Executor) pdVar2.c).execute(new svf(pdVar2, sn1, this.c, 1));
                return "setLinearZoom";
        }
    }
}
