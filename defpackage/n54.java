package defpackage;

/* renamed from: n54  reason: default package */
public final class n54 implements cs9 {
    public final xwb a;

    public /* synthetic */ n54(xwb xwb) {
        this.a = xwb;
    }

    public y7f a(ws8 ws8) {
        int s0 = ws8.s0();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < s0; i4++) {
            if (i4 != 0) {
                boolean z = true;
                if (i4 == 1) {
                    i2 = ws8.v0();
                } else if (i4 != 2) {
                    try {
                        ws8.z();
                    } catch (Throwable th) {
                        this.a.log("VideoQualityUpdateNotificationParser", "Can't parse VideoQualityUpdate " + th);
                        return null;
                    }
                } else {
                    n1 A0 = ws8.A0();
                    if (!(A0.e() == 3)) {
                        continue;
                    } else {
                        int e = A0.e();
                        if (e != 0) {
                            if (e != 1) {
                                z = false;
                            }
                            if (!z) {
                                i3 = A0.k().d();
                            }
                        } else {
                            throw null;
                        }
                    }
                }
            } else {
                i = ws8.v0();
            }
        }
        return new y7f(new x7f(i, i2, i3));
    }
}
