package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: gd5  reason: default package */
public final class gd5 {
    public final bf5 a;
    public File b;
    public File c;
    public File d;
    public File e;
    public File f;
    public File g;
    public File h;
    public File i;
    public List j;

    public gd5(bf5 bf5) {
        this.a = bf5;
    }

    public final File a(xv0 xv0) {
        int ordinal = xv0.ordinal();
        bf5 bf5 = this.a;
        switch (ordinal) {
            case 0:
                if (this.b == null) {
                    this.b = new File(((mg5) bf5).b());
                }
                return this.b;
            case 1:
                if (this.d == null) {
                    this.d = ((mg5) bf5).m();
                }
                return this.d;
            case 2:
                if (this.e == null) {
                    mg5 mg5 = (mg5) bf5;
                    mg5.getClass();
                    this.e = mg5.g(mg5.b(), "audioCache");
                }
                return this.e;
            case 3:
                if (this.g == null) {
                    mg5 mg52 = (mg5) bf5;
                    mg52.getClass();
                    this.g = mg5.g(mg52.b(), "gifCache");
                }
                return this.g;
            case 4:
                if (this.f == null) {
                    mg5 mg53 = (mg5) bf5;
                    mg53.getClass();
                    this.f = mg5.g(mg53.b(), "stickerCache");
                }
                return this.f;
            case 5:
                if (this.c == null) {
                    mg5 mg54 = (mg5) bf5;
                    mg54.getClass();
                    this.c = mg5.g(mg54.b(), "upload");
                }
                return this.c;
            case 6:
                if (this.h == null) {
                    mg5 mg55 = (mg5) bf5;
                    mg55.getClass();
                    this.h = mg5.g(mg55.b(), "exo_files_cache");
                }
                return this.h;
            case 7:
                if (this.i == null) {
                    mg5 mg56 = (mg5) bf5;
                    mg56.getClass();
                    this.i = mg5.g(mg56.b(), "videoCache");
                }
                return this.i;
            default:
                return null;
        }
    }
}
