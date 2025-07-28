package defpackage;

import com.google.android.exoplayer2.extractor.flv.TagPayloadReader$UnsupportedFormatException;
import java.util.Collections;

/* renamed from: h60  reason: default package */
public final class h60 extends u2 {
    public static final int[] Y = {5512, 11025, 22050, 44100};
    public int X;
    public boolean c;
    public boolean o;

    public final boolean Z1(yze yze) {
        if (!this.c) {
            int v = yze.v();
            int i = (v >> 4) & 15;
            this.X = i;
            ape ape = (ape) this.b;
            if (i == 2) {
                int i2 = Y[(v >> 2) & 3];
                tu5 tu5 = new tu5();
                tu5.k = "audio/mpeg";
                tu5.x = 1;
                tu5.y = i2;
                ape.d(tu5.a());
                this.o = true;
            } else if (i == 7 || i == 8) {
                String str = i == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                tu5 tu52 = new tu5();
                tu52.k = str;
                tu52.x = 1;
                tu52.y = 8000;
                ape.d(tu52.a());
                this.o = true;
            } else if (i != 10) {
                throw new TagPayloadReader$UnsupportedFormatException(m4b.h(39, this.X, "Audio format not supported: "));
            }
            this.c = true;
        } else {
            yze.I(1);
        }
        return true;
    }

    public final boolean a2(long j, yze yze) {
        yze yze2 = yze;
        int i = this.X;
        ape ape = (ape) this.b;
        if (i == 2) {
            int c2 = yze.c();
            ape.c(c2, yze2);
            ((ape) this.b).b(j, 1, c2, 0, (yoe) null);
            return true;
        }
        int v = yze.v();
        if (v == 0 && !this.o) {
            int c3 = yze.c();
            byte[] bArr = new byte[c3];
            yze2.g(0, bArr, c3);
            e x = d8.x(new wx1(bArr, c3, 1, (byte) 0), false);
            tu5 tu5 = new tu5();
            tu5.k = "audio/mp4a-latm";
            tu5.h = x.c;
            tu5.x = x.b;
            tu5.y = x.a;
            tu5.m = Collections.singletonList(bArr);
            ape.d(new vu5(tu5));
            this.o = true;
            return false;
        } else if (this.X == 10 && v != 1) {
            return false;
        } else {
            int c4 = yze.c();
            ape.c(c4, yze2);
            ((ape) this.b).b(j, 1, c4, 0, (yoe) null);
            return true;
        }
    }
}
