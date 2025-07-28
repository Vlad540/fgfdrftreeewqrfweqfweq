package androidx.loader.app;

class LoaderManagerImpl$LoaderViewModel extends uaf {
    public static final a d = new Object();
    public final fmd b = new fmd();
    public boolean c = false;

    public final void d() {
        fmd fmd = this.b;
        int i = fmd.c;
        int i2 = 0;
        while (i2 < i) {
            mj7 mj7 = (mj7) fmd.b[i2];
            l2g l2g = mj7.n;
            l2g.a();
            l2g.d = true;
            nj7 nj7 = mj7.p;
            if (nj7 != null) {
                mj7.j(nj7);
                if (nj7.b) {
                    nj7.a.getClass();
                }
            }
            mj7 mj72 = l2g.b;
            if (mj72 == null) {
                throw new IllegalStateException("No listener register");
            } else if (mj72 == mj7) {
                l2g.b = null;
                if (nj7 != null) {
                    boolean z = nj7.b;
                }
                l2g.e = true;
                l2g.c = false;
                l2g.d = false;
                l2g.f = false;
                i2++;
            } else {
                throw new IllegalArgumentException("Attempting to unregister the wrong listener");
            }
        }
        int i3 = fmd.c;
        Object[] objArr = fmd.b;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = null;
        }
        fmd.c = 0;
    }
}
