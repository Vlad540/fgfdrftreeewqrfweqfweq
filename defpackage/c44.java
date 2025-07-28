package defpackage;

/* renamed from: c44  reason: default package */
public final /* synthetic */ class c44 implements kh7 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ q8f b;

    public /* synthetic */ c44(fd fdVar, q8f q8f) {
        this.b = q8f;
    }

    public final void invoke(Object obj) {
        q8f q8f = this.b;
        switch (this.a) {
            case 0:
                n35 n35 = (n35) obj;
                n35.getClass();
                udd.p("n35", "videoDebugListener.onVideoSizeChanged: %s", q8f);
                int i = q8f.c;
                int i2 = q8f.b;
                int i3 = q8f.a;
                if (i == 90 || i == 270) {
                    n35.y0 = i2;
                    n35.z0 = i3;
                } else {
                    n35.y0 = i3;
                    n35.z0 = i2;
                }
                n35.A0 = i;
                if (n35.Z != null) {
                    float f = n35.w0 - (1.0f / (((float) i3) / ((float) i2)));
                    if (f == 0.0f || ((double) Math.abs(f)) <= 1.0E-4d) {
                        n35.y0 = i2;
                        n35.z0 = i3;
                    }
                }
                al7 al7 = n35.Y;
                if (al7 != null) {
                    int i4 = n35.y0;
                    int i5 = n35.z0;
                    int i6 = n35.A0;
                    p98 p98 = al7.e;
                    if (p98 != null) {
                        p98.P(i4, i5, i6);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((gya) obj).z(q8f);
                return;
        }
    }

    public /* synthetic */ c44(q8f q8f) {
        this.b = q8f;
    }
}
