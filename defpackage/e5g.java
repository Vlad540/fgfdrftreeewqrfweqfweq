package defpackage;

import com.google.android.gms.common.api.Status;

/* renamed from: e5g  reason: default package */
public final class e5g extends z1g {
    public final /* synthetic */ int d;
    public final /* synthetic */ n4g e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e5g(n4g n4g, int i) {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks", 6);
        this.d = i;
        this.e = n4g;
    }

    public void g(Status status) {
        switch (this.d) {
            case 0:
                this.e.b0(status);
                return;
            default:
                super.g(status);
                return;
        }
    }

    public void n(Status status) {
        switch (this.d) {
            case 1:
                this.e.b0(status);
                return;
            default:
                super.n(status);
                return;
        }
    }
}
