package defpackage;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;

/* renamed from: nj7  reason: default package */
public final class nj7 implements cw9 {
    public final u5g a;
    public boolean b = false;

    public nj7(l2g l2g, u5g u5g) {
        this.a = u5g;
    }

    public final void a(Object obj) {
        u5g u5g = this.a;
        u5g.getClass();
        Void voidR = (Void) obj;
        SignInHubActivity signInHubActivity = (SignInHubActivity) u5g.b;
        signInHubActivity.setResult(signInHubActivity.Q0, signInHubActivity.R0);
        signInHubActivity.finish();
        this.b = true;
    }

    public final String toString() {
        return this.a.toString();
    }
}
