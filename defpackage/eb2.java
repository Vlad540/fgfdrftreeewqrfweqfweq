package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: eb2  reason: default package */
public final class eb2 extends lbe {
    public int X;
    public long Y;
    public long Z;
    public ArrayList c;
    public int o;

    public eb2(ws8 ws8) {
        super(ws8);
        if (this.c == null) {
            this.c = new ArrayList();
        }
    }

    public final void b(ws8 ws8, String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -677145915:
                    if (str.equals("forward")) {
                        this.Y = ws8.w0();
                        return;
                    }
                    break;
                case -462094004:
                    if (str.equals("messages")) {
                        this.c = zy.e(ws8);
                        return;
                    }
                    break;
                case 111188:
                    if (str.equals("pos")) {
                        this.o = ws8.v0();
                        return;
                    }
                    break;
                case 110549828:
                    if (str.equals("total")) {
                        this.X = ws8.v0();
                        return;
                    }
                    break;
                case 2121976803:
                    if (str.equals("backward")) {
                        this.Z = ws8.w0();
                        return;
                    }
                    break;
            }
        }
        ws8.z();
    }

    public final List c() {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            arrayList = null;
        }
        return o23.s0(arrayList);
    }

    public final String toString() {
        int size = c().size();
        int i = this.o;
        int i2 = this.X;
        long j = this.Y;
        long j2 = this.Z;
        StringBuilder i3 = rf0.i("{messages=", size, ", pos=", i, ", total=");
        i3.append(i2);
        i3.append(", forward=");
        i3.append(j);
        i3.append(", backward=");
        i3.append(j2);
        i3.append("}");
        return i3.toString();
    }
}
