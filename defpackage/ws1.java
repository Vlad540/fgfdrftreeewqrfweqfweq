package defpackage;

import android.hardware.camera2.CaptureResult;
import java.util.ArrayList;

/* renamed from: ws1  reason: default package */
public interface ws1 {
    void c(m25 m25) {
        int i;
        int g = g();
        if (g != 1) {
            int t = hr1.t(g);
            if (t == 1) {
                i = 32;
            } else if (t == 2) {
                i = 0;
            } else if (t == 3) {
                i = 1;
            } else if (g != 1 && g != 2 && g != 3 && g != 4) {
                throw null;
            } else {
                return;
            }
            int i2 = i & 1;
            ArrayList arrayList = m25.a;
            if (i2 == 1) {
                m25.c("LightSource", String.valueOf(4), arrayList);
            }
            m25.c("Flash", String.valueOf(i), arrayList);
        }
    }

    s9e e();

    us1 f();

    int g();

    long getTimestamp();

    ss1 m();

    CaptureResult o() {
        return null;
    }

    ts1 s();
}
