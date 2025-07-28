package defpackage;

import java.io.File;

/* renamed from: kf5  reason: default package */
public final class kf5 extends hf5 {
    public boolean b;
    public File[] c;
    public int d;
    public final /* synthetic */ lf5 e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public kf5(lf5 lf5, File file) {
        super(file);
        this.e = lf5;
    }

    public final File a() {
        boolean z = this.b;
        lf5 lf5 = this.e;
        File file = this.a;
        if (!z) {
            ((nf5) lf5.X).getClass();
            this.b = true;
            return file;
        }
        File[] fileArr = this.c;
        if (fileArr == null || this.d < fileArr.length) {
            if (fileArr == null) {
                File[] listFiles = file.listFiles();
                this.c = listFiles;
                if (listFiles == null) {
                    ((nf5) lf5.X).getClass();
                }
                File[] fileArr2 = this.c;
                if (fileArr2 == null || fileArr2.length == 0) {
                    ((nf5) lf5.X).getClass();
                    return null;
                }
            }
            File[] fileArr3 = this.c;
            int i = this.d;
            this.d = i + 1;
            return fileArr3[i];
        }
        ((nf5) lf5.X).getClass();
        return null;
    }
}
