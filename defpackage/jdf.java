package defpackage;

/* renamed from: jdf  reason: default package */
public final class jdf implements x84 {
    public final /* synthetic */ kdf a;

    public jdf(kdf kdf) {
        this.a = kdf;
    }

    public final void onResume(nc7 nc7) {
        udd.q("kdf", "onResume, owner=" + nc7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
    }

    public final void onStart(nc7 nc7) {
        udd.q("kdf", "onStart, owner=" + nc7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
        if (!this.a.k) {
            this.a.k = true;
            if (this.a.l) {
                this.a.b();
            }
        }
    }

    public final void onStop(nc7 nc7) {
        udd.q("kdf", "onStop, owner=" + nc7 + ", isAppVisible=" + this.a.k + ", isScreenOn=" + this.a.l);
        if (this.a.k) {
            this.a.k = false;
            this.a.a();
        }
    }
}
