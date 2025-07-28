package defpackage;

import androidx.media3.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: i60  reason: default package */
public final class i60 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(ija ija) {
        if (!this.c) {
            int u = ija.u();
            int i = (u >> 4) & 15;
            this.X = i;
            bpe bpe = (bpe) this.b;
            if (i == 2) {
                int i2 = Y[(u >> 2) & 3];
                uu5 uu5 = new uu5();
                uu5.m = c49.l("audio/mpeg");
                uu5.A = 1;
                uu5.B = i2;
                bpe.e(uu5.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                uu5 uu52 = new uu5();
                uu52.m = c49.l(str);
                uu52.A = 1;
                uu52.B = 8000;
                bpe.e(uu52.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException("Audio format not supported: " + this.X);
            }
            this.c = true;
        } else {
            ija.H(1);
        }
        return true;
    }

    public final boolean a2(long j, ija ija) {
        ija ija2 = ija;
        int i = this.X;
        bpe bpe = (bpe) this.b;
        if (i == 2) {
            int a = ija.a();
            bpe.b(ija2, a, 0);
            ((bpe) this.b).a(j, 1, a, 0, (zoe) null);
            return true;
        }
        int u = ija.u();
        if (u == 0 && !this.o) {
            int a2 = ija.a();
            byte[] bArr = new byte[a2];
            ija2.e(0, bArr, a2);
            e D = lp.D(new wx1(bArr, a2, 2, (byte) 0), false);
            uu5 uu5 = new uu5();
            uu5.m = c49.l("audio/mp4a-latm");
            uu5.i = D.c;
            uu5.A = D.b;
            uu5.B = D.a;
            uu5.p = Collections.singletonList(bArr);
            bpe.e(new xu5(uu5));
            this.o = true;
            return false;
        } else if (this.X == 10 && u != 1) {
            return false;
        } else {
            int a3 = ija.a();
            bpe.b(ija2, a3, 0);
            ((bpe) this.b).a(j, 1, a3, 0, (zoe) null);
            return true;
        }
    }
}
