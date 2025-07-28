package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: s3d  reason: default package */
public final class s3d extends lbe {
    public List c;

    public s3d(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = Collections.emptyList();
        }
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (!str.equals("sessions")) {
            ws8.z();
            return;
        }
        int D = jjd.D(ws8);
        this.c = new ArrayList(D);
        for (int i = 0; i < D; i++) {
            List list = this.c;
            int K = jjd.K(ws8);
            t1d t1d = null;
            if (K != 0) {
                boolean z = false;
                String str2 = null;
                String str3 = null;
                String str4 = null;
                long j = 0;
                for (int i2 = 0; i2 < K; i2++) {
                    String z0 = ws8.z0();
                    z0.getClass();
                    char c2 = 65535;
                    switch (z0.hashCode()) {
                        case -1357712437:
                            if (z0.equals("client")) {
                                c2 = 0;
                                break;
                            }
                            break;
                        case 3237038:
                            if (z0.equals("info")) {
                                c2 = 1;
                                break;
                            }
                            break;
                        case 3560141:
                            if (z0.equals("time")) {
                                c2 = 2;
                                break;
                            }
                            break;
                        case 1126940025:
                            if (z0.equals("current")) {
                                c2 = 3;
                                break;
                            }
                            break;
                        case 1901043637:
                            if (z0.equals("location")) {
                                c2 = 4;
                                break;
                            }
                            break;
                    }
                    switch (c2) {
                        case 0:
                            str2 = ws8.z0();
                            break;
                        case 1:
                            str3 = ws8.z0();
                            break;
                        case 2:
                            j = ws8.w0();
                            break;
                        case 3:
                            z = ws8.u0();
                            break;
                        case 4:
                            str4 = ws8.z0();
                            break;
                        default:
                            ws8.z();
                            break;
                    }
                }
                t1d = new t1d(j, str2, str3, str4, z);
            }
            list.add(t1d);
        }
    }

    public final String toString() {
        return rf0.f(ete.p(this.c), "{sessions=", "}");
    }
}
