package defpackage;

import android.media.MediaMuxer;
import java.io.IOException;

/* renamed from: le4  reason: default package */
public final class le4 implements j26, vc9, god {
    public long a;

    public le4(int i) {
        switch (i) {
            case 4:
                this.a = -9223372036854775807L;
                return;
            default:
                this.a = -1;
                return;
        }
    }

    public long a(long j) {
        if (j == -1) {
            this.a = -1;
            return -1;
        }
        long j2 = this.a;
        if (j2 == -1 || j < j2) {
            this.a = j;
            return 0;
        }
        long j3 = j - j2;
        this.a = j;
        return j3;
    }

    public Object apply(Object obj) {
        pec a2 = pec.a(1, "SELECT * FROM draft_uploads WHERE chat_id = ?");
        a2.j(1, this.a);
        return new ox7(new mm4((nm4) obj, a2, 1));
    }

    public ws6 b(int i) {
        if (i == 2) {
            return pz5.w0;
        }
        if (i == 1) {
            return pz5.x0;
        }
        po5 po5 = ws6.b;
        return e8c.X;
    }

    public yc9 k(String str) {
        try {
            return new pz5(new MediaMuxer(str, 0), this.a);
        } catch (IOException e) {
            throw new Exception("Error creating muxer", e);
        }
    }

    public fod w() {
        return new v4b(this);
    }
}
