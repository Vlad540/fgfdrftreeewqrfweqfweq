package defpackage;

import java.io.File;

/* renamed from: if5  reason: default package */
public final class if5 extends hf5 {
    public boolean b;
    public File[] c;
    public int d;
    public boolean e;
    public final /* synthetic */ lf5 f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public if5(lf5 lf5, File file) {
        super(file);
        this.f = lf5;
    }

    public final File a() {
        int i;
        boolean z = this.e;
        lf5 lf5 = this.f;
        File file = this.a;
        if (!z && this.c == null) {
            ((nf5) lf5.X).getClass();
            File[] listFiles = file.listFiles();
            this.c = listFiles;
            if (listFiles == null) {
                ((nf5) lf5.X).getClass();
                this.e = true;
            }
        }
        File[] fileArr = this.c;
        if (fileArr != null && (i = this.d) < fileArr.length) {
            this.d = i + 1;
            return fileArr[i];
        } else if (!this.b) {
            this.b = true;
            return file;
        } else {
            ((nf5) lf5.X).getClass();
            return null;
        }
    }
}
