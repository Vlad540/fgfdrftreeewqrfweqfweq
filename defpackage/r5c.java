package defpackage;

/* renamed from: r5c  reason: default package */
public final /* synthetic */ class r5c implements tn1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ na0 c;

    public /* synthetic */ r5c(y5c y5c, na0 na0, int i) {
        this.a = i;
        this.b = y5c;
        this.c = na0;
    }

    public final String z(sn1 sn1) {
        switch (this.a) {
            case 0:
                y5c y5c = this.b;
                hx4 hx4 = y5c.F;
                ul7 ul7 = new ul7(false, y5c, sn1, this.c);
                ryc ryc = y5c.e;
                xx4 xx4 = (xx4) hx4;
                synchronized (xx4.b) {
                    xx4.r = ul7;
                    xx4.s = ryc;
                }
                return "videoEncodingFuture";
            default:
                y5c y5c2 = this.b;
                y5c2.getClass();
                cv1 cv1 = new cv1(y5c2, 4, sn1);
                d60 d60 = y5c2.E;
                ryc ryc2 = y5c2.e;
                d60.a.execute(new g5(d60, ryc2, new f2b(y5c2, 3, cv1), 3));
                xx4 xx42 = y5c2.H;
                b0d b0d = new b0d(12, y5c2, sn1, cv1, this.c, false);
                synchronized (xx42.b) {
                    xx42.r = b0d;
                    xx42.s = ryc2;
                }
                return "audioEncodingFuture";
        }
    }
}
