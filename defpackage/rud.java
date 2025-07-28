package defpackage;

import java.util.ArrayList;

/* renamed from: rud  reason: default package */
public final class rud extends lbe {
    public ArrayList c;
    public long o;

    public rud(ws8 ws8) {
        super(ws8);
    }

    public final void b(ws8 ws8, String str) {
        str.getClass();
        if (str.equals("marker")) {
            this.o = ws8.w0();
        } else if (!str.equals("stickers")) {
            ws8.z();
        } else {
            int D = jjd.D(ws8);
            this.c = new ArrayList(D);
            for (int i = 0; i < D; i++) {
                this.c.add(Long.valueOf(ws8.w0()));
            }
        }
    }

    public final String toString() {
        ArrayList arrayList = this.c;
        long j = this.o;
        return "{stickerIds=" + arrayList + ", marker=" + j + "}";
    }
}
